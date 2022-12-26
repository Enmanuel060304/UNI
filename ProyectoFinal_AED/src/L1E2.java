import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class L1E2 extends JFrame {

	private JPanel contentPane;
	private JTextField PedirNombre;
	private JTextField PedirTelefono;
	private JTextField PedirSaldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E2 frame = new L1E2();
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
	public L1E2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E2.class.getResource("/Image/UNI.png")));
		setTitle("Empresa Ejercicio#2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setForeground(Color.WHITE);
		Nombre.setBounds(10, 59, 58, 14);
		contentPane.add(Nombre);
		
		PedirNombre = new JTextField();
		PedirNombre.setBounds(76, 56, 86, 20);
		contentPane.add(PedirNombre);
		PedirNombre.setColumns(10);
		
		JLabel Telefono = new JLabel("Telefono");
		Telefono.setForeground(Color.WHITE);
		Telefono.setBounds(172, 59, 58, 14);
		contentPane.add(Telefono);
		
		PedirTelefono = new JTextField();
		PedirTelefono.setColumns(10);
		PedirTelefono.setBounds(232, 56, 86, 20);
		contentPane.add(PedirTelefono);
		
		PedirSaldo = new JTextField();
		PedirSaldo.setColumns(10);
		PedirSaldo.setBounds(369, 56, 86, 20);
		contentPane.add(PedirSaldo);
		
		JLabel Saldo = new JLabel("Saldo");
		Saldo.setForeground(Color.WHITE);
		Saldo.setBounds(326, 59, 48, 14);
		contentPane.add(Saldo);
		
		JLabel lblMoroso = new JLabel("Moroso");
		lblMoroso.setForeground(Color.WHITE);
		lblMoroso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMoroso.setBounds(465, 59, 58, 14);
		contentPane.add(lblMoroso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
		comboBox.setBounds(513, 55, 58, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dar de alta a un cliente", "Modificar el estado moroso del cliente", "Dar de baja a un cliente", "Listar la informacion completa de un cliente", "Imprimir todo"}));
		comboBox_1.setBounds(160, 98, 149, 22);
		contentPane.add(comboBox_1);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(331, 98, 89, 23);
		contentPane.add(Aceptar);
		
		JLabel lblNewLabel = new JLabel("Registro de una empresa para los clientes");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(205, 11, 273, 23);
		contentPane.add(lblNewLabel);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(34, 154, 631, 186);
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
		lblNewLabel_1.setBounds(0, 45, 704, 373);
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
