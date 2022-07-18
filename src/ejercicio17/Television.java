package ejercicio17;

public class Television extends Electrodomestico{
    private Integer resolucion=20;
    private Boolean sintonizador=false;

    public Television(){

    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer resolucion, Boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public Double precioFinal(){
        Double precio=0.0;
        if(resolucion>=40){
            precio=super.precioFinal()*1.3;
        }
        if(sintonizador){
            precio=super.precioFinal()*1.5;
        }
        if(resolucion<40 && sintonizador==false) {
            precio=super.precioFinal();
        }
        return precio;
    }

}
