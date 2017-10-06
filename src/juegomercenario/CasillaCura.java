
package juegomercenario;

public class CasillaCura extends Casilla{

    public CasillaCura() {
    }

    @Override
    public void muestre() {
       System.out.print("+");
    }

    @Override
    public boolean estaVacia() {
        return false;
    }
    
}
