import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class L3E6 extends JFrame {

	private JPanel contentPane;
	private JTextField Num;
	private JTextField Imprimi;
     int numero;
     String sal;
     String ul;
     RecursividadClases rec=new RecursividadClases();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E6 frame = new L3E6();
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
	public L3E6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 426);
		setTitle("Proyecto de A.E.D-Recursividad");
        setLocation(400,100);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSecuenciaDeUlam = new JLabel("Secuencia de Ulam");
		lblSecuenciaDeUlam.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecuenciaDeUlam.setForeground(new Color(255, 255, 255));
		lblSecuenciaDeUlam.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblSecuenciaDeUlam.setBounds(34, 11, 164, 31);
		contentPane.add(lblSecuenciaDeUlam);
		
		Num = new JTextField();
		Num.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		Num.setColumns(10);
		Num.setBounds(165, 244, 123, 31);
		contentPane.add(Num);
		
		JLabel lblIngresarNumero = new JLabel("Ingresar Numero");
		lblIngresarNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarNumero.setForeground(new Color(255, 255, 255));
		lblIngresarNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIngresarNumero.setBounds(23, 244, 132, 28);
		contentPane.add(lblIngresarNumero);
		
		JButton btIngresa = new JButton("Ingresar");
		btIngresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				do {
					numero=Integer.parseInt(Num.getText());
				}while(numero<1);
				
				/*HAY UN ARCHIVO LLAMADO RecursividadClases QUE TRABAJA CON EL EJERCICIO 5 Y 6*/
				ul=RecursividadClases.SecuenciaUlam(sal,numero);
				
			}
		});
		btIngresa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btIngresa.setBounds(91, 286, 85, 31);
		contentPane.add(btIngresa);
		
		JButton btLimpia = new JButton("Limpiar");
		btLimpia.setFont(new Font("Tahoma", Font.BOLD, 12));
		btLimpia.setBounds(186, 286, 85, 31);
		contentPane.add(btLimpia);
		
		JButton Imprimir = new JButton("Imprimir");
		Imprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imprimi.setText(ul);
				
			}
		});
		Imprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		Imprimir.setBounds(281, 286, 99, 31);
		contentPane.add(Imprimir);
		
		Imprimi = new JTextField();
		Imprimi.setBounds(390, 228, 288, 107);
		contentPane.add(Imprimi);
		Imprimi.setColumns(10);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setForeground(Color.BLACK);
		Regresar.setFont(new Font("Segoe UI Historic", Font.BOLD, 12));
		Regresar.setBounds(605, 353, 89, 23);
		contentPane.add(Regresar);
		
		JTextArea txtrEscribaUn_1 = new JTextArea();
		txtrEscribaUn_1.setText("6. Escriba un programa recursivo que resuelva la secuencia de ULAM: que pida un numero\r\n    entero positivo mayor que 1, si el numero es par, este debera de dividirse entre 2 (este\r\n    sera el nuevo numero) y si es impaar este debera multiplicarse por 3 y sumarse 1 (este\r\n    sera el nuevo numero). El proceso terminara cuando el numero llega a 1.\r\n    \r\n    Ejemplo:\r\n    N: 5\r\n    ULAM: 5 16 8 4 2 1");
		txtrEscribaUn_1.setForeground(Color.WHITE);
		txtrEscribaUn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrEscribaUn_1.setBackground(new Color(139, 0, 0));
		txtrEscribaUn_1.setBounds(44, 57, 627, 160);
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