package ejercicio17;

public class Lavadora extends Electrodomestico{

    private Double carga=5.0;

    public Lavadora(){}

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public Double precioFinal(){
        Double precio=0.0;
        if(carga>=30){
            precio=super.precioFinal()+50;
        }
        else {
            precio=super.precioFinal();
        }
        return precio;
    }
}
