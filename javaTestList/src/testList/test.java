package testList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class test {

	public static void main(String[] args){
		String[] arr = {"1","2"};
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
		String str2 = new String("a");
		
		StringBuffer sb = new StringBuffer("b");
		sb.append("c");
		
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		System.out.println(a == b);
		String str = new String("100");
		System.out.println(a.equals(Integer.valueOf(str)));
		
		
		
		long startTime= 0;
		long endTime = 0;
		System.out.println("程序时间运行计算string");
		startTime = System.currentTimeMillis();
		String test1 = "a";
		for(int i=0;i<10000;i++){
			test1 = test1 + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime-startTime));
		
		System.out.println("程序时间运行计算stringBuffer");
		startTime = System.currentTimeMillis();
		StringBuffer test2 = new StringBuffer("a");
		for(int i=0;i<10000;i++){
			test2 = test2.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime-startTime));
		
		
		System.out.println("程序时间运行计算stringBudder");
		startTime = System.currentTimeMillis();
		StringBuilder test3 = new StringBuilder("a");
		for(int i=0;i<10000;i++){
			test3 = test3.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime-startTime));
		
		
		long startTime2= 0;
		long endTime2 = 0;
		System.out.println("程序时间运行计算namo string");
		startTime = System.nanoTime();
		String testnamo1 = "a" + "b";
		endTime = System.nanoTime();
		System.out.println("time:" + (endTime2-startTime2));
		
		System.out.println("程序时间运行计算namo stringBuffer");
		startTime = System.currentTimeMillis();
		StringBuffer testnamo2 = new StringBuffer("a").append("b");
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime2-startTime2));
		
		List list3 = null;		
		
	}
	
}
