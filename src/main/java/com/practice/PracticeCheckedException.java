package com.practice;

public class PracticeCheckedException {

	
	public static void getText() {
		
		System.out.println("Hello");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("World");
		
	}
	
	public static void main(String[] args) {
	
		getText();
		
	}
	
}
