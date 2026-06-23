package evening_batch;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class Next implements ActionListener
{
	JButton b;
	JFrame f;
	Next()
	{
		 f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.getContentPane().setBackground(Color.decode("#008080"));
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\daniil-k-ruxEiWC059U-unsplash.jpg")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Welcome to My Page...");
		l.setBounds(200, 20, 700, 100);
		l.setFont(new Font("MV Boli",Font.ITALIC,50));
		l.setForeground(Color.WHITE);
		f.add(l);
		
		JRadioButton rb= new JRadioButton("Male");
		rb.setBounds(100, 120, 150, 50);
		rb.setFont(new Font("MV Boli",Font.ITALIC,30));
		f.add(rb);
		
		JRadioButton rb1= new JRadioButton("Female");
		rb1.setBounds(300, 120, 150, 50);
		rb1.setFont(new Font("MV Boli",Font.ITALIC,30));
		f.add(rb1);
		
		ButtonGroup bb=new ButtonGroup();
		bb.add(rb);
		bb.add(rb1);
		
		String a[]= {"CSE","EEE","ECE","B.Tech","BE(Mech)"};
		
		JList ll=new JList(a);
		ll.setBounds(100, 220, 150, 250);
		ll.setSelectedIndex(2);
		ll.setFont(new Font("MV Boli",Font.ITALIC,30));
		f.add(ll);
		
		String b1[]= {"Select","Java","Python","Selenium","Webdesigning","Fullstack"};
		JComboBox cb=new JComboBox(b1);
		cb.setBounds(300, 220, 200, 50);
		cb.setFont(new Font("MV Boli",Font.ITALIC,30));
		f.add(cb);
		
		JCheckBox cc=new JCheckBox("Accept terms and Conditions");
		cc.setBounds(300, 520, 500, 50);
		cc.setFont(new Font("MV Boli",Font.ITALIC,30));
		f.add(cc);
		
		b=new JButton("logout");
		b.setBounds(600, 340, 200, 80);
		b.setFont(new Font("MV Boli",Font.ITALIC,50));
		b.setForeground(Color.black);
		f.add(b);
		b.addActionListener(this);
	}

	public static void main(String[] args)
	{
	new Next();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			LoginPage l=new LoginPage();
			l.demo();
			f.setVisible(false);
		}
	}

}
