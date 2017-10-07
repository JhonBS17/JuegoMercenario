
package juegomercenario;


public class CasillaArmaDist extends CasillaArma {

    public CasillaArmaDist(){
    }
    @Override
    public void muestre(){
        System.out.print("*");
    }
    @Override
    public boolean estaVacia(){
        return false;
    }
}
