import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuL4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuL4 frame = new MenuL4();
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
	public MenuL4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuL4.class.getResource("/Image/UNI.png")));
		setTitle("Laboratorio 4");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 677, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoEscojaUna = new JLabel("Menu de opciones laboratorio 4");
		lblBienvenidoEscojaUna.setBackground(new Color(0, 0, 0));
		lblBienvenidoEscojaUna.setForeground(new Color(255, 255, 255));
		lblBienvenidoEscojaUna.setFont(new Font("Stencil", Font.BOLD, 18));
		lblBienvenidoEscojaUna.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoEscojaUna.setBounds(157, 0, 335, 36);
		contentPane.add(lblBienvenidoEscojaUna);
		
		JButton btnConversionPolaca = new JButton("Ejercicio 1");
		btnConversionPolaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnConversionPolacaActionPerformed(e);
			}
		});
		btnConversionPolaca.setBounds(70, 156, 117, 25);
		contentPane.add(btnConversionPolaca);
		
		JButton btnPilas = new JButton("Ejercicio 2");
		btnPilas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnPilasActionPerformed(e);
			}
		});
		btnPilas.setBounds(259, 156, 117, 25);
		contentPane.add(btnPilas);
		
		JButton btnCola = new JButton("Ejercicio 3");
		btnCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnColaActionPerformed(e);
			}
		});
		btnCola.setBounds(465, 156, 117, 25);
		contentPane.add(btnCola);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(534, 344, 117, 25);
		contentPane.add(btnSalir);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		Regresar.setBounds(10, 345, 131, 23);
		contentPane.add(Regresar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuL4.class.getResource("/Image/hi-tech-interface-54-4k.png")));
		lblNewLabel.setBounds(0, 35, 661, 345);
		contentPane.add(lblNewLabel);
	}
	protected void doBtnRegresarActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		LabsMenu r = new LabsMenu();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void doBtnConversionPolacaActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L4E1 c = new L4E1();
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}
	protected void doBtnPilasActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L4E2 p = new L4E2();
		p.setLocationRelativeTo(null);
		p.setVisible(true);
	}
	protected void doBtnColaActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L4E3 fc = new L4E3();
		fc.setLocationRelativeTo(null);
		fc.setVisible(true);
	}
}