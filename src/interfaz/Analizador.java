package interfaz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analizador extends javax.swing.JFrame {

    public Analizador() {
        initComponents();
    }
     

    private String analizarLexico(String expresion) {
        // Define los patrones para los tokens (variables, constantes, numeros y operadores)
        String patronVariable = "[wxyz]";
        String patronConstante = "(pi|e)";
        String patronNumero = "[0-9]+";
        String patronOperador = "[+\\-/*]";

        // Patrón para token desconocido (otro caracter que no este en esta lista)Este se almacenara en el token Desconocido
        String patronDesconocido = "[^wxyz0-9+\\-/*()epi]";

        // se incia contadores para contar el numero de tokens
        int numVariables = 0;
        int numConstantes = 0;
        int numNumeros = 0;
        int numOperadores = 0;
        int numDesconocidos = 0;

        // Analiza la expresion ,va buscando 1x1 y se almacena en stringBuilder
        Matcher matcher = Pattern.compile("(" + patronVariable + "|" + patronConstante + "|" + patronNumero +
                "|" + patronOperador + "|" + patronDesconocido + ")").matcher(expresion);

        StringBuilder resultado = new StringBuilder();
        while (matcher.find()) {
            String token = matcher.group();
            resultado.append("Token: ").append(token).append("\n");

            // Determina el tipo de token y este lo almacena en los contadores y lo muestra en la pantalla e muestra el mensaje
            if (token.matches(patronVariable)) {
                resultado.append("Tipo: Variable\n");
                numVariables++;
            } else if (token.matches(patronConstante)) {
                resultado.append("Tipo: Constante\n");
                numConstantes++;
            } else if (token.matches(patronNumero)) {
                resultado.append("Tipo: Número\n");
                numNumeros++;
            } else if (token.matches(patronOperador)) {
                resultado.append("Tipo: Operador\n");
                numOperadores++;
            } else {
                resultado.append("Tipo: Desconocido\n");
                numDesconocidos++;
            }
            resultado.append("\n");
        }

        // Muestra un resumen de los contadores e imprime
        resultado.append("Resumen:\n");
        resultado.append("Variables: ").append(numVariables).append("\n");
        resultado.append("Constantes: ").append(numConstantes).append("\n");
        resultado.append("Números: ").append(numNumeros).append("\n");
        resultado.append("Operadores: ").append(numOperadores).append("\n");
        resultado.append("Desconocidos: ").append(numDesconocidos).append("\n");

        return resultado.toString();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Analizador().setVisible(true);
        });
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la operacion Matematica");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String expresion = jTextField1.getText();
        String resultado = analizarLexico(expresion);
        jTextArea2.setText(resultado);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
