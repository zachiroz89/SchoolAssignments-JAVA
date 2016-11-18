import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPhotoFrame extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel label1 = new JLabel("Welcome to Paula's Portraits Price Quote!");
	JLabel label2 = new JLabel("Please select your subjects: ");
	JLabel label3 = new JLabel("Please select your location: ");
	JLabel label4 = new JLabel("Your total is:$ ");
	JLabel label5 = new JLabel("");
	
	JCheckBox oneSubject = new JCheckBox("One person", false);
	JCheckBox twoMoreSubjects = new JCheckBox("2 or More!", false);
	JCheckBox petSubject = new JCheckBox("With a pet!", false);
	JCheckBox inStudio = new JCheckBox("In Studio!", false);
	JCheckBox onLocation = new JCheckBox("On Location!", false);
	
	int total = 0;
	
	public JPhotoFrame() {
				super("JDorm");
				setSize(275, 400);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLayout(flow);
				oneSubject.addItemListener(this);
				twoMoreSubjects.addItemListener(this);
				petSubject.addItemListener(this);
				inStudio.addItemListener(this);
				onLocation.addItemListener(this);
				
				add(label1);
				add(label2);
				add(oneSubject);
				add(twoMoreSubjects);
				add(petSubject);
				add(label3);
				add(inStudio);
				add(onLocation);
				add(label4);
				add(label5);
				
				
					
	}
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		JCheckBox box = (JCheckBox) source;
		
			if(source==oneSubject){
				if(oneSubject.isSelected()){
					total+=40;
				}
				else{
					total-=40;
				}
			}else if(source==twoMoreSubjects){
				if(twoMoreSubjects.isSelected()){
					total+=75;				
				}
				else{
					total-=75;				
				}
				
			}else if(source==petSubject){
			if(petSubject.isSelected()){
					total+=95;						
			}
			else{
					total-=95;				
			}
			}else if(source== onLocation){
			if(onLocation.isSelected()){
					total+=90;						
			}
			else{
					total-=90;					
			}	
			}else if(source==inStudio){
			
			if(inStudio.isSelected()){
					total+=0;					
			}
			else{
				total-=0;					
			}	
			
		}
		label5.setText(""+total);
	}
}