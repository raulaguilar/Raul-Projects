
package factorial;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
    Scanner lec=new Scanner(System.in);
    
    int c=2, n, f=1;
    
    System.out.print("Introduce un Número: ");
    n=lec.nextInt();
    
    while(c<=n){
    f=f*c;
    c++;
    }System.out.println("El Factorial de "+n+" es: "+f);
    
    
    
    
    }
    
}
