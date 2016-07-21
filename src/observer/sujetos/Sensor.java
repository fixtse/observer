package observer.sujetos;
import java.util.*;
import observer.observadores.*;
public abstract class Sensor {
    private int codigo;
    private String ubicacion;
    private double medida;
    private List<ILuminaria> listaDeLuminarias = new ArrayList<ILuminaria>();
    public Sensor(int codigo, String ubicacion){
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.medida = 0;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public double getMedida() {
        return medida;
    }
    public void setMedida(double medida) {
        //Agregar la lógica para que se notifique a las luminarias que se prendan o apaguen
        if (this.medida != medida)  { 
            this.medida = medida;
            notificar();
        }
   }
    public List<ILuminaria> getLuminarias() {
        return listaDeLuminarias;
    }
    public void agregarLuminaria(ILuminaria luminaria) {
        listaDeLuminarias.add(luminaria);
    }
    public void retirarLuminaria(ILuminaria luminaria) {
        listaDeLuminarias.remove(luminaria);
    }
    public void notificar(){


    }
}
