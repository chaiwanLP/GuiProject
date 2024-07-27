import java.awt.*;

public class addborder {
    addborder(Panel display, Panel border) {
        border.setLayout(new BorderLayout());
        border.add(display);
        Panel west = new Panel();
        Panel soust = new Panel();
        Panel east = new Panel();
        Panel north = new Panel();

        west.setBackground(new Color(226, 238, 231));
        soust.setBackground(new Color(226, 238, 231));
        east.setBackground(new Color(226, 238, 231));
        north.setBackground(new Color(226, 238, 231));

        border.add(display, BorderLayout.CENTER);
        border.add(west, BorderLayout.WEST);
        border.add(soust, BorderLayout.SOUTH);
        border.add(east, BorderLayout.EAST);
        border.add(north, BorderLayout.NORTH);
    }

    addborder(int r, int g, int b, Panel display, Panel border) {
        border.setLayout(new BorderLayout());
        border.add(display);
        Panel west = new Panel();
        Panel soust = new Panel();
        Panel east = new Panel();
        Panel north = new Panel();

        west.setBackground(new Color(r, g, b));
        soust.setBackground(new Color(r, g, b));
        east.setBackground(new Color(r, g, b));
        north.setBackground(new Color(r, g, b));

        border.add(display, BorderLayout.CENTER);
        border.add(west, BorderLayout.WEST);
        border.add(soust, BorderLayout.SOUTH);
        border.add(east, BorderLayout.EAST);
        border.add(north, BorderLayout.NORTH);

    }
}
