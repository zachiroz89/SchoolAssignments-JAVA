import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JDisappearingFriends extends JFrame implements ActionListener
{
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 300;
	int x=0;
	
	JLabel heading = new JLabel("Click to see my Friends");
	JButton button = new JButton("Friends");
	JLabel label1 = new JLabel("Brandon");
	JLabel label2 = new JLabel("Weston");
	JLabel label3 = new JLabel("Tyler");
	JLabel label4 = new JLabel("Jeff");
	JLabel label5 = new JLabel("Richard");
	
	public JDisappearingFriends()
	{
		super("Disappearing Friends");
		setSize(FRAME_HEIGHT, FRAME_WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add (heading);
		add (button);
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		++x;
		switch (x) {
			case 1:
				setLayout(new FlowLayout());
				add (label1);
				setVisible(true);
				break;
			case 2:
				setLayout(new FlowLayout());
				label1.setVisible(false);
				add (label2);
				setVisible(true);
				break;
			case 3:
				setLayout(new FlowLayout());
				label2.setVisible(false);
				add (label3);
				setVisible(true);
				break;
			case 4:
				setLayout(new FlowLayout());
				label3.setVisible(false);
				add (label4);
				setVisible(true);
			break;
			case 5:
				setLayout(new FlowLayout());
				label4.setVisible(false);
				add (label5);
				setVisible(true);
			break;
			default:
				break;
		}
		
	}
}