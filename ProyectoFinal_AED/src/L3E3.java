import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class L3E3 extends JFrame {

	private JPanel contentPane;
	private JTextField LeerNumero;
	int n = 10, aux = 1,cont=0;
	int array[] = new int[n];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E3 frame = new L3E3();
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
	public L3E3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese un numero");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(82, 130, 124, 29);
		contentPane.add(lblNewLabel);
		
		LeerNumero = new JTextField();
		LeerNumero.setBounds(230, 131, 86, 20);
		contentPane.add(LeerNumero);
		LeerNumero.setColumns(10);
		
		
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Antes de registrar los numeros valida si lo que entra es un numero entero y no un string ni un decimal*/
				
				/*condicion si el arreglo excede los 10 espacios*/
				if(cont == 10) {
					JOptionPane.showMessageDialog(null, "El arreglo ya esta lleno");
				}else {
					int numero = Integer.parseInt(LeerNumero.getText());
					array[cont] = numero;
					cont++;
					LeerNumero.setText(null);
				}
			}
		});
		Aceptar.setBounds(340, 130, 89, 23);
		contentPane.add(Aceptar);
		
		JTextArea Imprimir = new JTextArea();
		Imprimir.setBounds(64, 172, 512, 169);
		contentPane.add(Imprimir);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(546, 367, 89, 23);
		contentPane.add(Regresar);
		
		JButton Impresion = new JButton("Imprimir");
		Impresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sal="Numeros originales \n";
				
				for(int i =0; i<n;i++) {
					sal += String.format("%d ", array[i]);
				}
				sal += "\nEl producto es \n";
				String salida ="";
				salida = Producto(salida,n,array,aux);
				sal+= String.format("%s",salida);
				Imprimir.setText(String.valueOf(sal));
				
			}
			public static String Producto(String salida,int n, int array[],int aux) {
				if(n<1)
					return salida;
				else {
					aux = aux * array[n-1];
					salida = String.format("%d", aux);
					salida = Producto(salida,n-1,array,aux);
					return salida;
				}
			}
		});
		Impresion.setBounds(434, 130, 89, 23);
		contentPane.add(Impresion);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimir.setText(null);
				cont=0;
				for(int i=0;i<n;i++) {
					array[i]=0;
				}
			}
		});
		Limpiar.setBounds(531, 130, 89, 23);
		contentPane.add(Limpiar);
		
		JTextArea txtrEscribaUn_1 = new JTextArea();
		txtrEscribaUn_1.setText("3. Escriba un programa recursivo que pida 10 elementos y calcule el \r\n    producto de todos ellos. Imprimir los valores leidos y el producto.\r\n    Ejemplo:\r\n    Elementos: 5 3 2 4 7 1 8 9 5 2\r\n    Producto: 604800");
		txtrEscribaUn_1.setForeground(Color.WHITE);
		txtrEscribaUn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrEscribaUn_1.setBackground(new Color(139, 0, 0));
		txtrEscribaUn_1.setBounds(61, 30, 502, 89);
		contentPane.add(txtrEscribaUn_1);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL3 r = new MenuL3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}