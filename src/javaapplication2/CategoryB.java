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
public class CategoryB {
    
    public static void task1(){
      int openBracket=0, closeBrackets=0;
    String str = "([ ] [{ }] ) [ ({}) ]({[]}) {[ ()] } ";
    String b = str.replaceAll(" ", "");
              for(int i = 0; i < str.length(); i++){
         switch (str.charAt(i)) {
             case '(':
                 openBracket++;
                 break;
             case '[':
                 openBracket++;
                 break;
             case '{':
                 openBracket++;
                 break;
             case ')':
                 closeBrackets++;
                 break;
             case '}':
                 closeBrackets++;
                 break;
             case ']':
                 closeBrackets++;
                 break;
             default:
                 break;
         }
              }

              if(openBracket == closeBrackets){
                  System.out.println("SUCCESS");
              }

              else {
                  System.out.println("FAIL") ;
              }
            
    }
}
