import java.io.*;
classTablasMultiplicación
 {
  public static void main(String[] args)
    {
     int A[][] = {{5,6,7,},{0,5,7},{4,3,2,}};
     System.out.println("Valores introducidos");
     for (int f = 0; f < A.length; f++)
        { 
         for (int c = 0; c < A[f].length; c++)
           {
            System.out.print(A[f][c]+ " ");
           }
          System.out.println();
         }
      }
  }