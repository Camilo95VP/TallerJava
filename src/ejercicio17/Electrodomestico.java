package ejercicio17;

public class Electrodomestico {

    protected Double precioBase = 100.0;
    protected String color = "blanco";
    protected Character consumoEnergetico = 'F';
    protected Double peso = 5.0;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(Character letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra;
        }
    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")
                || color.equalsIgnoreCase("gris")) {

            this.color=color;

        }
    }

    public Double precioFinal(){
        Double precioFinal=0.0;
        if(consumoEnergetico.equals('A')){
            precioFinal=precioBase+100;
        }
        if(consumoEnergetico.equals('B')){
            precioFinal=precioBase+80;
        }
        if(consumoEnergetico.equals('C')){
            precioFinal=precioBase+60;
        }
        if(consumoEnergetico.equals('D')){
            precioFinal=precioBase+50;
        }
        if(consumoEnergetico.equals('E')){
            precioFinal=precioBase+30;
        }
        if(consumoEnergetico.equals('F')){
            precioFinal=precioBase+10;
        }

        if (peso>=0 && peso <=19){
            precioFinal+=10;
        }
        else if (peso>=20 && peso <=49){
            precioFinal+=50;
        }
        else if (peso>=50 && peso <=79){
            precioFinal+=80;
        }
        else if (peso>=80){
            precioFinal+=100;
        }
        return precioFinal;
    }

}




