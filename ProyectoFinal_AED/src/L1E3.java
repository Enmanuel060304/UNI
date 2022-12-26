import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class L1E3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField PedirEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E3 frame = new L1E3();
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
	public L1E3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E3.class.getResource("/Image/UNI.png")));
		setTitle("Almacenar personal Ejercicio#3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 66, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setBounds(162, 66, 46, 14);
		contentPane.add(lblSexo);
		
		PedirEdad = new JTextField();
		PedirEdad.setColumns(10);
		PedirEdad.setBounds(359, 63, 86, 20);
		contentPane.add(PedirEdad);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setBounds(303, 66, 46, 14);
		contentPane.add(lblEdad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBox.setBounds(202, 62, 91, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dar de alta", "Dar de baja", "Actualizar la edad", "Imprimir de los varones", "Imprimir todo"}));
		comboBox_1.setBounds(455, 62, 138, 22);
		contentPane.add(comboBox_1);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(477, 95, 89, 23);
		contentPane.add(Aceptar);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(28, 143, 631, 186);
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
		
		JLabel lblDepartamentoDePersonal = new JLabel("Departamento de personal de una empresa");
		lblDepartamentoDePersonal.setForeground(Color.WHITE);
		lblDepartamentoDePersonal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartamentoDePersonal.setBounds(202, 11, 273, 23);
		contentPane.add(lblDepartamentoDePersonal);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL1 r = new MenuL1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}
