package ejercicio16;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private Integer edad = 0;
    private Integer DNI;
    private Character sexo = 'H';
    private Double peso = 0.0;
    private Double altura = 0.0;

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        generaDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Double calcularIMC(){
        Double IMC = peso/(altura*altura);
        Double retorno = 0.0;
        if(IMC < 20){
            retorno =  -1.0;
            System.out.println("Esta por debajo del peso ideal");
        }
        if(IMC > 20 && IMC <25){
            retorno = 0.0;
            System.out.println("Esta en el peso ideal");
        }
        if(IMC > 25){
            retorno = 1.0;
            System.out.println("Esta en sobrepeso");
        }
        return  retorno;
    }

    public void esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    private void comprobarSexo(Character sexo){
        if(sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private void generaDNI(){
        Random r = new Random();
        this.DNI = r.nextInt(90000000);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}

