package Chapter3;
import java.util.Arrays;

class Block {
    int i = 0;
    String a;
}
public class DeclareArrays {
    public static void main (String ...args) {
        // Block[] arr1, arr2 = {new Block(), new Block(), new Block()};
        // int arr3[], b;
        // System.out.println(Arrays.toString(arr2));

        System.out.println(new Block().a);
    }
}
