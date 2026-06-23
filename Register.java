package evening_batch;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register implements ActionListener
{
	JFrame f;
	JPasswordField t1;
	JTextField t,t2,t3;
	JButton b;
	void fun()
	{
		f=new JFrame("Register page");
		f.setSize(1600, 900);
//		f.getContentPane().setBackground(Color.decode("#008080"));
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\nasa-V4ZksNimxLk-unsplash.jpg")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Register Page");
		l.setBounds(200, 20, 400, 100);
		l.setFont(new Font("MV Boli",Font.ITALIC,50));
		l.setForeground(Color.WHITE);
		f.add(l);
		
		JLabel l1=new JLabel("User Name");
		l1.setBounds(60, 120, 400, 100);
		l1.setFont(new Font("MV Boli",Font.ITALIC,50));
		l1.setForeground(Color.WHITE);
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(400, 140, 400, 50);
		t.setFont(new Font("MV Boli",Font.ITALIC,50));
		f.add(t);
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(60, 220, 400, 100);
		l2.setFont(new Font("MV Boli",Font.ITALIC,50));
		l2.setForeground(Color.WHITE);
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(400, 240, 400, 50);
		t1.setFont(new Font("MV Boli",Font.ITALIC,50));
		f.add(t1);
		
		JLabel l3=new JLabel("Gmail");
		l3.setBounds(60, 320, 400, 100);
		l3.setFont(new Font("MV Boli",Font.ITALIC,50));
		l3.setForeground(Color.WHITE);
		f.add(l3);
		
		t2=new JTextField();
		t2.setBounds(400, 340, 400, 50);
		t2.setFont(new Font("MV Boli",Font.ITALIC,50));
		f.add(t2);
		
		JLabel l4=new JLabel("Phone");
		l4.setBounds(60, 420, 400, 100);
		l4.setFont(new Font("MV Boli",Font.ITALIC,50));
		l4.setForeground(Color.WHITE);
		f.add(l4);
		
		t3=new JTextField();
		t3.setBounds(400, 440, 400, 50);
		t3.setFont(new Font("MV Boli",Font.ITALIC,50));
		f.add(t3);
		
		b=new JButton("Register");
		b.setBounds(300, 540, 300, 80);
		b.setFont(new Font("MV Boli",Font.ITALIC,50));
		f.add(b);
		b.addActionListener(this);
		
	}
	public static void main(String[] args)
	{
		Register r=new Register();
		r.fun();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b)
		{
			String s=t.getText();
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			if(s.isEmpty() || s1.isEmpty() || s2.isEmpty()|| s3.isEmpty())
			{
				JOptionPane.showMessageDialog(b,"fill all field...");
			}
			else
			{
				String url="jdbc:mysql://localhost/hello";
				String user="root";
				String  pass="kokilajana";
				try {
					Connection con=DriverManager.getConnection(url, user, pass);
					String sql="insert into info values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,s);
					ps.setString(2,s1);
					ps.setString(3,s2);
					ps.setString(4,s3);
					ps.execute();
					JOptionPane.showMessageDialog(b,"Register success");
					LoginPage l=new LoginPage();
					l.demo();
					f.setVisible(false);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
	}

}
