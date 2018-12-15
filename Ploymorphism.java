/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ploymorphism;

/**
 *
 * @author Abel
 */
public class Ploymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate polymorphism
        sharedInterface sc1 = new sampleClass1();
        sharedInterface sc2 = new sampleClass2();
        sharedInterface sc3 = new sampleClass3();
        
        sharedInterface [] lists = {sc1 , sc2 , sc3};
        
        for(int i=0 ; i< lists.length ; i++){
            lists[i].displayMessage();
        }
        
    }
    
}
