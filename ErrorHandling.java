/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternassignment1;

/**
 *
 * @author Abel
 */
public class ErrorHandling {
    public static void main(String [] args){
    //try catch
    int num1 = 10 , num2 =20;
    int result , result2;
    
    try{
    result = num1/0;
    }
    catch (ArithmeticException e ){
    System.out.println("Exception " + e);
    }
    //try catch finally 
    try{
    result2 = num2/0; 
    }
    catch(ArithmeticException e){
        System.out.println("Exception " + e);
    }
    finally{
        result2 = 0;
        System.out.println("finally block executed");
        
    }
    
    
}
}