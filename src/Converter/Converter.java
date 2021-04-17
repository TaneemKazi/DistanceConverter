/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Taneem
 */
public class Converter extends javax.swing.JFrame {

    private Frame frame;

    /**
     * Creates new form Converter
     */
    public Converter() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jtxtbox1 = new javax.swing.JTextField();
        jtxtbox2 = new javax.swing.JTextField();
        j_Convert = new javax.swing.JLabel();
        j_Exit = new javax.swing.JLabel();
        j_Reset = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(507, 450));
        setMinimumSize(new java.awt.Dimension(507, 450));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Distance Converter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Make a Selection", "Meter (m)", "Milimeter (mm)", "Centimeter (cm)", "Kilometer (km)", "Inch (in)", "Foot / Feet (ft)" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(51, 51, 255));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Make a Selection", "Meter (m)", "Milimeter (mm)", "Centimeter (cm)", "Kilometer (km)", "Inch (in)", "Foot / Feet (ft)" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });

        jtxtbox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtbox1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtbox1ActionPerformed(evt);
            }
        });
        jtxtbox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtbox1KeyTyped(evt);
            }
        });

        jtxtbox2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtbox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtbox2ActionPerformed(evt);
            }
        });
        jtxtbox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtbox2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtbox2KeyTyped(evt);
            }
        });

        j_Convert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j_Convert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_Convert.setText("Convert");
        j_Convert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Convert.setOpaque(true);
        j_Convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_ConvertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j_ConvertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j_ConvertMouseExited(evt);
            }
        });
        j_Convert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j_ConvertKeyPressed(evt);
            }
        });

        j_Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_Exit.setText("Exit");
        j_Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Exit.setOpaque(true);
        j_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j_ExitMouseExited(evt);
            }
        });

        j_Reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j_Reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_Reset.setText("Reset");
        j_Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Reset.setOpaque(true);
        j_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_ResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j_ResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j_ResetMouseExited(evt);
            }
        });

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(j_Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtbox1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void j_ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ResetMouseClicked
        if (JOptionPane.showConfirmDialog(frame, "Confirm to RESET !", "Distance Converter",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            //System.exit(0);

            jComboBox1.getModel().setSelectedItem("Make a Selection");
            jComboBox2.getModel().setSelectedItem("Make a Selection");
            jtxtbox1.setText("");
            jtxtbox2.setText("");
        }

    }//GEN-LAST:event_j_ResetMouseClicked

    private void j_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ExitMouseClicked
        frame = new Frame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit.", "Distance Converter",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_j_ExitMouseClicked

    private void j_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ExitMouseEntered
        if (j_Exit.isEnabled() == true) {
            j_Exit.setBackground(Color.red);
            j_Exit.setForeground(Color.black);
            //btn_equal.setFont(new Font(btn_equal.getFont().getName(),Font.BOLD,38));
        }
    }//GEN-LAST:event_j_ExitMouseEntered

    private void j_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ResetMouseEntered
        if (j_Reset.isEnabled() == true) {
            j_Reset.setBackground(Color.orange);
            j_Reset.setForeground(Color.black);
            //btn_equal.setFont(new Font(btn_equal.getFont().getName(),Font.BOLD,38));
        }
    }//GEN-LAST:event_j_ResetMouseEntered

    private void j_ConvertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ConvertMouseEntered
        if (j_Convert.isEnabled() == true) {
            j_Convert.setBackground(Color.green);
            j_Convert.setForeground(Color.black);
            //btn_equal.setFont(new Font(btn_equal.getFont().getName(),Font.BOLD,38));
        }
    }//GEN-LAST:event_j_ConvertMouseEntered

    private void j_ConvertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ConvertMouseExited
        if (j_Convert.isEnabled() == true) {
            j_Convert.setBackground(new Color(204, 204, 204));
            j_Convert.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_j_ConvertMouseExited

    private void j_ResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ResetMouseExited
        if (j_Reset.isEnabled() == true) {
            j_Reset.setBackground(new Color(204, 204, 204));
            j_Reset.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_j_ResetMouseExited

    private void j_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ExitMouseExited
        if (j_Exit.isEnabled() == true) {
            j_Exit.setBackground(new Color(204, 204, 204));
            j_Exit.setForeground(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_j_ExitMouseExited

    private void jtxtbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtbox1ActionPerformed

    }//GEN-LAST:event_jtxtbox1ActionPerformed

    private void jtxtbox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtbox1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || KeyEvent.VK_BACK_SPACE == c || KeyEvent.VK_DELETE == c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtxtbox1KeyTyped

    private void jtxtbox2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtbox2KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || KeyEvent.VK_BACK_SPACE == c || KeyEvent.VK_DELETE == c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtxtbox2KeyTyped

    private void j_ConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ConvertMouseClicked

        //int Number = Integer.parseInt(jtxtbox1.getText().trim());
        //Meter
        double a = Double.parseDouble(jtxtbox1.getText().trim());
        //int a = Integer.parseInt(jtxtbox1.getText().trim());
        if (jComboBox1.getSelectedItem().equals("Meter (m)")) {
            if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 100;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 1000;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 1000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 39.3700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 0.3048;
            }
        } //Milimeter
        else if (jComboBox1.getSelectedItem().equals("Milimeter (mm)")) {
            if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 1000;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a / 10;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 1000000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 0.0393700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 304.8;
            }
        } //Centimeter
        else if (jComboBox1.getSelectedItem().equals("Centimeter (cm)")) {
            if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 100;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 10;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 100000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 0.393700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a /30.48;
            }
        } //Kilometer
        else if (jComboBox1.getSelectedItem().equals("Kilometer (km)")) {
            if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a * 1000;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 1000000;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 100000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 39370.0787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 0.0003048;
            }
        } //INCH
        else if (jComboBox1.getSelectedItem().equals("Inch (in)")) {
            if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 39.3700787;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 25.4;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 2.54;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a * 0.0000254;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 12;
            }
        }
        //Foot
        else if (jComboBox1.getSelectedItem().equals("Foot / Feet (ft)")) {
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 3.28084;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 304.8;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 30.48;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a * 0.0003048;
            }
            else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 12;
            }
        }
        jtxtbox2.setText("" + a);

    }//GEN-LAST:event_j_ConvertMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Make a Selection")) {
            jtxtbox1.setText("");
            //jtxtbox2.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedItem().equals("Make a Selection")) {
            //jtxtbox1.setText("");
            jtxtbox2.setText("");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jtxtbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtbox2ActionPerformed

    private void j_ConvertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_ConvertKeyPressed
        // TODO add your handling code here: 
    }//GEN-LAST:event_j_ConvertKeyPressed

    private void jtxtbox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtbox2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtbox2KeyPressed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed

        //int Number = Integer.parseInt(jtxtbox1.getText().trim());
        //Meter
        double a = Double.parseDouble(jtxtbox1.getText().trim());
        if (jComboBox1.getSelectedItem().equals("Meter (m)")) {
            if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 100;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 1000;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 1000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 39.3700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 0.3048;
            }
        } //Milimeter
        else if (jComboBox1.getSelectedItem().equals("Milimeter (mm)")) {
            if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 1000;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a / 10;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 1000000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 0.0393700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 304.8;
            }
        } //Centimeter
        else if (jComboBox1.getSelectedItem().equals("Centimeter (cm)")) {
            if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 100;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 10;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a / 100000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 0.393700787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a /30.48;
            }
        } //Kilometer
        else if (jComboBox1.getSelectedItem().equals("Kilometer (km)")) {
            if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a * 1000;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 1000000;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 100000;
            } else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 39370.0787;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 0.0003048;
            }
        } //INCH
        else if (jComboBox1.getSelectedItem().equals("Inch (in)")) {
            if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 39.3700787;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 25.4;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 2.54;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a * 0.0000254;
            }
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                a = a / 12;
            }
        }
        //Foot
        else if (jComboBox1.getSelectedItem().equals("Foot / Feet (ft)")) {
            if (jComboBox2.getSelectedItem().equals("Foot / Feet (ft)")) {
                //a = a;
            } else if (jComboBox2.getSelectedItem().equals("Meter (m)")) {
                a = a / 3.28084;
            } else if (jComboBox2.getSelectedItem().equals("Milimeter (mm)")) {
                a = a * 304.8;
            } else if (jComboBox2.getSelectedItem().equals("Centimeter (cm)")) {
                a = a * 30.48;
            } else if (jComboBox2.getSelectedItem().equals("Kilometer (km)")) {
                a = a * 0.0003048;
            }
            else if (jComboBox2.getSelectedItem().equals("Inch (in)")) {
                a = a * 12;
            }
        }
        jtxtbox2.setText("" + a);
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        /*if (jPanel1.isEnabled() == true) {
         jPanel1.setBackground(new Color(0, 0, 0));
         jPanel1.setForeground(new Color(0, 0, 0));
         }*/
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //if (jPanel1.isEnabled() == true) {
        jPanel1.setBackground(new Color(0, 0, 0));
        jPanel1.setForeground(new Color(0, 0, 0));
        //}
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        /*if (jPanel1.isEnabled() == true) {
         jPanel1.setBackground(new Color(204, 204, 204));
         jPanel1.setForeground(new Color(0, 0, 0));
         }*/
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        /*jPanel1.setBackground(new Color(240, 240, 240));
         jPanel1.setForeground(new Color(0, 0, 0));*/
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Converter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel j_Convert;
    private javax.swing.JLabel j_Exit;
    private javax.swing.JLabel j_Reset;
    private javax.swing.JTextField jtxtbox1;
    private javax.swing.JTextField jtxtbox2;
    // End of variables declaration//GEN-END:variables
}
