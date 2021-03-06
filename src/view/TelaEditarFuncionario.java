/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JDateChooser;
import dao.FuncionarioDao;
import dao.TipoFuncionarioDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import modelo.Funcionario;
import modelo.TipoFuncionario;

/**
 *
 * @author sk
 */
public class TelaEditarFuncionario extends javax.swing.JInternalFrame {

    private FuncionarioDao funcionariodao = new FuncionarioDao();
    private TipoFuncionarioDao tDao = new TipoFuncionarioDao();
    private JTable tabela;
    private String idFuncionario;
    private MaskFormatter mascaraCpf;
    private String nomeCargo = "";

    public TelaEditarFuncionario() {
        initComponents();

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
        } catch (ParseException ex) {
            Logger.getLogger(TelaEditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboFuncao.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();

        for (TipoFuncionario tipo : tDao.listar()) {
            comboModel.addElement(tipo);
        }

        mascaraCpf.install(campoCpf);
        /*
        int idcTipo = 0;
        TipoFuncionario tipoFun = new TipoFuncionario();
        for (TipoFuncionario t : funcionariodao.getTipoFuncionario()) {
            if (this.nomeCargo.equals(t.getDescricao())) {
                idcTipo ++;
                tipoFun = t;
            }
        }*/
    }

    public void setComboFuncao(int indeComboFuncao) {
        this.comboFuncao.setSelectedIndex(indeComboFuncao);
    }

    public void setDataNasc(String dataNa) {
        java.util.Date dat = null;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        try {
            dat = simpleDateFormat.parse(dataNa);
        } catch (ParseException ex) {
            Logger.getLogger(TelaEditarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.util.Date utild = new java.util.Date();
        this.dataNasc.setDate(dat);
    }

    public void setTxtCpf(String cpf) {
        this.campoCpf.setText(cpf);
    }

    public void setTxtEmail(String email) {
        this.txtEmail.setText(email);
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
        int idcTipo = 0;
        TipoFuncionario tipoFun = new TipoFuncionario();
        for (TipoFuncionario t : tDao.listar()) {
            
            if (this.nomeCargo.equals(t.getDescricao())) {
                
                tipoFun = t;
                break;
            }
            idcTipo ++;
        }
        comboFuncao.setSelectedIndex(idcTipo);

    }

    public void setTxtNome(String nome) {
        this.txtNome.setText(nome);
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        comboFuncao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("NOME");

        jLabel5.setText("DATA NASCIMENTO");

        jLabel8.setText("EMAIL");

        jLabel4.setText("FUNÇÃO");

        comboFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel2.setText("CPF");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar alterações");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFuncao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(btnGravar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(105, 105, 105))
                            .addComponent(jLabel2)
                            .addComponent(campoCpf))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(btnGravar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        java.sql.Date sqlData = new java.sql.Date(dataNasc.getDate().getTime());
        DefaultTableModel dtm;

        TipoFuncionario tipo = (TipoFuncionario) comboFuncao.getSelectedItem();
        
        idFuncionario.trim();
        Funcionario fu = funcionariodao.getById(Integer.parseInt(idFuncionario));
        fu.setNOME(txtNome.getText());
        fu.setCPF(campoCpf.getText());
        fu.setEMAIL(txtEmail.getText());
        fu.setDataNascimento(sqlData);
        fu.setTipoFuncionario(tipo);


        // valida cpf
        String validar = txtEmail.getText().toString().trim();
        int tamanho = validar.length();
        String valiCpf = campoCpf.getText().trim();
        if (validar.indexOf('@') > 0 && valiCpf.length() > 13) {

             funcionariodao.atualliza(fu);

            // Zerar os campos
            txtNome.setText("");
            txtEmail.setText("");
            campoCpf.setText("");
            comboFuncao.setSelectedIndex(0);

            DefaultTableModel dt = (DefaultTableModel) tabela.getModel();
            dt.setRowCount(0);

            List<Funcionario> listaf = new ArrayList<Funcionario>();
            listaf = funcionariodao.listar();
            for (Funcionario f : listaf) {
                dt.insertRow(dt.getRowCount(), new Object[]{f.getIdFuncionario(), f.getNOME(), f.getCPF(), f.getDataNascimento(), f.getTipoFuncionario().getDescricao(), f.getEMAIL()});
            }

            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Email invalido");
        }

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JComboBox<String> comboFuncao;
    private com.toedter.calendar.JDateChooser dataNasc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
