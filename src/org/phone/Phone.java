package org.phone;

public class Phone {
	// different datatype order in arguments
	private void phone(String phoneName, long phoneNum, float phonePrice) {
		System.out.println("Phone name is :"+phoneName);
		System.out.println("Phone name is :"+phoneNum);
		System.out.println("Phone name is :"+phonePrice);
		
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phone("Redmi Note 12", 9344743295l, 9895.98f);
	}

}
