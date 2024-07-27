import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyProjectGUI {
    public static void main(String[] args) {
        MyWindow window = new MyWindow();

        // ตัวหน้าจอ window display
        // window.setVisible(true);
        ArrayList<Integer> datanumber = new ArrayList<Integer>();
        window.ShowInformation();
        window.TextFieldInput();
        window.emotion();
        window.west();
        window.center();
        window.north();
        window.Buttons(datanumber);

        readfile rf = new readfile();
        rf.getdata();

        // window.readdata(data);

        // ตัวอ่านไฟล์

       
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
   
}