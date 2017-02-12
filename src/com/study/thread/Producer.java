package com.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer extends Thread {
	private Box mBox;
	
	public Producer(Box mBox) {
		super();
		this.mBox = mBox;
	}

	@Override
	public void run()
	{
		Random rand = new Random();
		while(true){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mBox.put(rand.nextInt(1000));
			
		}
	}

	
}
