
package swing;

import javax.swing.SwingUtilities;

/**
 *
 * @author 77011-53-09
 */
public class TestSwing {
    
    public static void perform(){
        //pour avoir de la stabilité avec les composants graphiques
        //meilleur comportement de l'appli swing (redimmensionnement, ....)
        SwingUtilities.invokeLater( () -> {
            try{
                //On instancie  model, vue et controlleur
                Model model = new Model();
                View vue = new View();
                Controller controller = new Controller(vue, model);
                
                controller.buildControls();
                
            }
            catch (Exception e){
                
            }
        });
     
    }
    
}
