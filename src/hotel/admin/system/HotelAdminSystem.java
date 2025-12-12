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
                next.setBackground(new Color(220,100,0));
                next.setForeground(Color.WHITE);
                next.setFont(new Font("Tahoma", Font.BOLD, 14));
                image.add(next);

//                // Styled Login button (top-right) — matches title weight and uses an accent color
//                JButton login = new JButton("Login");
//                login.setBounds(1100,30,100,40);
//                // Accent color that pairs with white title text and the orange accent used elsewhere
//                login.setBackground(new Color(220, 100, 0)); // warm orange
//                login.setForeground(Color.WHITE);
//                login.setFont(new Font("Tahoma", Font.BOLD, 14));
//                login.setFocusPainted(false);
//                image.add(login);

                // Open a small modal login dialog when clicked
                next.addActionListener(evt -> {
                    JDialog dlg = new JDialog(this, "Admin Login", true);
                    dlg.setSize(380,200);
                    dlg.setResizable(false);
                    dlg.setLocationRelativeTo(this);

                    JPanel panel = new JPanel();
                    panel.setLayout(null);

                    JLabel userLabel = new JLabel("Username:");
                    userLabel.setBounds(20,20,80,25);
                    panel.add(userLabel);

                    JTextField userField = new JTextField();
                    userField.setBounds(110,20,240,25);
                    panel.add(userField);

                    JLabel passLabel = new JLabel("Password:");
                    passLabel.setBounds(20,60,80,25);
                    panel.add(passLabel);

                    JPasswordField passField = new JPasswordField();
                    passField.setBounds(110,60,240,25);
                    panel.add(passField);

                    JButton signIn = new JButton("Sign In");
                    signIn.setBounds(130,110,120,30);
                    signIn.setBackground(new Color(220, 100, 0));
                    signIn.setForeground(Color.WHITE);
                    signIn.setFont(new Font("Tahoma", Font.BOLD, 14));
                    signIn.setFocusPainted(false);
                    panel.add(signIn);

                    signIn.addActionListener(ae -> {
                        String username = userField.getText();
                        // Placeholder: no auth implemented here — show a simple message
                        JOptionPane.showMessageDialog(dlg, "Login attempt for: " + username);
                        dlg.dispose();
                    });

                    dlg.add(panel);
                    dlg.setVisible(true);
                });
//
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