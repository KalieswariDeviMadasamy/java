package com.ds.linkedlist;

import java.util.Stack;

public class LinkedList<T> {
	Node<T> head;
	
	class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public LinkedList<T> insert(LinkedList<T> list, T data) {
		Node<T> newNode = new Node<>(data);
		
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node<T> last = list.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
	}
	
	public void printList(LinkedList<T> list) {
		for(Node<T> currNode = list.head; currNode != null; currNode = currNode.next)
			System.out.println(currNode.data);
	}
	
	public LinkedList<T> deleteByKey(LinkedList<T> list, T data) {
		
		if(list.head != null && list.head.data == data) {
			list.head = list.head.next;
			return list;
		} else {
			Node<T> currNode, prevNode = null;
			for(currNode = list.head; currNode != null && currNode.data !=data; currNode = currNode.next) {
				prevNode = currNode;
			}
			
			if(currNode != null) {
				prevNode.next = currNode.next;
			}
		}
		return list;
	}
	
	public LinkedList<T> deleteByPosition(LinkedList<T> list, int index) {
		
		if(list.head != null && index == 0) {
			list.head = list.head.next;
			return list;
		} else {
			Node<T> currNode = list.head;
			for(int count = 0; currNode != null && count < index-1; count++) {
				currNode = currNode.next;
			}
			
			if(currNode != null && currNode.next != null) {
				currNode.next = currNode.next.next;
			}
		}
		return list;
	}
	
	public int getLength(LinkedList<T> list) {
		int count = 0;
		for(Node<T> currNode = list.head; currNode != null; currNode = currNode.next) {
			count++;
		}
		return count;
	}
	
	public boolean contains(LinkedList<T> list, T data) {
		Node<T> currNode = list.head;
		for(; currNode != null && currNode.data != data; ) {
			currNode = currNode.next;
		}
		if(currNode == null)
			return false;
		return true;
	}
	
	public T getMiddle(LinkedList<T> list) {
		Node<T> slow_p = list.head;
		Node<T> fast_p = list.head;
		for(; fast_p != null && fast_p.next != null; ) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
		}
		return slow_p.data;
	}
	
	public boolean detectLoop(LinkedList<T> list) {
		Node<T> slow_p = list.head;
		Node<T> fast_p = list.head;
		for(;slow_p != null && fast_p != null && fast_p.next != null; ) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p)
				return true;
		}
		return false;
	}
	
	public boolean isPalindrome(LinkedList<T> list) {
		Node<T> temp = list.head;
		Stack<T> stack = new Stack<>();
		while(temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		temp = list.head;
		boolean isPalindrome = true;
		while(temp != null) {
			if(temp.data == stack.pop()) {
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				break;
			}
			temp = temp.next;
		}
		return isPalindrome;
	}
	
	public LinkedList<T> removeDuplicate(LinkedList<T> list) {
		Node<T> temp;
		for(Node<T> currNode = list.head; currNode !=null; currNode = currNode.next) {
			temp = currNode;
			while( temp!=null && currNode.data == temp.data) {
				temp = temp.next;
			}
			currNode.next = temp;
		}
		return list;
	}
	
	public boolean findIntersection(LinkedList<T> list, LinkedList<T> list1) {
		for(Node<T> firstList = list.head; firstList !=null; firstList = firstList.next) {
			for(Node<T> secondList = list.head; secondList !=null; secondList = secondList.next) {
				if(firstList == secondList)
					return true;
			}
		}
		return false;
	}
	
	public Node<T> intersection(LinkedList<T> list, LinkedList<T> list1) {
		LinkedList<T> newList = new LinkedList<>();
		for(Node<T> firstList = list.head; firstList !=null; firstList = firstList.next) {
			for(Node<T> secondList = list.head; secondList !=null; secondList = secondList.next) {
				if(firstList == secondList) {
					Node<T> newNode = new Node<>(firstList.data);
					if (newList.head == null) {
						newList.head = newNode;
					} else {
						Node<T> last = newList.head;
						
						while(last.next != null) {
							last = last.next;
						}
						
						last.next = newNode;
					}
				}
			}
		}
		return head;
	}
	
	public LinkedList<T> swapTwoNodes(LinkedList<T> list, T x, T y) {
		Node<T> xPrev = null, yPrev = null, xNode = null, yNode =null;
		if (x==y) {
			return list;
		}
		if (list.contains(list, x) && list.contains(list, y)) {
			Node<T> currNode = list.head;
			while(currNode!=null) {
				if(currNode.data == x) {
					xNode = currNode;
					break;
				}
				xPrev = currNode;
				currNode = currNode.next;
			}
			currNode = list.head;
			while(currNode!=null) {
				if(currNode.data == x) {
					yNode = currNode;
					break;
				}
				yPrev = currNode;
				currNode = currNode.next;
			}
			if(xPrev != null)
				xPrev.next = yNode;
			else
				head = yNode;
			
			if(yPrev != null)
				yPrev.next = xNode;
			else
				head = xNode;
			
			yNode.next = xNode.next;
			xNode.next = currNode.next;
			
		}
		return list;
	}
	
	public LinkedList<T> reverse(LinkedList<T> list) {
		Node<T> prevNode = null, nextNode = null, currNode = list.head;
		while(currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		list.head = prevNode;
		return list;
	}
 
}
