package VistaHotel;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

public class SalidaHabitacion extends javax.swing.JPanel {

    public SalidaHabitacion() {
        initComponents();
        this.setLayout(new java.awt.GridLayout(0, 3, 10, 10)); // 3 columnas, con espacio de 10px
    }

// Método para cargar solo habitaciones con estado 'ocupado'
    public void cargarHabitacionesOcupadas() {
        // Limpia lo que haya en el panel
        this.removeAll();

        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            if (conn != null) {
                String sql = "SELECT numero_habitacion, tipo, descripcion, precio_por_noche FROM Habitaciones WHERE estado = 'ocupado'";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String numero = rs.getString("numero_habitacion");
                    String tipo = rs.getString("tipo");
                    String descripcion = rs.getString("descripcion");
                    double precio = rs.getDouble("precio_por_noche");

                    JPanel habitacionPanel = new JPanel();
                    habitacionPanel.setLayout(new BoxLayout(habitacionPanel, BoxLayout.Y_AXIS));
                    habitacionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    habitacionPanel.setBackground(new Color(255, 102, 102)); // color rojo para ocupado

                    habitacionPanel.add(new JLabel("Número: " + numero));
                    habitacionPanel.add(new JLabel("Tipo: " + tipo));
                    habitacionPanel.add(new JLabel("Descripción: " + descripcion));
                    habitacionPanel.add(new JLabel("Precio por noche: $" + precio));

                    this.add(habitacionPanel);
                }

                // Refresca la vista
                this.revalidate();
                this.repaint();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar habitaciones ocupadas: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

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
        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
