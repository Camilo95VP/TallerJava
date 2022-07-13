package ejercicios.tecnicos.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {
    Scanner leerDato = new Scanner(System.in);

    public void ejercicio1() {
        //1.Declara 2 variables numéricas (con el valor que desees),
        // he indica cual es mayor de los dos. Si son iguales indicarlo también.
        // Ve cambiando los valores para comprobar que funciona.
        Integer num1 = 80;
        Integer num2 = 300;

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }

    public void ejercicio2() {
        //Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
        //menores o iguales.

        System.out.println("Digite numero1: ");
        Integer num1 = leerDato.nextInt();
        System.out.println("Digite numero2");
        Integer num2 = leerDato.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " y " + num2 + " son iguales");
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }

    public void ejercicio3(){
        //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
        // teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante
        // PI y el método pow de Math.
            Scanner leerDato = new Scanner(System.in);
            System.out.println("Introduce el radio: ");
            String texto = leerDato.nextLine();

            Double radio = Double.parseDouble(texto);
            Double area= Math.PI*Math.pow(radio, 2);

            System.out.println("El area del circulo es "+area);

    }

    public void ejercicio4(){
        //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
        // El IVA sera una constante que sera del 21%.
        final double IVA=0.21;

        System.out.println("Introduce el precio de un producto: ");
        Integer dato = leerDato.nextInt();

        double precio=Double.parseDouble(String.valueOf(dato));
        double precioFinal=precio+(precio*IVA);

        System.out.println("IVA 21%: " + precioFinal);
    }

    public void ejercicio5(){
        //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

        Integer numero = 0;
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        while(numero < 100){
            numero++;
            if(numero % 2 == 0){
                pares.add(numero);
            } else if (numero % 2 == 1) {
                impares.add(numero);
            }
        }
        System.out.println("Numeros pares de 0 al 100 = " + pares);
        System.out.println("Numeros impares de 0 al 100 = " + impares);
    }

    public void ejercicio6(){
        //Realiza el ejercicio anterior usando un ciclo for.
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(Integer i = 1; i < 100; i++){
            if(i % 2 == 0){
                pares.add(i);
            } else if (i % 2 == 1) {
                impares.add(i);
            }
        }
        System.out.println("Numeros pares de 0 al 100 = " + pares);
        System.out.println("Numeros impares de 0 al 100 = " + impares);
    }

    public void ejercicio7(){
        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo
        //volverá a pedir (do while), después muestra ese número por consola.
        int numero;
        do{
            System.out.println("Introduce un numero mayor que 0");
            numero=leerDato.nextInt();
        }while(numero<=0);

        System.out.println("Numero leido = "+numero);
    }

    public void ejercicio8(){
        //Crea una aplicación por consola que nos pida un día de la semana y que nos
        //diga si es un día laboral o no. Usa un switch para ello.
        System.out.println("Introduce un dia de la semana");
        String dia = leerDato.nextLine();

        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }

    public void ejercicio9(){
    //Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
    //todas las a del String anterior por una e, adicionalmente concatenar a esta
    //frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

    String cadena = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.print(cadena.replace('a', 'e')+" en tiempos de guerra");
    }

}
