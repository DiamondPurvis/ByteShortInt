package com.diamondpurvis;

public class Main {

    public static void main(String[] args) {

    // int has a width of 32
	int myMinValue=50;

	// byte has a width of 8
	byte myByteValue = 10;

	// short has a width of 16
	short myShortValue = 20;

	// long has a width of 64
	long myLongValue= 50000 + 10 * (myByteValue + myShortValue + myMinValue);
	System.out.println("myLongValue = " + myLongValue);
    }
}
