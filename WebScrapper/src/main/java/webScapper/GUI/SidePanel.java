/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package webScapper.GUI;

import java.awt.Color;
import static java.awt.SystemColor.text;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import webScapper.WebScrapper;

/**
 *
 * @author Lenovo
 */
public class SidePanel extends javax.swing.JPanel {

    WebScrapper web;
    public SidePanel() {
        initComponents();
        setBackground(new Color(0,0,0,80));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pak = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pakl = new javax.swing.JLabel();
        near = new javax.swing.JPanel();
        nearl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        world = new javax.swing.JPanel();
        worldl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sports = new javax.swing.JPanel();
        sportl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        entertainment = new javax.swing.JPanel();
        entertainmentl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        science = new javax.swing.JPanel();
        sciencel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        homel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        exitl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 34, 34));
        setPreferredSize(new java.awt.Dimension(265, 623));

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\categories (2).png")); // NOI18N
        jLabel1.setText("اقسام");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pak.setBackground(new java.awt.Color(251, 249, 249,80));
        pak.setOpaque(false);
        pak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pakMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\pakistan.png")); // NOI18N

        pakl.setBackground(new java.awt.Color(255, 255, 255));
        pakl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pakl.setForeground(new java.awt.Color(255, 255, 255));
        pakl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button.png")); // NOI18N
        pakl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paklMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paklMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paklMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pakLayout = new javax.swing.GroupLayout(pak);
        pak.setLayout(pakLayout);
        pakLayout.setHorizontalGroup(
            pakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pakLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pakl)
                .addGap(62, 62, 62)
                .addComponent(jLabel2))
        );
        pakLayout.setVerticalGroup(
            pakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pakLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pakl, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        near.setOpaque(false);
        near.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nearMouseExited(evt);
            }
        });

        nearl.setBackground(new java.awt.Color(255, 255, 255));
        nearl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nearl.setForeground(new java.awt.Color(255, 255, 255));
        nearl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (1).png")); // NOI18N
        nearl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nearlMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\near-me.png")); // NOI18N

        javax.swing.GroupLayout nearLayout = new javax.swing.GroupLayout(near);
        near.setLayout(nearLayout);
        nearLayout.setHorizontalGroup(
            nearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nearl)
                .addGap(60, 60, 60)
                .addComponent(jLabel9))
        );
        nearLayout.setVerticalGroup(
            nearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nearLayout.createSequentialGroup()
                .addGroup(nearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nearl, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        world.setOpaque(false);

        worldl.setBackground(new java.awt.Color(255, 255, 255));
        worldl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        worldl.setForeground(new java.awt.Color(255, 255, 255));
        worldl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (2).png")); // NOI18N
        worldl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                worldlMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\world.png")); // NOI18N

        javax.swing.GroupLayout worldLayout = new javax.swing.GroupLayout(world);
        world.setLayout(worldLayout);
        worldLayout.setHorizontalGroup(
            worldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(worldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(worldl)
                .addGap(75, 75, 75)
                .addComponent(jLabel10))
        );
        worldLayout.setVerticalGroup(
            worldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(worldLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(worldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(worldl, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sports.setOpaque(false);

        sportl.setBackground(new java.awt.Color(255, 255, 255));
        sportl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sportl.setForeground(new java.awt.Color(255, 255, 255));
        sportl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (3).png")); // NOI18N
        sportl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sportlMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\crickket.png")); // NOI18N

        javax.swing.GroupLayout sportsLayout = new javax.swing.GroupLayout(sports);
        sports.setLayout(sportsLayout);
        sportsLayout.setHorizontalGroup(
            sportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sportsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sportl)
                .addGap(73, 73, 73)
                .addComponent(jLabel11))
        );
        sportsLayout.setVerticalGroup(
            sportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sportsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sportl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        entertainment.setOpaque(false);

        entertainmentl.setBackground(new java.awt.Color(255, 255, 255));
        entertainmentl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        entertainmentl.setForeground(new java.awt.Color(255, 255, 255));
        entertainmentl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (4).png")); // NOI18N
        entertainmentl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entertainmentlMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\movies.png")); // NOI18N

        javax.swing.GroupLayout entertainmentLayout = new javax.swing.GroupLayout(entertainment);
        entertainment.setLayout(entertainmentLayout);
        entertainmentLayout.setHorizontalGroup(
            entertainmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entertainmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entertainmentl)
                .addGap(60, 60, 60)
                .addComponent(jLabel12))
        );
        entertainmentLayout.setVerticalGroup(
            entertainmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entertainmentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(entertainmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entertainmentl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        science.setOpaque(false);

        sciencel.setBackground(new java.awt.Color(255, 255, 255));
        sciencel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sciencel.setForeground(new java.awt.Color(255, 255, 255));
        sciencel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (5).png")); // NOI18N
        sciencel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sciencelMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\science.png")); // NOI18N

        javax.swing.GroupLayout scienceLayout = new javax.swing.GroupLayout(science);
        science.setLayout(scienceLayout);
        scienceLayout.setHorizontalGroup(
            scienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scienceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sciencel)
                .addGap(66, 66, 66)
                .addComponent(jLabel13))
        );
        scienceLayout.setVerticalGroup(
            scienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scienceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(scienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sciencel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setOpaque(false);

        homel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        homel.setForeground(new java.awt.Color(255, 255, 255));
        homel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (6).png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\home_1.png")); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homel)
                .addGap(56, 56, 56)
                .addComponent(jLabel15))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setOpaque(false);

        exitl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        exitl.setForeground(new java.awt.Color(255, 255, 255));
        exitl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\button (7).png")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\logos\\logout (1).png")); // NOI18N

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitl)
                .addGap(68, 68, 68)
                .addComponent(jLabel17))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(near, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(world, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(entertainment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(science, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(near, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(world, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(science, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pakMouseEntered
        
    }//GEN-LAST:event_pakMouseEntered

    private void pakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pakMouseExited
        
    }//GEN-LAST:event_pakMouseExited

    private void nearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nearMouseEntered
        
    }//GEN-LAST:event_nearMouseEntered

    private void nearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nearMouseExited
        
    }//GEN-LAST:event_nearMouseExited

    private void paklMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paklMouseExited
        
    }//GEN-LAST:event_paklMouseExited

    private void paklMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paklMouseEntered
        
    }//GEN-LAST:event_paklMouseEntered

    private void paklMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paklMouseClicked
        setTextArea("Pakistan");
    }//GEN-LAST:event_paklMouseClicked

    private void nearlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nearlMouseClicked
        setTextArea("Near");
    }//GEN-LAST:event_nearlMouseClicked

    private void worldlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_worldlMouseClicked
        setTextArea("World");
    }//GEN-LAST:event_worldlMouseClicked

    private void sportlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sportlMouseClicked
        setTextArea("Sports");
    }//GEN-LAST:event_sportlMouseClicked

    private void entertainmentlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entertainmentlMouseClicked
        setTextArea("Entertainment");
    }//GEN-LAST:event_entertainmentlMouseClicked

    private void sciencelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sciencelMouseClicked
        setTextArea("Science");
    }//GEN-LAST:event_sciencelMouseClicked
    public void setTextArea(String file){
        TextArea pane=new TextArea();
        WebScrapper webpane=new WebScrapper();
        try {
            pane.getText().setText(webpane.readFile(file));
            pane.getNoOfWord().setText("Words: "+webpane.noOfWords());
            pane.getNoOfUnique().setText("Unique Words: "+webpane.uniqueWords());
            pane.getNoOfstory().setText("Stories:"+100);
        } catch (IOException ex) {
            Logger.getLogger(SidePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entertainment;
    private javax.swing.JLabel entertainmentl;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel exitl;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel near;
    private javax.swing.JLabel nearl;
    private javax.swing.JPanel pak;
    private javax.swing.JLabel pakl;
    private javax.swing.JPanel science;
    private javax.swing.JLabel sciencel;
    private javax.swing.JLabel sportl;
    private javax.swing.JPanel sports;
    private javax.swing.JPanel world;
    private javax.swing.JLabel worldl;
    // End of variables declaration//GEN-END:variables
}
