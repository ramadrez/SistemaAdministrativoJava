/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuarios;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    LocalDateTime fechaHoraActual = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String fechaHoraFormateada = fechaHoraActual.format(formatter);

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setTitle("Login - Inversiones El Costeño 2023");

        UserTextField.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);

        jPasswordField.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        setIconImage(getIconImage());

    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon/iconlogin.png"));
        return retValue;
    }

    public void keyPressed(KeyEvent e) {
        if (UserTextField.getText().equals("Ingrese su nombre de usuario")) {
            UserTextField.setText("");
            UserTextField.setForeground(Color.black);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new vista.JpanelRound();
        Photo = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Passwd = new javax.swing.JLabel();
        UserTextField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Header = new vista.JpanelRound();
        ExitButton = new vista.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        ButtonLogin = new vista.JpanelRound();
        ButtonLoginTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 102));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(40);
        jpanelRound1.setRoundBottomRight(40);
        jpanelRound1.setRoundTopLeft(40);
        jpanelRound1.setRoundTopRight(40);
        jpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Photo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Photo.setText("Logo");
        jpanelRound1.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 140));

        User.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        User.setText("Usuario");
        jpanelRound1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        Passwd.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Passwd.setText("Contraseña");
        jpanelRound1.add(Passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        UserTextField.setForeground(java.awt.Color.gray);
        UserTextField.setText("Ingrese su nombre de usuario");
        UserTextField.setBorder(null);
        UserTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTextFieldMousePressed(evt);
            }
        });
        UserTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserTextFieldKeyPressed(evt);
            }
        });
        jpanelRound1.add(UserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 180, -1));

        jPasswordField.setForeground(java.awt.Color.gray);
        jPasswordField.setText("********");
        jPasswordField.setBorder(null);
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldMousePressed(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });
        jpanelRound1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, -1));
        jpanelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, 10));
        jpanelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 180, 10));

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
        ExitButton.setRoundTopRight(50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cierre.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 393, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpanelRound1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ButtonLogin.setBackground(new java.awt.Color(3, 150, 166));
        ButtonLogin.setRoundBottomLeft(16);
        ButtonLogin.setRoundBottomRight(16);
        ButtonLogin.setRoundTopLeft(16);
        ButtonLogin.setRoundTopRight(16);

        ButtonLoginTxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ButtonLoginTxt.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLoginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonLoginTxt.setText("Ingresar");
        ButtonLoginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonLoginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLoginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLoginTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonLoginTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ButtonLoginLayout = new javax.swing.GroupLayout(ButtonLogin);
        ButtonLogin.setLayout(ButtonLoginLayout);
        ButtonLoginLayout.setHorizontalGroup(
            ButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonLoginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        ButtonLoginLayout.setVerticalGroup(
            ButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonLoginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jpanelRound1.add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTextFieldMousePressed
        if (UserTextField.getText().equals("Ingrese su nombre de usuario")) {
            UserTextField.setText("");
            UserTextField.setForeground(Color.black);
        }

        if (String.valueOf(jPasswordField.getPassword()).isEmpty()) {
            jPasswordField.setText("********");
            jPasswordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UserTextFieldMousePressed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jPasswordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMousePressed
        if (String.valueOf(jPasswordField.getPassword()).equals("********")) {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }

        if (UserTextField.getText().isEmpty()) {
            UserTextField.setText("Ingrese su nombre de usuario");
            UserTextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordFieldMousePressed

    private void UserTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserTextFieldKeyPressed
        keyPressed(evt);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (String.valueOf(jPasswordField.getPassword()).equals("********")) {
                jPasswordField.setText("");
                jPasswordField.setForeground(Color.black);
            }

            if (UserTextField.getText().isEmpty()) {
                UserTextField.setText("Ingrese su nombre de usuario");
                UserTextField.setForeground(Color.gray);
            }
            jPasswordField.requestFocus();
        }
    }//GEN-LAST:event_UserTextFieldKeyPressed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Login();
        }

        if (evt.getKeyCode() == KeyEvent.VK_TAB) {

            if (UserTextField.getText().equals("Ingrese su nombre de usuario")) {
                UserTextField.setText("");
                UserTextField.setForeground(Color.black);
            }

            if (String.valueOf(jPasswordField.getPassword()).isEmpty()) {
                jPasswordField.setText("********");
                jPasswordField.setForeground(Color.gray);
            }
            UserTextField.requestFocus();
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ButtonLoginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginTxtMouseEntered
        ButtonLogin.setBackground(new Color(11, 105, 139));
    }//GEN-LAST:event_ButtonLoginTxtMouseEntered

    private void ButtonLoginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginTxtMouseExited
        ButtonLogin.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_ButtonLoginTxtMouseExited

    private void ButtonLoginTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginTxtMousePressed
        this.Login();
    }//GEN-LAST:event_ButtonLoginTxtMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.JpanelRound ButtonLogin;
    private javax.swing.JLabel ButtonLoginTxt;
    private vista.JpanelRound ExitButton;
    private vista.JpanelRound Header;
    private javax.swing.JLabel Passwd;
    private javax.swing.JLabel Photo;
    private javax.swing.JLabel User;
    private javax.swing.JTextField UserTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private vista.JpanelRound jpanelRound1;
    // End of variables declaration//GEN-END:variables

    //
    private void Login() {

        if (!UserTextField.getText().isEmpty() && !jPasswordField.getText().isEmpty()) {

            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            Usuarios usuario = new Usuarios();
            usuario.setUsuario(UserTextField.getText().trim());
            usuario.setPass(jPasswordField.getText().trim());
            usuario.setUltima_sesion(fechaHoraFormateada);

            if (controlUsuario.loginUser(usuario)) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
                controlUsuario.Sesion(usuario);
                LogDeUsuarios();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
                }

                controlUsuario.obtenerDatos(usuario);
                if (controlUsuario.getTipoDeUsuario().equals("Administrador")) {
                    MenuAdmin menu = new MenuAdmin();
                    menu.ObtenerDatos(UserTextField.getText().trim());
                    try {
                        UserTemporal(UserTextField.getText().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    menu.setVisible(true);
                } else {
                    Caja caja = new Caja();
                    CajaClientes clientes = new CajaClientes(caja);
                    TasaDolares td = new TasaDolares(caja, clientes);
                    try {
                        UserTemporal(UserTextField.getText().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(LeerDolar() == null){
                    td.setVisible(true);
                    }else{
                    caja.setVisible(true);
                    clientes.setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");

        }
    }

    private void LogDeUsuarios() {

        Usuarios usuario = new Usuarios();
        usuario.setUsuario(UserTextField.getText().trim());
        String Log = "\nEl usuario: " + usuario.getUsuario() + " ha iniciado sesion el: " + fechaHoraFormateada;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/datos/logs/Login.txt", true))) {
            writer.write(Log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void UserTemporal(String user) throws IOException {

        FileWriter User = new FileWriter("src/datos/temporal/user.txt");
        PrintWriter Escritor = new PrintWriter(User);

        Escritor.println(user);
        User.close();

    }
    
    public String LeerDolar() {
        FileReader archivo;
        BufferedReader lector;
        String pass = null;

        try {
            archivo = new FileReader("src/datos/temporal/dolar.txt");
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                pass = lector.readLine();
                lector.close();
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        return pass;

    }
}
