package by.teachmeskills.lessen12.w3resource.hachmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Blue");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Yellow");
        System.out.println(hashMap1);
        Set set=hashMap1.entrySet();
        System.out.println(set);
    }
}
