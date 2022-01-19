package com.coderscampus;

public class CustomArrayList<T>  implements CustomList<T>{
	Object[] items = new Object[10]; // this is the array that will back the list
	int i = 0;
	
	@Override
	public boolean add(T item) {
	return add(i, item);
	}
	
	public Object[] addSize() {
		Object[] biggerArray = new Object[i * 2];
		for (int j = 0; j < i; j++) {
			biggerArray[j] = items[j];
		}
		return biggerArray;
	}
	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (i == items.length) {
			items = addSize();
		}
		
		for (int j = i - 1; j > i; j--) {
			items[j + 1] = items[j];
		}
		items[index] = item;
		i++;
		return true;
	}
	@Override
	public int getSize() {
		return i;
	}
	
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return (T) items[index]; 
	}
	
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		T removed = (T)items[index]; // tracks and returns the item being removed
		for (int j = index; j < i; j++) { // begins the for loop at the index being removed and iterates through the rest of the loop
			items[j] = items[j + 1]; // rewrites the for loop, iterating over the index of the item we want to remove, without making it null
		}
		i--; // keeps track of the size of the array after the removed item has been over written.
		return removed;
	} 
}


	