
package VistaHotel;

import javax.swing.JOptionPane;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfWriter;

public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form detalle
     */
    public Factura() {
        initComponents();
    }
// iimprimir detalles en pdf 
    public void exportarComoPDF(String nombreArchivoPDF) {
    try {
        int width = this.getWidth();
        int height = this.getHeight();

        if (width == 0 || height == 0) {
            JOptionPane.showMessageDialog(this, "El panel aún no se ha dibujado. Asegúrate de que está visible.");
            return;
        }

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        this.paint(g2d);
        g2d.dispose();

        Document document = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(nombreArchivoPDF));
        document.open();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(img, "png", baos);
        Image image = Image.getInstance(baos.toByteArray());

        image.scaleToFit(PageSize.A4.getHeight() - 40, PageSize.A4.getWidth() - 40);
        image.setAlignment(Image.ALIGN_CENTER);

        document.add(image);
        document.close();

        JOptionPane.showMessageDialog(this, "PDF creado correctamente.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al exportar: " + e.getMessage());
    }
 
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contener = new javax.swing.JPanel();
        TxtDetalleDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        TxtDetalleCategoria = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TxtDetalleCliente = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TxtDetalleNHabitacion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtDetalleTelefono = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jTextField14 = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jTextField15 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        TxtDetalleCostoHabitacion = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        BtnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setFocusable(false);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(750, 450));
        setPreferredSize(new java.awt.Dimension(750, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contener.setBackground(new java.awt.Color(33, 44, 116));
        contener.setFocusable(false);
        contener.setPreferredSize(new java.awt.Dimension(750, 450));
        contener.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtDetalleDni.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleDni.setBorder(null);
        contener.add(TxtDetalleDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 170, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CLIENTE");
        contener.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI");
        contener.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, 30));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORIA");
        contener.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SERVICIO A LA HABITACION");
        contener.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 290, 30));
        contener.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, 10));

        TxtDetalleCategoria.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleCategoria.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleCategoria.setBorder(null);
        contener.add(TxtDetalleCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 170, 20));
        contener.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, 10));

        TxtDetalleCliente.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleCliente.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleCliente.setBorder(null);
        contener.add(TxtDetalleCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 20));
        contener.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 10));

        TxtDetalleNHabitacion.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleNHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleNHabitacion.setBorder(null);
        contener.add(TxtDetalleNHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 20));
        contener.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 10));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N. HABITACION");
        contener.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFONO");
        contener.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        TxtDetalleTelefono.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleTelefono.setBorder(null);
        contener.add(TxtDetalleTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 20));
        contener.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, 10));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DETALLE DE HABITACION");
        contener.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "ESTADO VENTA", "SUB TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        contener.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 710, 110));

        jTextField13.setBackground(new java.awt.Color(33, 44, 116));
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(null);
        contener.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, 20));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("f. entrada");
        contener.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, 30));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("F. SALIDA");
        contener.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 70, 30));

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CANT RESTANTE");
        contener.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 30));
        contener.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 170, 10));

        jTextField14.setBackground(new java.awt.Color(33, 44, 116));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(null);
        contener.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, 20));
        contener.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 170, 10));

        jTextField15.setBackground(new java.awt.Color(33, 44, 116));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setBorder(null);
        contener.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 20));
        contener.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, 10));

        TxtDetalleCostoHabitacion.setBackground(new java.awt.Color(33, 44, 116));
        TxtDetalleCostoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDetalleCostoHabitacion.setBorder(null);
        contener.add(TxtDetalleCostoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 170, 20));
        contener.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 10));

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("COSTO HABITACION");
        contener.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DETALLE DE HOSPEDAJE");
        contener.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        BtnExportar.setText("EXPORTAR");
        BtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportarActionPerformed(evt);
            }
        });
        contener.add(BtnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        getContentPane().add(contener, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportarActionPerformed
        // TODO add your handling code here:

 exportarComoPDF("DetalleHabitacion.pdf");

    }//GEN-LAST:event_BtnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExportar;
    private javax.swing.JTextField TxtDetalleCategoria;
    private javax.swing.JTextField TxtDetalleCliente;
    private javax.swing.JTextField TxtDetalleCostoHabitacion;
    private javax.swing.JTextField TxtDetalleDni;
    private javax.swing.JTextField TxtDetalleNHabitacion;
    private javax.swing.JTextField TxtDetalleTelefono;
    private javax.swing.JPanel contener;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables
}
