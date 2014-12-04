import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Point2D.Float;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class Ventana extends JFrame implements ActionListener, MouseListener {
	public static Jardin J;
	
    public Ventana() {
    	
      super ("Prueba de Ventana");
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      this.setSize(800, 800);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);
      Color bkg = new Color(149, 104, 79);
      c.setBackground(bkg);
      addMouseListener(this);
    }
    
    public static void main (String [] args) {
      Ventana V = new Ventana();
      
      // Creación del Jardin
      J = new Jardin();
      J.setNumDeArboles(0);
      J.setNumDeBancas(0);
      J.setNumDeCaminos(0);
      J.setNumDeFlores(0);
    }
    
    @Override
    public void paint (Graphics g) {
    	// Draw grid
    	for(int i=0; i<=800; i+=100) {
    		Line2D ejeX = new Line2D.Float(new Point2D.Float(0, i), new Point2D.Float(800, i));
    		Line2D ejeY = new Line2D.Float(new Point2D.Float(i, 0), new Point2D.Float(i, 800));
    		Graphics2D g3 = (Graphics2D)g;
    		g3.setColor(Color.white);
    		
            g3.draw(ejeX);
            g3.draw(ejeY);
    	}
    }
    
    public void putImage(Graphics g, int x, int y) {
    	Image arbol = new ImageIcon("files/arbol.png").getImage();
    	Image banco = new ImageIcon("files/banco.png").getImage();
    	Image camino = new ImageIcon("files/camino.png").getImage();
    	Image flor = new ImageIcon("files/flor.png").getImage();
    	Image bug = new ImageIcon("files/bug.png").getImage();
    	Image water = new ImageIcon("files/water.jpg").getImage();
    	
    	Image V [] = {arbol, banco, camino, flor, bug, water};
    	Random r = new Random();
    	Graphics2D g3 = (Graphics2D)g;
    	
    	int posX=0, posY=0;
    	for(int i=2; i<=800; i+=100) {
    		if (x < i)
    			break;
    		else
    			posX = i;
    	}
    	for(int i=2; i<=800; i+=100) {
    		if (y < i)
    			break;
    		else
    			posY = i;
    	}
    	
    	int rand = r.nextInt(6);
    	
    	// Crea el objeto aleatoriamente.
    	switch(rand) {
    	case 0:
    		Arbol A = new Arbol();
    		J.addArbol(A);
    		System.out.println("Arbol Creado!");
    		break;
    	case 1:
    		System.out.println("Banca Creada!");
    		Banca B = new Banca();
    		J.addBanca(B);
    		break;
    	case 2:
    		System.out.println("Camino Creado!");
    		Camino C = new Camino();
    		J.addCamino(C);
    		break;
    	case 3:
    		System.out.println("Flor Creada!");
    		Flor F = new Flor();
    		J.addFlor(F);
    		break;
    	case 4:
    		System.out.println("Insecto Creado!");
    		Insecto I = new Insecto();
    		J.addInsecto(I);
    		break;
    	case 5:
    		System.out.println("Agua Creada!");
    		Agua Ag = new Agua();
    		J.addAgua(Ag);
    		break;
    	}
    	
    	g3.drawImage(V[rand], posX, posY, 97, 97, null);	
    }
    
    public void paintCircle (Graphics g, int x, int y) {
    	int radio = 30;
        g.drawOval(x-radio/2, y-radio/2, radio, radio);
        g.setColor(Color.BLACK);
        g.fillOval(x-radio/2, y-radio/2, radio, radio);
    }
    
    public void mouseClicked(MouseEvent e) {

    }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//        System.out.println("x = " + e.getX());
//        System.out.println("x = " + e.getY());

        Graphics g = this.getGraphics();
//        paintCircle(g, e.getX(), e.getY());
        putImage(g, e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}