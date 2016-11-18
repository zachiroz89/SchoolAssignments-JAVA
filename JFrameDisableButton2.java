import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JFrameDisableButton2 extends JFrame implements ActionListener
{
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 300;
	int x=0;
	
	JLabel heading = new JLabel("Disable on Click");
	JButton button = new JButton("Disable");
	JLabel label = new JLabel("THAT'S ENOUGH OF THAT!");
	
	public JFrameDisableButton2()
	{
		super("Disable Button");
		setSize(FRAME_HEIGHT, FRAME_WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add (heading);
		add (button);
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		x++;
		if(x>=8){
		button.setEnabled(false);
		setLayout(new FlowLayout());
		add (label);
		setVisible(true);
		}
		
	}
}