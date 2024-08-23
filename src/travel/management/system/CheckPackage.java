
package travel.management.system;
import javax.swing.*;
import java.awt.*;


public class CheckPackage extends JFrame{
    
    String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights ", "Airport Assistance", "HalfDay city tour", "Daily Buffet", "Soft Drinks Free", "Full day 3 Island cruise", "English speaking guide", "BOOK PACKAGE", "Rs 24000/-", "SUMMER SPECIAL", "package1.jpg"};
    String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll free" ,"Entrance Free Tickets", "Meet and greet at airport", "Welcome drinks on arrival","Night Safari", "Cruise with Dinner", "BOOK NOW", "Rs 12000/-", "WINTER SPECIAL", "package2.jpg"};
    String[] package3 = {"BRONZE PACKAGE", "4 Days and 5 Nights", "Return Airfare", "Free clubbing, Horse Riding & Other Games","River Rafting" ,"Hard Drinks Free", "Daily Buffet", "BBQ Dinner", "BOOK NOW", "Rs 10000/-", "MONSOON SPECIAL", "package3.jpg"};
    
    CheckPackage(){
        setBounds(450, 200, 900, 600);
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        
        setVisible(true);
    }
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(new Color(247, 215, 84));
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(new Color(236, 130, 140));
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30, 310, 300, 30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 360, 300, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(60, 430, 300, 30);
        l9.setForeground(new Color(236, 130, 140));
        l9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(80, 480, 300, 30);
        l10.setForeground(Color.magenta);
        l10.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500, 480, 300, 30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 20, 500, 300);
        p1.add(l12);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage();
    }
}
