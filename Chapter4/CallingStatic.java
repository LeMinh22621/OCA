package Chapter4;
final class AClass{
    public void f1() {
        System.out.println("f1() of AClass called!");
    }
    public static void f2() {
        System.out.println("static f2() of AClass called!");
    }

    public static void main(String... aStrings) {
        AClass o = new AClass();
        o.f1();
        f2();
    }
}
public class CallingStatic {

    public static void main(String... args) {
        AClass aClass = new AClass();
        aClass.main(args);
        aClass = null;
        aClass.main(args);
    }
}
