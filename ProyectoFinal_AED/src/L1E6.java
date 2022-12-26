import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class L1E6 extends JFrame {

	private JPanel contentPane;
	private JTextField PedirNombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E6 frame = new L1E6();
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
	public L1E6() {
		setTitle("Compañia Vendedor  Ejercicio#6");
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E6.class.getResource("/Image/UNI.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompaiaConArreglos = new JLabel("Compañia con arreglos ordenados para cada vendedor");
		lblCompaiaConArreglos.setForeground(Color.WHITE);
		lblCompaiaConArreglos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCompaiaConArreglos.setBounds(179, 11, 344, 25);
		contentPane.add(lblCompaiaConArreglos);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(36, 68, 45, 14);
		contentPane.add(lblNombre);
		
		PedirNombre = new JTextField();
		PedirNombre.setColumns(10);
		PedirNombre.setBounds(91, 65, 86, 20);
		contentPane.add(PedirNombre);
		
		JLabel lblTotalDeVentas = new JLabel("Total de ventas");
		lblTotalDeVentas.setForeground(Color.WHITE);
		lblTotalDeVentas.setBounds(199, 68, 75, 14);
		contentPane.add(lblTotalDeVentas);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(284, 65, 55, 20);
		contentPane.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dar de alta un vendedor", "Modificar total de ventas", "Imprimir registros de un vendedor determinado"}));
		comboBox.setBounds(379, 64, 174, 22);
		contentPane.add(comboBox);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(563, 64, 89, 23);
		contentPane.add(Aceptar);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(21, 131, 631, 186);
		contentPane.add(Impresion);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(605, 382, 89, 23);
		contentPane.add(Regresar);
		
		JLabel lblNewLabel_1 = new JLabel("FONDO");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Orlando Guevara\\Documents\\Trabajos UNI\\AED\\Proyecto final\\4857144.jpg"));
		lblNewLabel_1.setBounds(0, 43, 704, 373);
		contentPane.add(lblNewLabel_1);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL1 r = new MenuL1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}
