/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageshop;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Indika
 */
public class Histogram extends javax.swing.JFrame {

    /**
     * Creates new form Histogram
     */
    
    
    //singleton
    public static Histogram form=null;
    public static Histogram getForm(){
        if (form==null)
            form = new Histogram();
        return form;
    }
    
    
    
    private int[] REDValues = new int[256];
    private int[] GREENValues = new int[256];
    private int[] BLUEValues = new int[256];
    
    private BufferedImage image;
    
    
    
    public Histogram() {
        initComponents();
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
    }
    
    public void generateHistogram(String color){
        
        //clear
        clearValues();
        
        //getting the image width and height
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();
        
        int graphWidth = 256;
        int bottomY = 325;
        
        for (int x = 0; x < imageWidth; x++) {
            for (int y = 0; y < imageHeight; y++) {
                Color RGB = new Color(image.getRGB(x, y));
                
                //incrementing the values
                REDValues[RGB.getRed()]++;
                GREENValues[RGB.getGreen()]++;
                BLUEValues[RGB.getBlue()]++;
            }
        }
        
        //setting a fixed size
        this.setSize(this.getWidth(), bottomY);
        
        
        ///heightRatio = 325/maxValue();
        int max = maxValue();
        
        //drawing the histogram
        BufferedImage histogram = new BufferedImage(graphWidth, histogramPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        histogram.createGraphics();
        
        Graphics2D graphics = (Graphics2D)histogram.getGraphics();
        
        graphics.setColor(new Color(255, 255, 230, 255));
        graphics.fillRect(0, 0, histogramPanel.getWidth(), histogramPanel.getHeight());
        
       
        if(color.equalsIgnoreCase("red")){
            for (int i = 0; i < graphWidth; i++) {
                graphics.setColor(Color.red);
                graphics.drawLine(i, bottomY - bottomY * REDValues[i]/max, i, bottomY);
            }
        }else if(color.equalsIgnoreCase("green")){
            for (int i = 0; i < graphWidth; i++) {
                graphics.setColor(Color.green);
                graphics.drawLine(i, bottomY - bottomY * GREENValues[i]/max, i, bottomY);
            }
        } else if(color.equalsIgnoreCase("blue")){
            for (int i = 0; i < graphWidth; i++) {
                graphics.setColor(Color.blue);
                graphics.drawLine(i, bottomY - bottomY * BLUEValues[i]/max, i, bottomY);
            }
        }
        else{
            for (int i = 0; i < graphWidth-1; i++) {//255 remember!
                graphics.setColor(Color.red);
                graphics.drawLine(i, bottomY - bottomY * REDValues[i]/max, i+1, bottomY - bottomY * REDValues[i+1]/max);
                
                graphics.setColor(Color.green);
                graphics.drawLine(i, bottomY - bottomY * GREENValues[i]/max, i, bottomY - bottomY * GREENValues[i+1]/max);
                
                graphics.setColor(Color.blue);
                graphics.drawLine(i, bottomY - bottomY * BLUEValues[i]/max, i, bottomY - bottomY * BLUEValues[i+1]/max);
            }
        }
        
        
        //scaling the graph to labels width

        Image scaledHistogram = histogram.getScaledInstance(histogramPanel.getWidth(), histogramPanel.getHeight(), Image.SCALE_REPLICATE);
          
        histogramPanel.setIcon(new ImageIcon(scaledHistogram));
        
        
    }
    
    public void drawLines(String x, String y){
        
    }
    
    public void clearValues(){
        for (int i = 0; i < 256; i++) {
            REDValues[i] = 0;
            GREENValues[i] = 0;
            BLUEValues[i] = 0;
        }
    }
    
    public int maxValue()
    {
        int max=0;
        for (int i = 1; i < 255; i++) {
            if(REDValues[i] > max)
                max = REDValues[i];
            if(GREENValues[i] > max)
                max = GREENValues[i];
            if(BLUEValues[i] > max)
                max = BLUEValues[i];
        }
        
        return max;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        histogramPanel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setTitle("Histogram");
        setResizable(false);

        histogramPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("RGB");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Red");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Green");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Blue");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(histogramPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(histogramPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        Histogram histogram = Histogram.getForm();
        histogram.generateHistogram("red");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Histogram histogram = Histogram.getForm();
        histogram.generateHistogram("");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        Histogram histogram = Histogram.getForm();
        histogram.generateHistogram("green");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        
        Histogram histogram = Histogram.getForm();
        histogram.generateHistogram("blue");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Histogram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Histogram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Histogram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Histogram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Histogram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel histogramPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
