package testMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testSet {
	private Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		// |初始化
		testSet testSet = new testSet();
		testSet.initSet();
		System.out.println("初始化完成==========================");
		// 以for循环输出
		System.out.println("以for循环输出set====================");
		testSet.forSet();
		// 以iterator循环输出
		System.out.println("以iterator循环输出set====================");
		testSet.iteratorSet();
	}

	// 初始化set
	public void initSet() {
		for (int i = 1; i < 6; i++) {
			set.add(i);
		}
	}

	public void forSet() {
		for (int i : set) {
			System.out.println(i);
		}
	}
	
	public void iteratorSet(){
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
