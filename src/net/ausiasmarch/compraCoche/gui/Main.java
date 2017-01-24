package net.ausiasmarch.compraCoche.gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.compraCoche.modelo.CompraCoche;
import net.ausiasmarch.compraCoche.modelo.TipoPago;

/**
 * Main.java
 *
 * @author
 */
public class Main extends javax.swing.JFrame {

    private final CompraCoche compraCoche;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        compraCoche = new CompraCoche();
        jComboBoxPago.addItem(TipoPago.CONTADO.toString());
        jComboBoxPago.addItem(TipoPago.MESES12.toString());
        jComboBoxPago.addItem(TipoPago.MESES24.toString());
        iniciar();
    }

    /**
     * Inicia el form
     */
    private void iniciar() {
        setSize(685, 460);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCombustible = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanelExtras = new javax.swing.JPanel();
        jCheckBoxNavegador = new javax.swing.JCheckBox();
        jCheckBoxAparcamiento = new javax.swing.JCheckBox();
        jCheckBoxMetalizada = new javax.swing.JCheckBox();
        jButtonCalcular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecioBase = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabelCoche = new javax.swing.JLabel();
        jTextFieldPuertas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxMotor = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxAcabado = new javax.swing.JComboBox();
        jComboBoxTipoMotor = new javax.swing.JComboBox();
        jTextFieldPrecioTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCuotaMensual = new javax.swing.JTextField();
        jComboBoxPago = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelMensajes = new javax.swing.JPanel();
        jScrollPanelMensajes = new javax.swing.JScrollPane();
        jTextAreaMensajes = new javax.swing.JTextArea();
        jButtonCerrar = new javax.swing.JButton();
        jPanelColores = new javax.swing.JPanel();
        jCheckBoxRojo = new javax.swing.JCheckBox();
        jCheckBoxBlanco = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comprar Coche");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelExtras.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Extras "));
        jPanelExtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxNavegador.setText("Navegador de a bordo");
        jPanelExtras.add(jCheckBoxNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 30));

        jCheckBoxAparcamiento.setText("Aparcamiento autom�tico");
        jPanelExtras.add(jCheckBoxAparcamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 30));

        jCheckBoxMetalizada.setText("Pintura Metalizada");
        jPanelExtras.add(jCheckBoxMetalizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 30));

        getContentPane().add(jPanelExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 660, 60));

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.setNextFocusableComponent(jButtonLimpiar);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Puertas:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));

        jLabel3.setText("Precio base:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 80, 20));

        jTextFieldPrecioBase.setEditable(false);
        jTextFieldPrecioBase.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldPrecioBase.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPrecioBase.setText("12900");
        jTextFieldPrecioBase.setToolTipText("");
        jPanel4.add(jTextFieldPrecioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 80, 25));

        jLabel13.setText("�");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 20, 20));

        jLabelCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/ausiasmarch/compraCoche/img/cocheBlanco.png"))); // NOI18N
        jPanel4.add(jLabelCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 110));

        jTextFieldPuertas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPuertas.setText("2");
        jTextFieldPuertas.setToolTipText("");
        jTextFieldPuertas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPuertasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPuertasFocusLost(evt);
            }
        });
        jPanel4.add(jTextFieldPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 40, 25));

        jLabel1.setText("Tipo Motor diesel");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel17.setText("Motor");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jComboBoxMotor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gasolina", "Diesel" }));
        jPanel4.add(jComboBoxMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, -1));

        jLabel18.setText("Acabado");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 20));

        jComboBoxAcabado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reference", "Style", "Advanced" }));
        jComboBoxAcabado.setName(""); // NOI18N
        jComboBoxAcabado.setNextFocusableComponent(jTextFieldPuertas);
        jComboBoxAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAcabadoActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxAcabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, -1));

        jComboBoxTipoMotor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TSI", "SDI", "TDI" }));
        jPanel4.add(jComboBoxTipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 100, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 660, 130));

        jTextFieldPrecioTotal.setEditable(false);
        jTextFieldPrecioTotal.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextFieldPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 25));

        jLabel4.setText("Precio total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jTextFieldCuotaMensual.setEditable(false);
        jTextFieldCuotaMensual.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextFieldCuotaMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 113, 25));

        jComboBoxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 110, -1));

        jLabel10.setText("Pago:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 50, 20));

        jLabel11.setText("�");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 10, 20));

        jLabel12.setText("�");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 10, 20));

        jScrollPanelMensajes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        jTextAreaMensajes.setEditable(false);
        jTextAreaMensajes.setBackground(new java.awt.Color(253, 227, 227));
        jTextAreaMensajes.setColumns(20);
        jTextAreaMensajes.setLineWrap(true);
        jTextAreaMensajes.setRows(5);
        jTextAreaMensajes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Se han encontrado los siguientes errores ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N
        jTextAreaMensajes.setFocusable(false);
        jTextAreaMensajes.setMaximumSize(new java.awt.Dimension(110, 37));
        jTextAreaMensajes.setName(""); // NOI18N
        jScrollPanelMensajes.setViewportView(jTextAreaMensajes);
        jTextAreaMensajes.getAccessibleContext().setAccessibleName("");

        jButtonCerrar.setText("X");
        jButtonCerrar.setToolTipText("Cerrar lista de mensajes");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMensajesLayout = new javax.swing.GroupLayout(jPanelMensajes);
        jPanelMensajes.setLayout(jPanelMensajesLayout);
        jPanelMensajesLayout.setHorizontalGroup(
            jPanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMensajesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addGap(34, 34, 34))
            .addGroup(jPanelMensajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMensajesLayout.setVerticalGroup(
            jPanelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensajesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPanelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCerrar)
                .addContainerGap())
        );

        getContentPane().add(jPanelMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 640, 200));

        jPanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder(" Colores "));

        jCheckBoxRojo.setText("Rojo");
        jCheckBoxRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRojoActionPerformed(evt);
            }
        });

        jCheckBoxBlanco.setSelected(true);
        jCheckBoxBlanco.setText("Blanco");
        jCheckBoxBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jCheckBoxRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jCheckBoxBlanco)
                .addGap(159, 159, 159))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxRojo)
                    .addComponent(jCheckBoxBlanco))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 660, 60));

        jLabel5.setText("Cuota Mensual:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setNextFocusableComponent(jComboBoxAcabado);
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

    // Declaraci�n de Variables
    String acabado, motor, tipoMotor, pago;
    int puertas;
    double precioBase;
    boolean navegador, aparcamiento, rojo, blanco, metalizada;
    String mensaje;
    StringBuilder sb = new StringBuilder();

    // Limpiar Campos de Resultado
    jTextFieldCuotaMensual.setText("");
    jTextFieldPrecioTotal.setText("");
    jTextAreaMensajes.setText("");

    // Leer los datos de entrada.
    if (!Convert.isValidDouble(jTextFieldPrecioBase.getText())) {
        sb.append("-El precio es incorrecto.\n");
    }
    if (!Convert.isValidInt(jTextFieldPuertas.getText())) {
        sb.append("-El numero de puertas es incorrecto.\n");
    }
    if (sb.length() > 0) {
        setSize(685, 700);
        jTextAreaMensajes.setVisible(true);
        jTextAreaMensajes.setText("");
        jTextAreaMensajes.append(sb.toString());
        jTextAreaMensajes.setCaretPosition(0);
        return;
    }

    // Validaci�n de los datos que sean necesarios
    precioBase = Convert.parseDouble(jTextFieldPrecioBase.getText());
    puertas = Convert.parseInt(jTextFieldPuertas.getText());

    compraCoche.setAcabado(jComboBoxAcabado.getSelectedItem().toString());
    compraCoche.setMotor(jComboBoxMotor.getSelectedItem().toString());
    compraCoche.setPrecioBase(precioBase);
    compraCoche.setPuertas(puertas);
    compraCoche.setAparcamiento(jCheckBoxAparcamiento.isSelected());
    compraCoche.setTipoMotor(jComboBoxTipoMotor.getSelectedItem().toString());
    compraCoche.setNavegador(jCheckBoxNavegador.isSelected());
    compraCoche.setMetalizada(jCheckBoxMetalizada.isSelected());
    compraCoche.setBlanco(jCheckBoxBlanco.isSelected());
    compraCoche.setRojo(jCheckBoxRojo.isSelected());
    compraCoche.setPago(jComboBoxPago.getSelectedItem().toString());

    if (compraCoche.validate() == false) {
        sb.append(compraCoche.getMensaje());
        setSize(685, 700);
        jTextAreaMensajes.setText("");
        jTextAreaMensajes.setVisible(true);
        jTextAreaMensajes.append(sb.toString());
        jTextAreaMensajes.setCaretPosition(0);
        return;
    }

    // Obtener los datos de los calculos y mostrar los resultados
    double precioTotal = compraCoche.precioTotalCoche();
    double cuotaMensual = compraCoche.cuotaMensualCoche();

    jTextFieldPrecioTotal.setText(Convert.format(precioTotal, 2));
    jTextFieldCuotaMensual.setText(Convert.format(cuotaMensual, 2));

    jTextAreaMensajes.setVisible(false);
    setSize(685, 460);


}//GEN-LAST:event_jButtonCalcularActionPerformed

    /**
     * Cerrar panel de errores
     *
     * @param evt
     */
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        setSize(685, 460);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jCheckBoxBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlancoActionPerformed
        jLabelCoche.setIcon(new ImageIcon(getClass().getResource("/net/ausiasmarch/compraCoche/img/cocheBlanco.png")));
        jCheckBoxRojo.setSelected(false);
    }//GEN-LAST:event_jCheckBoxBlancoActionPerformed

    private void jCheckBoxRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRojoActionPerformed
        jLabelCoche.setIcon(new ImageIcon(getClass().getResource("/net/ausiasmarch/compraCoche/img/cocheRojo.png")));
        jCheckBoxBlanco.setSelected(false);
    }//GEN-LAST:event_jCheckBoxRojoActionPerformed

    /**
     * Al selecionar el procesador
     *
     * @param evt
     */
    private void jComboBoxAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAcabadoActionPerformed
        String acabado = jComboBoxAcabado.getSelectedItem().toString();
        switch (acabado) {
            case "Reference":
                jTextFieldPrecioBase.setText("12900");
                break;
            case "Style":
                jTextFieldPrecioBase.setText("15750");
                break;
            case "Advanced":
                jTextFieldPrecioBase.setText("18950");
        }
    }//GEN-LAST:event_jComboBoxAcabadoActionPerformed

    /**
     * Limpiar campos de datos
     *
     * @param evt
     */
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jComboBoxAcabado.setSelectedItem("Reference");
        jTextFieldPuertas.setText("2");
        jComboBoxMotor.setSelectedItem("Gasolina");
        jComboBoxTipoMotor.setSelectedItem("TSI");
        jComboBoxPago.setSelectedItem("Contado");
        jTextFieldPrecioTotal.setText("");
        jTextFieldCuotaMensual.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldPuertasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPuertasFocusGained
        cambiarBordeJTextField(jTextFieldPuertas, Color.BLUE, 2);
    }//GEN-LAST:event_jTextFieldPuertasFocusGained

    private void jTextFieldPuertasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPuertasFocusLost
        cambiarBordeJTextField(jTextFieldPuertas, Color.GRAY, 1);
    }//GEN-LAST:event_jTextFieldPuertasFocusLost

    private void jComboBoxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPagoActionPerformed

    /**
     * Cambia el color de l borde de un JTextField
     *
     * @param jtf JTextField
     * @param color Color del borde
     */
    private void cambiarBordeJTextField(JTextField jtf, Color color, int grosor) {
        jtf.setBorder(new LineBorder(color, grosor, false));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCombustible;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxAparcamiento;
    private javax.swing.JCheckBox jCheckBoxBlanco;
    private javax.swing.JCheckBox jCheckBoxMetalizada;
    private javax.swing.JCheckBox jCheckBoxNavegador;
    private javax.swing.JCheckBox jCheckBoxRojo;
    private javax.swing.JComboBox jComboBoxAcabado;
    private javax.swing.JComboBox jComboBoxMotor;
    private javax.swing.JComboBox jComboBoxPago;
    private javax.swing.JComboBox jComboBoxTipoMotor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCoche;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JPanel jPanelExtras;
    private javax.swing.JPanel jPanelMensajes;
    private javax.swing.JScrollPane jScrollPanelMensajes;
    private javax.swing.JTextArea jTextAreaMensajes;
    private javax.swing.JTextField jTextFieldCuotaMensual;
    private javax.swing.JTextField jTextFieldPrecioBase;
    private javax.swing.JTextField jTextFieldPrecioTotal;
    private javax.swing.JTextField jTextFieldPuertas;
    // End of variables declaration//GEN-END:variables
}