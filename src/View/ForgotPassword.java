package View;

import Model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    ArrayList<User> userList = new ArrayList<>();

    /////////////Contructor
    public ForgotPassword() {
        initComponents();
        userList = new DAO.ConnectionSQL().getListUser();

        txtNewPassword.setEnabled(false);
        txtPhone.setEnabled(false);
        btSearch.setEnabled(false);
        btUpdate.setEnabled(false);
        setLocationRelativeTo(null);

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
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        btSearch = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        btClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T Coffee Forgot Password");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("UserName:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Phone number:");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("New Password:");

        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });

        btSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btClose.setText("Close");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txtPhone)
                    .addComponent(txtEmail)
                    .addComponent(txtNewPassword))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClose))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btClear)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
///////////////////////////////////// button Search
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        String userName = txtUsername.getText();
        String phoneNumber = txtPhone.getText();
        String email = txtEmail.getText();
        String password = txtNewPassword.getText();
        String emailParterm = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        boolean check = false;

        try {
            for (User user : userList) {
                // Kiểm tra username và email
                if (userName.equals(user.getUserName()) && email.equals(user.getEmail()) && email.matches(emailParterm)) {
                    // Thông báo yêu cầu nhập số điện thoại
                    JOptionPane.showMessageDialog(rootPane, "Please enter phone number of account to get new password.");

                    // Cập nhật giao diện
                    txtUsername.setText(user.getUserName());
                    txtUsername.setEnabled(false);
                    txtEmail.setText(user.getEmail());
                    txtEmail.setEnabled(false);
                    txtPhone.setEnabled(true);

                    // Kiểm tra số điện thoại
                    if (phoneNumber.equals(user.getPhoneNumber())) {
                        check = true;
                        // Nếu số điện thoại khớp, bật nút cập nhật mật khẩu và yêu cầu nhập mật khẩu mới
                        JOptionPane.showMessageDialog(rootPane, "Correct! Please enter a new password.");
                        btUpdate.setEnabled(true);
                        txtNewPassword.setEnabled(true);
                        txtPhone.setEnabled(false);  // Không cho phép chỉnh sửa lại số điện thoại
                        break;  // Thoát khỏi vòng lặp nếu tìm thấy tài khoản đúng
                    } else {
                        // Số điện thoại không khớp, thông báo lỗi và thoát
                        JOptionPane.showMessageDialog(rootPane, "This phone number is not correct with this account. Please try again.");
                        return;  // Dừng luôn việc tìm kiếm
                    }
                }
            }

            // Nếu không tìm thấy username hoặc email khớp
            if (!check) {
                JOptionPane.showMessageDialog(rootPane, "Incorrect username or email! Cannot find account.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btSearchActionPerformed
////////////////////////////////// update button
    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        String userName = txtUsername.getText();
        String phoneNumber = txtPhone.getText();
        String email = txtEmail.getText();
        String password = txtNewPassword.getText();
        String emailParterm = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        String phoneParterm = "^[0-9]*$";
        boolean check = false;
        try {
            for (User user : userList) {
                // Kiểm tra username và email

                // Cập nhật mật khẩu vào cơ sở dữ liệu
                boolean updated = new DAO.ConnectionSQL().updateData(userName, password);
                if (updated) {
                    JOptionPane.showMessageDialog(rootPane, "Password updated successfully.");
                    break;  // Thoát vòng lặp sau khi thành công
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Failed to update password. Please try again.");
                    break;  // Thoát vòng lặp ngay cả khi thất bại
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }


    }//GEN-LAST:event_btUpdateActionPerformed
///////////////////////////////////////// KeyReleased
    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased
/////////////////////////////////// clear button
    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btClearActionPerformed
////////////////////////////////////////close button
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_btCloseActionPerformed
/////////////////////// clear method

    public void clear() {
        txtUsername.setText("");
        txtNewPassword.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    }

    ////////////////////////Validate - kiem tra hop le
    public void ValidateFields() {
        String userName = txtUsername.getText();
        String password = txtNewPassword.getText();
        String phoneNumber = txtPhone.getText();
        String email = txtEmail.getText();
        String phoneParterm = "^[0-9]*$";
        String emailParterm = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        if (!userName.equals("") && email.matches(emailParterm)) {
            btSearch.setEnabled(true);
        } else {
            btSearch.setEnabled(false);
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
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}