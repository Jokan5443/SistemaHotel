package VistaHotel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ConexionBaseDeDatos.ConexionBD;

public class ReservarHabitacion extends javax.swing.JPanel {

    public ReservarHabitacion() {
        initComponents();
        cargarEstadosDesdeBD();
    }

    public ReservarHabitacion(String numero, String tipo, String precio) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel9 = new javax.swing.JPanel();
        BtnReservar9 = new javax.swing.JButton();
        img9 = new javax.swing.JLabel();
        lblPrecio9 = new javax.swing.JLabel();
        LblNumero9 = new javax.swing.JLabel();
        LblTipo9 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        BtnReservar1 = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        LblNumero1 = new javax.swing.JLabel();
        LblTipo1 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        BtnReservar5 = new javax.swing.JButton();
        img5 = new javax.swing.JLabel();
        lblPrecio5 = new javax.swing.JLabel();
        LblNumero5 = new javax.swing.JLabel();
        LblTipo5 = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        BtnReservar10 = new javax.swing.JButton();
        img10 = new javax.swing.JLabel();
        lblPrecio10 = new javax.swing.JLabel();
        LblNumero10 = new javax.swing.JLabel();
        LblTipo10 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        BtnReservar6 = new javax.swing.JButton();
        img6 = new javax.swing.JLabel();
        lblPrecio6 = new javax.swing.JLabel();
        LblNumero6 = new javax.swing.JLabel();
        LblTipo6 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        BtnReservar11 = new javax.swing.JButton();
        img11 = new javax.swing.JLabel();
        lblPrecio11 = new javax.swing.JLabel();
        LblNumero11 = new javax.swing.JLabel();
        LblTipo11 = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        BtnReservar7 = new javax.swing.JButton();
        img7 = new javax.swing.JLabel();
        lblPrecio7 = new javax.swing.JLabel();
        LblNumero7 = new javax.swing.JLabel();
        LblTipo7 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        BtnReservar12 = new javax.swing.JButton();
        img12 = new javax.swing.JLabel();
        lblPrecio12 = new javax.swing.JLabel();
        LblNumero12 = new javax.swing.JLabel();
        LblTipo12 = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        BtnReservar8 = new javax.swing.JButton();
        img8 = new javax.swing.JLabel();
        lblPrecio8 = new javax.swing.JLabel();
        LblNumero8 = new javax.swing.JLabel();
        LblTipo8 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        BtnReservar2 = new javax.swing.JButton();
        img2 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        LblNumero2 = new javax.swing.JLabel();
        LblTipo2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        BtnReservar3 = new javax.swing.JButton();
        img3 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        LblNumero3 = new javax.swing.JLabel();
        LblTipo3 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        BtnReservar4 = new javax.swing.JButton();
        img4 = new javax.swing.JLabel();
        lblPrecio4 = new javax.swing.JLabel();
        LblNumero4 = new javax.swing.JLabel();
        LblTipo4 = new javax.swing.JLabel();

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

        Panel9.setBackground(new java.awt.Color(255, 255, 255));
        Panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar9.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar9.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar9.setText("Reservar");
        BtnReservar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar9MouseClicked(evt);
            }
        });
        BtnReservar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReservar9ActionPerformed(evt);
            }
        });
        Panel9.add(BtnReservar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel9.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio9.setText("S/500");
        Panel9.add(lblPrecio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero9.setText("NUM 001");
        Panel9.add(LblNumero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo9.setText("FAMILIAR");
        Panel9.add(LblTipo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        add(Panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, 130));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar1.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar1.setText("Reservar");
        BtnReservar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar1MouseClicked(evt);
            }
        });
        BtnReservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReservar1ActionPerformed(evt);
            }
        });
        Panel1.add(BtnReservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio1.setText("S/500");
        Panel1.add(lblPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero1.setText("NUM 001");
        Panel1.add(LblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo1.setText("SUIT");
        Panel1.add(LblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 130));

        Panel5.setBackground(new java.awt.Color(255, 255, 255));
        Panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar5.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar5.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar5.setText("Reservar");
        BtnReservar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar5MouseClicked(evt);
            }
        });
        Panel5.add(BtnReservar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel5.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio5.setText("S/250");
        Panel5.add(lblPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero5.setText("NUM 001");
        Panel5.add(LblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo5.setText("DOUBLE");
        Panel5.add(LblTipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 20));

        add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 130));

        Panel10.setBackground(new java.awt.Color(255, 255, 255));
        Panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar10.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar10.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar10.setText("Reservar");
        BtnReservar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar10MouseClicked(evt);
            }
        });
        Panel10.add(BtnReservar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel10.add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio10.setText("S/350");
        Panel10.add(lblPrecio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero10.setText("NUM 002");
        Panel10.add(LblNumero10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo10.setText("FAMILIAR");
        Panel10.add(LblTipo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        add(Panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 150, 130));

        Panel6.setBackground(new java.awt.Color(255, 255, 255));
        Panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar6.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar6.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar6.setText("Reservar");
        BtnReservar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar6MouseClicked(evt);
            }
        });
        Panel6.add(BtnReservar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel6.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio6.setText("S/250");
        Panel6.add(lblPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero6.setText("NUM 002");
        Panel6.add(LblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo6.setText("DOUBLE");
        Panel6.add(LblTipo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 20));

        add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 130));

        Panel11.setBackground(new java.awt.Color(255, 255, 255));
        Panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar11.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar11.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar11.setText("Reservar");
        BtnReservar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar11MouseClicked(evt);
            }
        });
        Panel11.add(BtnReservar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel11.add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio11.setText("S/350");
        Panel11.add(lblPrecio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero11.setText("NUM 003");
        Panel11.add(LblNumero11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo11.setText("FAMILIAR");
        Panel11.add(LblTipo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        add(Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 130));

        Panel7.setBackground(new java.awt.Color(255, 255, 255));
        Panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar7.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar7.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar7.setText("Reservar");
        BtnReservar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar7MouseClicked(evt);
            }
        });
        Panel7.add(BtnReservar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel7.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio7.setText("S/250");
        Panel7.add(lblPrecio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero7.setText("NUM 003");
        Panel7.add(LblNumero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo7.setText("DOUBLE");
        Panel7.add(LblTipo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 20));

        add(Panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, 130));

        Panel12.setBackground(new java.awt.Color(255, 255, 255));
        Panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar12.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar12.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar12.setText("Reservar");
        BtnReservar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar12MouseClicked(evt);
            }
        });
        Panel12.add(BtnReservar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel12.add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio12.setText("S/350");
        Panel12.add(lblPrecio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero12.setText("NUM 004");
        Panel12.add(LblNumero12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo12.setText("FAMILIAR");
        Panel12.add(LblTipo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        add(Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 150, 130));

        Panel8.setBackground(new java.awt.Color(255, 255, 255));
        Panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar8.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar8.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar8.setText("Reservar");
        BtnReservar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar8MouseClicked(evt);
            }
        });
        Panel8.add(BtnReservar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel8.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio8.setText("S/250");
        Panel8.add(lblPrecio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero8.setText("NUM 004");
        Panel8.add(LblNumero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo8.setText("DOUBLE");
        Panel8.add(LblTipo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        add(Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 150, 130));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar2.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar2.setText("Reservar");
        BtnReservar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar2MouseClicked(evt);
            }
        });
        Panel2.add(BtnReservar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio2.setText("S/500");
        Panel2.add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero2.setText("NUM 002");
        Panel2.add(LblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo2.setText("SUIT");
        Panel2.add(LblTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 130));

        Panel3.setBackground(new java.awt.Color(255, 255, 255));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar3.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar3.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar3.setText("Reservar");
        BtnReservar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar3MouseClicked(evt);
            }
        });
        Panel3.add(BtnReservar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio3.setText("S/500");
        Panel3.add(lblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero3.setText("NUM 003");
        Panel3.add(LblNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo3.setText("SUIT");
        Panel3.add(LblTipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 150, 130));

        Panel4.setBackground(new java.awt.Color(255, 255, 255));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReservar4.setBackground(new java.awt.Color(33, 44, 116));
        BtnReservar4.setForeground(new java.awt.Color(255, 255, 255));
        BtnReservar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llave-de-la-habitacion-del-hotel (1).png"))); // NOI18N
        BtnReservar4.setText("Reservar");
        BtnReservar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnReservar4MouseClicked(evt);
            }
        });
        Panel4.add(BtnReservar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cama-alternativa.png"))); // NOI18N
        Panel4.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 60));

        lblPrecio4.setText("S/500");
        Panel4.add(lblPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 20));

        LblNumero4.setText("NUM 004");
        Panel4.add(LblNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 20));

        LblTipo4.setText("SUIT");
        Panel4.add(LblTipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 20));

        add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 150, 130));
    }// </editor-fold>//GEN-END:initComponents

    // METODO PARA QUE SE MUESTRE LOS ESTADOS ACTUALES DE LAS HABITACIONES 
    private void cargarEstadosDesdeBD() {
    try (Connection conn = ConexionBaseDeDatos.ConexionBD.conectar()) {
        String sql = "SELECT numero_habitacion, estado FROM Habitaciones";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String numero = rs.getString("numero_habitacion");
            String estado = rs.getString("estado");
            actualizarColorPanelPorEstado(numero, estado);
        }
    } catch (Exception e) {
        System.out.println("Error al cargar estados: " + e.getMessage());
    }
}

    
    
    
    
    
    // CREAMOS UN METODO PARA REUTILIZAR COD
    private void abrirInscripcion(JLabel lblNum, JLabel lblTipo, JLabel lblPrecio) {
        String numero = lblNum.getText();
        String tipo = lblTipo.getText();
        String precio = lblPrecio.getText();

        Inscripcion ins = new Inscripcion(numero, tipo, precio, this); // <-- Aquí agregas 'this'
        ins.setVisible(true);
    }
    // CREAMOS UN METODO PARA PODER ACTUALIZAR EL COLOR DEL ESYADO QUE VAMOS A UTILIZAR

    public void actualizarColorPanelPorEstado(String numeroHabitacion, String estado) {
         
        JPanel panel = null;

        // SE BUSCA EL PANEL DEPENDIENDO LA HABITACION QUE SE HA SELEECIONADO
        switch (numeroHabitacion) {
            case "1":
                panel = Panel1;
                break;
            case "2":
                panel = Panel2;
                break;
            case "3":
                panel = Panel3;
                break;
            case "4":
                panel = Panel4;
                break;
            case "5":
                panel = Panel5;
                break;
            case "6":
                panel = Panel6;
                break;
            case "7":
                panel = Panel7;
                break;
            case "8":
                panel = Panel8;
                break;
            case "9":
                panel = Panel9;
                break;
            case "10":
                panel = Panel10;
                break;
            case "11":
                panel = Panel11;
                break;
            case "12":
                panel = Panel12;
                break;
            default:
                return; // SI NO COINCIDE SALE DEL BUCLE
        }

        // APLICAMOS EL ESTADO SEGUN EL ESTADO QUE SE MARCA
        if (panel != null) {
            switch (estado.toLowerCase()) {
                case "disponible":
                    panel.setBackground(Color.GREEN);
                    break;
                case "ocupado":
                    panel.setBackground(Color.RED);
                    break;
                case "limpieza":
                    panel.setBackground(new Color(173, 216, 230)); // Celeste
                    break;
                default:
                    panel.setBackground(Color.GRAY);
                    break;
            }
             panel.setOpaque(true); 
              panel.repaint();
        }
    }


    private void BtnReservar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar9MouseClicked
        abrirInscripcion(LblNumero9, LblTipo9, lblPrecio9);
    }//GEN-LAST:event_BtnReservar9MouseClicked

    private void BtnReservar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar5MouseClicked
        abrirInscripcion(LblNumero5, LblTipo5, lblPrecio5);
    }//GEN-LAST:event_BtnReservar5MouseClicked

    private void BtnReservar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar10MouseClicked
        abrirInscripcion(LblNumero10, LblTipo10, lblPrecio10);
    }//GEN-LAST:event_BtnReservar10MouseClicked

    private void BtnReservar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar6MouseClicked
        abrirInscripcion(LblNumero6, LblTipo6, lblPrecio6);
    }//GEN-LAST:event_BtnReservar6MouseClicked

    private void BtnReservar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar11MouseClicked
        abrirInscripcion(LblNumero11, LblTipo11, lblPrecio11);
    }//GEN-LAST:event_BtnReservar11MouseClicked

    private void BtnReservar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar7MouseClicked
        abrirInscripcion(LblNumero7, LblTipo7, lblPrecio7);
    }//GEN-LAST:event_BtnReservar7MouseClicked

    private void BtnReservar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar12MouseClicked
        abrirInscripcion(LblNumero12, LblTipo12, lblPrecio12);
    }//GEN-LAST:event_BtnReservar12MouseClicked

    private void BtnReservar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar8MouseClicked
        abrirInscripcion(LblNumero8, LblTipo8, lblPrecio8);
    }//GEN-LAST:event_BtnReservar8MouseClicked

    private void BtnReservar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar2MouseClicked
        abrirInscripcion(LblNumero2, LblTipo2, lblPrecio2);
    }//GEN-LAST:event_BtnReservar2MouseClicked

    private void BtnReservar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar3MouseClicked
        abrirInscripcion(LblNumero3, LblTipo3, lblPrecio3);
    }//GEN-LAST:event_BtnReservar3MouseClicked

    private void BtnReservar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar4MouseClicked
        abrirInscripcion(LblNumero4, LblTipo4, lblPrecio4);
    }//GEN-LAST:event_BtnReservar4MouseClicked

    private void BtnReservar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReservar9ActionPerformed

    }//GEN-LAST:event_BtnReservar9ActionPerformed

    private void BtnReservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReservar1ActionPerformed

    }//GEN-LAST:event_BtnReservar1ActionPerformed

    private void BtnReservar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReservar1MouseClicked
        abrirInscripcion(LblNumero1, LblTipo1, lblPrecio1);
    }//GEN-LAST:event_BtnReservar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReservar1;
    private javax.swing.JButton BtnReservar10;
    private javax.swing.JButton BtnReservar11;
    private javax.swing.JButton BtnReservar12;
    private javax.swing.JButton BtnReservar2;
    private javax.swing.JButton BtnReservar3;
    private javax.swing.JButton BtnReservar4;
    private javax.swing.JButton BtnReservar5;
    private javax.swing.JButton BtnReservar6;
    private javax.swing.JButton BtnReservar7;
    private javax.swing.JButton BtnReservar8;
    private javax.swing.JButton BtnReservar9;
    private javax.swing.JLabel LblNumero1;
    private javax.swing.JLabel LblNumero10;
    private javax.swing.JLabel LblNumero11;
    private javax.swing.JLabel LblNumero12;
    private javax.swing.JLabel LblNumero2;
    private javax.swing.JLabel LblNumero3;
    private javax.swing.JLabel LblNumero4;
    private javax.swing.JLabel LblNumero5;
    private javax.swing.JLabel LblNumero6;
    private javax.swing.JLabel LblNumero7;
    private javax.swing.JLabel LblNumero8;
    private javax.swing.JLabel LblNumero9;
    private javax.swing.JLabel LblTipo1;
    private javax.swing.JLabel LblTipo10;
    private javax.swing.JLabel LblTipo11;
    private javax.swing.JLabel LblTipo12;
    private javax.swing.JLabel LblTipo2;
    private javax.swing.JLabel LblTipo3;
    private javax.swing.JLabel LblTipo4;
    private javax.swing.JLabel LblTipo5;
    private javax.swing.JLabel LblTipo6;
    private javax.swing.JLabel LblTipo7;
    private javax.swing.JLabel LblTipo8;
    private javax.swing.JLabel LblTipo9;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio10;
    private javax.swing.JLabel lblPrecio11;
    private javax.swing.JLabel lblPrecio12;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio4;
    private javax.swing.JLabel lblPrecio5;
    private javax.swing.JLabel lblPrecio6;
    private javax.swing.JLabel lblPrecio7;
    private javax.swing.JLabel lblPrecio8;
    private javax.swing.JLabel lblPrecio9;
    // End of variables declaration//GEN-END:variables
}
