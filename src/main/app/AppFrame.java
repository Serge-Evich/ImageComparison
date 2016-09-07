package main.app;


import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Димон on 06.09.2016.
 */
public class AppFrame extends JFrame implements ActionListener {

    private JFileChooser jFileChooser = new JFileChooser();

    private JButton jButtonOne = new JButton("Choose first image");
    private JButton jButtonTwo = new JButton("Choose second image");

    private File imageFileOne = null;
    private File imageFileTwo = null;

    private JPanel chooserPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JPanel imageOnePanel = new JPanel();
    private JPanel imageTwoPanel = new JPanel();

    public AppFrame() {

        chooserPanel.add(jFileChooser);
        buttonPanel.add(jButtonOne);
        buttonPanel.add(jButtonTwo);

        setLayout(new GridLayout(4, 4));
        //setSize(800, 800);
        setVisible(true);
        add(chooserPanel);
        add(buttonPanel);
        add(imageOnePanel);
        add(imageTwoPanel);
        setTitle("Image Comparison");

        jButtonOne.addActionListener(this);
        jButtonTwo.addActionListener(this);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonOne) {
            jFileChooser.showOpenDialog(this);
            imageFileOne = jFileChooser.getSelectedFile();
        } else if (e.getSource() == jButtonTwo) {
            jFileChooser.showOpenDialog(this);
            imageFileTwo = jFileChooser.getSelectedFile();
        }
    }
}
