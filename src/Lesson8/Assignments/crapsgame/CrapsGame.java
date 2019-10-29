
package Lesson8.Assignments.crapsgame;

import java.awt.Color;


public class CrapsGame extends javax.swing.JFrame {

    Craps game;
   
    int money;
    
    public CrapsGame() {
        initComponents();
        game= new Craps(d1Panel.getGraphics(),d2Panel.getGraphics(),d1Panel.getWidth(),d2Panel.getWidth());
       
    
    money=100;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d1Panel = new javax.swing.JPanel();
        d2Panel = new javax.swing.JPanel();
        btnroll = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d1Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout d1PanelLayout = new javax.swing.GroupLayout(d1Panel);
        d1Panel.setLayout(d1PanelLayout);
        d1PanelLayout.setHorizontalGroup(
            d1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        d1PanelLayout.setVerticalGroup(
            d1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        d2Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout d2PanelLayout = new javax.swing.GroupLayout(d2Panel);
        d2Panel.setLayout(d2PanelLayout);
        d2PanelLayout.setHorizontalGroup(
            d2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        d2PanelLayout.setVerticalGroup(
            d2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnroll.setText("Roll");
        btnroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrollActionPerformed(evt);
            }
        });

        btnquit.setText("Quit");
        btnquit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        moneyLabel.setBackground(new java.awt.Color(255, 255, 255));
        moneyLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        moneyLabel.setText("    Money : 100");
        moneyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        outputBox.setColumns(20);
        outputBox.setRows(5);
        jScrollPane1.setViewportView(outputBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(d1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(d2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnquit, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                            .addComponent(moneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(d2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnroll)
                            .addComponent(btnquit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrollActionPerformed
       
        if (money==0 ){
            outputBox.setText("You are out of money, You can't play!");
        }
        else{
        if(game.isNewGame()){
            outputBox.setText("NEW GAME\n=========");
            money-=5;
        }
        game.roll();
        outputBox.append("\nYou rolled a " + game.getTotal());
        if(game.hasWon()){
            outputBox.append("\nYou won - Click Roll to start a new Game");
            //start a new game
            game=new Craps(d1Panel.getGraphics(), d2Panel.getGraphics(), d1Panel.getWidth(),d2Panel.getWidth());
            money+=10;
        }
        else if (game.hasLost()){
            
        outputBox.append("\nYou lost - Click Roll to start a new Game");
        //start a new game
        game=new Craps(d1Panel.getGraphics(), d2Panel.getGraphics(), d1Panel.getWidth(),d2Panel.getWidth());
        }
        else{
            outputBox.append("\nGame continues - roll a "+ game.getPoint() + " to win or 7 to lose");
        }
       moneyLabel.setText("Money $ "+ money) ;
        }
    }//GEN-LAST:event_btnrollActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        // TODO add your handling code here:
        outputBox.setText("");
       // money=100;
        //moneyLabel.setText("Money $ "+ money) ;
    }//GEN-LAST:event_btnquitActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnroll;
    private javax.swing.JPanel d1Panel;
    private javax.swing.JPanel d2Panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextArea outputBox;
    // End of variables declaration//GEN-END:variables
}
