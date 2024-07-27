import java.awt.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyWindow extends JFrame {
    ArrayList<Integer> data = new ArrayList<Integer>();

    // ตัว panel ที่ทำหน้าที่แสดงผลข้อมูลต่างๆข้างใน ไม่มีขอบ
    Panel displaycenter = new Panel(new BorderLayout());
    Panel displaywest = new Panel(new GridLayout(3, 1));
    Panel displaynorth = new Panel(new GridLayout(1, 5));

    // ตัว panel ที่ทำการเพิ่มของเข้ามาแล้ว แต่ละ panel (เพิ่มขอบชั้นที่ 1)
    Panel northborder = new Panel();
    Panel westborder = new Panel();
    Panel centerborder = new Panel();

    // เป็นตัวที่เพิ่มขอบอะไรเสร็จหมดแล้ว ตัวนี้จะเป็นตัว add เข้าสู่ frame
    // (เพิ่มขอบชั้นที่ 2 พร้อมเอาเข้าสู่ frame)
    Panel backgroundnorth = new Panel();
    Panel backgroundwest = new Panel();
    Panel backgroundcenter = new Panel();

    // หน้าจอหลักทั้งหมด
    public MyWindow() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setBackground(new Color(196, 226, 222));

        add(backgroundnorth, BorderLayout.NORTH);
        add(backgroundwest, BorderLayout.WEST);
        add(backgroundcenter, BorderLayout.CENTER);
        setVisible(true);
    }

    // ปุ่มแสดงข้อมูล ทั้ง 200 ปุ่ม
    void Buttons(ArrayList<Integer> data) {
        // center display right
        Panel panelbutton = new Panel(new GridLayout(10, 20));
        Button[] buttons = new Button[200];
        for (int i = 0; i < 200; i++) {
            buttons[i] = new Button();
            if (data.get(i) >= 0 && data.get(i) <= 50) {
                buttons[i].setBackground(new Color(152, 204, 93));
            } else {

            }
            panelbutton.add(buttons[i]);
        }
        displaycenter.add(panelbutton, BorderLayout.CENTER);
    }

    // แสดงข้อมูลต่างๆทางด้านบนของหน้าจอ
    void ShowInformation() {
        Panel dust = new Panel();
        Panel population = new Panel();
        Panel healty = new Panel();
        Panel parent = new Panel();
        Panel percent = new Panel();

        Panel displaydust = new Panel(new GridLayout(5, 1));
        Panel displaypopulation = new Panel(new GridLayout(5, 1));
        Panel displayhealty = new Panel(new GridLayout(5, 1));
        Panel displayparent = new Panel(new GridLayout(5, 1));
        Panel displaypercent = new Panel(new GridLayout(5, 1));

        addborder borderdust = new addborder(196, 226, 222, displaydust, dust);
        addborder borderpopulation = new addborder(196, 226, 222, displaypopulation, population);
        addborder borderhealty = new addborder(196, 226, 222, displayhealty, healty);
        addborder borderpercent = new addborder(196, 226, 222, displaypercent, percent);
        addborder borderparent = new addborder(196, 226, 222, displayparent, parent);

        JLabel dusttext = new JLabel("dust");
        JLabel populationtext = new JLabel("population");
        JLabel healttext = new JLabel("healty");
        JLabel parenttext = new JLabel("parent");
        JLabel percenttext = new JLabel("percent");

        displaydust.add(dusttext);
        displaypopulation.add(populationtext);
        displayhealty.add(healttext);
        displayparent.add(parenttext);
        displaypercent.add(percenttext);

        dust.setBackground(new Color(226, 238, 231));
        population.setBackground(new Color(226, 238, 231));
        healty.setBackground(new Color(226, 238, 231));
        parent.setBackground(new Color(226, 238, 231));
        percent.setBackground(new Color(226, 238, 231));

        displaynorth.add(dust);
        displaynorth.add(population);
        displaynorth.add(healty);
        displaynorth.add(parent);
        displaynorth.add(percent);
    }

    // กล่องเอาไว้ตัวรับค่าต่างๆ
    void TextFieldInput() {
        Panel bordersoust = new Panel(new BorderLayout());
        Panel northbordersoust = new Panel();

        Panel soust = new Panel(new GridLayout(1, 2));
        // summary button

        // input file left
        Panel Panelinputfile = new Panel(new GridLayout(2, 1));
        Panel sumtextfield = new Panel(new BorderLayout());

        JLabel lableinputfile = new JLabel("   select file   ");
        TextField inputfile = new TextField();
        JButton buttoninputfile = new JButton("confirm file");
        sumtextfield.add(lableinputfile, BorderLayout.WEST);
        sumtextfield.add(inputfile, BorderLayout.CENTER);

        Panelinputfile.add(sumtextfield);
        Panelinputfile.add(buttoninputfile);

        // input number right
        Panel Panelinputnumber = new Panel(new GridLayout(2, 1));
        TextField inputnumber = new TextField();

        JButton buttonstart = new JButton("start");
        JButton buttonstop = new JButton("stop");
        Panel sumbuttonST = new Panel(new GridLayout(1, 2));
        sumbuttonST.add(buttonstart);
        sumbuttonST.add(buttonstop);
        Panelinputnumber.add(inputnumber);
        Panelinputnumber.add(sumbuttonST);

        // add to soust
        soust.add(Panelinputfile);
        soust.add(Panelinputnumber);

        bordersoust.add(soust, BorderLayout.CENTER);
        bordersoust.add(northbordersoust, BorderLayout.NORTH);

        displaycenter.add(bordersoust, BorderLayout.SOUTH);
    }

    // ตัวแสดงข้อมูลทางซ้ายมือของหน้าจอ
    void emotion() {
        Font font = new Font("Browallia New", Font.BOLD, 18); // font สำหรับข้อความทั่วไป
        Font fontnumber = new Font("Browallia New", Font.BOLD, 25); // font สำหรับตัวเลขเพราะเน้นให้เลขตัวใหญ่
        Panel[] panelwest = new Panel[6]; // ต้องแอดเข้าไปใน displaywest
        Button[] buttonwest = new Button[6]; // ต้องแอดปุ่มแต่ละปุ่มเข้าไปใน panelwest
        JLabel[] labelwest1 = new JLabel[6]; // ข้อความบรรทัดแรกของแต่ละ panelwest แอดเข้าไป
        JLabel[] labelwest2 = new JLabel[6]; // ข้อความบรรทัดแรกของแต่ละ panelwest แอดเข้าไป
        Panel[] textwest = new Panel[6]; // จะเป็นpanel รวมข้อความทั้ง 2 บรรทัดและ แอดไปใน panelwest soust
        Panel[] border = new Panel[6];

        for (int i = 0; i < 6; i++) {
            if (i < 2) {
                panelwest[i] = new Panel(new BorderLayout());
                buttonwest[i] = new Button("ok" + i);
                // labelwest1[i] = new JLabel("มีคนป่วยจากฝุ่นละออง");
                // labelwest1[i].setFont(font);

                // textwest[i] = new Panel();
                // textwest[i].add(labelwest1[i]);

                panelwest[i].add(buttonwest[i], BorderLayout.CENTER);

                displaywest.add(panelwest[i]);
            } else {
                panelwest[i] = new Panel(new BorderLayout());
                buttonwest[i] = new Button("ok" + i);
                labelwest1[i] = new JLabel("มีคนป่วยจากฝุ่น");
                labelwest1[i].setFont(font);

                textwest[i] = new Panel(new GridLayout(2, 1));
                textwest[i].add(labelwest1[i]);

                switch (i) {
                    case 2:
                        labelwest2[i] = new JLabel("0-9%");
                        labelwest2[i].setFont(fontnumber);
                        textwest[i].add(labelwest2[i]);
                        buttonwest[i].setBackground(new Color(152, 204, 93));
                        break;
                    case 3:
                        labelwest2[i] = new JLabel("10-19%");
                        labelwest2[i].setFont(fontnumber);
                        textwest[i].add(labelwest2[i]);
                        buttonwest[i].setBackground(new Color(255, 243, 18));
                        break;
                    case 4:
                        labelwest2[i] = new JLabel("20-29%");
                        labelwest2[i].setFont(fontnumber);
                        textwest[i].add(labelwest2[i]);
                        buttonwest[i].setBackground(new Color(243, 129, 36));
                        break;
                    case 5:
                        labelwest2[i] = new JLabel("เกิน 30%");
                        labelwest2[i].setFont(fontnumber);
                        textwest[i].add(labelwest2[i]);
                        buttonwest[i].setBackground(new Color(255, 0, 0));
                        break;
                }
                border[i] = new Panel(new BorderLayout());

                panelwest[i].add(buttonwest[i], BorderLayout.CENTER);
                panelwest[i].add(textwest[i], BorderLayout.SOUTH);

                addborder[] addborderwest = new addborder[6];
                addborderwest[i] = new addborder(panelwest[i], border[i]);

                displaywest.add(border[i]);

            }
        }

    }

    // กรอบของ การแสดงผลทางซ้ายมือของหน้าจอ เพิ่มขอบค่างๆ
    void west() {
        displaywest.setBackground(new Color(196, 226, 222));
        addborder setborderwest1 = new addborder(196, 226, 222, displaywest, westborder);
        addborder setborderwest2 = new addborder(westborder, backgroundwest);
    }

    // กรอบของ การแสดงผลทตรงกลาง ทางด้านขวามือของหน้าจอทั้งหมด เพิ่มขอบค่างๆ
    void center() {
        displaycenter.setBackground(new Color(196, 226, 222));
        addborder setbordercenter1 = new addborder(196, 226, 222, displaycenter, centerborder);
        addborder setbordercenter2 = new addborder(centerborder, backgroundcenter);
    }

    // กรอบของ การแสดงผลทางด้านบนของหน้าจอทั้งหมด เพิ่มขอบค่างๆ
    void north() {
        addborder setbordernorth1 = new addborder(196, 226, 222, displaynorth, northborder);
        addborder setbordernorth2 = new addborder(northborder, backgroundnorth);
    }
}