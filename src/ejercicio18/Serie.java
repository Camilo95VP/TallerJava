package ejercicio18;

public class Serie implements Entregable{

    private String titulo="";
    private Integer numeroTemporadas=3;
    private String genero="";
    private Boolean entregado=false;
    private String creador="";

    public Serie(){

    }

    public Serie(String titulo,String creador) {
        this.titulo = titulo;
        this.creador=creador;
    }

    public Serie(String titulo,String creador, Integer numeroTemporadas, String genero) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", genero='" + genero + '\'' +
                ", entregado=" + entregado +
                ", creador='" + creador + '\'' +
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
    public Serie compareTo(Object a) {

        Serie serie = new Serie();
        if (this.numeroTemporadas < ((Serie) a).getNumeroTemporadas()) {
            serie = (Serie) a;
        } else {
            serie = this;
        }
        return serie;
    }
}
