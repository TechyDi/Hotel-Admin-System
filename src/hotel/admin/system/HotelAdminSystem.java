package hotel.admin.system;
import javax.swing.*;
import java.awt.*;

public class HotelAdminSystem extends JFrame {
        HotelAdminSystem(){
            //FRAME ADDING
                //setLocation(150, 30);    // w,r,t the screen
                //setSize(1248,800);
                setBounds(150,30,1248,800);
                setLayout(null);
            
            //IMAGE ADDING
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Hotel Royal Meridian_first_image.jpeg"));
                JLabel image = new JLabel(i1);
                image.setBounds(0, 0, 1248, 800); //w.r.t image frame , beacause we use imagae to call the function. so the things are done according ot image frame
                add (image);
             
            //TEXT ADDING
                JLabel text = new JLabel("HOTEL ADMIN SYSTEM");
                text.setBounds(630,570,800,300); // Location x, Location Y, Lenth, bredth
                text.setForeground(Color.WHITE);
                text.setFont(new Font("Times New Roman", Font.BOLD,50)); // Font Family, Font type, FOnt SIze
                image.add(text);
                
            //BUTTON ADDING
                JButton next = new JButton("Next");
                next.setBounds(70,700,100,40);
                next.setBackground(Color.white);
                next.setForeground(Color.ORANGE);
                //next.setBackground(new Color(218, 135, 32));
                image.add(next);

            setVisible(true); // by default it is false
            
            //DIPPER EFFECT
            while(true){
                text.setVisible(false);
                
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }text.setVisible(true);
                
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        }
    public static void main(String[] args) {
        new HotelAdminSystem();
    }
    
}