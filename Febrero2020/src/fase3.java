//FASE 3

/*
● Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.(0,75 punts)
● En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser
falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases. (1,5 punts)*/

public class fase3 {

	public static void main(String[] args) {
		
		/*●Partiendo del año 1948 tienes que hacer un bucle "for" y mostrar los años bisiestos hasta llegar a tu año
		de nacimiento.*/
		
		for (int i = 1948; i <= 1988; i=i+4) {
			  System.out.println(i);
			}
		
		//● Crea una variable "boolean" que será cierta si el año de nacimiento es bisiesto o falsa si no lo es.
		int birthdate= 1999;
		
		System.out.println(birthdate == 1988 || birthdate == 1984 || birthdate == 1980 || birthdate ==1976 || birthdate ==1972
				|| birthdate ==1968 || birthdate == 1964 || birthdate ==1960 || birthdate ==1956 || birthdate ==1952 || birthdate ==1948);
		
		
	}

}
