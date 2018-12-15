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
public class Overloading {
    
    //method overloading 
    public int add(int num1 , int num2){
        System.out.println("2 form called");
        return num1 + num2;
    }
    public int add(int num1 , int num2 , int num3){
        System.out.println("3 form called");
        return num1 + num2 + num3;
        
    }
    public int add(int ...nums){
        System.out.println("var arg version called");
        int sum=0;
        for(int i =0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        return sum;
    }
    
    class SampleClass{
        //Constructor overloading 
        
        String description;
        String description2;
        
        public SampleClass(){  //zero argument constructor
            System.out.println("zero arg constructor");
        }
        public SampleClass(String description) { //
            this.description = description;
            System.out.println("single arg constructor ");
        }
        public SampleClass(String description1 , String description2){
            description = description1;
            this.description2 = description2;
            System.out.println("2 args constructor");
        }
        }
    
}
