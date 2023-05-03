//PRACTICA MATRICES 
import java.io.*;
class TablasMultiplicacion
  {
   public static void main  (String[] args)
     {
       int A [][]= {{5,6,7},{3,4,2},{1,8,5}};
       System.out.println("valores introducidos:");
       for(int f=0; f<A.length; f++)
        {
         for(int c=0; c<A.length; c++)
          {
            System.out.print(A[f][c]+"");
          }
         System.out.println();
        }
     }
  }