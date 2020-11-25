package javagui.frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		// this hides by default		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// this cannot be resized
		this.setResizable(false);
		
		// set title of this		
		this.setTitle("Swing GUI Tutorial");
		
		// set x, y dimensions of this
		this.setSize(420, 420);
		
		// show this
		this.setVisible(true);
		
		// create image icon
		ImageIcon image = new ImageIcon("rndmlogo.jpg");
	
		// change icon of this from original to new
		this.setIconImage(image.getImage());
		
		// change background colour
		this.getContentPane().setBackground(Color.green);
	}

}
