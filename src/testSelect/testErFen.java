package testSelect;

import java.sql.Statement;

/**
 * Created by pb on 2018/4/19.
 */
public class testErFen {
    //二分查找法：
    //1.需要排序好
    private int[] array;

    public testErFen(int[] array){
        this.array = array;
    }

    public int searchRecursion(int target){
        if(array != null){
            return searchRecursion(target,0,array.length-1);
        }
        return -1;
    }

    private int searchRecursion(int target,int start,int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end -start) / 2;
        if(array[mid] == target){
            return mid;
        }else if(target < array[mid]){
            return searchRecursion(target,start,mid -1);
        }else{
            return searchRecursion(target,mid + 1,end);
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{1,3,5,7,9,11,19};
        testErFen testErFen = new testErFen(array);
        System.out.println(testErFen.searchRecursion(0));
        System.out.println(testErFen.searchRecursion(11));
    }
}
