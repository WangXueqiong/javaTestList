package testList;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class testRandom {
	public static void main(String[] args){
		Double ran1 = Math.random();
		System.out.println(ran1);
		
		Random rm = new Random(2);
		for (int i = 0; i < 10; i++) {
			System.out.print(rm.nextInt(5) + " ");
		}
		System.out.println("");
		String i = RandomStringUtils.random(10, false, true);
		System.out.println(i);
	}
}
