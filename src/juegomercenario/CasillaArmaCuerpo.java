
package juegomercenario;

public class CasillaArmaCuerpo extends CasillaArma {

    public CasillaArmaCuerpo() {
    }
    @Override
    public void muestre(){
        System.out.print(".");
    }
    @Override
    public boolean estaVacia(){
        return false;
    }
}
