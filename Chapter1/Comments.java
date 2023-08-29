package Chapter1;
final class Comments{
    // // a dog                 ok
    // /** oke */               ok
    /* adfadf                   ok 
     * 
    */
    /*
     * /*adjflajfd */           not ok
     */
    /**
     * /* kadfadf */            not ok
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("OK");
    }
}