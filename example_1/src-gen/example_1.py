from tensorflow import keras

title = keras.Input(shape=(10000,), sparse=False)
text_body = keras.Input(shape=(10000,), sparse=False)
tags = keras.Input(shape=(100,), sparse=False)
features = keras.layers.Concatenate(axis=-1)([title,text_body,tags,])
dense_features = keras.layers.Dense(units=64, activation="relu", use_bias=True, kernel_initializer="glorot_uniform", bias_initializer="zeros")(features)
priority = keras.layers.Dense(units=1, activation="sigmoid", use_bias=True, kernel_initializer="glorot_uniform", bias_initializer="zeros")(dense_features)
department = keras.layers.Dense(units=4, activation="softmax", use_bias=True, kernel_initializer="glorot_uniform", bias_initializer="zeros")(dense_features)
example_1 = keras.Model([title,text_body,tags,], [priority,department,])
example_1.compile(optimizer="rmsprop", loss="sparse_categorical_crossentropy")
