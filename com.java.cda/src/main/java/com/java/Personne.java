/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author philou
 */
public class Personne {
    
    private String prenom;
    private Personne conjoint;
    private List listeAmis;
    private int solde;

    public Personne(String prenom, int solde) {
		super();
		this.prenom = prenom;
		this.solde = solde;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public Personne(String prenom) {
        this.prenom = prenom;
        conjoint = null;
        listeAmis = new ArrayList();        
    }
    
    public void marriage(Personne p){
        
        // On vérifie le célibat
        if(this.getConjoint() == null && p.getConjoint() == null){
            this.setConjoint(p);
            p.setConjoint(this);
        }
        
    }
    
    public void divorce(Personne p){
        
        // Déjà marrié ? Avec la bonne personne ?
        if(this.getConjoint() != null && this.getConjoint() == p){
            this.setConjoint(null);
            p.setConjoint(null);
        }
        
    }
    
    public void gagneAmi(Personne nouvelAmi){
        
        // N'est pas déjà son ami ?
        if(!this.getListeAmis().contains(nouvelAmi)){ 
            this.getListeAmis().add(nouvelAmi);
            nouvelAmi.gagneAmi(this);
        }
    }
    
    public void perdAmi(Personne ancienAmi){
        
        // Ils sont déjà amis ?
        if(this.getListeAmis().contains(ancienAmi)){ 
            this.getListeAmis().remove(ancienAmi);
            ancienAmi.getListeAmis().remove(this);
        }
        
        
    }

    
    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the conjoint
     */
    public Personne getConjoint() {
        return conjoint;
    }

    /**
     * @param conjoint the conjoint to set
     */
    public void setConjoint(Personne conjoint) {
        this.conjoint = conjoint;
    }

    /**
     * @return the listeAmis
     */
    public List getListeAmis() {
        return listeAmis;
    }

    /**
     * @param listeAmis the listeAmis to set
     */
    public void setListeAmis(List listeAmis) {
        this.listeAmis = listeAmis;
    }
    
    @Override
    public String  toString(){
        //System.out.println("Amis de " + this.getPrenom() + );
        String retour = "Prénom = " + this.getPrenom();
        retour += " Conjoint = ";
        retour += (this.getConjoint() != null)?this.getConjoint().getPrenom():"Célibataire";
        retour += " Amis (" + this.listeAmis.size() + ") = ";
        Iterator it = this.getListeAmis().iterator();
        while(it.hasNext())
            retour += ((Personne) it.next()).getPrenom() + ", ";
        
        return retour;
    }
       
    
}