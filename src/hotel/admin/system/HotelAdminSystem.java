package hotel.admin.system;
import javax.swing.*;
import java.awt.*;

public class HotelAdminSystem extends JFrame {
        HotelAdminSystem(){
            
            //setLocation(150, 30);    // w,r,t the screen
            //setSize(1248,800);
          setBounds(150,30,1248,800);
          setLayout(null);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Hotel Royal Meridian_first_image.jpeg"));
            JLabel image = new JLabel(i1);
            image.setBounds(0, 0, 1248, 800); //w.r.t image frame , beacause we use imagae to call the function. so the things are done according ot image frame
            add (image);
             
            JLabel text = new JLabel("HOTEL ADMIN SYSTEM");
           image. add(text).setBounds(630,570,800,300); // Location x, Location Y, Lenth, bredth
           text.setForeground(Color.WHITE);
           text.setFont(new Font("Times New Roman", Font.BOLD,50)); // Font Family, Font type, FOnt SIze
           text.setBackground(Color.BLUE);
            
            //image.add(text);
            
            
            setVisible(true);

            
        }
    public static void main(String[] args) {
        new HotelAdminSystem();
    }
    
}