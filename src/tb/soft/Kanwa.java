package tb.soft;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Kanwa extends JPanel implements MouseInputListener, KeyListener {
    public static int i;
    public int x;
    public int y;
    public Kanwa(){

        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(i==2) {
            g.setColor(Color.RED);
            g.drawOval(20, 20, 20, 20);
            g.fillOval(20, 20, 20, 20);
        }
        if(i==1){
            g.setColor(Color.MAGENTA);
            g.drawRect(20, 20, 20, 20);
            g.fillRect(20, 20, 20, 20);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x=e.getX();
        y=e.getY();
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='k'){
            i=1;
        }
        else if(e.getKeyChar()=='o'){
            i=2;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
