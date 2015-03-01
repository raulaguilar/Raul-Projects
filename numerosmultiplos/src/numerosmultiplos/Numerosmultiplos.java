
package numerosmultiplos;
import java.util.*;

public class Numerosmultiplos {

   
    public static void main(String[] args) {
      Scanner lec=new Scanner(System.in);
      
      int n, c=1, s3=0, s5=0;
      
      System.out.print("Ingrese un número: ");
      n=lec.nextInt();
      
      if(c<=n){
      if(c%3==0){
       System.out.println(+c);
      s3=s3+c;  
      
      }c++;
       
      
      }c=1; 
      if(c<=n){
         if(n%5==0){
                System.out.println(+c);
                s5=s5+c;
          
          }
      
      }c++;
      System.out.println("La suma de los multiplos de 3 es: "+s3);
      System.out.println("La suma de los multiplos de 5 es: "+s5);
    }
    
}
