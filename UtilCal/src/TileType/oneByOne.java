package TileType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class oneByOne implements ActionListener {

    //basic labels and title
    private static JLabel type;
    private static JLabel length;
    private static JLabel width;

    //label Text boxes
    private static JTextField lengthText;
    private static JTextField widthText;

    // total button and label
    private static JLabel total;
    private static JButton tButton;

    public static void oneBy() {


        //creates the GUI
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(555, 318);
        frame.add(panel);

        //////////////////////////////////////////////////////////

        //title
        type = new JLabel("1' x 1'");
        type.setBounds(10,20,300,25);
        panel.add(type);

        //////////////////////////////////////////////////////////

        //measurements given
        length = new JLabel("Length in feet:");
        length.setBounds(10,50,300,25);
        panel.add(length);

        width = new JLabel("Width in feet:");
        width.setBounds(10,80,300,25);
        panel.add(width);

        //////////////////////////////////////////////////////////

        //Text fields for measurements
        lengthText = new JTextField();
        lengthText.setBounds(100,50,80,25);
        panel.add(lengthText);

        widthText = new JTextField();
        widthText.setBounds(100, 80, 80, 25);
        panel.add(widthText);

        //////////////////////////////////////////////////////////

        //total button and label
        tButton = new JButton("Find Amount");
        tButton.setBounds(10,120,120,25);
        tButton.addActionListener(new oneByOne());
        panel.add(tButton);

        total = new JLabel("Total: ");
        total.setBounds(150,120,120,25);
        panel.add(total);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //changes the int to a string
        String length = lengthText.getText();
        String width = widthText.getText();

        //changes string to double
        double lT = Double.parseDouble(length);
        double wT = Double.parseDouble(width);

        //Finds area
        double first = lT * wT;

    }
}

//1 4 8