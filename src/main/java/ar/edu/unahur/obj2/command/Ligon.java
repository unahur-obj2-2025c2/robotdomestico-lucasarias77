package ar.edu.unahur.obj2.command;

public class Ligon extends Comando{
    private Habitacion cocina;

    @Override
    public Double getDuracion() {
        return cocina.getEsLuzEncedida() ? 25.0 : 90.0;
    }

    @Override
    protected void doEjecutar(Robot robot) {
        cocina.encenderLuz();
    }

    @Override
    protected Double consumoDeBateria() {
       return cocina.getEsLuzEncedida() ? 1.00 : 5.00;
    }

    /*LIGON	Encender la luz de una determinada habitación de la casa.	
    Si la luz estaba encendida => 1.00%, de lo contrario 5.00%	Si la luz estaba encendida => 25 segundos, de lo contrario 90 segundos. */
}
