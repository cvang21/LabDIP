/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.Ching.Solution1;

/**
 *
 * @author Owner
 */
public class TipManager {
    
    private TipCalculator tipCalculator;
    
    public TipManager(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
 
    public TipCalculator getTip() {
      
        return this.tipCalculator;
    }
    
    public void setTipCalculator (TipCalculator tipCalculator){
       
        this.tipCalculator = tipCalculator;
    }
    
    
    
}
