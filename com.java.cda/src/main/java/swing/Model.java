/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author 77011-53-09
 */
public class Model {
    
    private int number;

      public Model() {
    }
      
      public void plusOne(){
          ++number;
      }
      public void plusTen(){
          number += 1000;
      }
      
  
      
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

  
    
    
}
