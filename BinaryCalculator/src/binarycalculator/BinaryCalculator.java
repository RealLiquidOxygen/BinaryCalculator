/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*AUTHOR : AYODELE OWOYELE
PROGRAM FUNCTION: PERFORM BASIC BINARY OPERATIONS. ADDITION, SUBTRACTION, BINARY TO DECIMAL CONVERSION
DATE: 11/8/2015
*/
package binarycalculator;

//to accept input from user
import java.util.Scanner;

/**
 *
 * @author owoye001
 */




public class BinaryCalculator {

     
 
    //initialization block
   public static Scanner input = new Scanner (System.in); //for collecting data from the user
           public static int firsts; //frist integer number
           public static int seconds; //second integer number
           public static String dispfirsts; //first string of first
           public static String dispseconds; //second string of first
           public static int Userchoice; //this is the user choice from the console
           public static boolean ProgramCont=true;
           public static String keeper; //store data from user
           
           
    //this method draw out the header and the function of the program
    public static void drawConsole ()
    {
        System.out.println (); //for formating purposes
        
        System.out.println ("   ******************************************************************");
        System.out.println ("                 BINARY CALCULATOR/CONVERTER INTERFACE");
        System.out.println ("   ******************************************************************"); 
        
        System.out.println();
        
        System.out.println ("   1. Add two binary numbers");
        System.out.println ("   2. Subtract two binary numbers");
        System.out.println ("   3. Convert binary numbers to decimal value");
        System.out.println ("   4. About Author");
        System.out.println ("   5. Exit");
        
        System.out.println();
    }
    
    //this method prints the asker for the console
    public static void asker()
    {
        /*System.out.print ("   Enter number for the required Operation: ");
        Userchoice = input.nextInt(); //saves the users choice
        sp();*/
        //error checking
        boolean r=true;
        do {
            System.out.print ("   Enter number for the required operation: ");
                  String UserString =input.next();
                                      try {
                                         
                                           Userchoice = Integer.parseInt(UserString); //saves the users choice
                                          
                                          r=false;
                                      }
                                     catch (Exception e)
                                        {
                                             System.out.println("   Info: Invalid input, enter either 1 or 2 or 3 or 4");
                                            
                                       }
               sp();                       
        }while (r==true);
    }
    
    //method prints a line space between outputs
     public static void sp ()
    {
        System.out.println ("   ******************************************************************");
        System.out.println ();
    }
     
    //method add two binary numbers together
      public static String AddBinary (int first, int second)
    {
       
       return Integer.toBinaryString(first+second);
    }
      
    //method subtracts two binary numbers
    public static String SubBinary (int first, int second)
    {
       return Integer.toBinaryString(first-second);
    }
    
    //method converts binary numbers to decimal numbers using the parseInt function in Java
    public static int BinToDec ()
    {
        return firsts;
    }
    //asks user for input for first and second number
    public static void ask (String t)
    {
        System.out.print ("   Please enter the "+t+" binary number without spacing: ");
        keeper = input.next();
    }
    //asks user for input for third option on the console
     public static void asks (String t)
    {
        System.out.print ("   Please enter the binary number for conversion without spacing: ");
    }
    
    //method collects information from the user
      public static void thecollector ()
      {
          boolean y=true;
       /*ask("first");
       dispfirsts = keeper;
       firsts = Integer.parseInt(keeper, 2);
       sp();
       ask ("second");
       dispseconds = keeper;
       seconds = Integer.parseInt(keeper, 2);
       sp(); */
       
          //error checking
       do {
                                      try {
                                          ask("first");
                                          dispfirsts = keeper;
                                          firsts = Integer.parseInt(keeper, 2);
                                          sp();
                                          ask ("second");
                                          dispseconds = keeper;
                                          seconds = Integer.parseInt(keeper, 2);
                                          sp();
                                          y=false;
                                      }
                                     catch (Exception e) //if it catches an error, will print this.
                                        {
                                             System.out.println("   Info: Invalid input, please enter binary numbers only");
                                             sp();
                                       }
                                    }
        while (y==true);
       
       
      }
      //collects data for the third console option
       public static void thecollector3 ()
      {
       /*asks(""); 
       firsts = Integer.parseInt(input.next(), 2);
       sp(); */
          
       boolean j=true;
       //error checking
        do {
                                      try {
                                          asks(""); 
                                          firsts = Integer.parseInt(input.next(), 2);
                                          sp();
                                          j=false;
                                      }
                                     catch (Exception e) //if it catches an error, will print this.
                                        {
                                             System.out.println("   Info: Invalid input, please enter binary numbers only");
                                             sp();
                                       }
                                    }
        while (j==true);
       
      }
       
      //this method actually controls the loop that runs the program.
      public static void programrun()
      {
        
          do //to keep the program running.
          {
              drawConsole (); //draw the console of functions.
              asker(); //ask user about their choice and save the choice made
              switch (Userchoice) // check for which choice the user picks
              {
                  case 1: //adds binary 
                      thecollector(); //collects information for first binary number and second binary number
                      makeitpretty("+"); //formats the display
                      System.out.println("    " + AddBinary(firsts,seconds)); //prints the result
                      sp1(); //draws the underline under the result
                      break;
                  case 2: //subtract binary
                      thecollector(); //collects information for first binary number and second binary number
                      makeitpretty("-"); //formats the display
                      System.out.println("    " + SubBinary(firsts,seconds)); //prints the result
                      sp1(); // draws the underline under the result
                      break;
                  case 3: //binary to decimal conversion
                      thecollector3();
                      System.out.println("   Result: " + BinToDec());
                      sp();
                      break;
                   case 4: //about author portion
                      System.out.println ("   Name: Ayodele Owoyele (Charlie)");
                      System.out.println ("   Thanks for using the program!");
                      System.out.println(); //for formating purposes only
                      sp();
                      break;
                  case 5: //exitting the application.
                      System.out.print ("   Do you want to exit the program (Y/N): ");
                      String YN = input.next();
                      
                      //tests if user said yes or no
                      
                      if (YN.equalsIgnoreCase("Y"))
                      {
                          ProgramCont = false;
                      }
                      else if (YN.equalsIgnoreCase("N"))
                      {
                          ProgramCont = true;
                      }
                      else
                      {
                          System.out.println ("   Info: Invalid Input");
                      }
                       break;
                  default: //check for bad input from the console
                      System.out.println ("Info: Invalid Input!");
                      break;
              }
          } while (ProgramCont == true);
          
          
          printGoodbye();

      }
      
      //this method prints goodbye message.
    public static void printGoodbye()
    {
        System.out.println ();
          
          System.out.println ("   Info: Goodbye!"); //Prints GoodBye Message
          
          sp();
    }
 
    //for formating the diaplay
    public static void makeitpretty(String op) {
        
        int starprinter = dispfirsts.length()+5;

                System.out.println("    " + dispfirsts);
                System.out.println("   "+op+dispseconds);
                System.out.print ("    ");
                while (starprinter!=0)
                {
                System.out.print ("*");
                starprinter=starprinter-1;
                }
                System.out.println();
                
    }
    
    //prints the line under the calculation 
    public static void sp1()
    {
        int starprinter = dispfirsts.length()+5;
        System.out.print ("    ");
                while (starprinter!=0)
                {
                System.out.print ("*");
                starprinter=starprinter-1;
                }
                System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println(); //formating the output
       System.out.println(); //formating the output
        programrun(); //tells the program to run
    }
    
}
