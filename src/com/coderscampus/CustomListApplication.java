package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			customList.add(i);
		}
		System.out.println("Before removing index 40: ");
		System.out.println(customList.get(40));
		System.out.println("After removing index 40: ");
		customList.remove(40);
		System.out.println(customList.get(40));
}
}