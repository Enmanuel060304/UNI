import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;

public class L1E1 extends JFrame {

	private JPanel contentPane;
	private JTextField PedirNombre;
	private JTextField PedirSemestre;
	private JTextField PedirPromedio;
	private JTextField PedirTamaño;
	int n=-1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L1E1 frame = new L1E1();
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
	/*private void setCentrarJInternalFrame(JInternalFrame jifrm)
    {
        jifrm.setLocation(jifrm.getParent().getWidth()/2 - jifrm.getWidth()/2 ,jifrm.getParent().getHeight()/2 - jifrm.getHeight()/2 - 20);
    }*/
	public L1E1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(L1E1.class.getResource("/Image/UNI.png")));
		
		
		/*super("Centrar JFrame");	
	     Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	     int height = pantalla.height;
	     int width = pantalla.width;
	     setSize(width/2, height/2);		
	     setLocationRelativeTo(null);		
	     setVisible(true);*/
	     
		setTitle("Escuela Ejercicio #1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PedirNombre = new JTextField();
		PedirNombre.setBounds(80, 110, 110, 20);
		contentPane.add(PedirNombre);
		PedirNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 111, 60, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumSemestre = new JLabel("Num. Semestre");
		lblNumSemestre.setForeground(new Color(255, 255, 255));
		lblNumSemestre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumSemestre.setBounds(200, 111, 111, 17);
		contentPane.add(lblNumSemestre);
		
		PedirSemestre = new JTextField();
		PedirSemestre.setColumns(10);
		PedirSemestre.setBounds(309, 110, 67, 20);
		contentPane.add(PedirSemestre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Promedio");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(386, 112, 59, 14);
		contentPane.add(lblNewLabel_1_1);
		
		PedirPromedio = new JTextField();
		PedirPromedio.setColumns(10);
		PedirPromedio.setBounds(461, 110, 59, 20);
		contentPane.add(PedirPromedio);
		
		JComboBox PedirOpciones = new JComboBox();
		PedirOpciones.setModel(new DefaultComboBoxModel(new String[] {"Dar de alta", "Dar de baja", "Modificar numero de semestres", "Listar alumno", "Imprimir todo"}));
		PedirOpciones.setBounds(541, 109, 138, 22);
		contentPane.add(PedirOpciones);
		
		PedirTamaño = new JTextField();
		PedirTamaño.setColumns(10);
		PedirTamaño.setBounds(293, 60, 110, 20);
		contentPane.add(PedirTamaño);
		
		
		
		JTextArea Impresion = new JTextArea();
		Impresion.setBounds(26, 185, 631, 186);
		contentPane.add(Impresion);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Tam=Integer.parseInt(PedirTamaño.getText());;
				String nomb[]=new String[Tam];
				int semest[]=new int[Tam];
				float prom[]=new float[Tam];
				/*String nombre = PedirNombre.getText();
				String seme = PedirSemestre.getText();
				String promed = PedirPromedio.getText();*/
				
				String opciones;
				opciones = PedirOpciones.getSelectedItem().toString();
				
				if(opciones.equalsIgnoreCase("Dar de alta")) {
					//n=InsDesd(nomb,semest,prom,n,Tam);
					if (n<(Tam-1)) { 
						n++;
						String nombre = PedirNombre.getText();
						String seme = PedirSemestre.getText();
						String promed = PedirPromedio.getText();
						nomb[n]=nombre;
						semest[n]=Integer.parseInt(seme);
						prom[n]=Float.parseFloat(promed);
						PedirPromedio.setText(null);
						PedirNombre.setText(null);
						PedirSemestre.setText(null);
					}
					else 
						JOptionPane.showMessageDialog(null,"no hay espacio disponible");
				}
				
				if(opciones.equalsIgnoreCase("Dar de baja")) {
					//n=ElimDesd(nomb,semest,prom,n);
					String nom=PedirNombre.getText();
					PedirNombre.setText(null);
					int i,k=0;
					i=BuscaDesd(nomb,n,nom);
					if(i>n)
						JOptionPane.showMessageDialog(null,"El alumno"+nom+"no se encuentra en el registro");
					else {
						for (k=i;k<=(n-1);k++) {
							nomb[k]=nomb[k+1];
							semest[k]=semest[k+1];
							prom[k]=prom[k+1];
						}
						n--;	
					}
				}
				if(opciones.equalsIgnoreCase("Modificar numero de semestres")) {
					//ModDesd(nomb,semest,prom,n);
					String nom=PedirNombre.getText();
					PedirNombre.setText(null);
					int i;
					i=BuscaDesd(nomb,n,nom);
					if(i>n)
						JOptionPane.showMessageDialog(null,"El alumno"+nom+"no se encuentra en el registro");
					else {
						semest[i]=Integer.parseInt(PedirSemestre.getText());
						PedirSemestre.setText(null);
					    prom[i]=Float.parseFloat(PedirPromedio.getText());
					    PedirPromedio.setText(null);
					}
						
				}
				if(opciones.equalsIgnoreCase("Listar alumno")) {
					//ImpAlum(nomb,semest,prom,n);
					String nom=PedirNombre.getText();
					int i;
					i=BuscaDesd(nomb,n,nom);
					if(i>n)
						JOptionPane.showMessageDialog(null,"El alumno"+nom+"no se encuentra en el registro");
					else {
						String salida="Nombre          Semestres          Promedio \n";
						for(int j = 0; j< Tam; j++)
				        {
							if(nom==nomb[j]) {
								salida += String.format("%s",nomb[j] + "          ","%d", semest[j] +"          ","%f",prom[j]);
							}
				        }
						Impresion.setText(salida);
					}
						//JOptionPane.showMessageDialog(null,"nombre del alumno:"+nom+"\n semestres cursados:"+semest[i]+"\n promedio total:"+prom[i]);
						 
				}
				if(opciones.equalsIgnoreCase("Imprimir todo")) {
					//ImpReg(nomb,semest,prom,n);
					String sal="Nombre\tsemestres cursados\tpromedio\n";
					for (int i=0;i<Tam;i++) {
						sal+=nomb[i]+"\t"+semest[i]+"\t"+prom[i]+"\n";
					}
						
					Impresion.setText(sal);
				}
			}
			public static int InsDesd(String nomb[],int semest[],float prom[],int n,int Tam) {
				if (n<(Tam-1)) { 
					n++;
					nomb[n]=JOptionPane.showInputDialog("ingrese el nombre del alumno:");
					semest[n]=Integer.parseInt(JOptionPane.showInputDialog("de el numero de semestres cursados:"));
					prom[n]=Float.parseFloat(JOptionPane.showInputDialog("de su promedio total:"));
				}
				else 
					JOptionPane.showMessageDialog(null,"no hay espacio disponible");
				return n;
				}
			public static int BuscaDesd(String nomb[],int n,String nom) {
				int i=0;
				while ((i<n)&&(nom.compareTo(nomb[i])!=0))
					i++;
				return i;
			}
		});
		Aceptar.setBounds(568, 151, 89, 23);
		contentPane.add(Aceptar);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setBounds(604, 382, 89, 23);
		contentPane.add(Regresar);
		
		
		JLabel lblRegistroDeEstudiantes = new JLabel("Registro de estudiantes");
		lblRegistroDeEstudiantes.setForeground(Color.WHITE);
		lblRegistroDeEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistroDeEstudiantes.setBounds(251, 11, 189, 21);
		contentPane.add(lblRegistroDeEstudiantes);
		
		JLabel lblTamaoDelArreglo = new JLabel("Tamaño del arreglo");
		lblTamaoDelArreglo.setForeground(Color.WHITE);
		lblTamaoDelArreglo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTamaoDelArreglo.setBounds(158, 61, 125, 17);
		contentPane.add(lblTamaoDelArreglo);

		
		JLabel lblNewLabel_1 = new JLabel("FONDO");
		lblNewLabel_1.setIcon(new ImageIcon(L1E1.class.getResource("/Image/4857144.jpg")));
		lblNewLabel_1.setBounds(0, 43, 704, 373);
		contentPane.add(lblNewLabel_1);	
		
		
		
		
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL1 r = new MenuL1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}
