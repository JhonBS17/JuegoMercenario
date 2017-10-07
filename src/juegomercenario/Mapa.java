
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
    public Mapa(int alto,int ancho,int jugador,int arma,int armadist,int armacuerpo,int cura,int refugio){
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
        int p=1;
        while(p<=jugador){
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if(casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaJugador(p);
                p++;
            }
        }    
        int l=0;
        while(l<armadist){
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if (casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaArmaDist();
                l++;
            }
        }
        int f=0;
        while(f<armacuerpo){
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if (casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaArmaCuerpo();
                f++;
            }
        }
        int x=0;
        //Se crea un ciclo while que funcione mientras la variable cura sea mayor a 0.
        while(x<cura){
            //Tanto la variable i como j tendran un valor aleatorio dejando una CasillaCura en cada espacio, excepto en los bordes.
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if(casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaCura();
                x++;
            }
        }
        
        int d=0;
        while (d<refugio){
            int i=rn.nextInt(alto-1);
            int j=rn.nextInt(ancho-1);
            if (casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaRefugio();
                d++;
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


        

