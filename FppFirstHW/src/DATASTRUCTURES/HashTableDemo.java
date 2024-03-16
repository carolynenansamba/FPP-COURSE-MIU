package DATASTRUCTURES;

import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {
        public static void main(String[] args) {
            Hashtable<Integer, Empl> tm = new Hashtable<Integer, Empl>();
            tm.put(1, new Empl(134, "Raman", 3000));
            tm.put(5, new Empl(235, "Jenny", 6000));
            tm.put(3, new Empl(876, "Crish", 2000));
            tm.put(4, new Empl(134, "Ram", 3000));
            System.out.println("Hashtable entries: ");
            Set<Integer> keys = tm.keySet();
            for (Integer key : keys) {
                System.out.println(key + "--> " + tm.get(key));
            }
            tm.remove(4);
            tm.replace(5, new Empl(235, "Jonny", 3200));
            System.out.println(tm);
        }

    }

