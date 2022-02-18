package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		int i=10;
		double d=10;
		
		System.out.println(i); // 10
		System.out.println(d); // 10.0
		
		/* 2 types of casting
		 * Casting is the process of converting the value from one type to another
		 * 
		 * Widening/ Implicit/ Automatic (Convert small num into bigger)
		 * byte->short->int->long->float->double
		 * 
		 * Narrowing/ Explicit/ Manual (Convert big num into smaller num)
		 * double->float->long->int->short->byte
		 */
		System.out.println("************************Narrowing***********************************");
		
		int num=(int)10.99; // *Must state what variable you want to change to ex:(int)10.99;
		System.out.println(num); // 10
		
		float f=(float)10.99; // or float f=10.99f;
		
		byte b=(byte)128;
		System.out.println(b); // -1000
		
		int number=(int)11568768768l;
		System.out.println(number); // -1316133120

	}

}
