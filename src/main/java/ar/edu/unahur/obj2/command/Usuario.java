package ar.edu.unahur.obj2.command;

import java.util.List;

public class Usuario {
    private List<Itarea> tareas;
    private Robot robot;

    public void agregarTarea(Itarea tarea){
        tareas.add(tarea);
    }

    public void borrarTareas(){
        tareas.clear();
    }

    public void indicarAlRobotQueHagaTodasLasTareas(){
        robot.ejecutar(tareas);
    }
}
