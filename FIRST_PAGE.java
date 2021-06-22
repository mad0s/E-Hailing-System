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


public class FIRST_PAGE extends JFrame {

	private JMenuBar menuBar;
	private JLabel AYAT1;
	private JLabel AYAT2;
	private JLabel AYAT3;
	private JButton FARE_PAGE1;
	private JButton LOGIN_PAGE1;
	private JLabel NAMA_COMPANY_PAGE1;
	private JPanel PANEL_PAGE1;
	private JButton REGISTER_PAGE1;
	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
        private JLabel PIC;
        private JLabel PIC1;
        private JLabel PIC2;

	//Constructor 
	public FIRST_PAGE(){

		this.setTitle("FIRST_PAGE");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(153,204,255));


		AYAT1 = new JLabel();
		AYAT1.setBounds(120,296,300,20);
		AYAT1.setBackground(new Color(214,217,223));
		AYAT1.setForeground(new Color(0,0,0));
		AYAT1.setEnabled(true);
		AYAT1.setFont(new Font("sansserif",0,12));
		AYAT1.setText("No more wasting time on waiting for your ride!");
		AYAT1.setVisible(true);

		AYAT2 = new JLabel();
		AYAT2.setBounds(120,324,350,20);
		AYAT2.setBackground(new Color(214,217,223));
		AYAT2.setForeground(new Color(0,0,0));
		AYAT2.setEnabled(true);
		AYAT2.setFont(new Font("sansserif",0,12));
		AYAT2.setText("Fastest way to get to your destination! Only by using our app!");
		AYAT2.setVisible(true);

		AYAT3 = new JLabel();
		AYAT3.setBounds(120,345,200,35);
		AYAT3.setBackground(new Color(214,217,223));
		AYAT3.setForeground(new Color(0,0,0));
		AYAT3.setEnabled(true);
		AYAT3.setFont(new Font("sansserif",0,12));
		AYAT3.setText("E-hailing? Transpigo");
		AYAT3.setVisible(true);
		
		image1 = new ImageIcon(getClass().getResource("Grab.png"));
		PIC = new JLabel(image1);
		PIC.setBorder(BorderFactory.createEtchedBorder(1));
		PIC.setBounds(199,15,110,41);
		PIC.setBackground(new Color(214,217,223));
		PIC.setForeground(new Color(0,0,0));
		PIC.setEnabled(true);
		PIC.setFont(new Font("sansserif",0,12));
		PIC.setVisible(true);
		
		image2 = new ImageIcon(getClass().getResource("Taxigo.png"));
		PIC1 = new JLabel(image2);
		PIC1.setBorder(BorderFactory.createEtchedBorder(1));
		PIC1.setBounds(18,63,81,63);
		PIC1.setBackground(new Color(214,217,223));
		PIC1.setForeground(new Color(0,0,0));
		PIC1.setEnabled(true);
		PIC1.setFont(new Font("sansserif",0,12));
		PIC1.setVisible(true);
		
		image3 = new ImageIcon(getClass().getResource("Mycar.png"));
		PIC2 = new JLabel(image3);
		PIC2.setBorder(BorderFactory.createEtchedBorder(1));
		PIC2.setBounds(402,68,81,63);
		PIC2.setBackground(new Color(214,217,223));
		PIC2.setForeground(new Color(0,0,0));
		PIC2.setEnabled(true);
		PIC2.setFont(new Font("sansserif",0,12));
		PIC2.setVisible(true);		

		FARE_PAGE1 = new JButton();
		FARE_PAGE1.setBounds(199,248,100,35);
		FARE_PAGE1.setBackground(new Color(214,217,223));
		FARE_PAGE1.setForeground(new Color(0,0,0));
		FARE_PAGE1.setEnabled(true);
		FARE_PAGE1.setFont(new Font("sansserif",0,12));
		FARE_PAGE1.setText("FARE");
		FARE_PAGE1.setVisible(true);
		//Set action for button click
		//Call defined method
		FARE_PAGE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				OpenFarePage(evt);
			}
		});


		LOGIN_PAGE1 = new JButton();
		LOGIN_PAGE1.setBounds(199,141,100,35);
		LOGIN_PAGE1.setBackground(new Color(214,217,223));
		LOGIN_PAGE1.setForeground(new Color(0,0,0));
		LOGIN_PAGE1.setEnabled(true);
		LOGIN_PAGE1.setFont(new Font("sansserif",0,12));
		LOGIN_PAGE1.setText("LOGIN");
		LOGIN_PAGE1.setVisible(true);
		//Set action for button click
		//Call defined method
		LOGIN_PAGE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				OpenLoginPage(evt);
			}
		});


		NAMA_COMPANY_PAGE1 = new JLabel();
		NAMA_COMPANY_PAGE1.setBounds(7,18,274,41);
		NAMA_COMPANY_PAGE1.setBackground(new Color(214,217,223));
		NAMA_COMPANY_PAGE1.setForeground(new Color(0,0,0));
		NAMA_COMPANY_PAGE1.setEnabled(true);
		NAMA_COMPANY_PAGE1.setFont(new Font("SansSerif",0,44));
		NAMA_COMPANY_PAGE1.setText("TRANSPIGO");
		NAMA_COMPANY_PAGE1.setVisible(true);

		PANEL_PAGE1 = new JPanel(null);
		PANEL_PAGE1.setBorder(BorderFactory.createEtchedBorder(1));
		PANEL_PAGE1.setBounds(114,62,277,69);
		PANEL_PAGE1.setBackground(new Color(214,217,223));
		PANEL_PAGE1.setForeground(new Color(0,0,0));
		PANEL_PAGE1.setEnabled(true);
		PANEL_PAGE1.setFont(new Font("sansserif",0,12));
		PANEL_PAGE1.setVisible(true);

		REGISTER_PAGE1 = new JButton();
		REGISTER_PAGE1.setBounds(199,192,100,35);
		REGISTER_PAGE1.setBackground(new Color(214,217,223));
		REGISTER_PAGE1.setForeground(new Color(0,0,0));
		REGISTER_PAGE1.setEnabled(true);
		REGISTER_PAGE1.setFont(new Font("sansserif",0,12));
		REGISTER_PAGE1.setText("REGISTER");
		REGISTER_PAGE1.setVisible(true);
		//Set action for button click
		//Call defined method
		REGISTER_PAGE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				OpenRegisterPage(evt);
			}
		});


		//adding components to contentPane panel
		contentPane.add(PIC);
		contentPane.add(PIC1);
		contentPane.add(PIC2);
		contentPane.add(AYAT1);
		contentPane.add(AYAT2);
		contentPane.add(AYAT3);
		contentPane.add(FARE_PAGE1);
		contentPane.add(LOGIN_PAGE1);
		PANEL_PAGE1.add(NAMA_COMPANY_PAGE1);
		contentPane.add(PANEL_PAGE1);
		contentPane.add(REGISTER_PAGE1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for FARE_PAGE1
	private void OpenFarePage (ActionEvent evt) {
			FARE_PAGE fare = new FARE_PAGE();
			this.setVisible(false);
			fare.FARE();
	}

	//Method actionPerformed for LOGIN_PAGE1
	private void OpenLoginPage (ActionEvent evt) {
			LOGIN_PAGE login = new LOGIN_PAGE();
			this.setVisible(false);
			login.LOGIN();
	}

	//Method actionPerformed for REGISTER_PAGE1
	private void OpenRegisterPage (ActionEvent evt) {
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



	 public static void FIRST(){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FIRST_PAGE();
			}
		});
	}

}