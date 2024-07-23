import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class testproject {
    public static void main(String[] args) {
        System.out.println("Hellow");
        JFrame frame = new JFrame();
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        // frame.setLayout(new GridLayout(1, 2));
        frame.setLayout(new BorderLayout());
        Panel right = new Panel(new BorderLayout());
        Panel left = new Panel(new GridLayout(4, 1));

        Panel panelbutton = new Panel(new GridLayout(10, 20));
        Button[] buttons = new Button[200];
        JButton button = new JButton("confirm file");
        TextField inputfile = new TextField();

        for (int i = 0; i < 200; i++) {
            buttons[i] = new Button();
            panelbutton.add(buttons[i]);
        }
        Panel north = new Panel(new GridLayout(15, 1));
        Panel soust = new Panel(new GridLayout(1, 2));
        Panel addnorth = new Panel();
        TextField inputnumber = new TextField();
        inputnumber.setSize(500, 20);
        JButton buttonstart = new JButton("start");
        JButton buttonstop = new JButton("stop");
        Panel buttonST = new Panel(new GridLayout(1, 2));
        buttonST.add(buttonstart);
        buttonST.add(buttonstop);
        // north.add(button);

        Panel display = new Panel(new GridLayout(10, 5));
        Panel buttondisplay1 = new Panel(new BorderLayout());
        Panel buttondisplay2 = new Panel(new BorderLayout());
        Panel buttondisplay3 = new Panel(new BorderLayout());
        Panel buttondisplay4 = new Panel(new BorderLayout());

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();

        button1.setBackground(new Color(0, 255, 0));
        button2.setBackground(new Color(255, 255, 0));
        button3.setBackground(new Color(255, 100, 0));
        button4.setBackground(new Color(255, 0, 0));

        JLabel labelButton1 = new JLabel("have patient 0-9%");
        JLabel labelButton2 = new JLabel("have patient 0-9%");
        JLabel labelButton3 = new JLabel("have patient 0-9%");
        JLabel labelButton4 = new JLabel("have patient 0-9%");

        JLabel lablenorth1 = new JLabel("  ");
        JLabel lablenorth2 = new JLabel("  ");
        JLabel lablenorth3 = new JLabel("  ");
        JLabel lablenorth4 = new JLabel("  ");
        buttondisplay1.add(button1, BorderLayout.CENTER);
        buttondisplay1.add(labelButton1, BorderLayout.SOUTH);
        buttondisplay2.add(button2, BorderLayout.CENTER);
        buttondisplay2.add(labelButton2, BorderLayout.SOUTH);
        buttondisplay3.add(button3, BorderLayout.CENTER);
        buttondisplay3.add(labelButton3, BorderLayout.SOUTH);
        buttondisplay4.add(button4, BorderLayout.CENTER);
        buttondisplay4.add(labelButton4, BorderLayout.SOUTH);
        buttondisplay1.add(lablenorth1, BorderLayout.NORTH);
        buttondisplay2.add(lablenorth2, BorderLayout.NORTH);
        buttondisplay3.add(lablenorth3, BorderLayout.NORTH);
        buttondisplay4.add(lablenorth4, BorderLayout.NORTH);
        left.add(buttondisplay1);
        left.add(buttondisplay2);
        left.add(buttondisplay3);
        left.add(buttondisplay4);

        Panel panelinputfile = new Panel(new GridLayout(2, 1));
        Panel panelinputnumber = new Panel(new GridLayout(2, 1));
        Panel inputandtext = new Panel(new BorderLayout());
        JLabel inputtext1 = new JLabel("   select file   ");
        JLabel inputtext2 = new JLabel("      ");

        inputandtext.add(inputtext1, BorderLayout.WEST);
        inputandtext.add(inputfile, BorderLayout.CENTER);
        inputandtext.add(inputtext2, BorderLayout.EAST);
        panelinputfile.add(inputandtext);
        panelinputfile.add(button);
        panelinputnumber.add(inputnumber);
        panelinputnumber.add(buttonST);

        soust.add(panelinputfile);
        soust.add(panelinputnumber);
        north.add(addnorth);

        right.add(panelbutton, BorderLayout.CENTER);
        right.add(north, BorderLayout.NORTH);
        right.add(soust, BorderLayout.SOUTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.CENTER);
    }
}