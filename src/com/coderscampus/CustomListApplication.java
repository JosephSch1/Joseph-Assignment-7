package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		customList.remove(9);
		customList.add(3, 10000);
		customList.add(10, 10000);
		System.out.println(customList.getSize());

	}
}