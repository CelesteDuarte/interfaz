package interfaz;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Listas.*;


public class frame extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setTitle("Train Simulator 1885");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton NewButton1 = new JButton("Ejecutar");
		NewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lista lista=new Lista();
				lista.Agregar(1, "1");
				lista.Agregar(10, "2");
				lista.Agregar(30, "3");
				lista.Imprimir( );
				System.out.println(lista.Tamano());
				lista.Eliminar();
				lista.eliminar();
			}
		});
		contentPane.add(NewButton1, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Retroceder");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Avanzar");
		contentPane.add(btnNewButton_1, BorderLayout.EAST);
	}
}

