package ar.edu.unahur.obj2.command;

public class Ligoff extends Comando {
    private Habitacion cocina;

    public Ligoff(Habitacion cocina) {
        this.cocina = cocina;
    }

    @Override
    public Double getDuracion() {
        return !cocina.getEsLuzEncedida() ? 25.0 : 90.0;
    }

    @Override
    protected void doEjecutar(Robot robot) {
        cocina.apagarLuz();
    }

    @Override
    protected Double consumoDeBateria() {
        return !cocina.getEsLuzEncedida() ? 1.00 : 5.00;
    }
}
