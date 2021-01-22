public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 64.5f;
        float height = 1.75f;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
