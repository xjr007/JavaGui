package javagui;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		
		// create frame
		JFrame frame = new JFrame();
		
		// frame hides by default		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame cannot be resized
		frame.setResizable(false);
		
		// set title of frame		
		frame.setTitle("Swing GUI Tutorial");
		
		// set x, y dimensions of frame
		frame.setSize(420, 420);
		
		// show frame
		frame.setVisible(true);
		
		// create image icon
		ImageIcon image = new ImageIcon("rndmlogo.jpg");
	
		// change icon of frame from original to new
		frame.setIconImage(image.getImage());
		
		// change background colour
		frame.getContentPane().setBackground(Color.green);
		
		// using hex, etc.
//		frame.getContentPane().setBackground(new Color(123, 70, 255));
		
		// using hexadec.
//		frame.getContentPane().setBackground(new Color(0xFFFFF));
	}

}
