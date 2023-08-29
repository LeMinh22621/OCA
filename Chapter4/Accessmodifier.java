package Chapter4;

class parentClass {
    protected int pro = 1_0;
    private int pri = 1_0;
    public int pub = 1_0;
    int def = 1_0;
}

class childClass extends parentClass{

}

public class Accessmodifier extends childClass{
    int otherDef = 0-def;
    public int otherFunc(int... a) {
        return (short) 10;        
    }
    public int aFunc(String[] a, int... b) {
        short i = 2;
        return i;
    }
    public void func() {
        System.out.println("pro " + pro + ", pub " + pub + ", def " + def);

        pro = 1;
        pub = 2;

        System.out.println("pro " + pro + ", pub " + pub + ", def " + def);
    }
    public static void main(String[] args) {
        // Accessmodifier obj = new Accessmodifier();
        // // obj.func();
        // obj.otherFunc();
        System.out.println(args);
        Others.main(args);
    }
    public static void main() {
        System.out.println("no arguments");
    }
    public static void main(int... args) {
        System.out.println("no arguments");
    }
    public static void main(String[]...args) {
        System.out.println("no arguments");
    }
}
