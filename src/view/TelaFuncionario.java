/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FuncionarioDao;
import dao.TipoFuncionarioDao;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import modelo.Funcionario;
import modelo.TipoFuncionario;

/**
 *
 * @author sk
 */
public class TelaFuncionario extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private javax.swing.JDesktopPane painel;
    private FuncionarioDao funcionarioDao = new FuncionarioDao();
    private TipoFuncionarioDao tf = new TipoFuncionarioDao();

    public void setPainel(JDesktopPane painel) {
        this.painel = painel;
    }

    public TelaFuncionario() {
        initComponents();
        dtm = (DefaultTableModel) tabela.getModel();

        for (Funcionario funcionario : funcionarioDao.listar()) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{funcionario.getIdFuncionario(), funcionario.getNOME(), funcionario.getCPF(), funcionario.getDataNascimento(), funcionario.getTipoFuncionario().getDescricao(), funcionario.getEMAIL()});
        }

        MaskFormatter mascaraCpf = null;
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
        } catch (ParseException ex) {
            Logger.getLogger(TelaNovoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        mascaraCpf.install(campoCpf);

    }

    private String funcao(int idTipo) {
        String f = "";
        campoCpf.setText("");
        campoNome.setText("");

        for (TipoFuncionario tipo : tf.listar()) {
            if (tipo.getIdTipoFuncionario() == idTipo) {
                f = tipo.getDescricao();
            }
        }

        return f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        comboFiltro = new javax.swing.JComboBox<>();

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome:", "CPF:", "NASCIMENTO:", "CARGO", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(30);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(35);
            tabela.getColumnModel().getColumn(0).setMaxWidth(45);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME");

        jLabel2.setText("CPF");

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Nome", "Cpf" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(btnVoltar))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 742, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(campoNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltrar)
                        .addComponent(btnRemover)
                        .addComponent(btnVoltar)
                        .addComponent(btnEditar))
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoFuncionario telaNovoFuncionario = new TelaNovoFuncionario();
        telaNovoFuncionario.setTabela(tabela);

        painel.repaint();
        painel.add(telaNovoFuncionario);
        telaNovoFuncionario.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        btnEditar.setEnabled(true);
        btnRemover.setEnabled(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        TelaEditarFuncionario telaEditarFuncionario = new TelaEditarFuncionario();

        //setar os campos
        String nomeCargo = tabela.getValueAt(tabela.getSelectedRow(), 4).toString().trim();
        telaEditarFuncionario.setNomeCargo(nomeCargo);
        telaEditarFuncionario.setTabela(tabela);
        telaEditarFuncionario.setTxtNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        telaEditarFuncionario.setTxtCpf(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        telaEditarFuncionario.setDataNasc(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        telaEditarFuncionario.setTxtEmail(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        telaEditarFuncionario.setIdFuncionario(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

        painel.add(telaEditarFuncionario);
        telaEditarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (!tabela.getSelectionModel().isSelectionEmpty()) {

            Funcionario f = new Funcionario();
            for (Funcionario fu : funcionarioDao.listar()) {
                if (fu.getIdFuncionario() == Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString().trim())) {
                    f = fu;
                }
            }

            funcionarioDao.remove(f);

            dtm.setRowCount(0);
            int tam;
            Object linha[] = new Object[funcionarioDao.listar().size()];
            for (Funcionario funcionario : funcionarioDao.listar()) {
                dtm.insertRow(dtm.getRowCount(), new Object[]{funcionario.getIdFuncionario(), funcionario.getNOME(), funcionario.getCPF(), funcionario.getDataNascimento(),funcionario.getTipoFuncionario().getDescricao(), funcionario.getEMAIL()});
            }
            
            JOptionPane.showMessageDialog(rootPane, "Removido ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escolha uma linha ! ");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        /* tratar filtro
        if (comboFiltro.getSelectedItem()!= null || !comboFiltro.getSelectedItem().equals("Escolha") ) {
            
            if (comboFiltro.getSelectedIndex() == 1) {
                dtm.setRowCount(0);
                for (Funcionario funcionario : funcionarioDao.filtroFuncionario(campoNome.getText().toString())) {
                    dtm.insertRow(dtm.getRowCount(), new Object[]{funcionario.getIdFuncionario(), funcionario.getNOME(), funcionario.getCPF(), funcionario.getDataNascimento(), funcionario.getTipoFuncionario().getDescricao(), funcionario.getEMAIL()});
                }

            } else if (comboFiltro.getSelectedIndex() == 2) {
                dtm.setRowCount(0);
                String filtro = campoCpf.getText();

                String filtro1 = filtro.replace('.', ' ');
                String filtro2 = filtro1.replace('-', ' ');

                String finau = filtro2.trim();
                System.out.println("O tamanho da string eh  " + finau.length());
                String cp = null;
                if (finau.length() < 12) {
                    cp = finau.replace(' ', '.');
                } else {
                    cp = finau.substring(0, 11).replace(' ', '.') + finau.substring(11, 13).replace(' ', '-');
                }
                for (Funcionario funcionario : funcionarioDao.filtroFuncionarioCpf(cp)) {
                    dtm.insertRow(dtm.getRowCount(), new Object[]{funcionario.getIdFuncionario(), funcionario.getNOME(), funcionario.getCPF(), funcionario.getDataNascimento(),funcionario.getTipoFuncionario().getDescricao(), funcionario.getEMAIL()});
                }

            }
            campoNome.setText("");
            campoCpf.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escolha um filtro primeiro " + dtm.getValueAt(tabela.getSelectedRow(), 1));
        }
        */

    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}