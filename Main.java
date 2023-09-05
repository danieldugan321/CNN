import data.Image;
import data.DataReader;
public class Main {

    public static void main(String[] args) {
        List<Image> images = new DataReader.readData("data/mnist_train.csv");
        System.out.println(images.get(0).toString(0));
    }
}
