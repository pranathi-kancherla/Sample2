import javax.swing.*;
class Radiobutton
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame("Sample");
		JRadioButton rb=new JRadioButton("Male");
		f.setBounds(30,40,50,60);
		JRadioButton rb1=new JRadioButton("Female");
		f.setBounds(60,70,80,90);
		f.add(rb);
		f.add(rb1);
		f.setSize(150,150);
		f.setVisible(true);
	}
}
