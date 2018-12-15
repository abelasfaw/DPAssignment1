/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

/**
 *
 * @author Abel
 */
public class Properties {
    
    private String strngProperty = "stringProperty";
    private int intProperty = 10;
    private int [] intArrayProperty = {1,2};
    private String [] stringArrayProperty = {"p1" , "p1" , "p3"};
    public static void main(String[] args) {
        
        Properties p = new Properties();
        
       System.out.println("p1: " + p.strngProperty);
       System.out.println("p2: " + p.intArrayProperty[0] + " " + p.intArrayProperty[1]);
       System.out.println("p3: " + p.intProperty);
       System.out.println("p4: " + p.stringArrayProperty[0] + " " +p.stringArrayProperty[1] );
        
    }
    
}
