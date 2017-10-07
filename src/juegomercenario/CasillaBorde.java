
package juegomercenario;

//Se crea la clase CasillaBorde que se hereda de la clase Casilla, por ende adquiere todos sus métodos y atributos.
public class CasillaBorde extends Casilla {

    public CasillaBorde(){
    }

    @Override
    public void muestre() {
        //Este sera el caracter que caracterizará a los bordes.
        System.out.print("x");
    }
    
    @Override
    public boolean estaVacia() {
        //Un método que afirma que la CasillaBorde nunca estará vacia.
        return false;
    }
}
