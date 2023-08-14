package oop2;

import java.util.ArrayList;

public class Quiz1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Quiz1_method t = new Quiz1_method();
		a = t.inputName();
		
		t.outputName(a);
	}
}
