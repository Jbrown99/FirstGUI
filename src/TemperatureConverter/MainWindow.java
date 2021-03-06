/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConverter;


/**
 *
 * @author jbrown99
 */
public class MainWindow extends javax.swing.JFrame {
    
private TemperatureConverterService tempConvert;
    /**
     * Creates new form TemperatureConverter
     */
    public MainWindow() {
        initComponents();
        tempConvert = new TemperatureConverterService();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tempTxt = new javax.swing.JTextField();
        toCelsiusBtn = new javax.swing.JButton();
        conversionTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Temperature in Fahrenheit");

        toCelsiusBtn.setText("Convert to Celsius");
        toCelsiusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCelsiusBtnActionPerformed(evt);
            }
        });

        conversionTxt.setText("output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conversionTxt)
                    .addComponent(toCelsiusBtn)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(toCelsiusBtn)
                .addGap(18, 18, 18)
                .addComponent(conversionTxt)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toCelsiusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCelsiusBtnActionPerformed
        String degrees = tempTxt.getText();
        
        String msg = tempConvert.convertFahrenheitToCelsius(degrees);
        
        conversionTxt.setText(msg);
    }//GEN-LAST:event_toCelsiusBtnActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conversionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JButton toCelsiusBtn;
    // End of variables declaration//GEN-END:variables
}
