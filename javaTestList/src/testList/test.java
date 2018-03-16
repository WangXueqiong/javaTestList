package testList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		String[] arr = { "1", "2" };
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
		String str2 = new String("a");
		StringBuffer sb = new StringBuffer("b");
		sb.append("c");

		Integer a = new Integer(100);
		Integer b = new Integer(100);
		Integer c = 100;
		System.out.println(a == b);
		String str = new String("100");
		String str3 = "100";
		System.out.println(a.equals(str));
		System.out.println(c.equals(str3));
		System.out.println(a.equals(Integer.valueOf(str)));

		long startTime = 0;
		long endTime = 0;
		System.out.println("程序时间运行计算string");
		startTime = System.currentTimeMillis();
		String test1 = "a";
		for (int i = 0; i < 10000; i++) {
			test1 = test1 + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime - startTime));

		System.out.println("程序时间运行计算stringBuffer");
		startTime = System.currentTimeMillis();
		StringBuffer test2 = new StringBuffer("a");
		for (int i = 0; i < 10000; i++) {
			test2 = test2.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime - startTime));

		System.out.println("程序时间运行计算stringBudder");
		startTime = System.currentTimeMillis();
		StringBuilder test3 = new StringBuilder("a");
		for (int i = 0; i < 10000; i++) {
			test3 = test3.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime - startTime));

		long startTime2 = 0;
		long endTime2 = 0;
		System.out.println("程序时间运行计算namo string");
		startTime = System.nanoTime();
		String testnamo1 = "a" + "b";
		endTime = System.nanoTime();
		System.out.println("time:" + (endTime2 - startTime2));

		System.out.println("程序时间运行计算namo stringBuffer");
		startTime = System.currentTimeMillis();
		StringBuffer testnamo2 = new StringBuffer("a").append("b");
		endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime2 - startTime2));

		List list3 = null;
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		System.out.println(map.containsValue("v1"));
		Set<Object> set = map.keySet();
		Collection<Object> list4 =  map.values();
		System.out.println(set);


		List<String> listttt = new ArrayList<String>(10);


		Map<String,Object> mmmm = new HashMap<>();
		mmmm.put("A","a");
        mmmm.put("B","b");
        mmmm.put("C","c");
        mmmm.put("D","d");
        System.out.println(mmmm.get("A"));
        System.out.println(mmmm.get("F"));
        if(mmmm.get("A") != null){
            System.out.println("ok");
        }
        if(mmmm.get("F") != null){
            System.out.println("ok2");
        }else{
            System.out.println("欧克");
        }
    }

}
