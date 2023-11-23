import java.util.*;
public class CA2_Q3_2 {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Orange");
        hm.put(4, "Grapes");
        hm.put(5, "Pineapple");
        hm.put(6, "Guava");

        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(4));

        System.out.println(hm.remove(2));
        System.out.println(hm.remove(3));
        System.out.println(hm.remove(5));

        Set<Integer> s = new HashSet<>();
        s = hm.keySet();
        System.out.println("Hash map");
        for(Integer k : s)
            System.out.println("Key :"+k+" Value :"+hm.get(k));
    }
}
