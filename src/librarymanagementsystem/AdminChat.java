package librarymanagementsystem;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import static librarymanagementsystem.ClientChat.dis;
import static librarymanagementsystem.ClientChat.socket;

public class AdminChat extends javax.swing.JFrame {

    static Socket socket;
    static ServerSocket serversocket;
    static DataInputStream dis;
    static DataOutputStream dos;

    public AdminChat() {
        initComponents();
        this.setVisible(true);
         try{
            serversocket = new ServerSocket(1201);  
            socket=serversocket.accept();
            dis = new DataInputStream(socket.getInputStream());  
            dos = new DataOutputStream(socket.getOutputStream());  
            String msgin = "";  
            while (!msgin.equals("Exit")) {  
            msgin = dis.readUTF();  
            server_chat_area.setText(server_chat_area.getText().trim() + "\n Student:" + msgin);
            }
        }catch(Exception e)
        {
            System.out.println("Error in admin: "+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        server_text_msg = new javax.swing.JTextArea();
        server_send_msg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        server_chat_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        admin.setText("ADMIN");

        server_text_msg.setColumns(20);
        server_text_msg.setRows(5);
        jScrollPane1.setViewportView(server_text_msg);

        server_send_msg.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        server_send_msg.setText("SEND");
        server_send_msg.setActionCommand("Send");
        server_send_msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                server_send_msgActionPerformed(evt);
            }
        });

        server_chat_area.setColumns(20);
        server_chat_area.setRows(5);
        jScrollPane2.setViewportView(server_chat_area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(server_send_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(server_send_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void server_send_msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_server_send_msgActionPerformed

        try{
        String send_msg="";
        send_msg=server_text_msg.getText();
        dos.writeUTF(send_msg);
        server_text_msg.setText("");
        }catch(Exception e)
        {
            System.out.println("Error in sending message: "+e.getMessage());
        }
    }//GEN-LAST:event_server_send_msgActionPerformed

   
    public static void main(String args[]) {
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea server_chat_area;
    private javax.swing.JButton server_send_msg;
    private static javax.swing.JTextArea server_text_msg;
    // End of variables declaration//GEN-END:variables
}
