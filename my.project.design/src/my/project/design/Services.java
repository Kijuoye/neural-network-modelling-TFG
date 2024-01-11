package my.project.design;

import java.util.List;

import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.Model;

/**
 * The services class used by VSM.
 */
public class Services {
    
	public Layer getNextLayer(Layer layer) {
		Model parentModel = (Model)layer.eContainer();
		List<Layer> layers = parentModel.getLayers();
		int position=layers.indexOf(layer);
		if (position==layers.size()) {
			return null;
		}
		else {
			return layers.get(position + 1);
		}
	}
}
