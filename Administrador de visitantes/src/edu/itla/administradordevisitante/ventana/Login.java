package edu.itla.administradordevisitante.ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTabbedPane;

import edu.itla.administradordevisitante.controlador.ControladorEventListener;

public class Login extends JFrame {

	private static final long serialVersionUID = -60578525879179199L;
	private JPanel contentPane, pnlLogin;
	private JTextField txtNombreUsuario;
	private JTextField txtApellidoUsuario;
    private JTabbedPane tabbedPane;
    private JLabel lblNombreUsuario;
    private JLabel lblApellidoUsuario;
    private JLabel lblNewLabel;
    private JButton btnInsetarUsuario;
    private JButton btnSalirUsuario;

	public Login() {
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(0);
		setBounds(100, 100, 359, 204);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 349, 172);
		contentPane.add(tabbedPane);
		
		pnlLogin = new JPanel();
		tabbedPane.addTab("Login", null, pnlLogin, null);
		pnlLogin.setLayout(null);
		
		btnInsetarUsuario = new JButton("Aceptar");
		btnInsetarUsuario.setBounds(146, 102, 89, 23);
		pnlLogin.add(btnInsetarUsuario);
		
		btnSalirUsuario = new JButton("Salir");
		btnSalirUsuario.setBounds(245, 102, 89, 23);
		btnSalirUsuario.addActionListener(new ControladorEventListener());
		btnSalirUsuario.setActionCommand("Salir");
		pnlLogin.add(btnSalirUsuario);
		
		txtApellidoUsuario = new JTextField();
		txtApellidoUsuario.setBounds(192, 71, 142, 20);
		pnlLogin.add(txtApellidoUsuario);
		txtApellidoUsuario.setColumns(10);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(192, 25, 142, 20);
		pnlLogin.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		lblNombreUsuario = new JLabel("Usuario");
		lblNombreUsuario.setBounds(146, 28, 46, 14);
		pnlLogin.add(lblNombreUsuario);
		
		lblApellidoUsuario = new JLabel("Apellido");
		lblApellidoUsuario.setBounds(146, 74, 46, 14);
		pnlLogin.add(lblApellidoUsuario);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 0, 137, 143);
		pnlLogin.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/edu/itla/administradordeevento/imagenes/login (Copiar)1.gif")));
	}
}
