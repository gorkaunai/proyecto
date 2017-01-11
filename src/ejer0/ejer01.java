package ejer0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ejer01 extends JFrame {

	private JPanel contentPane;
	private JLabel lblDepartamentos;
	private JButton btnEntrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer01 frame = new ejer01();
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
	public ejer01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
contentPane.setLayout(null);
		
		lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setForeground(Color.RED);
		lblDepartamentos.setBounds(159, 11, 203, 21);
		contentPane.add(lblDepartamentos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setVisible(false);
		btnSalir.addActionListener(new ActionListener() {
			private JComponent btnEntrar;

			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Se ha pulsado el boton salir");
				btnSalir.setVisible(false);
				btnEntrar.setVisible(true);
				btnEntrar.setEnabled(true);
			}
		});
		btnSalir.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 11));
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(159, 183, 89, 23);
		contentPane.add(btnSalir);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("Se ha pulsado el boton entrar");
			btnSalir.setVisible(true);
			btnEntrar.setEnabled(false);
			}
		});
		btnEntrar.setForeground(Color.RED);
		btnEntrar.setBounds(159, 115, 89, 23);
		contentPane.add(btnEntrar);
	}

}
