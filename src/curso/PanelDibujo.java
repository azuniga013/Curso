/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author Adan Zuniga
 */
public class PanelDibujo extends JPanel {
    
    public void paintComponent(Graphics g) {
    
        
        super.paintComponent(g);
        
        int anchura = getWidth();
        int altura = getHeight();
        
        g.drawLine(0, 0, anchura, altura);
        
        g.drawLine(0, altura, anchura, 0);
        
        
    }
        
}
