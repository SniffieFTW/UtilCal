package TileType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class twoByTwo implements ActionListener {

    //basic labels and title
    private static JLabel type;
    private static JLabel length;
    private static JLabel width;

    //label text box
    private static JTextField lengthText;
    private static JTextField widthText;

    //total button and label
    private static JLabel total1;
    private static JButton tButton;

    public static void twoBy() {

        //create the GUI
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(450 , 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(555, 318);
        frame.add(panel);

        //////////////////////////////////////////////////////////

        //Sets title and adds to gui
        type = new JLabel("2' x 2'");
        type.setBounds(10,20,300,25);
        panel.add(type);

        //////////////////////////////////////////////////////////

        //Titles measurements given
        length = new JLabel("Length in feet");
        length.setBounds(10,50,300,25);
        panel.add(length);

        width = new JLabel("Wigth in feet");
        width.setBounds(10,80,300,25);
        panel.add(width);

        //////////////////////////////////////////////////////////

        lengthText = new JTextField();
        lengthText.setBounds(100,50,80,25);
        panel.add(lengthText);

        widthText = new JTextField();
        widthText.setBounds( 100, 80, 80, 25);
        panel.add(widthText);

        //////////////////////////////////////////////////////////

        //total button
        tButton = new JButton("Find Amount");
        tButton.setBounds(10,120,120,25);
        tButton.addActionListener(new twoByTwo());
        panel.add(tButton);

        //creates the Total label
        total1 = new JLabel("Total: ");
        total1.setBounds(150,120,120,25);
        panel.add(total1);

        frame.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        //changes the int to a string
        String length = lengthText.getText();
        String width = widthText.getText();

        //Makes Strings a double
        double lengthTotal = Double.parseDouble(length);
        double widthTotalT = Double.parseDouble(width);

        //Finds area of room
        double area = lengthTotal * widthTotalT;

        //converts room to in  Ai = Area converted to Inch
        double Ai = area / 12;

        //Divide totalArea by area of tile
        double tA = Ai / 4;

        //converts Double total to string
        String f = String.valueOf(tA);

        //makes the label print total
        if (e.getSource() == tButton){
            total1.setText("Total: " +f+" tile needed");
        }
        lengthText.setText("");
        widthText.setText("");
    }
}
