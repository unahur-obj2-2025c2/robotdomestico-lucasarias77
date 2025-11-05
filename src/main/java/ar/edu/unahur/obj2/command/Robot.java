package ar.edu.unahur.obj2.command;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private Double nivelBateria;
    private static Double tiempoDeCargaMaxima = 125.0;  /*125 minutos son 7500*/
    private static Double bateriaMaxima = 100.0;
    private List<Itarea> tareas = new ArrayList<>();

    public Robot(Double nivelBateria, Double tiempoDeCargaMaxima) {
        this.nivelBateria = nivelBateria;
        this.tiempoDeCargaMaxima = tiempoDeCargaMaxima;
    }

    public void agregarTarea(Itarea tarea){
        tareas.add(tarea);
    }

    public Double getNivelBateria(){
        return Math.round(nivelBateria * 100.0) / 100.0;
    }

    public void disminuirBateria(Double duracion) {
        nivelBateria = Math.max(0,(nivelBateria - duracion));
    }

    public void aumentarBateria(Double duracion) {
        nivelBateria = Math.min(100,(nivelBateria + duracion));
    }

    public Double getTiempoDeCargaMaxima() {
        return tiempoDeCargaMaxima;
    }

    public List<Itarea> getTareas() {
        return tareas;
    }

    public Double getBateriaMaxima() {
        return bateriaMaxima;
    }
    
    
}
