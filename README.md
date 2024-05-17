# A Neural Networks Modelling Tool

This project is a neural network modelling tool, developed as a bachelor's final project by Enrique Ortega Yegros for Universidad Autónoma de Madrid. It includes several examples and the source code of the project, which was done using Sirius and Acceleo, Eclipse's plug-in. 

## Project Structure

- `examples/`: Contains the example neural networks models used in the project report.
- `src/`: Contains the source code of the project.
  - `my.project.design/`: Defines the Sirius' concrete syntax
  - `neuralnetwork/`, `neuralnetwork.edit/` and `neuralnetwork.editor/`: Define the project meta-model.
  - `org.eclipse.acceleo.module.sample/`: Contains the main entry point of the 'GenerateNeuralNetworkKeras' generation module.
  - `org.eclipse.acceleo.module.sample.ui/`: Contains the UI for the 'Neural Network in Keras' generation module.

## How to Use

1. Open the project in your Eclipse IDE.
2. Launch a new runtime from your Eclipse.
3. Create a new Modeling Project.
4. Create a new `neuralnetwork` model in your project's `representations.aird` clicking on Models &rarr; New... &rarr; Search for `neuralnetwork`.
5. Create a new representation of the model in your project's `representations.aird` clicking on Representations &rarr; New... &rarr; Your model.
6. Edit your models representation as you wish.
7. You can rigth-click in the represenation editor and validate your diagram.
8. When you are finished, rigth-click on your model's `.neuralnetwork` file and click on Acceleo Model to Text &rarr; Generate Neural Network in Keras.
9. Navigate to src-gen to see the results!


## License

This project is licensed under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/).
