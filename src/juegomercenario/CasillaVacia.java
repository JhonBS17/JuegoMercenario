
package juegomercenario;

//Se crea la clase CasillaVacia que se hereda de la clase Casilla, por ende adquiere todos sus métodos y atributos.
public class CasillaVacia extends Casilla {

    @Override
    public void muestre() {
        //Este sera el caracter que caracterizará a las casilla vacías.
        System.out.print(" ");
    }

    @Override
    public boolean estaVacia() {
        //Un método que afirma que la CasillaVacia siempre estará vacía.
        return true;
    } 
}
    

