/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.MedicoDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Medico;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import servico.ExambleListener;
import servico.Gerenciador;
import servico.RevEntity;

/**
 *
 * @author blank
 */
public class TelaListarrMedico extends javax.swing.JInternalFrame {

    private MedicoDao dao = new MedicoDao();
    private DefaultTableModel dtm;
    private JDesktopPane painel;
    private EntityManager em;
    private TelaNovoProntuario novoProntuario;

    /**
     * Creates new form TelaListarrMedico
     */
    public TelaListarrMedico() {
        initComponents();
        dtm = (DefaultTableModel) tabela.getModel();

        for (Medico m : dao.listar()) {
            dtm.addRow(new Object[]{m.getIdMedico(), m.getNOME(), m.getCRM(), m.getCPF(), m.getEMAIL(), m.getESPECIALIDADE()});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVersao = new javax.swing.JButton();
        btnTudo = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CRM", "CPF", "Email", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
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

        btnVersao.setText("Versao");
        btnVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVersaoActionPerformed(evt);
            }
        });

        btnTudo.setText("Todos ");
        btnTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTudoActionPerformed(evt);
            }
        });

        btnProntuario.setText("Prontuario");
        btnProntuario.setEnabled(false);
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JDesktopPane getPainel() {
        return painel;
    }

    public void setPainel(JDesktopPane painel) {
        this.painel = painel;
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void ativarBtn() {
        btnProntuario.setEnabled(true);
    }

    private void attLista() {
        dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(0);

        for (Medico m : dao.listar()) {
            dtm.addRow(new Object[]{m.getIdMedico(), m.getNOME(), m.getCRM(), m.getCPF(), m.getEMAIL(), m.getESPECIALIDADE()});
        }
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //  conferir se uma lista esta selecionada
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            // cria objeto medico
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            Medico medic;
            medic = dao.getById(id);
            // remove do bd
            dao.remove(medic);

            // mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Medico removido !");

            // atualizar lista
            attLista();
        } else {
            // mensagem de erro; ao nao selecionar a linha
            JOptionPane.showMessageDialog(rootPane, "Selecione um Medico da tabela !");
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    public void setNovoProntuario(TelaNovoProntuario novoProntuario) {
        this.novoProntuario = novoProntuario;
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //  conferir se uma lista esta selecionada
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            // cria objeto medico
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            Medico medic;
            medic = dao.getById(id);
            medic.setNOME(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            medic.setCRM(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            medic.setCPF(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            medic.setEMAIL(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            medic.setESPECIALIDADE(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());

            // altera no bd            
            dao.alterar(medic);

            // mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Medico alterado!");

            // atualizar lista
            attLista();
        } else {
            // mensagem de erro; ao nao selecionar a linha
            JOptionPane.showMessageDialog(rootPane, "Selecione um Medico da tabela !");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVersaoActionPerformed

        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            TelaVersionaMedico versao = new TelaVersionaMedico();
            versao.setVisible(true);
            versao.setIdMed(Integer.parseInt(dtm.getValueAt(tabela.getSelectedRow(), 0).toString()));

            versao.setLocation(painel.getWidth() - versao.getWidth(), painel.getHeight() / 3 - versao.getHeight() / 3);
            painel.add(versao);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha da tabela !! ");
        }


    }//GEN-LAST:event_btnVersaoActionPerformed

    private void btnTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTudoActionPerformed
        TelaVersionaMedico versao = new TelaVersionaMedico();
        versao.setVisible(true);
        versao.setLocation(painel.getWidth() - versao.getWidth(), painel.getHeight() / 3 - versao.getHeight() / 3);
        versao.todos();
        painel.add(versao);

    }//GEN-LAST:event_btnTudoActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()) {
            String medicoSelecionado = tabela.getValueAt(tabela.getSelectedRow(), 1).toString();
            novoProntuario.setLblMedico(medicoSelecionado);
            novoProntuario.setLbIdMedico(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escolha uma linha na tabela !");
        }
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        dtm.setRowCount(0);
        List<Medico> lista = new ArrayList<Medico>();
        
        String filtro = txtFiltro.getText();
        lista = dao.filtrar(filtro);
        
        for (Medico m : lista) {
            dtm.addRow(new Object[]{m.getIdMedico(), m.getNOME(), m.getCRM(), m.getCPF(), m.getEMAIL(), m.getESPECIALIDADE()});
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnTudo;
    private javax.swing.JButton btnVersao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
