package ar.edu.unahur.obj2.command;

public class Habitacion {
    private Boolean esLuzEncedida;
    private final Double area;
    private Boolean esPisoLimpio;

    public Habitacion(Boolean esLuzEncedida, Double area, Boolean esPisoLimpio) {
        this.esLuzEncedida = esLuzEncedida;
        this.area = area;
        this.esPisoLimpio = esPisoLimpio;
    }

    public Boolean encenderLuz() {
        return esLuzEncedida = true;
    }

    public Boolean apagarLuz() {
        return esLuzEncedida = false;
    }

    public void limpiarPiso(){
        esPisoLimpio = Boolean.TRUE;
    }

    public Boolean getEsLuzEncedida() {
        return esLuzEncedida;
    }

    public Double getArea() {
        return area;
    }

    public Boolean getEsPisoLimpio() {
        return esPisoLimpio;
    }

    
}
