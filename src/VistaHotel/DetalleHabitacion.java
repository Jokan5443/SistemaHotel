package VistaHotel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JButton;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;






public class DetalleHabitacion extends javax.swing.JPanel {

    /**
     * Creates new form Product
     */
    public DetalleHabitacion() {
        initComponents();

    }

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

        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
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
        jTextField16 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        BtnExportar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(33, 44, 116));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setBackground(new java.awt.Color(33, 44, 116));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 170, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CLIENTE");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DNI");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, 30));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORIA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SERVICIO A LA HABITACION");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 290, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, 10));

        jTextField6.setBackground(new java.awt.Color(33, 44, 116));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 170, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, 10));

        jTextField7.setBackground(new java.awt.Color(33, 44, 116));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 20));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 10));

        jTextField8.setBackground(new java.awt.Color(33, 44, 116));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 10));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N. HABITACION");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFONO");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        jTextField9.setBackground(new java.awt.Color(33, 44, 116));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 20));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, 10));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DETALLE DE HABITACION");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 710, 110));

        jTextField13.setBackground(new java.awt.Color(33, 44, 116));
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(null);
        add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, 20));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CANTIDAD ADELANTADO");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("F. SALIDA");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 70, 30));

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CANT RESTANTE");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 30));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 170, 10));

        jTextField14.setBackground(new java.awt.Color(33, 44, 116));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(null);
        add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, 20));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 170, 10));

        jTextField15.setBackground(new java.awt.Color(33, 44, 116));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setBorder(null);
        add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 20));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, 10));

        jTextField16.setBackground(new java.awt.Color(33, 44, 116));
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setBorder(null);
        add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 170, 20));
        add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 10));

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("COSTO HABITACION");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DETALLE DE HOSPEDAJE");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        BtnExportar.setText("EXPORTAR");
        BtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportarActionPerformed(evt);
            }
        });
        add(BtnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportarActionPerformed
        // TODO add your handling code here:
        
           exportarComoPDF("DetalleHabitacion.pdf");
        
        
        
    }//GEN-LAST:event_BtnExportarActionPerformed
/*---------------------colocar en otro lado------------------------------------*/
    private void mostrarMensajeExito() {
        JOptionPane.showMessageDialog(null, "La venta fue registrada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExportar;
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
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
