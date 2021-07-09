
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class LoanAssistant extends javax.swing.JFrame {
   
    public LoanAssistant() {
        initComponents();
        newLoanButton.setEnabled(false);
     }
private Object ComputePayment;
   double loan;
   double interest;
   double month;
   double payment;
   double MonthlyPayment;
   private boolean ComputeButton; 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balanceLable = new javax.swing.JLabel();
        interestLablel = new javax.swing.JLabel();
        monthsLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        monthTextField = new javax.swing.JTextField();
        interestTextField = new javax.swing.JTextField();
        balanceTextField = new javax.swing.JTextField();
        computeButton = new javax.swing.JButton();
        newLoanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        analysisLabel = new javax.swing.JLabel();
        monthsButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");
        setResizable(false);

        balanceLable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        balanceLable.setText("Loan Balance");

        interestLablel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        interestLablel.setText("Interest Rate");
        interestLablel.setAlignmentY(1.0F);

        monthsLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthsLabel.setText("Number of Payments");
        monthsLabel.setAlignmentY(2.0F);

        paymentLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentLabel.setText("Monthly Payment");
        paymentLabel.setAlignmentY(3.0F);

        paymentTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTextFieldActionPerformed(evt);
            }
        });

        monthTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        interestTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        interestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestTextFieldActionPerformed(evt);
            }
        });

        balanceTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        balanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextFieldActionPerformed(evt);
            }
        });

        computeButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        computeButton.setText("Compute Monthly Payments");
        computeButton.setAlignmentY(4.0F);
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        newLoanButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newLoanButton.setText("New Loan Analysis");
        newLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoanButtonActionPerformed(evt);
            }
        });

        analysisTextArea.setEditable(false);
        analysisTextArea.setColumns(20);
        analysisTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        analysisTextArea.setRows(5);
        jScrollPane1.setViewportView(analysisTextArea);

        exitButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        analysisLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        analysisLabel.setText("Loan Analysis");

        monthsButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthsButton.setText("X");
        monthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsButtonActionPerformed(evt);
            }
        });

        paymentButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentButton.setText("X");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interestLablel)
                    .addComponent(balanceLable)
                    .addComponent(monthsLabel)
                    .addComponent(paymentLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monthsButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(329, 329, 329))))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(computeButton)
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(newLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(analysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(balanceLable)
                            .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interestLablel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthsLabel)
                            .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthsButton))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentLabel)
                            .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentButton))
                        .addGap(41, 41, 41)
                        .addComponent(computeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        

    private void balanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextFieldActionPerformed
     balanceTextField.transferFocus();    
    }//GEN-LAST:event_balanceTextFieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
                System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
       
        
double balance, interest, payment;
int months;
double monthlyInterest, multiplier;
double loanBalance, finalPayment;
if (validateDecimalNumber(balanceTextField))
{
balance = Double.valueOf(balanceTextField.getText()).doubleValue();
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
    return;
}
if (validateDecimalNumber(interestTextField))
{
interest = Double.valueOf(interestTextField.getText()).doubleValue();
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
    return;
}
monthlyInterest = interest / 1200;
if(ComputeButton)
{
// Compute loan payment
    if (validateDecimalNumber(monthTextField))
{
months = Integer.valueOf(monthTextField.getText()).intValue();
}
else
{
 JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error",
JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    return;
}    
if (interest == 0)
{
payment = balance / months;
}
else
{

multiplier = Math.pow(1 + monthlyInterest, months);
payment = balance * monthlyInterest * multiplier / (multiplier - 1);
paymentTextField.setText(new DecimalFormat("0.00").format(payment));
}
}
else
{   // Compute number of payments
if (validateDecimalNumber(paymentTextField))
{
payment = Double.valueOf(paymentTextField.getText()).doubleValue();
    if (payment <= (balance * monthlyInterest + 1.0))
{
if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" + new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
{
paymentTextField.setText(new DecimalFormat("0.00").format((int)
(balance * monthlyInterest + 1.0)));
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
}
else
{
paymentTextField.requestFocus();
return;
}
}
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
    return;
}
if (interest == 0)
{
months = (int)(balance / payment);
}
else
{
months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))
/ Math.log(1 + monthlyInterest));
}
monthTextField.setText(String.valueOf(months));
}

// reset payment prior to analysis to fix at two decimals
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
// show analysis
analysisTextArea.setText("Loan Balance: $" + new
DecimalFormat("0.00").format(balance));
analysisTextArea.append("\n" + "Interest Rate: " + new
DecimalFormat("0.00").format(interest) + "%");
// process all but last payment
loanBalance = balance;
for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
{
loanBalance += loanBalance * monthlyInterest - payment;
}
// find final payment
finalPayment = loanBalance;
if (finalPayment > payment)
{
// apply one more payment
loanBalance += loanBalance * monthlyInterest - payment;
finalPayment = loanBalance;
months++;
monthTextField.setText(String.valueOf(months));
}
analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new
DecimalFormat("0.00").format(payment));
analysisTextArea.append("\n" + "Final Payment of: $" + new
DecimalFormat("0.00").format(finalPayment));
analysisTextArea.append("\n" + "Total Payments: $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
analysisTextArea.append("\n" + "Interest Paid $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
computeButton.setEnabled(false);
newLoanButton.setEnabled(true);
newLoanButton.requestFocus();
    
    }//GEN-LAST:event_computeButtonActionPerformed

    private void newLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoanButtonActionPerformed
       if (ComputeButton)
{
paymentTextField.setText("");
}
else
{
monthTextField.setText("");
}

analysisTextArea.setText("");
computeButton.setEnabled(true);
newLoanButton.setEnabled(false);
balanceTextField.requestFocus();
        
    }//GEN-LAST:event_newLoanButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // will compute payment
ComputePayment = true;
paymentButton.setVisible(false);
monthsButton.setVisible(true);
monthTextField.setEditable(true);
monthTextField.setBackground(Color.WHITE);
monthTextField.setFocusable(true);
paymentTextField.setText("");
paymentTextField.setEditable(false);
paymentTextField.setBackground(Color.YELLOW);
paymentTextField.setFocusable(false);
computeButton.setText("Compute Monthly Payment");
balanceTextField.requestFocus();
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void monthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsButtonActionPerformed
              // will compute months
ComputePayment = false;
paymentButton.setVisible(true);
monthsButton.setVisible(false);
monthTextField.setText("");
monthTextField.setEditable(false);
monthTextField.setBackground(Color.YELLOW);
monthTextField.setFocusable(false);
paymentTextField.setEditable(true);
paymentTextField.setBackground(Color.WHITE);
paymentTextField.setFocusable(true);
computeButton.setText("Compute Number of Payments");
balanceTextField.requestFocus();
    }//GEN-LAST:event_monthsButtonActionPerformed

    private void interestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestTextFieldActionPerformed
        // TODO add your handling code here:
        interestTextField.transferFocus();
    }//GEN-LAST:event_interestTextFieldActionPerformed

    private void paymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTextFieldActionPerformed
        // TODO add your handling code here:
        paymentTextField.transferFocus();
    }//GEN-LAST:event_paymentTextFieldActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
        monthTextField.transferFocus();
    }//GEN-LAST:event_monthTextFieldActionPerformed
     private boolean validateDecimalNumber(JTextField tf)
{
// checks to see if text field contains
// valid decimal number with only digits and a single decimal point
String s = tf.getText().trim();
boolean hasDecimal = false;
boolean valid = true;
if (s.length() == 0)
{
valid = false;
}
else
{
for (int i = 0; i < s.length(); i++)
{
char c = s.charAt(i);
if (c >= '0' && c <= '9')
{
continue;
}
else if (c == '.' && !hasDecimal)
{
hasDecimal = true;
}
else
{
// invalid character found
valid = false;
}
}
}
tf.setText(s);
if (!valid)
{
tf.requestFocus();
}
return (valid);
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
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and d
        isplay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analysisLabel;
    private javax.swing.JTextArea analysisTextArea;
    private javax.swing.JLabel balanceLable;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton computeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel interestLablel;
    private javax.swing.JTextField interestTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JButton monthsButton;
    private javax.swing.JLabel monthsLabel;
    private javax.swing.JButton newLoanButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentTextField;
    // End of variables declaration//GEN-END:variables
}
