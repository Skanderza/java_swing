/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.function.Function;

/**
 *
 * @author 77011-53-09
 */
public class TestFunctionnal {
    public static void perform(){
        
        ITax taxeA20;
        ITax taxeA10;
        
        taxeA20 = (price) -> price + (price * 0.2); 
        taxeA10 = (price) -> price + (price * 0.1); 
        
        
        
        System.out.println("20% sur le produit qui vaut 10 =" + taxeA20.applyTax(10));
        System.out.println("10% sur le produit qui vaut 10 ="+ taxeA10.applyTax(10));
        System.out.println("20% sur le produit qui vaut 100 =" + taxeA20.applyTax(100));
        
   //changement de l'implentation
         taxeA20 = (price) -> price + price + 20; //20%
         
          System.out.println("20% sur le produit qui vaut 10 =" + taxeA20.applyTax(10));//30
          System.out.println("20% sur le produit qui vaut 100 =" + taxeA20.applyTax(100));
        
        
        ITax taxe1;
        ITax taxe2;
        
        taxe1 = (price) -> price -5; 
        taxe2 = (price) -> price -10; 
 
        
        System.out.println(uneMethode(taxe1, 5.0));
        System.out.println(uneMethode(taxe2, 5.0));
        System.out.println(uneMethode((price) -> price -100, 5.0) );
        
        
      //Pas besoin d'interface
 
        Function<String, Integer> maFonction = x ->x.length();
        
        Integer nbLetters = maFonction.apply("mykong");
        
        System.out.println("Nb letters dans SIM" + maFonction.apply("SIM"));//3
        
        System.out.println(nbLetters);//6
    
    } //end perform()
    
    //--------------------------------------
    public static double uneMethode(ITax functionTaxe, double price){
        return functionTaxe.applyTax(price);
    }
    
}
