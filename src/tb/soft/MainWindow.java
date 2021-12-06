package tb.soft;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * klasa główna zawierająca metodę statyczną main
 */
public class MainWindow extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
    public MainWindow() throws HeadlessException {
        this("undefined");
    }
    public MainWindow(String title) throws HeadlessException {
        super(title);
        buildFrame();
    }
    protected void buildFrame() {


        setBounds(100, 100, 750, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program ma się zakończyć po zamknięciu tego okna
        JPanel jPanel = new JPanel(null);
        setContentPane(jPanel);

        jPanel.setBackground(Color.GRAY);

        JButton runButton = new JButton("Run");
        JButton cancelButton = new JButton("Cancel");
        jPanel.add(runButton);
        jPanel.add(cancelButton);
        runButton.setBounds(150, 200, 100, 40);
        cancelButton.setBounds(250, 200, 100, 40);
        runButton.addMouseListener(new MouseListener() {
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
                Random rand = new Random();
                runButton.setBounds(rand.nextInt(750), rand.nextInt(700), 100, 40);

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        cancelButton.addMouseListener(new MouseListener() {
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
                Random rand = new Random();
                cancelButton.setBounds(rand.nextInt(750), rand.nextInt(700), 100, 40);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }
}
