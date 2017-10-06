
package juegomercenario;

public class CasillaBorde extends Casilla {

    public CasillaBorde(Casilla l) {
    }

    @Override
    public void muestre() {
        System.out.print("x");
    }
    
    @Override
    public boolean estaVacia() {
        return false;
    }
    
}
