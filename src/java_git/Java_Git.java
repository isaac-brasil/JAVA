/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_git;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Java_Git {

  public static void main(String[] args) {
        // TODO code application logic here
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1° Nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2° Nota: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3° Nota: "));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4° Nota: "));
        
        media(n1,n2,n3,n4);
        
        
    }
    
    public static double media(double n1 ,double n2 , double n3 , double n4) {
        
        
             
        Double media = (n1+n2+n3+n4)/4;
        JOptionPane.showMessageDialog(null, "A Média é " + media);
        return 0;
        
    }
}
