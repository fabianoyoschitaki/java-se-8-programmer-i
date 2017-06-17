package br.com.fsy.exercicios.statics;

//import static java.lang.System; must be a field or member type 
import static java.lang.System.*;
import static java.lang.System.out;

public class StaticImport {
	public static void main(String[] args) {
		System.out.println("hello world");
		out.println("comes from java.lang.System.out;");
		err.println("comes from java.lang.System.*;");
	}
}

