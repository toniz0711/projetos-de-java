/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desenho;

import java.awt.Graphics;
import javax.swing.JPanel;
public class Drawpanel extends JPanel {
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        
        int width = getWidth();
        int heigth = getHeight();
        
        g.drawLine(0, 0, width, heigth);
        
        g.drawLine(0, heigth, width, 0);
    }


    
}
