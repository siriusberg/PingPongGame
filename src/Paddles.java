import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Paddles extends Rectangle{
	
	int id;
	int yVelocity;
	int yMove = 20;
	
	Paddles(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id){
		case 1: 
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDir(-yMove);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDir(yMove);
				move();
			}
			break;
		case 2: 
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDir(-yMove);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDir(yMove);
				move();
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id){
		case 1: 
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDir(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDir(0);
				move();
			}
			break;
		case 2: 
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDir(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDir(0);
				move();
			}
			break;
		}
	}
	
	public void setYDir(int yDir) {
		yVelocity = yDir;
	}
	public void move() {
		y += yVelocity;
	}
	
	public void draw(Graphics g) {
		if(id==1) {
			g.setColor(Color.GREEN);
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.fillRect(x, y, width, height);
	}
}
