package com.simplilearn.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	
	public static void main(String[] args) {
		
		Queue< String> que = new PriorityQueue<String>();
		que.add("A");
		que.add("B");
		que.add("C");
		que.add("D");
		que.add("E");
		//que.add(null);
		System.out.println(que);
		
		
		
	}
}
