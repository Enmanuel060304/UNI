import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;

public class L5E4 extends JFrame 
{

	private JPanel contentPane;
	private JTextField num;
	ArrayList<String> numeros = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L5E4 frame = new L5E4();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//int X=-1;
	String numero; 
	String salida=" ",resp; 
	int cont = 0;
	private JButton Menu;
	
	/**
	 * Create the frame.
	 */
	public L5E4() {
		setTitle("Ejercicio #4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NomCC = new JLabel("Nombres o numeros a Pilar");
		NomCC.setFont(new Font("Times New Roman", Font.BOLD, 14));
		NomCC.setForeground(new Color(255, 255, 255));
		NomCC.setHorizontalAlignment(SwingConstants.CENTER);
		NomCC.setBounds(35, 73, 192, 27);
		contentPane.add(NomCC);
		
		num = new JTextField();
		num.setBounds(45, 111, 192, 27);
		contentPane.add(num);
		num.setColumns(10);
		
		JTextArea ImprimirP = new JTextArea();
		ImprimirP.setBounds(45, 149, 325, 180);
		contentPane.add(ImprimirP);
		
		JButton Agregar = new JButton("Agregar");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnAgregarActionPerformed(e);
			}
		});
		Agregar.setBounds(253, 75, 117, 25);
		contentPane.add(Agregar);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnEliminarActionPerformed(e);
			}
		});
		Eliminar.setBounds(253, 112, 117, 25);
		contentPane.add(Eliminar);
		
		
		Menu = new JButton("Menu");
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Menu.setBounds(473, 331, 117, 25);
		contentPane.add(Menu);
		
		JLabel lblNewLabel_1_1 = new JLabel("Listas LIFO.");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(256, 8, 108, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(L5E4.class.getResource("/Image/11000796.jpg")));
		lblNewLabel_3.setBounds(0, 31, 600, 336);
		contentPane.add(lblNewLabel_3);
		
		
		
		
				
	}
	protected void doBtnAgregarActionPerformed(ActionEvent e) 
	{
		numero = num.getText();
		numeros.add(numero);
		num.setText(null);
		cont++;
		//X++;
		JTextArea ImprimirP = new JTextArea();
		ImprimirP.setBounds(45, 149, 323, 180);
		contentPane.add(ImprimirP);
		String salida = "Pila LIFO: \n";
		
		for(int i = 0; i< numeros.size(); i++)
        {
        	salida += String.format("%s",numeros.get(i) + "\n");
            
        }
		ImprimirP.setText(salida);

		
	}
	protected void doBtnEliminarActionPerformed(ActionEvent e) 
	{
		if(cont != 0)
		{
			numeros.remove(numeros.size()-1);
			cont--;
			JTextArea ImprimirP = new JTextArea();
			ImprimirP.setBounds(45, 149, 323, 180);
			contentPane.add(ImprimirP);
			String salida = "Pila LIFO: \n";
			
			for(int i = 0; i< numeros.size(); i++)
	        {
	        	salida += String.format("%s",numeros.get(i) + "\n");
	            
	        }
		    ImprimirP.setText(salida);
		}
		else {
			JTextArea ImprimirP = new JTextArea();
			ImprimirP.setBounds(45, 149, 323, 180);
			contentPane.add(ImprimirP);
			String salida = "\nNo hay mas elementos para eliminar";
			ImprimirP.setText(null);
			ImprimirP.setText(salida);
		}
		
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL5 r = new MenuL5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	
}