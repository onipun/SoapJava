package org.example.www.Lecture;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.FloatHolder;
import javax.xml.rpc.holders.StringHolder;
import javax.xml.ws.Holder;

import org.apache.axis.AxisFault;
import org.apache.axis.holders.DateHolder;

import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 622, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFetch = new JButton("search");
		btnFetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread thread1 = new Thread() {
					public void run() {
						String itemCount = null;

						String strLogin;
						StringHolder strFirstName = new StringHolder();
						StringHolder strLastName = new StringHolder();
						StringHolder strUserLvl = new StringHolder();
						StringHolder strLastLogin = new StringHolder();
						
						try {
							Lecture_ServiceLocator obj = new Lecture_ServiceLocator();
							itemCount = obj.getLectureSOAP().fnGetHelloClass(" saya");
							obj.getLectureSOAP().fnGetStudQuery(textField.getText(), strFirstName, strLastName, strUserLvl, strLastLogin);
							
						} catch (ServiceException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
//						System.out.println(itemCount);
//						System.out.println(strFirstName.value);
						textField_1.setText(strFirstName.value);
						textField_2.setText(strLastName.value);
						textField_3.setText(strUserLvl.value);
						textField_4.setText(strLastLogin.value);
					
					}
				};
				
				thread1.start();
			}
		});
		btnFetch.setBounds(247, 39, 97, 25);
		frame.getContentPane().add(btnFetch);
		
		textField = new JTextField();
		textField.setBounds(82, 40, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(12, 43, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(12, 234, 97, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(12, 316, 97, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 231, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 313, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("user Level");
		lblNewLabel_3.setBounds(288, 234, 120, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Last Login");
		lblNewLabel_4.setBounds(292, 316, 116, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(420, 231, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(436, 313, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
