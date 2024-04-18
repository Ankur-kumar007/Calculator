import java.util.*;
public class calculator {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // ? Taking input from user;
    System.out.println("Enter Your First number");
     int num1 = sc.nextInt();
     System.out.println("Enter Your second number");
     int num2 = sc.nextInt();
    // *
    // !calculator📲
    System.out.println("Enter the operator: '+', '-', '*', '/', '%'");
    char op = sc.next().charAt(0);
    switch(op){
      case'+':
      System.out.println(num1 + num2);
      break;
      case'-':
      System.out.println(num1-num2);
      break;
      case'*':
      System.out.println(num1 * num2);
      break;
      case'/':
      System.out.println(num1 / num2);
      break;
      case'%':
      System.out.println(num1 % num2);
      break;
      default:
      System.out.println("Please select VALID NUMBER.....");
    }
  }
}