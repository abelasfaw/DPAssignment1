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
public class DesignPatternAssignment1 {

    /**
     * @param args the command line arguments
     */
     //command line arguments 
    public static void main(String[] args) {
        
        if (args.length == 0){
                System.out.println("no command line arguments passed");
        }
        else if(args.length >0){
            System.out.println(args.length + " arguments passed");
            for(int i=0 ; i<args.length ; i++){
            System.out.println("arg" +i + " :" + args[i] );
            }
        }
        
        // TODO code application logic here
    }
    
}
