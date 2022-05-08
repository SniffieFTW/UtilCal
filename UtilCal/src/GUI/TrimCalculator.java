package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrimCalculator implements ActionListener {
    //fields to create the labels for the walls in gui
    private static JLabel wall1;
    private static JLabel wall2;
    private static JLabel wall3;
    private static JLabel wall4;

    //////////////////////////////////////////////////////////

    //creates the labels next to the text field
    private static JLabel W1L;
    private static JLabel W2W;
    private static JLabel W3L;
    private static JLabel W4W;

    //////////////////////////////////////////////////////////

    //creates the text field so people can type there wall lenght
    private static JTextField length1;
    private static JTextField wight1;
    private static JTextField length2;
    private static JTextField wight2;

    //////////////////////////////////////////////////////////

    //total field and total button
    private static JLabel total;
    private static JButton total1;

    public static void Trim() {

        //creates the gui it self
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(450,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(555,318);
        frame.add(panel);

        //////////////////////////////////////////////////////////

        //sets the title
        JLabel title = new JLabel();
        title.setBounds(10, 20, 300, 25);
        title.setText("Trim Calculator");
        panel.add(title);

        //////////////////////////////////////////////////////////

        //sets the wall title's
        wall1 = new JLabel("Wall 1");
        wall1.setBounds(10,70,80,25);
        panel.add(wall1);

        wall2 = new JLabel("Wall 2 ");
        wall2.setBounds(10,120,80,25);
        panel.add(wall2);

        wall3 = new JLabel("Wall 3");
        wall3.setBounds(10, 175,80,25);
        panel.add(wall3);

        wall4 = new JLabel("Wall 4 ");
        wall4.setBounds(10,225,80,25);
        panel.add(wall4);

        //////////////////////////////////////////////////////////

        //create the fields for the names of length and wight for the walls
        W1L = new JLabel("Length in ft.:");
        W1L.setBounds(10,90,100,25);
        panel.add(W1L);

        W2W = new JLabel("Wight in ft.:");
        W2W.setBounds(10, 140, 100, 25);
        panel.add(W2W);

        W3L = new JLabel("Length in ft.:");
        W3L.setBounds(10,195,100,25);
        panel.add(W3L);

        W4W = new JLabel("Wight in ft.:");
        W4W.setBounds(10,245,100,25);
        panel.add(W4W);

        //////////////////////////////////////////////////////////

        //creates the field to add the walls lengths
        length1 = new JTextField();
        length1.setBounds(100, 90,80,25);
        panel.add(length1);

        wight1 = new JTextField();
        wight1.setBounds(100, 140,80,25);
        panel.add(wight1);

        length2 = new JTextField();
        length2.setBounds(100, 195,80,25);
        panel.add(length2);

        wight2 = new JTextField();
        wight2.setBounds(100, 245,80,25);
        panel.add(wight2);

        //////////////////////////////////////////////////////////

        //creating the total field
        total = new JLabel("Total: ");
        total.setBounds(180,300,200,25);
        panel.add(total);

        //creating total button
        total1 = new JButton("Calculate Amount");
        total1.setBounds(20, 300, 150, 25);
        total1.addActionListener(new TrimCalculator());
        panel.add(total1);




        frame.setVisible(true);

    }

    //gets the button and changes it from a string into a int so it can be calculated
    @Override
    public void actionPerformed(ActionEvent e) {
        String lengthOne = length1.getText();
        String wightOne = wight1.getText();
        String lengthTwo = length2.getText();
        String wightTwo = wight2.getText();

        //changes the strings into a double
        double l1 = Double.parseDouble(lengthOne);
        double w1 = Double.parseDouble(wightOne);
        double l2 = Double.parseDouble(lengthTwo);
        double W2 = Double.parseDouble(wightTwo);


        // adds the sides together
        double wallTotal = l1 + w1 + l2 + W2;

        //gets total2 and divides it by 8 to get the final total
        double Total = wallTotal/8;

        //changes the double variable Total into a string
        String f = String.valueOf(Total);

        //makes the button actually print the amount of trim needed
        if (e.getSource() == total1){
            total.setText("Total: " +f+" pieces of trim");
        }
        length1.setText("");
        wight1.setText("");
        length2.setText("");
        wight2.setText("");

    }
}