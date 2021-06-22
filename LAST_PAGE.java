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
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LAST_PAGE extends JFrame {

    private JMenuBar menuBar;
    private JButton CONFIRM_BUTTON;
    private JLabel EHAIL_LABEL;
    private JTextField FROM_FIELD;
    private JLabel FROM_LABEL;
    private JCheckBox GRAB_CB;
    private JLabel INSTRUCTION_LABEL;
    private JTextField KILO_FIELD;
    private JLabel KILO_LABEL;
    private JCheckBox MYCAR_CB;
    private JCheckBox TAXIGO_CB;
    private JTextField TO_FIELD;
    private JLabel TO_LABEL;
    private JCheckBox UBER_CB;

    //Constructor 
    public LAST_PAGE(){

        this.setTitle("LAST_PAGE");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(153,204,255));


        CONFIRM_BUTTON = new JButton();
        CONFIRM_BUTTON.setBounds(172,339,151,35);
        CONFIRM_BUTTON.setBackground(new Color(214,217,223));
        CONFIRM_BUTTON.setForeground(new Color(0,0,0));
        CONFIRM_BUTTON.setEnabled(true);
        CONFIRM_BUTTON.setFont(new Font("sansserif",0,12));
        CONFIRM_BUTTON.setText("CONFIRM");
        CONFIRM_BUTTON.setVisible(true);
        
        //Set action for button click
        //Call defined method
        CONFIRM_BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CONFIRM(evt);
            }
        });

        EHAIL_LABEL = new JLabel();
        EHAIL_LABEL.setBounds(80,191,141,31);
        EHAIL_LABEL.setBackground(new Color(214,217,223));
        EHAIL_LABEL.setForeground(new Color(0,0,0));
        EHAIL_LABEL.setEnabled(true);
        EHAIL_LABEL.setFont(new Font("sansserif",0,12));
        EHAIL_LABEL.setText("E-HAILING SERVICES:");
        EHAIL_LABEL.setVisible(true);

        FROM_FIELD = new JTextField();
        FROM_FIELD.setBounds(268,53,90,30);
        FROM_FIELD.setBackground(new Color(255,255,255));
        FROM_FIELD.setForeground(new Color(0,0,0));
        FROM_FIELD.setEnabled(true);
        FROM_FIELD.setFont(new Font("sansserif",0,12));
        FROM_FIELD.setText("");
        FROM_FIELD.setVisible(true);

        FROM_LABEL = new JLabel();
        FROM_LABEL.setBounds(80,57,90,35);
        FROM_LABEL.setBackground(new Color(214,217,223));
        FROM_LABEL.setForeground(new Color(0,0,0));
        FROM_LABEL.setEnabled(true);
        FROM_LABEL.setFont(new Font("sansserif",0,12));
        FROM_LABEL.setText("FROM:");
        FROM_LABEL.setVisible(true);

        GRAB_CB = new JCheckBox();
        GRAB_CB.setBounds(268,187,90,35);
        GRAB_CB.setBackground(new Color(214,217,223));
        GRAB_CB.setForeground(new Color(0,0,0));
        GRAB_CB.setEnabled(true);
        GRAB_CB.setFont(new Font("sansserif",0,12));
        GRAB_CB.setText("GRAB");
        GRAB_CB.setVisible(true);

        INSTRUCTION_LABEL = new JLabel();
        INSTRUCTION_LABEL.setBounds(181,3,170,33);
        INSTRUCTION_LABEL.setBackground(new Color(214,217,223));
        INSTRUCTION_LABEL.setForeground(new Color(0,0,0));
        INSTRUCTION_LABEL.setEnabled(true);
        INSTRUCTION_LABEL.setFont(new Font("sansserif",0,12));
        INSTRUCTION_LABEL.setText("FILL IN YOUR DETAILS");
        INSTRUCTION_LABEL.setVisible(true);

        KILO_FIELD = new JTextField();
        KILO_FIELD.setBounds(269,143,90,30);
        KILO_FIELD.setBackground(new Color(255,255,255));
        KILO_FIELD.setForeground(new Color(0,0,0));
        KILO_FIELD.setEnabled(true);
        KILO_FIELD.setFont(new Font("sansserif",0,12));
        KILO_FIELD.setText("");
        KILO_FIELD.setVisible(true);

        KILO_LABEL = new JLabel();
        KILO_LABEL.setBounds(79,140,90,35);
        KILO_LABEL.setBackground(new Color(214,217,223));
        KILO_LABEL.setForeground(new Color(0,0,0));
        KILO_LABEL.setEnabled(true);
        KILO_LABEL.setFont(new Font("sansserif",0,12));
        KILO_LABEL.setText("KILOMETERS:");
        KILO_LABEL.setVisible(true);

        MYCAR_CB = new JCheckBox();
        MYCAR_CB.setBounds(268,244,90,35);
        MYCAR_CB.setBackground(new Color(214,217,223));
        MYCAR_CB.setForeground(new Color(0,0,0));
        MYCAR_CB.setEnabled(true);
        MYCAR_CB.setFont(new Font("sansserif",0,12));
        MYCAR_CB.setText("MYCAR");
        MYCAR_CB.setVisible(true);

        TAXIGO_CB = new JCheckBox();
        TAXIGO_CB.setBounds(268,275,90,35);
        TAXIGO_CB.setBackground(new Color(214,217,223));
        TAXIGO_CB.setForeground(new Color(0,0,0));
        TAXIGO_CB.setEnabled(true);
        TAXIGO_CB.setFont(new Font("sansserif",0,12));
        TAXIGO_CB.setText("TAXIGO");
        TAXIGO_CB.setVisible(true);

        TO_FIELD = new JTextField();
        TO_FIELD.setBounds(268,99,90,30);
        TO_FIELD.setBackground(new Color(255,255,255));
        TO_FIELD.setForeground(new Color(0,0,0));
        TO_FIELD.setEnabled(true);
        TO_FIELD.setFont(new Font("sansserif",0,12));
        TO_FIELD.setText("");
        TO_FIELD.setVisible(true);

        TO_LABEL = new JLabel();
        TO_LABEL.setBounds(80,96,90,35);
        TO_LABEL.setBackground(new Color(214,217,223));
        TO_LABEL.setForeground(new Color(0,0,0));
        TO_LABEL.setEnabled(true);
        TO_LABEL.setFont(new Font("sansserif",0,12));
        TO_LABEL.setText("TO:");
        TO_LABEL.setVisible(true);

        UBER_CB = new JCheckBox();
        UBER_CB.setBounds(268,215,90,35);
        UBER_CB.setBackground(new Color(214,217,223));
        UBER_CB.setForeground(new Color(0,0,0));
        UBER_CB.setEnabled(true);
        UBER_CB.setFont(new Font("sansserif",0,12));
        UBER_CB.setText("UBER");
        UBER_CB.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(CONFIRM_BUTTON);
        contentPane.add(EHAIL_LABEL);
        contentPane.add(FROM_FIELD);
        contentPane.add(FROM_LABEL);
        contentPane.add(GRAB_CB);
        contentPane.add(INSTRUCTION_LABEL);
        contentPane.add(KILO_FIELD);
        contentPane.add(KILO_LABEL);
        contentPane.add(MYCAR_CB);
        contentPane.add(TAXIGO_CB);
        contentPane.add(TO_FIELD);
        contentPane.add(TO_LABEL);
        contentPane.add(UBER_CB);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //read checkbox
    public class GetSelectedCheckBox implements ActionListener  
    {  
       
        //Create String that will be use to hold selected JCheckBox text  
        String selectedCheckBox="";
        
        //method actionPerformed that we override because we implement ActionListener  
        public void actionPerformed(ActionEvent event)  
        {  
          GetSelectedCheckBox gsjcb=new GetSelectedCheckBox(); 
          
        //Check first JCheckBox is selected or not  
          if(GRAB_CB.isSelected()){selectedCheckBox=GRAB_CB.getText()+"\n";}  
           
          //Check second JCheckBox is selected or not  
          if(MYCAR_CB.isSelected()) {selectedCheckBox=MYCAR_CB.getText()+"\n";}  
           
          //Check third JCheckBox is selected or not  
          if(TAXIGO_CB.isSelected()) {selectedCheckBox=TAXIGO_CB.getText()+"\n";}  
           
          //Check fourth JCheckBox is selected or not  
          if(UBER_CB.isSelected())  {selectedCheckBox=UBER_CB.getText()+"\n";} 
          
          
        }
        
    }
    
    private static DecimalFormat df2 = new DecimalFormat("#.###");
    
    //Method actionPerformed for btnPrint
    private void CONFIRM (ActionEvent evt) {
                if (FROM_FIELD.getText().equals("") || KILO_FIELD.getText().equals("") || TO_FIELD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in your details!");
            FROM_FIELD.setText("");
            KILO_FIELD.setText("");
            TO_FIELD.setText("");
            
        }
        else {
            String from = FROM_FIELD.getText();
            String kilometer = KILO_FIELD.getText();
            String to = TO_FIELD.getText();
            int x =Integer.parseInt(KILO_FIELD.getText());
        
       try{
                FileWriter outSummary = new FileWriter("Summary.txt");
                PrintWriter ofileSummary = new PrintWriter(outSummary);
                String selectedCheckBox="";
                
                
                ofileSummary.println("\t\t   TRANSPIGO!");
                ofileSummary.println("\t\tUiTM Cawangan Perak");
                ofileSummary.println("\t\t  Kampus Tapah");
                ofileSummary.println("\t\t35400, Tapah Road");
                ofileSummary.println("\t\t     Perak\n");
                ofileSummary.println("\tFrom                   : " + FROM_FIELD.getText());
                ofileSummary.println("\tTo                     : " + TO_FIELD.getText());
                ofileSummary.println("\tDistance               : " + KILO_FIELD.getText() + "KM");
                if(x<=1)
                ofileSummary.println("\tPrice                  : RM " + x*2);
                else if(x>1)
                ofileSummary.println("\tPrice                  : RM " + df2.format(2+((x-1)*1.1)));
                
                
                if(GRAB_CB.isSelected())
                {selectedCheckBox=GRAB_CB.getText()+"\n";
                ofileSummary.println("\tE-Hailing Type         : " + selectedCheckBox);
                }
                
                else if(MYCAR_CB.isSelected())
                {selectedCheckBox=MYCAR_CB.getText()+"\n";
                    ofileSummary.println("\tE-Hailing Type         : " + selectedCheckBox);
                }
                
                else if(TAXIGO_CB.isSelected())
                {selectedCheckBox=TAXIGO_CB.getText()+"\n";
                    ofileSummary.println("\tE-Hailing Type         : " + selectedCheckBox);
                }
                
                else if(UBER_CB.isSelected())
                {selectedCheckBox=UBER_CB.getText()+"\n";
                    ofileSummary.println("\tE-Hailing Type         : " + selectedCheckBox);
                }
                
                ofileSummary.println("\n\n\n\t     Thank you for using our app!");
                
                ofileSummary.close();
            }
        
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            
            if(Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("Summary.txt");
                Desktop.getDesktop().open(myFile);
            }
            catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"error opening file");
            }
    }
}
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



     public static void LAST(){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LAST_PAGE();
            }
        });
    }

}