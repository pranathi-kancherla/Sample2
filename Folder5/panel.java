import javax.swing.*;
import java.awt.Color;
class Panel
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame("Panel Example");

		JPanel jp1=new JPanel();
		jp1.setBounds(30,30,70,70);
		jp1.setBackground(Color.YELLOW);
		JTextArea jt=new JTextArea("PRANATHI");
		jt.setBounds(60,60,70,70);

		JPanel jp2=new JPanel();
		jp2.setBounds(60,60,75,75);
		jp2.setBackground(Color.ORANGE);
		JTextArea jt1=new JTextArea("CSE");
		jt1.setBounds(60,60,70,70);
		
		JPanel jp3=new JPanel();
		jp3.setBounds(90,90,150,150);
		jp3.setBackground(Color.BLUE);
		JTextArea jt2=new JTextArea("SEC:2A");
		jt2.setBounds(90,90,70,70);

		jp1.add(jt);
		f.add(jp1);
		jp2.add(jt1);
		f.add(jp2);
		jp3.add(jt2);
		f.add(jp3);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
