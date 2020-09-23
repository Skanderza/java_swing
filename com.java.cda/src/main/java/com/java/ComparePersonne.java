/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Comparator;

/**
 *
 * @author 77011-53-09
 */
//Une clesse dedié au tri
public class ComparePersonne implements Comparator<Personne> {

    @Override
    public int compare(Personne p1, Personne p2) {
       
        if(p1.getSolde() > p2.getSolde()){
            return 1;
        }else {
            return -1;
        }
        
    }
    
}
