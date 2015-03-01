
package mayormenor;
import java.util.*;

public class Mayormenor {

    
    public static void main(String[] args) {
       Scanner lec = new Scanner(System.in);
       int x, y, z;
       System.out.println("introduce 3 numeros");
       x = lec.nextInt();
       y= lec.nextInt();
       z= lec.nextInt();
       if(x>y&&x>z){
       System.out.println("El numero mayor es: "+x);
       
       }else if(y>x&&y>z){
       System.out.println("El numero mayor es: "+y);
       }else if(z>x&&z>y){
           System.out.println("El mayor es: "+z);
       }
       
    }
    
}
