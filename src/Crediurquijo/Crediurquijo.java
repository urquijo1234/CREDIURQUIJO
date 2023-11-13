package Crediurquijo;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class Crediurquijo extends javax.swing.JFrame {

    int precios[] = {5500000, 7300000, 80000000, 4000000, 3000000, 150000000};
    String imgs[] = {"compu.png", "celular.png", "moto.png", "smart-tv.png", "PS5.png", "carro.png"};
    double contado = 0, credito = 0, descuento = 0, seguro = 0, garantia = 0, total = 0, abono = 0;
    int plazo = 6, cantidad = 1, index = 0;
    double precio = 0, aumento = 1.07;

    public Crediurquijo() {
        initComponents();
        //Añadir Logotipos
        this.setTitle("CREDIURQUIJO");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/crediurquijo.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        lblLogo.setIcon(new ImageIcon(icono.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        rad6.setSelected(true);
        calcularCredito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rad6 = new javax.swing.JRadioButton();
        rad12 = new javax.swing.JRadioButton();
        rad18 = new javax.swing.JRadioButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        chkDescuento = new javax.swing.JCheckBox();
        chkSeguro = new javax.swing.JCheckBox();
        chkGarantia = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        lblContado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCredito = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSeguro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCostoFinal = new javax.swing.JLabel();
        lblAbono = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 108, 79));

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 351, 251));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COSTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cboProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Celular", "Moto", "Smart TV", "PS5", "Camioneta" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 50));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("$3000000 COP");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CANTIDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PLAZO A MESES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        buttonGroup1.add(rad6);
        rad6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad6.setText("6 MESES");
        rad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad6ActionPerformed(evt);
            }
        });
        getContentPane().add(rad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        buttonGroup1.add(rad12);
        rad12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad12.setText("12 MESES");
        rad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad12ActionPerformed(evt);
            }
        });
        getContentPane().add(rad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        buttonGroup1.add(rad18);
        rad18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad18.setText("18 MESES");
        rad18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad18ActionPerformed(evt);
            }
        });
        getContentPane().add(rad18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ADICIONALES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 40));

        chkDescuento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkDescuento.setText("5% DESCUENTO");
        chkDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(chkDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        chkSeguro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkSeguro.setText("SEGURO DE VIDA");
        chkSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(chkSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        chkGarantia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkGarantia.setText("GARANTIA EXTENDIDA");
        chkGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantiaActionPerformed(evt);
            }
        });
        getContentPane().add(chkGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PRECIO CONTADO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 170, -1));

        lblContado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContado.setText("$3000000 COP");
        getContentPane().add(lblContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 190, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("PRECIO CREDITO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 170, -1));

        lblCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCredito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCredito.setText("$3000000 COP");
        getContentPane().add(lblCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("DESCUENTO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 170, -1));

        lblDescuento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescuento.setText("$3000000 COP");
        getContentPane().add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 190, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("SEGURO DE VIDA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 170, -1));

        lblSeguro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSeguro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSeguro.setText("$3000000 COP");
        getContentPane().add(lblSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 190, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("GARANTÍA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 170, -1));

        lblGarantia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGarantia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGarantia.setText("$3000000 COP");
        getContentPane().add(lblGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 190, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("COSTO TOTAL");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 170, 60));

        lblCostoFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCostoFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCostoFinal.setText("$3000000 COP");
        getContentPane().add(lblCostoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 190, 60));

        lblAbono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAbono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAbono.setText("$3000000 COP");
        getContentPane().add(lblAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 190, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("ABONO MENSUAL");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 170, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("CREDIURQUIJO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad6ActionPerformed
        aumento = rad6.isSelected() ? 1.07 : 1.0;
        plazo = 6;
        calcularCredito();
    }//GEN-LAST:event_rad6ActionPerformed

    private void chkDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDescuentoActionPerformed
        descuento = chkDescuento.isSelected() ? 0.05 : 0;
        calcularCredito();
    }//GEN-LAST:event_chkDescuentoActionPerformed

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        index = cboProducto.getSelectedIndex();
        calcularCredito();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        calcularCredito();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void rad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad12ActionPerformed
        aumento = rad12.isSelected() ? 1.1 : 1.0;
        plazo = 12;
        calcularCredito();
    }//GEN-LAST:event_rad12ActionPerformed

    private void rad18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad18ActionPerformed
        aumento = rad18.isSelected() ? 1.125 : 1.0;
        plazo = 18;
        calcularCredito();
    }//GEN-LAST:event_rad18ActionPerformed

    private void chkSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeguroActionPerformed
        seguro = chkSeguro.isSelected() ? 1000000 : 0;
        calcularCredito();

    }//GEN-LAST:event_chkSeguroActionPerformed

    private void chkGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantiaActionPerformed
        garantia = chkGarantia.isSelected() ? 0.03 : 0;
        calcularCredito();
    }//GEN-LAST:event_chkGarantiaActionPerformed

    public String aMoneda(double precio) {
        // Usar el formato adecuado para mostrar el número sin decimales
        DecimalFormat formato = new DecimalFormat("#,##0");
        return "$" + formato.format(precio) + " COP";
    }

    public void calcularCredito() {
        precio = precios[index];
        contado = precio * cantidad;
        lblPrecio.setText(aMoneda(contado));
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/" + imgs[index]));
        lblImagen.setIcon(new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));

        credito = contado * aumento;
        total = credito - (credito * descuento) + seguro + (credito * garantia);
        lblContado.setText(aMoneda(contado));
        lblCredito.setText(aMoneda(credito));
        lblDescuento.setText(aMoneda(credito*descuento));
        lblSeguro.setText(aMoneda(seguro));
        lblGarantia.setText(aMoneda(credito*garantia));
        lblCostoFinal.setText(aMoneda(total));
        lblAbono.setText(aMoneda(total/plazo));

    }

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
            java.util.logging.Logger.getLogger(Crediurquijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crediurquijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crediurquijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crediurquijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crediurquijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JCheckBox chkDescuento;
    private javax.swing.JCheckBox chkGarantia;
    private javax.swing.JCheckBox chkSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAbono;
    private javax.swing.JLabel lblContado;
    private javax.swing.JLabel lblCostoFinal;
    private javax.swing.JLabel lblCredito;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSeguro;
    private javax.swing.JRadioButton rad12;
    private javax.swing.JRadioButton rad18;
    private javax.swing.JRadioButton rad6;
    private javax.swing.JSpinner spnCantidad;
    // End of variables declaration//GEN-END:variables
}
