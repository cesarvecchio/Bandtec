package com.mycompany.intregavellinguagemprogramacao;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Cesar
 */
public class Monitoramento extends javax.swing.JFrame {

    public Monitoramento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAtualizar = new javax.swing.JLabel();
        lbMemoria = new javax.swing.JLabel();
        lbDisco = new javax.swing.JLabel();
        lbCPU = new javax.swing.JLabel();
        pbCPU = new javax.swing.JProgressBar();
        pbMemoria = new javax.swing.JProgressBar();
        pbDisco = new javax.swing.JProgressBar();
        lbPercentCPU = new javax.swing.JLabel();
        lbPercentMemoria = new javax.swing.JLabel();
        lbPercentDisco = new javax.swing.JLabel();
        rbGerarAuto = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        lbAtualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\César\\Documents\\NetBeansProjects\\IntregavelLinguagemProgramacao\\src\\main\\img\\refrescar.png")); // NOI18N
        lbAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtualizarMouseClicked(evt);
            }
        });

        lbMemoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMemoria.setText("Memória");
        lbMemoria.setName(""); // NOI18N

        lbDisco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDisco.setText("Disco");

        lbCPU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCPU.setText("CPU");

        lbPercentCPU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPercentCPU.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPercentCPU.setText("0%");

        lbPercentMemoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPercentMemoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPercentMemoria.setText("0%");

        lbPercentDisco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPercentDisco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPercentDisco.setText("0%");

        rbGerarAuto.setText("Gerar Automatico");

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbPercentCPU)
                                    .addComponent(lbCPU)))
                            .addComponent(rbGerarAuto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMemoria)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPercentMemoria))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPercentDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPercentCPU)
                    .addComponent(lbPercentMemoria)
                    .addComponent(lbPercentDisco))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbGerarAuto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lbPercentDisco.getAccessibleContext().setAccessibleName("10%");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtualizarMouseClicked
        Random gerador = new Random();
        Integer pcCPU, pcDisco, pcMemoria;
        Timer timer = new Timer();
        
        
        pcCPU = gerador.nextInt(101);
        pcMemoria = gerador.nextInt(101);
        pcDisco = gerador.nextInt(101);
        
//        TimerTask gerarAuto = new TimerTask(){
//            
//            @Override
//            public void run(){
//                System.out.println("tatata");
//
//            }
//        };
//        timer.cancel();
//        timer.scheduleAtFixedRate(gerarAuto, 0, 1000);
//        
//        if(rbGerarAuto.isSelected()){            
//            
//            
//            
//                    
//        } else {
//            System.out.println("não to ativo");
//            timer.cancel();
//        }
        System.out.println(jLabel1.getSize());
        jLabel1.setSize(1, 1);
        jLabel1.setText("fdvgdfdbrd");
               
        pbCPU.setValue(pcCPU);
        pbMemoria.setValue(pcMemoria);
        pbDisco.setValue(pcDisco);
        
        lbPercentCPU.setText(pcCPU+"%");
        lbPercentMemoria.setText(pcMemoria+"%");
        lbPercentDisco.setText(pcDisco+"%"); 
        
        
    }//GEN-LAST:event_lbAtualizarMouseClicked

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
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbAtualizar;
    private javax.swing.JLabel lbCPU;
    private javax.swing.JLabel lbDisco;
    private javax.swing.JLabel lbMemoria;
    private javax.swing.JLabel lbPercentCPU;
    private javax.swing.JLabel lbPercentDisco;
    private javax.swing.JLabel lbPercentMemoria;
    private javax.swing.JProgressBar pbCPU;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbMemoria;
    private javax.swing.JRadioButton rbGerarAuto;
    // End of variables declaration//GEN-END:variables
}
