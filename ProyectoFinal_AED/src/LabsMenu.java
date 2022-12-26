import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

public class LabsMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabsMenu frame = new LabsMenu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LabsMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LabsMenu.class.getResource("/Image/UNI.png")));
		setTitle("Menu de los Laboratorios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(514, 365, 105, 23);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(Salir);
		
		JButton Regresar = new JButton("Presentacion");
		contentPane.add(Regresar);
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(10, 365, 114, 23);
		
		JButton L1 = new JButton("Laboratorio 1");
		contentPane.add(L1);
		L1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL1ActionPerformed(e);
			}
		});
		L1.setBounds(78, 111, 115, 28);
		
		JButton L2 = new JButton("Laboratorio 2");
		L2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL2ActionPerformed(e);
			}
		});
		L2.setBounds(78, 173, 115, 29);
		contentPane.add(L2);
		
		JButton L3 = new JButton("Laboratorio 3");
		L3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL3ActionPerformed(e);
			}
		});
		L3.setBounds(78, 240, 115, 28);
		contentPane.add(L3);
		
		JButton L4 = new JButton("Laboratorio 4");
		L4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL4ActionPerformed(e);
			}
		});
		L4.setBounds(415, 111, 115, 28);
		contentPane.add(L4);
		
		JButton L5 = new JButton("Laboratorio 5");
		L5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL5ActionPerformed(e);
			}
		});
		contentPane.add(L5);
		L5.setBounds(415, 173, 115, 28);
		
		JButton L6 = new JButton("Laboratorio 6");
		L6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuL6ActionPerformed(e);
			}
		});
		contentPane.add(L6);
		L6.setBounds(415, 240, 115, 28);
		
		JLabel lblNewLabel = new JLabel("Menu principal de los Laboratorios");
		lblNewLabel.setBounds(127, 8, 364, 22);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 18));
		
		JLabel FondoMe = new JLabel("New label");
		FondoMe.setBounds(0, 31, 629, 368);
		FondoMe.setIcon(new ImageIcon(LabsMenu.class.getResource("/Image/Presentacion.jpg")));
		contentPane.add(FondoMe);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		Presentacion r = new Presentacion();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL1ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL1 r = new MenuL1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL2ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L2E1 r = new L2E1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL3ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL3 r = new MenuL3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL4ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL4 r = new MenuL4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL5ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL5 r = new MenuL5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnMenuL6ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		Vistaa r = new Vistaa();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}
