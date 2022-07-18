package ejercicios.tecnicos.com;

import ejercicio16.Persona;
import ejercicio17.Electrodomestico;
import ejercicio17.Lavadora;
import ejercicio17.Television;
import ejercicio18.Serie;
import ejercicio18.Videojuego;

import java.time.LocalDateTime;
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

    public void ejercicio3() {
        //Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
        // teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante
        // PI y el método pow de Math.
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        String texto = leerDato.nextLine();

        Double radio = Double.parseDouble(texto);
        Double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es " + area);

    }

    public void ejercicio4() {
        //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
        // El IVA sera una constante que sera del 21%.
        final double IVA = 0.21;

        System.out.println("Introduce el precio de un producto: ");
        Integer dato = leerDato.nextInt();

        double precio = Double.parseDouble(String.valueOf(dato));
        double precioFinal = precio + (precio * IVA);

        System.out.println("IVA 21%: " + precioFinal);
    }

    public void ejercicio5() {
        //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

        Integer numero = 0;
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        while (numero < 100) {
            numero++;
            if (numero % 2 == 0) {
                pares.add(numero);
            } else if (numero % 2 == 1) {
                impares.add(numero);
            }
        }
        System.out.println("Numeros pares de 0 al 100 = " + pares);
        System.out.println("Numeros impares de 0 al 100 = " + impares);
    }

    public void ejercicio6() {
        //Realiza el ejercicio anterior usando un ciclo for.
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (Integer i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else if (i % 2 == 1) {
                impares.add(i);
            }
        }
        System.out.println("Numeros pares de 0 al 100 = " + pares);
        System.out.println("Numeros impares de 0 al 100 = " + impares);
    }

    public void ejercicio7() {
        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo
        //volverá a pedir (do while), después muestra ese número por consola.
        int numero;
        do {
            System.out.println("Introduce un numero mayor que 0");
            numero = leerDato.nextInt();
        } while (numero <= 0);

        System.out.println("Numero leido = " + numero);
    }

    public void ejercicio8() {
        //Crea una aplicación por consola que nos pida un día de la semana y que nos
        //diga si es un día laboral o no. Usa un switch para ello.
        System.out.println("Introduce un dia de la semana");
        String dia = leerDato.nextLine().toLowerCase();

        switch (dia) {
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

    public void ejercicio9() {
        //Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
        //todas las a del String anterior por una e, adicionalmente concatenar a esta
        //frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

        String cadena = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.print(cadena.replace('a', 'e') + " en tiempos de guerra");
    }


    public void ejercicio10() {
        //Realizar una aplicación de consola, que al ingresar una
        //frase por teclado elimine los espacios que esta contenga.
        System.out.println("Ingrese una frase: ");
        String frase = leerDato.nextLine();


    }

    public void ejercicio11() {
        //Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por
        //consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene
        //de “a,e,i,o,u”.
        System.out.println("Ingrese una frase: ");
        String frase = leerDato.nextLine();
        System.out.println("la frase tiene: " + frase.length() + " longitud");
        Integer contador = 0;
        for (Integer i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' ||
                    frase.charAt(i) == 'e' ||
                    frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' ||
                    frase.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales");
    }

    public void ejercicio12(){
        //Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
        System.out.println("Ingrese la primer palabra: ");
        String palabra1 = leerDato.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = leerDato.nextLine();
        if(palabra1.equals(palabra2)){
            System.out.println(palabra1 + " y " + palabra2 + " son iguales.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " son diferentes.");
        }
    }

    public void ejercicio13(){
        //Realizar un algoritmo que permita consulta la fecha y hora actual en el
        //formato (AAAA/MM/DD) (HH:MM:SS)
        String fechaActual = String.valueOf(LocalDateTime.now());
        System.out.println(fechaActual);
    }

    public void ejercicio14(){
        //Crear un programa que pida un numero por teclado y que imprima por pantalla los números
        //desde el numero introducido hasta 1000 con saldos de 2 en 2.
        System.out.println("Digite un numero: ");
        Integer numero = leerDato.nextInt();

        for(Integer i = numero; i<=1000; i+=2){
            System.out.println(i);
        }
    }

    public void ejercicio15(){
        boolean estado = true;


        do{
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            System.out.println("Digite una opcion: ");
            Integer opcion = leerDato.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("digitaste 1");
                   break;
               case 2:
                   System.out.println("digitaste 2");
                   break;
               case 3:
                   System.out.println("digitaste 3");
                   break;
               case 4:
                   System.out.println("digitaste 4");
                   break;
               case 5:
                   System.out.println("digitaste 5");
                   break;
               case 6:
                   System.out.println("digitaste 6");
                   break;
               case 7:
                   System.out.println("digitaste 7");
                   break;
               case 8:
                   estado = false;
                   System.out.println("Hasta pronto");
                   break;
               default:
                   System.out.println("Opcion incorrecta");
           }
        }while(estado);
    }

    public void ejercicio16(){
        System.out.println("Nombre: ");
        String nombre = leerDato.nextLine();
        System.out.println("Edad: ");
        Integer edad = leerDato.nextInt();
        System.out.println("Sexo: ");
        String sexoS = leerDato.next();
        Character sexo=sexoS.charAt(0);
        System.out.println("Peso");
        Double peso = leerDato.nextDouble();
        System.out.println("Altura: ");
        Double altura = leerDato.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Juan");
        persona3.setSexo('H');
        persona3.setPeso(56.0);
        persona3.setEdad(26);
        persona3.setAltura(1.70);

        System.out.println("Persona 1");
        persona1.calcularIMC();
        persona1.esMayorDeEdad();
        System.out.println(persona1.toString());

        System.out.println("Persona 2");
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        System.out.println(persona2.toString());

        System.out.println("Persona 3");
        persona3.calcularIMC();
        persona3.esMayorDeEdad();
        System.out.println(persona3.toString());

    }
    public void ejercicio17(){
        ArrayList<Electrodomestico> electrodomesticos=new ArrayList<>(10);
        Double precioB=100.0;
        for(int x=0;x<5;x++){
            Lavadora lavadora=new Lavadora(precioB,"blanco",'A',30.0,6.0);
            if(lavadora instanceof Electrodomestico){
                electrodomesticos.add(x,lavadora);
            }
            precioB+=100.0;
        }
        for(int x=5;x<10;x++){

            Television television=new Television(precioB,"blanco",'F',10.0,42,true);
            if(television instanceof Electrodomestico){
                electrodomesticos.add(x,television);
            }
            precioB+=100.0;
        }
        Double precio=0.0;
        for (Electrodomestico electrodomestico: electrodomesticos){
            System.out.println(electrodomestico.precioFinal());
            precio=precio+electrodomestico.precioFinal();
        }
        System.out.println("Precio total de electrodomesticos= "+precio);
    }
    public void ejercicio18(){

        ArrayList<Serie> series=new ArrayList<>(5);
        ArrayList<Videojuego> videojuegos=new ArrayList<>(5);
        Integer temp=1;
        Integer horas=12;
        for (int x=0;x<5;x++){
            Serie serie=new Serie("De regreso al espacio","Elon Musk",temp,"Ciencia");
            series.add(serie);
            temp+=1;

            Videojuego videojuego=new Videojuego("Horizon",horas,"Aventura","Sony");
            videojuegos.add(videojuego);
            horas+=2;
        }

        series.get(3).entregar();
        series.get(4).entregar();
        videojuegos.get(2).entregar();
        videojuegos.get(0).entregar();

        Integer entregados=0;
        for(Serie serie:series){

            if(serie.isEntregado()){
                entregados+=1;
                serie.devolver();
            }
        }
        System.out.println("Se han entregado "+ entregados+" series");
        entregados=0;
        for(Videojuego videojuego:videojuegos){

            if(videojuego.isEntregado()){
                entregados+=1;
                videojuego.devolver();
            }
        }
        System.out.println("Se han entregado "+ entregados+" videojuegos");
        Serie serie=new Serie();
        for(int x=0;x<4;x++){

            if(x==0){
                serie=series.get(x).compareTo(series.get(x+1));
            }else{
                serie=serie.compareTo(series.get(x+1));
            }

        }
        System.out.println(serie.toString());
        Videojuego videojuego=new Videojuego();
        for(int x=0;x<4;x++){
            if(x==0){
                videojuego=videojuegos.get(x).compareTo(videojuegos.get(x+1));
            }else{
                videojuego=videojuego.compareTo(videojuegos.get(x+1));
            }
        }
        System.out.println(videojuego.toString());


    }

}
