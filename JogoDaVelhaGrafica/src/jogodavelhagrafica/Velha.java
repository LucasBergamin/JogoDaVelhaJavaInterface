/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelhagrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author lberg
 */
public class Velha extends javax.swing.JFrame {

    /**
     * Creates new form Velha
     */
    public Velha() {
        initComponents();
        matriz = new String[3][3];
        placar1 = 0;
        placar2 = 0;
        velha = 0;
        contador = 0;
        jgd1 = false;
    }
    
    String[][] matriz;
    int placar1;
    int placar2;
    int velha;
    int contador;
    boolean jgd1;
    
    public void zerar(){
    for (int l = 0; l < matriz.length; l++)  {  
       for (int c = 0; c < matriz[0].length; c++)     { 
           matriz[l][c] = "*";
       }  
     }
    
    txt00.setText("*");
    txt01.setText("*");
    txt02.setText("*");
    
    txt10.setText("*");
    txt11.setText("*");
    txt12.setText("*");
    
    txt20.setText("*");
    txt21.setText("*");
    txt22.setText("*");
    
    contador = 0;
    
    }
    
    public void verificacao1(){
    
        //-------------------------------------------------------------------------
        //verificacao horizontal

        if ("x".equals(matriz[0][0]) && "x".equals(matriz[0][1]) && "x".equals(matriz[0][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            
        }
        
        else if ("x".equals(matriz[1][2]) && "x".equals(matriz[1][0]) && "x".equals(matriz[1][1])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            
            
        }
        else if ("x".equals(matriz[2][0]) && "x".equals(matriz[2][1]) && "x".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            

        }
        
        //---------------------------------------------------------------------------
        //verificacao verifical
        
        else if ("x".equals(matriz[0][0]) && "x".equals(matriz[1][0]) && "x".equals(matriz[2][0])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            

        }
        
        else if ("x".equals(matriz[0][1]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][1])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            

        }
            
        else if ("x".equals(matriz[0][2]) && "x".equals(matriz[1][2]) && "x".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            
            
        }
        
        
        //--------------------------------------------------------------------------
        //verificacao diagonal
        
        else if ("x".equals(matriz[0][0]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            
        }
        
        else if ("x".equals(matriz[0][2]) && "x".equals(matriz[1][1]) && "x".equals(matriz[2][0])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador1 ganhou!");
            this.placar1 += 1;
            zerar();
            
        }
        //-------------------------------------------------------------------------
    }
    
    public void verificacao2()
    {
        if ("o".equals(matriz[0][0]) && "o".equals(matriz[0][1]) && "o".equals(matriz[0][2])){
            
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            

        }
        
        else if ("o".equals(matriz[1][0]) && "o".equals(matriz[1][1]) && "o".equals(matriz[1][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            

        }
        
        else if ("o".equals(matriz[2][0]) && "o".equals(matriz[2][1]) && "o".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            

        }
        
        //---------------------------------------------------------------------------
        //verificacao verifical
        
        else if ("o".equals(matriz[0][0]) && "o".equals(matriz[1][0]) && "o".equals(matriz[2][0])){
            System.out.println("Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
           

        }
        
        else if ("o".equals(matriz[0][1]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][1])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            

        }
            
        else if ("o".equals(matriz[0][2]) && "o".equals(matriz[1][2]) && "o".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar2 += 1;
            zerar();
            
        }
        //verificacao diagonal
        
        else if ("o".equals(matriz[0][0]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][2])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar1 += 1;
            zerar();
            
        }
        
        else if ("".equals(matriz[0][2]) && "o".equals(matriz[1][1]) && "o".equals(matriz[2][0])){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador2 ganhou!");
            this.placar1 += 1;
            zerar();
            
        }
    }

    public void substituir(){
        
        if("x".equals(matriz[0][0]))
            txt00.setText("X");
        if("x".equals(matriz[0][1]))
            txt01.setText("X");
        if("x".equals(matriz[0][2]))
            txt02.setText("X");
        
        if("x".equals(matriz[1][0]))
            txt10.setText("X");
        if("x".equals(matriz[1][1]))
            txt11.setText("X");
        if("x".equals(matriz[1][2]))
            txt12.setText("X");
        
        if("x".equals(matriz[2][0]))
            txt20.setText("X");
        if("x".equals(matriz[2][1]))
            txt21.setText("X");
        if("x".equals(matriz[2][2]))
            txt22.setText("X");
    }
   
    
    public void substituir2(){
        
        if("o".equals(matriz[0][0]))
            txt00.setText("O");
        if("o".equals(matriz[0][1]))
            txt01.setText("O");
        if("o".equals(matriz[0][2]))
            txt02.setText("O");

        if("o".equals(matriz[1][0]))
            txt10.setText("O");
        if("o".equals(matriz[1][1]))
            txt11.setText("O");
        if("o".equals(matriz[1][2]))
            txt12.setText("O");

        if("o".equals(matriz[2][0]))
            txt20.setText("O");
        if("o".equals(matriz[2][1]))
            txt21.setText("O");
        if("o".equals(matriz[2][2]))
            txt22.setText("O");
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        horizontal = new javax.swing.JTextField();
        vertical = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        txt00 = new javax.swing.JLabel();
        txt01 = new javax.swing.JLabel();
        txt02 = new javax.swing.JLabel();
        txt12 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt20 = new javax.swing.JLabel();
        txt21 = new javax.swing.JLabel();
        txt22 = new javax.swing.JLabel();
        txtVezJogador = new javax.swing.JLabel();
        btnPlacar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("|");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("|");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setText("|");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("|");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("|");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("|");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("|");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("|");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("--------------------");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setText("--------------------");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setText("|");

        btnOk.setText("ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txt00.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt00.setText("*");

        txt01.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt01.setText("*");

        txt02.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt02.setText("*");

        txt12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt12.setText("*");

        txt11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt11.setText("*");

        txt10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt10.setText("*");

        txt20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt20.setText("*");

        txt21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt21.setText("*");

        txt22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt22.setText("*");

        txtVezJogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVezJogador.setText("jogador1");

        btnPlacar.setText("placar");
        btnPlacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacarActionPerformed(evt);
            }
        });

        jLabel12.setText("Horizontal");

        jLabel13.setText("Vertical");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt10)
                            .addComponent(txt20))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(txt21)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)
                                .addComponent(txt22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(46, 46, 46)
                                        .addComponent(txt11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26)
                                        .addComponent(txt12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(38, 38, 38))))
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt00)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txt01)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(txt02)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vertical, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtVezJogador)
                                        .addGap(22, 22, 22)))))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(txt01)
                                    .addComponent(txt02))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt00)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtVezJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vertical, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt12))
                            .addGap(7, 7, 7)))
                    .addComponent(txt10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlacar))
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt22)
                            .addComponent(txt21)
                            .addComponent(txt20))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        contador++;
        
        if(contador == 9){
            JOptionPane.showMessageDialog(null, "Deu velha");
            velha++;
            zerar();
            
        }
        
        if(txtVezJogador.getText().equals("jogador1")){        
            try{
                if("x".equals(matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())]) || "o".equals(matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())])  ){  
                    JOptionPane.showMessageDialog(null, "Já está preenchido");
                    horizontal.setText("");
                    vertical.setText("");
                    contador--;
                }
                else{
                    matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())] = "x";
                    substituir();
                    verificacao1();
                    horizontal.setText("");
                    vertical.setText("");
                    txtVezJogador.setText("jogador2");
                
                }
            }
            catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Insira um valor entre 0 e 3");
            }
        }
        
        
        
        else if(txtVezJogador.getText().equals("jogador2")){
            try{
                if("x".equals(matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())]) || "o".equals(matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())])  ){  
                    JOptionPane.showMessageDialog(null, "Já está preenchido");
                    horizontal.setText("");
                    vertical.setText("");
                    contador--;
                }
                else{
                    matriz[Integer.parseInt(horizontal.getText())][Integer.parseInt(vertical.getText())] = "o";
                    verificacao2();
                    substituir2();
                    horizontal.setText("");
                    vertical.setText("");
                    txtVezJogador.setText("jogador1");
                }
            }
            catch(Exception erro){
                
                JOptionPane.showMessageDialog(null, "Insira um valor entre 0 e 3");
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnPlacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacarActionPerformed
        JOptionPane.showMessageDialog(null, "Placar jogador 1 = " + placar1 +  " " + "Placar jogador 2 = " + placar2 + " Velha = " + velha);
        
    }//GEN-LAST:event_btnPlacarActionPerformed

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
            java.util.logging.Logger.getLogger(Velha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Velha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Velha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Velha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Velha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPlacar;
    private javax.swing.JTextField horizontal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt00;
    private javax.swing.JLabel txt01;
    private javax.swing.JLabel txt02;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt20;
    private javax.swing.JLabel txt21;
    private javax.swing.JLabel txt22;
    private javax.swing.JLabel txtVezJogador;
    private javax.swing.JTextField vertical;
    // End of variables declaration//GEN-END:variables
}
