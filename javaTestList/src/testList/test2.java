package testList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by PB on 2017/7/25.
 */
public class test2 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 2, 3, 3, 3};
        Set<Integer> set = new HashSet<>(Arrays.asList(a));
        System.out.println(set);

        String[] staffs = new String[]{"Tom", "Bob", "Jane", "Jane"};
        Set<String> staffsSet = new HashSet<>(Arrays.asList(staffs));
        System.out.println(staffsSet);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        /*for (int i=0;i<list.size();i++){
            if(list.get(i).equals(6)){
                list.remove(i);
            }
        }*/
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            while (iterator.hasNext()) {
                if (integer.equals(6)) {
                    iterator.remove();
                }
            }
        }
        System.out.println(list);


    }
}
