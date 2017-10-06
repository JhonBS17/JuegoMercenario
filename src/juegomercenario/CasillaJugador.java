
package juegomercenario;

public class CasillaJugador extends Casilla {

    public CasillaJugador() {
    }

    @Override
    public void muestre() {
    }
    @Override
    public boolean estaVacia(){
        return false;
    }
    public void addJugador(int jugador){
        char s=(""+jugador).charAt(0);
        CasillaJugador casillaJug = new CasillaJugador();
        casillaJug.setValue(s);
        CasillaBorde(casillaJug);
    }

    private void setValue(char s) {
    }

}
