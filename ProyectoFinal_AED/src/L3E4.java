import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class L3E4 extends JFrame {

	private JPanel contentPane;
	private JTextField LeerFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E4 frame = new L3E4();
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
	public L3E4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese una frase");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(79, 140, 128, 22);
		contentPane.add(lblNewLabel);
		
		JTextArea Imprimir = new JTextArea();
		Imprimir.setBounds(101, 173, 417, 169);
		contentPane.add(Imprimir);
		
		LeerFrase = new JTextField();
		LeerFrase.setBounds(225, 140, 108, 20);
		contentPane.add(LeerFrase);
		LeerFrase.setColumns(10);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(343, 139, 89, 23);
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Antes de registrar los numeros valida si lo que entra es un numero entero y no un string ni un decimal*/
				
				String cadena = LeerFrase.getText();
				String salida ="Frase original\n";
				salida+= String.format("%s",cadena);
				LeerFrase.setText(null);
				
				salida+="\nNumero de espacios\n";
				int cont=0;
				int n = cadena.length();
				String salida1="";
				salida1=Espacios(salida,cadena,n,cont);
				salida+= String.format("%s",salida1);
				
				Imprimir.setText(String.valueOf(salida));
				
			}
			public static String Espacios(String salida, String cadena,int n,int cont) {
				if(n<1)
					return salida;
				else {
					if(cadena.charAt(n-1) == ' ') {
						cont++;
						salida = String.format("%d", cont);
					}
					salida = Espacios(salida,cadena,n-1,cont);
					return salida;
				}
			}
		});
		contentPane.add(Aceptar);
		
		
		JButton Regresar = new JButton("Regresar");
		Regresar.setBounds(527, 354, 89, 23);
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		contentPane.add(Regresar);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setBounds(442, 139, 89, 23);
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimir.setText(null);
			}
		});
		contentPane.add(Limpiar);
		
		JTextArea txtrEscribaUn_1 = new JTextArea();
		txtrEscribaUn_1.setText("4. Escriba un programa recursivo que lea una cadena de caracteres \r\n    y que cuente cuantos espacios en blanco tiene.\r\n    Ejemplo:\r\n    Original: Esto es una prueba de recursividad\r\n    Espacios: 5");
		txtrEscribaUn_1.setForeground(Color.WHITE);
		txtrEscribaUn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrEscribaUn_1.setBackground(new Color(139, 0, 0));
		txtrEscribaUn_1.setBounds(48, 21, 502, 89);
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