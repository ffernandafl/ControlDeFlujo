package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Estructura de control If
        /*if(condicion) {

        } else if {

        } else if {

        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cúal es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if (edad > 18) {
            System.out.println ("Felicidades, " + nombre + ", puedes votar");
        } else {
            System.out.println("Hola, " + nombre + ". Aún no puedes votar");
        }

        sc.close();*/

        /*solicitar al usuario 3 angulos de un triangulo y determinar si el
        triángulo es válido
         */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer ángulo");
        int angulo1 = sc.nextInt();
        System.out.println("Ingresa el segundo angulo");
        //sc.nextLine();
        int angulo2 = sc.nextInt();
        System.out.println("Ingresa el tercer ángulo");
        //sc.nextLine();
        int angulo3 = sc.nextInt();

        if ((angulo1 + angulo2 +angulo3) == 180) {
            System.out.println("Triángulo válido");
        } else {
            System.out.println("Triángulo inválido");
        }*/

        /*Pedir un año al usuario por consola, y determinar si el
        año es bisiesto.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int year = sc.nextInt();
        sc.nextLine();

        if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.println(  year + " es un año bisiesto");
        } else {
            System.out.println( year + " no es un año bisiesto");
        }*/

        //control de flujo
        /*switch(condicion) {
            case 1:
                codigo
            break;
            default:
                break;
        }*/
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int num2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada:\n1) Suma \n2) Resta" +
                 "\n3) Multiplicación \n4) División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("La operación que seleccionaste es inválida");

        }

        sc.close();

        System.out.println(resultado);*/

        //pedir un número al ususario y dependiendo la respuesta
        //mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        //Si elige un numero fuera de ese rango mostar un mensaje de error;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                num = 1;
                System.out.println("Lunes");
                break;
            case 2:
                num = 2;
                System.out.println("Martes");
                break;
            case 3:
                num = 3;
                System.out.println("Miércoles");
                break;
            case 4:
                num = 4;
                System.out.println("Jueves");
                break;
            case 5:
                num = 5;
                System.out.println("Viernes");
                break;
            case 6:
                num = 6;
                System.out.println("Sábado");
                break;
            case 7:
                num = 7;
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");

        }

    }
}
