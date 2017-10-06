
package juegomercenario;
/*
import java.util.Scanner;
*/
public class JuegoMercenario {

public static void main(String[] args) {
    /*
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite el alto del mapa: ");
    int alto = scan.nextInt();
    System.out.println("Digite el ancho del mapa: ");
    int ancho = scan.nextInt();
    System.out.println("Digite el numero de curas: ");
    int cura = scan.nextInt();
    System.out.println("Digite el numero de armas: ");
    int arma = scan.nextInt();
*/
    Mapa mapa = new Mapa(10,10,10,10,10);
    mapa.mostrar(); 
}  
}
