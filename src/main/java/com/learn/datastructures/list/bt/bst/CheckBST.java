package com.learn.datastructures.list.bt.bst;

public class CheckBST {
	
	public static boolean check(BinarySearchTree binarySearchTree) {
		return check(binarySearchTree,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private static boolean check(BinarySearchTree binarySearchTree, int minValue, int maxValue) {
		
		if(binarySearchTree==null) {
			return true;
		}
		
		if(binarySearchTree.getData()<minValue || binarySearchTree.getData()>maxValue) {
			return false;
		}
		
		return check(binarySearchTree.getLeft(),minValue,binarySearchTree.getData()-1)
				&& check(binarySearchTree.getRight(),binarySearchTree.getData()+1,maxValue);
	}

}
