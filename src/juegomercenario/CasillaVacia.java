
package juegomercenario;

public class CasillaVacia extends Casilla {

    @Override
    public void muestre() {
        System.out.print(" ");
    }

    @Override
    public boolean estaVacia() {
        return true;
    } 
}
    

