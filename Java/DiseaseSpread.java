import java.lang.Math;

public class DiseaseSpread {
    public static void main(String[] args) {
        // Define the initial cases
        int init = 1;
        // Smallpox spread
        int smallpox = 3;
        // HIV spread
        int hiv = 4;
        // Measles spread
        int measles = 16;
        // Iterations
        int i = 4;

        // Smallpox (R0 = 3)
        long smallpoxResult = Math.round(Math.pow((init*smallpox),i));
        System.out.println(smallpoxResult);

        // HIV :
        long hivResult = Math.round(Math.pow((init*hiv),i));
        System.out.println(hivResult);

        // Measles :
        long measlesResult = Math.round(Math.pow((init*measles),i));
        System.out.println(measlesResult);
    }
}
