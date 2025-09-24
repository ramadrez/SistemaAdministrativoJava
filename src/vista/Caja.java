/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_Clientes;
import controlador.Ctrl_RegistrarVenta;
import controlador.Ctrl_Usuario;
import controlador.VentaPDF;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;
import modelo.Usuarios;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.cabecera_venta;
import modelo.detalles_venta;

/**
 *
 * @author Rama
 */
public class Caja extends javax.swing.JFrame implements Runnable {

    Ctrl_Usuario cu = new Ctrl_Usuario();
    Usuarios u = new Usuarios();

    Ctrl_Clientes cc = new Ctrl_Clientes();
    Clientes c = new Clientes();

    LocalDate fechaActual = LocalDate.now();
    String hora, minutos, segundos;

    cabecera_venta cv = new cabecera_venta();
    detalles_venta dv = new detalles_venta();
    Ctrl_RegistrarVenta crv = new Ctrl_RegistrarVenta();
    VentaPDF vpd = new VentaPDF();

    public static DefaultTableModel Productos = new DefaultTableModel();

    private int idDetallesV;
    private int idCabecera;
    private int cantidadProductoBBDD;
    private int factura;
    private String codigo;
    private String producto;
    private double precioUnitario;
    private int porcentajeIva;

    private int cantidad;
    private double subtotal;
    private double iva;
    private double totalPagar;
    private int aux = 1;

    //Variables globales:
    private double subtotalGeneral = 0.00;
    private double ivaGeneral = 0.00;
    private double totalGeneralBs = 0.00;
    private double totalGeneralDs = 0.00;

    Thread hilo;

    public Caja() {
        initComponents();
        this.setSize(new Dimension(1280, 720));
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Caja - Inversiones El Costeño 2023");
        Tabla.getTableHeader().setDefaultRenderer(new Caja.HeaderColor());
        txtFecha.setText("Fecha: " + fechaActual);
        ObtenerUsuario(LeerUsuario());
        dolar();
        try {
            SobreescribirCliente("");
        } catch (IOException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }

        hilo = new Thread(this);
        hilo.start();
        setIconImage(getIconImage());

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon/iconcaja.png"));
        return retValue;
    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);

            setBackground(new java.awt.Color(255, 255, 255));
            return this;
        }

    }

    public void dolar() {
        String dolar = LeerDolar();

        jLabel4.setText("$ Dolar: " + dolar + "Bs");
    }

    public void factura() throws IOException {
        int factura = LeerFactura();

        if (factura == 0) {
            factura++;
            CrearTxtFactura(factura);
            jLabel2.setText("Factura: " + factura);
        } else if (factura >= 1) {
            factura++;
            CrearTxtFactura(factura);
            jLabel2.setText("Factura: " + factura);
        }
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(calendario.HOUR_OF_DAY) > 9 ? "" + calendario.get(calendario.HOUR_OF_DAY) : "0" + calendario.get(calendario.HOUR_OF_DAY);
        minutos = calendario.get(calendario.MINUTE) > 9 ? "" + calendario.get(calendario.MINUTE) : "0" + calendario.get(calendario.MINUTE);
        segundos = calendario.get(calendario.SECOND) > 9 ? "" + calendario.get(calendario.SECOND) : "0" + calendario.get(calendario.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();

        while (current == hilo) {
            hora();
            txtHora.setText("Hora: " + hora + ":" + minutos + ":" + segundos);
        }
    }

    public void ObtenerUsuario(String user) {
        u.setUsuario(user);
        cu.obtenerDatos(u);

        Cajero.setText("Cajero: " + cu.getNombre() + " " + cu.getApellido());
    }

    public void ObtenerCliente(String cliente) {
        c.setCedula(cliente);
        cc.obtenerCliente(c);
        txtJlabelCliente.setText("Cliente: " + cc.getNombre() + " " + cc.getApellido());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        bordeSuperior = new javax.swing.JPanel();
        bordeIzquierdo = new javax.swing.JPanel();
        bordeDerecho = new javax.swing.JPanel();
        bordeInferior = new javax.swing.JPanel();
        centro = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        baner = new javax.swing.JLabel();
        txtLogo = new javax.swing.JPanel();
        comprea_y_venta = new javax.swing.JLabel();
        jpanelRound3 = new vista.JpanelRound();
        jpanelRound1 = new vista.JpanelRound();
        contenedorDeTotales5 = new vista.JpanelRound();
        subtotal5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        iva5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        totalBs5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        totalDolares5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        precioSubtotal5 = new javax.swing.JPanel();
        txtSubtotal5 = new javax.swing.JLabel();
        precioIva5 = new javax.swing.JPanel();
        txtIva5 = new javax.swing.JLabel();
        precioBs5 = new javax.swing.JPanel();
        txtBolivares5 = new javax.swing.JLabel();
        precioDolares5 = new javax.swing.JPanel();
        txtDolares5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        subtotal6 = new javax.swing.JPanel();
        Cajero = new javax.swing.JLabel();
        subtotal7 = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        subtotal8 = new javax.swing.JPanel();
        txtHora = new javax.swing.JLabel();
        jpanelRound2 = new vista.JpanelRound();
        contenedor = new javax.swing.JPanel();
        BordeDerechoTabla = new javax.swing.JPanel();
        panelDeDatos = new javax.swing.JPanel();
        separador = new javax.swing.JPanel();
        paneldeDatos2 = new vista.JpanelRound();
        txtCliente = new javax.swing.JPanel();
        txtJlabelCliente = new javax.swing.JLabel();
        txtFactura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonBuscar = new vista.JpanelRound();
        txtBuscar = new javax.swing.JLabel();
        txtFactura1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bordeIzquierdoTabla = new javax.swing.JPanel();
        panelDeBotones = new vista.JpanelRound();
        jpanelRound4 = new vista.JpanelRound();
        jpanelRound7 = new vista.JpanelRound();
        jLabel11 = new javax.swing.JLabel();
        jpanelRound8 = new vista.JpanelRound();
        jLabel8 = new javax.swing.JLabel();
        jpanelRound9 = new vista.JpanelRound();
        jpanelRound10 = new vista.JpanelRound();
        jLabel7 = new javax.swing.JLabel();
        jpanelRound11 = new vista.JpanelRound();
        jLabel9 = new javax.swing.JLabel();
        jpanelRound12 = new vista.JpanelRound();
        jLabel10 = new javax.swing.JLabel();
        jpanelRound5 = new vista.JpanelRound();
        jpanelRound6 = new vista.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelDeTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Principal.setBackground(new java.awt.Color(51, 51, 255));
        Principal.setLayout(new java.awt.BorderLayout());

        bordeSuperior.setBackground(new java.awt.Color(244, 244, 244));
        bordeSuperior.setPreferredSize(new java.awt.Dimension(1280, 30));

        javax.swing.GroupLayout bordeSuperiorLayout = new javax.swing.GroupLayout(bordeSuperior);
        bordeSuperior.setLayout(bordeSuperiorLayout);
        bordeSuperiorLayout.setHorizontalGroup(
            bordeSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        bordeSuperiorLayout.setVerticalGroup(
            bordeSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Principal.add(bordeSuperior, java.awt.BorderLayout.PAGE_START);

        bordeIzquierdo.setBackground(new java.awt.Color(244, 244, 244));
        bordeIzquierdo.setPreferredSize(new java.awt.Dimension(30, 520));

        javax.swing.GroupLayout bordeIzquierdoLayout = new javax.swing.GroupLayout(bordeIzquierdo);
        bordeIzquierdo.setLayout(bordeIzquierdoLayout);
        bordeIzquierdoLayout.setHorizontalGroup(
            bordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        bordeIzquierdoLayout.setVerticalGroup(
            bordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        Principal.add(bordeIzquierdo, java.awt.BorderLayout.LINE_START);

        bordeDerecho.setBackground(new java.awt.Color(244, 244, 244));
        bordeDerecho.setPreferredSize(new java.awt.Dimension(30, 660));

        javax.swing.GroupLayout bordeDerechoLayout = new javax.swing.GroupLayout(bordeDerecho);
        bordeDerecho.setLayout(bordeDerechoLayout);
        bordeDerechoLayout.setHorizontalGroup(
            bordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        bordeDerechoLayout.setVerticalGroup(
            bordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        Principal.add(bordeDerecho, java.awt.BorderLayout.LINE_END);

        bordeInferior.setBackground(new java.awt.Color(244, 244, 244));
        bordeInferior.setPreferredSize(new java.awt.Dimension(1280, 30));

        javax.swing.GroupLayout bordeInferiorLayout = new javax.swing.GroupLayout(bordeInferior);
        bordeInferior.setLayout(bordeInferiorLayout);
        bordeInferiorLayout.setHorizontalGroup(
            bordeInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        bordeInferiorLayout.setVerticalGroup(
            bordeInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Principal.add(bordeInferior, java.awt.BorderLayout.PAGE_END);

        centro.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(244, 244, 244));
        header.setPreferredSize(new java.awt.Dimension(1220, 120));
        header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setLayout(new java.awt.BorderLayout());

        baner.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        baner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baner.setText("Logo");
        baner.setPreferredSize(new java.awt.Dimension(170, 100));
        Logo.add(baner, java.awt.BorderLayout.LINE_START);

        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 120));

        txtLogo.setBackground(new java.awt.Color(255, 255, 255));
        txtLogo.setLayout(new java.awt.BorderLayout());

        comprea_y_venta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        comprea_y_venta.setText("| Punto de venta");
        txtLogo.add(comprea_y_venta, java.awt.BorderLayout.CENTER);

        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 120));

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setRoundBottomLeft(20);
        jpanelRound3.setRoundTopLeft(20);

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jpanelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 120));

        header.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jpanelRound1.setBackground(new java.awt.Color(151, 203, 220));
        jpanelRound1.setPreferredSize(new java.awt.Dimension(600, 120));
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopRight(20);
        jpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorDeTotales5.setBackground(new java.awt.Color(255, 255, 255));
        contenedorDeTotales5.setRoundBottomLeft(10);
        contenedorDeTotales5.setRoundBottomRight(10);
        contenedorDeTotales5.setRoundTopLeft(10);
        contenedorDeTotales5.setRoundTopRight(10);
        contenedorDeTotales5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtotal5.setBackground(new java.awt.Color(255, 255, 255));
        subtotal5.setLayout(new java.awt.BorderLayout());

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setText("Subtotal");
        subtotal5.add(jLabel21, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(subtotal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 144, 20));

        iva5.setBackground(new java.awt.Color(255, 255, 255));
        iva5.setLayout(new java.awt.BorderLayout());

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel22.setText("Iva");
        iva5.add(jLabel22, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(iva5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 144, 20));

        totalBs5.setBackground(new java.awt.Color(255, 255, 255));
        totalBs5.setLayout(new java.awt.BorderLayout());

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setText("TOTAL Bs.");
        totalBs5.add(jLabel23, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(totalBs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 144, 20));

        totalDolares5.setBackground(new java.awt.Color(255, 255, 255));
        totalDolares5.setLayout(new java.awt.BorderLayout());

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel24.setText("TOTAL Dolares $");
        totalDolares5.add(jLabel24, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(totalDolares5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 144, 20));

        precioSubtotal5.setBackground(new java.awt.Color(255, 255, 255));
        precioSubtotal5.setLayout(new java.awt.BorderLayout());

        txtSubtotal5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtSubtotal5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubtotal5.setText("0.00");
        precioSubtotal5.add(txtSubtotal5, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(precioSubtotal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 0, 138, 20));

        precioIva5.setBackground(new java.awt.Color(255, 255, 255));
        precioIva5.setLayout(new java.awt.BorderLayout());

        txtIva5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIva5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtIva5.setText("0.00");
        precioIva5.add(txtIva5, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(precioIva5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 26, 138, 20));

        precioBs5.setBackground(new java.awt.Color(255, 255, 255));
        precioBs5.setLayout(new java.awt.BorderLayout());

        txtBolivares5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtBolivares5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBolivares5.setText("0.00");
        precioBs5.add(txtBolivares5, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(precioBs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 52, 138, 20));

        precioDolares5.setBackground(new java.awt.Color(255, 255, 255));
        precioDolares5.setLayout(new java.awt.BorderLayout());

        txtDolares5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDolares5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDolares5.setText("0.00");
        precioDolares5.add(txtDolares5, java.awt.BorderLayout.CENTER);

        contenedorDeTotales5.add(precioDolares5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 78, 138, 20));

        jpanelRound1.add(contenedorDeTotales5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 300, 100));

        jPanel4.setBackground(new java.awt.Color(151, 203, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtotal6.setBackground(new java.awt.Color(151, 203, 220));
        subtotal6.setLayout(new java.awt.BorderLayout());

        Cajero.setBackground(new java.awt.Color(151, 203, 220));
        Cajero.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Cajero.setForeground(new java.awt.Color(255, 255, 255));
        Cajero.setText("Cajero: ?");
        subtotal6.add(Cajero, java.awt.BorderLayout.CENTER);

        jPanel4.add(subtotal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 20));

        subtotal7.setBackground(new java.awt.Color(151, 203, 220));
        subtotal7.setLayout(new java.awt.BorderLayout());

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Fecha: 24/11/2023");
        subtotal7.add(txtFecha, java.awt.BorderLayout.CENTER);

        jPanel4.add(subtotal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 20));

        subtotal8.setBackground(new java.awt.Color(151, 203, 220));
        subtotal8.setLayout(new java.awt.BorderLayout());

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setText("Hora: 11:49:00");
        subtotal8.add(txtHora, java.awt.BorderLayout.CENTER);

        jPanel4.add(subtotal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 20));

        jpanelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 100));

        header.add(jpanelRound1, java.awt.BorderLayout.LINE_END);

        jpanelRound2.setBackground(new java.awt.Color(151, 203, 220));
        jpanelRound2.setRoundBottomLeft(10);
        jpanelRound2.setRoundTopLeft(10);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        header.add(jpanelRound2, java.awt.BorderLayout.CENTER);

        centro.add(header, java.awt.BorderLayout.PAGE_START);

        contenedor.setBackground(new java.awt.Color(244, 244, 244));
        contenedor.setLayout(new java.awt.BorderLayout());

        BordeDerechoTabla.setBackground(new java.awt.Color(255, 255, 255));
        BordeDerechoTabla.setPreferredSize(new java.awt.Dimension(10, 340));

        javax.swing.GroupLayout BordeDerechoTablaLayout = new javax.swing.GroupLayout(BordeDerechoTabla);
        BordeDerechoTabla.setLayout(BordeDerechoTablaLayout);
        BordeDerechoTablaLayout.setHorizontalGroup(
            BordeDerechoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        BordeDerechoTablaLayout.setVerticalGroup(
            BordeDerechoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        contenedor.add(BordeDerechoTabla, java.awt.BorderLayout.LINE_END);

        panelDeDatos.setBackground(new java.awt.Color(244, 244, 244));
        panelDeDatos.setPreferredSize(new java.awt.Dimension(1220, 50));
        panelDeDatos.setLayout(new java.awt.BorderLayout());

        separador.setBackground(new java.awt.Color(244, 244, 244));
        separador.setPreferredSize(new java.awt.Dimension(1220, 5));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        panelDeDatos.add(separador, java.awt.BorderLayout.PAGE_START);

        paneldeDatos2.setBackground(new java.awt.Color(255, 255, 255));
        paneldeDatos2.setRoundTopLeft(20);
        paneldeDatos2.setRoundTopRight(20);

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setPreferredSize(new java.awt.Dimension(144, 45));
        txtCliente.setLayout(new java.awt.BorderLayout());

        txtJlabelCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtJlabelCliente.setText("Cliente:");
        txtCliente.add(txtJlabelCliente, java.awt.BorderLayout.CENTER);

        txtFactura.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura.setPreferredSize(new java.awt.Dimension(144, 0));
        txtFactura.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Factura: ");
        txtFactura.add(jLabel2, java.awt.BorderLayout.CENTER);

        buttonBuscar.setBackground(new java.awt.Color(3, 150, 166));
        buttonBuscar.setRoundBottomLeft(10);
        buttonBuscar.setRoundBottomRight(10);
        buttonBuscar.setRoundTopLeft(10);
        buttonBuscar.setRoundTopRight(10);
        buttonBuscar.setLayout(new java.awt.BorderLayout());

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarProductos.png"))); // NOI18N
        txtBuscar.setText("Buscar Productos");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        buttonBuscar.add(txtBuscar, java.awt.BorderLayout.CENTER);

        txtFactura1.setBackground(new java.awt.Color(255, 255, 255));
        txtFactura1.setPreferredSize(new java.awt.Dimension(144, 0));
        txtFactura1.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(3, 150, 166));
        jLabel4.setText("$ Dolar:");
        txtFactura1.add(jLabel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout paneldeDatos2Layout = new javax.swing.GroupLayout(paneldeDatos2);
        paneldeDatos2.setLayout(paneldeDatos2Layout);
        paneldeDatos2Layout.setHorizontalGroup(
            paneldeDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldeDatos2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(txtFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        paneldeDatos2Layout.setVerticalGroup(
            paneldeDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldeDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(txtFactura1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelDeDatos.add(paneldeDatos2, java.awt.BorderLayout.CENTER);

        contenedor.add(panelDeDatos, java.awt.BorderLayout.PAGE_START);

        bordeIzquierdoTabla.setBackground(new java.awt.Color(255, 255, 255));
        bordeIzquierdoTabla.setPreferredSize(new java.awt.Dimension(10, 340));

        javax.swing.GroupLayout bordeIzquierdoTablaLayout = new javax.swing.GroupLayout(bordeIzquierdoTabla);
        bordeIzquierdoTabla.setLayout(bordeIzquierdoTablaLayout);
        bordeIzquierdoTablaLayout.setHorizontalGroup(
            bordeIzquierdoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        bordeIzquierdoTablaLayout.setVerticalGroup(
            bordeIzquierdoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        contenedor.add(bordeIzquierdoTabla, java.awt.BorderLayout.LINE_START);

        panelDeBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelDeBotones.setRoundBottomLeft(20);
        panelDeBotones.setRoundBottomRight(20);
        panelDeBotones.setLayout(new java.awt.BorderLayout());

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setPreferredSize(new java.awt.Dimension(900, 100));
        jpanelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelRound7.setBackground(new java.awt.Color(255, 102, 102));
        jpanelRound7.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound7.setRoundBottomLeft(10);
        jpanelRound7.setRoundBottomRight(10);
        jpanelRound7.setRoundTopLeft(10);
        jpanelRound7.setRoundTopRight(10);
        jpanelRound7.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrarTodo.png"))); // NOI18N
        jLabel11.setText("E.Todo");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jpanelRound7.add(jLabel11, java.awt.BorderLayout.CENTER);

        jpanelRound4.add(jpanelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 140, 80));

        jpanelRound8.setBackground(new java.awt.Color(102, 102, 255));
        jpanelRound8.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound8.setRoundBottomLeft(10);
        jpanelRound8.setRoundBottomRight(10);
        jpanelRound8.setRoundTopLeft(10);
        jpanelRound8.setRoundTopRight(10);
        jpanelRound8.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        jLabel8.setText("Salir");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jpanelRound8.add(jLabel8, java.awt.BorderLayout.CENTER);

        jpanelRound4.add(jpanelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 80));

        jpanelRound9.setBackground(new java.awt.Color(255, 51, 255));
        jpanelRound9.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound9.setRoundBottomLeft(10);
        jpanelRound9.setRoundBottomRight(10);
        jpanelRound9.setRoundTopLeft(10);
        jpanelRound9.setRoundTopRight(10);
        jpanelRound9.setLayout(new java.awt.BorderLayout());
        jpanelRound4.add(jpanelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 80));

        jpanelRound10.setBackground(new java.awt.Color(3, 150, 166));
        jpanelRound10.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound10.setRoundBottomLeft(10);
        jpanelRound10.setRoundBottomRight(10);
        jpanelRound10.setRoundTopLeft(10);
        jpanelRound10.setRoundTopRight(10);
        jpanelRound10.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dolares.png"))); // NOI18N
        jLabel7.setText("Tasa");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jpanelRound10.add(jLabel7, java.awt.BorderLayout.CENTER);

        jpanelRound4.add(jpanelRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, 80));

        jpanelRound11.setBackground(new java.awt.Color(3, 150, 166));
        jpanelRound11.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound11.setRoundBottomLeft(10);
        jpanelRound11.setRoundBottomRight(10);
        jpanelRound11.setRoundTopLeft(10);
        jpanelRound11.setRoundTopRight(10);
        jpanelRound11.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes2.png"))); // NOI18N
        jLabel9.setText("Clientes");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jpanelRound11.add(jLabel9, java.awt.BorderLayout.CENTER);

        jpanelRound4.add(jpanelRound11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 150, 80));

        jpanelRound12.setBackground(new java.awt.Color(255, 102, 102));
        jpanelRound12.setPreferredSize(new java.awt.Dimension(100, 100));
        jpanelRound12.setRoundBottomLeft(10);
        jpanelRound12.setRoundBottomRight(10);
        jpanelRound12.setRoundTopLeft(10);
        jpanelRound12.setRoundTopRight(10);
        jpanelRound12.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Borrar.png"))); // NOI18N
        jLabel10.setText("Eliminar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jpanelRound12.add(jLabel10, java.awt.BorderLayout.CENTER);

        jpanelRound4.add(jpanelRound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 150, 80));

        panelDeBotones.add(jpanelRound4, java.awt.BorderLayout.LINE_START);

        jpanelRound5.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound5.setPreferredSize(new java.awt.Dimension(200, 100));
        jpanelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelRound6.setBackground(new java.awt.Color(3, 150, 166));
        jpanelRound6.setRoundBottomLeft(10);
        jpanelRound6.setRoundBottomRight(10);
        jpanelRound6.setRoundTopLeft(10);
        jpanelRound6.setRoundTopRight(10);
        jpanelRound6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pagar.png"))); // NOI18N
        jLabel3.setText("Totalizar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jpanelRound6.add(jLabel3, java.awt.BorderLayout.CENTER);

        jpanelRound5.add(jpanelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 80));

        panelDeBotones.add(jpanelRound5, java.awt.BorderLayout.LINE_END);

        contenedor.add(panelDeBotones, java.awt.BorderLayout.PAGE_END);

        panelDeTabla.setBackground(new java.awt.Color(151, 203, 220));
        panelDeTabla.setLayout(new java.awt.BorderLayout());

        Tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return colIndex == 2;
            }
        };
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio $", "Subtotal", "Iva", "Total"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setSelectionBackground(new java.awt.Color(6, 150, 166));
        Tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        panelDeTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        contenedor.add(panelDeTabla, java.awt.BorderLayout.CENTER);

        centro.add(contenedor, java.awt.BorderLayout.CENTER);

        Principal.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(Principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed

        if (cu.getTipoDeUsuario().equals("Administrador")) {
            try {
                SobreescribirCliente("");
            } catch (IOException ex) {
                Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } else if (cu.getTipoDeUsuario().equals("Vendedor")) {
            try {
                SobreescribirCliente("");
            } catch (IOException ex) {
                Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        CajaClientes cj = new CajaClientes(this);
        cj.setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        CajaClientes clientes = new CajaClientes(this);
        TasaDolares td = new TasaDolares(this, clientes);
        td.setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jpanelRound8.setBackground(new Color(102, 0, 255));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jpanelRound8.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jpanelRound10.setBackground(new Color(11, 105, 139));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jpanelRound10.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jpanelRound11.setBackground(new Color(11, 105, 139));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jpanelRound11.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jpanelRound12.setBackground(Color.red);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jpanelRound7.setBackground(Color.red);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jpanelRound12.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jpanelRound7.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jpanelRound6.setBackground(new Color(11, 105, 139));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jpanelRound6.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_jLabel3MouseExited

    private void txtBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseEntered
        buttonBuscar.setBackground(new Color(11, 105, 139));
    }//GEN-LAST:event_txtBuscarMouseEntered

    private void txtBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseExited
        buttonBuscar.setBackground(new Color(3, 150, 166));
    }//GEN-LAST:event_txtBuscarMouseExited

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        CajaNavegador cn = new CajaNavegador(this);
        cn.setVisible(true);
    }//GEN-LAST:event_txtBuscarMousePressed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        int fila = Tabla.getSelectedRow();
        codigo = (Tabla.getValueAt(fila, 0).toString());
        producto = (Tabla.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_TablaMousePressed

    private void TablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int fila = Tabla.getSelectedRow();
            cantidad = Integer.parseInt(Tabla.getValueAt(fila, 2).toString());
            if (cantidad != 0) {
                if (cantidad > 0) {
                    codigo = (Tabla.getValueAt(fila, 0).toString());
                    cantidad = Integer.parseInt(Tabla.getValueAt(fila, 2).toString());
                    precioUnitario = Double.parseDouble(Tabla.getValueAt(fila, 3).toString());
                    this.obtenerProducto(codigo);
                    if (cantidad <= cantidadProductoBBDD) {

                        subtotal = precioUnitario * cantidad;
                        totalPagar = subtotal + iva;
                        subtotal = (double) Math.round(subtotal * 100) / 100;
                        iva = (double) Math.round(iva * 100) / 100;
                        totalPagar = (double) Math.round(totalPagar * 100) / 100;

                        Tabla.setValueAt(subtotal, fila, 4);
                        Tabla.setValueAt(iva, fila, 5);
                        Tabla.setValueAt(totalPagar, fila, 6);

                        this.CalcularTotalPagar();

                    } else {
                        int confirmacion = JOptionPane.showConfirmDialog(null, "La cantidad supera el Stock", "Confirmar", 2);
                        switch (confirmacion) {
                            case 0:
                                Tabla.changeSelection(Tabla.getRowCount() - 1, 2, false, false);
                                Tabla.editCellAt(Tabla.getRowCount() - 1, 2);
                                Tabla.requestFocus();

                                Component editor = Tabla.getEditorComponent();
                                if (editor != null) {
                                    editor.requestFocus();
                                }
                                break;

                            default:
                                int seleccionar = Tabla.getSelectedRow();
                                DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                                model.removeRow(seleccionar);
                                this.CalcularTotalPagar();
                                break;
                        }
                    }
                } else {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "La cantidad no puede ser (0), ni negativa", "Confirmar", 2);
                    switch (confirmacion) {
                        case 0:
                            Tabla.changeSelection(Tabla.getRowCount() - 1, 2, false, false);
                            Tabla.editCellAt(Tabla.getRowCount() - 1, 2);
                            Tabla.requestFocus();

                            Component editor = Tabla.getEditorComponent();
                            if (editor != null) {
                                editor.requestFocus();
                            }
                            break;

                        default:
                            int seleccionar = Tabla.getSelectedRow();
                            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                            model.removeRow(seleccionar);
                            this.CalcularTotalPagar();
                            break;
                    }
                }
            } else {
                int confirmacion = JOptionPane.showConfirmDialog(null, "Ingrese la cantidad del producto", "Confirmar", 2);
                switch (confirmacion) {
                    case 0:
                        Tabla.changeSelection(Tabla.getRowCount() - 1, 2, false, false);
                        Tabla.editCellAt(Tabla.getRowCount() - 1, 2);
                        Tabla.requestFocus();

                        Component editor = Tabla.getEditorComponent();
                        if (editor != null) {
                            editor.requestFocus();
                        }
                        break;

                    default:
                        int seleccionar = Tabla.getSelectedRow();
                        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                        model.removeRow(seleccionar);
                        this.CalcularTotalPagar();
                        break;
                }
            }
        }
    }//GEN-LAST:event_TablaKeyReleased

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        if (!codigo.isEmpty()) {
            int seleccionar = Tabla.getSelectedRow();
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?", "Confirmar", 2);
            switch (confirmacion) {
                case 0:
                    DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                    model.removeRow(seleccionar);
                    this.CalcularTotalPagar();
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No esta seleccionado ningun producto", "Advertencia", 1);
        }


    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar Todo?", "Confirmar", 2);
        switch (confirmacion) {
            case 0:
                DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                model.setRowCount(0);
                this.CalcularTotalPagar();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        String Fecha = "";
        Date date = new Date();
        Fecha = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (!"".equals(LeerCliente()))
            if (Tabla.getRowCount() > 0) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de totalizar esta compra?", "Totalizar", 2);
                switch (confirmacion) {
                    case 0:
                        cv.setIdCabecera(0);
                        cv.setFactura(LeerFactura());
                        cv.setCedula(LeerCliente());
                        cv.setValorPagarBS(Double.parseDouble(txtBolivares5.getText()));
                        cv.setValorPagarDS(Double.parseDouble(txtDolares5.getText()));
                        cv.setFechaVenta(Fecha);

                        if (crv.insertar(cv)) {

                            for (int i = 0; i < Tabla.getRowCount(); i++) {
                                dv.setIdDetallesV(0);
                                dv.setIdCabecera(0);
                                dv.setFactura(LeerFactura());
                                dv.setCodigo(Tabla.getValueAt(i, 0).toString());
                                dv.setProducto(Tabla.getValueAt(i, 1).toString());
                                dv.setCantidad(Integer.parseInt(Tabla.getValueAt(i, 2).toString()));
                                dv.setPrecioUnitario(Double.parseDouble(Tabla.getValueAt(i, 3).toString()));
                                dv.setSubtotal(Double.parseDouble(Tabla.getValueAt(i, 4).toString()));
                                dv.setIva(Double.parseDouble(Tabla.getValueAt(i, 5).toString()));
                                dv.setTotalPagarDS(Double.parseDouble(Tabla.getValueAt(i, 6).toString()));
                                double TotalDolares = Double.parseDouble(Tabla.getValueAt(i, 6).toString());
                                int precioDolar = Integer.parseInt(LeerDolar());
                                dv.setTotalPagarBS(TotalDolares * precioDolar);

                                if (crv.GuardarDetallesVenta(dv)) {
                                    crv.restarStockProductos(dv.getCodigo(), dv.getCantidad());
                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Error al guardar detalle de Venta!");
                                }

                            }

                            vpd.GenerarFacturaPDF();
                            try {
                                SobreescribirCliente("");
                            } catch (IOException ex) {
                                Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            jLabel2.setText("Factura: ");
                            txtJlabelCliente.setText("Cliente: ");
                            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                            model.setRowCount(0);
                            this.CalcularTotalPagar();
                            CajaClientes cj = new CajaClientes(this);
                            cj.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar la cabecera de compra");
                        }

                        break;
                    default:
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "No hay productos añadidos, seleccione un producto!");
            }
        else {
            JOptionPane.showMessageDialog(null, "No hay clientes comprando, seleccione un cliente!");
        }
    }//GEN-LAST:event_jLabel3MousePressed

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
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BordeDerechoTabla;
    private javax.swing.JLabel Cajero;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Principal;
    public static javax.swing.JTable Tabla;
    private javax.swing.JLabel baner;
    private javax.swing.JPanel bordeDerecho;
    private javax.swing.JPanel bordeInferior;
    private javax.swing.JPanel bordeIzquierdo;
    private javax.swing.JPanel bordeIzquierdoTabla;
    private javax.swing.JPanel bordeSuperior;
    private vista.JpanelRound buttonBuscar;
    private javax.swing.JPanel centro;
    private javax.swing.JLabel comprea_y_venta;
    private javax.swing.JPanel contenedor;
    private vista.JpanelRound contenedorDeTotales5;
    private javax.swing.JPanel header;
    private javax.swing.JPanel iva5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private vista.JpanelRound jpanelRound1;
    private vista.JpanelRound jpanelRound10;
    private vista.JpanelRound jpanelRound11;
    private vista.JpanelRound jpanelRound12;
    private vista.JpanelRound jpanelRound2;
    private vista.JpanelRound jpanelRound3;
    private vista.JpanelRound jpanelRound4;
    private vista.JpanelRound jpanelRound5;
    private vista.JpanelRound jpanelRound6;
    private vista.JpanelRound jpanelRound7;
    private vista.JpanelRound jpanelRound8;
    private vista.JpanelRound jpanelRound9;
    private vista.JpanelRound panelDeBotones;
    private javax.swing.JPanel panelDeDatos;
    private javax.swing.JPanel panelDeTabla;
    private vista.JpanelRound paneldeDatos2;
    private javax.swing.JPanel precioBs5;
    private javax.swing.JPanel precioDolares5;
    private javax.swing.JPanel precioIva5;
    private javax.swing.JPanel precioSubtotal5;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel subtotal5;
    private javax.swing.JPanel subtotal6;
    private javax.swing.JPanel subtotal7;
    private javax.swing.JPanel subtotal8;
    private javax.swing.JPanel totalBs5;
    private javax.swing.JPanel totalDolares5;
    public static javax.swing.JLabel txtBolivares5;
    private javax.swing.JLabel txtBuscar;
    private javax.swing.JPanel txtCliente;
    public static javax.swing.JLabel txtDolares5;
    private javax.swing.JPanel txtFactura;
    private javax.swing.JPanel txtFactura1;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtIva5;
    private javax.swing.JLabel txtJlabelCliente;
    private javax.swing.JPanel txtLogo;
    private javax.swing.JLabel txtSubtotal5;
    // End of variables declaration//GEN-END:variables

    public void CrearTxtFactura(int pass) throws IOException {

        FileWriter Database = new FileWriter("src/datos/temporal/factura.txt");
        PrintWriter Escritor = new PrintWriter(Database);

        Escritor.println(pass);
        Database.close();

    }

    public void SobreescribirCliente(String pass) throws IOException {

        FileWriter Database = new FileWriter("src/datos/temporal/clientes.txt");
        PrintWriter Escritor = new PrintWriter(Database);

        Escritor.println(pass);
        Database.close();

    }

    public String LeerUsuario() {
        FileReader archivo;
        BufferedReader lector;
        String pass = null;

        try {
            archivo = new FileReader("src/datos/temporal/user.txt");
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

    public int LeerFactura() {
        FileReader archivo;
        BufferedReader lector;
        int pass = 0;

        try {
            archivo = new FileReader("src/datos/temporal/factura.txt");
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                pass = Integer.parseInt(lector.readLine());
                lector.close();
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        return pass;

    }

    public String LeerCliente() {
        FileReader archivo;
        BufferedReader lector;
        String pass = null;

        try {
            archivo = new FileReader("src/datos/temporal/clientes.txt");
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

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void obtenerProducto(String codigo1) {
        String SQL = "select * from productos where codigo='" + codigo1 + "'";

        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cantidadProductoBBDD = rs.getInt("cantidad");
                porcentajeIva = rs.getInt("porcentajeIva");
                this.CalcularIva(precioUnitario, porcentajeIva);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private double CalcularIva(double precio, int porcentajeIva) {
        int p_iva = porcentajeIva;

        switch (p_iva) {
            case 0:
                iva = 0.0;
                break;
            case 16:
                iva = (precio * cantidad) * 0.16;
            default:
                break;
        }

        return iva;

    }

    public void CalcularTotalPagar() {
        CajaNavegador cn = new CajaNavegador(this);
        int dolar = Integer.parseInt(LeerDolar());
        subtotalGeneral = 0;
        ivaGeneral = 0;
        totalGeneralBs = 0;
        totalGeneralDs = 0;

        for (int i = 0; i < Tabla.getRowCount(); i++) {
            double subtotal = Double.parseDouble(Tabla.getValueAt(i, 4).toString());
            double iva = Double.parseDouble(Tabla.getValueAt(i, 5).toString());
            double totalPagar = Double.parseDouble(Tabla.getValueAt(i, 6).toString());
            subtotalGeneral += subtotal;
            ivaGeneral += iva;
            totalGeneralDs += totalPagar;
            totalGeneralBs += totalPagar * dolar;
        }

        subtotalGeneral = (double) Math.round(subtotalGeneral * 100) / 100;
        ivaGeneral = (double) Math.round(ivaGeneral * 100) / 100;
        totalGeneralBs = (double) Math.round(totalGeneralBs * 100) / 100;
        totalGeneralDs = (double) Math.round(totalGeneralDs * 100) / 100;

        //EnviarDatos:
        txtSubtotal5.setText(String.valueOf(subtotalGeneral));
        txtIva5.setText(String.valueOf(ivaGeneral));
        txtBolivares5.setText(String.valueOf(totalGeneralBs));
        txtDolares5.setText(String.valueOf(totalGeneralDs));
    }

}
