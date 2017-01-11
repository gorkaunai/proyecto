
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class prueba1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnIniciar;
	private JButton btnPausa;
	private JButton btnDetener;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba1 frame = new prueba1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 

	/**
	 * Create the frame.
	 */
	public prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("<<");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(148, 69, 32, 35);
		contentPane.add(label);
		
		label_1 = new JLabel("00:00");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_1.setBounds(190, 69, 61, 35);
		contentPane.add(label_1);
		
		label_2 = new JLabel(">>");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_2.setBounds(261, 69, 32, 35);
		contentPane.add(label_2);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(24, 199, 89, 23);
		contentPane.add(btnIniciar);
		
		btnPausa = new JButton("Pausa");
		btnPausa.setBounds(123, 199, 89, 23);
		contentPane.add(btnPausa);
		
		btnDetener = new JButton("Detener");
		btnDetener.setBounds(221, 199, 89, 23);
		contentPane.add(btnDetener);
		
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(320, 199, 89, 23);
		contentPane.add(btnSalir);
		//activar eventos sobre botones
		btnIniciar.addActionListener(this);
		btnPausa.addActionListener(this);
		btnDetener.addActionListener(this);
		btnSalir.addActionListener(this);
	}
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton boton = (JButton) e.getSource();
		if (boton == btnSalir){
			System.out.println("Se ha pulsado el boton salir");
			btnSalir.setVisible(false);
			btnIniciar.setVisible(true);
			btnIniciar.setEnabled(true);
		
		}else if (boton == btnIniciar){
			System.out.println("Se ha pulsado el boton entrar");
			btnSalir.setVisible(true);
			btnIniciar.setEnabled(false);	
			}
		
	}
	}

