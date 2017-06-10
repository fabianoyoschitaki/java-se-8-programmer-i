package br.com.fsy.exercicios.wrappers;

public class IntegerIncrement {
	static Integer dois = Integer.valueOf("2");
	public static void main(String[] args) {
		Integer valor = Integer.valueOf("1");
		System.out.println(valor);
		valor++;
		System.out.println(valor);
		Integer tres = dois;
		System.out.println(tres);
		tres++;
		System.out.println(tres);
		System.out.println(dois);
	}
}
