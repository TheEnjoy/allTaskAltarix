/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ппп
 */
public class CategoryA {
    
  
    public static void task1(int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD ){
                boolean result;
              //  result = mainMathMetod(1,1,0,-1,-1,-1,0,0);
                  result = mainMathMetodForTask1(xA, yA, xB, yB, xC, yC, xD, yD);
                    if(result)
                        System.out.println("IN");
                    else
                        System.out.println("OUT");   
           }  
    public static boolean mainMathMetodForTask1(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){
        int s = squareForTask1(x, y, x2, y2, x3, y3) + squareForTask1(x1, y1, x, y, x3, y3)+squareForTask1(x1, y1, x2, y2, x, y);
        return squareForTask1(x1, y1, x2, y2, x3, y3) == s;
         
      }
    public static int squareForTask1(int x1, int y1, int x2, int y2, int x3, int y3){
        int result = Math.abs(x2*y3-x3*y2-x1*y3+x3*y1+x1*y2-x2*y1);
          return result;
      }
    
    public static void task2(){
        int[][] squareMatrix = {{ 1, 2, 3 }, 
                                { 9, 1, 2 },
                                { 1, 1, 1 }};

         int sumMainDiagonal = 0;
          for(int i = 0; i < squareMatrix.length; i++){
             for(int j = 0; j < squareMatrix[i].length; j++){
                if(i == j)
                  sumMainDiagonal += squareMatrix[i][j];   
                    }
                }

                int sumСollateralDiagonal = 0;
                 for(int i = 0; i < squareMatrix.length; i++){
                    for(int j = 0; j < squareMatrix[i].length; j++){
                        if(i + j == squareMatrix[i].length - 1)
                            sumСollateralDiagonal += squareMatrix[i][j];   
                    }
                }


               int result = Math.abs(sumMainDiagonal - sumСollateralDiagonal);
                    System.out.println(result);
}
    
    public static void task3() {
    int  n =5;
    for(int i=0; i<=n; i++)
    {
        for(int j=n-i; j>0; j--)
        {
            System.out.print(" ");
        }
        for(int z=0; z<i; z++)
        {
            System.out.print("#");
        }
        System.out.println();
    }  
    }

    public static void task4(){
    int arrayNumbers[]={1,2,3,4,5,6,7,8};   
    int sum=0;
    for (int i = 0; i <arrayNumbers.length; i++) {
        for (int j = i+1; j < arrayNumbers.length; j++) {  
           if(((arrayNumbers[i]+arrayNumbers[j])%5==0))
             sum++;
       
        }
    }
   System.out.println(sum);
    }
    
       
 public static void task5(){
    int[][] matrixB = {
                        {2,3,4,5,6,7,8,9,0},
                        {1,1,2,1,2,1,2,3,1},
                        {1,2,3,1,1,2,1,1,0},
                        {7,7,8,1,2,3,4,6,8}
    };
     int[][] matrixA = {
     {1,1,2,1},
     {1,2,3,4}
     };
for (int i = 0; i <= matrixB.length - matrixA.length ; i++){
     for (int j = 0; j <=  matrixB[0].length - matrixA[0].length; j++) {
         boolean success = true;
 
         for (int k = 0; k <  matrixA.length; k++) {
             for (int l = 0; l < matrixA[0].length; l++) {
                 if (matrixB[i + k][j + l] != matrixA[k][l]) {   
                     success = false;
                     break;
                 }  
              }
              if (!success) break;
          }
          if (success) {
               System.out.println("("+i+", "+j+")");
          }
      }
}
}
 
}

