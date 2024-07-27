import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class readfile {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        readfile rf = new readfile();
        data = rf.read();
        rf.setdata(data);
        // rf.getdata();
    }

    private ArrayList<Integer> data;

    ArrayList<Integer> read() {
        ArrayList<Integer> data = new ArrayList<Integer>();
        try {
            // String[] data = new String[200];
            File myObj = new File("pm2.5.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNext() && i < 200) {
                String read = myReader.next();
                data.add(Integer.parseInt(read));
                i++;
            }
            myReader.close();

            for (int j = 0; j < data.size(); j++) {
                System.out.print(data.get(j) + "  ");
                if (j % 10 == 0 && j != 0) {
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Not found file please try again");
            e.printStackTrace();
        }
        return data;
    }

    void setdata(ArrayList<Integer> data) {
        this.data = data;
    }

    ArrayList<Integer> getdata() {
        return this.data;
    }
}