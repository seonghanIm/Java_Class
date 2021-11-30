package mes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA {
	protected JTextField textField;
	protected JTextArea textArea;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myport = 5000;
	final int otherPort = 6000;
	static String id = "[임성한]";
	int i = 1;
	DB db;
	//SwingLogin l;

	public MessengerA() throws IOException {
		//l = new SwingLogin();
		MyFrame3 frame = new MyFrame3();
		address = InetAddress.getLocalHost();
		socket = new DatagramSocket(myport);
	}

	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				textArea.append("RECIEVED: " + new String(buf) + "\n");
			} catch (IOException e) {

			}
		}
	}

	

	class MyFrame3 extends JFrame implements ActionListener {
		public MyFrame3() {
			super("MessengerA");
			new Login(this);

			

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			textField = new JTextField(30);
			textField.addActionListener(this);

			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);

			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			pack();
			
		}

		public void actionPerformed(ActionEvent evt) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
			db= new DB();
		    db.saveLog(s);
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet);

			} catch (IOException e) {
				e.printStackTrace();
			}
			textArea.append("SENT from " + id + ":" + s + "\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());

		}
	}
	

	public static void main(String[] args) throws IOException{
		MessengerA m = new MessengerA();
		m.process();

	}

}
		
