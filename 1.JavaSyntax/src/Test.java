import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 25);
            if(array[i] % 3 != 0) {
                sum = sum + array[i];

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
