package Chapter4;

public class Test extends Accessmodifier {
    public void check (String[]... args) {
        String[] arr = {"1", "2", "3"};
        // for (String[] str : args) {
        //     for (String str2 : str) {
        //         System.out.println(str2);
        //     }
        // }
        // System.out.println(arr.equals(args));
    }
    public static void main (String... args) {
        Test a = new Test();
        String[][] arr = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        a.check(arr);
    }
    
}
