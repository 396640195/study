package com.study.thread;

public class Test  {

	public static void main(String[] args) {
		Box b = new Box();
		for(int i=0;i<5;i++){
			Consumer c = new Consumer(b);
			c.start();
		}
		
		for(int i=0;i<5;i++){
			Producer p = new Producer(b);
			p.start();
		}
		
		
	}

}
