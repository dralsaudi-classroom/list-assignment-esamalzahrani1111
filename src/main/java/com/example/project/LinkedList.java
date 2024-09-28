package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;
	
    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
	}
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
    public T mostFrequentElement() {
        // throw new UnsupportedOperationException("Not supported yet.");
        //         Write the method mostFrequentElement, member of the class LinkedList, that returns
        // the most frequent element in the list. The most frequent element is the element
        // appearing the highest number of times. If one or more element appear the same
        // number of times, the one encountered earlier is returned.
        // Example 1.1. Given the list l : A, B, C, B, C, D, E, mostFrequentElement() returns
        // B.
	Node<T> MostFreqObj = null;
	    if (! (this.empty()) ){

		    
		     //Node<T> temp = null;
		     Node<T> runner1 = head;
		     Node<T> runner2 = head;
		    
		    int frequency = 0;
		    int tempFrequency = 0;
		    
		    while (runner1 != null){
			    
			    //temp = runner1;
			    
			    while (runner2 != null){
				    if (runner1.data == runner2.data)
				    tempFrequency++;
				    runner2 = runner2.next;
			    }
			    
			    if (tempFrequency>frequency){
				frequency = tempFrequency;
				    MostFreqObj = runner1;
			    }
			    tempFrequency = 0;
			    runner2 = head;
			    runner1 = runner1.next;
			    
		    }






		    
	    }
	    return MostFreqObj.data;
    }
}
