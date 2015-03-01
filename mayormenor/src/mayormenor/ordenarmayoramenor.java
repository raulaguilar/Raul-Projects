
package ordenarmayoramenor;
import java.util.*;
public class ordenarmayoramenor {

    
    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        
        int x, y, z;
        
        System.out.println("introduce 3 numeros: ");
        x=lec.nextInt();
        y=lec.nextInt();
        z=lec.nextInt();
        
    if(x>y&&x>z){
        System.out.println("el orden es de mayor a menor: "+x +y +z);}else
        if(y>z){
            System.out.println("el orden es de mayor a menor: "+x +z +y);
        }else
        
    
    if(y>x&&y>z){
        System.out.println("el orden es de mayor a menor: "+y +x +z);}else
        if(x>z){
        System.out.println("el orden es de mayor a menor: "+y +z +x);
        }else
        
    
    if(x>y){
    System.out.println("el orden es de mayor a menor: "+z +x +y);}else
    System.out.println("el orden es de mayor a menor: "+z +y +x);    
    }
    }
        
        
    
    

