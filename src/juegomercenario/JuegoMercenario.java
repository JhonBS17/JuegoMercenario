
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
    System.out.println("Digite el número de jugadores: ");
    int jugador = scan.nextInt(); 
    System.out.println("Digite el número de armas: ");
    int arma = scan.nextInt();
    System.out.println("Digite el número de armas a distancia: ");
    int armadist = scan.nextInt();
    System.out.println("Digite el número de armas cuerpo a cuerpo: ");
    int armacuerpo = scan.nextInt();
    System.out.println("Digite el número de curas: ");
    int cura = scan.nextInt();
    System.out.println("Digite el número de refugios: ");
    int refugio = scan.nextInt();
    //Se crea un nuevo mapa de clase Mapa, que satisfaga todos los parámetros.
    Mapa mapa = new Mapa(alto,ancho,jugador,arma,armadist,armacuerpo,cura,refugio);
    //Se imprime el mapa del usuario.
    mapa.mostrar(); 
} 
}

