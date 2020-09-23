
package swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 77011-53-09
 */
//instancier une vue 
public class View extends JFrame{
    
    //on ajoute deux panneaux
    //  JPanel cest des conteneurs (capable de recevoir d'autres composants dedans )
    private JPanel panneauBoutons;
    private JPanel panneauMain;
    
    //Boutton
    private JButton bt1;
    //champs vide
    private JTextField textField;
    
    //role instancier la vue
    public View(){
        //invoquer la classe au dessus(super) on sert du constructeur de la JFrame
        super("Mon Appli Swing");
        //instancier des composants 
        panneauBoutons = new JPanel();
        panneauMain = new JPanel();
        
        bt1 = new JButton("Click me !");//instancier bouton avec label Click me 
        textField = new JTextField(7);//instancier champs text avec 7 lettre
        
        //On met le bouton dans le panneau bouton et le textfield dans le panneau main
        panneauBoutons.add(bt1);
        panneauMain.add(textField);
        
        //On met les panneaux dans le layout par default
        //methode de la JFrame directement add
        //JFrame ==> BorderLayout
        add(panneauBoutons, BorderLayout.NORTH);
        add(panneauMain, BorderLayout.CENTER);
        
        //Faire apparaitre la JFrame physique
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);//taille
        //Centrage de la fenentre
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        
    }

    /**
     * @return the bt1 uniquemtn le getter pour pouvoir lattraper dans le controlleur
     */
    public JButton getBt1() {
        return bt1;
    }

    /**
     * @return the textField
     */
    public JTextField getTextField() {
        return textField;
    }

   
}
