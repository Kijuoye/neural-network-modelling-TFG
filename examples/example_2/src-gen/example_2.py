from tensorflow import keras

spanish = keras.Input(shape=(None,), sparse=False)
embedding2 = keras.layers.Embedding(
    15000, 256, embeddings_initializer="random_uniform", mask_zero=True)(spanish)
gru = keras.layers.GRU(1024, activation="tanh", recurrent_activation="sigmoid", use_bias=True,
                       kernel_initializer="glorot_uniform", recurrent_initializer="orthogonal", bias_initializer="zeros", return_sequences=False)
english = keras.Input(shape=(None,), sparse=False)
embedding = keras.layers.Embedding(
    15000, 256, embeddings_initializer="random_uniform", mask_zero=True)(english)
bidi = keras.layers.Bidirectional(gru, merge_mode="sum")([embedding,])
gru2 = keras.layers.GRU(1024, activation="tanh", recurrent_activation="sigmoid", use_bias=True, kernel_initializer="glorot_uniform",
                        recurrent_initializer="orthogonal", bias_initializer="zeros", return_sequences=True)(embedding2, initial_state=bidi)
dropout = keras.layers.Dropout(0.5)([gru2,])
dense2 = keras.layers.Dense(units=15000, activation="softmax", use_bias=True,
                            kernel_initializer="glorot_uniform", bias_initializer="zeros")(dropout)
example_2 = keras.Model([english, spanish,], [dense2,])
example_2.compile(optimizer="rmsprop", loss="sparse_categorical_crossentropy")
