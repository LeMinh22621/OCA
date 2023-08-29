package Chapter1;
public class Block {
    private String aString;

    // {
    //     aString = "new Value 1";
    // }
    public Block () {
        System.out.println(aString);
    }
    {
        aString = "new Value1 2";
    }
    public static void main (String... args) {
        Block i = new Block();
        System.out.println(i.aString);
    }
}
