
package juegomercenario;

//Se crea la clase Casilla de tipo abstracta. 
public abstract class Casilla {
    //Se crean los métodos que seran utilizados en la clase Mapa y serán heredados por las demas Casillas.
    public abstract void muestre();
    public abstract boolean estaVacia();
}
    

