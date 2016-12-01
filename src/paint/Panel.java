package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener, MouseMotionListener {
    private int x=-1;
    private int y=-1;

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
//        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mouseReleased(MouseEvent e) {
//        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }
    
    public void mouseMoved(MouseEvent e) {
         x=e.getX();
         y=e.getY();
         repaint(); 
         
    }
    
    public void mouseDragged(MouseEvent e) {
        
    }

    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }
    
    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        g.setColor(Color.RED);
        if(x!=-1 && y!=-1)
        g.drawOval(x-25, y-25, 50, 50);
    }

}
