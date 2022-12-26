import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class L3E1 extends JFrame {

	private JPanel contentPane;
	private JTextField ObtenerNumero;
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	int n;
	int cont = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E1 frame = new L3E1();
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
	public L3E1() {
		setTitle("Inverso de numeros Ejercicio#1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduzca numeros");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 118, 133, 23);
		contentPane.add(lblNewLabel);
		
		ObtenerNumero = new JTextField();
		ObtenerNumero.setBounds(153, 119, 89, 20);
		contentPane.add(ObtenerNumero);
		ObtenerNumero.setColumns(10);
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(20, 150, 412, 172);
		contentPane.add(Impresion);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(429, 333, 89, 23);
		contentPane.add(Regresar);
		
		/*JButton Asignar = new JButton("Asignar");
		Asignar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tama = Integer.parseInt(Tam.getText());
				n = tama;
			}
		});
		Asignar.setBounds(221, 77, 89, 23);
		contentPane.add(Asignar);
		
		int numeros[]=new int[n];*/
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(ObtenerNumero.getText());
				numeros.add(numero);
				ObtenerNumero.setText(null);
				
			}
			
				
		});
		Aceptar.setBounds(249, 118, 80, 23);
		contentPane.add(Aceptar);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Impresion.setText(null);
				numeros.clear();
				
			}
		});
		Limpiar.setBounds(438, 118, 80, 23);
		contentPane.add(Limpiar);
		
		JButton Imprimir = new JButton("Imprimir");
		Imprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = numeros.size();
				String sal="Numeros originales \n";
				
				for(int i =0; i<n;i++) {
					sal += String.format("%s",numeros.get(i) + " ");
				}
				sal += "\n Numeros inversos\n";
				String salida ="";
				salida+= Inverso(salida,n,numeros);
				sal+= String.format("%s",salida);
				Impresion.setText(String.valueOf(sal));
				
				
			}
			public static String Inverso(String salida,int n, List <Integer> numeros) {
				if(n<1)
					return salida;
				else {
					salida += String.format("%d ", numeros.get(n-1));
					salida = Inverso(salida,n-1,numeros);
					return salida;
				}
			}
		});
		Imprimir.setBounds(339, 118, 93, 23);
		contentPane.add(Imprimir);
		
		JTextArea asignacion = new JTextArea();
		asignacion.setForeground(new Color(255, 255, 255));
		asignacion.setBackground(new Color(139, 0, 0));
		asignacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		asignacion.setBounds(23, 26, 495, 66);
		contentPane.add(asignacion);
		asignacion.setText("1. Escribir un programa que lea un arreglo entero de N elementos y \r\n    que cree un metodo recursivo que los imprima en orden original\r\n    e inverso");
		
		
		
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL3 r = new MenuL3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}