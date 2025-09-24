/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_DB;
import controlador.Ctrl_Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuarios;

/**
 *
 * @author Rama
 */
public class CrearUsuarioAdmin extends javax.swing.JFrame {

    Usuarios u = new Usuarios();
    Ctrl_Usuario cu = new Ctrl_Usuario();
    Ctrl_DB cdb = new Ctrl_DB();
    Login login = new Login();

    int xMouse;
    int yMouse;

    public CrearUsuarioAdmin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setTitle("Registro de Administrador - Inversiones El Costeño 2023");
        setIconImage(getIconImage());
    }
    
     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon/iconAdministrador.png"));
        return retValue;
    }

    public boolean ValidarTelefono() {
        boolean res = telefonoTxt.getText().matches("(0416|0426|0424|0414|0412|0261)\\d{7}");
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new vista.JpanelRound();
        RegistroTitulo = new javax.swing.JLabel();
        ButtonRegistrar = new vista.JpanelRound();
        TxtRegistrar = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Rol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        contraseñaTxt = new javax.swing.JPasswordField();
        Header = new vista.JpanelRound();
        ExitButton = new vista.JpanelRound();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setPreferredSize(new java.awt.Dimension(700, 450));
        jpanelRound1.setRoundBottomLeft(20);
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopLeft(20);
        jpanelRound1.setRoundTopRight(20);

        RegistroTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        RegistroTitulo.setText("Usuario Administrador Principal");

        ButtonRegistrar.setBackground(new java.awt.Color(156, 211, 216));
        ButtonRegistrar.setPreferredSize(new java.awt.Dimension(100, 50));
        ButtonRegistrar.setRoundBottomLeft(10);
        ButtonRegistrar.setRoundBottomRight(10);
        ButtonRegistrar.setRoundTopLeft(10);
        ButtonRegistrar.setRoundTopRight(10);

        TxtRegistrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        TxtRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        TxtRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtRegistrar.setText("Registrar");
        TxtRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtRegistrar.setPreferredSize(new java.awt.Dimension(100, 50));
        TxtRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxtRegistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtRegistrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ButtonRegistrarLayout = new javax.swing.GroupLayout(ButtonRegistrar);
        ButtonRegistrar.setLayout(ButtonRegistrarLayout);
        ButtonRegistrarLayout.setHorizontalGroup(
            ButtonRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        ButtonRegistrarLayout.setVerticalGroup(
            ButtonRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Usuario.setText("Usuario");

        usuarioTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usuarioTxt.setBorder(null);
        usuarioTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTxtKeyTyped(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Contraseña.setText("Contraseña");

        Nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Nombre.setText("Nombre");

        nombreTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreTxt.setBorder(null);
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTxtKeyTyped(evt);
            }
        });

        Apellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Apellido.setText("Apellido");

        apellidoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellidoTxt.setBorder(null);
        apellidoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoTxtKeyTyped(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cedula.setText("Cédula");

        cedulaTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cedulaTxt.setBorder(null);
        cedulaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaTxtKeyTyped(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        jSeparator11.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        jSeparator12.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        jSeparator13.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        jSeparator14.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 150, 166));
        jLabel2.setText("*");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 150, 166));
        jLabel3.setText("*");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 150, 166));
        jLabel1.setText("Campos Obligatorios (*)");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 150, 166));
        jLabel5.setText("Datos Opcionales");

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor" }));
        jComboBox1.setEnabled(false);

        Rol.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Rol.setText("Rol");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 150, 166));
        jLabel6.setText("*");

        Telefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Telefono.setText("Teléfono");

        telefonoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        telefonoTxt.setBorder(null);
        telefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyTyped(evt);
            }
        });

        jSeparator15.setForeground(new java.awt.Color(6, 150, 166));
        jSeparator15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 150, 166)));

        contraseñaTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        contraseñaTxt.setBorder(null);
        contraseñaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaTxtKeyTyped(evt);
            }
        });

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setMinimumSize(new java.awt.Dimension(430, 40));
        Header.setRoundTopLeft(50);
        Header.setRoundTopRight(50);
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setPreferredSize(new java.awt.Dimension(37, 34));
        ExitButton.setRoundTopRight(20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cierre.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(RegistroTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(Usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(180, 180, 180)
                                .addComponent(Contraseña)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addGap(190, 190, 190)
                                .addComponent(Apellido))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cedula)
                                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefono)
                                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Rol)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistroTitulo)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Usuario)
                                        .addComponent(jLabel2))
                                    .addComponent(Contraseña)
                                    .addComponent(jLabel6))
                                .addGap(13, 13, 13)
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                                        .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                                        .addComponent(contraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rol, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))
                                .addGap(13, 13, 13)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(Apellido))
                        .addGap(13, 13, 13)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(Cedula)
                                .addGap(13, 13, 13)
                                .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelRound1Layout.createSequentialGroup()
                                .addComponent(Telefono)
                                .addGap(13, 13, 13)
                                .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void contraseñaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaTxtKeyTyped
        char ch = evt.getKeyChar();
        if (contraseñaTxt.getText().length() >= 100 || (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && (ch < '0' || ch > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_contraseñaTxtKeyTyped

    private void contraseñaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            contraseñaTxt.setText(contraseñaTxt.getText() + " ");
        }
    }//GEN-LAST:event_contraseñaTxtKeyPressed

    private void telefonoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyTyped
        char ch = evt.getKeyChar();
        if (telefonoTxt.getText().length() >= 11 || ch < '0' || ch > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoTxtKeyTyped

    private void cedulaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTxtKeyTyped
        char ch = evt.getKeyChar();
        if (cedulaTxt.getText().length() >= 8 || ch < '0' || ch > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaTxtKeyTyped

    private void apellidoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTxtKeyTyped
        char ch = evt.getKeyChar();
         if (apellidoTxt.getText().length() >= 30 || (!Character.isLetter(ch) && ch != ' ')) { evt.consume(); }
    }//GEN-LAST:event_apellidoTxtKeyTyped

    private void nombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyTyped
        char ch = evt.getKeyChar();
        if (nombreTxt.getText().length() >= 30 || (!Character.isLetter(ch) && ch != ' ')) { evt.consume(); }
    }//GEN-LAST:event_nombreTxtKeyTyped

    private void usuarioTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTxtKeyTyped
        char ch = evt.getKeyChar();
        if (usuarioTxt.getText().length() >= 15 || (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && (ch < '0' || ch > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_usuarioTxtKeyTyped

    private void TxtRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRegistrarMousePressed
        u.setUsuario(usuarioTxt.getText());
        u.setNombre(nombreTxt.getText());
        u.setApellido(apellidoTxt.getText());
        u.setCedula(cedulaTxt.getText());
        u.setTelefono(telefonoTxt.getText());
        u.setTipoUsuario(jComboBox1.getSelectedItem().toString());
        u.setPass(contraseñaTxt.getText());
        if (!cdb.Administrador()) {
            if (!usuarioTxt.getText().isEmpty() && !contraseñaTxt.getText().isEmpty()) {
                //if de metodo de duplicacion
                if (!cu.duplicados(usuarioTxt.getText().trim())) {
                    //If de validacion de Numeros telefonicos
                    if (ValidarTelefono() == true || telefonoTxt.getText().isEmpty()) {
                        cu.insertar(u.getUsuario(), u.getNombre(), u.getApellido(), u.getCedula(), u.getTelefono(), u.getTipoUsuario(), u.getPass(), u.getUltima_sesion());
                        JOptionPane.showMessageDialog(null, "Administrador registrado con Exito");
                        this.dispose();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        login.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Telefono no Valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya esta registrado");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar al Usuario ( Usuario y Contraseña (Obligatorios) )");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ya hay un administrador registrado");
        }
    }//GEN-LAST:event_TxtRegistrarMousePressed

    private void TxtRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRegistrarMouseExited
        ButtonRegistrar.setBackground(new Color(156, 211, 216));
    }//GEN-LAST:event_TxtRegistrarMouseExited

    private void TxtRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRegistrarMouseEntered
        ButtonRegistrar.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_TxtRegistrarMouseEntered

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
            java.util.logging.Logger.getLogger(CrearUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private vista.JpanelRound ButtonRegistrar;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Contraseña;
    private vista.JpanelRound ExitButton;
    private vista.JpanelRound Header;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel RegistroTitulo;
    private javax.swing.JLabel Rol;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TxtRegistrar;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JPasswordField contraseñaTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator6;
    private vista.JpanelRound jpanelRound1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
