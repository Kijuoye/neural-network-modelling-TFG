from tensorflow import keras

input = keras.Input(shape=(16,), sparse=False)
hidden = keras.layers.Dense(units=50, activation="relu", use_bias=True, kernel_initializer="glorot_uniform", bias_initializer="zeros")(input)
out = keras.layers.Dense(units=2, activation="softmax", use_bias=True, kernel_initializer="glorot_uniform", bias_initializer="zeros")(hidden)
test_model = keras.Model([input,], [out,])
test_model.compile(optimizer="sgd", loss="binary_crossentropy")
