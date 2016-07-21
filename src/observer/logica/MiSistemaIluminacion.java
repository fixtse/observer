package observer.logica;

import observer.observadores.*;
import observer.sujetos.*;

public class MiSistemaIluminacion {

    public static void main(String[] args) {
        //1. Se crea un sensor de iluminación y se le asocia 5 luminarias(lámpara, fluorescente, etc)
        //   El sensor de iluminacion mide la luminosidad
        //   Cuando la luminosidad es inferior a 10000 unidades la luminaria se enciende
        //   y en caso contrario se apaga.

        //2. Se crea un sensor de presión y se le asocia 5 luminarias (lámpara, fluorescente, etc)
        //   El sensor de presion mide la presion que se ejerce en la alfombra cuando alguien camina
        //   Cuando la presion es superior a 10 unidades la luminaria se enciende
        //   y en caso contrario se apaga.
        Sensor sen1 = new SensorIluminacion(1, "sala");
        Sensor sen2 = new SensorPresion(2, "dormitorio");

        ILuminaria lum1 = new Luminaria(1);
        ILuminaria lum2 = new Luminaria(2);
        ILuminaria lum3 = new Luminaria(3);
        ILuminaria lum4 = new Luminaria(4);
        ILuminaria lum5 = new Luminaria(5);

        sen1.agregarLuminaria(lum1);
        sen1.agregarLuminaria(lum2);
        sen1.agregarLuminaria(lum3);
        sen1.agregarLuminaria(lum4);
        sen1.agregarLuminaria(lum5);
        
        sen1.setMedida(1000);

    }
}
