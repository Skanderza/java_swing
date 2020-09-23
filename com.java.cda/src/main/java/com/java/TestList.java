/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lautodidacte
 */
public class TestList {

    public static void perform() {
        List<Integer> listeNombres = new ArrayList(); //wrapper classe
        List<Personne> listePersonnes = new ArrayList();

        for (int i = 0; i < 10; i++) {
            listeNombres.add(random(0, 100));
        }
        System.out.println("*********************************************************************");

        for (int i = 0; i < 10; i++) {
            listePersonnes.add(new Personne("Personne " + i, random(0, 1000)));
        }
        System.out.println("*********************************************************************");

        for (int i = 0; i < listePersonnes.size(); i++) {
            System.out.println("Prénom = " + listePersonnes.get(i).getPrenom());
            System.out.println(" Capital = " + listePersonnes.get(i).getSolde());
        }
        System.out.println("*********************************************************************");

        for (int nb : listeNombres) {
            System.out.println("nb");
        }
        System.out.println("*********************************************************************");

        for (Personne p : listePersonnes) {
            System.out.println("Prénom = " + p.getPrenom());
            System.out.println(" Capital = " + p.getSolde());
        }

        System.out.println("*********************************************************************");

        Iterator<Integer> itNumbers = listeNombres.iterator();
        Iterator<Personne> itPersonnes = listePersonnes.iterator();
            //hasNext pour afficher le next pareil que le foreach  
        while (itNumbers.hasNext()) {
            System.out.println(itNumbers.next());
        }

        while (itPersonnes.hasNext()) {
            Personne p = itPersonnes.next();//Objet Personne

            System.out.println("Prénom - " + p.getPrenom());
            System.out.println(" Capital - " + p.getSolde());
        }
        System.out.println("*********************************************************************");

        //listeNombres.stream().forEach() ->Pour faire des filtres
        listeNombres.forEach((nb) -> {
            System.out.printf("Nombre = %d %n", nb);
        });

        listePersonnes.stream().forEach((Personne personne) -> {
            System.out.printf("Nom = %s - Solde = %d %n", personne.getPrenom(), personne.getSolde());
        });

        System.out.println("Nombre > 50");
        listeNombres.stream()
                .filter(nb -> nb > 50)
                .forEach(nb -> {
                    System.out.printf("Nombre = %d %n", nb);
                });
        System.out.println("*********************************************************************");

        listePersonnes.stream().filter(p -> p.getSolde() > 500).forEach(p -> {
            System.out.printf("Nom = %s - Solde = %d %n", p.getPrenom(), p.getSolde());
        });
        System.out.println("5 *********************************************************************");
        
        List<Integer>listeNombresBeyondFifty = listeNombres.stream()
        		.filter(n -> n>50)
        		.collect(Collectors.toList());
        System.out.println("listeNombresBeyondFifty");  
        
        System.out.println("6 *********************************************************************");
        
        //map(traitement à effectuer pour modifier l'element)
        List<Integer>listeNombresPlus100 = listeNombres.stream()
        		.map( n -> n + 100)
        		.collect(Collectors.toList());
        System.out.println("listeNombresPlus100");  
        
    }

     public static void perform2() {
        List<Integer> listeNombres = new ArrayList(); //wrapper classe
        List<Personne> listePersonnes = new ArrayList();

        for (int i = 0; i<10; i++) {
            listeNombres.add(random(0, 100));
        }
  
         //Feeding listeNombres
        for (int i = 0; i < 10; i++) {
            listePersonnes.add(new Personne("Personne " + i, random(0, 1000)));
        }
    
    //1 tri lisePersonnes avec Collections.sort ==> on utilise objet dedié
     Collections.sort(   listePersonnes, new ComparePersonne()    );
    
    //2 tri lisePersonnes avec Collections.sort ==> utilisation d'une classe anonyme
    //on instancie une classe anonyme
     Collections.sort(   listePersonnes, new Comparator<Personne>(){
         
         @Override
    public int compare(Personne p1, Personne p2) {
       
        if(p1.getSolde() > p2.getSolde()){
            return 1;
        }else {
            return -1;
        }
        
        }
     
     });
     
         System.out.println(listePersonnes);
         
         
            //3 tri lisePersonnes avec Collections.sort ==> avec un lymda
              Collections.sort( listePersonnes,(p1,p2 )->{
                  if(p1.getSolde() > p2.getSolde()){
            return 1;
        }else {
            return -1;
        }
       
     });
   
      System.out.println(listePersonnes);
      
         System.out.println("stream.sorted()-----------------------");
      
      //Avec la méthode intermediaire stream.sort()
      listePersonnes.stream()
              .sorted(new ComparePersonne())
              .forEach( p -> {System.out.println(p.getSolde());});
      
     }
      
    private static int random(double min, double max) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }
}
