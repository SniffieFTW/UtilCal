package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WallpaperCalculator implements ActionListener {

    //TextFields to get users input
    private static JTextField lengthText;
    private static JTextField lengthText2;
    private static JTextField lengthText3;
    private static JTextField lengthText4;
    private static JTextField heightText;

    //Total button and label
    private static JButton button;
    private static JLabel total;

    //Labels to title the Length
    private static JLabel length;
    private static JLabel length2;
    private static JLabel length3;
    private static JLabel length4;

    public static void Wallpaper() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(450,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(455,318);
        frame.add(panel);

        //sets the title
        JLabel title = new JLabel();
        title.setBounds(10, 20, 300, 25);
        title.setText("Wallpaper Calculator");
        panel.add(title);

        //////////////////////////////////////////////////////////

        //creates a height text label
        JLabel height = new JLabel();
        height.setBounds(10,50,300,25);
        height.setText("Wall Height:");
        panel.add(height);


        //////////////////////////////////////////////////////////

        //created a field for the height text input
        heightText = new JTextField();
        heightText.setBounds(120,50,90,25);
        panel.add(heightText);

        //////////////////////////////////////////////////////////

        //sets the lengths boxes
        length = new JLabel();
        length.setBounds(10,80,300,25);
        length.setText("Length 1 In Feet:");
        panel.add(length);

        //sets the lengths boxes
        length2 = new JLabel();
        length2.setBounds(10,110,300,25);
        length2.setText("Length 2 In Feet:");
        panel.add(length2);

        //sets the lengths boxes
        length3 = new JLabel();
        length3.setBounds(10,140,300,25);
        length3.setText("Length 3 In Feet:");
        panel.add(length3);

        //sets the lengths boxes
        length4 = new JLabel();
        length4.setBounds(10,170,300,25);
        length4.setText("Length 4 In Feet:");
        panel.add(length4);



        //////////////////////////////////////////////////////////

        //creates a field for the length text input
        lengthText = new JTextField();
        lengthText.setBounds(120,80,90,25);
        panel.add(lengthText);

        lengthText2 = new JTextField();
        lengthText2.setBounds(120,110,90,25);
        panel.add(lengthText2);

        lengthText3 = new JTextField();
        lengthText3.setBounds(120,140,90,25);
        panel.add(lengthText3);

        lengthText4 = new JTextField();
        lengthText4.setBounds(120,170,90,25);
        panel.add(lengthText4);

        //////////////////////////////////////////////////////////

        //makes a field to set a text box so people can see where the total will be
        JLabel totalAmount = new JLabel();
        totalAmount.setBounds(180,200,300,25);
        totalAmount.setText("Total Rolls:");
        panel.add(totalAmount);

        //makes a field to present the answer
        total = new JLabel();
        total.setBounds(260, 200, 180,25);
        panel.add(total);


        //makes a button to get the two lengths and start the multiplication process
        button = new JButton();
        button.setBounds(10,200,150,25);
        button.setText("Find Amount");
        button.addActionListener(new WallpaperCalculator());
        panel.add(button);

        frame.setVisible(true);

    }

    //gets the button and changes it from a string into a int so it can be calculated
    @Override
    public void actionPerformed(ActionEvent c) {
        String heightAmount = heightText.getText();
        String lengthAmount = lengthText.getText();
        String lengthAmount2 = lengthText2.getText();
        String lengthAmount3 = lengthText3.getText();
        String lengthAmount4 = lengthText4.getText();

        //changes the strings into a double
        double length = Double.parseDouble(lengthAmount);
        double length2 = Double.parseDouble(lengthAmount2);
        double length3 = Double.parseDouble(lengthAmount3);
        double length4 = Double.parseDouble(lengthAmount4);
        double height = Double.parseDouble(heightAmount);

        // multiplies the two sides
        double totalLength = length + length2 + length3 +length4;

        double sidesTotal = height * totalLength;

        //divides the sidesTotal to get Total
        double Total = sidesTotal / 40;
        System.out.println(Total);

        //changes the double variable newTotal into a string
        String f = String.valueOf(Total);

        //makes the button actually print the amount of trim needed
        if (c.getSource() == button){
            total.setText(f);
        }

    }

}

