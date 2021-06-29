package com.ojas.threads;

class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class Example1 {
	
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product is not avaliable");
			
		}
		else
			System.out.println("product Avaliable");
	}

	public static void main(String args[]) {
		Example1 obj = new Example1();
		try {
			obj.productCheck(160);
		} catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
		
	}
}