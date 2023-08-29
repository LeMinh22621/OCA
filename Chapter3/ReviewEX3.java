package Chapter3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewEX3 {
    public static void main (String... args) {
        // StringBuilder sb = new StringBuilder();
        // sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        // System.out.println(sb);

        // String numbers = "012345678";
        // System.out.println(numbers.substring(1, 3));
        // System.out.println(numbers.substring(7, 7));
        // System.out.println(numbers.substring(7));

        // String[] cubbies = new String[0];
        // for (int i = 0; i < cubbies.length; i++) 
        //     System.out.println(cubbies);

        // int[] a = {1, 2, 3};
        // int[] b = {1, 2, 3};
        // ArrayList<Integer> ar = new ArrayList<>();
        // ar.add(1);
        // ar.add(2);
        // ar.add(3);
        // ArrayList<Integer> br = new ArrayList<>();
        // br.add(1);
        // br.add(2);
        // br.add(3);
        // System.out.println(a.equals(b));

        // List<String> list = new ArrayList();
        // list.add("one");
        // list.add("two");
        // list.add(new Integer(7).toString(0));
        // for(String s : list) System.out.print(s);

        // int[] random = { 6, -4, 12, 0, -10, 12, 12};
        // int x = 12;
        // int y = Arrays.binarySearch(random, x);
        // System.out.println(y);


        // List<Integer> list = Arrays.asList(10, 4, -1, 5);
        // Collections.sort(list);
        // Integer array[] = list.toArray(new Integer[]{4, 2});
        // for(Integer i : array) {
        //     System.out.println(i);
        // }

        // List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        // Collections.sort(hex);
        // for(String i : hex) {
        //     System.out.println(i);
        // }
        // int x = Collections.binarySearch(hex, "8");
        // int y = Collections.binarySearch(hex, "3A");
        // int z = Collections.binarySearch(hex, "4F");
        // System.out.println(x + " " + y + " " + z);

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age);
    }
}
