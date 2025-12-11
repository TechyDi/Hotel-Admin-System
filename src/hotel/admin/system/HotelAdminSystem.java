package hotel.admin.system;
import javax.swing.*;

public class HotelAdminSystem extends JFrame {
        HotelAdminSystem(){
            
            setSize(1366,565);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
            JLabel image = new JLabel(i1);
            
            add (image);
            setVisible(true);
            setLocation(100, 100);
            
        }
    public static void main(String[] args) {
        new HotelAdminSystem();
    }
    
}