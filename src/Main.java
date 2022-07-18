import ejercicios.tecnicos.com.Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        Scanner entrada=new Scanner(System.in);
        String bandera="";
        while (!"e".equals(bandera)){
            System.out.println("Ingrese ejercicio a probar del 1 al 18 o e para salir");

            String opcion=entrada.nextLine();

            switch (opcion) {
                case "1" -> ejercicios.ejercicio1();
                case "2" -> ejercicios.ejercicio2();
                case "3" -> ejercicios.ejercicio3();
                case "4" -> ejercicios.ejercicio4();
                case "5" -> ejercicios.ejercicio5();
                case "6" -> ejercicios.ejercicio7();
                case "8" -> ejercicios.ejercicio8();
                case "9" -> ejercicios.ejercicio9();
                case "10" -> ejercicios.ejercicio10();
                case "11" -> ejercicios.ejercicio11();
                case "13" -> ejercicios.ejercicio13();
                case "14" -> ejercicios.ejercicio14();
                case "15" -> ejercicios.ejercicio15();
                case "16" -> ejercicios.ejercicio16();
                case "17" -> ejercicios.ejercicio17();
                case "18" -> ejercicios.ejercicio18();
                case "e" -> bandera = "e";

            }
        }

    }
}