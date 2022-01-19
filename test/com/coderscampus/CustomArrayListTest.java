package com.coderscampus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	 CustomArrayList<Integer> sut = new CustomArrayList<>();
	
	@Test
	void should_populate_list() {
		for (int i = 0; i < 50; i++) {
			sut.add(i);
		}
		int expected = 50;
		assertEquals(expected, sut.getSize());
	}
	
	@Test
	void should_get_initial_size() {
		int expected = 0;
		assertEquals(expected, sut.getSize());
	}
	
	@Test
	void should_add_to_list() {
		for (int i = 0; i < 50; i++) {
		sut.add(i);
	}
		sut.add(51);
		int expected = 51;
		assertEquals(expected, sut.getSize());
}
	
	@Test
	public void should_remove_from_start() {
		for (int i = 0; i < 50; i++) {
			sut.add(i);
		}
		sut.remove(0);
		assertEquals(49, sut.getSize());
		assertEquals(1, sut.get(0));
		
	}
	
	@Test
	public void remove_from_middle_of_list() {
		for (int i = 0; i < 50; i++) {
			sut.add(i);
		}
		sut.remove(25);
		assertEquals(26, sut.get(25));
		assertEquals(49, sut.getSize());
	}
	
	@Test
	public void remove_from_end_of_list() {
		for (int i = 0; i < 50; i++) {
			sut.add(i);
		}
		sut.remove(49);
		assertEquals(48, sut.get(48));
		assertEquals(49, sut.getSize());
	}
	
}