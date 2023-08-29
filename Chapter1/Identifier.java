package Chapter1;
public class Identifier {
    public static void main(String... args) {
        try {
            assert 10 < 0 : "10 ma nho hon 0 a thang ngu!";
            System.out.println("program continue!");
        }
        catch (AssertionError ae) {
            System.out.println(ae.getMessage());
        }
    }
}
