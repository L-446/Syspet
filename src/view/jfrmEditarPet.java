/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.JTableController;
import dao.PetDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pet;

/**
 *
 * @author leehr
 */
public class jfrmEditarPet extends javax.swing.JDialog {

    public int id_pet;
      private ArrayList<Pet> pets;


    public jfrmEditarPet() {
        initComponents();

        try {
            PetDao pd = new PetDao();
            pets = pd.listar("");
            for (Pet p : pets) {
                DefaultTableModel model = (DefaultTableModel) tbPet.getModel();
                Object linha[] = new Object[]{p.getId(), p.getRaca(), p.getSexo(), p.getIdade(), p.getPeso(), p.getVacinas()};
                model.addRow(linha);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuarios.");
        }
        
        Color minhaCor = new Color(255,228,225);
        getContentPane().setBackground(minhaCor);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPet = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Pet");

        jPanel2.setBackground(new java.awt.Color(255, 228, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Pet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });

        tbPet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Raça", "Sexo", "Idade", "Peso", "Vacinas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addComponent(jTextFieldPesquisa))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jbAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aquario.png"))); // NOI18N
        jLabel6.setText("SYSPET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addGap(40, 40, 40)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAlterar)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbCancelar)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
        fillTable();
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (tbPet.getSelectedRow() > -1) {
            try {
                /*Object selectedObject = (Object) tbPet.getModel().getValueAt(tbPet.getSelectedRow(), 1);
                PetDao pd = new PetDao();
                Pet p;
                int teste = 0;
                
                p = pd.listar(selectedObject.toString(), teste);
                jfrmAlterarPet altera = new jfrmAlterarPet(this);
                
                altera.setId(p.getId());
                altera.jtxtRaca.setText(p.getRaca());
                altera.jtxtSexo.setText(p.getSexo());
                altera.jtxtIdade.setText(Integer.toString(p.getIdade()));
                altera.jtxtPeso.setText(Double.toString(p.getPeso()));
                altera.jtxtVacina.setText(p.getVacinas());
                
                altera.show();*/
                
                id_pet = (int) tbPet.getModel().getValueAt(tbPet.getSelectedRow(), 0);

                jfrmAlterarPet alterar = new jfrmAlterarPet();
                alterar.id_peta = this.id_pet;
                
                //alterar.setModal(true);
                alterar.setVisible(true); 

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao preencher formulário!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para continuar!");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       if (tbPet.getSelectedRow() > -1) {
            try {

                Object selectedObject = (Object) tbPet.getModel().getValueAt(tbPet.getSelectedRow(), 1);

                PetDao pd = new PetDao();

                Pet p;
                int teste = 1;
                p = pd.listar(selectedObject.toString(), teste);
                pd.deletar(p);
                
                ArrayList<Pet> newArrayList = new ArrayList<Pet>();
                for (Pet pet : pets) {
                    if (p.getId() != pet.getId()) {
                        newArrayList.add(pet);
                    }
                }
                pets = newArrayList;
                JOptionPane.showMessageDialog(null, "Dados Excluidos!");

                atualizaTabela();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao deletar Pet!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para continuar!");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
         dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    
     private void fillTable() {
        try {
            ArrayList<Pet> petMatch = new ArrayList<Pet>(); 
            JTableController.limpaJTable(tbPet);
            for (Pet p : pets) {
                if (p.getRaca().toLowerCase().startsWith(jTextFieldPesquisa.getText().toLowerCase())) {
                    petMatch.add(p);
                }
            }
            for (Pet pm : petMatch) {
                DefaultTableModel model = (DefaultTableModel) tbPet.getModel();
                Object linha[] = new Object[]{pm.getId(), pm.getRaca(), pm.getSexo(), pm.getIdade(), pm.getPeso(), pm.getVacinas()};
                model.addRow(linha);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuário.");
        }

    }

    public void atualizaTabela() {
        try {

            DefaultTableModel modelExcluir = (DefaultTableModel) tbPet.getModel();
            while (modelExcluir.getRowCount() > 0) {
                modelExcluir.removeRow(0);
            }
            PetDao pd1 = new PetDao();
            pets = pd1.listar("");
            for (Pet p1 : pets) {
                DefaultTableModel model = (DefaultTableModel) tbPet.getModel();
                Object linha[] = new Object[]{p1.getId(), p1.getRaca(), p1.getSexo(), p1.getIdade(), p1.getPeso(), p1.getVacinas()};
                model.addRow(linha);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuarios.");
        }
    }
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
            java.util.logging.Logger.getLogger(jfrmEditarPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmEditarPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmEditarPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmEditarPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmEditarPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable tbPet;
    // End of variables declaration//GEN-END:variables
}
