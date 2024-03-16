package DATASTRUCTURES;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("Java");
        set.add("Swing");
        set.add("Java Spring");
        set.add("Banana");
        System.out.println("Removed java from the set " + set.remove("Java"));
        System.out.println("set contains swing: " + set.contains("Swing"));
        System.out.println("Size of the set " + set.size());
        HashSet<String> obj = new HashSet<>();
        for(String s:set){
            System.out.println(s);
        }
      obj.add("java");
        if(obj.add("Java"))
            System.out.println(true);
        else System.out.println(false);
    }
}
