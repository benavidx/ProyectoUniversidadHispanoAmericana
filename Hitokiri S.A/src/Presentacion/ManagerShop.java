/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Antonio
 */
public class ManagerShop extends javax.swing.JFrame {

    /**
     * Creates new form ManagerShop
     */
    public ManagerShop() {
        initComponents();
        this.setLocationRelativeTo(null);
        enabledHeader(jLabelClientes);
        enabledPanels(Clientes);
    }
    private boolean normalSize = true;
    private int x,y;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMenus = new javax.swing.JPanel();
        Clientes = new javax.swing.JPanel();
        RRHH = new javax.swing.JPanel();
        Inventario = new javax.swing.JPanel();
        Reservacion = new javax.swing.JPanel();
        Historico = new javax.swing.JPanel();
        Disponibilidad = new javax.swing.JPanel();
        Session = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelRRHH = new javax.swing.JLabel();
        jLabelInventario = new javax.swing.JLabel();
        jLabelReservacion = new javax.swing.JLabel();
        jLabelHistorico = new javax.swing.JLabel();
        jLabelDisponibilidad = new javax.swing.JLabel();
        jLabelSession = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jPanel9.setBackground(new java.awt.Color(0, 98, 175));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sistema de Administracion de Peliculas y empleados");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MAXIN-40-OUT.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MIN-40-OUT.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/CANCEL-GRANDE-OUT.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelMenus.setBackground(new java.awt.Color(0, 98, 175));
        jPanelMenus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanelMenus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clientes.setBackground(new java.awt.Color(0, 98, 175));
        Clientes.setPreferredSize(new java.awt.Dimension(890, 100));
        Clientes.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RRHH.setBackground(new java.awt.Color(0, 98, 175));

        javax.swing.GroupLayout RRHHLayout = new javax.swing.GroupLayout(RRHH);
        RRHH.setLayout(RRHHLayout);
        RRHHLayout.setHorizontalGroup(
            RRHHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        RRHHLayout.setVerticalGroup(
            RRHHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(RRHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Inventario.setBackground(new java.awt.Color(0, 98, 175));
        Inventario.setPreferredSize(new java.awt.Dimension(890, 100));

        javax.swing.GroupLayout InventarioLayout = new javax.swing.GroupLayout(Inventario);
        Inventario.setLayout(InventarioLayout);
        InventarioLayout.setHorizontalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        InventarioLayout.setVerticalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Reservacion.setBackground(new java.awt.Color(0, 98, 175));
        Reservacion.setPreferredSize(new java.awt.Dimension(890, 100));

        javax.swing.GroupLayout ReservacionLayout = new javax.swing.GroupLayout(Reservacion);
        Reservacion.setLayout(ReservacionLayout);
        ReservacionLayout.setHorizontalGroup(
            ReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        ReservacionLayout.setVerticalGroup(
            ReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Reservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Historico.setBackground(new java.awt.Color(0, 98, 175));
        Historico.setPreferredSize(new java.awt.Dimension(890, 100));

        javax.swing.GroupLayout HistoricoLayout = new javax.swing.GroupLayout(Historico);
        Historico.setLayout(HistoricoLayout);
        HistoricoLayout.setHorizontalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        HistoricoLayout.setVerticalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Disponibilidad.setBackground(new java.awt.Color(0, 98, 175));
        Disponibilidad.setPreferredSize(new java.awt.Dimension(890, 100));

        javax.swing.GroupLayout DisponibilidadLayout = new javax.swing.GroupLayout(Disponibilidad);
        Disponibilidad.setLayout(DisponibilidadLayout);
        DisponibilidadLayout.setHorizontalGroup(
            DisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        DisponibilidadLayout.setVerticalGroup(
            DisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Disponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Session.setBackground(new java.awt.Color(0, 98, 175));
        Session.setPreferredSize(new java.awt.Dimension(890, 100));

        javax.swing.GroupLayout SessionLayout = new javax.swing.GroupLayout(Session);
        Session.setLayout(SessionLayout);
        SessionLayout.setHorizontalGroup(
            SessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        SessionLayout.setVerticalGroup(
            SessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelMenus.add(Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelClientes.setBackground(new java.awt.Color(1, 151, 190));
        jLabelClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientes.setText("Clientes");
        jLabelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClientesMouseClicked(evt);
            }
        });

        jLabelRRHH.setBackground(new java.awt.Color(1, 151, 190));
        jLabelRRHH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRRHH.setText("RRHH");
        jLabelRRHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRRHHMouseClicked(evt);
            }
        });

        jLabelInventario.setBackground(new java.awt.Color(1, 151, 190));
        jLabelInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInventario.setText("Inventario");
        jLabelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseClicked(evt);
            }
        });

        jLabelReservacion.setBackground(new java.awt.Color(1, 151, 190));
        jLabelReservacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReservacion.setText("Reservacion");
        jLabelReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReservacionMouseClicked(evt);
            }
        });

        jLabelHistorico.setBackground(new java.awt.Color(1, 151, 190));
        jLabelHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHistorico.setText("Historico Cliente");
        jLabelHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHistoricoMouseClicked(evt);
            }
        });

        jLabelDisponibilidad.setBackground(new java.awt.Color(1, 151, 190));
        jLabelDisponibilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisponibilidad.setText("Disponibilidad");
        jLabelDisponibilidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDisponibilidadMouseClicked(evt);
            }
        });

        jLabelSession.setBackground(new java.awt.Color(1, 151, 190));
        jLabelSession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSession.setText("Session");
        jLabelSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSessionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabelReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelRRHH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSession, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelRRHH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDisponibilidad)
                        .addComponent(jLabelSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/CANCEL-GRANDE-IN.png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/CANCEL-GRANDE-OUT.png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MIN-40-IN.png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MIN-40-OUT.png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(-1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (normalSize) {
            this.setExtendedState(MAXIMIZED_BOTH);
            normalSize = false;
        }else{
            this.setExtendedState(NORMAL);
            normalSize = true;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        if(normalSize){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MAXIN-40-IN.png"))); // NOI18N
        }else{
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/REST-GRANDE-IN.png"))); // NOI18N
        }
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        if(normalSize){
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/MAXIN-40-OUT.png"))); // NOI18N
        }else{
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/res/icons/BOTONERA GRANDE/REST-GRANDE-OUT.png"))); // NOI18N
        }
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        setCurrentLocation(evt);
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if (evt.getClickCount() == 2) {
            if (normalSize) {
                this.setExtendedState(MAXIMIZED_BOTH);
                normalSize = false;
            } else {
                this.setExtendedState(NORMAL);
                normalSize = true;
            }
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Mover(evt);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClientesMouseClicked
        enabledHeader(jLabelClientes);
        enabledPanels(Clientes);
    }//GEN-LAST:event_jLabelClientesMouseClicked

    private void jLabelRRHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRRHHMouseClicked
        enabledHeader(jLabelRRHH);
        enabledPanels(RRHH);
    }//GEN-LAST:event_jLabelRRHHMouseClicked

    private void jLabelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseClicked
        enabledHeader(jLabelInventario);
        enabledPanels(Inventario);
    }//GEN-LAST:event_jLabelInventarioMouseClicked

    private void jLabelReservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservacionMouseClicked
        enabledHeader(jLabelReservacion);
        enabledPanels(Reservacion);
    }//GEN-LAST:event_jLabelReservacionMouseClicked

    private void jLabelHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHistoricoMouseClicked
        enabledHeader(jLabelHistorico);
        enabledPanels(Historico);
    }//GEN-LAST:event_jLabelHistoricoMouseClicked

    private void jLabelDisponibilidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDisponibilidadMouseClicked
        enabledHeader(jLabelDisponibilidad);
        enabledPanels(Disponibilidad);
    }//GEN-LAST:event_jLabelDisponibilidadMouseClicked

    private void jLabelSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSessionMouseClicked
        enabledHeader(jLabelSession);
        enabledPanels(Session);
    }//GEN-LAST:event_jLabelSessionMouseClicked

    private void setCurrentLocation(MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
    }
    
    private void Mover(java.awt.event.MouseEvent evt){
        this.setLocation(this.getLocation().x + evt.getX()- x,this.getLocation().y+evt.getY()- y);
    }  
    
    private void enabledHeader(javax.swing.JLabel enabled) {
        javax.swing.JLabel[] disabled = new javax.swing.JLabel[]
            {jLabelClientes,jLabelRRHH,jLabelInventario,jLabelReservacion,jLabelHistorico,jLabelDisponibilidad,jLabelSession,};
        for (JLabel Label:disabled) {
            if (Label == enabled) {
                Label.setForeground(new java.awt.Color(255, 255, 255));
                Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            } else {

                Label.setForeground(new java.awt.Color(0, 0, 0));
                Label.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
            }
        }
    }

    private void enabledPanels(javax.swing.JPanel enabled) {
        javax.swing.JPanel[] Paneles = new javax.swing.JPanel[]
            {Clientes,Disponibilidad,Historico,Inventario,RRHH,Reservacion,Session};
        for (JPanel Panele : Paneles) {
            if (Panele == enabled) {
                Panele.setVisible(true);
            }else{
                Panele.setVisible(false);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Disponibilidad;
    private javax.swing.JPanel Historico;
    private javax.swing.JPanel Inventario;
    private javax.swing.JPanel RRHH;
    private javax.swing.JPanel Reservacion;
    private javax.swing.JPanel Session;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JLabel jLabelRRHH;
    private javax.swing.JLabel jLabelReservacion;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelMenus;
    // End of variables declaration//GEN-END:variables
}
