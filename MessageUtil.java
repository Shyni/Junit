/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;
/*
* This class prints the given message on console.
*/
public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println("printMessage : "+message);
      return message;
   }   
   
    // prints the message
   public String salutationMessage(){
      System.out.println("salutationMessage : "+message);
      //return "Hi!"+message;
      return message;
   }
}
