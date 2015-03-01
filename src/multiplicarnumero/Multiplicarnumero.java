
package multiplicarnumero;
import java.util.*;

public class Multiplicarnumero {

    
    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        int n, i=0;
        System.out.print("Introduce un número: ");
        n = lec.nextInt();
        System.out.println("Tabla del " + n);
        while(i<=10){
             System.out.println(n + " * " + i + " = " + n*i);
        i++;
        }
    }
    
}
