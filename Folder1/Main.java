import javax.swing.*;
class CheckBox
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame("JCheckBox");
		JCheckBox cb1=new JCheckBox("CSE");
		cb1.setBounds(70,80,90,95);
		JCheckBox cb2=new JCheckBox("ECE");
		cb2.setBounds(40,50,60,55);
		f.add(cb1);
		f.add(cb2);
		f.setSize(200,200);
		f.setVisible(true);
	}
}
