public class BmiService {
    public double calculate(double mass, double height) {
        double index = mass / (Math.pow(height, 2));
        return index;
    }
}
