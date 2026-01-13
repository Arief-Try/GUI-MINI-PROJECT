/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonbucks;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SuperClass {
    
    public double OrangeJuice;       
    public double MangoJuice;
    public double WatermelonJuice;
    public double CoconutMilkshake;
    public double StrawberryMilkshake;
    public double GreenTeaMilkShake;
    public double NasiDagang;       
    public double NasiLemak;
    public double AsamLaksaNyonya;
    public double SpaghettiBolognese;
    public double SpaghettiAglioOlio;
    public double LambChop;
    
    public double Drink;
    public double Food;
    public double TotalDF;
    
    public double AllTotal;
     
    public double GetAmount()
            
    {
     Drink = OrangeJuice+MangoJuice+WatermelonJuice+CoconutMilkshake+StrawberryMilkshake+GreenTeaMilkShake;
     Food = NasiDagang+NasiLemak+AsamLaksaNyonya+SpaghettiBolognese+SpaghettiAglioOlio+LambChop;
     
     TotalDF = Drink + Food;        
     AllTotal =  TotalDF;
     return AllTotal ;
    
    }
 //=========================================EXIT================================================   
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame ("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"CONFIRM TO EXIT","Ordering System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
 //======================================PRICE=====================================================
    public double pOrangeJuice = 3.00;       
    public double pMangoJuice = 6.00;
    public double pWatermelonJuice = 6.00;
    public double pGreenTeaMilkShake = 6.00;
    public double pStrawberryMilkshake = 6.00;
    public double pCoconutMilkshake = 6.00;
    
    public double pNasiDagang = 5.00;       
    public double pNasiLemak = 5.00;
    public double pAsamLaksaNyonya = 5.00;
    public double pSpaghettiBolognese = 12.00;
    public double pSpaghettiAglioOlio = 12.00;
    public double pLambChop = 16.00;
    
 
}
