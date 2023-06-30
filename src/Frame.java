import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame extends JFrame{
	
	Panel panel;
	
	Frame(){
		panel = new Panel();
		this.add(panel);
		this.setTitle("Ping Pong");
		this.setResizable(false);
		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
