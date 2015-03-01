
package numerosparesimpares;
import java.util.*;

public class Numerosparesimpares {

    public static void main(String[] args) {
      Scanner lec=new Scanner(System.in);
        int c=1, a=0, b=0;
    while(c<=100){
    if(c%2==0){
    
    a++;
    }b=b+c;
    c++;
    }
    System.out.println("La suma de los números pares es: "+b);
    System.out.println("");
    System.out.println("Los números pares son: "+a);
    
    }
    
}
