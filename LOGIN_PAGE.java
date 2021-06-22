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
import java.io.*;
import java.util.Scanner;


public class LOGIN_PAGE extends JFrame {

    private JMenuBar menuBar;
    private JButton LOGIN_BUTTON;
    private JLabel LOGINtoACCOUNT;
    private JLabel NO_ACCOUNT_LABEL;
    private JLabel PASSWORD_LABEL;
    private JButton SIGN_UP_BUTTON;
    public JTextField USERNAME;
    private JLabel USERNAME_LABEL;
    private JPasswordField USERPASSWORD;
    private JLabel WELCOME_LABEL;
    private JPanel panel1;

    //Constructor 
    public LOGIN_PAGE(){

        this.setTitle("LOGIN_PAGE");
        this.setSize(580,590);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(580,590));
        contentPane.setBackground(new Color(153,204,255));



        LOGIN_BUTTON = new JButton();
        LOGIN_BUTTON.setBounds(177,336,240,40);
        LOGIN_BUTTON.setBackground(new Color(214,217,223));
        LOGIN_BUTTON.setForeground(new Color(0,0,0));
        LOGIN_BUTTON.setEnabled(true);
        LOGIN_BUTTON.setFont(new Font("sansserif",0,12));
        LOGIN_BUTTON.setText("LOGIN");
        LOGIN_BUTTON.setVisible(true);
        LOGIN_BUTTON.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) 
            {
                LOGIN_BUTTON(evt);
            }
        });

        LOGINtoACCOUNT = new JLabel();
        LOGINtoACCOUNT.setBounds(48,13,276,39);
        LOGINtoACCOUNT.setBackground(new Color(214,217,223));
        LOGINtoACCOUNT.setForeground(new Color(0,0,0));
        LOGINtoACCOUNT.setEnabled(true);
        LOGINtoACCOUNT.setFont(new Font("SansSerif",0,20));
        LOGINtoACCOUNT.setText("LOG IN TO YOUR ACCOUNT");
        LOGINtoACCOUNT.setVisible(true);

        NO_ACCOUNT_LABEL = new JLabel();
        NO_ACCOUNT_LABEL.setBounds(168,532,193,39);
        NO_ACCOUNT_LABEL.setBackground(new Color(214,217,223));
        NO_ACCOUNT_LABEL.setForeground(new Color(0,0,0));
        NO_ACCOUNT_LABEL.setEnabled(true);
        NO_ACCOUNT_LABEL.setFont(new Font("sansserif",0,12));
        NO_ACCOUNT_LABEL.setText("DON'T HAVE AN ACCOUNT?");
        NO_ACCOUNT_LABEL.setVisible(true);

        PASSWORD_LABEL = new JLabel();
        PASSWORD_LABEL.setBounds(45,279,90,35);
        PASSWORD_LABEL.setBackground(new Color(214,217,223));
        PASSWORD_LABEL.setForeground(new Color(0,0,0));
        PASSWORD_LABEL.setEnabled(true);
        PASSWORD_LABEL.setFont(new Font("SansSerif",0,14));
        PASSWORD_LABEL.setText("PASSWORD");
        PASSWORD_LABEL.setVisible(true);

        SIGN_UP_BUTTON = new JButton();
        SIGN_UP_BUTTON.setBounds(337,534,90,35);
        SIGN_UP_BUTTON.setBackground(new Color(214,217,223));
        SIGN_UP_BUTTON.setForeground(new Color(0,0,0));
        SIGN_UP_BUTTON.setEnabled(true);
        SIGN_UP_BUTTON.setFont(new Font("sansserif",0,12));
        SIGN_UP_BUTTON.setText("SIGN UP");
        SIGN_UP_BUTTON.setVisible(true);
        SIGN_UP_BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)  {
                SIGN_UP_BUTTON(evt);
            }
        });        

        USERNAME = new JTextField();
        USERNAME.setBounds(177,220,240,40);
        USERNAME.setBackground(new Color(255,255,255));
        USERNAME.setForeground(new Color(0,0,0));
        USERNAME.setEnabled(true);
        USERNAME.setFont(new Font("sansserif",0,12));
        USERNAME.setText("");
        USERNAME.setVisible(true);

        USERNAME_LABEL = new JLabel();
        USERNAME_LABEL.setBounds(45,222,90,35);
        USERNAME_LABEL.setBackground(new Color(214,217,223));
        USERNAME_LABEL.setForeground(new Color(0,0,0));
        USERNAME_LABEL.setEnabled(true);
        USERNAME_LABEL.setFont(new Font("SansSerif",0,14));
        USERNAME_LABEL.setText("USERNAME");
        USERNAME_LABEL.setVisible(true);

        USERPASSWORD = new JPasswordField();
        USERPASSWORD.setBounds(177,277,240,40);
        USERPASSWORD.setBackground(new Color(214,217,223));
        USERPASSWORD.setForeground(new Color(0,0,0));
        USERPASSWORD.setEnabled(true);
        USERPASSWORD.setFont(new Font("sansserif",0,12));
        USERPASSWORD.setVisible(true);

        WELCOME_LABEL = new JLabel();
        WELCOME_LABEL.setBounds(195,7,228,34);
        WELCOME_LABEL.setBackground(new Color(214,217,223));
        WELCOME_LABEL.setForeground(new Color(0,0,0));
        WELCOME_LABEL.setEnabled(true);
        WELCOME_LABEL.setFont(new Font("sansserif",0,12));
        WELCOME_LABEL.setText("WELCOME BACK! WE MISSED YOU!");
        WELCOME_LABEL.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(107,92,371,68);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(LOGIN_BUTTON);
        panel1.add(LOGINtoACCOUNT);
        contentPane.add(NO_ACCOUNT_LABEL);
        contentPane.add(PASSWORD_LABEL);
        contentPane.add(SIGN_UP_BUTTON);
        contentPane.add(USERNAME);
        contentPane.add(USERNAME_LABEL);
        contentPane.add(USERPASSWORD);
        contentPane.add(WELCOME_LABEL);
        contentPane.add(panel1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
 private void LOGIN_BUTTON (ActionEvent evt) {
        int i=0,j=0;
        String[] user={"1","2","3","4","5"};
        String[] pass={"1","2","3","4","5"};
        try{
            File inUser= new File("username.txt");
            Scanner inFile = new Scanner(inUser);

            while(inFile.hasNext())
            {
                String line= inFile.nextLine();
                user[i]=line;
                i++;
            }
            File inPass = new File("Password.txt");
            Scanner infile1= new Scanner(inPass);
            
            while(infile1.hasNext())
            {
                String line = infile1.nextLine();
                pass[j]= line;
                j++;
            }
            inFile.close();
            infile1.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"invalid");
        }
        
        int size=i+1;
        boolean found=false;
        
        for(int a=0;a<5;a++)
        {
            if(USERNAME.getText().equals(user[a]))
                if(USERPASSWORD.getText().equals(pass[a]))
                found=true;
                
                else
                    found=false;
        }
        
        if(found)
        {
            JOptionPane.showMessageDialog(null,"Access Granted");
            LAST_PAGE last = new LAST_PAGE();
            this.setVisible(false);
            last.LAST(); 
        }
        else
                    JOptionPane.showMessageDialog(null,"Access Denied");

    }
   
    
    
    private void SIGN_UP_BUTTON (ActionEvent evt) {
            REGISTERPAGE signup = new REGISTERPAGE();
            this.setVisible(false);
            signup.REGISTER();        
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



     public static void LOGIN(){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_PAGE();
            }
        });
    }

}