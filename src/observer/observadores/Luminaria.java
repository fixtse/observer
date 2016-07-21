package observer.observadores;
import observer.sujetos.Sensor;
import observer.sujetos.SensorIluminacion;

public class Luminaria implements ILuminaria {
    public static final int LUMINARIA_APAGADA = 0; 
    public static final int LUMINARIA_ENCENDIDA = 1; 
    private int codigo;
    private int estado;
    public Luminaria(int codigo) {
     this.codigo = codigo;
     this.estado = LUMINARIA_APAGADA;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public void actualizarEstado(Sensor sensor) {
        if (sensor instanceof SensorIluminacion) {


        } else {


        }
        System.out.println("La luminaria de codigo: " + this.codigo + " se encuentra en estado: " + this.estado);
    }
}
