

package PGC.pkg;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;

/**
 *
 * @author ivy
 */
public class pgc extends javax.swing.JFrame {
    
      double cm, kg, altelevado, imc, metros, pgc, edad, genero;
  
    /**
     * 
     */
    public pgc() {
        initComponents();
        
    }

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alturaLabel = new javax.swing.JLabel();
        alturaTextfield = new javax.swing.JTextField();
        piesLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        pesoTextfield = new javax.swing.JTextField();
        imcLabel = new javax.swing.JLabel();
        calcBtn = new javax.swing.JButton();
        imcTextfield = new javax.swing.JTextField();
        salirBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        piesLabel1 = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        generoBox = new javax.swing.JComboBox<>();
        sexoLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        edadTextfield = new javax.swing.JTextField();
        pgcTextfield = new javax.swing.JTextField();
        pgcLabel = new javax.swing.JLabel();
        porcenLabel = new javax.swing.JLabel();
        anyosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IvySoft IMC+PGC Calc 2.0");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        alturaLabel.setForeground(new java.awt.Color(255, 204, 0));
        alturaLabel.setText("Altura:");

        alturaTextfield.setBackground(new java.awt.Color(0, 0, 0));
        alturaTextfield.setForeground(new java.awt.Color(102, 255, 0));
        alturaTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTextfieldActionPerformed(evt);
            }
        });

        piesLabel.setForeground(new java.awt.Color(255, 255, 0));
        piesLabel.setText("cm");

        pesoLabel.setForeground(new java.awt.Color(255, 255, 0));
        pesoLabel.setText("Peso:");

        pesoTextfield.setBackground(new java.awt.Color(0, 0, 0));
        pesoTextfield.setForeground(new java.awt.Color(0, 255, 0));

        imcLabel.setForeground(new java.awt.Color(255, 255, 0));
        imcLabel.setText("Tu IMC:");

        calcBtn.setBackground(new java.awt.Color(51, 51, 255));
        calcBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        calcBtn.setForeground(new java.awt.Color(255, 255, 255));
        calcBtn.setText("Calcular");
        calcBtn.setActionCommand("");
        calcBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        imcTextfield.setEditable(false);
        imcTextfield.setBackground(new java.awt.Color(0, 0, 0));
        imcTextfield.setForeground(new java.awt.Color(0, 255, 0));
        imcTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imcTextfieldActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(0, 0, 0));
        salirBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 51, 51));
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setBackground(new java.awt.Color(0, 0, 0));
        limpiarBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 0, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        piesLabel1.setForeground(new java.awt.Color(255, 255, 0));
        piesLabel1.setText("kg");

        commentLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        commentLabel.setForeground(new java.awt.Color(51, 255, 255));

        generoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));
        generoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoBoxActionPerformed(evt);
            }
        });

        sexoLabel.setForeground(new java.awt.Color(255, 204, 0));
        sexoLabel.setText("Género:");

        edadLabel.setForeground(new java.awt.Color(255, 204, 0));
        edadLabel.setText("Edad:");

        edadTextfield.setBackground(new java.awt.Color(0, 0, 0));
        edadTextfield.setForeground(new java.awt.Color(0, 255, 0));

        pgcTextfield.setEditable(false);
        pgcTextfield.setBackground(new java.awt.Color(0, 0, 0));
        pgcTextfield.setForeground(new java.awt.Color(0, 255, 0));
        pgcTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgcTextfieldActionPerformed(evt);
            }
        });

        pgcLabel.setForeground(new java.awt.Color(255, 255, 0));
        pgcLabel.setText("Grasa corporal:");

        porcenLabel.setForeground(new java.awt.Color(255, 255, 0));
        porcenLabel.setText("%");

        anyosLabel.setForeground(new java.awt.Color(255, 204, 0));
        anyosLabel.setText("años");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(piesLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(alturaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alturaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(piesLabel)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sexoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edadLabel)
                                .addGap(18, 18, 18)
                                .addComponent(edadTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anyosLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pgcLabel)
                                .addGap(12, 12, 12)
                                .addComponent(pgcTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(porcenLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imcLabel)
                                .addGap(59, 59, 59)
                                .addComponent(imcTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaLabel)
                    .addComponent(generoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoLabel)
                    .addComponent(piesLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel)
                    .addComponent(pesoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(piesLabel1)
                    .addComponent(edadLabel)
                    .addComponent(edadTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anyosLabel))
                .addGap(18, 18, 18)
                .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imcLabel)
                    .addComponent(imcTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgcLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pgcTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(porcenLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void alturaTextfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
    }                                               

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         

        System.exit(0);
 
    }                                        

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
      alturaTextfield.setText("");
      pesoTextfield.setText("");
      imcTextfield.setText("");
      pgcTextfield.setText("");
      edadTextfield.setText("");
      generoBox.setSelectedIndex(0);
      commentLabel.setText("");
      commentLabel.setForeground(Color.cyan);
      
    }                                          

    private void calcularIMC(){
               // Cálculo del IMC
          try{
          // Cada vez que se ejecuta, se limpia el aviso de error.
          commentLabel.setForeground(Color.cyan);
          commentLabel.setText("");
          
          // Cálculo del IMC
          cm = Double.parseDouble(alturaTextfield.getText());
          kg = Double.parseDouble(pesoTextfield.getText());
          metros = cm / 100;
          altelevado = Math.pow(metros, 2);
          
          imc = kg/altelevado;
         
          imcTextfield.setText(new DecimalFormat("##.##").format(imc));
          
    
          if(imc >= 25){
              commentLabel.setForeground(Color.red);
              commentLabel.setHorizontalAlignment(SwingConstants.CENTER);
              commentLabel.setVerticalAlignment(SwingConstants.CENTER);
              commentLabel.setText("¡Sobrepeso!"); 
          }
          
          // Cálculo del porcentaje de grasa corporal "PGC"
          double pgc,edad,genero;
          
          genero = (double) generoBox.getSelectedIndex();
          edad = Double.parseDouble(edadTextfield.getText());
          
          // Este condicional le da el valor 0 a femenino para el cálculo. 
          // En masculino no hace falta porque ya coinciden "1"
         
          
          if(generoBox.getSelectedIndex() == 2){
             genero=0; 
          }
          
          // PGC
          pgc = (1.2 * imc) + (0.23 * edad) - (10.8 * genero) - 5.4;
       
          pgcTextfield.setText(new DecimalFormat("##.##").format(pgc));
         
          System.out.println(genero);
          // Si no se selecciona nada en el desplegable
         
          if(generoBox.getSelectedIndex() == 0){
              commentLabel.setForeground(Color.cyan);
              commentLabel.setText("Revisa el parámetro de género.");
              pgcTextfield.setText("");
              imcTextfield.setText("");
          }
          
        
          // Si te dejas por poner algo
      }catch (Exception e){
          commentLabel.setForeground(Color.cyan);
          commentLabel.setText("Revisa los parámetros requeridos.");
          pgcTextfield.setText("");
          imcTextfield.setText("");
      }
    }
    
         
    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        

      calcularIMC(); // Llama al método para cálcular el IMC
    
    
    }                                       

    private void generoBoxActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void imcTextfieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void pgcTextfieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    /**
     *
     */
    public static void main(String args[]) {
        
        
        /* Crear y mostrar la ventana */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pgc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField alturaTextfield;
    private javax.swing.JLabel anyosLabel;
    private javax.swing.JButton calcBtn;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JTextField edadTextfield;
    private javax.swing.JComboBox<String> generoBox;
    private javax.swing.JLabel imcLabel;
    private javax.swing.JTextField imcTextfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoTextfield;
    private javax.swing.JLabel pgcLabel;
    private javax.swing.JTextField pgcTextfield;
    private javax.swing.JLabel piesLabel;
    private javax.swing.JLabel piesLabel1;
    private javax.swing.JLabel porcenLabel;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel sexoLabel;
    // End of variables declaration                   
}
