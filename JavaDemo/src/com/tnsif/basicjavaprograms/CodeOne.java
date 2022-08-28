package com.tnsif.basicjavaprograms;

public class CodeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 2147483647;
		int min = -2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;

		System.out.println("This is the minimum integer value " +min);
		System.out.println("This is the maximum integer value " +max);
		
		System.out.println("This is the minimum short value " +shortMin);
		System.out.println("This is the maximum short value " +shortMax);
		
		System.out.println("This is the minimum long value " +longMin);
		System.out.println("This is the maximum long value " +longMax);
		
		System.out.println("This is the minimum byte value " +byteMin);
		System.out.println("This is the maximum byte value " +byteMax);
	
	}

}
