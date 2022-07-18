package ejercicio18;

public class Videojuego implements Entregable{

    private String titulo="";
    private Integer horasEstimadas=10;
    private Boolean entregado=false;
    private String genero="";
    private String compania="";

    public Videojuego(){}

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Videojuego compareTo(Object a) {
        Videojuego videojuego=new Videojuego();
        if(this.horasEstimadas < ((Videojuego) a).getHorasEstimadas()){
            videojuego=(Videojuego) a;
        }
        else {
            videojuego=this;
        }
        return videojuego;
    }
}
