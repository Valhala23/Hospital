/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author skynetx
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        JMenuItem menuSobre = new JMenuItem("Sobre");
        JMenuItem menuFuncao = new JMenuItem("Funcao");       
        JMenuItem menuGrid = new JMenuItem("Layout");
        JMenuItem menuAla = new JMenuItem("Tipo Quarto (ALA)");
        
        // Exibe a janela de login
        
        TelaUser user = new TelaUser(this, rootPaneCheckingEnabled);
        user.setLocationRelativeTo(null);
        user.setPrincipal(this);
        user.setVisible(true);
       
        
        menuTelas.add(menuSobre);
        menuTelas.add(menuFuncao);
        menuTelas.add(menuGrid);
        menuTelas.add(menuAla);
        
        lblListar.setVisible(false);
        lblIncluir.setVisible(false);
        
        menuSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 TelaSobre sobre = new TelaSobre();
                 sobre.setVisible(true);
            }
        });
        
        
        menuFuncao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaNovaFuncao telaNovaFuncao = new TelaNovaFuncao();               
                
                painelDesktop.repaint();
                painelDesktop.add(telaNovaFuncao);
                telaNovaFuncao.setVisible(true);
            }
        });
        
       menuGrid.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 TelaGridLayout telaGridLayout = new TelaGridLayout();
                 telaGridLayout.setVisible(true);
            }
        });
       
       menuAla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaNovaAla telaNovaAla = new TelaNovaAla();               
                
                painelDesktop.repaint();
                painelDesktop.add(telaNovaAla);
                telaNovaAla.setVisible(true);
            }
        });
        
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
        jLabel2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIncluir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btnDoenca = new javax.swing.JButton();
        btnMedicamento = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnListaPacient = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ImageIcon fundo = new ImageIcon(getClass().getResource("/imagens/fundo.jpg"));
        Image img = fundo.getImage();
        painelDesktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnNovoPaciente = new javax.swing.JButton();
        btnQuarto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuTelas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(171, 171, 171));
        jPanel1.setLayout(new java.awt.GridLayout(2, 3, 30, 20));
        jPanel1.add(jLabel2);

        lblLogo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(44, 26, 22));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Hospital Hiber");
        jPanel1.add(lblLogo);
        jPanel1.add(jLabel1);

        lblListar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListar.setText("Listar");
        lblListar.setFocusable(false);
        lblListar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblListar);
        jPanel1.add(jLabel3);

        lblIncluir.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblIncluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncluir.setText("Incluir");
        lblIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lblIncluir);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        painelBotoes.setBackground(new java.awt.Color(254, 254, 254));
        painelBotoes.setLayout(new java.awt.GridLayout(2, 4, 50, 10));

        btnDoenca.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnDoenca.setText("Doenca");
        btnDoenca.setPreferredSize(new java.awt.Dimension(150, 35));
        btnDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoencaActionPerformed(evt);
            }
        });
        painelBotoes.add(btnDoenca);

        btnMedicamento.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnMedicamento.setText("Medicamento");
        btnMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentoActionPerformed(evt);
            }
        });
        painelBotoes.add(btnMedicamento);

        jButton2.setText("Medico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelBotoes.add(jButton2);

        btnFuncionario.setText("Funcionario");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        painelBotoes.add(btnFuncionario);

        btnListaPacient.setText("Paciente");
        btnListaPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPacientActionPerformed(evt);
            }
        });
        painelBotoes.add(btnListaPacient);

        jButton3.setText(".");
        jButton3.setEnabled(false);
        painelBotoes.add(jButton3);

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setLayout(new java.awt.GridLayout(2, 4, 50, 10));

        jButton7.setText("Novo Funcionario");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setText("Novo Medico");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton6.setText(".");
        jButton6.setEnabled(false);
        jPanel3.add(jButton6);

        btnNovoPaciente.setText("Novo Paciente");
        btnNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovoPaciente);

        btnQuarto.setText("Quarto");
        btnQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartoActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuarto);

        jButton1.setText(".");
        jButton1.setEnabled(false);
        jPanel3.add(jButton1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );

        menuTelas.setText("Telas");
        menuBar.add(menuTelas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoencaActionPerformed
        TelaDoenca telaDoenca = new TelaDoenca();
        if(painelDesktop.getAllFrames() != null)
                   painelDesktop.removeAll();
        painelDesktop.repaint();
        painelDesktop.add(telaDoenca);
        telaDoenca.setVisible(true);
    }//GEN-LAST:event_btnDoencaActionPerformed

    private void btnMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentoActionPerformed
        TelaMedicamento telaMedicamento = new TelaMedicamento();
        if(painelDesktop.getAllFrames() != null)
                   painelDesktop.removeAll();
        painelDesktop.repaint();
        painelDesktop.add(telaMedicamento);
        telaMedicamento.setVisible(true);
        
    }//GEN-LAST:event_btnMedicamentoActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        TelaFuncionario telaFuncionario = new TelaFuncionario();
        telaFuncionario.setPainel(painelDesktop);
        if(painelDesktop.getAllFrames() != null)
                painelDesktop.removeAll();
        painelDesktop.repaint();
        painelDesktop.add(telaFuncionario);
        telaFuncionario.setVisible(true);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        TelaNovoFuncionario novoFuncionario = new TelaNovoFuncionario();
        novoFuncionario.setVisible(true);
        painelDesktop.add(novoFuncionario);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TelaNovoMedico telaNovoMedico = new TelaNovoMedico();
        telaNovoMedico.setVisible(true);
        painelDesktop.add(telaNovoMedico);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaListarrMedico telaMedico = new TelaListarrMedico();
        telaMedico.setVisible(true);
        painelDesktop.add(telaMedico);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPacienteActionPerformed
        NovoPaciente telaNovoP = new NovoPaciente();
        telaNovoP.setVisible(true);
        painelDesktop.add(telaNovoP);
    }//GEN-LAST:event_btnNovoPacienteActionPerformed

    private void btnListaPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPacientActionPerformed
        TelaListarPacient telaListarPacient = new TelaListarPacient();
        telaListarPacient.setVisible(true);
        painelDesktop.add(telaListarPacient);
    }//GEN-LAST:event_btnListaPacientActionPerformed

    private void btnQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartoActionPerformed
        
        TelaQuarto telaQuarto = new TelaQuarto();
        telaQuarto.setPainelDktp(painelDesktop);
        telaQuarto.setVisible(true);
        painelDesktop.add(telaQuarto);
        
    }//GEN-LAST:event_btnQuartoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoenca;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnListaPacient;
    private javax.swing.JButton btnMedicamento;
    private javax.swing.JButton btnNovoPaciente;
    private javax.swing.JButton btnQuarto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIncluir;
    private javax.swing.JLabel lblListar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuTelas;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JDesktopPane painelDesktop;
    // End of variables declaration//GEN-END:variables
}
