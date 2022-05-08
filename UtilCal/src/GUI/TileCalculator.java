package GUI;

import TileType.oneByOne;
import TileType.twoByTwo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TileCalculator implements ActionListener {

    //closes the program after click
    private static JButton one;
    private static JButton two;
    private static JButton four;
    private static JFrame frame;


    public static void Tile() {

        //creates the gui it self
        JPanel panel = new JPanel();
        panel.setLayout(null);

        frame = new JFrame();
        frame.setSize(450,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(555,318);
        frame.add(panel);

        //////////////////////////////////////////////////////////

        //creates the title
        JLabel title = new JLabel("Tile Menu");
        title.setBounds(20,20,100,25);
        panel.add(title);

        //////////////////////////////////////////////////////////

        //creates the tile button which will lead to a new gui
        one = new JButton("1' x 1' Tile");
        one.setBounds(10,50 ,100, 25);
        one.addActionListener(new TileCalculator());
        panel.add(one);

        two = new JButton("2' x 2' Tile");
        two.setBounds(10,80, 100, 25);
        two.addActionListener(new TileCalculator());
        panel.add(two);

            frame.setVisible(true);
    }

     @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == one){
            oneByOne.oneBy();
            }
            if(e.getSource() == two) {
            twoByTwo.twoBy();
            }
        }
    }

