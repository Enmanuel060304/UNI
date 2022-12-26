import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class L1E4 extends JFrame {

	private JPanel contentPane;
	private JTextField PedirNombre;
	private JTextField PedirDireccion;
	private JTextField PedirEdad;
	private JTextField PedirAntiguedad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E4 frame = new L1E4();
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
	public L1E4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E4.class.getResource("/Image/UNI.png")));
		setTitle("Compañia Ejercicio#4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(153, 68, 57, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(299, 68, 36, 14);
		contentPane.add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setBounds(385, 68, 36, 14);
		contentPane.add(lblSexo);
		
		JLabel lblAosDeDiciembre = new JLabel("Antiguedad");
		lblAosDeDiciembre.setForeground(Color.WHITE);
		lblAosDeDiciembre.setBounds(513, 68, 72, 14);
		contentPane.add(lblAosDeDiciembre);
		
		PedirNombre = new JTextField();
		PedirNombre.setBounds(57, 65, 86, 20);
		contentPane.add(PedirNombre);
		PedirNombre.setColumns(10);
		
		PedirDireccion = new JTextField();
		PedirDireccion.setColumns(10);
		PedirDireccion.setBounds(200, 65, 86, 20);
		contentPane.add(PedirDireccion);
		
		PedirEdad = new JTextField();
		PedirEdad.setColumns(10);
		PedirEdad.setBounds(329, 65, 46, 20);
		contentPane.add(PedirEdad);
		
		JComboBox PedirSexo = new JComboBox();
		PedirSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		PedirSexo.setBounds(431, 64, 72, 22);
		contentPane.add(PedirSexo);
		
		PedirAntiguedad = new JTextField();
		PedirAntiguedad.setColumns(10);
		PedirAntiguedad.setBounds(580, 65, 46, 20);
		contentPane.add(PedirAntiguedad);
		
		JComboBox OPCIONES = new JComboBox();
		OPCIONES.setModel(new DefaultComboBoxModel(new String[] {"Imprimir todo", "Dar de alta", "Dar de baja", "Modificar años", "Imprimir un empleado"}));
		OPCIONES.setBounds(194, 106, 138, 22);
		contentPane.add(OPCIONES);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(339, 106, 89, 23);
		contentPane.add(Aceptar);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(22, 145, 631, 186);
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
		
		JLabel lblAlmacenarInformacionDe = new JLabel("Almacenar informacion de una compañia");
		lblAlmacenarInformacionDe.setForeground(Color.WHITE);
		lblAlmacenarInformacionDe.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAlmacenarInformacionDe.setBounds(207, 11, 273, 23);
		contentPane.add(lblAlmacenarInformacionDe);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL1 r = new MenuL1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}
