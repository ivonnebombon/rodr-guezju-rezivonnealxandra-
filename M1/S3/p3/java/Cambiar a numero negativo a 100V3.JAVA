//PRACTICA Vectores
import java.io.*;
class CambiarNegativoa100
//Versión 3
  {
   public static void main  (String[] args)
     {
       int numeros[][]= {-2,3,-4}
       for(int i =0; i<3; i++)
        {
         if (numeros [i]<0)
          {
            numeros [i]=100;
            System.out.print(numeros [i]);
          }
       }
     }
  }