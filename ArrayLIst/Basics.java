package ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(4);
        System.out.println(ls);

        //add in between
        ls.add(1,10);
        System.out.println(ls);

        //set element
        ls.set(0 , 11);
        System.out.println(ls);

        //remove
        ls.remove(2);
        System.out.println(ls);

        //sort
        Collections.sort(ls);
        System.out.println(ls);

        //contains
        boolean ans = ls.contains(Integer.valueOf(13));
        System.out.println(ans);

        //if we dont specify object  , we can add anything in list
        ArrayList list = new ArrayList<>();
        list.add("abho");
        list.add(12);
        System.out.println(list);
    }
}
