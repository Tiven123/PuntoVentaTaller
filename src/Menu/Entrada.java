package Menu;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Entrada {

	private JFrame frmSaoaTec;
	private JTextField txUsuario;
	private JPasswordField pastxContrasena;
	private JLabel lblBienvenido;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnIniciar;

	/**
	 * Create the application.
	 */
	public Entrada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
//-----------------------------Frame---------------------------------------
		frmSaoaTec = new JFrame();
		frmSaoaTec.setTitle("SAOA TEC");
		frmSaoaTec.setBounds(0, 0, 300, 300);
		frmSaoaTec.setLocationRelativeTo(null);
		frmSaoaTec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaoaTec.getContentPane().setLayout(null);
		
//------------------------------Labels---------------------------------------
		lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setBounds(107, 12, 89, 15);
		frmSaoaTec.getContentPane().add(lblBienvenido);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(49, 68, 70, 15);
		frmSaoaTec.getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(50, 136, 89, 15);
		frmSaoaTec.getContentPane().add(lblContrasea);
		
//-----------------------------TextFiel---------------------------------------
		txUsuario = new JTextField();
		txUsuario.setBounds(152, 66, 100, 19);
		frmSaoaTec.getContentPane().add(txUsuario);
		txUsuario.setColumns(10);

//-----------------------------Button---------------------------------------
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(83, 208, 117, 25);
		frmSaoaTec.getContentPane().add(btnIniciar);

//-----------------------------PasswordTextFiel---------------------------------
		pastxContrasena = new JPasswordField();
		pastxContrasena.setBounds(152, 134, 100, 19);
		frmSaoaTec.getContentPane().add(pastxContrasena);
		
		frmSaoaTec.setVisible(true);
	}
}
