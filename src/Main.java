public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.92f;
        float mass = 100f;
        int bmi = service.calculate(height, mass);
        System.out.println(bmi);
    }
}