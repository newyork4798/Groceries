/**<h1>Project Title: Groceries</h1>
*<b>Purpose of Project:</b><br>
*<p>Class Design</p>
*<b>How to start the project instructions:</b><br>
*<p>In CMD</p>
*<b>User Instructions:<b/><br>
*<p>Does not use args[]</P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-12-08
*/
// int boxWidth = 45.72;
//int boxHeight = 45.72;
// int boxLength = 60.96;
//int appleDiameter = 7.2;


import java.util.Scanner; //Must import this
import javax.swing.JOptionPane;

public class Groceries {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }


   public int StringDecInt (String userNumber1) {
     try {
       //String to a decimal
       userNumber_double = Double.parseDouble(userNumber1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("User failed first attempt "+
        "inputing money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
         JOptionPane.showMessageDialog (null, "Second Attempt",  "Please restart the program", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

    double totalMoneyIn = moneyYouHave_double;
    if (moneyYouHave_double == Math.abs(0.0) ) { //Checks to see if
    System.out.println ("Users failed to enter a total amount " +
                        "of money to spend");
    JOptionPane.showMessageDialog (null, "You have not entered a total amount of money.", "Please restart the program", JOptionPane.ERROR_MESSAGE);
    System.exit(0);
  } else {
    System.out.println("User entered: " + totalMoneyIn);
    JOptionPane.showMessageDialog (null, "I understand you entered " +
    obj.printMoney(totalMoneyIn), "Money to Spend", JOptionPane.INFORMATION_MESSAGE);
  }

   //Sequence that asks about Apples, Oranges and Chocolate
   System.out.println("User enters a number of apples. \n");
   String apples_string1 = JOptionPane. showInputDialog ("Let's " +
          "fill the box. \nPlease enter how many whole apples you " +
          "would like.");
   String apples_string2 = "";
   int apples_int = 0;
   Double apples_double = 0.0; //used to catch user entry, decimal
  //Possible replies: decimal, integer, string, "0"

  try {
    //String to a decimal
    apples_double = Double.parseDouble (apples_string1);
    //if fails, probably a string
    //If passes, probably a double, maybe an integer
    apples_double = 0.0;
  }
  catch (NumberFormatException ne3) {
    //error of a decimal
    System.out.println ("user has failed first attempt entering" +
                        " an integer for apples.");
    String apple_string1 = JOptionPane.showInputDialog("Please " +
           "enter how many whole apples you would like.\n" +
           "For example: \' 3 \' ");
           try {
    apples_double = Double.parseDouble (apples_string2);
    apples_double = 0.0;
    apples_string1 = apples_string2;
    }
    catch (NumberFormatException ne4) {
      System.out.println("User has failed the 2nd attempt.");
      JOptionPane.showMessageDialog (null, "Please restart the " +
            "program and enter a whole number. \n" +
            "For example \' 3 \' ", "ERROR MESSAGE", JOptionPane.ERROR);
      System.exit(0);
  }
  }
  if (apples_double == 0) {//
  try {
    System.out.println("Second attempt might be successful");
    apples_int = Integer.parseInt(apples_string1);
    //apples_string1 = apples_string2;
    System.out.println ("Second attempt successful" +
         "and variables reassignned.");
         apples_double = 0.0;
   }
  catch (NumberFormatException ne5) {
    System.out.println ("User failed second attempt for " +
          "an integer value for apples.");
    JOptionPane.showMessageDialog(null, "Please enter a whole " +
                "number of apples, as a whole number.", "ERROR " +
                "MESSAGE", JOptionPane.ERROR_MESSAGE);
    System.exit(0);
  }
  }
  try {
  // Decimal successful, is it an integer
  System.out.println("User entered a double or integer for " +
      "the number of apples.");
  apples_int = Integer.parseInt(apples_string1);
  System.out.println("User entered an int for the number of apples");
   }
   catch (NumberFormatException ne6) {
    //Yes decimal and not an int
    System.out.println("User entered a decimal value, not an int");
    apples_string2 = JOptionPane.showInputDialog("It seems like you " +
           "have entered a decimal. \nPlease enter a whole number of" +
           "apples. \nFor example: \' 3\' ");
    try {
    //2nd attempt at entering an integer
    System.out.println("User's second attempt at entering int");
    apples_int = Integer.parseInt(userNumber1);
    apples_double = 0.0;
    //Different variable, need to equal it to first variable
    }
    catch (NumberFormatException ne7) {
      //Not an integer 2nd time, exit program
      System.out.println("User failed second attempt, exit program.");
      JOptionPane.showMessageDialog(null, "Please restart the " +
                 "program and enter a whole number of apples.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
   }
  }
 }

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

     Groceries obj = new Groceries(); //Acesses all methods here;

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "money you have.\n Please enter only dollars and cents, \n" +
            "For Example: \'\' 14.50 \'\'");
     Double moneyYouHave_double = 0.00;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("User failed first attempt "+
        "inputing money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
         JOptionPane.showMessageDialog (null, "Second Attempt",  "Please restart the program", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

    double totalMoneyIn = moneyYouHave_double;
    if ( moneyYouHave_double == Math.abs(0.0) ) { //Checks to see if
    System.out.println ("Users failed to enter a total amount " +
                        "of money to spend");
    JOptionPane.showMessageDialog (null, "You have not entered a total amount of money.", "Please restart the program", JOptionPane.ERROR_MESSAGE);
    System.exit(0);
  } else {
    System.out.println("User entered: " + totalMoneyIn);
    JOptionPane.showMessageDialog (null, "I understand you entered " +
         obj.printMoney(totalMoneyIn), "Money to Spend", JOptionPane.INFORMATION_MESSAGE);
  }

   //Sequence that asks about Apples, Oranges and Chocolate
   System.out.println("User enters a number of apples. \n");
   String apples_string1 = JOptionPane. showInputDialog ("Let's " +
          "fill the box. \nPlease enter how many whole apples you " +
          "would like.");
   String apples_string2 = "";
   int apples_int = 0;
   Double apples_double = 0.0; //used to catch user entry, decimal
  //Possible replies: decimal, integer, string, "0"

  apples_int = obj.stringDecInt(apples_string1);



  try {
    //String to a decimal
    apples_double = Double.parseDouble (apples_string1);
    //if fails, probably a string
    //If passes, probably a double, maybe an integer
    apples_double = 0.0;
  }
  catch (NumberFormatException ne3) {
    //error of a decimal
    System.out.println ("user has failed first attempt entering" +
                        " an integer for apples.");
    String apple_string1 = JOptionPane.showInputDialog("Please " +
           "enter how many whole apples you would like.\n" +
           "For example: \' 3 \' ");
           try {
    apples_double = Double.parseDouble (apples_string2);
    apples_double = 0.0;
    apples_string1 = apples_string2;
    }
    catch (NumberFormatException ne4) {
      System.out.println("User has failed the 2nd attempt.");
      JOptionPane.showMessageDialog (null, "Please restart the " +
            "program and enter a whole number. \n" +
            "For example \' 3 \' ", "ERROR MESSAGE", JOptionPane.ERROR);
      System.exit(0);
  }
  }
if (apples_double == 0) {//
  try {
    System.out.println("Second attempt might be successful");
    apples_int = Integer.parseInt(apples_string1);
    //apples_string1 = apples_string2;
    System.out.println ("Second attempt successful" +
         "and variables reassignned.");
         apples_double = 0.0;
   }
  catch (NumberFormatException ne5) {
    System.out.println ("User failed second attempt for " +
          "an integer value for apples.");
    JOptionPane.showMessageDialog(null, "Please enter a whole " +
                "number of apples, as a whole number.", "ERROR " +
                "MESSAGE", JOptionPane.ERROR_MESSAGE);
    System.exit(0);
  }
}
  try {
// Decimal successful, is it an integer
System.out.println("User entered a double or integer for " +
      "the number of apples.");
apples_int = Integer.parseInt(apples_string1);
System.out.println("User entered an int for the number of apples");
   }
   catch (NumberFormatException ne6) {
    //Yes decimal and not an int
    System.out.println("User entered a decimal value, not an int");
    apples_string2 = JOptionPane.showInputDialog("It seems like you " +
           "have entered a decimal. \nPlease enter a whole number of" +
           "apples. \nFor example: \' 3\' ");
    try {
    //2nd attempt at entering an integer
    System.out.println("User's second attempt at entering int");
    apples_int = Integer.parseInt(apples_string2);
    apples_double = 0.0;
    //Different variable, need to equal it to first variable
    }
    catch (NumberFormatException ne7) {
      //Not an integer 2nd time, exit program
      System.out.println("User failed second attempt, exit program.");
      JOptionPane.showMessageDialog(null, "Please restart the " +
                 "program and enter a whole number of apples.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
   }
  }

  System.out.println("This is the end of the TryCatch for Apples");
  System.out.println(apples_int);
  System.out.println(apples_double);
  System.out.println(apples_string1);
  System.out.println(apples_string2);
}

}


      //Asking user for groceries amount: apples, oranges and cheese
      //System.out.println();
      //JOptionPane
      //tryCatch: string to an int, through a double (decimal)



      // Formating decimals to two decimal places
      //String s = String.format ("$.2f", totalMoneyIn);
      //System.out.println("You have entered " + s);
      //The money to spend here is %.2f


     //Double input_double = Double.parseDouble(input_string);

     //System.out.println(input_double+2.50);

     //JOptionPane.showMessageDialog (null, "$" + input_string, "You told me " +
     //           " you have: ", JOptionPane.ERROR_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

     //System.out.println("$" + input_double);





//Scanner input = new Scanner ( System.in );
//String statement = input.nextLine();

//String input = JOptionPane.showInputDialog ("Press 1 for Monday");
