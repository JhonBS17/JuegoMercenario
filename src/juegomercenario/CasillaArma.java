
package juegomercenario;

public class CasillaArma extends Casilla {

    public CasillaArma() {
    }
    
    @Override
    public void muestre() {
        System.out.print("*");
    }
    @Override
    public boolean estaVacia() {
        return false;
    } 
}
