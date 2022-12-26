import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class L5E1 extends JFrame {

	private JPanel contentPane;
	private JTextField LeerNombre;
	private JTextField LeerCarrera;
	private JTextField LeerCarnet;
	ArrayList<Alumnos> listado = new ArrayList<Alumnos>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L5E1 frame = new L5E1();
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
	public L5E1() {
		setTitle("Ejercicio #1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listado de estudiantes");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 16));
		lblNewLabel.setBounds(194, 8, 218, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 54, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Carrera");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(206, 55, 57, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Carnet");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(386, 55, 57, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		LeerNombre = new JTextField();
		LeerNombre.setBounds(77, 52, 86, 20);
		contentPane.add(LeerNombre);
		LeerNombre.setColumns(10);
		
		LeerCarrera = new JTextField();
		LeerCarrera.setBounds(262, 52, 86, 20);
		contentPane.add(LeerCarrera);
		LeerCarrera.setColumns(10);
		
		LeerCarnet = new JTextField();
		LeerCarnet.setBounds(439, 52, 86, 20);
		contentPane.add(LeerCarnet);
		LeerCarnet.setColumns(10);
		
		JTextArea Imprimir = new JTextArea();
		Imprimir.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Imprimir.setBounds(41, 152, 505, 149);
		contentPane.add(Imprimir);
		
		JButton Ingresar = new JButton("Agregar");
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = LeerNombre.getText();
				String carrera = LeerCarrera.getText();
				String carnet = LeerCarnet.getText();
				listado.add(new Alumnos(nombre, carrera, carnet));
				
				String salida = "";
				salida += Impresion(listado);
		        Imprimir.setText(String.valueOf(salida));
				
			}
			public static String Impresion(List<Alumnos> listado)
		    {
		        String resultado = "";
		        for (Alumnos alumno : listado) {
		            resultado += alumno.getNombre() + "                     " + alumno.getCarrera() + "                         " + alumno.getCarnet() + " \n";
		        }
		        return resultado;
		    }
				
		});
		Ingresar.setBounds(183, 92, 89, 23);
		contentPane.add(Ingresar);
		
		
		
		JButton Menu = new JButton("Menu");
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Menu.setBounds(501, 334, 89, 23);
		contentPane.add(Menu);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(41, 126, 57, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Carrera");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(206, 126, 57, 15);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Carnet");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(386, 127, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("_________________________________________________________");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 54, 546, 24);
		contentPane.add(lblNewLabel_2);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.setBounds(294, 92, 89, 23);
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimir.setText(null);
				listado.clear();
			}
		});
		contentPane.add(Eliminar);
		
		JComboBox Car_Impri = new JComboBox();
		Car_Impri.setModel(new DefaultComboBoxModel(new String[] {"Agricola", "Industrial", "Mecanica", "Sistemas", "Civil", "Arquitectura", "Quimica", "Electronica", "Electrica", "Computacion"}));
		Car_Impri.setToolTipText("");
		Car_Impri.setBounds(411, 92, 114, 22);
		contentPane.add(Car_Impri);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(L5E1.class.getResource("/Image/11000796.jpg")));
		lblNewLabel_3.setBounds(0, 32, 600, 336);
		contentPane.add(lblNewLabel_3);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL5 r = new MenuL5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}