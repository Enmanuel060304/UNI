
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class L3E5 extends JFrame {

	private JPanel contentPane;
	int P=2021;
	float Pedro=400;
	float Juan=500;
    String ImpRec= "Año\t Cta.Pedro\t Cta.Juan\n";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L3E5 frame = new L3E5();
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
	public L3E5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 426);
        setLocation(400,100);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setBounds(272, 28, 144, 31);
		lblCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuenta.setForeground(new Color(255, 255, 255));
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblCuenta);
		
		JLabel lblEnunciado = new JLabel("Enunciado");
		lblEnunciado.setBounds(127, 79, 132, 28);
		lblEnunciado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblEnunciado);
		
		
		
		JTextArea Enunciado = new JTextArea();
		Enunciado.setForeground(new Color(255, 255, 255));
		Enunciado.setFont(new Font("Tahoma", Font.BOLD, 14));
		Enunciado.setBackground(new Color(139, 0, 0));
		Enunciado.setBounds(39, 116, 347, 169);
		contentPane.add(Enunciado);
		Enunciado.setText("Pedro y Juan abren una cuenta al mismo tiempo\r\nen el banco. Pedro la abre con $400 a una tasa de\r\ninteres anual del 4% y Juan con $500 a una tasa\r\n de interes anual de 2.3% en el year 2021.\r\n\r\nDetermine en cuantos year's la cuenta de Pedro\r\n sera mayor que la de Juan.");
		
		
		
		JLabel lblImpresion = new JLabel("Impresion");
		lblImpresion.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpresion.setForeground(new Color(255, 255, 255));
		lblImpresion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblImpresion.setBounds(499, 50, 132, 28);
		contentPane.add(lblImpresion);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		textArea.setBounds(446, 79, 228, 260);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Hacer Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImpRec=RecursividadClases.cuenta(P,Pedro,Juan,ImpRec);
				
				
				textArea.setText(ImpRec);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(143, 295, 116, 30);
		contentPane.add(btnNewButton);
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon("C:\\Users\\manue\\OneDrive\\Documentos\\NetBeansProjects\\AED-4\\AED\\build\\classes\\AED_Imagenes\\Recurso-17@300x.png"));
		icon.setHorizontalAlignment(SwingConstants.LEFT);
		icon.setBackground(Color.WHITE);
		icon.setBounds(632, 10, 64, 30);
		contentPane.add(icon);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Regresar.setFont(new Font("Segoe UI Historic", Font.BOLD, 12));
		Regresar.setForeground(Color.BLACK);
		Regresar.setBounds(607, 353, 89, 23);
		contentPane.add(Regresar);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		MenuL3 r = new MenuL3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}