/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageshop;

import java.awt.image.BufferedImage;
import javax.swing.UIManager;

/**
 *
 * @author Indika
 */
public class Imageshop {

    BufferedImage image = new BufferedImage(30,30,2);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(StareBuddy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ToolBox mainApp = new ToolBox();
        mainApp.setVisible(true);
    }
    
}
