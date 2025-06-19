package VistaHotel;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Reservacion extends javax.swing.JFrame {
    // Variable de instancia para guardar la instancia actual de ReservarHabitacion

    private ReservarHabitacion rh;

    public Reservacion() {
            initComponents();
        this.setLocationRelativeTo(null); // centra el Jframe
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        BtnReservacion = new javax.swing.JButton();
        BtnServicioAdicional = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnProductos = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        BtnSalidaHabitacion = new javax.swing.JButton();
        JpContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 44, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(33, 44, 116));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SALIR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 90, 30));

        BtnReservacion.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservacion.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservacion.setText("RESERVACION");
        BtnReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservacionMouseClicked(evt);
            }
        });
        jPanel2.add(BtnReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        BtnServicioAdicional.setBackground(new java.awt.Color(33, 44, 116));
        BtnServicioAdicional.setForeground(new java.awt.Color(255, 255, 255));
        BtnServicioAdicional.setText("SERVICIO ADICIONAL");
        BtnServicioAdicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnServicioAdicionalMouseClicked(evt);
            }
        });
        jPanel2.add(BtnServicioAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioEV.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 50, 70));

        BtnProductos.setBackground(new java.awt.Color(33, 44, 116));
        BtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        BtnProductos.setText("PRODUCTOS");
        BtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProductosMouseClicked(evt);
            }
        });
        BtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(BtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));

        jButton8.setBackground(new java.awt.Color(33, 44, 116));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("FACTURA");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

        BtnSalidaHabitacion.setBackground(new java.awt.Color(33, 44, 116));
        BtnSalidaHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalidaHabitacion.setText("SALIDAS");
        BtnSalidaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalidaHabitacionMouseClicked(evt);
            }
        });
        jPanel2.add(BtnSalidaHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        JpContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JpContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 760, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProductosMouseClicked
        Product pr = new Product();
        pr.setSize(750, 450);
        pr.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(pr, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnProductosMouseClicked

    private void BtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductosActionPerformed

    }//GEN-LAST:event_BtnProductosActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

        int respuesta = JOptionPane.showConfirmDialog(
         Reservacion.this, // Referencia al componente la ventana actual 
         "¿Deseas realmente salir?", // Mensaje que se muestra al usuario
         "Confirmación", // Título de la ventana de diálogo
         JOptionPane.YES_NO_OPTION // Tipo de opciones que se presentan al usuario (Sí y No)
        );
        if (respuesta == JOptionPane.YES_OPTION) { // Verifica si el usuario seleccionó "Sí"
            dispose(); // Cierra la ventana y libera los recursos
            VentanaPrincipal vprinc = new VentanaPrincipal();
            vprinc.setVisible(true);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void BtnReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservacionMouseClicked
        rh = new ReservarHabitacion();
        rh.setSize(750, 450);
        rh.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(rh, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnReservacionMouseClicked

    private void BtnServicioAdicionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnServicioAdicionalMouseClicked
        ServicioAdicional sradicional = new ServicioAdicional();
        sradicional.setSize(750, 450);
        sradicional.setLocation(0, 0);
        JpContent.removeAll();
        JpContent.add(sradicional, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();
    }//GEN-LAST:event_BtnServicioAdicionalMouseClicked

    private void BtnSalidaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalidaHabitacionMouseClicked
        // TODO add your handling code here:
        SalidaHabitacion salidaPanel = new SalidaHabitacion();
        salidaPanel.setSize(750, 450);
        salidaPanel.setLocation(0, 0);
        salidaPanel.cargarHabitacionesOcupadas(); // Se cargan los datos desde BD

        JpContent.removeAll();
        JpContent.add(salidaPanel, BorderLayout.CENTER);
        JpContent.revalidate();
        JpContent.repaint();

    }//GEN-LAST:event_BtnSalidaHabitacionMouseClicked
    
// Método para obtener la instancia actual de ReservarHabitacion
    public ReservarHabitacion getReservarHabitacion() {
        return rh;
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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnProductos;
    private javax.swing.JButton BtnReservacion;
    private javax.swing.JButton BtnSalidaHabitacion;
    private javax.swing.JButton BtnServicioAdicional;
    private javax.swing.JPanel JpContent;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
