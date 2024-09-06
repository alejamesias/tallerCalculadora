package interactivoCalculadora;
import java.util.Scanner;

import calculadora.Calculadora;

public class Interaccion{

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in); //Scanner para ingresar los numeros
        Scanner opciones = new Scanner(System.in); //Scanner para ingresar una opcion
        //objeto
        Calculadora calc = new Calculadora();

        System.out.println("Holaa, bienvenido a la calculadora de Aleja");

        System.out.print("Ingresa el primer número: ");
        int num1 = numero.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = numero.nextInt();

        System.out.println("Selecciona la operación que deseas realizar:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");

        int operacion = opciones.nextInt();

        int resultado = 0;
        switch (operacion) {
            case 1:
                resultado = calc.sumar(num1, num2);
                System.out.println("El reslutado de la suma es: " + resultado);
                break;
            case 2:
                resultado = calc.restar(num1, num2);
                System.out.println("El reslutado de la resta es: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                try {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("El resultado de la division es: " + resultado);
                } catch (ArithmeticException e) { //esto es una excepcion que se usa para validar errores matematicos
                    System.out.println(e.getMessage()); //aqui nos imprime un mensaje de la exepcion
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
