package DATASTRUCTURES;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Primitives {
//    List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] a = {1,2,3};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<a.length; ++i){
            list.add(a[i]);
        }
    }
}
