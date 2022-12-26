import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;

public class L2E1 extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JButton Burbuja;
	private JButton Insercion;
	private JButton Sacudida;
	private JButton Seleccion;
	private JButton Shell;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L2E1 frame = new L2E1();
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
	public L2E1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 295);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metodos de seleccion:");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(163, 11, 159, 21);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.setBounds(369, 208, 89, 23);
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		contentPane.add(Regresar);
		
		Burbuja = new JButton("M. Burbuja");
		Burbuja.setBounds(24, 66, 101, 23);
		Burbuja.addActionListener(this);
		contentPane.add(Burbuja);
		
		Insercion = new JButton("M. Insercion");
		Insercion.setBounds(172, 66, 101, 23);
		Insercion.addActionListener(this);
		contentPane.add(Insercion);
		
		Sacudida = new JButton("M. Sacudida");
		Sacudida.setBounds(341, 66, 101, 23);
		Sacudida.addActionListener(this);
		contentPane.add(Sacudida);
		
		Seleccion = new JButton("M. Seleccion");
		Seleccion.setBounds(24, 123, 101, 23);
		Seleccion.addActionListener(this);
		contentPane.add(Seleccion);
		
		Shell = new JButton("M. Shell");
		Shell.setBounds(172, 123, 101, 23);
		Shell.addActionListener(this);
		contentPane.add(Shell);
		
		JLabel FONDO = new JLabel("");
		FONDO.setIcon(new ImageIcon("C:\\Users\\Orlando Guevara\\Documents\\Trabajos UNI\\AED\\Proyecto final\\98a971e76d8a026ebcbb9d5450fc365b--the-matrix-background-images.jpg"));
		FONDO.setBounds(0, 42, 471, 214);
		contentPane.add(FONDO);
	}

	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		LabsMenu r = new LabsMenu();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Shell) {
			handle_Shell_actionPerformed(e);
		}
		if (e.getSource() == Seleccion) {
			handle_Seleccion_actionPerformed(e);
		}
		if (e.getSource() == Sacudida) {
			handle_Sacudida_actionPerformed(e);
		}
		if (e.getSource() == Insercion) {
			handle_Insercion_actionPerformed(e);
		}
		if (e.getSource() == Burbuja) {
			handle_Burbuja_actionPerformed(e);
		}
	}
	protected void handle_Burbuja_actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad que desea reservar para el arreglo"));
		int array[] = new int[a];
		for(int i = 0;i<a;i++){
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Rellene el arreglo"));
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					JOptionPane.showMessageDialog(null, "Numero ya existente");
					i--;
				}
			}
		}
		int temp, i,j;
		String salida = "";
		for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {                                                              
                if (array[j + 1] < array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
		
		for(i=0;i<a;i++) {
			salida += String.format("%d ",array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
		
		}
	
	
	
	protected void handle_Insercion_actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad que desea reservar para el arreglo"));
		int array[] = new int[a];
		for(int i = 0;i<a;i++){
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Rellene el arreglo"));
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					JOptionPane.showMessageDialog(null, "Numero ya existente");
					i--;
				}
			}
		}
		int temp,j;
		String salida = " ";
		for(int i = 1; i<a; i++) {
			temp = array[i];
			j = i-1;
			while((j>=0)&&(temp < array[j])) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=temp;
		}
		
		for(int i=0;i<a;i++) {
			salida += String.format("%d ",array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	protected void handle_Sacudida_actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad que desea reservar para el arreglo"));
		int array[] = new int[a];
		for(int i = 0;i<a;i++){
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Rellene el arreglo"));
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					JOptionPane.showMessageDialog(null, "Numero ya existente");
					i--;
				}
			}
		}
		int intercambios = 0, comparaciones = 0;
		int i, izq, der, k, aux;
		izq = 1;
		der = array.length-1;
		k= array.length-1;
		String salida = " ";
		while(izq <= der){
			for(i=der; i >=izq; i--){
				comparaciones++;
				if(array[i-1] > array[i]){
					intercambios++;
					aux = array[i-1];
					array[i-1] = array[i];
					array[i] = aux;
					k = i;
				}
			}
			izq = k+1;
			for(i = izq; i<=der; i++){
				comparaciones++;
				if(array[i-1] > array[i]){
					intercambios++;
					aux = array[i-1];
					array[i-1] = array[i];
					array[i] = aux;
					k = i;
				}
			}
			der = k-1;
		}while(der >=izq);
		for(int o=0;o<a;o++) {
			salida += String.format("%d ",array[o]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	protected void handle_Seleccion_actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad que desea reservar para el arreglo"));
		int array[] = new int[a];
		for(int i = 0;i<a;i++){
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Rellene el arreglo"));
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					JOptionPane.showMessageDialog(null, "Numero ya existente");
					i--;
				}
			}
		}
		int temporal;
		String salida = " ";
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i] > array[j]) {
	                temporal = array[i];
	                array[i] = array[j];
	                array[j] = temporal;
	            }
	            
	        }
	    }
	    for(int i=0;i<a;i++) {
			salida += String.format("%d ",array[i]);
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	protected void handle_Shell_actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad que desea reservar para el arreglo"));
		int array[] = new int[a];
		for(int i = 0;i<a;i++){
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Rellene el arreglo"));
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					JOptionPane.showMessageDialog(null, "Numero ya existente");
					i--;
				}
			}
		}
		 int salto, aux, o;
	        boolean cambios;
	        String salida = " ";
	  
	        for (salto = array.length / 2; salto != 0; salto /= 2) {
	            cambios = true;
	            while (cambios) {                                         
	                cambios = false;
	                for (o = salto; o < array.length; o++)   
	                {
	                    if (array[o - salto] > array[o]) {      
	                        aux = array[o];                  
	                        array[o] = array[o - salto];
	                        array[o - salto] = aux;
	                        cambios = true;                                              
	                    }
	                }
	            }
	        }
	        for(int i=0;i<a;i++) {
				salida += String.format("%d ",array[i]);
			}
			JOptionPane.showMessageDialog(null, salida);
	}
}