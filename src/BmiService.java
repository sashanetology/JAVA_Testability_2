public class BmiService {
    public double calculate(double mass, double height) {
        double square = height * height;
        double index = mass / square;
        return index;
    }
}
