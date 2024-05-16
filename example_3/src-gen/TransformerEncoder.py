from tensorflow import keras

class TransformerEncoder(keras.layers.Layer):
	def __init__(self, embed_dim, dense_dim, num_heads, **kwargs):
		super().__init__(**kwargs)
		# TODO: Check preinitiliazed arguments
		self.embed_dim = embed_dim
		self.dense_dim = dense_dim
		self.num_heads = num_heads
	
	def call(self, inputs):
		# Start of user code call
		# TODO: Define call method
		# End of user code

	def get_config(self):
		config = super().get_config()
		config.update(
			{
				"embed_dim": self.embed_dim,
				"dense_dim": self.dense_dim,
				"num_heads": self.num_heads,
			}
		)
		return config
