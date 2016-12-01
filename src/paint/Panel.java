package paint;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {
    ArrayList<Figura> lista;
    int x, y, x1, y1;
    boolean linia = false;
    Linia temp_linia;
    private Boolean rys = false;

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
        lista = new ArrayList<Figura>();
    }
    
    public void mouseExited(MouseEvent e) {
//        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mouseEntered(MouseEvent e) {
//        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mousePressed(MouseEvent e) {
        x1=e.getX();
        y1=e.getY();
        linia = true;
    }

    public void mouseReleased(MouseEvent e) {
        linia=false;
        temp_linia = null;
        repaint();

    }
    
    public void mouseMoved(MouseEvent e) {

    }
    
    public void mouseDragged(MouseEvent e) {
        if (linia == true) {
            lista.remove(temp_linia);
            temp_linia = new Linia(x1, y1, e.getX(), e.getY());
            lista.add(temp_linia);
        }
        
    }

    public void mouseClicked(MouseEvent e) {
        lista.add(new Kolo(e.getX(), e.getY()));
        repaint();
    }
    
    public void paint(Graphics g) {
        for (Figura figura: lista)
            figura.paint(g);
    }

}
