
package juegomercenario;

public class CasillaRefugio extends Casilla {

    public CasillaRefugio() {
    }

    @Override
    public void muestre() {
        System.out.print("#");
    }

    @Override
    public boolean estaVacia(){
        return false;
    }
}
