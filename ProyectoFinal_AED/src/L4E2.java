import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class L4E2 extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtTam;
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L4E2 frame = new L4E2();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	int tam, tope=-1; //tam es el max
	String[] Nom;
	String Dato;
	boolean Band=false;
	
	/**
	 * Create the frame.
	 */
	public L4E2() {

		
		setTitle("Ejercicio 2 Pilas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElNombre = new JLabel("Ingrese el nombre");
		lblIngreseElNombre.setForeground(new Color(255, 255, 255));
		lblIngreseElNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblIngreseElNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseElNombre.setBounds(12, 97, 192, 27);
		contentPane.add(lblIngreseElNombre);
		
		JLabel lblDelCentroComercial = new JLabel("del centro comercial");
		lblDelCentroComercial.setForeground(new Color(255, 255, 255));
		lblDelCentroComercial.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDelCentroComercial.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelCentroComercial.setBounds(12, 111, 192, 27);
		contentPane.add(lblDelCentroComercial);
		
		JLabel lblEstablecerTamanio = new JLabel(" Tamaño");
		lblEstablecerTamanio.setForeground(new Color(255, 255, 255));
		lblEstablecerTamanio.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEstablecerTamanio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstablecerTamanio.setBounds(24, 43, 169, 27);
		contentPane.add(lblEstablecerTamanio);
		
		txtTam = new JTextField();
		txtTam.setBounds(174, 46, 114, 19);
		contentPane.add(txtTam);
		txtTam.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setBounds(174, 105, 192, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JButton btnEstablecer = new JButton("Establecer");
		btnEstablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doBtnEstablecerActionPerformed(arg0);
			}
		});
		btnEstablecer.setBounds(298, 44, 117, 25);
		contentPane.add(btnEstablecer);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnAgregarActionPerformed(e);
			}
		});
		btnAgregar.setBounds(376, 98, 117, 25);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnEliminarActionPerformed(e);
			}
		});
		btnEliminar.setBounds(376, 130, 117, 25);
		contentPane.add(btnEliminar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnImprimirActionPerformed(e);
			}
		});
		btnImprimir.setBounds(439, 166, 117, 25);
		contentPane.add(btnImprimir);
		
		JTextArea txtrPila = new JTextArea();
		txtrPila.setText("Pila");
		txtrPila.setBounds(50, 166, 379, 144);
		contentPane.add(txtrPila);
		
		JButton btnRegresar = new JButton("Menu");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		btnRegresar.setBounds(469, 333, 117, 25);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(L4E2.class.getResource("/Image/chernyy.jpg")));
		lblNewLabel_2.setBounds(0, 43, 597, 329);
		contentPane.add(lblNewLabel_2);
				
	}
	protected void doBtnEstablecerActionPerformed(ActionEvent arg0) 
	{
		tam=Integer.parseInt(txtTam.getText());
		Nom=new String[tam];
	}
	protected void doBtnAgregarActionPerformed(ActionEvent e) 
	{
		Dato=txtNom.getText().toString();
		if(Band==true)
			JOptionPane.showMessageDialog(null, "Desbordamiento Pila Llena");
		else
		{
			tope++;
			Nom[tope]=Dato;
			JOptionPane.showMessageDialog(null, "Elemento Apilado");
			txtNom.setText("");
		}
		if(tope==tam-1)
			Band=true;
		else
			Band=false;
	}
	protected void doBtnEliminarActionPerformed(ActionEvent e) 
	{
		if(tope==tam)
			Band=false;
		if(Band=true)
			JOptionPane.showMessageDialog(null, "SubDesbordamiento de Datos");
		else
		{
			Dato=Nom[tope];
			tope--;
			JOptionPane.showMessageDialog(null, "Elemento Desapilado");
		}
		if(tope==-1)
			Band=true;
		else
			Band=false;
	}
	protected void doBtnImprimirActionPerformed(ActionEvent e) 
	{
		if(tope==-1)
			JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
		else
		{

			JTextArea txtrPila = new JTextArea();
			txtrPila.setText("Pila");
			txtrPila.setBounds(50, 166, 379, 144);
			contentPane.add(txtrPila);
			
			String sal = "Nombres \n";
			
			    for(int i=0;i<=tope;i++)              
			    	sal += Nom[i] + "\n";
			
			    txtrPila.setText(String.valueOf(sal));
		      
			
		}
			
	}
	protected void doBtnRegresarActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL4 r = new MenuL4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}