
package numerosprimos;
import java.util.*;
public class Numerosprimos {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        
        int x, c=1, s=0;
        
        System.out.print("Ingrese un Número: ");
        x=lec.nextInt();
        
        while(c<=x){
        if(x%c==0){
         s++;   
          c++;  
        }
        c++;
        } 
        if(s==2){
        
               System.out.println("El número es Primo");
        } System.out.println("El número no es Primo");       
        
    
    }
}       
   
    

