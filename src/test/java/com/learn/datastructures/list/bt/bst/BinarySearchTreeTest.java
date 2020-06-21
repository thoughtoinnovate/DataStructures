package com.learn.datastructures.list.bt.bst;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInsertion() {
		BinarySearchTree bst = new BinarySearchTree(3);
		bst.insert(10);
		bst.insert(1);
		bst.insert(2);
		bst.printInOrder();
		System.out.println(bst);
	}

}
