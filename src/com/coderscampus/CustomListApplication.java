package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		System.out.println("Size of list before invoking remove method on index nine: ");
		System.out.println(customList.getSize());
		customList.remove(9);
		System.out.println("Size of list after invoking remove method on index nine: ");
		System.out.println(customList.getSize());
	

	}
}