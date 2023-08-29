package Chapter1;
class Test {
    @Override
    protected void finalize() throws Throwable{
        System.out.println("finalize Test ran!");
        super.finalize();
    }
}
public class GarbargeCollection {
    public static void main (String... args) {
        System.out.println("main start run");
        Test gc = new Test();
        gc = null;
        System.out.println("main end run");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("finalize GarbargeCollection ran!");
        super.finalize();
    }
}