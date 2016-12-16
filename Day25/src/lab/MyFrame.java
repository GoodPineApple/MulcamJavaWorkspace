package lab;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GraphicObject {
	BufferedImage img = null;
	int x = 0, y = 0;

	public GraphicObject(String name) {
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void update() {
	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	public void KeyPressed(KeyEvent event) {
	}
}

///////////////////////////////////////////////////////////////////////
class Missile extends GraphicObject {
	boolean launched = false;

	public Missile(String name) {
		super(name);
		y = -200;
	}

	public void update() {
		if (launched) {
			y -= 20;
		}
		if (y < -100) {
			launched = false;
		}
	}

	public void KeyPressed(KeyEvent event, int x, int y) {
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {
			launched = true;
			this.x = x;
			this.y = y;
		}
	}

}

////////////////////////////////////////////////////////////////////////////
class Enermy extends GraphicObject {
	int dx = -10;
	boolean isAlive = true;

	public Enermy(String name) {
		super(name);
		x = 500;
		y = 0;
	}

	public void update() {
		if (isAlive) {
			x += dx;
			if (x < 0) {
				dx = +10;
			}
			if (x > 500) {
				dx = -10;
			}
		} else {
			x = -200;
			y = -200;
		}
	}

}

/////////////////////////////////////////////////////////////////////////
class SpaceShip extends GraphicObject {

	public SpaceShip(String name) {
		super(name);
		x = 150;
		y = 350;
	}

	public void KeyPressed(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}

}

////////////////////////////////////////////////////////////////////////////////
class Mypanel extends JPanel implements KeyListener {
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;

	public Mypanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enermy = new Enermy("enermy.png");
		spaceship = new SpaceShip("spaceship.png");
		missile = new Missile("missile.png");
		class MyThread extends Thread {
			public void run() {
				while (true) {
					enermy.update();
					spaceship.update();
					missile.update();
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if((enermy.x == missile.x) && (enermy.y == missile.y)) {
			enermy.isAlive = false;
			repaint();
		}
		
		MyThread t = new MyThread();
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		enermy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	};

	@Override
	public void keyPressed(KeyEvent event) {
		spaceship.KeyPressed(event);
		missile.KeyPressed(event, spaceship.x, spaceship.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

public class MyFrame extends JFrame {

	public MyFrame() {
		add(new Mypanel());
		setTitle("Bang");
		setSize(650, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
