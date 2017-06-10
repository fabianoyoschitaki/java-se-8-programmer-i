package br.com.fsy.exercicios.wrappers;

/**
 * Classe para demonstrar que o Java, para economizar memória, mantém cache de 
 * alguns objetos e toda vez que um boxing é realizado, esses objetos são reutilizados.
 * 
 * São eles:
 * 	Todos Boolean e Byte
 * 	Short e Integer de -128 a 127
 * 	Caracter ASCII, como letras, números etc
 * 
 * @author Fabiano
 */
public class WrapperCacheValues {

	public static void main(String[] args) {
		Boolean b1 = Boolean.valueOf("true");
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = true;
		Boolean b4 = Boolean.valueOf("TRUe");
		System.out.println(b1 == b2); //true
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1 == b3); //true
		System.out.println(b1.equals(b3)); //true
		System.out.println(b1 == b4); //true
		System.out.println(b1.equals(b4)); //true
		
		Short s1 = Short.MAX_VALUE; //32767
		Short s2 = Short.valueOf("32767");
		System.out.println(s1 == s2); //false, pois excede 127
		System.out.println(s1.equals(s2)); //true
		
		Short s3 = Short.valueOf("127");
		Short s4 = 127;
		System.out.println(s3 == s4); //true
		System.out.println(s3.equals(s4)); //true
		Integer i3 = Integer.valueOf("127");
		System.out.println(i3.equals(s3)); //false, não é o mesmo tipo
	}

}
