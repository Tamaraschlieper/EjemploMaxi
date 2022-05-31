/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
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
 
package ejercicio7.entidades;


import java.util.Scanner;

/**
 *
 * @author ICBC
 */
public class Persona {

Scanner leer= new Scanner(System.in).useDelimiter("\n");

//Atributos
public String nombre;
public int edad;
public String sexo;
public int peso;
public double altura;

//Constructores

public  Persona(){
    
}

public  Persona (String nombre, int edad, String sexo, int peso, double altura){
    this.nombre=nombre;
    this.edad=edad;
    this.altura=altura;
    this.sexo=sexo;
    this.peso=peso;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

public void crearPersona(){
    System.out.println(" Ingresar sexo con el que se identifique h o m u o");
    sexo=leer.next();
    if(sexo!="h"&&sexo!="m"&&sexo!="o"){
        System.out.println("opcion invalida: ingresar h, m u o ");
    System.out.println(" Ingresar nombre ");
    nombre=leer.next().toUpperCase();
    System.out.println(" Ingresar edad ");
    edad=leer.nextInt();
    System.out.println(" Ingresar peso ");
    peso=leer.nextInt();
    System.out.println(" Ingresar Altura ");
    altura=leer.nextDouble();
    }
    
    /* • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1*/
 
public double calcularIMC(){
    double IMC;
    int resultado = 0;
    IMC= peso/(Math.pow(altura, 2));
    if(IMC<20){
        resultado= -1;
        System.out.println(" La persona esta por debajo de su peso ideal ");
    }else if (IMC>=20||IMC<=25){
        resultado= 0;
        System.out.println(" La persona se encuentra en su peso ideal");
    }else if (IMC>25){
        resultado= 1;
        System.out.println(" La persona tiene sobrepeso");
    } 
    return resultado;
  
    }
/* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/ 
public boolean esMayorDeEdad();
     boolean mayor= false;
     if (edad>=18){
       mayor=true;
     }
     return mayor;
     
 } 
}