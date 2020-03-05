package com.ds.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author M1050445
 *
 * Maximum number of nodes at any level in a Binary tree is 2(pow)l, considering root as level 0.
 * Level 0 - 2(pow)0 - 1
 * Level 1 - 2(pow)1 - 2
 * Level 2 - 2(pow)2 - 4
 * ..
 * 
 * Maximum number of nodes in a binary tree of height h is 2(pow)h+1 - 1, considering root as level 0.
 * Level 0 - (2(pow)1 - 1) - 1
 * Level 1 - (2(pow)2 - 1) - 2
 * Level 2 - (2(pow)3 - 1) - 7
 */
public class BinaryTree<T> {
	
	class Node {
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public int sumOfEvenOdd(Node root) {
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int level = 0;
		int sumEven = 0, sumOdd = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			while(size>0) {
				Node temp = q.remove();
				if(level % 2 == 0)
					sumEven += temp.data;
				else
					sumOdd += temp.data;
				
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				size--;
			}
			level++;
		}
		
		return sumEven - sumOdd;
	}

}
