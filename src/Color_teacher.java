import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Color_teacher implements java.awt.event.ActionListener {


JFrame frame = new JFrame();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();   
JButton button4 = new JButton();   
JPanel pannel = new JPanel();

public void initiate() {
	frame.setVisible(true);
	frame.add(button1);
	frame.add(button2);
	
	
	frame.setTitle("color Teacher");
	frame.add(pannel);
	pannel.add(button1);
	pannel.add(button2);
	pannel.add(button3);
	pannel.add(button4);
	button1.setSize(100, 20);	
	button2.setSize(100, 20);
	button3.setSize(100,20);
	button4.setSize(100, 20);
	button1.setBackground(Color.yellow);
	button1.setOpaque(true);
	button2.setBackground(Color.red);
	button2.setOpaque(true);
	button3.setBackground(Color.blue);
	button3.setOpaque(true);
	button4.setBackground(Color.green);
	button4.setOpaque(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	
	frame.pack();
}









public static void main(String[] args) {
Color_teacher c = new Color_teacher();
c.initiate();

}	

void speak (String words){
	try{
		Runtime.getRuntime().exec("say "+words);
	}  catch (IOException e){
		e.printStackTrace();
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("press");
	if (e.getSource() == button1){
		speak("yellow");
	}
	if (e.getSource() == button2){
		speak("red");
}
	if (e.getSource() == button3){
		speak("blue");
	}
		
	if (e.getSource() == button4){
		speak("green");










}











}}

