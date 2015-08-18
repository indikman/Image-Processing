/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageshop;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Indika
 */
public class ToolBox extends javax.swing.JFrame {
    
    
    public static ArrayList<ImageShow> openedImages = new ArrayList<>();
    private static BufferedImage currentImage;
    //private static Boolean isOpen = false;
    
    //declaring variables and tools of the toolbox
    private JFileChooser imageOpener = new JFileChooser();
    Logger logger = Logger.getForm();

    public static BufferedImage getCurrentImage() {
        return currentImage;
    }

    public static void setCurrentImage(BufferedImage currentImage) {
        ToolBox.currentImage = currentImage;
    }
    
    //Effects for all the settings
    ImageShopEffects effects = new ImageShopEffects();

    /**
     * Creates new form ToolBox
     */
    public ToolBox() {
        initComponents();
        
        //settings of the Image opener
        imageOpener.setDialogTitle("Imageshop : Open an Image");
        imageOpener.setMultiSelectionEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButtonPanel = new javax.swing.JPanel();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnRGB = new javax.swing.JButton();
        btnHisto = new javax.swing.JButton();
        btnClone = new javax.swing.JButton();
        btnNegative = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBrightness = new javax.swing.JButton();
        btnContrastStretch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuEdit = new javax.swing.JMenu();
        mnuView = new javax.swing.JMenu();
        mnuLogger = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Shop - Toolbox");

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/open.png"))); // NOI18N
        btnOpen.setToolTipText("Open Image");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/save.png"))); // NOI18N
        btnSave.setToolTipText("Save Image");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnRGB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/RGB.png"))); // NOI18N
        btnRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRGBActionPerformed(evt);
            }
        });

        btnHisto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/histogram.png"))); // NOI18N
        btnHisto.setToolTipText("Show histogram");
        btnHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoActionPerformed(evt);
            }
        });

        btnClone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/clone.png"))); // NOI18N
        btnClone.setToolTipText("Clone the Image");
        btnClone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloneActionPerformed(evt);
            }
        });

        btnNegative.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/negative.png"))); // NOI18N
        btnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/turn.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/turn2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBrightness.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/bright_2.png"))); // NOI18N
        btnBrightness.setToolTipText("Brightness/Contrast");
        btnBrightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrightnessActionPerformed(evt);
            }
        });

        btnContrastStretch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageshop/contrast.png"))); // NOI18N
        btnContrastStretch.setToolTipText("Normalization");
        btnContrastStretch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContrastStretchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonPanelLayout = new javax.swing.GroupLayout(panelButtonPanel);
        panelButtonPanel.setLayout(panelButtonPanelLayout);
        panelButtonPanelLayout.setHorizontalGroup(
            panelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonPanelLayout.createSequentialGroup()
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHisto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrightness, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContrastStretch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
        );
        panelButtonPanelLayout.setVerticalGroup(
            panelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonPanelLayout.createSequentialGroup()
                .addGroup(panelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBrightness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRGB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNegative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContrastStretch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        mnuFile.setText("File");
        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Edit");
        jMenuBar1.add(mnuEdit);

        mnuView.setText("View");

        mnuLogger.setText("Status Logger");
        mnuLogger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoggerActionPerformed(evt);
            }
        });
        mnuView.add(mnuLogger);

        jMenuBar1.add(mnuView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        // TODO add your handling code here:
        
        //opening the file chooser dialog box
        int returnVal = imageOpener.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = imageOpener.getSelectedFile();
            //logging the file data in the logger
            logger.log("Opening " + file.getName() + "");
            System.out.println(file.getParentFile());
            
            ImageShow newImage = new ImageShow(file);
            newImage.setImageName(file.getName());
            //adding the opened image to the array list
            openedImages.add(newImage);
            
            //showing on thes screen
            newImage.setVisible(true);
            
           // btnOpen.setEnabled(false);
            
        }else{
            logger.log("Opening Cancelled!");
        }
        
        
    }//GEN-LAST:event_btnOpenActionPerformed

    private void mnuLoggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoggerActionPerformed
        // TODO add your handling code here:
        Logger.getForm().setVisible(true);
    }//GEN-LAST:event_mnuLoggerActionPerformed

    private void btnRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRGBActionPerformed
        // TODO add your handling code here:
        
        //getting the image from the arraylist
        //ImageShow imageForm = openedImages.get(0);
        //BufferedImage RGBimage = imageForm.getImage();
        BufferedImage RGBimage = currentImage;
        
        //getting the red channel
        ImageShow redImage = new ImageShow(effects.getChannel(RGBimage, "red"),  "- RED channel");
        redImage.setSize(RGBimage.getWidth()+50, RGBimage.getHeight()+50);
        redImage.setVisible(true);
        
        //getting the green channel
        ImageShow greenImage = new ImageShow(effects.getChannel(RGBimage, "green"),  "- GREEN channel");
        greenImage.setSize(RGBimage.getWidth()+50, RGBimage.getHeight()+50);
        greenImage.setVisible(true);
        
        //getting the blue channel
        ImageShow blueImage = new ImageShow(effects.getChannel(RGBimage, "blue"),  "- BLUE channel");
        blueImage.setSize(RGBimage.getWidth()+50, RGBimage.getHeight()+50);
        blueImage.setVisible(true);
    }//GEN-LAST:event_btnRGBActionPerformed

    private void btnHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoActionPerformed
        // TODO add your handling code here:
        
        //getting the image from the arraylist
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        
        Histogram histogram = Histogram.getForm();
        histogram.setImage(image);
        histogram.generateHistogram("");
        histogram.setVisible(true);
    }//GEN-LAST:event_btnHistoActionPerformed

    private void btnCloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloneActionPerformed
        // TODO add your handling code here:
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        
        ImageShow newImage = new ImageShow(image, "Copy of " + imageForm.getImageName());
        newImage.setVisible(true);
    }//GEN-LAST:event_btnCloneActionPerformed

    private void btnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeActionPerformed
        // TODO add your handling code here:
        BufferedImage RGBimage = currentImage;
        
        //getting the red channel
        ImageShow negImage = new ImageShow(effects.getNeagative(RGBimage),  "Negative");
        negImage.setSize(RGBimage.getWidth(), RGBimage.getHeight());
        negImage.setVisible(true);
    }//GEN-LAST:event_btnNegativeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        
        imageForm.setImage(effects.changeBrightness(image, 1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        
        imageForm.setImage(effects.changeBrightness(image, -1));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrightnessActionPerformed
        // TODO add your handling code here:
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        BrightnessContrast brightcont = new BrightnessContrast(image);
        brightcont.setVisible(true);
    }//GEN-LAST:event_btnBrightnessActionPerformed

    private void btnContrastStretchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrastStretchActionPerformed
        // TODO add your handling code here:
        ImageShow imageForm = openedImages.get(0);
        BufferedImage image = imageForm.getImage();
        
        ContrastStretch contstr = new ContrastStretch(image);
        contstr.setVisible(true);
    }//GEN-LAST:event_btnContrastStretchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToolBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrightness;
    private javax.swing.JButton btnClone;
    private javax.swing.JButton btnContrastStretch;
    private javax.swing.JButton btnHisto;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRGB;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuLogger;
    private javax.swing.JMenu mnuView;
    private javax.swing.JPanel panelButtonPanel;
    // End of variables declaration//GEN-END:variables
}
