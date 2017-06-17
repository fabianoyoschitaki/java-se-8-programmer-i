package br.com.fsy.exercicios.modifiers;

public class Fish {
//	private 
	protected static String getColor(){
		return "Green";
	}
	public static void main(String[] args) {
		new Pufferfish().printDescription();
	}
}

class Pufferfish extends Fish {
	protected static String getColor(){
		return "Yellow";
	}
	public void printDescription(){
		System.out.println(super.getColor() + "," + this.getColor() + "," + getColor());
	}
}
