package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class FomularioCliente {

	private JFrame frmNuevoCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FomularioCliente window = new FomularioCliente();
					window.frmNuevoCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FomularioCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevoCliente = new JFrame();
		frmNuevoCliente.setTitle("Nuevo Cliente");
		frmNuevoCliente.setBounds(100, 100, 450, 300);
		frmNuevoCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuevoCliente.getContentPane().setLayout(null);
		
		JLabel lblIdCliente = new JLabel("ID Cliente");
		lblIdCliente.setBounds(12, 12, 91, 15);
		frmNuevoCliente.getContentPane().add(lblIdCliente);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(121, 10, 56, 19);
		frmNuevoCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 39, 70, 15);
		frmNuevoCliente.getContentPane().add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 37, 150, 19);
		frmNuevoCliente.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefono");
		lblNewLabel.setBounds(12, 66, 70, 15);
		frmNuevoCliente.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 68, 91, 19);
		frmNuevoCliente.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(12, 93, 70, 15);
		frmNuevoCliente.getContentPane().add(lblCelular);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 91, 91, 19);
		frmNuevoCliente.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(12, 124, 70, 15);
		frmNuevoCliente.getContentPane().add(lblDireccion);
		
		textField_4 = new JTextField();
		textField_4.setBounds(121, 122, 199, 19);
		frmNuevoCliente.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo");
		lblNewLabel_1.setBounds(12, 155, 70, 15);
		frmNuevoCliente.getContentPane().add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(121, 153, 199, 19);
		frmNuevoCliente.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblObervaciones = new JLabel("Obervaciones");
		lblObervaciones.setBounds(12, 243, 109, 15);
		frmNuevoCliente.getContentPane().add(lblObervaciones);
		
		textField_6 = new JTextField();
		textField_6.setBounds(121, 239, 199, 19);
		frmNuevoCliente.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxDescuentoPermanente = new JCheckBox("Descuento Permanente");
		chckbxDescuentoPermanente.setBounds(12, 187, 200, 23);
		frmNuevoCliente.getContentPane().add(chckbxDescuentoPermanente);
		
		JCheckBox chckbxCredito = new JCheckBox("Credito");
		chckbxCredito.setBounds(12, 214, 129, 23);
		frmNuevoCliente.getContentPane().add(chckbxCredito);
	}
}
