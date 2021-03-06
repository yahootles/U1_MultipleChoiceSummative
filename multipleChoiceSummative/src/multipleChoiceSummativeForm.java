/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho6229
 */
public class multipleChoiceSummativeForm extends javax.swing.JFrame {

    /**
     * Creates new form multipleChoiceSummativeForm
     */
    final String Q1 = "What is the atomic number of tungsten?";
    final String A1 = "74";
    final String Q2 = "What year did World War 1 end?";
    final String A2 = "1918";
    final String Q3 = "How many Harry Potter novels are there?";
    final String A3 = "7";
    final String Q4 = "What is 7 + 8?";
    final String A4 = "15";
    final String Q5 = "What is Mr. Kaune's room number?";
    final String A5 = "303";

    int question = 0;
    String correctAnswer;
    int random1, random2, random3;
    int numCorrect = 0;
    int numIncorrect = 0;
    double percentCor = 0;

    public multipleChoiceSummativeForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        questionTitleLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        aTitleLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bTitleLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        cTitleLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        dTitleLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        answerPromptLabel = new javax.swing.JLabel();
        userAnswerText = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        numCorrectTitleLabel = new javax.swing.JLabel();
        numIncorrectTitleLabel = new javax.swing.JLabel();
        numIncorrectTitleLabel1 = new javax.swing.JLabel();
        numCorrectLabel = new javax.swing.JLabel();
        numIncorrectLabel = new javax.swing.JLabel();
        percentCorrectLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setFont(new java.awt.Font("Incised901Greek Ct BT", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(153, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("MEGA-FUN MULTIPLE CHOICE!");

        questionTitleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        questionTitleLabel.setText("Question:");

        questionLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        aTitleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        aTitleLabel.setText("a:");

        aLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        bTitleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        bTitleLabel.setText("b:");

        bLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        cTitleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        cTitleLabel.setText("c:");

        cLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        dTitleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        dTitleLabel.setText("d:");

        dLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        answerPromptLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        answerPromptLabel.setText("Enter your answer:");

        userAnswerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswerTextActionPerformed(evt);
            }
        });

        enterButton.setText("ENTER");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        numCorrectTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numCorrectTitleLabel.setText("Number correct:");

        numIncorrectTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numIncorrectTitleLabel.setText("Number incorrect:");

        numIncorrectTitleLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numIncorrectTitleLabel1.setText("Percent correct:");

        numCorrectLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numCorrectLabel.setText("0");

        numIncorrectLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numIncorrectLabel.setText("0");

        percentCorrectLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentCorrectLabel.setText("0%");

        startLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startLabel.setText("Press the ENTER button to start.");

        answerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dTitleLabel)
                            .addComponent(cTitleLabel)
                            .addComponent(bTitleLabel)
                            .addComponent(aTitleLabel)
                            .addComponent(questionTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(numIncorrectTitleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numIncorrectLabel))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(numCorrectTitleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numCorrectLabel))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(answerPromptLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addComponent(enterButton))
                            .addComponent(answerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(numIncorrectTitleLabel1)
                                .addGap(80, 80, 80)
                                .addComponent(percentCorrectLabel)))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addComponent(startLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(startLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionTitleLabel)
                    .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aTitleLabel)
                    .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bTitleLabel)
                    .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cTitleLabel)
                    .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dTitleLabel)
                    .addComponent(dLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerPromptLabel)
                    .addComponent(userAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton))
                .addGap(18, 18, 18)
                .addComponent(answerLabel)
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numCorrectTitleLabel)
                    .addComponent(numCorrectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numIncorrectTitleLabel)
                    .addComponent(numIncorrectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numIncorrectTitleLabel1)
                    .addComponent(percentCorrectLabel))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAnswerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAnswerTextActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        startLabel.setText("");
        question++;

        if (question <= 6) {

            if (question != 1) {
                //check if answer is correct
                if (userAnswerText.getText().equals(correctAnswer) || userAnswerText.getText().equals(correctAnswer.toUpperCase())) {
                    //tell user that answer was correct, update number correct
                    answerLabel.setText("Congratulations! That was the correct answer!");
                    numCorrect++;
                    numCorrectLabel.setText("" + numCorrect);
                } else {
                    //tell user the correct answer, then update number incorrect
                    answerLabel.setText("Incorrect. The answer was " + correctAnswer + ".");
                    numIncorrect++;
                    numIncorrectLabel.setText("" + numCorrect);
                }
            }

            //clear text box
            userAnswerText.setText("");

            //update percentage correct
            percentCor = Math.round(((double) numCorrect / (double) (question - 1) * 100));
            percentCorrectLabel.setText("" + percentCor + "%");

            if (question == 1) {
                questionLabel.setText(Q1);
                random1 = (int) (Math.round(Math.random() * 15) + 1);
                random2 = (int) (Math.round(Math.random() * 30) + 17);
                random3 = (int) (Math.round(Math.random() * 20) + 76);
                correctAnswer = "b";

                aLabel.setText("" + random1);
                bLabel.setText(A1);
                cLabel.setText("" + random3);
                dLabel.setText("" + random2);
            } else if (question == 2) {
                //show next question and randomize incorrect answers
                questionLabel.setText(Q2);
                random1 = (int) (Math.round(Math.random() * 15) + 1900);
                random2 = (int) (Math.round(Math.random() * 40) + 1918);
                random3 = (int) (Math.round(Math.random() * 60) + 1930);
                correctAnswer = "c";

                aLabel.setText("" + random2);
                bLabel.setText("" + random1);
                cLabel.setText(A2);
                dLabel.setText("" + random3);
                //hi
            } else if (question == 3) {
                //show next question and randomize incorrect answers
                questionLabel.setText(Q3);
                random1 = (int) (Math.round(Math.random() * 2) + 1);
                random2 = (int) (Math.round(Math.random() * 2) + 3);
                random3 = (int) (Math.round(Math.random() * 4) + 7);
                correctAnswer = "a";

                aLabel.setText(A3);
                bLabel.setText("" + random2);
                cLabel.setText("" + random3);
                dLabel.setText("" + random1);
            } else if (question == 4) {
                //show next question and randomize incorrect answers
                questionLabel.setText(Q4);
                random1 = (int) (Math.round(Math.random() * 13) + 1);
                random2 = (int) (Math.round(Math.random() * 10) + 1);
                random3 = (int) (Math.round(Math.random() * 2) + 16);
                correctAnswer = "b";

                aLabel.setText("" + random3);
                bLabel.setText(A4);
                cLabel.setText("" + random1);
                dLabel.setText("" + random2);
            } else if (question == 5) {
                //show next question and randomize incorrect answers
                questionLabel.setText(Q5);
                random1 = (int) (Math.round(Math.random() * 3) + 299);
                random2 = (int) (Math.round(Math.random() * 4) + 304);
                random3 = (int) (Math.round(Math.random() * 7) + 307);
                correctAnswer = "d";

                aLabel.setText("" + random2);
                bLabel.setText("" + random1);
                cLabel.setText("" + random3);
                dLabel.setText(A5);
            } else if (question == 6) {
                if (percentCor > 50) {
                    startLabel.setText("Congratulations, you passed the quiz!");
                } else {
                    startLabel.setText("We are sorry to inform you that you failed.");
                }
                //turn enter button to exit button
                enterButton.setText("EXIT");
                
                //clear question and answer labels
                aLabel.setText("");
                bLabel.setText("");
                cLabel.setText("");
                dLabel.setText("");
                questionLabel.setText("");
                
            }
        } else {
            //exit the program
            System.exit(0);
        }

    }//GEN-LAST:event_enterButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        //exit the program
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(multipleChoiceSummativeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceSummativeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceSummativeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(multipleChoiceSummativeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new multipleChoiceSummativeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JLabel aTitleLabel;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel answerPromptLabel;
    private javax.swing.JLabel bLabel;
    private javax.swing.JLabel bTitleLabel;
    private javax.swing.JLabel cLabel;
    private javax.swing.JLabel cTitleLabel;
    private javax.swing.JLabel dLabel;
    private javax.swing.JLabel dTitleLabel;
    private javax.swing.JButton enterButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel numCorrectLabel;
    private javax.swing.JLabel numCorrectTitleLabel;
    private javax.swing.JLabel numIncorrectLabel;
    private javax.swing.JLabel numIncorrectTitleLabel;
    private javax.swing.JLabel numIncorrectTitleLabel1;
    private javax.swing.JLabel percentCorrectLabel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionTitleLabel;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userAnswerText;
    // End of variables declaration//GEN-END:variables
}
