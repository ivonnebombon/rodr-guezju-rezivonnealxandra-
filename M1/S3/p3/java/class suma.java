//PRACTICA MATRICES 
import java.io.*;
class TablasMultiplicacion
  {
   public static void main  (String[] args)
     {
       int A [][]= {{5,6,7},{3,4,2},{1,8,5}};
       int suma=0;
      for(int f=0; f<A.length; f++)
        {
         
         for(int c=0; c<A.length; c++)
          {
            System.out.print(A[f][c]+"");
            //if(A[f][c] >3)
             //nMtres++;
             suma=+A[f][c];
          }
         System.out.println(suma);
        }
     }
  }