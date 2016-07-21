package observer.observadores;

import observer.sujetos.Sensor;

public interface ILuminaria {
    public void actualizarEstado(Sensor sensor);
}
