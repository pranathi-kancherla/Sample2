import java.applet.*;
import java.awt.event.*;
public class Mouse extends Applet implements MouseListener,MouseMotionListener()
{	
	public void init()
	{
		setBackground(color.violet);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	String text="Mouse Events";
	public void paint(Graphics g)
	{
		g.drawString(text,400,500);
	}
}
public void mouseClicked(MouseEvent me)
{
	setBackground(color.red);
	setStatus("Mouse Clicked");
	repaint();
}
public void mousePressed(MouseEvent me)
{
	setBackground(color.green);
	setStatus("Mouse Pressed");
	repaint();
}
public void mouseReleased(MouseEvent me)
{
	setBackground(color.pink);
	setStatus("Mouse Released");
	repaint();
}
public void mouseEntered(MouseEvent me)
{
	setBackground(color.orange);
	setStatus("Mouse Entered");
	repaint();
}
public void mouseExcited(MouseEvent me)
{
	setBackground(color.Blue);
	setStatus("Mouse Excited");
	repaint();
}
public void mouseMoved(MouseEvent me)
{
	setBackground(color.yellow);
	setStatus("Mouse Moved");
	repaint();
}
public void mouseDragged(MouseEvent me)
{
	setBackground(color.black);
	setStatus("Mouse Dragged");
	repaint();
}
	
