
package fp.menu;
import java.util.*;

/**
 *
 * @author franc
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int menu(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---- Calculo de areas ----");
        System.out.println("Menu");
        System.out.println("Inroduce la opcion deseada");
        System.out.println("1.- Area de cuadrados");
        System.out.println("2.- Area de circulos");
        System.out.println("3.- Area de triangulos");
        opcion = entrada.nextInt();
        return opcion;
        
    }
}
