package testMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EntryMap {
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	//初始化map
	public void initMap() {
		for (int i = 1; i < 8; i++) {
			map.put(i, 22 - i);
		}
	}

	public static void main(String[] args) {
		EntryMap entryMap = new EntryMap();
		entryMap.initMap();
		// 便利map的几种方法
		// TODO 1.只遍历key
		System.out.println("1.只遍历key==========================");
		entryMap.ketSet();
		// TODO 2.只遍历value
		System.out.println("2.只遍历value==========================");
		entryMap.valueSet();
		// TODO 3.遍历map
		System.out.println("3.遍历map==========================");
		entryMap.entrySet();
		// TODO 3.遍历map通过iterator
		System.out.println("4.遍历map通过iterator==========================");
		entryMap.entrySetByIterator();


		Map<Integer,Object> str = new HashMap<>();
		for (int i = 1; i < 6; i++) {
			str.put(i, 11 - i);
		}
		Set<Integer> set = str.keySet();
		List<Object> list = new ArrayList<>(str.values());
		Set<Map.Entry<Integer,Object>> set2 = str.entrySet();
        System.out.println();
	}

	// 遍历key
	public void ketSet() {
		for (Integer key : map.keySet()) {
			System.out.println("map的key是" + key);
		}
	}

	// 遍历value
	public void valueSet() {
		for (Integer value : map.values()) {
			System.out.println("map的value是" + value);
		}
	}

	// 遍历map
	public void entrySet() {
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	// 通过it遍历map
	public void entrySetByIterator() {
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			//it.remove(); //删除元素
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
