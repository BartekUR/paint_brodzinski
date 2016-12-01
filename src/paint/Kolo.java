package paint;

import java.awt.Graphics;

public class Kolo implements Figura {
    int x, y;
    public Kolo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void paint(Graphics g) {
        g.drawOval(x, y, 50, 50);
    }
}
