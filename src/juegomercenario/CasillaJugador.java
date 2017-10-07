
package juegomercenario;

public class CasillaJugador extends Casilla { 
    int contador=0;
    public  CasillaJugador(int jugador) {
    contador=jugador;
    }     
    @Override
    public void muestre() {
        int g = contador+2;
        if(g%2==0){
        System.out.print("W");
        }else
        System.out.print(contador);
        }
    @Override
    public boolean estaVacia(){
        return false;
    }
}
