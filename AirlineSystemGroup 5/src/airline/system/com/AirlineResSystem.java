package airline.system.com;


import javax.swing.JLabel; //container for frame in API
import java.awt.print.PrinterException;
import java.util.Date; //date currently in system
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirlineResSystem extends javax.swing.JFrame {


   
	public static final long serialVersionUID = 1L;
	
    public AirlineResSystem() {
        initComponents();
    }

    public void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel() ;
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        timing = new javax.swing.JTextField();
        fmobile = new javax.swing.JTextField();
        fees = new javax.swing.JTextField();
        ppe  = new javax.swing.JTextField();
        dep  = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 38)); // NOI18N
        jLabel1.setText("  Airline Reservation System");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Enter CNIC No:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Timing:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Enter Mobile Number:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Departure");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Enter Name:");
        
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("No of Seats");
        
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Arrival");

        name.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N 

        fname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        timing.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        fmobile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        fees.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        ppe.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        
        dep.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        
        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N //1 for overall bold text on area 
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton1.setText("Generate Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setText("Print Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setText("Advanced");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
       
      
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup( //HORIZONTAL SIZE SETTINGS
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           
            .addGroup(layout.createSequentialGroup()
            	.addGap(150, 150, 150) //Gap of main Airline R S horizontally (left to right right to left)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE) //show the text limit of Airline 
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30) // ENTRY all gaps of labels in sequential form
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE) //Text and entry gap after  limit
                            
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timing, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)    //Textfield limit size
                            .addComponent(fmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            
                            .addComponent(ppe, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)//gap between buttons 1 2
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE) //Button Text limit field
                        .addGap(35, 35, 35)//gap between buttons 2 3
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)//gap between buttons 3 4
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE) // Scroll pane size horizontal
                .addGap(10, 10, 10))//horizontal gap of scroll pane and  frame
        )));
        layout.setVerticalGroup( //VERTICAL SIZE SETTINGS
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41) //Gap of first main Airline label to others 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                    		
                    		
                                
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE) // gap of 2nd label name and third label
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)) //name textfield area vertically spreador big
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timing, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE) // gap of 2nd label name and third label
                                .addComponent(ppe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)) //name textfield area vertically spreador big
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE) // gap of 2nd label name and third label
                                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)) //name textfield area vertically spreador big
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            
                            )
                        .addGap(41, 41, 41) //vertically gap between labels,textfield and buttons
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)//button inner textfield size
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        
                        .addGap(0, 1, Short.MAX_VALUE)) //vertical gap of scroll pane and jframe
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      

 
  area.setText("          *    Airline Reservation System      *\n"+area.getText());

   
    Date obj = new Date();
    String  date = obj.toString();
    
    area.setText(area.getText()+"\n"+date+"\n\n");
     area.setText(area.getText()+"Name              :"+name.getText()+"\n\n");
      area.setText(area.getText()+"CNIC              : "+fname.getText()+"\n\n");
       area.setText(area.getText()+"Timing            :"+timing.getText()+"\n\n");
        area.setText(area.getText()+"Mobile No       :"+fmobile.getText()+"\n\n");
        area.setText(area.getText()+"No of Seats     :"+ppe.getText()+"\n\n");
        area.setText(area.getText()+"Arrival            :"+dep.getText()+"\n\n");
         area.setText(area.getText()+"Departure       :"+fees.getText()+"\n\n");
         
       
          area.setText(area.getText()+"\n                      SIGNATURE :" );
    
    
   
  
    }

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        area.setText("");
         name.setText("");
          fname.setText("");
           timing.setText("");
            fmobile.setText("");
             fees.setText("");
             ppe.setText("");
             dep.setText("");
    }

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        {
            try {
                area.print();
            }
            catch (PrinterException ex) {
                Logger.getLogger(AirlineResSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        area.setText("");
         name.setText("");
          fname.setText("");
           timing.setText("");
            fmobile.setText("");
             fees.setText("");
             ppe.setText("");
             dep.setText("");
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AirlineResSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirlineResSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirlineResSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlineResSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirlineResSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField name;
    public javax.swing.JTextField timing;
    public javax.swing.JTextArea area;
    public javax.swing.JTextField fees;
    public javax.swing.JTextField fmobile;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField ppe;
    public javax.swing.JTextField dep;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JScrollPane jScrollPane1;
    
    // End of variables declaration//GEN-END:variables
}
