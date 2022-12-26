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
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class L4E3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtEstTrab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					L4E3 frame = new L4E3();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	int Max=10, frente=-1, fin=-1;
	String Trab[]= new String[Max],Dato;

	/**
	 * Create the frame.
	 */
	public L4E3() 
	{
		setTitle("Ejercicio 3 Colas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseLaEstacion = new JLabel("Ingrese la estacion de trabajo disponible");
		lblIngreseLaEstacion.setForeground(new Color(255, 255, 255));
		lblIngreseLaEstacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblIngreseLaEstacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLaEstacion.setBounds(12, 85, 260, 31);
		contentPane.add(lblIngreseLaEstacion);
		
		txtEstTrab = new JTextField();
		txtEstTrab.setBounds(279, 89, 216, 25);
		contentPane.add(txtEstTrab);
		txtEstTrab.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doBtnIngresarActionPerformed(arg0);
			}
		});
		btnIngresar.setBounds(12, 162, 117, 25);
		contentPane.add(btnIngresar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doBtnEliminarActionPerformed(arg0);
			}
		});
		btnEliminar.setBounds(12, 234, 117, 25);
		contentPane.add(btnEliminar);
		
		JButton btnRegresar = new JButton("Menu");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		btnRegresar.setBounds(470, 332, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doBtnImprimirActionPerformed(arg0);
			}
		});
		btnImprimir.setBounds(12, 198, 117, 25);
		contentPane.add(btnImprimir);
		
		JTextArea IMPRIMIR = new JTextArea();
		IMPRIMIR.setBounds(163, 127, 332, 194);
		contentPane.add(IMPRIMIR);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(L4E3.class.getResource("/Image/chernyy.jpg")));
		lblNewLabel_2.setBounds(0, 39, 597, 329);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblColaCurcular = new JLabel("Cola Circular");
		lblColaCurcular.setHorizontalAlignment(SwingConstants.CENTER);
		lblColaCurcular.setForeground(Color.WHITE);
		lblColaCurcular.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblColaCurcular.setBounds(151, 11, 260, 31);
		contentPane.add(lblColaCurcular);
	}
	protected void doBtnIngresarActionPerformed(ActionEvent arg0) 
	{
		Dato=txtEstTrab.getText().toString();
		if((fin==Max-1 && frente==0) || (fin+1 == frente))
			JOptionPane.showMessageDialog(null, "Desbordamiento de datos Cola llena");
		else
		{
			if(fin==Max-1)
				fin=0;
			else
				fin++;
			Trab[fin]=Dato;
			JOptionPane.showMessageDialog(null, "Elemento ha sido agregado");
			txtEstTrab.setText("");
			if(frente==-1)
				frente=0;
		}
	}
	protected void doBtnEliminarActionPerformed(ActionEvent arg0) 
	{
		if(frente==-1)
			JOptionPane.showMessageDialog(null, "SubDesbordamiento de Datos -- Cola Vacia");
		else
		{
			Dato=Trab[frente];
			txtEstTrab.setText(Dato);
			JOptionPane.showMessageDialog(null, "Elemento ha sido eliminado");
			if(frente==fin)
			{
				frente=-1;
				fin=-1;
			}
			else
			{
				if(frente==Max-1)
					frente=0;
				else
					frente++;
			}
		}
	}
	protected void doBtnImprimirActionPerformed(ActionEvent arg0) 
	{
		if(fin==-1 && frente==-1)
			JOptionPane.showMessageDialog(null, "No hay datos registrados");
		else {
			
			
			JTextArea IMPRIMIR = new JTextArea();
			IMPRIMIR.setBounds(163, 127, 332, 194);
			contentPane.add(IMPRIMIR);
			
			String sal = "Nombres \n";
			
			    for(int i=fin;i>=0;i--)              
			    	sal += Trab[i] + "\n";
			
			    IMPRIMIR.setText(String.valueOf(sal));
		      
			
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