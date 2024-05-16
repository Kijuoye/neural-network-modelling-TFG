package my.project.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.Model;

/**
 * The services class used by VSM.
 */
public class Services {
    public List<Layer> orderOfLayers(Model model){
    	List<Layer> layers = model.getOutputLayers();
    	List<Layer> orderedLayers = new ArrayList<Layer>();
    	Stack<Layer> layersStack = new Stack<Layer>();
    	Stack<Layer> orderStack = new Stack<Layer>();
    	layersStack.addAll(layers);
    	
    	while(!layersStack.empty()) {
    		Layer layer = layersStack.pop(); 
    		orderStack.push(layer);
    		for (Layer prevLayer : layer.getPreviousLayers()) {
    			layersStack.push(prevLayer);
    		}
    	}
    	while(!orderStack.empty())
    	{
    		orderedLayers.add(orderStack.pop());
    	}
    	return orderedLayers;
    }
    
    public String[] parseString(String arg0){
    	String[] args = arg0.split(", ");
    	return args;
    }
}
