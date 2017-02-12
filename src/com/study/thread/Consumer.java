package com.study.thread;


public class Consumer extends Thread {

	private Box mBox;
	

	public Consumer(Box mBox) {
		super();
		this.mBox = mBox;
	}


	@Override
	public void run()
	{
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mBox.get();
			
		}
	}

}
