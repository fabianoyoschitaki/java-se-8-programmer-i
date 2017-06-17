package br.com.fsy.exercicios.wrappers;

/**
	== between two reference types is always reference comparison
		More often than not, e.g. with Integer and String, you'd want to use equals instead
	== between a reference type and a numeric primitive type is always numeric comparison
		The reference type will be subjected to unboxing conversion
		Unboxing null always throws NullPointerException
	
	While Java has many special treatments for String, it is in fact NOT a primitive type
	
	The above statements hold for any given valid Java code. With this understanding, there is no inconsistency whatsoever in the snippet you presented.
**/
public class CompareIntegerToInt {
	public static void main(String[] args) {
		Integer integerValueNull = null;
		String stringValueNull = null;
		int intValue = 0;
		// throws NullPointerException
		// System.out.println(intValue == integerValueNull);
		
		//throws java.lang.Error: Unresolved compilation problem: 
		//	Incompatible operand types Integer and String
		//	System.out.println(integerValueNull == stringValueNull);
		
		Integer integerValueNotNull = 1;
		String stringValueNotNull = "1";
		System.out.println(integerValueNotNull.equals(stringValueNotNull));//false, different types

		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//	Type mismatch: cannot convert from Integer to String
//		stringValueNotNull = integerValueNotNull;
	}

}
