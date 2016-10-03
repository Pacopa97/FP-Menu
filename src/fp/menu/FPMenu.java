
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
        
        menu();
        calculaAreas();
    }
    
    public static int menu(){
        int opcion;
        do{
        Scanner entrada = new Scanner(System.in);
        System.out.println("---- Calculo de areas ----");
        System.out.println("        Menu        ");
        System.out.println("Inroduce la opcion deseada:");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        opcion = entrada.nextInt();
        
    }while(opcion<0 || opcion>=4);
        return opcion;
        
    }
    public static float calculaAreas(int op){
        float area;
        switch(op){
            case 1;
                area = areaCuadrado();
                break;
            case 2;
                area = areaCirculo();
                break;
            case 3;
                area = areaTriangulo();
                break;
            default;
                mensajeSalida();
               
        }
        return area;
    }
    
}
