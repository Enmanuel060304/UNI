import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class L4E1 extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtInfija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L4E1 frame = new L4E1();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	String EI;
	
	public static int Prioridad(String operador) 
	{
		if(operador.equals("^")) 
		{
			return 4;
		}
		else 
		{
			if((operador.equals("*")) || (operador.equals("/"))) 
			{
				return 3;
			}
			else 
			{
				if((operador.equals("+")) || (operador.equals("-")))  
				{
					return 2;
				}
				else 
				{
					return 1;
				}
			}
		}
	
	}

	/**
	 * Create the frame.
	 */
	public L4E1() {
	
		
		setTitle("Ejercicio 1 Conversion");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 613, 407);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseLaExpresion = new JLabel("Ingrese la expresion infija: ");
		lblIngreseLaExpresion.setForeground(new Color(255, 255, 255));
		lblIngreseLaExpresion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblIngreseLaExpresion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLaExpresion.setBounds(10, 98, 187, 33);
		contentPane.add(lblIngreseLaExpresion);
		
		txtInfija = new JTextField();
		txtInfija.setHorizontalAlignment(SwingConstants.CENTER);
		txtInfija.setBounds(199, 102, 201, 26);
		contentPane.add(txtInfija);
		txtInfija.setColumns(10);
		
		JTextArea txtrPostfija = new JTextArea();
		txtrPostfija.setBounds(199, 243, 235, 26);
		contentPane.add(txtrPostfija);
		
		JTextArea txtrPrefija = new JTextArea();
		txtrPrefija.setBounds(199, 173, 235, 26);
		contentPane.add(txtrPrefija);
		
		JButton btnPrefija = new JButton("Prefija");
		btnPrefija.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				EI=txtInfija.getText().toString();
				int i, l, Tope = -1;
				String EIMay=EI.toUpperCase();
				String EPRE = "", simb, IEpre = "";
				l=EI.length();
				String Pila[] = new String[l];
				i=l-1;
				while(i>=0) 
				{
					simb=EIMay.substring(i,i+1);
					i--;
						if (simb.equalsIgnoreCase(")")) {
							Tope++;
							Pila[Tope] = simb;

				}
						else 
						{
							if(simb.equalsIgnoreCase("(")) 
							{
								while(Pila[Tope].compareTo(")") != 0 ) 
								{
									EPRE+=Pila[Tope];
									Tope--;
								}
									Tope--;
							}
							else 
							{
								if((simb.compareTo("A") >= 0) && (simb.compareTo("Z") <= 0)) 
								{
									EPRE+=simb;
								}					
								else 
								{
									if(Tope>=0) 
									{
										while(Prioridad(simb)<Prioridad(Pila[Tope])) 
										{
											EPRE+=Pila[Tope];
											Tope--;
											if(Tope== (-1)) 
											{
												break;
											}
										}
									}
									Tope++;
									Pila[Tope]=simb;
								}
							}
						}
				}
				while (Tope>=0) 
				{
					EPRE+=Pila[Tope];
					Tope--;
				}
					for(i= (EPRE.length() - 1); i >= 0; i--)
						IEpre += EPRE.substring(i, i+1);
					txtrPrefija.setText(IEpre);
			}
		});
		btnPrefija.setBounds(37, 173, 117, 25);
		contentPane.add(btnPrefija);
		
		JButton btnPostfija = new JButton("Postfija");
		btnPostfija.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				EI=txtInfija.getText().toString();
				int i, l, Tope = -1;
				String EIMay=EI.toUpperCase();
				String EPos = "", simb;
				l=EI.length();
				String Pila[] = new String[l];
				i=0;
				while(i<=l-1) 
				{
					simb=EIMay.substring(i,i+1);
					i++;
						if (simb.equalsIgnoreCase("(")) 
						{
							Tope++;
							Pila[Tope] = simb;

						}
						else 
						{
							if(simb.equalsIgnoreCase(")")) 
							{
								while(Pila[Tope].compareTo("(") != 0 ) 
								{
									EPos+=Pila[Tope];
									Tope--;
								}
									Tope--;
							}
							else 
							{
								if((simb.compareTo("A") >= 0) && (simb.compareTo("Z") <= 0)) 
								{
									EPos+=simb;
								}					
								else 
								{
									if(Tope>=0) 
									{
										while(Prioridad(simb)<Prioridad(Pila[Tope])) 
										{
											EPos+=Pila[Tope];
											Tope--;
											if(Tope== (-1)) 
											{
												break;
											}
										}
									}
									Tope++;
									Pila[Tope]=simb;
								}
							}
						}
				}
				while (Tope>=0) 
				{
					EPos+=Pila[Tope];
					Tope--;
				}
				txtrPostfija.setText(EPos);
			}
		});
		btnPostfija.setBounds(37, 243, 117, 25);
		contentPane.add(btnPostfija);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		btnRegresar.setBounds(470, 332, 117, 25);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Ubuntu", Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-12, 242, 245, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblAutomaticamenteDeMin = new JLabel("");
		lblAutomaticamenteDeMin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutomaticamenteDeMin.setFont(new Font("Ubuntu", Font.ITALIC, 15));
		lblAutomaticamenteDeMin.setBounds(189, 242, 245, 26);
		contentPane.add(lblAutomaticamenteDeMin);
		
		JLabel lblNewLabel_1 = new JLabel("Conversiones polacas  Ejercicio #1");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(178, 8, 245, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(L4E1.class.getResource("/Image/chernyy.jpg")));
		lblNewLabel_2.setBounds(0, 39, 597, 329);
		contentPane.add(lblNewLabel_2);
		
		
	}
	protected void doBtnRegresarActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL4 r = new MenuL4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}