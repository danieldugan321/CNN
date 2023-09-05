package data;

public class Image {

    private double[][] data;
    private int label;

    public double[][] getData() {
        return data;
    }

    public int getLabel() {
        return label;
    }

    public Image(double[][] data, int label) {
        this.data = data;
        this.label = label;
    }

    @Override
    public String toString() {

        String s = label + ", \n";

        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                s += data[row][col] + ", ";
            }
            s += "\n";
        }

        return s;
    }
}
