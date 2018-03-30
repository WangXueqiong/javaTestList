package testPAIXU;

/**
 * Created by PB on 2017/7/25.
 */
public class QuickSort {
    public static int par(int[] array,int lo,int hi){
        int key = array[lo];
        while (lo<hi){
            while (key<=array[hi] && lo<hi){//从后半部分向前扫描
                hi--;
            }
            array[lo] = array[hi];
            while (key>=array[lo] && lo < hi){//从前半部分向后扫描
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;
        return hi;
    }

    public static void sort(int[] array,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int index = par(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
}
