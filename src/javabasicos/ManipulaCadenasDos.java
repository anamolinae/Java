package javabasicos;

public class ManipulaCadenasDos {

	public static void main(String[] args) {
		String frase= "hoy es el ultimo dìa de la semana, es viernes ";
		String frase_resumen= frase.substring(35, 46);
		System.out.println(frase_resumen);
		System.out.println(frase_resumen +"y a descansar");
	}

}
