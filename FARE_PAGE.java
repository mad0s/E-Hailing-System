/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class FARE_PAGE extends JFrame {

    private JMenuBar menuBar;
    private JButton BACK_BUTTON;
    private JLabel label2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPanel panel2;
    private JPanel panel3;

    //Constructor 
    public FARE_PAGE(){

        this.setTitle("FARE_PAGE");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(153,204,255));


        BACK_BUTTON = new JButton();
        BACK_BUTTON.setBounds(408,366,82,24);
        BACK_BUTTON.setBackground(new Color(214,217,223));
        BACK_BUTTON.setForeground(new Color(0,0,0));
        BACK_BUTTON.setEnabled(true);
        BACK_BUTTON.setFont(new Font("sansserif",0,12));
        BACK_BUTTON.setText("BACK");
        BACK_BUTTON.setVisible(true);
        BACK_BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BACK_BUTTON(evt);
            }
        });
        
        label2 = new JLabel();
        label2.setBounds(53,317,427,50);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("FARE MAY VARIED ACCORDING TO E-HAILING SERVICE PROVIDER.");
        label2.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(25,17,116,37);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("SansSerif",0,36));
        label4.setText("FARE");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(5,3,200,39);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("First 1KM: RM2.00");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(5,48,225,39);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Next KM: RM1.10/KM");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(5,86,299,39);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("Cancellation Fee: RM5.00");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(5,123,280,39);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("Late Arrival Fee: RM5.00");
        label8.setVisible(true);

        panel2 = new JPanel(null);
        panel2.setBorder(BorderFactory.createEtchedBorder(1));
        panel2.setBounds(167,34,162,73);
        panel2.setBackground(new Color(214,217,223));
        panel2.setForeground(new Color(0,0,0));
        panel2.setEnabled(true);
        panel2.setFont(new Font("sansserif",0,12));
        panel2.setVisible(true);

        panel3 = new JPanel(null);
        panel3.setBorder(BorderFactory.createEtchedBorder(1));
        panel3.setBounds(111,126,285,182);
        panel3.setBackground(new Color(214,217,223));
        panel3.setForeground(new Color(0,0,0));
        panel3.setEnabled(true);
        panel3.setFont(new Font("sansserif",0,12));
        panel3.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(BACK_BUTTON);
        contentPane.add(label2);
        panel2.add(label4);
        panel3.add(label5);
        panel3.add(label6);
        panel3.add(label7);
        panel3.add(label8);
        contentPane.add(panel2);
        contentPane.add(panel3);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    private void BACK_BUTTON (ActionEvent evt) {
			FIRST_PAGE first = new FIRST_PAGE();
			this.setVisible(false);
			first.FIRST();        
    }        
    
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void FARE(){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FARE_PAGE();
            }
        });
    }

}