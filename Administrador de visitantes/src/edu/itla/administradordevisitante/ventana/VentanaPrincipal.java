package edu.itla.administradordevisitante.ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import edu.itla.administradordevisitante.controlador.ControladorEventListener;
import edu.itla.administradordevisitante.modelo.ModeloTablaEventosActuales;
import edu.itla.administradordevisitante.modelo.ModeloTablaVisitante;

import javax.swing.JTextArea;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = -499250313361610258L;
	private JPanel contentPane;
	private final JTabbedPane tabbedPane;
	private JPanel pnlVentanaPrincipal;
	private JPanel pnlEventos;
	private JPanel pnlVisitas;
	private JPanel pnlUsuario;
	private JPanel pnlAyuda;
	private JTextField txtNombreVisitante;
	private JTextField txtApellidoVisitante;
	private JTextField txtTelefonoVisitante;
	private JTextField txtdireccionVisitante;
	private JTextField txtNombreEvento;
	private JTextField txtUbicacionEvento;
	private JTextField txtNombreUsuario;
	private JTextField txtApellidoUsuario;
	private JTextField txtRegistroUsuario;
	private JTextField txtRegistroClave;
	private JLabel lblBienvenido;
	private JLabel lblGraciasPorUsar;
	private JLabel lblEventos;
	private JLabel lblVisitas;
	private JLabel lblNombreVisitante;
	private JLabel lblApellidoVisitante;
	private JLabel lblTelefonoVisitante;
	private JLabel lblDireccionVisitante;
	private JLabel lblSexoVisitante;
	private JLabel lblUsuario;
	private JLabel lblNombreUsuario;
	private JLabel lblApellidoUsuario;
	private JLabel lblClaveUsuario;
	private JLabel lblUsuarioUsuario;
	private JLabel lblPerfilUsuario;
	private JLabel lblNuevoUsuarios;
	private JLabel lblNombreEvento;
	private JLabel lblFechaEvento;
	private JLabel lblUbicacionEvento;
	private JLabel lblAnoEvento;
	private JLabel lblMesEvento;
	private JLabel lblDiaEvento;
	private JLabel lblHoraEvento;
	private JLabel lblAyuda;
	private JLabel lblSustituloBienvenida;
	private JLabel lblPreguntasMasFrecuentes;
	private JComboBox cbbSexoVisitante;
	private JComboBox cmxPerfil;
	private JComboBox cbbDiaEventos;
	private JComboBox cbbMesEventos;
	private JComboBox cbbAnoEventos;
	private JComboBox cbbHoraEventos;
	private JButton btnAgregarVisitante;
	private JButton btnModificarVisitante;
	private JButton btnEliminarVisitante;
	private JButton btnAgregarUsuario;
	private JButton btnModificarUsuario;
	private JButton btnEliminarUsuario;
	private JButton btnIngresarEvento;
	private JButton btnEventosActuales;
	private JButton btnProximosEventos;
	private JButton btnRegresarVisitante;
	private JButton btnGuardarVisitantes;
	private JButton btnRegresarEventos;
	private JButton btnGuardarEventos;
	private JPanel pnlIngresarEventos;
	private JPanel pnlOpcionesEventos;
	private JPanel pnlAgregarVisitante;
	private JPanel pnlOpcionesVisitantes;
	private JLabel lblSubTitutoVisitante;
	private JLabel lblSubTituloEvento;
	private JPanel pnlMenuUsuario;
	private JPanel pnlContenidoUsuario;
	private JButton btnCrearUsuario;
	private JTextField textField;
	private JScrollPane scrollPaneEventosActuales;
	private JTable tablaEventosActuales;
	private JTable tablaVisitantes;
	private ModeloTablaEventosActuales modelEvenosActuales;
	private ModeloTablaVisitante modelVisitantes;
	private JPanel pnlDesplegarVisitantesEvento;
	private JLabel lblBuscarVisitante;
	private JTextField txtBuscadorVisitante;
	private JLabel lblFiltrarBusqueda;
	private JComboBox comboBox;
	private JScrollPane scrollPaneVisitante;
	
	enum categoriaDeBusqueda{
		
		Nombre, Apellido
	}

	public VentanaPrincipal() {
		
		setTitle("Administrador de visitante");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10, 5, 810, 500);
		setResizable(false);
		setMinimumSize(new Dimension(1000, 720));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 1000, 720);
		contentPane.add(tabbedPane);
		
		//Modelos
		modelEvenosActuales = new ModeloTablaEventosActuales();	
		modelVisitantes = new ModeloTablaVisitante();
		
		pnlVentanaPrincipal = new JPanel();
		tabbedPane.addTab("Inicio", null, pnlVentanaPrincipal, null);
		pnlVentanaPrincipal.setLayout(null);
		
		lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setBounds(362, 11, 213, 53);
		lblBienvenido.setForeground(SystemColor.textHighlight);
		lblBienvenido.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlVentanaPrincipal.add(lblBienvenido);
		
		lblGraciasPorUsar = new JLabel("Gracias por usar el software mas completo...");
		lblGraciasPorUsar.setForeground(SystemColor.textHighlight);
		lblGraciasPorUsar.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblGraciasPorUsar.setBounds(226, 124, 486, 62);
		pnlVentanaPrincipal.add(lblGraciasPorUsar);
		
		lblSustituloBienvenida = new JLabel("Usuario");
		lblSustituloBienvenida.setForeground(SystemColor.textHighlight);
		lblSustituloBienvenida.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblSustituloBienvenida.setBounds(362, 85, 213, 28);
		pnlVentanaPrincipal.add(lblSustituloBienvenida);
		
		pnlVisitas = new JPanel();
		tabbedPane.addTab("Visitante", null, pnlVisitas, null);
		pnlVisitas.setLayout(null);
		
		lblVisitas = new JLabel("Visitante");
		lblVisitas.setBounds(382, 11, 164, 53);
		lblVisitas.setForeground(SystemColor.textHighlight);
		lblVisitas.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlVisitas.add(lblVisitas);
		
		pnlOpcionesVisitantes = new JPanel();
		pnlOpcionesVisitantes.setBounds(337, 75, 261, 188);
		pnlVisitas.add(pnlOpcionesVisitantes);
		pnlOpcionesVisitantes.setLayout(null);
		
		btnAgregarVisitante = new JButton("Agregar"); // Agreagar Visitante
		btnAgregarVisitante.addActionListener(new ControladorEventListener()); //Listener  *
		btnAgregarVisitante.setActionCommand("AgregarVisitante"); // Identifacador *
		btnAgregarVisitante.setBounds(92, 37, 86, 20);
		pnlOpcionesVisitantes.add(btnAgregarVisitante);
		
		btnModificarVisitante = new JButton("Modificar");
		btnModificarVisitante.setBounds(92, 82, 86, 20);
		pnlOpcionesVisitantes.add(btnModificarVisitante);
		
		btnEliminarVisitante = new JButton("Eliminar");
		btnEliminarVisitante.setBounds(92, 124, 86, 20);
		pnlOpcionesVisitantes.add(btnEliminarVisitante);
		
		pnlAgregarVisitante = new JPanel();
		pnlAgregarVisitante.setVisible(false);
		pnlAgregarVisitante.setBounds(73, 75, 826, 284);
		pnlVisitas.add(pnlAgregarVisitante);
		pnlAgregarVisitante.setLayout(null);
		
		cbbSexoVisitante = new JComboBox();
		cbbSexoVisitante.setBounds(411, 189, 99, 20);
		pnlAgregarVisitante.add(cbbSexoVisitante);
		cbbSexoVisitante.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Masculino", "Femenino"}));
		
		lblSexoVisitante = new JLabel("Sexo :");
		lblSexoVisitante.setBounds(343, 187, 61, 21);
		pnlAgregarVisitante.add(lblSexoVisitante);
		lblSexoVisitante.setForeground(SystemColor.textHighlight);
		lblSexoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtTelefonoVisitante = new JTextField();
		txtTelefonoVisitante.setBounds(207, 147, 135, 20);
		pnlAgregarVisitante.add(txtTelefonoVisitante);
		txtTelefonoVisitante.setColumns(10);
		
		lblTelefonoVisitante = new JLabel("Tel\u00E9fono :");
		lblTelefonoVisitante.setBounds(110, 146, 93, 21);
		pnlAgregarVisitante.add(lblTelefonoVisitante);
		lblTelefonoVisitante.setForeground(SystemColor.textHighlight);
		lblTelefonoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblNombreVisitante = new JLabel("Nombre :");
		lblNombreVisitante.setBounds(110, 93, 79, 21);
		pnlAgregarVisitante.add(lblNombreVisitante);
		lblNombreVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblNombreVisitante.setForeground(SystemColor.textHighlight);
		
		txtNombreVisitante = new JTextField();
		txtNombreVisitante.setBounds(207, 94, 135, 20);
		pnlAgregarVisitante.add(txtNombreVisitante);
		txtNombreVisitante.setColumns(10);
		
		lblApellidoVisitante = new JLabel("Apellido :");
		lblApellidoVisitante.setBounds(446, 93, 93, 21);
		pnlAgregarVisitante.add(lblApellidoVisitante);
		lblApellidoVisitante.setForeground(SystemColor.textHighlight);
		lblApellidoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtApellidoVisitante = new JTextField();
		txtApellidoVisitante.setBounds(555, 94, 150, 20);
		pnlAgregarVisitante.add(txtApellidoVisitante);
		txtApellidoVisitante.setColumns(10);
		
		txtdireccionVisitante = new JTextField();
		txtdireccionVisitante.setBounds(555, 147, 150, 20);
		pnlAgregarVisitante.add(txtdireccionVisitante);
		txtdireccionVisitante.setColumns(10);
		
		lblDireccionVisitante = new JLabel("Direcci\u00F3n :");
		lblDireccionVisitante.setBounds(446, 146, 99, 21);
		pnlAgregarVisitante.add(lblDireccionVisitante);
		lblDireccionVisitante.setForeground(SystemColor.textHighlight);
		lblDireccionVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnGuardarVisitantes = new JButton("Guardar");
		btnGuardarVisitantes.setVisible(false);
		btnGuardarVisitantes.setBounds(217, 253, 86, 20);
		pnlAgregarVisitante.add(btnGuardarVisitantes);
		
		btnRegresarVisitante = new JButton("Regresar");
		btnRegresarVisitante.setVisible(false);
		btnRegresarVisitante.setBounds(407, 253, 86, 20);
		pnlAgregarVisitante.add(btnRegresarVisitante);
		
		lblSubTitutoVisitante = new JLabel("SubTitulo");
		lblSubTitutoVisitante.setForeground(SystemColor.textHighlight);
		lblSubTitutoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblSubTitutoVisitante.setBounds(207, 11, 332, 37);
		pnlAgregarVisitante.add(lblSubTitutoVisitante);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setForeground(SystemColor.textHighlight);
		lblId.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblId.setBounds(110, 59, 48, 21);
		pnlAgregarVisitante.add(lblId);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setText("123456");
		textField.setBounds(159, 57, 48, 22);
		pnlAgregarVisitante.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("123456");
		textArea.setBounds(155, 59, 61, 22);

		pnlEventos = new JPanel();
		tabbedPane.addTab("Eventos", null, pnlEventos, null);
		pnlEventos.setLayout(null);
	
		
		lblEventos = new JLabel("Eventos");
		lblEventos.setBounds(396, 11, 146, 53);
		pnlEventos.add(lblEventos);
		lblEventos.setForeground(SystemColor.textHighlight);
		lblEventos.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		
		pnlIngresarEventos = new JPanel();
		pnlIngresarEventos.setVisible(false);
		
		lblSubTituloEvento = new JLabel("SubTitulo");
		lblSubTituloEvento.setVisible(false);
		lblSubTituloEvento.setBounds(255, 60, 332, 37);
		pnlEventos.add(lblSubTituloEvento);
		lblSubTituloEvento.setForeground(SystemColor.textHighlight);
		lblSubTituloEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		
		pnlDesplegarVisitantesEvento = new JPanel();
		pnlDesplegarVisitantesEvento.setBounds(37, 108, 729, 341);
		pnlEventos.add(pnlDesplegarVisitantesEvento);
		pnlDesplegarVisitantesEvento.setLayout(null);
		
		scrollPaneVisitante = new JScrollPane();
		scrollPaneVisitante.setBounds(50, 100, 309, 220);
		pnlDesplegarVisitantesEvento.add(scrollPaneVisitante);
		
		tablaVisitantes = new JTable();
		tablaVisitantes.setModel(modelVisitantes);
		scrollPaneVisitante.setViewportView(tablaVisitantes);
		
		lblBuscarVisitante = new JLabel("Buscar :");
		lblBuscarVisitante.setBounds(12, 45, 48, 16);
		pnlDesplegarVisitantesEvento.add(lblBuscarVisitante);
		
		txtBuscadorVisitante = new JTextField();
		txtBuscadorVisitante.setBounds(72, 44, 148, 20);
		pnlDesplegarVisitantesEvento.add(txtBuscadorVisitante);
		txtBuscadorVisitante.setColumns(10);
		
		lblFiltrarBusqueda = new JLabel("Filtar Busqueda");
		lblFiltrarBusqueda.setBounds(232, 47, 90, 14);
		pnlDesplegarVisitantesEvento.add(lblFiltrarBusqueda);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(categoriaDeBusqueda.values()));
		comboBox.setBounds(334, 44, 77, 20);
		pnlDesplegarVisitantesEvento.add(comboBox);
		
		pnlOpcionesEventos = new JPanel();
		pnlOpcionesEventos.setVisible(false);
		pnlOpcionesEventos.setBounds(340, 62, 246, 224);
		pnlEventos.add(pnlOpcionesEventos);
		pnlOpcionesEventos.setLayout(null);
		
		btnEventosActuales = new JButton("Eventos actuales");
		btnEventosActuales.setBounds(57, 48, 137, 25);
		pnlOpcionesEventos.add(btnEventosActuales);
		
		btnProximosEventos = new JButton("Pr\u00F3ximos Eventos");
		btnProximosEventos.setBounds(57, 93, 137, 25);
		pnlOpcionesEventos.add(btnProximosEventos);
		
		btnIngresarEvento = new JButton("Ingresar Evento");
		btnIngresarEvento.setBounds(57, 135, 137, 25);
		pnlOpcionesEventos.add(btnIngresarEvento);
		pnlIngresarEventos.setBounds(75, 62, 681, 297);
		pnlEventos.add(pnlIngresarEventos);
		pnlIngresarEventos.setLayout(null);
		
		lblUbicacionEvento = new JLabel("Ubicacion : ");
		lblUbicacionEvento.setBounds(170, 150, 113, 21);
		pnlIngresarEventos.add(lblUbicacionEvento);
		lblUbicacionEvento.setForeground(SystemColor.textHighlight);
		lblUbicacionEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtUbicacionEvento = new JTextField();
		txtUbicacionEvento.setBounds(293, 149, 341, 25);
		pnlIngresarEventos.add(txtUbicacionEvento);
		
		lblHoraEvento = new JLabel("Hora :");
		lblHoraEvento.setBounds(170, 193, 66, 16);
		pnlIngresarEventos.add(lblHoraEvento);
		lblHoraEvento.setForeground(SystemColor.textHighlight);
		lblHoraEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cbbHoraEventos = new JComboBox();
		cbbHoraEventos.setBounds(293, 193, 83, 21);
		pnlIngresarEventos.add(cbbHoraEventos);
		
		cbbDiaEventos = new JComboBox();
		cbbDiaEventos.setBounds(345, 105, 55, 21);
		pnlIngresarEventos.add(cbbDiaEventos);
		
		lblDiaEvento = new JLabel("D\u00EDa :");
		lblDiaEvento.setBounds(293, 109, 55, 16);
		pnlIngresarEventos.add(lblDiaEvento);
		lblDiaEvento.setForeground(SystemColor.textHighlight);
		lblDiaEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblFechaEvento = new JLabel("Fecha : ");
		lblFechaEvento.setBounds(170, 104, 72, 21);
		pnlIngresarEventos.add(lblFechaEvento);
		lblFechaEvento.setForeground(SystemColor.textHighlight);
		lblFechaEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblMesEvento = new JLabel("Mes :");
		lblMesEvento.setBounds(405, 109, 55, 16);
		pnlIngresarEventos.add(lblMesEvento);
		lblMesEvento.setForeground(SystemColor.textHighlight);
		lblMesEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cbbMesEventos = new JComboBox();
		cbbMesEventos.setBounds(465, 105, 55, 21);
		pnlIngresarEventos.add(cbbMesEventos);
		
		lblAnoEvento = new JLabel("A\u00F1o :");
		lblAnoEvento.setBounds(525, 106, 55, 16);
		pnlIngresarEventos.add(lblAnoEvento);
		lblAnoEvento.setForeground(SystemColor.textHighlight);
		lblAnoEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cbbAnoEventos = new JComboBox();
		cbbAnoEventos.setBounds(573, 105, 61, 21);
		pnlIngresarEventos.add(cbbAnoEventos);
		
		txtNombreEvento = new JTextField();
		txtNombreEvento.setBounds(293, 56, 341, 25);
		pnlIngresarEventos.add(txtNombreEvento);
		txtNombreEvento.setVisible(false);
		txtNombreEvento.setColumns(10);
		txtNombreEvento.setColumns(10);
		txtNombreEvento.setColumns(10);
		
		lblNombreEvento = new JLabel("Nombre :");
		lblNombreEvento.setBounds(170, 56, 113, 21);
		pnlIngresarEventos.add(lblNombreEvento);
		lblNombreEvento.setVisible(false);
		lblNombreEvento.setForeground(SystemColor.textHighlight);
		lblNombreEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnRegresarEventos = new JButton("Regresar");
		btnRegresarEventos.setBounds(434, 253, 86, 20);
		pnlIngresarEventos.add(btnRegresarEventos);
		
		btnGuardarEventos = new JButton("Guardar");
		btnGuardarEventos.setBounds(244, 253, 86, 20);
		pnlIngresarEventos.add(btnGuardarEventos);
		
		JPanel pnlEventosActuales = new JPanel();
		pnlEventosActuales.setVisible(false);
		pnlEventosActuales.setBounds(75, 366, 681, 215);
		pnlEventos.add(pnlEventosActuales);
		pnlEventosActuales.setLayout(null);
		
		scrollPaneEventosActuales = new JScrollPane();
		scrollPaneEventosActuales.setBounds(100, 24, 526, 123);
		pnlEventosActuales.add(scrollPaneEventosActuales);
		
		tablaEventosActuales = new JTable();
		tablaEventosActuales.setModel(modelEvenosActuales);
		scrollPaneEventosActuales.setViewportView(tablaEventosActuales);
		
		JButton btnSeleccionarEvento = new JButton("Aceptar");
		btnSeleccionarEvento.setBounds(293, 160, 95, 25);
		pnlEventosActuales.add(btnSeleccionarEvento);
		
		pnlUsuario = new JPanel();
		tabbedPane.addTab("Usuario", null, pnlUsuario, null);
		pnlUsuario.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(388, 11, 152, 53);
		lblUsuario.setForeground(SystemColor.textHighlight);
		lblUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlUsuario.add(lblUsuario);
		
		pnlMenuUsuario = new JPanel();
		pnlMenuUsuario.setBounds(337, 75, 261, 188);
		pnlUsuario.add(pnlMenuUsuario);
		pnlMenuUsuario.setLayout(null);
		
		btnEliminarUsuario = new JButton("Eliminar");
		btnEliminarUsuario.setBounds(92, 98, 86, 20);
		pnlMenuUsuario.add(btnEliminarUsuario);
		
		btnModificarUsuario = new JButton("Modificar");
		btnModificarUsuario.setBounds(92, 56, 86, 20);
		pnlMenuUsuario.add(btnModificarUsuario);
		
		btnAgregarUsuario = new JButton("Agregar");
		btnAgregarUsuario.setBounds(92, 11, 86, 20);
		pnlMenuUsuario.add(btnAgregarUsuario);
		
		pnlContenidoUsuario = new JPanel();
		pnlContenidoUsuario.setVisible(false);
		pnlContenidoUsuario.setBounds(41, 35, 670, 271);
		pnlUsuario.add(pnlContenidoUsuario);
		pnlContenidoUsuario.setLayout(null);
		
		lblUsuarioUsuario = new JLabel("Usuario :");
		lblUsuarioUsuario.setBounds(10, 128, 93, 21);
		pnlContenidoUsuario.add(lblUsuarioUsuario);
		lblUsuarioUsuario.setForeground(SystemColor.textHighlight);
		lblUsuarioUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtRegistroUsuario = new JTextField();
		txtRegistroUsuario.setBounds(107, 129, 135, 20);
		pnlContenidoUsuario.add(txtRegistroUsuario);
		txtRegistroUsuario.setColumns(10);
		
		lblPerfilUsuario = new JLabel("Perfil :");
		lblPerfilUsuario.setBounds(205, 182, 65, 21);
		pnlContenidoUsuario.add(lblPerfilUsuario);
		lblPerfilUsuario.setForeground(SystemColor.textHighlight);
		lblPerfilUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cmxPerfil = new JComboBox();
		cmxPerfil.setBounds(301, 183, 135, 20);
		pnlContenidoUsuario.add(cmxPerfil);
		cmxPerfil.setVisible(true);
		cmxPerfil.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Administrador", "Portero"}));
		
		txtRegistroClave = new JTextField();
		txtRegistroClave.setBounds(432, 129, 150, 20);
		pnlContenidoUsuario.add(txtRegistroClave);
		txtRegistroClave.setColumns(10);
		
		lblClaveUsuario = new JLabel("Clave :");
		lblClaveUsuario.setBounds(323, 128, 99, 21);
		pnlContenidoUsuario.add(lblClaveUsuario);
		lblClaveUsuario.setVisible(true);
		lblClaveUsuario.setForeground(SystemColor.textHighlight);
		lblClaveUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtApellidoUsuario = new JTextField();
		txtApellidoUsuario.setBounds(432, 76, 150, 20);
		txtApellidoUsuario.setVisible(true);
		pnlContenidoUsuario.add(txtApellidoUsuario);
		txtApellidoUsuario.setColumns(10);
		
		lblApellidoUsuario = new JLabel("Apellido :");
		lblApellidoUsuario.setBounds(323, 75, 93, 21);
		pnlContenidoUsuario.add(lblApellidoUsuario);
		lblApellidoUsuario.setVisible(true);
		lblApellidoUsuario.setForeground(SystemColor.textHighlight);
		lblApellidoUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblNuevoUsuarios = new JLabel("Nuevo usuario");
		lblNuevoUsuarios.setBounds(199, 11, 165, 53);
		pnlContenidoUsuario.add(lblNuevoUsuarios);
		lblNuevoUsuarios.setVisible(false);
		lblNuevoUsuarios.setForeground(SystemColor.textHighlight);
		lblNuevoUsuarios.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(107, 76, 135, 20);
		pnlContenidoUsuario.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		lblNombreUsuario = new JLabel("Nombre :");
		lblNombreUsuario.setBounds(10, 75, 79, 21);
		pnlContenidoUsuario.add(lblNombreUsuario);
		lblNombreUsuario.setForeground(SystemColor.textHighlight);
		lblNombreUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnCrearUsuario = new JButton("Aceptar");
		btnCrearUsuario.setBounds(259, 237, 89, 23);
		pnlContenidoUsuario.add(btnCrearUsuario);
		
		pnlAyuda = new JPanel();
		tabbedPane.addTab("Ayuda", null, pnlAyuda, null);
		pnlAyuda.setLayout(null);
		
		lblAyuda = new JLabel("Ayuda");
		lblAyuda.setBounds(409, 5, 111, 53);
		lblAyuda.setForeground(SystemColor.textHighlight);
		lblAyuda.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlAyuda.add(lblAyuda);
		
		lblPreguntasMasFrecuentes = new JLabel("Preguntas mas Frecuentes...");
		lblPreguntasMasFrecuentes.setForeground(SystemColor.textHighlight);
		lblPreguntasMasFrecuentes.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblPreguntasMasFrecuentes.setBounds(303, 70, 322, 53);
		pnlAyuda.add(lblPreguntasMasFrecuentes);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public JPanel getPnlVentanaPrincipal() {
		return pnlVentanaPrincipal;
	}

	public JPanel getPnlEventos() {
		return pnlEventos;
	}

	public JPanel getPnlVisitas() {
		return pnlVisitas;
	}

	public JPanel getPnlUsuario() {
		return pnlUsuario;
	}

	public JPanel getPnlAyuda() {
		return pnlAyuda;
	}

	public JTextField getTxtNombreVisitante() {
		return txtNombreVisitante;
	}

	public JTextField getTxtApellidoVisitante() {
		return txtApellidoVisitante;
	}

	public JTextField getTxtTelefonoVisitante() {
		return txtTelefonoVisitante;
	}

	public JTextField getTxtdireccionVisitante() {
		return txtdireccionVisitante;
	}

	public JTextField getTxtNombreEvento() {
		return txtNombreEvento;
	}

	public JTextField getTxtUbicacionEvento() {
		return txtUbicacionEvento;
	}

	public JTextField getTxtNombreUsuario() {
		return txtNombreUsuario;
	}

	public JTextField getTxtApellidoUsuario() {
		return txtApellidoUsuario;
	}

	public JTextField getTxtRegistroUsuario() {
		return txtRegistroUsuario;
	}

	public JTextField getTxtRegistroClave() {
		return txtRegistroClave;
	}

	public JLabel getLabel() {
		return lblBienvenido;
	}

	public JLabel getLblGraciasPorUsar() {
		return lblGraciasPorUsar;
	}

	public JLabel getLblEventos() {
		return lblEventos;
	}

	public JLabel getLblVisitas() {
		return lblVisitas;
	}

	public JLabel getLblNombreVisitante() {
		return lblNombreVisitante;
	}

	public JLabel getLblApellidoVisitante() {
		return lblApellidoVisitante;
	}

	public JLabel getLblTelefonoVisitante() {
		return lblTelefonoVisitante;
	}

	public JLabel getLblDireccionVisitante() {
		return lblDireccionVisitante;
	}

	public JLabel getLblSexoVisitante() {
		return lblSexoVisitante;
	}

	public JLabel getLblUsuario() {
		return lblUsuario;
	}

	public JLabel getLblNombreUsuario() {
		return lblNombreUsuario;
	}

	public JLabel getLblApellidoUsuario() {
		return lblApellidoUsuario;
	}

	public JLabel getLblClaveUsuario() {
		return lblClaveUsuario;
	}

	public JLabel getLblUsuarioUsuario() {
		return lblUsuarioUsuario;
	}

	public JLabel getLblPerfilUsuario() {
		return lblPerfilUsuario;
	}

	public JLabel getLblNuevoUsuarios() {
		return lblNuevoUsuarios;
	}

	public JLabel getLblNombreEvento() {
		return lblNombreEvento;
	}

	public JLabel getLblFechaEvento() {
		return lblFechaEvento;
	}

	public JLabel getLblUbicacionEvento() {
		return lblUbicacionEvento;
	}

	public JLabel getLblAnoEvento() {
		return lblAnoEvento;
	}

	public JLabel getLblMesEvento() {
		return lblMesEvento;
	}

	public JLabel getLblDiaEvento() {
		return lblDiaEvento;
	}

	public JLabel getLblHoraEvento() {
		return lblHoraEvento;
	}

	public JLabel getLblAyuda() {
		return lblAyuda;
	}

	public JLabel getLblPreguntasMasFrecuentes() {
		return lblPreguntasMasFrecuentes;
	}

	public JComboBox getCbbSexoVisitante() {
		return cbbSexoVisitante;
	}

	public JComboBox getCmxPerfil() {
		return cmxPerfil;
	}

	public JComboBox getCbbDiaEventos() {
		return cbbDiaEventos;
	}

	public JComboBox getCbbMesEventos() {
		return cbbMesEventos;
	}

	public JComboBox getCbbAnoEventos() {
		return cbbAnoEventos;
	}

	public JComboBox getCbbHoraEventos() {
		return cbbHoraEventos;
	}

	public JButton getBtnAgregarVisitante() {
		return btnAgregarVisitante;
	}

	public JButton getBtnModificarVisitante() {
		return btnModificarVisitante;
	}

	public JButton getBtnEliminarVisitante() {
		return btnEliminarVisitante;
	}

	public JButton getBtnAgregarUsuario() {
		return btnAgregarUsuario;
	}

	public JButton getBtnModificarUsuario() {
		return btnModificarUsuario;
	}

	public JButton getBtnEliminarUsuario() {
		return btnEliminarUsuario;
	}

	public JButton getBtnIngresarEvento() {
		return btnIngresarEvento;
	}

	public JButton getBtnEventosActuales() {
		return btnEventosActuales;
	}

	public JButton getBtnProximosEventos() {
		return btnProximosEventos;
	}

	public JButton getBtnRegresarVisitante() {
		return btnRegresarVisitante;
	}

	public JButton getBtnGuardarVisitantes() {
		return btnGuardarVisitantes;
	}

	public JButton getBtnRegresarEventos() {
		return btnRegresarEventos;
	}

	public JButton getBtnGuardarEventos() {
		return btnGuardarEventos;
	}

	public JPanel getPnlIngresarEventos() {
		return pnlIngresarEventos;
	}

	public JPanel getPnlOpcionesEventos() {
		return pnlOpcionesEventos;
	}

	public JPanel getPnlAgregarVisitante() {
		return pnlAgregarVisitante;
	}

	public JPanel getPnlOpcionesVisitantes() {
		return pnlOpcionesVisitantes;
	}

	public JLabel getLblSubTitutoVisitante() {
		return lblSubTitutoVisitante;
	}

	public JLabel getLblSubTituloEvento() {
		return lblSubTituloEvento;
	}

	public JPanel getPnlMenuUsuario() {
		return pnlMenuUsuario;
	}

	public JPanel getPnlContenidoUsuario() {
		return pnlContenidoUsuario;
	}

	public JButton getBtnCrearUsuario() {
		return btnCrearUsuario;
	}

	public JLabel getLblSustituloBienvenida() {
		return lblSustituloBienvenida;
	}
}
