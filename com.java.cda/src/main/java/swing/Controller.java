
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 77011-53-09
 */
public class Controller {
    
    //On declare le modele et la vue
    private View vue;
    private Model model;

    public Controller(View vue, Model model) {
        //Aggregation!(comme une injection de dependance)
        this.vue = vue;
        this.model = model;
    }
    
 public void buildControls(){
     //c'est un gestionnaire d'evenement
     //Affectation de l'evenement sur le bouton
     //Evenement click system avec le addActionListener//on utilise une classe anonyme ActionListener
     vue.getBt1().addActionListener( new ActionListener(){ 
         
 
         public void actionPerformed(ActionEvent evt){
             //On incremente le modele de 1
             model.plusTen();
             vue.getTextField().setText(  String.valueOf(model.getNumber())  );
         }
         
     });
 }
    
    
    
    
    
    
    
    
}
