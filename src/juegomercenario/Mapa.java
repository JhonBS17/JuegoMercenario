
package juegomercenario;
import java.util.Random;

class Mapa {
    Casilla casilla[][];
    int alto=0;
    int ancho=0;
    Random rn = new Random();
    public Mapa(int alto,int ancho,int jugador,int cura,int arma){
    this.alto = alto+2;
    this.ancho = ancho+2;
    casilla = new Casilla[this.alto][this.ancho];
    for (int i=0;i<this.alto;i++){
        for (int j=0;j<this.ancho;j++){
            if (i==0||j==0||i==this.alto-1||j==this.ancho-1){
                casilla[i][j]= new CasillaBorde();
            }else{
                casilla[i][j]= new CasillaVacia();
            }
        }
    }
        int w=9;
        while(jugador<=w){
            int i=rn.nextInt(this.alto-1);
            int j=rn.nextInt(this.ancho-1);
            
        }
    
        
        
        
        
        
        int x=0;
        while(x<cura){
            int i=rn.nextInt(this.alto-1);
            int j=rn.nextInt(this.ancho-1);
            if(casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaCura();
                x++;
            }
        }
        int y=0;
        while(y<arma){
            int i=rn.nextInt(this.alto-1);
            int j=rn.nextInt(this.ancho-1);
            if (casilla[i][j].estaVacia()){
                casilla[i][j]= new CasillaArma();
                y++;
            }
        }
    }
    void mostrar() {
        for (int i=0; i<alto; i++){
            for (int j=0; j<ancho; j++){
                casilla[i][j].muestre();
            
    }
     System.out.println();    
    }
}
}


        

