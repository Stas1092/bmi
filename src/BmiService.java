public class BmiService {
    public int calculate(float height, float mass) {

        float index = (mass / (height * height));

        int bmi = (int) index;

        return bmi;
    }

}
