package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {
    private int x=-1;
    private int y=-1;
    private int x1=-1;
    private int y1=-1;
    private int x2=-1;
    private int y2=-1;
    private Boolean rys = false;

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
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
        rys = true;
    }

    public void mouseReleased(MouseEvent e) {
        rys = false;

    }
    
    public void mouseMoved(MouseEvent e) {

    }
    
    public void mouseDragged(MouseEvent e) {
        x2=e.getX();
        y2=e.getY();
        repaint();
        
        
    }

    public void mouseClicked(MouseEvent e) {

    }
    
    public void paint(Graphics g) {
        if (rys) g.clearRect(0, 0, getSize().width, getSize().height);
        g.setColor(Color.RED);
        
        
        g.drawLine(x1, y1, x2, y2);
    }

}
