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

public class L3E2 extends JFrame {

	private JPanel contentPane;
	private JTextField LeerPalabra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E2 frame = new L3E2();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);/*Para centrar el programa en la pantalla*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public L3E2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduzcaUnaPalabra = new JLabel("Introduzca una palabra");
		lblIntroduzcaUnaPalabra.setForeground(new Color(255, 255, 255));
		lblIntroduzcaUnaPalabra.setBackground(new Color(240, 240, 240));
		lblIntroduzcaUnaPalabra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIntroduzcaUnaPalabra.setBounds(79, 158, 172, 20);
		contentPane.add(lblIntroduzcaUnaPalabra);
		
		LeerPalabra = new JTextField();
		LeerPalabra.setBounds(261, 159, 111, 20);
		contentPane.add(LeerPalabra);
		LeerPalabra.setColumns(10);
		
		JTextArea Imprimir = new JTextArea();
		Imprimir.setBounds(79, 189, 437, 162);
		contentPane.add(Imprimir);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = LeerPalabra.getText();
				String salida ="Palabra original\n";
				salida+= String.format("%s",cadena);
				
				salida+="\nPalabra inversa\n";
				int n = cadena.length();
				String salida1="";
				salida1=Inverso(salida1,cadena,n);
				
				salida+= String.format("%s",salida1);
				
				Imprimir.setText(String.valueOf(salida));
			}
			public static String Inverso(String salida, String cadena,int n) {
				if(n<1)
					return salida;
				else {
					salida += String.format("%s", cadena.charAt(n-1));
					salida = Inverso(salida,cadena,n-1);
					return salida;
				}
			}
		});
		Aceptar.setBounds(382, 155, 89, 23);
		contentPane.add(Aceptar);
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimir.setText(null);
			}
		});
		Limpiar.setBounds(481, 155, 89, 23);
		contentPane.add(Limpiar);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(517, 378, 89, 23);
		contentPane.add(Regresar);
		
		JTextArea txtrEscribaUn = new JTextArea();
		txtrEscribaUn.setText("2. Escriba un programa recursivo que lea una palabra y la imprima \r\n    a la inversa. Ejemplo:\r\n    Palabra: ROMA\r\n    Inversa: AMOR");
		txtrEscribaUn.setForeground(Color.WHITE);
		txtrEscribaUn.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrEscribaUn.setBackground(new Color(139, 0, 0));
		txtrEscribaUn.setBounds(47, 23, 502, 84);
		contentPane.add(txtrEscribaUn);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL3 r = new MenuL3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}