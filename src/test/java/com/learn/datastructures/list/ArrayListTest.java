package com.learn.datastructures.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	private ArrayList<Integer> myList;

	@Before
	public void setUp() throws Exception {

		myList = new ArrayList<>(1);

		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}
	}

	@Test
	public void testAdd() {

		Assert.assertTrue(myList.get(9) == 9);
		Assert.assertTrue(myList.size() == 10);

	}

	@Test
	public void testRemove() {

		myList.remove(0);
		System.out.println(myList);
		myList.remove(8);
		System.out.println(myList);

		Assert.assertTrue(myList.size() == 8);

	}

	@Test
	public void testRemoveAt() {

		myList.removeAt(0);
		myList.removeAt(8);

		Assert.assertTrue(myList.size() == 8);

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testOutOfTheBounds() {
		myList.removeAt(0);
		myList.get(9);
	}

}
