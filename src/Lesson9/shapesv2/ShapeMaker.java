
package Lesson9.shapesv2;

import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ShapeMaker extends javax.swing.JFrame {
StandardPen p;
Shape s;
   
    public ShapeMaker() {
        initComponents();
        SketchPadWindow w= new SketchPadWindow(400,400);
        w.setLocation(50,275);
        p =new StandardPen(w);
        s= new Circle(0,0,0);
    }
    
    private void erase(){
        p.setColor(Color.white);
        s.draw(p);
        p.setColor(Color.blue);
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        circlebtn = new javax.swing.JButton();
        wheelbtn = new javax.swing.JButton();
        rectbtn = new javax.swing.JButton();
        trianglebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        movebtn = new javax.swing.JButton();
        resizebtn = new javax.swing.JButton();
        quitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        circlebtn.setText("Circle");
        circlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtnActionPerformed(evt);
            }
        });

        wheelbtn.setText("Wheel");
        wheelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbtnActionPerformed(evt);
            }
        });

        rectbtn.setText("Rectangle");
        rectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtnActionPerformed(evt);
            }
        });

        trianglebtn.setText("Triangle");
        trianglebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(wheelbtn)
                .addGap(47, 47, 47)
                .addComponent(rectbtn)
                .addGap(48, 48, 48)
                .addComponent(trianglebtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circlebtn)
                    .addComponent(wheelbtn)
                    .addComponent(rectbtn)
                    .addComponent(trianglebtn))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        txtinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtinfo);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        movebtn.setText("Move");
        movebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebtnActionPerformed(evt);
            }
        });

        resizebtn.setText("Resize");
        resizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizebtnActionPerformed(evt);
            }
        });

        quitbtn.setText("Quit");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resizebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(movebtn)
                .addGap(30, 30, 30)
                .addComponent(resizebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(quitbtn)
                .addGap(30, 30, 30))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Select A Shape");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Shape Data");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebtnActionPerformed
        double x= Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x ", "0"));
        double y= Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y ", "0"));
        erase();
        s.move(x,y);
        s.draw(p);
       txtinfo.setText(s.toString());
    }//GEN-LAST:event_movebtnActionPerformed

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0);
       
    }//GEN-LAST:event_quitbtnActionPerformed

    private void circlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtnActionPerformed
         erase();
        s= new Circle(0,0,50);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_circlebtnActionPerformed

    private void rectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtnActionPerformed
        erase();
        s= new Rect(-100,50,200,100);
        s.draw(p);
        txtinfo.setText(s.toString());  // TODO add your handling code here:
    }//GEN-LAST:event_rectbtnActionPerformed

    private void resizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizebtnActionPerformed
        double factor=Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new size factor"));
        erase();
    s.stretchBy(factor);
    s.draw(p);// TODO add your handling code here:
    txtinfo.setText(s.toString());
    }//GEN-LAST:event_resizebtnActionPerformed

    private void wheelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbtnActionPerformed
        erase();
        s= new Wheel(0,0,50,6);
        s.draw(p);
        txtinfo.setText(s.toString());  // // TODO add your handling code here:
    }//GEN-LAST:event_wheelbtnActionPerformed

    private void trianglebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglebtnActionPerformed
        erase();
        s= new Triangle(-50,0,0,+50, 50,0);
        s.draw(p);
        txtinfo.setText(s.toString()); 
    }//GEN-LAST:event_trianglebtnActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circlebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movebtn;
    private javax.swing.JButton quitbtn;
    private javax.swing.JButton rectbtn;
    private javax.swing.JButton resizebtn;
    private javax.swing.JButton trianglebtn;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JButton wheelbtn;
    // End of variables declaration//GEN-END:variables
}
