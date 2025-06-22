package VistaHotel;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SalidaHabitacion extends javax.swing.JPanel {

    ReservarHabitacion panelReservas;

    public SalidaHabitacion() {
        initComponents();
        panelReservas = new ReservarHabitacion(); // Creamos una instancia para acceder a los paneles ya diseñados
        cargarHabitacionesOcupadas(); // Cargamos solo los ocupados

    }

// Método para cargar solo habitaciones con estado 'ocupado'
    public void cargarHabitacionesOcupadas() {

        this.removeAll();  // Limpia el panel para recargar

        try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
            String sql = "SELECT numero_habitacion, tipo, descripcion, precio_por_noche FROM Habitaciones WHERE estado = 'ocupado'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String numero = rs.getString("numero_habitacion");
                String tipo = rs.getString("tipo");
                String descripcion = rs.getString("descripcion");
                String precio = rs.getString("precio_por_noche");

                JPanel panelHabitacion = crearPanelHabitacion(numero, tipo, descripcion, precio);

                this.add(panelHabitacion);
            }

            this.revalidate();
            this.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar paneles ocupados: " + e.getMessage());
        }

    }

    private JPanel crearPanelHabitacion(String numero, String tipo, String descripcion, String precio) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);  // porque están ocupadas
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        panel.setLayout(new java.awt.GridLayout(4, 1));
        panel.setPreferredSize(new java.awt.Dimension(150, 100));

        panel.add(new javax.swing.JLabel("Número: " + numero));
        panel.add(new javax.swing.JLabel("Tipo: " + tipo));
        panel.add(new javax.swing.JLabel("Descripción: " + descripcion));
        panel.add(new javax.swing.JLabel("Precio: $" + precio));

        return panel;
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
