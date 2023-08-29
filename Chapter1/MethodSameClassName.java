package Chapter1;
public class MethodSameClassName {
    int i;
    public int MethodSameClassName () {
        return i = 4;
    }
    public static void main(String... args) {
        MethodSameClassName obj = new MethodSameClassName();
        System.out.println(obj.i);
        System.out.println(obj.MethodSameClassName());
    }
}
