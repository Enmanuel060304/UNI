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
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class L5E2 extends JFrame {

	private JPanel contentPane;
	private JTextField Leer;
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L5E2 frame = new L5E2();
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
	public L5E2() {
		setTitle("Ejercicio #2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese los numeros:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 86, 165, 26);
		contentPane.add(lblNewLabel);
		
		Leer = new JTextField();
		Leer.setBounds(185, 90, 86, 20);
		contentPane.add(Leer);
		Leer.setColumns(10);
		
		JTextArea Imprimir = new JTextArea();
		Imprimir.setBounds(58, 179, 437, 129);
		contentPane.add(Imprimir);
		
		JButton Ingresar = new JButton("Ingresar");
		Ingresar.setBackground(new Color(255, 255, 255));
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(Leer.getText());
				numeros.add(numero);
				Leer.setText(null);
				
				String salida = "";
				salida += imprimir(numeros);
				salida += negativos(numeros);
				salida += positivos(numeros);
		        Imprimir.setText(String.valueOf(salida));
				
			}
			public static String imprimir( List<Integer> numeros)
			{
				String salida = "Numeros:";
		        for(int i = 0; i< numeros.size(); i++)
		        {
		        	salida += String.format("%s",numeros.get(i) + " ");
		            
		        }
		        return salida;
			}
			public static String negativos(List <Integer> numeros)
			{
				String salida = "\nNumeros Negativos: ";
		        for(int i = 0; i< numeros.size(); i++)
		        {
		        	if(numeros.get(i) < 0)
		        	{
		        		ArrayList <Integer> negativos = new ArrayList <Integer>(numeros);
		        		
		        		salida += String.format(" %s",negativos.get(i) + " ");
		        		
		        	}
		            
		        }
		        return salida;
				
			}
			
			public static String positivos(List <Integer> numeros)
			{
				String salida = "\nNumeros Positivos: ";
		        for(int i = 0; i< numeros.size(); i++)
		        {
		        	if(numeros.get(i) > 0)
		        	{
		        		ArrayList <Integer> positivos = new ArrayList <Integer>(numeros);
		        		salida += String.format(" %s",positivos.get(i) + " ");
		        		
		        	}
		            
		        }
		        return salida;
				
			}
		});
		Ingresar.setBounds(286, 89, 99, 23);
		contentPane.add(Ingresar);
		
		JButton Limpiar = new JButton("Eliminar");
		Limpiar.setBackground(new Color(255, 255, 255));
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimir.setText(null);
				numeros.clear();
			}
		});
		Limpiar.setBounds(395, 89, 100, 23);
		contentPane.add(Limpiar);
		
		JButton Menu = new JButton("Menu");
		Menu.setBackground(new Color(255, 255, 255));
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Menu.setBounds(501, 333, 89, 23);
		contentPane.add(Menu);
		
		JLabel lblNewLabel_1 = new JLabel("Escriba numeros enteros a continuacion para poder dividir entre negativos y positivos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 8, 580, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(L5E2.class.getResource("/Image/11000796.jpg")));
		lblNewLabel_3.setBounds(0, 31, 600, 336);
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