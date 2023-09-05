package layers;

import java.util.List;

public abstract class Layer {

    protected Layer _nextLayer;
    protected Layer _previousLayer;

    public abstract double[] getOutput(List<double[][]> input);
    public abstract double[] getOutput(double[][] input);

    public abstract void backPropagation(double [] dLdO);

}
