import java.util.Scanner;
class Tax { 
 
 /** 
 * @param args the command line arguments 
 */ 
 public static void main(String[] args) { 
 Scanner obj=new Scanner(System.in); 
 System.out.println("Enter Character m/u/w"); 
 String s=obj.nextLine(); 
 char c=s.charAt(0); 
 System.out.println("Enter grams of gold"); 
 int gms=obj.nextInt(); 
 try 
 { 
 if((c=='m' && gms<=100)|| (c=='u' && gms<=250)||(c=='w' && gms<=500)) 
 System.out.println("Valid amount"); 
 else 
 throw new IncomeTaxException(); 
 } 
 catch(IncomeTaxException e) 
 {  System.out.println("You are having taxable gold"); 
 } 
 // TODO code application logic here 
 } 
 
}
class IncomeTaxException extends Exception 
{ 
 public String s1; 
public int grms; 
public IncomeTaxException() 
{ 
this.s1="m"; 
this.grms=50; 
} 
} 
