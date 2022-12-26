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

public class L1E5 extends JFrame {

	private JPanel contentPane;
	private JTextField PedirUbicacion;
	private JTextField PedirArea;
	private JTextField PedirPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E5 frame = new L1E5();
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
	public L1E5() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E5.class.getResource("/Image/UNI.png")));
		setTitle("Inmobiliaria Ejercicio#5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInmobiliariaAlmacen = new JLabel("Inmobiliaria / \r\nAlmacen de registros de departamentos");
		lblInmobiliariaAlmacen.setForeground(Color.WHITE);
		lblInmobiliariaAlmacen.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInmobiliariaAlmacen.setBounds(173, 11, 344, 25);
		contentPane.add(lblInmobiliariaAlmacen);
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setForeground(Color.WHITE);
		lblUbicacion.setBounds(10, 68, 45, 14);
		contentPane.add(lblUbicacion);
		
		PedirUbicacion = new JTextField();
		PedirUbicacion.setColumns(10);
		PedirUbicacion.setBounds(65, 65, 86, 20);
		contentPane.add(PedirUbicacion);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados");
		lblMetrosCuadrados.setForeground(Color.WHITE);
		lblMetrosCuadrados.setBounds(164, 68, 86, 14);
		contentPane.add(lblMetrosCuadrados);
		
		PedirArea = new JTextField();
		PedirArea.setColumns(10);
		PedirArea.setBounds(260, 65, 86, 20);
		contentPane.add(PedirArea);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setBounds(356, 68, 45, 14);
		contentPane.add(lblPrecio);
		
		PedirPrecio = new JTextField();
		PedirPrecio.setColumns(10);
		PedirPrecio.setBounds(399, 65, 67, 20);
		contentPane.add(PedirPrecio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dar de alta", "Dar de baja sin renovacion", "Cambiar precio segun area", "Imprimir departamento especifico", "Imprimir todo"}));
		comboBox.setBounds(476, 64, 199, 22);
		contentPane.add(comboBox);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(506, 97, 89, 23);
		contentPane.add(Aceptar);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(24, 151, 631, 186);
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
