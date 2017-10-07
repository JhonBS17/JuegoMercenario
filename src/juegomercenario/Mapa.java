
package juegomercenario;
import java.util.Random;

public class Mapa {
    //Se crea una matriz de tipo Casilla, la cual se llenará con los parámetros de la clase Mapa.
    Casilla casilla[][];
    int alto=0;
    int ancho=0;
    //Se crea una variable de tipo Random para añadir los caracteres en desorden en el mapa.
    Random rn = new Random();
    //Se crea un constructor para llenar la variable casilla[][] con los datos introducidos por el usuario.
    public Mapa(int alto,int ancho,int cura,int arma){
    this.alto = alto;
    this.ancho = ancho;
    casilla = new Casilla[alto][ancho];
    //Por medio de un ciclo for se imprime el mapa vacio.
    for (int i=0;i<alto;i++){
        for (int j=0;j<ancho;j++){
            if (i==0||j==0||i==alto-1||j==ancho-1){
                //Si la variable i y j se situan en la primera y última fila ó en la primera y última columna, se imprime una CasillaBorde.
                casilla[i][j]= new CasillaBorde();
            }else{
                //De lo contrario, se imprime una casilla vacía.
                casilla[i][j]= new CasillaVacia();
            }
        }
    }
    /*
        int p=0;
        //Se crea un ciclo while que funcione mientras la variable cura sea mayor a 0.
        while(p<jugador){
            //Tanto la variable i como j tendra un valor aleatorio dejando una CasillaJugador en cada espacio, excepto en los bordes.
            int i=rn.nextInt(this.alto-1);
            int j=rn.nextInt(this.ancho-1);
            if(casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaJugador();
                p++;
            }
        }
     */   
        int x=0;
        //Se crea un ciclo while que funcione mientras la variable cura sea mayor a 0.
        while(x<cura){
            //Tanto la variable i como j tendra un valor aleatorio dejando una CasillaCura en cada espacio, excepto en los bordes.
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if(casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaCura();
                x++;
            }
        }
        int y=0;
        while(y<arma){
            //Tanto la variable i como j tendra un valor aleatorio dejando una CasillaArma en cada espacio, excepto en los bordes.
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if (casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaArma();
                y++;
            }
        }
    }
    //Se crea un metodo mostrar() que imprimirá el mapa con todos los parámetros introducidos por el usuario.
    void mostrar() {
        for (int i=0; i<alto; i++){
            for (int j=0; j<ancho; j++){
                casilla[i][j].muestre();
    }
     //Se crea un salto de linea.
     System.out.println();    
    }
}
}


        

