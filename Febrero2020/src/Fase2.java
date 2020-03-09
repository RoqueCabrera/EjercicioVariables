//FASE 2
//Sabiendo que 1948 es un año bisiesto
import java.util.Scanner;

public class Fase2 {

	public static void main(String[] args) {
		
		//● Crea una constante con el valor del año (1948).
		
		final int initialYear = 1948;
		
		//● Crea una variable que guarde cada cuánto hay un año bisiesto.
		
		int chosenYear=1988;
		
		if ((chosenYear % 4 == 0) && ((chosenYear % 100 != 0) || (2021 % 400 == 0)))
			System.out.println(chosenYear + " it´s a leap year!");
		else
			System.out.println( chosenYear + " it´s not a leap year!");
		
		
		/*● Calcula cuántos años bisiestos hay entre 1948 y tu año de nacimiento y almacenar el valor
		resultante en una variable.*/
		
		int recount= ((1988-1948)/4)+1;
		
		//● Muestra por pantalla el resultado del cálculo.
		System.out.println ("There have been " + recount + " leap years between " + initialYear + " and " + chosenYear);
	
	
	
	
	
	
	}

}
