package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener{
    private int x=-1;
    private int y=-1;

    public Panel() {
        addMouseListener(this);
    }
    
    public void mouseExited(MouseEvent e){
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mouseEntered(MouseEvent e){
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mousePressed(MouseEvent e){
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mouseReleased(MouseEvent e){
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }

    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, e.getPoint().toString());
    }
}
