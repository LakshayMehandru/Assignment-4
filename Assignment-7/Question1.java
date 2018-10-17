import java.util.Scanner;
 class human
 {
     void speak()
     {
         System.out.println("Hello");
     }
 }
 class student extends human
 {
     void speak()
     {
         super.speak();
         System.out.println("Good morning");
     }
 }
  public class spr
 {
     public static void main(String[] args)
     {
         student x=new student();  //derived one will call from speak. and if wer remove student it will be base class.
          x.speak();
      }
 } 
 
