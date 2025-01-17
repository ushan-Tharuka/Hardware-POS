package stock;

import JDBC.Jdbc;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;





public class stock extends javax.swing.JFrame {
    //create jdbc object
    Jdbc db = new Jdbc();
    
    
    

    
    public stock() {
        initComponents();
        tableDataLoader();
        
        setUndecorated(false);  //title bar
        
        //for windows to alwayes on top
        setAlwaysOnTop(true);
        setResizable(false); 
        setVisible(true);
        Toolkit a= Toolkit.getDefaultToolkit();
        
        //for easy understanding
        int x=(int) a.getScreenSize().getWidth();
        int y=(int) a.getScreenSize().getHeight();
        
        setSize(x, y);
        
        
    }

    
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stock_table = new javax.swing.JTable();
        u_btn = new javax.swing.JButton();
        d_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        search_txt = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stock");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back3.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        stock_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stock_table.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        stock_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Supplier", "Purchase rate", "Qty", "Date", "Bill amount"
            }
        ));
        stock_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        stock_table.setRowHeight(40);
        jScrollPane1.setViewportView(stock_table);

        u_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_btn.setText("Update");

        d_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        d_btn.setText("Delete");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        search_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        search_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Item Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                        .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(73, 73, 73)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(u_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(d_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(307, 307, 307))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new dashbord.dashbord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        if(!search_txt.getText().isEmpty()){
            int item_id = Integer.parseInt(search_txt.getText());

            try {
                
                ResultSet r = db.getdata("SELECT * FROM item WHERE item_id ='"+item_id+"'");

                if(!r.isFirst()){
                    tableDataClear();
                    TableDataLoader1();
                    
                }
                while(r.next()){
                    
                    d_btn.setEnabled(true);
                    u_btn.setEnabled(true);
                }
            } catch (Exception e) {
                System.out.println("Search button :"+e);
            }
        }else{
            
        }
    }//GEN-LAST:event_search_btnActionPerformed

    
    // stock Data load to Jtable
    private void tableDataLoader(){
        try {
            ResultSet result = db.getdata("SELECT * FROM stock");
            DefaultTableModel table = (DefaultTableModel) stock_table.getModel();
            
            int x  = 0;
            while(result.next()){
                Vector v = new Vector();
                v.add(null);
                table.addRow(v);
                
                String item = result.getString("item_name");
                String supplier = result.getString("supplier");
                String uprice = result.getString("unit_price");
                String qty = result.getString("qty");
                String date = result.getString("date");
                String bill = result.getString("bill");
                
                table.setValueAt(item, x, 0);
                table.setValueAt(supplier, x, 1);
                table.setValueAt(uprice, x, 2);
                table.setValueAt(qty, x, 3);
                table.setValueAt(date, x, 4);
                table.setValueAt(bill, x, 5);
                
                x++;
            }
            
        } catch (Exception e) {
            System.out.println("TableDataLoader :"+e);
        }
    }
    
    // stock jTable Data Clear
    private void tableDataClear(){
        try {
            while (0 < stock_table.getRowCount()) {                
                DefaultTableModel table = (DefaultTableModel) stock_table.getModel();
                table.removeRow(stock_table.getRowCount()-1);
            }
        } catch (Exception e) {
           System.out.println("TableDataClear :"+e); 
        } 
    }
    
    //table data load 1
    private void TableDataLoader1(){
        int item_item_id = Integer.parseInt(search_txt.getText());
        
        try {
            ResultSet result = db.getdata("SELECT * FROM stock WHERE item_item_id ='"+item_item_id+"'");
            DefaultTableModel table = (DefaultTableModel) stock_table.getModel();
            
            int x  = 0;
            while(result.next()){
                Vector v = new Vector();
                v.add(null);
                table.addRow(v);
                
                String item = result.getString("item_name");
                String supplier = result.getString("supplier");
                String uprice = result.getString("unit_price");
                String qty = result.getString("qty");
                String date = result.getString("date");
                String bill = result.getString("bill");
                
                table.setValueAt(item, x, 0);
                table.setValueAt(supplier, x, 1);
                table.setValueAt(uprice, x, 2);
                table.setValueAt(qty, x, 3);
                table.setValueAt(date, x, 4);
                table.setValueAt(bill, x, 5);
                
                x++;
            }
            
        } catch (Exception e) {
            System.out.println("TableDataLoader :"+e);
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
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTable stock_table;
    private javax.swing.JButton u_btn;
    // End of variables declaration//GEN-END:variables
}
