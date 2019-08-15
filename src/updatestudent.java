/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasil
 */
import java.awt.Dialog;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class updatestudent extends javax.swing.JDialog {
String ID;
    public updatestudent (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setLocationRelativeTo(parent);
        clearWarning();
    }
  
     public void clearWarning() {
        fnWarning.setVisible(false);
        lnWarning.setVisible(false);
        PhWarning.setVisible(false);
                AdWarning.setVisible(false);
        FWarning.setVisible(false);
        CWarning.setVisible(false);
        SWarning.setVisible(false);
        

    }
       public boolean isAlphabet(String a) {
        return a.matches("[a-zA-Z]+");
    }
 public boolean isNumeric(String a) {
        return a.matches("-?\\d+(\\.\\d+)?");
    }
public updatestudent(String id) {
        initComponents();
         clearWarning();
          this.setLocationRelativeTo(null);
      this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        this.ID = id;
        this.setVisible(true);
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
        lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        course = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        faculty = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        fnWarning = new javax.swing.JLabel();
        PhWarning = new javax.swing.JLabel();
        FWarning = new javax.swing.JLabel();
        lnWarning = new javax.swing.JLabel();
        AdWarning = new javax.swing.JLabel();
        SWarning = new javax.swing.JLabel();
        CWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Student");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone No.");

        register.setText("Update");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "BSC.CSIT", "BSW", "BIM" }));
        course.setToolTipText("");
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setText("Course");

        jLabel1.setText("First Name");

        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Science", "Management" }));
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });

        jLabel2.setText("Last  Name");

        jLabel5.setText("Faculty");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Semester");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        fnWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        fnWarning.setForeground(new java.awt.Color(255, 0, 0));
        fnWarning.setText("Invalid!!");

        PhWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        PhWarning.setForeground(new java.awt.Color(255, 0, 0));
        PhWarning.setText("Invalid!!");

        FWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        FWarning.setForeground(new java.awt.Color(255, 0, 0));
        FWarning.setText("Invalid!!");

        lnWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lnWarning.setForeground(new java.awt.Color(255, 0, 0));
        lnWarning.setText("Invalid!!");

        AdWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        AdWarning.setForeground(new java.awt.Color(255, 0, 0));
        AdWarning.setText("Invalid!!");

        SWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        SWarning.setForeground(new java.awt.Color(255, 0, 0));
        SWarning.setText("Invalid!!");

        CWarning.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        CWarning.setForeground(new java.awt.Color(255, 0, 0));
        CWarning.setText("Invalid!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(course, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faculty, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(FWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lnWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnWarning)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 try {
       
                    
            db_operation1 dbopt = new db_operation1();
            ResultSet rs = dbopt.viewSingleStudentInformation(ID);
            if(rs.next()){
                this.firstname.setText(rs.getString("firstname"));
                this.lastname.setText(rs.getString("lastname"));
                this.phone.setText(rs.getString("phone"));
                        this.address.setText(rs.getString("address"));
                this.faculty.setSelectedItem(rs.getString("faculty"));
                this.course.setSelectedItem(rs.getString("course"));
                this.semester.setSelectedItem(rs.getString("semester"));
                
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(updatestudent.class.getName()).log(Level.SEVERE, null, ex);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        if(isValidInput()){
            ArrayList data =getDataToSave();
            db_operation1 db=new db_operation1();
            db. updateToStudentTable(data,Integer.parseInt(ID));
new LibraryMgmntSys().setVisible(true);
            this.dispose();
           

          

        }        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose(); 
        new view_student(new javax.swing.JFrame(), true).setVisible(true);
              // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed
public ArrayList getDataToSave(){
    ArrayList data=new ArrayList();
    
    data.add(this.firstname.getText());
    data.add(this.lastname.getText());
    data.add(this.phone.getText());
    data.add(this.address.getText());
   
    data.add(this.faculty.getSelectedItem().toString());
    data.add(this.course.getSelectedItem().toString());
        data.add(this.semester.getSelectedItem().toString());


   
    
     
    
    return data;
    
}
     public void clearForm() {
        firstname.setText("");
        lastname.setText("");
       
        phone.setText("");
        address.setText("");
       
        faculty.setSelectedIndex(0);
        course.setSelectedIndex(0);
        semester.setSelectedIndex(0);
    }
    public boolean isValidInput() {
        boolean result = true;
        clearWarning();
        if (firstname.getText().isEmpty()) {
            fnWarning.setText("*Enter FirstName");
            fnWarning.setVisible(true);
            result = false;
        } else if (!isAlphabet(firstname.getText())) {
            fnWarning.setText("!Invalid FirstName");
            fnWarning.setVisible(true);
            result = false;
        }
        if (lastname.getText().isEmpty()) {
            lnWarning.setText("*Enter LastName");
            lnWarning.setVisible(true);
            result = false;
        } else if (!isAlphabet(lastname.getText())) {
            lnWarning.setText("!Invalid LastName");
            lnWarning.setVisible(true);
            result = false;
        }
        
        if(phone.getText().isEmpty()){
            PhWarning.setText("*Enter Phone No.");
            PhWarning.setVisible(true);
        }
        else if(!isNumeric(phone.getText())){
           
               PhWarning.setText("!Invalid Phone No.");
            PhWarning.setVisible(true);
            result = false;
        } 
         if((phone.getText().length())!=10) {
             PhWarning.setText("!Invalide Phone No.");
             PhWarning.setVisible(true);
            result = false;
         }
         
        
        if (address.getText().isEmpty()) {
            AdWarning.setText("*Enter Address");
            AdWarning.setVisible(true);
            result = false;
        } 
       
        if (faculty.getSelectedIndex() == 0) {
            FWarning.setText("*Select Faculty");
            FWarning.setVisible(true);
            result = false;
        }
           if (course.getSelectedIndex() == 0) {
            CWarning.setText("*Select Course");
            CWarning.setVisible(true);
            result = false;
        }
          if (semester.getSelectedIndex() == 0) {
            SWarning.setText("*Select Semester");
            SWarning.setVisible(true);
            result = false;
        }


        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updatestudent dialog = new updatestudent(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdWarning;
    private javax.swing.JLabel CWarning;
    private javax.swing.JLabel FWarning;
    private javax.swing.JLabel PhWarning;
    private javax.swing.JLabel SWarning;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel fnWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lnWarning;
    private javax.swing.JTextField phone;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> semester;
    // End of variables declaration//GEN-END:variables
}
