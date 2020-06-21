package com.learn.datastructures.list.bt.bst;

public class BinarySearchTree {

	private BinarySearchTree left;
	private BinarySearchTree right;
	private int data;
	
	public BinarySearchTree getLeft() {
		return left;
	}

	public BinarySearchTree getRight() {
		return right;
	}

	public int getData() {
		return data;
	}

	public BinarySearchTree(int root) {
		super();
		this.data = root;
	}
	
	

	void setLeft(BinarySearchTree left) {
		this.left = left;
	}

	void setRight(BinarySearchTree right) {
		this.right = right;
	}

	void setData(int data) {
		this.data = data;
	}

	public void insert(int val) {

		if (val <= data) {

			if (left == null) {
				left = new BinarySearchTree(val);
			} else {
				left.insert(val);
			}

		} else {
			if (right == null) {
				right = new BinarySearchTree(val);
			} else {
				right.insert(val);
			}
		}

	}

	public boolean contains(int val) {

		if (val == data) {
			return true;
		}

		if (val < data) {
			left.contains(val);
		} else {
			right.contains(val);
		}
		return false;

	}
	
	public void printInOrder() {
		
		if(left!=null) {
			left.printInOrder();
		}
		
		System.out.println(data);
		
		if(right!=null) {
			right.printInOrder();
		}
	}

	@Override
	public String toString() {
		return "BinarySearchTree [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
	
	

}
