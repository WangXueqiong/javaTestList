package testQueue;

import java.util.LinkedList;

/**
 * 测试队列
 * @author 41999
 *
 */
public class Queue {
	public static void main(String[] args){
		java.util.Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println(queue.peek());
		Boolean status = false;
		for(int i=1;i<11;i++){
			//在队列queue中塞入数值
			queue.offer(i);
			System.out.println("queue的size" + queue.size());
		}
		System.out.println(queue);
		queue.poll();
		System.out.println("poll()方法");
		//poll         移除并返问队列头部的元素    如果队列为空，则返回null
		System.out.println(queue);
		System.out.println("queue的size" + queue.size());
		Integer i = queue.peek();
		System.out.println("peek()方法");
		//peek       返回队列头部的元素             如果队列为空，则返回null
        System.out.println(i);
	}
}
