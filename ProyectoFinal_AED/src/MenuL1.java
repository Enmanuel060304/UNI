import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuL1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuL1 frame = new MenuL1();
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
	public MenuL1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuL1.class.getResource("/Image/UNI.png")));
		setTitle("Laboratorio 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeOpciones_1 = new JLabel("Menu de opciones laboratorio 1");
		lblMenuDeOpciones_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuDeOpciones_1.setForeground(Color.WHITE);
		lblMenuDeOpciones_1.setFont(new Font("Stencil", Font.BOLD, 18));
		lblMenuDeOpciones_1.setBackground(Color.BLACK);
		lblMenuDeOpciones_1.setBounds(151, 8, 335, 36);
		contentPane.add(lblMenuDeOpciones_1);
		
		JButton btnNewButton = new JButton("Ejercicio 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer1ActionPerformed(e);
			}
		});
		btnNewButton.setBounds(86, 136, 107, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEjercicio = new JButton("Ejercicio 2");
		btnEjercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer2ActionPerformed(e);
			}
		});
		btnEjercicio.setBounds(86, 195, 107, 23);
		contentPane.add(btnEjercicio);
		
		JButton btnEjercicio_1 = new JButton("Ejercicio 3");
		btnEjercicio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer3ActionPerformed(e);
			}
		});
		btnEjercicio_1.setBounds(280, 136, 107, 23);
		contentPane.add(btnEjercicio_1);
		
		JButton btnEjercicio_2 = new JButton("Ejercicio 4");
		btnEjercicio_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer4ActionPerformed(e);
			}
		});
		btnEjercicio_2.setBounds(280, 195, 107, 23);
		contentPane.add(btnEjercicio_2);
		
		JButton btnEjercicio_3 = new JButton("Ejercicio 5");
		btnEjercicio_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer5ActionPerformed(e);
			}
		});
		btnEjercicio_3.setBounds(468, 136, 107, 23);
		contentPane.add(btnEjercicio_3);
		
		JButton btnEjercicio_4 = new JButton("Ejercicio 6");
		btnEjercicio_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer6ActionPerformed(e);
			}
		});
		btnEjercicio_4.setBounds(468, 195, 107, 23);
		contentPane.add(btnEjercicio_4);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		Regresar.setBounds(10, 344, 107, 23);
		contentPane.add(Regresar);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(559, 344, 89, 23);
		contentPane.add(Salir);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuL1.class.getResource("/Image/istockphoto-1356933529-170667a.jpg")));
		lblNewLabel.setBounds(0, 47, 658, 331);
		contentPane.add(lblNewLabel);
	}
	protected void doBtnRegresarActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		LabsMenu r = new LabsMenu();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer1ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E1 r = new L1E1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer2ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E2 r = new L1E2();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer3ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E3 r = new L1E3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer4ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E4 r = new L1E4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer5ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E5 r = new L1E5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer6ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L1E6 r = new L1E6();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}
