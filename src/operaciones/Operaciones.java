
package operaciones;
import java.util.*;
public class Operaciones {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        int n1, n2, n3, n4, a=1, b=2, c=3, d=4, e=5, f;
        
        
        System.out.print("Ingrese un número: ");
        n1=lec.nextInt();
        System.out.print("Ingrese otro número: ");
        n2=lec.nextInt();
        System.out.println("");
        System.out.println("Que desea hacer: ");
        System.out.println("");
        System.out.println("1.- Multiplicar");
        System.out.println("2.- Sumar");
        System.out.println("3.- Restar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Porcentaje");
        System.out.println("");
        System.out.println("Ingrese un numero del 1 al 5");
        f=lec.nextInt();
        n3= n1-n2;
        n4= n1+n2;
        if(f==1){
        System.out.println(n1+" * "+n2+" = "+n1*n2);
        
        }else if(f==2){
        System.out.println(n1+" + "+n2+" = "+n4);
        
        }else if(f==3){
        System.out.println(n1+" - "+n2+" = "+n3);
        
        }else if(f==4){
        System.out.println(n1+" / "+n2+" = "+n1/n2);
        
        }else if(f==5){
        System.out.println(n1+" % "+n2+" = "+n1%n2);
        
        }
        
        
        
        
        
        
            }

}
