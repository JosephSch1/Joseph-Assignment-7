package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; // this is the array that will back the list
	int i = 0;

	@Override
	public boolean add(T item) {
		if (i >= items.length) {
			items = addSize();
		}
		items[i] = item;
		i++;
		return true;
	}

	public Object[] addSize() {
		Object[] biggerArray = new Object[items.length * 2];
		for (int j = 0; j < i; j++) {
			biggerArray[j] = items[j];
		}
		return biggerArray;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > i) {
			throw new IndexOutOfBoundsException("Requested index " + index + " is out of bounds of the list");
		}
		if (i == items.length) {
			items = addSize();
		}

		Object[] addedItems = new Object[items.length];
		for (int j = 0; j < index; j++)
			addedItems[j] = items[j];
		addedItems[index] = item;

		for (int j = index + 1; j < items.length; j++)
			addedItems[j] = items[j - 1];
		i++;
		items = addedItems;
		return true;
	}

	@Override
	public int getSize() {
		return i;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= i)
			throw new IndexOutOfBoundsException("Requested index is out of bounds of the list");
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= i) {
			throw new IndexOutOfBoundsException("Requested index is out of bounds of the list");
		}
		
		T removed = (T) items[index]; // tracks and returns the item being removed

		Object[] removedItems = new Object[items.length];

		for (int j = 0; j < index; j++)
			removedItems[j] = items[j];

		for (int j = index; j < items.length - 1; j++)
			removedItems[j] = items[j + 1];

		i--;
		items = removedItems;
		return removed;
	}
}
