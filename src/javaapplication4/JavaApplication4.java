package javaapplication4;
import java.util.*;
public class JavaApplication4{

    public static void main(String[] args) {
    Scanner lec= new Scanner(System.in);
    String al1="Juan Perez Lopez" , al2="Alberto Ochoa Aguilera";
   int  m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, p1, p2;
   
   System.out.println("Primer alumno: "+al1);  
   System.out.print("Calificacion de Materia 1: ");
   m1=lec.nextInt();
   System.out.print("Calificacion de Materia 2: ");
   m2=lec.nextInt();
   System.out.print("Calificacion de Materia 3: ");
   m3=lec.nextInt();
   System.out.print("Calificacion de Materia 4: ");
   m4=lec.nextInt();
   System.out.print("Calificacion de Materia 5: ");
   m5=lec.nextInt();
   p1=(m1+m2+m3+m4+m5)/5;
   System.out.println("El promedio de "+al1+" es: "+p1);
      System.out.println("");
         System.out.println("");
   System.out.println("Segundo Alumno: "+al2);
   System.out.print("Calificacion de Materia 1: ");
   m6=lec.nextInt();
   System.out.print("Calificacion de Materia 2: ");
   m7=lec.nextInt();
   System.out.print("Calificacion de Materia 3: ");
   m8=lec.nextInt();
   System.out.print("Calificacion de Materia 4: ");
   m9=lec.nextInt();
   System.out.print("Calificacion de Materia 5: ");
   m10=lec.nextInt();
   p2=(m6+m7+m8+m9+m10)/5;
   System.out.println("El promedio de "+al2+ " es: "+p2);
   System.out.println("");
         System.out.println("");
   if(p1>p2){
       System.out.println("El promedio de "+al1+" que es un: "+p1+" es mas Alto que el de "+al2+" que es un: "+p2);
   }else 
       System.out.println("El promedio de "+al2+" que es un: "+p2+" es mas Alto que el de "+al1+" que es un: "+p1);
   }
   
   
    }
    