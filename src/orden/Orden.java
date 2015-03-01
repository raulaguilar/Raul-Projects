package orden;
import java.util.*;
public class Orden {

    
    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        
        int x, y, z;
        
        System.out.println("introduce 3 numeros: ");
        x=lec.nextInt();
        y=lec.nextInt();
        z=lec.nextInt();
        
    if(x>y&&x>z){
        System.out.println("el orden es de mayor a menor: "+x +y +z);}else if(y>z){
        }else
        System.out.println("el orden es de mayor a menor: "+x +z +y);
    
     if(y>x&&y>z){
     System.out.println("el orden es de mayor a menor: "+y +x +z);  
     }else if(x>z){
        }else
        System.out.println("el orden es de mayor a menor: "+y +z +x);
     
    if(x>y){
    System.out.println("el orden es de mayor a menor: "+z +x +y);}else
    System.out.println("el orden es de mayor a menor: "+z +y +x);    
    }
    }