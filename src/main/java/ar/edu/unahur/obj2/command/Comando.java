package ar.edu.unahur.obj2.command;

public abstract class Comando implements Itarea{

    @Override
    public void ejecutar(Robot robot) {
        doEjecutar(robot);
        robot.disminuirBateria(getDuracion());
    }
    
    protected abstract void doEjecutar(Robot robot);

    protected abstract Double consumoDeBateria(); /*Estos dos son abstractos por que definen en cada tipo de tarea que van a hacer */

}
