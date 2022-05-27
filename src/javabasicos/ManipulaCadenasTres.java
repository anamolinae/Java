package javabasicos;

public class ManipulaCadenasTres {

	public static void main(String[] args) {
		String alumno1, alumno2;
		alumno1= "Pepe";
		alumno2= "pepe";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

	
	//.equals si los dos son mayusc y minusc diferente da false
	//.equalsignorecase y estan diferentes da true

}