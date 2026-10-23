//identificador de palindromos, atividade 1.


import java.util.*;

public class Main {
    public static void main(String[] args) {
     
     Scanner s = new Scanner (System.in);
     boolean palindromo = true;
     String texto = s.nextLine();
     
     for(int i = 0, j = texto.length() - 1; i < j; i++, j--) {
      
      char a = texto.charAt(i);
      
      char b = texto.charAt(j);
      
      if(a != b) {
        palindromo = false;
        System.out.print("n é um palindromo");
        break;
      }

     }
     
     if(palindromo) {
      System.out.print("é um palindromo");
     
     }
     }

    }