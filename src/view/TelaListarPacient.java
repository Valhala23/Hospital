/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PacienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;

/**
 *
 * @author blank
 */
public class TelaListarPacient extends javax.swing.JInternalFrame {

    private PacienteDao dao = new PacienteDao();
    private DefaultTableModel dt;
    private TelaNovoProntuario novoProntuario;
    private JDesktopPane painel;
    private boolean diagnostico;
    private TelaDiagnostico telaDiagnostico = new TelaDiagnostico();
    
    
    private boolean procedimento;
    private TelaProcedimento telaProcedimento = new TelaProcedimento();


    public TelaListarPacient() {
        initComponents();
        dt = (DefaultTableModel) tabela.getModel();

        for (Paciente p : dao.listar()) {
            dt.insertRow(dt.getRowCount(), new Object[]{p.getIdPaciente(), p.getNOME(), p.getDataNascimento().toString(), p.getCPF(), p.getEMAIL()});
        }

    }
    public void mudarNomeBtn(){
        this.btnDetalhes.setText("Diagnostico");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        ntmFiltrar = new javax.swing.JButton();
        btnProcedimento = new javax.swing.JButton();
        btnDetalheProc = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Nascimento", "CPF", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(20);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabela.getColumnModel().getColumn(0).setMaxWidth(30);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnProntuario.setText("Prontuario");
        btnProntuario.setEnabled(false);
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel1.setText("Filtro:");

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });

        ntmFiltrar.setText("Filtrar");
        ntmFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntmFiltrarActionPerformed(evt);
            }
        });

        btnProcedimento.setText("Procedimento");
        btnProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedimentoActionPerformed(evt);
            }
        });

        btnDetalheProc.setText("Detalhe Procedimento");
        btnDetalheProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalheProcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDetalheProc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcedimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ntmFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ntmFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcedimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetalheProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void setDiagnostico(boolean diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setTelaDiagnostico(TelaDiagnostico telaDiagnostico) {
        this.telaDiagnostico = telaDiagnostico;
    }
    
    public void setProcedimento(boolean procedimento) {
        this.procedimento = procedimento;
    }

    public void setTelaProcedimento(TelaProcedimento telaProcedimento) {
        this.telaProcedimento = telaProcedimento;
    }
    
    
    
    public void setPainel(JDesktopPane painel) {
        this.painel = painel;
    }
    
    public void prontuarioBtn() {
        btnProntuario.setEnabled(true);

    }

    private void attLista() {
        dt = (DefaultTableModel) tabela.getModel();
        dt.setRowCount(0);

        for (Paciente p : dao.listar()) {
            dt.addRow(new Object[]{p.getIdPaciente(), p.getNOME(), p.getDataNascimento().toString(), p.getCPF(), p.getEMAIL()});
        }
    }

    public void setNovoProntuario(TelaNovoProntuario novoProntuario) {
        this.novoProntuario = novoProntuario;
    }


    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //  conferir se uma lista esta selecionada
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            // cria objeto medico
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            Paciente pac;
            pac = dao.getById(id);
            // remove do bd
            dao.remove(pac);

            // mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Paciente removido !");

            // atualizar lista
            attLista();
        } else {
            // mensagem de erro; ao nao selecionar a linha
            JOptionPane.showMessageDialog(rootPane, "Selecione um Paciente da tabela !");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            Paciente p = dao.getById(id);
            p.setNOME(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            p.setCPF(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            p.setEMAIL(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            dao.altera(p);
            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso !");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha !");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            String pacienteSelecionado = tabela.getValueAt(tabela.getSelectedRow(), 1).toString();
            novoProntuario.setLbPaciente(pacienteSelecionado);
            novoProntuario.setLbIdPaciente(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escolha uma linha na tabela !");
        }

    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()){
            // pega o id do paciente selecionado
            int idPaciente = Integer.parseInt(dt.getValueAt(tabela.getSelectedRow(),0).toString());
            
            TelaDetalhesProntuario detalhe = new TelaDetalhesProntuario();
            detalhe.setPainel(painel);
            detalhe.setVisible(true);
            
            // Verifica se o usuario iniciou na tela diagnostico
            if (diagnostico){
                
                detalhe.setDiagnostico(true);
                detalhe.setTelaDiagnostico(telaDiagnostico);
                detalhe.setLocation(painel.getWidth() - detalhe.getWidth(), painel.getHeight()/2 - detalhe.getHeight()/2);
            }else
                detalhe.setLocation(painel.getWidth()/2 - detalhe.getWidth()/6, painel.getHeight()/2 - detalhe.getHeight()/2);
            
            detalhe.setIdPaciente(idPaciente);
            detalhe.attTabela();
            painel.add(detalhe);
            
        }else
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha da tabela !");
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void ntmFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntmFiltrarActionPerformed
        String filtro = txtFiltro.getText();
        
        dt.setRowCount(0);
        
        List<Paciente> lista = new ArrayList<Paciente>();
        lista = dao.filtrar(filtro);
        
        for (Paciente p : lista) {
            dt.addRow(new Object[]{p.getIdPaciente(), p.getNOME(), p.getDataNascimento().toString(), p.getCPF(), p.getEMAIL()});
        }
    }//GEN-LAST:event_ntmFiltrarActionPerformed

    private void btnProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedimentoActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()){
            // pega o id do paciente selecionado
            int idPaciente = Integer.parseInt(dt.getValueAt(tabela.getSelectedRow(),0).toString());
            
            TelaDetalhesProntuario detalhe = new TelaDetalhesProntuario();
            detalhe.setPainel(painel);
            detalhe.setVisible(true);
            
            // Verifica se o usuario iniciou na tela diagnostico
            if (procedimento){
                
                detalhe.setProcedimento(true);
                detalhe.setTelaProcedimento(telaProcedimento);
                detalhe.setLocation(painel.getWidth() - detalhe.getWidth(), painel.getHeight()/2 - detalhe.getHeight()/2);
            }else
                detalhe.setLocation(painel.getWidth()/2 - detalhe.getWidth()/6, painel.getHeight()/2 - detalhe.getHeight()/2);
            
            detalhe.setIdPaciente(idPaciente);
            detalhe.attTabela();
            painel.add(detalhe);
            
        }else
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha da tabela !");
    }//GEN-LAST:event_btnProcedimentoActionPerformed

    private void btnDetalheProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalheProcActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()){
            // pega o id do paciente selecionado
            int idPaciente = Integer.parseInt(dt.getValueAt(tabela.getSelectedRow(),0).toString());
            
            TelaDetalheProcedimento detalhe = new TelaDetalheProcedimento();
            detalhe.setPainel(painel);
            detalhe.setVisible(true);
            
            // Verifica se o usuario iniciou na tela diagnostico
            if (procedimento){
                
                detalhe.setProcedimento(true);
                detalhe.setTelaProcedimento(telaProcedimento);
                detalhe.setLocation(painel.getWidth() - detalhe.getWidth(), painel.getHeight()/2 - detalhe.getHeight()/2);
            }else
                detalhe.setLocation(painel.getWidth()/2 - detalhe.getWidth()/6, painel.getHeight()/2 - detalhe.getHeight()/2);
            
            detalhe.setIdPaciente(idPaciente);
            detalhe.attTabela();
            painel.add(detalhe);
            
        }else
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha da tabela !");
            
        
    }//GEN-LAST:event_btnDetalheProcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalheProc;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnProcedimento;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ntmFiltrar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
