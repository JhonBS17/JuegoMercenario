
package juegomercenario;

//Se crea la clase CasillaArma que se hereda de la clase Casilla, por ende adquiere todos sus métodos y atributos.
public class CasillaArma extends Casilla {

    public CasillaArma() {
    }
    
    @Override
    public void muestre() {
        //Este sera el caracter que caracterizará a las armas.
        System.out.print("*");
    }
    @Override
    public boolean estaVacia() {
        //Un método que afirma que la CasillaArma nunca estará vacia.
        return false;
    } 
}
