/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author hamad
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Projects p;
    public Home() {
        initComponents();
        p = new Projects();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        systemname = new javax.swing.JLabel();
        addprojectbutton = new javax.swing.JButton();
        projectslistbutton = new javax.swing.JButton();
        adddonorbutton = new javax.swing.JButton();
        addbeneficiarybutton = new javax.swing.JButton();
        searchprojectbutton = new javax.swing.JButton();
        searchdonorbutton = new javax.swing.JButton();
        searchbeneficiarybuton = new javax.swing.JButton();
        adddonationbutton = new javax.swing.JButton();
        addvolunteerbutton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        systemname.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        systemname.setForeground(new java.awt.Color(0, 153, 153));
        systemname.setText("Donations Management System");

        addprojectbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addprojectbutton.setForeground(new java.awt.Color(0, 102, 102));
        addprojectbutton.setText("Add Project");
        addprojectbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addprojectbuttonMouseClicked(evt);
            }
        });
        addprojectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprojectbuttonActionPerformed(evt);
            }
        });

        projectslistbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        projectslistbutton.setForeground(new java.awt.Color(0, 102, 102));
        projectslistbutton.setText("Projects List");
        projectslistbutton.setPreferredSize(new java.awt.Dimension(99, 25));
        projectslistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectslistbuttonActionPerformed(evt);
            }
        });

        adddonorbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adddonorbutton.setForeground(new java.awt.Color(0, 102, 102));
        adddonorbutton.setText("Add Donor");
        adddonorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddonorbuttonActionPerformed(evt);
            }
        });

        addbeneficiarybutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addbeneficiarybutton.setForeground(new java.awt.Color(0, 102, 102));
        addbeneficiarybutton.setText("Add Beneficiary");
        addbeneficiarybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbeneficiarybuttonActionPerformed(evt);
            }
        });

        searchprojectbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchprojectbutton.setForeground(new java.awt.Color(0, 102, 102));
        searchprojectbutton.setText("Search Project");
        searchprojectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchprojectbuttonActionPerformed(evt);
            }
        });

        searchdonorbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchdonorbutton.setForeground(new java.awt.Color(0, 102, 102));
        searchdonorbutton.setText("Search Donor");
        searchdonorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdonorbuttonActionPerformed(evt);
            }
        });

        searchbeneficiarybuton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchbeneficiarybuton.setForeground(new java.awt.Color(0, 102, 102));
        searchbeneficiarybuton.setText("Search Beneficiary ");
        searchbeneficiarybuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbeneficiarybutonActionPerformed(evt);
            }
        });

        adddonationbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adddonationbutton.setForeground(new java.awt.Color(0, 255, 0));
        adddonationbutton.setText("Add Donation");
        adddonationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddonationbuttonActionPerformed(evt);
            }
        });

        addvolunteerbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addvolunteerbutton.setForeground(new java.awt.Color(0, 102, 102));
        addvolunteerbutton.setText("Add Volunteer");
        addvolunteerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvolunteerbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(systemname))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adddonorbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addprojectbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchprojectbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addvolunteerbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchbeneficiarybuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchdonorbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbeneficiarybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projectslistbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(adddonationbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemname)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addprojectbutton)
                    .addComponent(projectslistbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbeneficiarybutton)
                    .addComponent(adddonorbutton))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchprojectbutton)
                    .addComponent(searchdonorbutton))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbeneficiarybuton)
                    .addComponent(addvolunteerbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(adddonationbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addprojectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprojectbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addprojectbuttonActionPerformed

    private void projectslistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectslistbuttonActionPerformed
        // TODO add your handling code here:
        Projects p = new Projects();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_projectslistbuttonActionPerformed

    private void searchbeneficiarybutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbeneficiarybutonActionPerformed
        // TODO add your handling code here:
        SearchBeneficiary sb = new SearchBeneficiary();
        sb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchbeneficiarybutonActionPerformed

    private void addprojectbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addprojectbuttonMouseClicked
        // TODO add your handling code here:
        addProject p = new addProject();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addprojectbuttonMouseClicked

    private void adddonorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddonorbuttonActionPerformed
         // TODO add your handling code here:
        AddDonor d = new AddDonor();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adddonorbuttonActionPerformed

    private void addbeneficiarybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbeneficiarybuttonActionPerformed
        // TODO add your handling code here:
        AddBeneficiary b = new AddBeneficiary();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addbeneficiarybuttonActionPerformed

    private void searchprojectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchprojectbuttonActionPerformed
        // TODO add your handling code here:
        SearchProject sp = new SearchProject();
        sp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchprojectbuttonActionPerformed

    private void searchdonorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdonorbuttonActionPerformed
        // TODO add your handling code here:
        SearchDonor sd = new SearchDonor();
        sd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchdonorbuttonActionPerformed

    private void adddonationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddonationbuttonActionPerformed
        // TODO add your handling code here:
        AddDonation ad = new AddDonation();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adddonationbuttonActionPerformed

    private void addvolunteerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvolunteerbuttonActionPerformed
        // TODO add your handling code here:
        AddVolunteer av = new AddVolunteer();
        av.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addvolunteerbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbeneficiarybutton;
    private javax.swing.JButton adddonationbutton;
    private javax.swing.JButton adddonorbutton;
    private javax.swing.JButton addprojectbutton;
    private javax.swing.JButton addvolunteerbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton projectslistbutton;
    private javax.swing.JButton searchbeneficiarybuton;
    private javax.swing.JButton searchdonorbutton;
    private javax.swing.JButton searchprojectbutton;
    private javax.swing.JLabel systemname;
    // End of variables declaration//GEN-END:variables
}
