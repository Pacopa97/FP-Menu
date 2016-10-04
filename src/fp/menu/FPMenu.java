
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
    public static float calculaArea(int op){
        float area = 0;
        switch(op){
            case 1:
               
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
               
        }
        return area;
    }
    public static float solicitarDatos(String tipo){
        float dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el: " + tipo);
        dato = teclado.nextFloat();
        return dato;
    }
    
    public static float areaCuadrado(){
        float l,area;
        l = solicitarDatos("lado");
        area = l*l;
        return area;
    }
     public static float areaCirculo(){
        float r,area;
        final double pi;
        pi = 3.1416;
        r = solicitarDatos("radio");
        area = (float) (pi*Math.pow(r, 2));
        return area;
     }
     
     public static float areaTriangulo(){
         float a,b,area;
         a = solicitarDatos("altura");
         b = solicitarDatos("base");
         area = a*b/2;
         return area;
     }
     
     public static void mensajeSalida(){
         System.out.println("Gracias por participar");
     }
}
