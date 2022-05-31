/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       Persona p1= new Persona();
       //Persona p2= new Persona();
       //Persona p3= new Persona();
       //Persona p4= new Persona();
       
       p1.crearPersona();
       p1.calcularIMC();
       p1.esMayorDeEdad();
    }
    
}
