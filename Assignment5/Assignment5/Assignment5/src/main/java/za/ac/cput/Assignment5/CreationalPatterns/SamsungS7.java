package za.ac.cput.Assignment5.CreationalPatterns;


/**
 * Created by Avcuyile 2017/03/31.
 */

public class SamsungS7 {
    private static SamsungS7 samsungS7 = null;
    private SamsungS7() {
    }

    public static SamsungS7 getInstance() {
        if (samsungS7 == null) {
            samsungS7 = new SamsungS7();
        }
        return samsungS7;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int substract(int a, int b) {
        return a - b;
    }

}
