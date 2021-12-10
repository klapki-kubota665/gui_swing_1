package tb.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;
import tb.soft.Kanwa;
/**
 * klasa główna zawierająca metodę statyczną main
 */
public class MainWindow extends JFrame {
    //public Graphics g;
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


        setBounds(0, 0, 700, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program ma się zakończyć po zamknięciu tego okna
        JPanel jPanel = new JPanel(null);
        jPanel.setBounds(0,0,700,750);
        jPanel.setLayout(null);
        setContentPane(jPanel);
        jPanel.setBackground(Color.GRAY);

        Kanwa canvas = new Kanwa();
        canvas.setBounds(100, 100 , 700, 200);
        canvas.setBackground(Color.GREEN);
        jPanel.add(canvas);
        canvas.setLayout(null);

        JButton runButton = new JButton("Run");
        JButton cancelButton = new JButton("Cancel");
        jPanel.add(runButton);
        jPanel.add(cancelButton);
        runButton.setBounds(10, 400, 100, 40);
        cancelButton.setBounds(110, 400, 100, 40);



        runButton.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                if(e.getX()<80) {
                    Random rand = new Random();
                    runButton.setBounds(rand.nextInt(750), rand.nextInt(700), 100, 40);
                }

            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                canvas.i=0;
                runButton.setBounds(10, 400, 100, 40);
                canvas.repaint();
                canvas.requestFocusInWindow();
            }
        });


    }
}
