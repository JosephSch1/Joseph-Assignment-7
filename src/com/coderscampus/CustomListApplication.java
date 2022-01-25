package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<Integer> customList = new CustomArrayList<>();

		for (int i = 0; i < 50; i++) {
			customList.add(i);
		}
		
		System.out.println("List size before removing items: " + customList.getSize());
		System.out.println("Index 40 before invoking the remove method: " + customList.get(40));
		customList.remove(40);
		System.out.println("List size after removing items: " + customList.getSize());
		System.out.println("Index 40 after invoking the remove method: " + customList.get(40));
		
	}
}