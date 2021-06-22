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


public class REGISTERPAGE extends JFrame {

    private JMenuBar menuBar;
    private JLabel COME_JOIN_US_LABEL;
    private JTextField EMAIL_FIELD;
    private JLabel EMAIL_LABEL;
    private JButton LOG_IN;
    private JLabel LOG_IN_BUTTON;
    private JTextField NAME_FIELD;
    private JLabel NAME_LABEL;
    private JPasswordField PASSWORD_FIELD;
    private JLabel PASSWORD_LABEL;
    private JButton SIGN_UP_BUTTON;
    private JTextField USERNAME_FIELD;
    private JLabel USERNAME_LABEL;
    private JLabel WELCOME_LABEL;
    private JPanel panel1;
    private JComboBox GENDER_COMBOBOX;
    private JLabel GENDER_LABEL;
    
    private String genderChoose;
    public void setGender (String genderChoose) {this.genderChoose = genderChoose;}
    public String getGender() {return genderChoose;}

    //Constructor 
    public REGISTERPAGE(){

        this.setTitle("REGISTERPAGE");
        this.setSize(580,590);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(580,590));
        contentPane.setBackground(new Color(153,204,255));


        COME_JOIN_US_LABEL = new JLabel();
        COME_JOIN_US_LABEL.setBounds(25,12,241,29);
        COME_JOIN_US_LABEL.setBackground(new Color(214,217,223));
        COME_JOIN_US_LABEL.setForeground(new Color(0,0,0));
        COME_JOIN_US_LABEL.setEnabled(true);
        COME_JOIN_US_LABEL.setFont(new Font("SansSerif",0,18));
        COME_JOIN_US_LABEL.setText("COME AND JOIN US NOW!");
        COME_JOIN_US_LABEL.setVisible(true);

        EMAIL_FIELD = new JTextField();
        EMAIL_FIELD.setBounds(250,290,240,40);
        EMAIL_FIELD.setBackground(new Color(255,255,255));
        EMAIL_FIELD.setForeground(new Color(0,0,0));
        EMAIL_FIELD.setEnabled(true);
        EMAIL_FIELD.setFont(new Font("sansserif",0,12));
        EMAIL_FIELD.setText("");
        EMAIL_FIELD.setVisible(true);

        EMAIL_LABEL = new JLabel();
        EMAIL_LABEL.setBounds(80,295,90,35);
        EMAIL_LABEL.setBackground(new Color(214,217,223));
        EMAIL_LABEL.setForeground(new Color(0,0,0));
        EMAIL_LABEL.setEnabled(true);
        EMAIL_LABEL.setFont(new Font("sansserif",0,12));
        EMAIL_LABEL.setText("EMAIL");
        EMAIL_LABEL.setVisible(true);

        LOG_IN = new JButton();
        LOG_IN.setBounds(335,538,90,35);
        LOG_IN.setBackground(new Color(214,217,223));
        LOG_IN.setForeground(new Color(0,0,0));
        LOG_IN.setEnabled(true);
        LOG_IN.setFont(new Font("sansserif",0,12));
        LOG_IN.setText("LOG IN ");
        LOG_IN.setVisible(true);
        LOG_IN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LOG_IN(evt);
            }
        });     

        LOG_IN_BUTTON = new JLabel();
        LOG_IN_BUTTON.setBounds(145,541,207,31);
        LOG_IN_BUTTON.setBackground(new Color(214,217,223));
        LOG_IN_BUTTON.setForeground(new Color(0,0,0));
        LOG_IN_BUTTON.setEnabled(true);
        LOG_IN_BUTTON.setFont(new Font("sansserif",0,12));
        LOG_IN_BUTTON.setText("ALREADY HAVE AN ACCOUNT?");
        LOG_IN_BUTTON.setVisible(true);
        

        NAME_FIELD = new JTextField();
        NAME_FIELD.setBounds(250,190,240,40);
        NAME_FIELD.setBackground(new Color(255,255,255));
        NAME_FIELD.setForeground(new Color(0,0,0));
        NAME_FIELD.setEnabled(true);
        NAME_FIELD.setFont(new Font("sansserif",0,12));
        NAME_FIELD.setText("");
        NAME_FIELD.setVisible(true);

        NAME_LABEL = new JLabel();
        NAME_LABEL.setBounds(80,195,90,35);
        NAME_LABEL.setBackground(new Color(214,217,223));
        NAME_LABEL.setForeground(new Color(0,0,0));
        NAME_LABEL.setEnabled(true);
        NAME_LABEL.setFont(new Font("sansserif",0,12));
        NAME_LABEL.setText("FULL NAME");
        NAME_LABEL.setVisible(true);

        PASSWORD_FIELD = new JPasswordField();
        PASSWORD_FIELD.setBounds(250,340,240,40);
        PASSWORD_FIELD.setBackground(new Color(214,217,223));
        PASSWORD_FIELD.setForeground(new Color(0,0,0));
        PASSWORD_FIELD.setEnabled(true);
        PASSWORD_FIELD.setFont(new Font("sansserif",0,12));
        PASSWORD_FIELD.setVisible(true);

        PASSWORD_LABEL = new JLabel();
        PASSWORD_LABEL.setBounds(80,345,90,35);
        PASSWORD_LABEL.setBackground(new Color(214,217,223));
        PASSWORD_LABEL.setForeground(new Color(0,0,0));
        PASSWORD_LABEL.setEnabled(true);
        PASSWORD_LABEL.setFont(new Font("sansserif",0,12));
        PASSWORD_LABEL.setText("PASSWORD");
        PASSWORD_LABEL.setVisible(true);

        SIGN_UP_BUTTON = new JButton();
        SIGN_UP_BUTTON.setBounds(76,469,415,43);
        SIGN_UP_BUTTON.setBackground(new Color(214,217,223));
        SIGN_UP_BUTTON.setForeground(new Color(0,0,0));
        SIGN_UP_BUTTON.setEnabled(true);
        SIGN_UP_BUTTON.setFont(new Font("sansserif",0,12));
        SIGN_UP_BUTTON.setText("SIGN UP");
        SIGN_UP_BUTTON.setVisible(true);
        SIGN_UP_BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SIGN_UP_BUTTON(evt);
            }
        });     

        USERNAME_FIELD = new JTextField();
        USERNAME_FIELD.setBounds(250,240,240,40);
        USERNAME_FIELD.setBackground(new Color(255,255,255));
        USERNAME_FIELD.setForeground(new Color(0,0,0));
        USERNAME_FIELD.setEnabled(true);
        USERNAME_FIELD.setFont(new Font("sansserif",0,12));
        USERNAME_FIELD.setText("");
        USERNAME_FIELD.setVisible(true);

        USERNAME_LABEL = new JLabel();
        USERNAME_LABEL.setBounds(80,245,90,35);
        USERNAME_LABEL.setBackground(new Color(214,217,223));
        USERNAME_LABEL.setForeground(new Color(0,0,0));
        USERNAME_LABEL.setEnabled(true);
        USERNAME_LABEL.setFont(new Font("sansserif",0,12));
        USERNAME_LABEL.setText("USERNAME ");
        USERNAME_LABEL.setVisible(true);

        WELCOME_LABEL = new JLabel();
        WELCOME_LABEL.setBounds(177,-10,308,63);
        WELCOME_LABEL.setBackground(new Color(214,217,223));
        WELCOME_LABEL.setForeground(new Color(0,0,0));
        WELCOME_LABEL.setEnabled(true);
        WELCOME_LABEL.setFont(new Font("SansSerif",0,15));
        WELCOME_LABEL.setText("HI, WELCOME TO TRANSPIGO!");
        WELCOME_LABEL.setVisible(true);
        
        GENDER_COMBOBOX = new JComboBox();
        GENDER_COMBOBOX.setBounds(250,401,90,35);
        GENDER_COMBOBOX.setBackground(new Color(214,217,223));
        GENDER_COMBOBOX.setForeground(new Color(0,0,0));
        GENDER_COMBOBOX.setEnabled(true);
        GENDER_COMBOBOX.setFont(new Font("sansserif",0,12));
        GENDER_COMBOBOX.setVisible(true);
        
        GENDER_COMBOBOX.addItem("");
                GENDER_COMBOBOX.addItem("MALE");
                GENDER_COMBOBOX.addItem("FEMALE");
                
                GENDER_COMBOBOX.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                GENDER(evt);
            }
        });

        GENDER_LABEL = new JLabel();
        GENDER_LABEL.setBounds(80,395,90,35);
        GENDER_LABEL.setBackground(new Color(214,217,223));
        GENDER_LABEL.setForeground(new Color(0,0,0));
        GENDER_LABEL.setEnabled(true);
        GENDER_LABEL.setFont(new Font("sansserif",0,12));
        GENDER_LABEL.setText("GENDER");
        GENDER_LABEL.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(150,85,285,56);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        //adding components to contentPane panel
        panel1.add(COME_JOIN_US_LABEL);
        contentPane.add(EMAIL_FIELD);
        contentPane.add(EMAIL_LABEL);
        contentPane.add(LOG_IN);
        contentPane.add(LOG_IN_BUTTON);
        contentPane.add(NAME_FIELD);
        contentPane.add(NAME_LABEL);
        contentPane.add(PASSWORD_FIELD);
        contentPane.add(PASSWORD_LABEL);
        contentPane.add(SIGN_UP_BUTTON);
        contentPane.add(USERNAME_FIELD);
        contentPane.add(USERNAME_LABEL);
        contentPane.add(WELCOME_LABEL);
        contentPane.add(panel1);
        contentPane.add(GENDER_COMBOBOX);
        contentPane.add(GENDER_LABEL);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    private void SIGN_UP_BUTTON (ActionEvent evt) {
            if (USERNAME_FIELD.getText().equals("") || PASSWORD_FIELD.getText().equals("") || EMAIL_FIELD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in your username and password!");
            USERNAME_FIELD.setText("");
            PASSWORD_FIELD.setText("");
            NAME_FIELD.setText("");
            EMAIL_FIELD.setText("");
        }
        else {
            String strUser = "";
            String strPass = "";
            String strNama = "";
            String strEmails= "";
            String strGend= "";
            
            String username = USERNAME_FIELD.getText();
            String password = PASSWORD_FIELD.getText();
            String name = NAME_FIELD.getText();
            String email = EMAIL_FIELD.getText();
            String gender = getGender();
        
            try{
                File infile1 = new File("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Username.txt");
                Scanner user = new Scanner(infile1);
              
                while (user.hasNext()) {
                    String line = user.nextLine();
                    strUser = strUser + "\n" + line;
                }
                
                File infile2 = new File("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Password.txt");
                Scanner pass = new Scanner(infile2);
              
                while (pass.hasNext()) {
                    String line = pass.nextLine();
                    strPass = strPass + "\n" + line;
                }
                
                File infile3 = new File("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Name.txt");
                Scanner nama = new Scanner(infile3);
              
                while (nama.hasNext()) {
                    String line = nama.nextLine();
                    strNama = strNama + "\n" + line;
                }
                
                File infile4 = new File("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Email.txt");
                Scanner emails = new Scanner(infile4);
              
                while (emails.hasNext()) {
                    String line = emails.nextLine();
                    strEmails = strEmails + "\n" + line;
                }
                
                File infile5 = new File("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Gender.txt");
                Scanner gend = new Scanner(infile5);
              
                while (gend.hasNext()) {
                    String line = gend.nextLine();
                    strGend = strGend + "\n" + line;
                }
                
                strUser = strUser + "\n" + username;
                strPass = strPass + "\n" + password;
                strNama = strNama + "\n" + name;
                strEmails = strEmails + "\n" + email;
                strGend = strGend + "\n" + gender;
                
                user.close();
                pass.close();
                nama.close();
                emails.close();
                gend.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"error opening file");
            }
           
            try{
                FileWriter outUser = new FileWriter("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Username.txt");
                PrintWriter oUser = new PrintWriter(outUser);
        
                FileWriter outPass = new FileWriter("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Password.txt");
                PrintWriter oPass = new PrintWriter(outPass);
                
                FileWriter outNama = new FileWriter("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Name.txt");
                PrintWriter oNama = new PrintWriter(outNama);
                
                FileWriter outEmails = new FileWriter("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Email.txt");
                PrintWriter oEmails = new PrintWriter(outEmails);
                
                FileWriter outGend = new FileWriter("C:\\Users\\Muhammad\\Desktop\\(FARIS)PR0JEK B0H\\register\\Gender.txt");
                PrintWriter oGend = new PrintWriter(outGend);
                
                oUser.print(strUser);
                oPass.print(strPass);
                oNama.print(strNama);
                oEmails.print(strEmails);
                oGend.print(strGend);
                
                oUser.close();
                oPass.close();
                oNama.close();
                oEmails.close();
                oGend.close();
            }
        
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            
            JOptionPane.showMessageDialog(null, "Account Created!");
            LOGIN_PAGE menu = new LOGIN_PAGE();
            this.setVisible(false);
        }
    }   
    
    private void LOG_IN (ActionEvent evt) {
            LOGIN_PAGE login = new LOGIN_PAGE();
            this.setVisible(false);
            login.LOGIN();
    }
    
    //Method actionPerformed for cbMember
	private void GENDER (ActionEvent evt) {
	    String SelectedItem = GENDER_COMBOBOX.getSelectedItem().toString();
            setGender(SelectedItem); 
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



     public static void REGISTER(){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new REGISTERPAGE();
            }
        });
    }

}