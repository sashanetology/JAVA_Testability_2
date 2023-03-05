public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass;
        double height;
        double bmi = service.calculate(56,1.64);
        System.out.println(bmi);
    }
}
