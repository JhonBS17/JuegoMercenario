
package juegomercenario;

import java.util.Scanner;

public class JuegoMercenario{

public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    //Se le pregunta al usuario los datos de su mapa.
    System.out.println("Digite el alto del mapa: ");
    int alto = scan.nextInt();
    System.out.println("Digite el ancho del mapa: ");
    int ancho = scan.nextInt();
    /* System.out.println("Digite el numero de jugadores: "); 
    int jugador = scan.nextInt(); */
    System.out.println("Digite el numero de curas: ");
    int cura = scan.nextInt();
    System.out.println("Digite el numero de armas: ");
    int arma = scan.nextInt();
    //Se crea un nuevo mapa de clase Mapa, que satisfaga todos los parámetros.
    Mapa mapa = new Mapa(alto,ancho,cura,arma);
    //Se imprime el mapa del usuario.
    mapa.mostrar(); 
}  
}
