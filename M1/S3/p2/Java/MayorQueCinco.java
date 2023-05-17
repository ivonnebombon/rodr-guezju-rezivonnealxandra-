

import java.io.*;
class MayorQueCinco
  {
   public static void main(String[] args)
   { 
    int[] listaNumeros = {37,5,10,3};
    int contar=0;
    for (int i=0; i< listaNumeros.length; i++)
    { 
     if(listaNumeros[i]>5)
      {
       contar++;
      }
    }
    System.out.println(+contar);
 
   }
  }