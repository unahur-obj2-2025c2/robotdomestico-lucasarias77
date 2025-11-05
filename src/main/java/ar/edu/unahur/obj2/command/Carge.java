package ar.edu.unahur.obj2.command;


public class Carge extends Comando{

    private final Double MINUTOS;
    private Double cargaRestante = 0.0;

    public Carge(Double mINUTOS, Double cargarRestante) {
        MINUTOS = mINUTOS;
    }

    @Override
    protected void doEjecutar(Robot robot) {
        cargaRestante = robot.getNivelBateria();
        robot.aumentarBateria(cantidadDeBateriaCargar());
    }


    @Override
    public Double getDuracion() {
        return Double.min(MINUTOS * 60, segundosParaCompletarCarga()); /*La duracion la devuelte en minutos */
    }

    private Double segundosParaCompletarCarga() {
        Double bateriaFaltante = 100.0 - cargaRestante;
        Double cargaCompletaEnSegundos = 125.0 * 60;
        return (bateriaFaltante * cargaCompletaEnSegundos) / 100.0;
    }

    private Double cantidadDeBateriaCargar(){ /*porcentaje de bateria a carga hace la cuenta y la suma con aumentarBateria*/
        return MINUTOS * 100.0 / 125.0;
    }

    @Override
    protected Double consumoDeBateria() {
        return 0.0;
    }
    
}
