import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Page {
    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
    }
}
class Home extends JFrame{
    
    Home(){
        //ตั้งค่าเฟรม
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // ===================Panel ของพื้นหลัง =============================================

        JPanel panel = new JPanel();
        panel.setBackground(new Color(210,241,247));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
        // ==================== ปรับแต่งรูปภาพ ==============================
    
        ImageIcon imgIcon = new ImageIcon("C:\\Project Duo\\GuiProject\\pm2.5picture.png");
        Image img = imgIcon.getImage();
        Image imgSetSize = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(imgSetSize);

        JLabel imgLabel = new JLabel(resizedIcon);
        imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(20,40)));
        panel.add(imgLabel);

        // ==================== สร้างและปรับแต่งสไตล์ปุ่ม ==============================
        
        JButton start =  createStyledButton ("Start");
        JButton about =  createStyledButton ("About");
        JButton quit =  createStyledButton("Quit");

        
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        about.setAlignmentX(Component.CENTER_ALIGNMENT);
        quit.setAlignmentX(Component.CENTER_ALIGNMENT);
       


        // ==================== เพิ่มขนาดช่องว่างของแต่ละปุ่ม ==============================

        panel.add(Box.createRigidArea(new Dimension(0,30)));
        panel.add(start);
        panel.add(Box.createRigidArea(new Dimension(0,25)));
        panel.add(about);
        panel.add(Box.createRigidArea(new Dimension(0,25)));
        panel.add(quit);   
        
        // เมื่อกดปุ่มจะสลับหน้าจอเข้าไปสู่หน้า  Start Program
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MyProjectGUI StartGui = new MyProjectGUI();
                StartGui.setVisible(true);
                dispose();
            }
        });

        // เมื่อกดปุ่ม About จะสลับเข้าไปที่หน้า About แทน Home
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Home_about about = new Home_about();
                about.setVisible(true);
                dispose();
            }
        });
        
        //เมื่อกดปุ่ม Quit จะทำการจบโปรแกรม หรือ ออกโปรแกรมนั้นเเอง
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(quit, "Bye!");
                System.exit(0);
            }
        });

        // ==================== เพิ่ม Panel ลงเฟรม  ==============================

        add(panel);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(179,179,179)); //สีปุ่ม
        button.setForeground(Color.BLACK); //สีตัวหนังสือ บนปุ่ม
        button.setFont(new Font("Arial", Font.BOLD, 18)); //ฟอนต์และขนาดตัวอักษร
        button.setFocusPainted(false); 
        button.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40)); // เซ็ตปุ่ม ( บน/ซ้าย/ปุ่ม/ขวา )

        // กำหนด สีของการกดปุ่ม
        button.setUI(new BasicButtonUI() {
            @Override
            //เมธอด ทาสีเมื่อกดปุ่ม
            public void paintButtonPressed(Graphics grahic, AbstractButton btn) {
                //  Graphics grahic: อ็อบเจ็กต์ที่ใช้ในการวาดกราฟิก ให้เมธอดในการกำหนดสี, วาดรูปร่าง
                //AbstractButton btn: อ็อบเจ็กต์ของปุ่มที่ถูกกด มีคุณสมบัติเช่น ขนาด, สีพื้นหลัง, และสถานะของปุ่ม
                if (btn.isContentAreaFilled()) {
                    grahic.setColor(new Color(72, 118, 255)); // สีเมื่อกดปุ่ม
                    grahic.fillRect(0, 0, btn.getWidth(), btn.getHeight());
                }
            }
        });

        return button;
    }


}
class Home_about extends JFrame{
    Home_about(){
        setTitle("About");
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel a_panel  = new JPanel();
        a_panel.setBackground(new Color(210,241,247));
        a_panel.setLayout(new GridLayout());        
        //ตั้งค่ารูปภาพ นิสิตคนแรก
        ImageIcon Nisit_1 = new ImageIcon("C:\\Project Duo\\GuiProject\\nisit1.jpg");
        Image img_Nisit_1 = Nisit_1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        
        //==================== ใส่รูปนิสิตลงไปใน label_1  ==============================
        JLabel Nisit1_Label_1 = new JLabel(new ImageIcon(img_Nisit_1));

        //ตั้งค่ารูปภาพ นิสิตคนสอง
        ImageIcon Nisit_2 = new ImageIcon("C:\\Project Duo\\GuiProject\\nisit2.jpg");
        Image img_Nisit_2 = Nisit_2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        
        //==================== ใส่รูปนิสิตลงไปใน label_2  ==============================
        JLabel Nisit2_Label_2 = new JLabel(new ImageIcon(img_Nisit_2));
        
        //==================== นำ label ใส่ใน panel   ==============================
        a_panel.add(Nisit1_Label_1);
        a_panel.add(Nisit2_Label_2);
        

        //==================== สร้าง ปุ่ม Back   ==============================
        JButton back = new JButton("Back");
        back.setBackground(new Color(179,179,179)); //สีปุ่ม Back
        back.setForeground(Color.BLACK); //สีตัวอักษร
        back.setFont(new Font("Airal", Font.BOLD,20)); //ตัวอักษร ฟอนต์
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createEmptyBorder(20, 20, 20,20)); // ขอบปุ่ม

        //==================== เมื่อคลิก ปุ่ม Back จะกลับไปที่  Home หรือ หน้าแรก  ==============================

        back.addActionListener(new ActionListener() {
            public void  actionPerformed(ActionEvent e ){
                Home back_home = new Home();
                back_home.setVisible(true);
                dispose();
            }
        });

        //==================== นำ Panel  รูปภาพไปที่ตำแหน่ง Center หรือ ตรงกลาง   ==============================
        add(a_panel,BorderLayout.CENTER);

        //==================== เพิ่ม ปุ่ม Back ไปใส่ใน Panel Backbtn   ==============================
        JPanel backbtn = new JPanel();
        backbtn.setLayout(new FlowLayout(FlowLayout.LEFT)); // จัดปุ่มไปเรียงที่มุมซ้าย
        backbtn.add(back);
        backbtn.setBackground(new Color(210,241,247));

        backbtn.add(Box.createRigidArea(new Dimension(0,120)));//ดันปุ่ม ไม่ให้ จมเฟรม
       
        add(backbtn,BorderLayout.SOUTH);
    }
}
