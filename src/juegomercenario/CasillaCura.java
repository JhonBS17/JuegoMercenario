
package juegomercenario;

//Se crea la clase CasillaCura que se hereda de la clase Casilla, por ende adquiere todos sus métodos y atributos.
public class CasillaCura extends Casilla{

    public CasillaCura() {
    }

    @Override
    public void muestre() {
       //Este sera el caracter que caracterizará a las curas.
        System.out.print("+");
    }

    @Override
    public boolean estaVacia() {
        //Un método que afirma que la CasillaCura nunca estará vacia.
        return false;
    }
    
}
