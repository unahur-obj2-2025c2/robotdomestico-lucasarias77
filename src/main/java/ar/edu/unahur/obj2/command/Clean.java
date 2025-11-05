package ar.edu.unahur.obj2.command;

public class Clean extends Comando{

    private Habitacion habitacion;

    public Clean(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public Double getDuracion() {
        return habitacion.getArea() * 180.0;
    }

    @Override
    protected void doEjecutar(Robot robot) {
        habitacion.limpiarPiso();;
    }

    @Override
    protected Double consumoDeBateria() {
        return habitacion.getArea() * 5.0;
    }
    
}
