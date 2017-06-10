package br.com.fsy.exercicios.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SimplePredicate {
	public static void main(String[] args) {
		Predicate<String> verbosePredicate = new Predicate<String>() {
			@Override
			public boolean test(String parametro) {
				return parametro.length() > 6;
			}
		};
		Predicate<String> lambdaPredicate = parametro -> parametro.length() > 6;
		
		List<String> nomes = Arrays.asList("Fabiano", "Shoji", "Yoschitaki");
		for (String nome : nomes) {
			System.out.println(verbosePredicate.test(nome));
			System.out.println(lambdaPredicate.test(nome));
		}
	}
}
