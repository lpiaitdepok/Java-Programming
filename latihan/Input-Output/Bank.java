/** @author DoberFrann */

import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    System.out.println("Welcome to the Bank");
    
    int selection = 0;
    
    do {
      System.out.println("[1] DISPLAY BALANCE");
      System.out.println("[2] DEPOSIT MONEY");
      System.out.println("[3] WITHDRAW MONEY");
      System.out.println("[4] QUIT");
      
      System.out.println("Inser selection: ");
      selection = ReadConsole.nextInt();
      
      switch (selection) {
        case 1:
          BankAccount.display();
          break;
        case 2:
          BankAccount.deposit();
          break;
        case 3:
          BankAccount.withdraw();
          break;
        case 4:
          System.out.println("-------------------");
          break;
        default:
          System.out.println("The selection is invalid");
      }
    } while (selection != 4);
  }
}

public class ReadConsole {
  public static int getInteger() {
    try {
      byte[] buffer = new byte[512];
      System.in.read(buffer);
      String s = new String(buffer);
      s = s.trim();
      
      // We return an integer value
      return Integer.parseInt(s);
    } catch (Exception e) {
      System.out.println("ERROR");
    }
    return 0;
  }
  public static int nextInt() {
    Scanner keyboard = new Scanner(System.in);
    int i = keyboard.nextInt();
    return i;
  }
}

public class BankAccount {
 static int account = 0;
  
  // This method display the amount in our account
  static public void display() {
    System.out.println("You have : " + account + ".");
  }
  // This method is used to deposit money in our account
  static public void deposit() {
    System.out.print("Insert amount to deposit: ");
  }
}
