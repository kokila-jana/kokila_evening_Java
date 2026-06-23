package evening_batch;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class LoginPage implements ActionListener 
{
	JButton b,b1;
	JTextField t;
	JPasswordField t1;
	JFrame f;
	void demo()
	{
		 f=new JFrame("Login page");
		f.setSize(1600, 900);
//		f.getContentPane().setBackground(Color.decode("#008080"));
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\h2.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Page");
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
		t.setForeground(Color.WHITE);
		t.setBackground(Color.decode("#87CEEB"));
		f.add(t);
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(60, 220, 400, 100);
		l2.setFont(new Font("MV Boli",Font.ITALIC,50));
		l2.setForeground(Color.WHITE);
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(400, 240, 400, 50);
		t1.setFont(new Font("MV Boli",Font.ITALIC,50));
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.decode("#87CEEB"));
		f.add(t1);
		
		b=new JButton("Login");
		b.setBounds(100, 340, 200, 80);
		b.setFont(new Font("MV Boli",Font.ITALIC,50));
		b.setForeground(Color.black);
		f.add(b);
		b.addActionListener(this);
		
		b1=new JButton("Register");
		b1.setBounds(400, 340, 300, 80);
		b1.setFont(new Font("MV Boli",Font.ITALIC,50));
		b1.setForeground(Color.black);
		f.add(b1);
		b1.addActionListener(this);
	}
	public static void main(String[] args)
	{
	
		LoginPage l=new LoginPage();
		l.demo();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			String s=t.getText();
			String s1=t1.getText();
			if(s.isEmpty() || s1.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "fill all field");
			}
			else
			{
				String url="jdbc:mysql://localhost/hello";
				String user="root";
				String  pass="kokilajana";
				try {
					Connection con=DriverManager.getConnection(url, user, pass);
					String sql="select * from info where name=? and pass=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, s);
					ps.setString(2, s1);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(b,"Login success");
						new Next();
						f.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(b,"invalid user name or password");
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		else if(e.getSource()==b1)
		{
			Register r=new Register();
			r.fun();
			f.setVisible(false);
		}
	}

}
