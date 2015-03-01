package pipati;
import java.util.Scanner;
import java.math.*;
public class Pipati {

    
    public static void main(String[] args) {
        
        int op_ju, op_pc;
        Scanner Leer=new Scanner(System.in);
       do{ 
        System.out.println("Elige una Opción: ");
        System.out.println("1.- Piedra ");
        System.out.println("2.- Papel ");
        System.out.println("3.- Tijera ");
        
        op_ju=Leer.nextInt();
        op_pc= (int) (Math.random()*3)+1;
        System.out.println("El usuario a escogido: "+op_ju+" la pc ha escogido: " +op_pc);
        
        if(op_ju==1){
         if(op_pc==1)   
            System.out.println("EMPATE!!");
         if(op_pc==2)
            System.out.println("Jugador Eligio: PIEDRA | Pc Gana con: PAPEL");
        if(op_pc==3)
                System.out.println("Jugador Eligio: PIEDRA | Pc Pierde con: TIJERA");
           }else 
            
              if(op_ju==2){
         if(op_pc==2)   
            System.out.println("EMPATE!!" );
            if(op_pc==2)
            System.out.println("jugador Eligio: PAPEL | Pc Pierde con: PIEDRA");
            if(op_pc==3)
                System.out.println("Jugador Eligio: PAPEL | Pc Gana con: TIJERA");
             }else
                  
             if(op_ju==3){
         if(op_pc==1)   
            System.out.println("Jugador Eligio: TIJERA | Pc Gana con: PIEDRA");
         if(op_pc==2)
            System.out.println("Jugador Eligio: TIJERA | Pc Pierde con: PAPEL");
         if(op_pc==3)
                System.out.println("EMPATE!!");
         }                    
                
             
                 } while(op_ju==op_pc);
        
    }}
                
