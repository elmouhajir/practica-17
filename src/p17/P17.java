
package p17;

import java.text.DecimalFormat;
import java.util.Scanner;


public class P17 {
static Scanner keyboard=new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat ("000.000");
    static DecimalFormat df2 = new DecimalFormat ("000");
    public static void main(String[] args) {
        
         int option= -1;
         while(option != 0){
        userMenu();
       option=keyboard.nextInt();
      
       switch(option){//inicio switch
           case 1: 
                System.out.print("Euros : ");
        int euro = keyboard.nextInt();       
       float eurosf = function1(euro);
        System.out.println("Dolares en float : "+df.format(eurosf));
           break;
           case 2:
        System.out.print("Euros : ");
        int euro2 = keyboard.nextInt();       
       double eurosd = function2(euro2);
        System.out.println("Dolares en double : "+df.format(eurosd));
           break;
           case 3:
         System.out.print("Euros : ");
        int euro3 = keyboard.nextInt();       
       String euross = function3(euro3);
        System.out.println("Dolares en String : "+(euross));
           break;
           case 4: 
         System.out.print("Euros : ");
        String euro4 = keyboard.next();       
       int eurosi = function4(euro4);
        System.out.println("Dolares en int : "+(eurosi));
           break;
           case 5:       
        System.out.print("Euros : "); 
        float euro5 = keyboard.nextFloat();       
       int eurosi2 = function5(euro5);
        System.out.println("Dolares en int : "+(eurosi2));
           break;
           case 6:      
        System.out.print("Euros : ");
       float euro6 = keyboard.nextFloat();       
       String euross2 = function6(euro6);
       System.out.println("Dolares en String : "+(euross2));
           break;
           case 7 :               
       System.out.print("Letter : ");
       char letter = keyboard.next().charAt(0);         
       int eurosi3 = function7(letter);
       byte eurosb = function72(letter);
       System.out.println("Letter converted to int : "+(eurosi3));
       System.out.println("Letter converted to binary : "+eurosb);
           break;
           case 8: 
       System.out.print("Name : ");
       String name = keyboard.next();         
      String namebinary = function8(name);
      System.out.println("Name converte to binary: "+(namebinary));        
           break;
           case 9: 
        System.out.print("Number(0-255) : ");
       int num = keyboard.nextInt();         
       String eurosc3 = function9(num);
       System.out.println("Number to CH: "+(eurosc3));       
           break;
           case 10:
       System.out.print("ASCII: ");
      for(int i=32;i<64;i++){
          String numberhexad =function10(i);
          System.out.println(i+"-"+(char)(i)+"-"+numberhexad+"\t");
          numberhexad = function10(i+32);
          System.out.println((i+34)+"-"+(char)(i+64)+"-"+numberhexad+"\t");
          numberhexad =function10(i+64);
          System.out.println((i+64)+"-"+(char)(i+32)+"-"+numberhexad+"\t");
          System.out.println("");
      }
           break;
           case 0: p0();
           break;
           default: System.out.println("Opcion no valida"); }
       }
          
    }
     private static void userMenu(){
        System.out.println("");
        System.out.println("Opción 0-(SALIR)");
        System.out.println("Opcion 1-(int-float)");
        System.out.println("Opción 2-(int-Double)");
        System.out.println("Opción 3-(int-String)");
        System.out.println("Opción 4-(String-int)");
        System.out.println("Opción 5-(float-int)");
        System.out.println("Opción 6-(float-String)");
        System.out.println("Opción 7-(char)");
        System.out.println("Opción 8-(char-binary)");
        System.out.println("Opción 9-(int-char)");
        System.out.println("Opción 10-(");
        
        System.out.print("\nOpcion? : ");  
    }
     private static void p0(){
         
     }
     
    private static float function1 (int iEuro){
        
        float result= (float) iEuro*1.1f;
     return result;   
    }
    private static double function2 (int iEuro){
        double result= (double) iEuro*1.1;
     return result;   
    }
    private static String function3 (int iEuro){
        double dollar=iEuro*1.1;
        String result= String.valueOf(dollar);
     return result;   
    }
    private static int function4 (String iEuro){
        int result=(int) (Integer.parseInt(iEuro)*1.1);
     return result;   
    }
    private static int function5 (float iEuro){
        float dollar=iEuro*1.1f;
        int result= (int)(dollar);
     return result;   
    }
    private static String function6 (float iEuro){
        float dollar=iEuro*1.1f;
        String result= String.valueOf(dollar);
     return result;   
    }
    private static int function7 (char letter){
      int eurosint=(int) letter;
      return eurosint;
    }
     private static byte function72 (char iletter){
      byte eurosb =(byte) iletter;
      return eurosb;
    }
    private static String function8(String iname){
     String result="";
     char ch;
     for(int i =0;i<iname.length(); i++){
     ch= iname.charAt(i);
     result += Integer.toBinaryString(ch)+" ";
     }
      return result;
    }
    private static String function9 (int iEuro){
        String result= new Character((char)iEuro).toString();
        return result;
    }
    private static String function10(int numberInt){
        String numberHex=Integer.toHexString(numberInt);
        return numberHex;
    }
}
