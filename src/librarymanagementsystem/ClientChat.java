package librarymanagementsystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import static librarymanagementsystem.AdminChat.dos;
import static librarymanagementsystem.AdminChat.serversocket;
import static librarymanagementsystem.AdminChat.socket;

public class ClientChat extends javax.swing.JFrame {

    static Socket socket;
    static DataInputStream dis;
    static DataOutputStream dos;

    public ClientChat() {
        initComponents();
        this.setVisible(true);
        try{
            socket = new Socket("127.0.0.1", 1201);  
            dis = new DataInputStream(socket.getInputStream());  
            dos = new DataOutputStream(socket.getOutputStream());  
            String msgin = "";  
            while (!msgin.equals("Exit")) {  
            msgin = dis.readUTF();  
            client_chat_area.setText(client_chat_area.getText().trim() + "\n Admin:" + msgin);
            }
        }catch(Exception e)
        {
            System.out.println("Error in admin: "+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        student = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_text_msg = new javax.swing.JTextArea();
        client_send_msg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        client_chat_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        student.setBackground(new java.awt.Color(255, 255, 255));
        student.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        student.setText("STUDENT");

        client_text_msg.setColumns(20);
        client_text_msg.setRows(5);
        jScrollPane1.setViewportView(client_text_msg);

        client_send_msg.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        client_send_msg.setText("SEND");
        client_send_msg.setActionCommand("Send");
        client_send_msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_send_msgActionPerformed(evt);
            }
        });

        client_chat_area.setColumns(20);
        client_chat_area.setRows(5);
        jScrollPane2.setViewportView(client_chat_area);

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
                        .addComponent(client_send_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(client_send_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void client_send_msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_send_msgActionPerformed
        try {
        String send_msg="";
        send_msg=client_text_msg.getText();
        dos.writeUTF(send_msg);
        client_text_msg.setText("");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    }//GEN-LAST:event_client_send_msgActionPerformed

  
    public static void main(String args[]) {
        
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea client_chat_area;
    private javax.swing.JButton client_send_msg;
    private static javax.swing.JTextArea client_text_msg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel student;
    // End of variables declaration//GEN-END:variables
}
