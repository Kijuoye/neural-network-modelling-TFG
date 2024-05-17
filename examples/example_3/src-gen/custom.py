from tensorflow import keras

from TransformerEncoder import TransformerEncoder
tranformer_encoder = TransformerEncoder("TODO: Define inputs")
custom = keras.Model([tranformer_encoder,], [tranformer_encoder,])
custom.compile(optimizer="sgd", loss="binary_crossentropy")
