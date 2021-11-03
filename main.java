

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;


public class Main
{
    
    static String s1, s2;
    static boolean comparando=false ;
   
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Escreva uma string: ");
        s1 = teclado.next();
        
        System.out.print("Escreva uma string: ");
        s2 = teclado.next();
        
       //comparando = s1.equalsIgnoreCase(s2);
       
       // System.out.println("A String  " + s1 +" e " + s2 + " são iguais: " + comparando);
       
       //comparandoMaiorComSensibilidade(s1, s2);
       //comprimento();
       concatenando();
    }
    
      public static void comparandoMaiorSemSensibilidade(String sp1, String sp2 ){
         System.out.println("================================================="); 
         System.out.println("Comparando Maior / Menor sem sensibilidade");
        System.out.println("================================================="); 
        
    if(0 < (sp1.compareToIgnoreCase(sp2))) {
        
        System.out.println("A string " +sp1 +" é maior  que " + sp2 );
    } else if(0 == (sp1.compareToIgnoreCase(sp2))){
         System.out.println("A string " +sp1 +" é igual  que " + sp2 );
    }else if(0 > (sp1.compareToIgnoreCase(sp2))){
        
         System.out.println("A string " +sp2 +" é maior  que " + sp1 );
    }
}

        public static void comparandoMaiorComSensibilidade(String sp1, String sp2 ){
        System.out.println("=================================================");     
        System.out.println("Comparando Maior / Menor com sensibilidade");
        System.out.println("=================================================");     
    if(0 < (sp1.compareTo(sp2))) {
        
        System.out.println("A string " +sp1 +" é maior  que " + sp2+ " valor: "+ sp1.compareTo(sp2));
    } else if(0 == (sp1.compareTo(sp2))){
         System.out.println("A string " +sp1 +" é igual  que " + sp2 + " valor: "+ sp1.compareTo(sp2));
    }else if(0 > (sp1.compareTo(sp2))){
        
         System.out.println("A string " +sp2 +" é maior  que " + sp1 + " valor: "+ sp1.compareTo(sp2));
    }
    
   
}
 
         public static void comprimento(){
         System.out.println("================");     
        System.out.println("comprimento");
        System.out.println("=================");     
        System.out.println("A string " +s1 +" tem o comprimento " + s1.length());
         System.out.println("A string " +s2 +" tem o comprimento " + s2.length());
    }
    
    public static void concatenando (){
        String sp1 ;
        sp1 = s1.concat(" ");
        sp1= sp1.concat(s2);
        
        System.out.println("A string concatenada é " + sp1 );
    }
    
    
}
