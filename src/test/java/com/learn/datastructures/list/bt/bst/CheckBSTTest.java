package com.learn.datastructures.list.bt.bst;

import org.junit.Assert;
import org.junit.Test;

public class CheckBSTTest {


	@Test
	public void checkBST() {
		BinarySearchTree bst = new BinarySearchTree(10);
		BinarySearchTree seven = new BinarySearchTree(7);
		BinarySearchTree nine = new BinarySearchTree(9);
		nine.setLeft(seven);
		bst.setLeft(nine);
		bst.setRight(new BinarySearchTree(11));
		Assert.assertTrue(CheckBST.check(bst));
	}

	@Test
	public void checkNonBST() {
		BinarySearchTree nonBst = new BinarySearchTree(10);
		BinarySearchTree seven = new BinarySearchTree(7);
		BinarySearchTree nine = new BinarySearchTree(9);
		nine.setRight(seven);
		nonBst.setLeft(nine);
		nonBst.setRight(new BinarySearchTree(11));
		Assert.assertFalse(CheckBST.check(nonBst));
	}

}
