package com.study.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box {

	private List<Integer> repository = new ArrayList<Integer>();
	
	public synchronized void put(int value){
		while(repository.size()>5){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		repository.add(value);
		System.out.println("生产:"+value+",thread-name:"+Thread.currentThread().getName());
		notifyAll();
	}
	
	public synchronized int get(){
		
		while(repository.size()<=0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Iterator<Integer> it =  repository.iterator();
		int v = it.next();
		it.remove();
		System.out.println("消费:"+v+",thread-name:"+Thread.currentThread().getName());
		notifyAll();
		return v;
	}

}
