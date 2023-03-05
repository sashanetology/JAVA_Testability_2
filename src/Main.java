public class Main {
    public static void main(String[]
                                    args) {
        BmiService service = new
                BmiService();
        double mass;
        double height;
        double bmi = service.calculate(10,2);
        System.out.println(bmi);
    }
}