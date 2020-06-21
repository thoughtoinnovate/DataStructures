package com.learn.datastructures.list;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

	private int capacity = 5;
	private E[] backingArray = (E[]) new Object[capacity];
	private int lastIndex = -1;

	public ArrayList(int capacity) {
		this.capacity = capacity;
		backingArray = (E[]) new Object[capacity];
	}

	public ArrayList() {
		super();
	}

	@Override
	public void add(E element) {

		lastIndex++;

		if (lastIndex == (capacity - 1)) {

			int newCapacity = 2 * capacity;
			System.out.println("Creating new backing array of capacity:" + newCapacity);
			E[] newArray = (E[]) new Object[newCapacity];

			for (int i = 0; i < capacity; i++) {
				newArray[i] = backingArray[i];
			}
			backingArray = newArray;
			capacity = newCapacity;

		}

		backingArray[lastIndex] = element;

	}

	@Override
	public void add(E element, int index) {

		if (index > capacity - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (index <= lastIndex) {

			lastIndex++;

			int iterations = capacity - index;
			E newElement = element;

			for (int i = 0; i < iterations; i++) {

				if (capacity == (index + i + 1)) {
					add(newElement);

				}

				E temp = backingArray[index + i];
				backingArray[index + i] = newElement;
				newElement = temp;

			}

			return;
		}

		add(element);

	}

	@Override
	public void remove(E element) {

		// brute force search
		for (int i = 0; i < backingArray.length; i++) {

			if (element.equals(backingArray[i])) {
				removeAt(i);
				break;
			}
		}

		backingArray[lastIndex] = null;
	}

	@Override
	public void removeAt(int index) {

		if (index > capacity - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}

		for (int i = index; i < lastIndex; i++) {
			backingArray[i] = backingArray[i + 1];
		}

		backingArray[lastIndex] = null;

		lastIndex--;

	}

	@Override
	public E get(int index) {

		if (index > lastIndex) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return backingArray[index];
	}

	@Override
	public String toString() {
		return "ArrayList{" + "backingArray=" + Arrays.toString(backingArray) + '}';
	}

	public int size() {
		// TODO Auto-generated method stub
		return lastIndex + 1;
	}
}