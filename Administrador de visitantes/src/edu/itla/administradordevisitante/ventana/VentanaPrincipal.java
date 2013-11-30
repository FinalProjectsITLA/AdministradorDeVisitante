package edu.itla.administradordevisitante.ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
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

import edu.itla.administradordevisitante.controlador.ControladorDelMenu;
import edu.itla.administradordevisitante.controlador.ControladorEventListener;
import edu.itla.administradordevisitante.modelo.ModeloTablaEventosActuales;
import edu.itla.administradordevisitante.modelo.ModeloTablaEventosProximos;
import edu.itla.administradordevisitante.modelo.ModeloTablaVisitante;
import edu.itla.administradordevisitante.modelo.ModeloTablaVisitanteInvitaciones;

import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;

import com.toedter.calendar.JCalendar;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import edu.itla.administradordevisitante.ventana.VentanaPrincipal.categoriaDeBusqueda;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = -499250313361610258L;
	private JPanel contentPane;
	private final JTabbedPane tabbedPane;
	private JPanel pnlVentanaPrincipal;
	private JPanel pnlEventos;
	private JPanel pnlVisitas;
	private JPanel pnlUsuario;
	private JPanel pnlInvitaciones;
	private JTextField txtNombreVisitante;
	private JTextField txtApellidoVisitante;
	private JTextField txtTelefonoVisitante;
	private JTextField txtDireccionVisitante;
	private JTextField txtNombreEvento;
	private JTextField txtUbicacionEvento;
	private JTextField txtNombreUsuario;
	private JTextField txtApellidoUsuario;
	private JTextField txtUsuarioUsuario;
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
	private JLabel lblSubtituloUsuario;
	private JLabel lblNombreEvento;
	private JLabel lblFechaEvento;
	private JLabel lblUbicacionEvento;
	private JLabel lblHoraEvento;
	private JLabel lblInvitaciones;
	private JLabel lblSustituloBienvenida;
	private JLabel lblSubtituloInvitaciones;
	private JComboBox cbbSexoVisitante;
	private JComboBox cmxPerfil;
	private JComboBox cbbHoraEventos;
	private JButton btnAgregarVisitante;
	private JButton btnModificarVisitante;
	private JButton btnEliminarVisitante;
	private JButton btnAgregarUsuario;
	private JButton btnModificarUsuario;
	private JButton btnEliminarOpcionUsuario;
	private JButton btnAgregarOpcionEvento;
	private JButton btnEventosActuales;
	private JButton btnProximosEventos;
	private JButton btnRegresarVisitante;
	private JButton btnGuardarVisitantes;
	private JButton btnRegresarEventos;
	private JButton btnGuardarEvento;
	private JButton btnBuscadorIDvisitante;
	private JButton btnGuardarCambiosVisitante;
	private JButton btnEliminarEditorVistante;
	private JPanel pnlEditorEventos;
	private JPanel pnlOpcionesEventos;
	private JPanel pnlEditorDeVisitante;
	private JPanel pnlOpcionesVisitantes;
	private JLabel lblSubTitutoVisitante;
	private JLabel lblSubTituloEvento;
	private JPanel pnlOpcionUsuario;
	private JPanel pnlEditorUsuario;
	private JButton btnGuardarUsuario;
	private JTextField txtIDvisitante;
	private JScrollPane scrollPaneEventosActuales;
	private JTable tablaEventosActuales;
	private JTable tablaVisitantes;
	private JTable tablaProximosEventos;
	private ModeloTablaEventosActuales modelEvenosActuales;
	private ModeloTablaVisitante modelVisitantes;
	private ModeloTablaEventosProximos modelProximosEventos;
	private ModeloTablaVisitanteInvitaciones modeloVisitantesInvitacion;
	private JPanel pnlDesplegarVisitantesEvento;
	private JPanel pnlEventosActuales;
	private JLabel lblBuscarVisitante;
	private JTextField txtBuscadorVisitante;
	private JLabel lblFiltrarBusqueda;
	private JComboBox comboBox;
	private JScrollPane scrollPaneVisitante;
	private JScrollPane scrollPaneProximosEventos;
	private JScrollPane scrollPaneVisitantesInvitaciones;
	private JButton btnRegresarEventosActuales;
	private JPanel pnlProximosEventos;
	private JButton btnRegresarProximosEventos;
	private JButton btnModificarOpcionEvento;
	private JButton btnFechaEvento;
	private JButton btnEliminarOpcionEvento;
	private JButton btnGuardarCambiosEvento;
	private JButton btnEliminarEvento;
	private JButton btnBuscarIDevento;
	private JFormattedTextField txtHoraEvento;
	JCalendar calendario;
	private JTextField txtFechaEvento;
	private JTextField txtIDevento;
	private JButton btnGuardarCambiosUsuario;
	private JButton btnEliminarUsuario;
	private JLabel lblId_1;
	private JTextField txtIDusuario;
	private JButton btnBuscarUsuario;
	private JPasswordField txtClaveUsuario;
	private JButton btnRegresarUsuario;
	private JPanel pnlOpcionesInvitaciones;
	private JButton btnCrearInvitaciones;
	private JButton btnModificarInvitaciones;
	private JButton btnEliminarOpcionInvitaciones;
	private JPanel pnlRegistro;
	private JPanel pnlEditorInvitaciones;
	private JLabel lblIDeventoVIsitante;
	private JFormattedTextField txtIDeventoInvitaciones;
	private JButton btnIDeventoInvitaciones;
	private JTextField txtNombreEventoInvitaciones;
	private JLabel lblEvento;
	private JLabel lblInvitacionNo;
	private JFormattedTextField txtNumeroInvitacion;
	private JLabel lblVisitantes;
	private JButton bntBuscarVisitanteEvento;
	private JTextField txtBuscarVitanteInvitaciones;
	private JButton btnInvitarInvitaciones;
	private JButton btnNumeroInvitaciones;
	private JButton btnGuardarCambiosInvitaciones;
	private JButton btnEliminarIvitacion;
	private JComboBox cbbFiltrarVisitanteInvitaciones;
	private JButton btnBuscarInvitadosInvitaciones;
	private JButton btnRegresarInvitaciones;
	private JTable tablaVisitantesInvitaciones;
	private JPanel pnlAyuda;
	private JPanel pnlConfiguracion;
	private JPanel pnlOpcionRegistro;
	private JLabel lblRegistro;
	private JButton btnRegistrarVisitas;
	private JButton btnRegistrarVisitasImprevistas;
	private JPanel pnlEditorRegistro;
	private JLabel lblSubtituloRegistro;
	private JLabel lblNombreEventoRegistro;
	private JTextField txtNombreEventoRegistro;
	private JLabel lblIdEventoRegistro;
	private JTextField txtIDEventoRegistro;
	private JLabel lblVisitantesPorLlegar;
	private JTextField txtFaltanVisitantesReistro;
	private JLabel lblBuscarRegistro;
	private JTextField txtBuscarRegistro;
	private JLabel label_2;
	private JComboBox cbbFiltrarBusquedaRegistro;
	private JButton bntBuscarRegistro;
	private JScrollPane scrollPaneVisitantesRegistro;
	private JTable tablaVisitantesRegistro;
	
	enum categoriaDeBusqueda{
		
		Todos, Nombre, Apellido
	}

	public VentanaPrincipal() throws ParseException {
		
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
		tabbedPane.addChangeListener(new ControladorDelMenu());
		contentPane.add(tabbedPane);
		
		//Modelos
		modelEvenosActuales = new ModeloTablaEventosActuales();	
		modelVisitantes = new ModeloTablaVisitante();
		modelProximosEventos = new ModeloTablaEventosProximos();
		modeloVisitantesInvitacion = new ModeloTablaVisitanteInvitaciones();
		
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
		
		JTextArea textArea = new JTextArea();
		textArea.setText("123456");
		textArea.setBounds(155, 59, 61, 22);
		
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
		btnModificarVisitante.addActionListener(new ControladorEventListener());
		btnModificarVisitante.setActionCommand("ModificarVisitante");
		pnlOpcionesVisitantes.add(btnModificarVisitante);
		
		btnEliminarVisitante = new JButton("Eliminar");
		btnEliminarVisitante.setBounds(92, 124, 86, 20);
		btnEliminarVisitante.addActionListener(new ControladorEventListener());
		btnEliminarVisitante.setActionCommand("EliminarVisitante");
		pnlOpcionesVisitantes.add(btnEliminarVisitante);
		
		pnlEditorDeVisitante = new JPanel();
		pnlEditorDeVisitante.setVisible(false);
		pnlEditorDeVisitante.setBounds(73, 75, 826, 284);
		pnlVisitas.add(pnlEditorDeVisitante);
		pnlEditorDeVisitante.setLayout(null);
		
		cbbSexoVisitante = new JComboBox();
		cbbSexoVisitante.setBounds(411, 189, 99, 20);
		cbbSexoVisitante.addItem("Seleccionar");
		cbbSexoVisitante.addItem("Masculino");
		cbbSexoVisitante.addItem("Femenino");
		//cbbSexoVisitante.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Masculino", "Femenino"}));
		pnlEditorDeVisitante.add(cbbSexoVisitante);
		
		lblSexoVisitante = new JLabel("Sexo :");
		lblSexoVisitante.setBounds(343, 187, 61, 21);
		pnlEditorDeVisitante.add(lblSexoVisitante);
		lblSexoVisitante.setForeground(SystemColor.textHighlight);
		lblSexoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtTelefonoVisitante = new JTextField();
		txtTelefonoVisitante.setBounds(207, 147, 135, 20);
		pnlEditorDeVisitante.add(txtTelefonoVisitante);
		txtTelefonoVisitante.setColumns(10);
		
		lblTelefonoVisitante = new JLabel("Tel\u00E9fono :");
		lblTelefonoVisitante.setBounds(110, 146, 93, 21);
		pnlEditorDeVisitante.add(lblTelefonoVisitante);
		lblTelefonoVisitante.setForeground(SystemColor.textHighlight);
		lblTelefonoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblNombreVisitante = new JLabel("Nombre :");
		lblNombreVisitante.setBounds(110, 93, 79, 21);
		pnlEditorDeVisitante.add(lblNombreVisitante);
		lblNombreVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblNombreVisitante.setForeground(SystemColor.textHighlight);
		
		txtNombreVisitante = new JTextField();
		txtNombreVisitante.setBounds(207, 94, 135, 20);
		pnlEditorDeVisitante.add(txtNombreVisitante);
		txtNombreVisitante.setColumns(10);
		
		lblApellidoVisitante = new JLabel("Apellido :");
		lblApellidoVisitante.setBounds(446, 93, 93, 21);
		pnlEditorDeVisitante.add(lblApellidoVisitante);
		lblApellidoVisitante.setForeground(SystemColor.textHighlight);
		lblApellidoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtApellidoVisitante = new JTextField();
		txtApellidoVisitante.setBounds(555, 94, 150, 20);
		pnlEditorDeVisitante.add(txtApellidoVisitante);
		txtApellidoVisitante.setColumns(10);
		
		txtDireccionVisitante = new JTextField();
		txtDireccionVisitante.setBounds(555, 147, 150, 20);
		pnlEditorDeVisitante.add(txtDireccionVisitante);
		txtDireccionVisitante.setColumns(10);
		
		lblDireccionVisitante = new JLabel("Direcci\u00F3n :");
		lblDireccionVisitante.setBounds(446, 146, 99, 21);
		pnlEditorDeVisitante.add(lblDireccionVisitante);
		lblDireccionVisitante.setForeground(SystemColor.textHighlight);
		lblDireccionVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnGuardarVisitantes = new JButton("Guardar");
		btnGuardarVisitantes.setBounds(217, 253, 86, 20);
		pnlEditorDeVisitante.add(btnGuardarVisitantes);
		
		btnRegresarVisitante = new JButton("Regresar");
		btnRegresarVisitante.setBounds(549, 253, 86, 20);
		btnRegresarVisitante.addActionListener(new ControladorEventListener());
		btnRegresarVisitante.setActionCommand("RegresarMenuVisitante");
		pnlEditorDeVisitante.add(btnRegresarVisitante);
		
		lblSubTitutoVisitante = new JLabel("SubTitulo");
		lblSubTitutoVisitante.setForeground(SystemColor.textHighlight);
		lblSubTitutoVisitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblSubTitutoVisitante.setBounds(207, 11, 332, 37);
		pnlEditorDeVisitante.add(lblSubTitutoVisitante);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setForeground(SystemColor.textHighlight);
		lblId.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblId.setBounds(110, 59, 48, 21);
		pnlEditorDeVisitante.add(lblId);
		
		txtIDvisitante = new JTextField();
		txtIDvisitante.setBackground(Color.WHITE);
		txtIDvisitante.setText("123456");
		txtIDvisitante.setBounds(159, 57, 48, 22);
		pnlEditorDeVisitante.add(txtIDvisitante);
		txtIDvisitante.setColumns(10);
		
		btnBuscadorIDvisitante = new JButton("");
		btnBuscadorIDvisitante.setEnabled(false);
		btnBuscadorIDvisitante.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnBuscadorIDvisitante.setBounds(214, 57, 48, 23);
		pnlEditorDeVisitante.add(btnBuscadorIDvisitante);
		
		btnGuardarCambiosVisitante = new JButton("Guardar cambios");
		btnGuardarCambiosVisitante.setEnabled(false);
		btnGuardarCambiosVisitante.setBounds(318, 253, 125, 20);
		pnlEditorDeVisitante.add(btnGuardarCambiosVisitante);
		
		btnEliminarEditorVistante = new JButton("Eliminar");
		btnEliminarEditorVistante.setEnabled(false);
		btnEliminarEditorVistante.setBounds(453, 253, 86, 20);
		btnEliminarEditorVistante.addActionListener(new ControladorEventListener());
		btnEliminarEditorVistante.setActionCommand("EliminarEditorVisitante");
		pnlEditorDeVisitante.add(btnEliminarEditorVistante);

		pnlEventos = new JPanel();
		tabbedPane.addTab("Eventos", null, pnlEventos, null);
		pnlEventos.setLayout(null);
	
		
		lblEventos = new JLabel("Eventos");
		lblEventos.setBounds(396, 11, 146, 53);
		pnlEventos.add(lblEventos);
		lblEventos.setForeground(SystemColor.textHighlight);
		lblEventos.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		
		lblSubTituloEvento = new JLabel("SubTitulo");
		lblSubTituloEvento.setVisible(false);
		lblSubTituloEvento.setBounds(242, 61, 332, 37);
		pnlEventos.add(lblSubTituloEvento);
		lblSubTituloEvento.setForeground(SystemColor.textHighlight);
		lblSubTituloEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		calendario = new  JCalendar();
		calendario.getYearChooser().getSpinner().setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridLayout gridLayout = (GridLayout) calendario.getDayChooser().getDayPanel().getLayout();
		gridLayout.setRows(0);
		calendario.setLocation(484, 79);
		calendario.setSize(377, 232);
		
		pnlEditorEventos = new JPanel();
		pnlEditorEventos.setVisible(false);
		
		pnlDesplegarVisitantesEvento = new JPanel();
		pnlDesplegarVisitantesEvento.setVisible(false);
		pnlDesplegarVisitantesEvento.setBounds(20, 108, 746, 341);
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
		
		bntBuscarVisitanteEvento = new JButton("");
		bntBuscarVisitanteEvento.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		bntBuscarVisitanteEvento.setBounds(421, 45, 48, 23);
		pnlDesplegarVisitantesEvento.add(bntBuscarVisitanteEvento);
		pnlEditorEventos.setBounds(20, 109, 873, 341);
		pnlEventos.add(pnlEditorEventos);
		pnlEditorEventos.setLayout(null);
		
		pnlEditorEventos.add(calendario);
		lblUbicacionEvento = new JLabel("Ubicacion : ");
		lblUbicacionEvento.setBounds(10, 116, 108, 21);
		pnlEditorEventos.add(lblUbicacionEvento);
		lblUbicacionEvento.setForeground(SystemColor.textHighlight);
		lblUbicacionEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtUbicacionEvento = new JTextField();
		txtUbicacionEvento.setBounds(123, 115, 331, 25);
		pnlEditorEventos.add(txtUbicacionEvento);
		
		lblHoraEvento = new JLabel("Hora :");
		lblHoraEvento.setBounds(10, 190, 66, 16);
		pnlEditorEventos.add(lblHoraEvento);
		lblHoraEvento.setForeground(SystemColor.textHighlight);
		lblHoraEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cbbHoraEventos = new JComboBox();
		cbbHoraEventos.addItem("PM");
		cbbHoraEventos.addItem("AM");
		cbbHoraEventos.setBounds(207, 190, 40, 21);
		pnlEditorEventos.add(cbbHoraEventos);
		
		lblFechaEvento = new JLabel("Fecha : ");
		lblFechaEvento.setBounds(10, 158, 72, 21);
		pnlEditorEventos.add(lblFechaEvento);
		lblFechaEvento.setForeground(SystemColor.textHighlight);
		lblFechaEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtNombreEvento = new JTextField();
		txtNombreEvento.setBounds(123, 79, 331, 25);
		pnlEditorEventos.add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		txtNombreEvento.setColumns(10);
		txtNombreEvento.setColumns(10);
		
		lblNombreEvento = new JLabel("Nombre :");
		lblNombreEvento.setBounds(10, 79, 96, 21);
		pnlEditorEventos.add(lblNombreEvento);
		lblNombreEvento.setForeground(SystemColor.textHighlight);
		lblNombreEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnRegresarEventos = new JButton("Regresar");
		btnRegresarEventos.setBounds(375, 240, 86, 20);
		btnRegresarEventos.addActionListener(new ControladorEventListener());
		btnRegresarEventos.setActionCommand("RegresarMenuEventos");
		pnlEditorEventos.add(btnRegresarEventos);
		
		btnGuardarEvento = new JButton("Guardar");
		btnGuardarEvento.setBounds(50, 240, 86, 20);
		pnlEditorEventos.add(btnGuardarEvento);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setBackground(Color.WHITE);
		txtFechaEvento.setEditable(false);
		txtFechaEvento.setBounds(123, 154, 96, 25);
		pnlEditorEventos.add(txtFechaEvento);
		
		btnFechaEvento = new JButton("Aceptar");
		btnFechaEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dia = Integer.toString(calendario.getCalendar().get(java.util.Calendar.DATE));
				String mes = Integer.toString(calendario.getCalendar().get(java.util.Calendar.MONTH) + 1);
				 String year = Integer.toString(calendario.getCalendar().get(java.util.Calendar.YEAR));
				 txtFechaEvento.setText(dia + "/" + mes + "/" + year);
			}
		});
		btnFechaEvento.setBounds(368, 160, 86, 20);
		pnlEditorEventos.add(btnFechaEvento);
		
		txtHoraEvento = new JFormattedTextField(new MaskFormatter("##:##"));
		
		txtHoraEvento.setBounds(123, 190, 66, 20);
		pnlEditorEventos.add(txtHoraEvento);
		
		JLabel lblIDEvento = new JLabel("ID :");
		lblIDEvento.setForeground(SystemColor.textHighlight);
		lblIDEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblIDEvento.setBounds(10, 47, 96, 21);
		pnlEditorEventos.add(lblIDEvento);
		
		txtIDevento = new JTextField();
		txtIDevento.setBackground(Color.WHITE);
		txtIDevento.setEnabled(false);
		txtIDevento.setColumns(10);
		txtIDevento.setBounds(123, 43, 66, 25);
		pnlEditorEventos.add(txtIDevento);
		
		btnGuardarCambiosEvento = new JButton("Guardar cambios");
		btnGuardarCambiosEvento.setBounds(146, 239, 123, 20);
		btnGuardarCambiosEvento.addActionListener(new ControladorEventListener());
		btnGuardarCambiosEvento.setActionCommand("GuardarCambiosEvento");
		pnlEditorEventos.add(btnGuardarCambiosEvento);
		
		btnEliminarEvento = new JButton("Eliminar");
		btnEliminarEvento.setBounds(279, 239, 86, 20);
		btnEliminarEvento.addActionListener(new ControladorEventListener());
		btnEliminarEvento.setActionCommand("EliminarContacto");
		pnlEditorEventos.add(btnEliminarEvento);
		
		btnBuscarIDevento = new JButton("");
		btnBuscarIDevento.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnBuscarIDevento.setEnabled(false);
		btnBuscarIDevento.setBounds(199, 45, 48, 23);
		pnlEditorEventos.add(btnBuscarIDevento);
		
		pnlOpcionesEventos = new JPanel();
		pnlOpcionesEventos.setBounds(340, 108, 246, 192);
		pnlEventos.add(pnlOpcionesEventos);
		pnlOpcionesEventos.setLayout(null);
		
		btnEventosActuales = new JButton("Eventos actuales");
		btnEventosActuales.setBounds(57, 11, 137, 25);
		btnEventosActuales.addActionListener(new ControladorEventListener());
		btnEventosActuales.setActionCommand("EventosActuales");
		pnlOpcionesEventos.add(btnEventosActuales);
		
		btnProximosEventos = new JButton("Pr\u00F3ximos eventos");
		btnProximosEventos.setBounds(57, 47, 137, 25);
		btnProximosEventos.addActionListener(new ControladorEventListener());
		btnProximosEventos.setActionCommand("ProximosEventos");
		pnlOpcionesEventos.add(btnProximosEventos);
		
		btnAgregarOpcionEvento = new JButton("Nuevo evento");
		btnAgregarOpcionEvento.setBounds(57, 83, 137, 25);
		btnAgregarOpcionEvento.addActionListener(new ControladorEventListener());
		btnAgregarOpcionEvento.setActionCommand("AgregarEvento");
		pnlOpcionesEventos.add(btnAgregarOpcionEvento);
		
		btnModificarOpcionEvento = new JButton("Modificar evento");
		btnModificarOpcionEvento.addActionListener(new ControladorEventListener());
		btnModificarOpcionEvento.setActionCommand("ModicarEvento");
		btnModificarOpcionEvento.setBounds(57, 119, 137, 25);
		pnlOpcionesEventos.add(btnModificarOpcionEvento);
		
		btnEliminarOpcionEvento = new JButton("Eliminar evento");
		btnEliminarOpcionEvento.setBounds(57, 155, 137, 25);
		btnEliminarOpcionEvento.addActionListener(new ControladorEventListener());
		btnEliminarOpcionEvento.setActionCommand("EliminarOpcionEvento");
		pnlOpcionesEventos.add(btnEliminarOpcionEvento);
		
		pnlProximosEventos = new JPanel();
		pnlProximosEventos.setBounds(10, 108, 729, 242);
		pnlEventos.add(pnlProximosEventos);
		pnlProximosEventos.setLayout(null);
		
		scrollPaneProximosEventos = new JScrollPane();
		scrollPaneProximosEventos.setBounds(130, 32, 526, 150);
		pnlProximosEventos.add(scrollPaneProximosEventos);
		
		tablaProximosEventos = new JTable();
		tablaProximosEventos.setModel(modelProximosEventos);
		scrollPaneProximosEventos.setViewportView(tablaProximosEventos);
		
		btnRegresarProximosEventos = new JButton("Regresar");
		btnRegresarProximosEventos.setBounds(334, 193, 89, 23);
		btnRegresarProximosEventos.addActionListener(new ControladorEventListener());
		btnRegresarProximosEventos.setActionCommand("RegresarMenuEventos");
		pnlProximosEventos.add(btnRegresarProximosEventos);
		
		pnlEventosActuales = new JPanel();
		pnlEventosActuales.setBounds(10, 108, 729, 251);
		pnlEventos.add(pnlEventosActuales);
		pnlEventosActuales.setVisible(false);
		pnlEventosActuales.setLayout(null);
		
		scrollPaneEventosActuales = new JScrollPane();
		scrollPaneEventosActuales.setBounds(130, 32, 526, 150);
		pnlEventosActuales.add(scrollPaneEventosActuales);
		
		tablaEventosActuales = new JTable();
		tablaEventosActuales.setModel(modelEvenosActuales);
		scrollPaneEventosActuales.setViewportView(tablaEventosActuales);
		
		JButton btnSeleccionarEvento = new JButton("Aceptar");
		btnSeleccionarEvento.setBounds(322, 193, 95, 25);
		pnlEventosActuales.add(btnSeleccionarEvento);
		
		btnRegresarEventosActuales = new JButton("Regresar");
		btnRegresarEventosActuales.setBounds(479, 193, 95, 23);
		btnRegresarEventosActuales.addActionListener(new ControladorEventListener());
		btnRegresarEventosActuales.setActionCommand("RegresarMenuEventos");
		pnlEventosActuales.add(btnRegresarEventosActuales);
		
		pnlUsuario = new JPanel();
		tabbedPane.addTab("Usuario", null, pnlUsuario, null);
		pnlUsuario.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(388, 11, 152, 42);
		lblUsuario.setForeground(SystemColor.textHighlight);
		lblUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlUsuario.add(lblUsuario);
		
		pnlOpcionUsuario = new JPanel();
		pnlOpcionUsuario.setBounds(398, 75, 142, 138);
		pnlUsuario.add(pnlOpcionUsuario);
		pnlOpcionUsuario.setLayout(null);
		
		btnEliminarOpcionUsuario = new JButton("Eliminar");
		btnEliminarOpcionUsuario.addActionListener(new ControladorEventListener());
		btnEliminarOpcionUsuario.setActionCommand("EliminarOpcionUsuario");
		btnEliminarOpcionUsuario.setBounds(28, 98, 86, 20);
		pnlOpcionUsuario.add(btnEliminarOpcionUsuario);
		
		btnModificarUsuario = new JButton("Modificar");
		btnModificarUsuario.addActionListener(new ControladorEventListener());
		btnModificarUsuario.setActionCommand("ModificarUsuario");
		btnModificarUsuario.setBounds(28, 56, 86, 20);
		pnlOpcionUsuario.add(btnModificarUsuario);
		
		btnAgregarUsuario = new JButton("Nuevo");
		btnAgregarUsuario.addActionListener(new ControladorEventListener());
		btnAgregarUsuario.setActionCommand("AgregarUsuario");
		btnAgregarUsuario.setBounds(28, 11, 86, 20);
		pnlOpcionUsuario.add(btnAgregarUsuario);
		
		pnlEditorUsuario = new JPanel();
		pnlEditorUsuario.setVisible(false);
		pnlEditorUsuario.setBounds(39, 55, 670, 359);
		pnlUsuario.add(pnlEditorUsuario);
		pnlEditorUsuario.setLayout(null);
		
		lblUsuarioUsuario = new JLabel("Usuario :");
		lblUsuarioUsuario.setBounds(10, 167, 93, 21);
		pnlEditorUsuario.add(lblUsuarioUsuario);
		lblUsuarioUsuario.setForeground(SystemColor.textHighlight);
		lblUsuarioUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtUsuarioUsuario = new JTextField();
		txtUsuarioUsuario.setBounds(107, 168, 135, 20);
		pnlEditorUsuario.add(txtUsuarioUsuario);
		txtUsuarioUsuario.setColumns(10);
		
		lblPerfilUsuario = new JLabel("Perfil :");
		lblPerfilUsuario.setBounds(205, 221, 65, 21);
		pnlEditorUsuario.add(lblPerfilUsuario);
		lblPerfilUsuario.setForeground(SystemColor.textHighlight);
		lblPerfilUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		cmxPerfil = new JComboBox();
		cmxPerfil.setBounds(301, 222, 135, 20);
		pnlEditorUsuario.add(cmxPerfil);
		cmxPerfil.setVisible(true);
		cmxPerfil.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Administrador", "Portero"}));
		
		lblClaveUsuario = new JLabel("Clave :");
		lblClaveUsuario.setBounds(323, 167, 99, 21);
		pnlEditorUsuario.add(lblClaveUsuario);
		lblClaveUsuario.setVisible(true);
		lblClaveUsuario.setForeground(SystemColor.textHighlight);
		lblClaveUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		txtApellidoUsuario = new JTextField();
		txtApellidoUsuario.setBounds(432, 115, 150, 20);
		txtApellidoUsuario.setVisible(true);
		pnlEditorUsuario.add(txtApellidoUsuario);
		txtApellidoUsuario.setColumns(10);
		
		lblApellidoUsuario = new JLabel("Apellido :");
		lblApellidoUsuario.setBounds(323, 114, 93, 21);
		pnlEditorUsuario.add(lblApellidoUsuario);
		lblApellidoUsuario.setVisible(true);
		lblApellidoUsuario.setForeground(SystemColor.textHighlight);
		lblApellidoUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		lblSubtituloUsuario = new JLabel("Nuevo usuario");
		lblSubtituloUsuario.setBounds(205, 11, 299, 53);
		pnlEditorUsuario.add(lblSubtituloUsuario);
		lblSubtituloUsuario.setVisible(false);
		lblSubtituloUsuario.setForeground(SystemColor.textHighlight);
		lblSubtituloUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(107, 115, 135, 20);
		pnlEditorUsuario.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		lblNombreUsuario = new JLabel("Nombre :");
		lblNombreUsuario.setBounds(10, 114, 79, 21);
		pnlEditorUsuario.add(lblNombreUsuario);
		lblNombreUsuario.setForeground(SystemColor.textHighlight);
		lblNombreUsuario.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		
		btnGuardarUsuario = new JButton("Guardar");
		btnGuardarUsuario.setBounds(107, 276, 89, 23);
		pnlEditorUsuario.add(btnGuardarUsuario);
		
		btnGuardarCambiosUsuario = new JButton("Guardar Cambios");
		btnGuardarCambiosUsuario.setBounds(206, 276, 125, 23);
		pnlEditorUsuario.add(btnGuardarCambiosUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar");
		btnEliminarUsuario.setBounds(338, 276, 89, 23);
		pnlEditorUsuario.add(btnEliminarUsuario);
		
		lblId_1 = new JLabel("ID  :");
		lblId_1.setForeground(SystemColor.textHighlight);
		lblId_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		lblId_1.setBounds(10, 73, 79, 21);
		pnlEditorUsuario.add(lblId_1);
		
		txtIDusuario = new JTextField();
		txtIDusuario.setColumns(10);
		txtIDusuario.setBounds(107, 75, 65, 20);
		pnlEditorUsuario.add(txtIDusuario);
		
		btnBuscarUsuario = new JButton("");
		btnBuscarUsuario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnBuscarUsuario.setEnabled(false);
		btnBuscarUsuario.setBounds(182, 75, 48, 23);
		pnlEditorUsuario.add(btnBuscarUsuario);
		
		txtClaveUsuario = new JPasswordField();
		txtClaveUsuario.setBounds(432, 169, 150, 20);
		pnlEditorUsuario.add(txtClaveUsuario);
		
		btnRegresarUsuario = new JButton("Regresar");
		btnRegresarUsuario.addActionListener(new ControladorEventListener());
		btnRegresarUsuario.setActionCommand("RegresarUsuario");
		btnRegresarUsuario.setBounds(437, 276, 89, 23);
		pnlEditorUsuario.add(btnRegresarUsuario);
		
		pnlInvitaciones = new JPanel();
		tabbedPane.addTab("Invitaciones", null, pnlInvitaciones, null);
		pnlInvitaciones.setLayout(null);
		
		lblInvitaciones = new JLabel("Invitaciones");
		lblInvitaciones.setBounds(303, 5, 217, 53);
		lblInvitaciones.setForeground(SystemColor.textHighlight);
		lblInvitaciones.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		pnlInvitaciones.add(lblInvitaciones);
		
		lblSubtituloInvitaciones = new JLabel("SubTitulo");
		lblSubtituloInvitaciones.setForeground(SystemColor.textHighlight);
		lblSubtituloInvitaciones.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblSubtituloInvitaciones.setBounds(228, 65, 322, 46);
		pnlInvitaciones.add(lblSubtituloInvitaciones);
		
		pnlEditorInvitaciones = new JPanel();
		pnlEditorInvitaciones.setVisible(false);
		
		pnlOpcionesInvitaciones = new JPanel();
		pnlOpcionesInvitaciones.setBounds(303, 122, 179, 106);
		pnlInvitaciones.add(pnlOpcionesInvitaciones);
		pnlOpcionesInvitaciones.setLayout(null);
		
		btnCrearInvitaciones = new JButton("Crear Invitaciones");
		btnCrearInvitaciones.addActionListener(new ControladorEventListener());
		btnCrearInvitaciones.setActionCommand("CrearInvitaciones");
		btnCrearInvitaciones.setBounds(25, 11, 135, 20);
		pnlOpcionesInvitaciones.add(btnCrearInvitaciones);
		
		btnModificarInvitaciones = new JButton("Modificar");
		btnModificarInvitaciones.addActionListener(new ControladorEventListener());
		btnModificarInvitaciones.setActionCommand("ModificarInvitaciones");
		btnModificarInvitaciones.setBounds(25, 42, 135, 20);
		pnlOpcionesInvitaciones.add(btnModificarInvitaciones);
		
		btnEliminarOpcionInvitaciones = new JButton("Eliminar");
		btnEliminarOpcionInvitaciones.addActionListener(new ControladorEventListener());
		btnEliminarOpcionInvitaciones.setActionCommand("EliminarOpcionInvitaciones");
		btnEliminarOpcionInvitaciones.setBounds(25, 73, 135, 20);
		pnlOpcionesInvitaciones.add(btnEliminarOpcionInvitaciones);
		pnlEditorInvitaciones.setBounds(81, 122, 629, 465);
		pnlInvitaciones.add(pnlEditorInvitaciones);
		pnlEditorInvitaciones.setLayout(null);
		
		lblIDeventoVIsitante = new JLabel("Evento ID :");
		lblIDeventoVIsitante.setForeground(SystemColor.textHighlight);
		lblIDeventoVIsitante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblIDeventoVIsitante.setBounds(331, 11, 125, 23);
		pnlEditorInvitaciones.add(lblIDeventoVIsitante);
		
		txtIDeventoInvitaciones = new JFormattedTextField();
		txtIDeventoInvitaciones.setBounds(466, 12, 56, 20);
		pnlEditorInvitaciones.add(txtIDeventoInvitaciones);
		
		btnIDeventoInvitaciones = new JButton("");
		btnIDeventoInvitaciones.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnIDeventoInvitaciones.setBounds(532, 11, 48, 23);
		pnlEditorInvitaciones.add(btnIDeventoInvitaciones);
		
		txtNombreEventoInvitaciones = new JTextField();
		txtNombreEventoInvitaciones.setBackground(Color.WHITE);
		txtNombreEventoInvitaciones.setEditable(false);
		txtNombreEventoInvitaciones.setBounds(345, 45, 239, 20);
		pnlEditorInvitaciones.add(txtNombreEventoInvitaciones);
		txtNombreEventoInvitaciones.setColumns(10);
		
		lblEvento = new JLabel("Nombre del evento :");
		lblEvento.setForeground(SystemColor.textHighlight);
		lblEvento.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblEvento.setBounds(145, 48, 190, 23);
		pnlEditorInvitaciones.add(lblEvento);
		
		lblInvitacionNo = new JLabel("Invitacion No. :");
		lblInvitacionNo.setForeground(SystemColor.textHighlight);
		lblInvitacionNo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblInvitacionNo.setBounds(27, 11, 153, 23);
		pnlEditorInvitaciones.add(lblInvitacionNo);
		
		txtNumeroInvitacion = new JFormattedTextField();
		txtNumeroInvitacion.setEditable(false);
		txtNumeroInvitacion.setBackground(Color.WHITE);
		txtNumeroInvitacion.setBounds(190, 15, 56, 20);
		pnlEditorInvitaciones.add(txtNumeroInvitacion);
		
		lblVisitantes = new JLabel("Visitantes");
		lblVisitantes.setForeground(SystemColor.textHighlight);
		lblVisitantes.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblVisitantes.setBounds(250, 101, 101, 23);
		pnlEditorInvitaciones.add(lblVisitantes);
		
		JLabel label = new JLabel("Buscar :");
		label.setBounds(59, 136, 48, 16);
		pnlEditorInvitaciones.add(label);
		
		txtBuscarVitanteInvitaciones = new JTextField();
		txtBuscarVitanteInvitaciones.setColumns(10);
		txtBuscarVitanteInvitaciones.setBounds(119, 135, 148, 20);
		pnlEditorInvitaciones.add(txtBuscarVitanteInvitaciones);
		
		JLabel lblFiltarBusqueda = new JLabel("Filtar Busqueda :");
		lblFiltarBusqueda.setBounds(277, 138, 102, 14);
		pnlEditorInvitaciones.add(lblFiltarBusqueda);
		
		cbbFiltrarVisitanteInvitaciones = new JComboBox();
		cbbFiltrarVisitanteInvitaciones.setModel(new DefaultComboBoxModel(categoriaDeBusqueda.values()));
		cbbFiltrarVisitanteInvitaciones.setBounds(391, 135, 77, 20);
		pnlEditorInvitaciones.add(cbbFiltrarVisitanteInvitaciones);
		
		btnBuscarInvitadosInvitaciones = new JButton("");
		btnBuscarInvitadosInvitaciones.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnBuscarInvitadosInvitaciones.setBounds(478, 136, 48, 23);
		pnlEditorInvitaciones.add(btnBuscarInvitadosInvitaciones);
		
		scrollPaneVisitantesInvitaciones = new JScrollPane();
		scrollPaneVisitantesInvitaciones.setBounds(163, 186, 309, 220);
		pnlEditorInvitaciones.add(scrollPaneVisitantesInvitaciones);
		
		tablaVisitantesInvitaciones = new JTable();
		tablaVisitantesInvitaciones.setModel(modeloVisitantesInvitacion);
		scrollPaneVisitantesInvitaciones.setViewportView(tablaVisitantesInvitaciones);
		
		btnInvitarInvitaciones = new JButton("Invitar");
		btnInvitarInvitaciones.setBounds(111, 417, 89, 23);
		pnlEditorInvitaciones.add(btnInvitarInvitaciones);
		
		btnNumeroInvitaciones = new JButton("");
		btnNumeroInvitaciones.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		btnNumeroInvitaciones.setBounds(256, 14, 48, 23);
		pnlEditorInvitaciones.add(btnNumeroInvitaciones);
		
		btnGuardarCambiosInvitaciones = new JButton("Guardar Cambios");
		btnGuardarCambiosInvitaciones.setBounds(210, 417, 125, 23);
		pnlEditorInvitaciones.add(btnGuardarCambiosInvitaciones);
		
		btnEliminarIvitacion = new JButton("Eliminar");
		btnEliminarIvitacion.setBounds(345, 417, 89, 23);
		pnlEditorInvitaciones.add(btnEliminarIvitacion);
		
		btnRegresarInvitaciones = new JButton("Regresar");
		btnRegresarInvitaciones.addActionListener(new ControladorEventListener());
		btnRegresarInvitaciones.setActionCommand("RegresarInvitaciones");
		btnRegresarInvitaciones.setBounds(444, 417, 89, 23);
		pnlEditorInvitaciones.add(btnRegresarInvitaciones);
		
		pnlRegistro = new JPanel();
		tabbedPane.addTab("Registro", null, pnlRegistro, null);
		pnlRegistro.setLayout(null);
		
		pnlEditorRegistro = new JPanel();
		pnlEditorRegistro.setBounds(44, 127, 674, 440);
		pnlRegistro.add(pnlEditorRegistro);
		pnlEditorRegistro.setLayout(null);
		
		lblNombreEventoRegistro = new JLabel("Nombre del evento :");
		lblNombreEventoRegistro.setBounds(224, 7, 190, 23);
		pnlEditorRegistro.add(lblNombreEventoRegistro);
		lblNombreEventoRegistro.setForeground(SystemColor.textHighlight);
		lblNombreEventoRegistro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		
		txtNombreEventoRegistro = new JTextField();
		txtNombreEventoRegistro.setBounds(414, 11, 239, 20);
		pnlEditorRegistro.add(txtNombreEventoRegistro);
		txtNombreEventoRegistro.setEditable(false);
		txtNombreEventoRegistro.setColumns(10);
		txtNombreEventoRegistro.setBackground(Color.WHITE);
		
		lblIdEventoRegistro = new JLabel("ID evento :");
		lblIdEventoRegistro.setForeground(SystemColor.textHighlight);
		lblIdEventoRegistro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblIdEventoRegistro.setBounds(10, 14, 113, 23);
		pnlEditorRegistro.add(lblIdEventoRegistro);
		
		txtIDEventoRegistro = new JTextField();
		txtIDEventoRegistro.setEditable(false);
		txtIDEventoRegistro.setColumns(10);
		txtIDEventoRegistro.setBackground(Color.WHITE);
		txtIDEventoRegistro.setBounds(133, 18, 71, 20);
		pnlEditorRegistro.add(txtIDEventoRegistro);
		
		lblVisitantesPorLlegar = new JLabel("Visitantes por llegar :");
		lblVisitantesPorLlegar.setForeground(SystemColor.textHighlight);
		lblVisitantesPorLlegar.setFont(new Font("Monotype Corsiva", Font.PLAIN, 25));
		lblVisitantesPorLlegar.setBounds(10, 48, 209, 23);
		pnlEditorRegistro.add(lblVisitantesPorLlegar);
		
		txtFaltanVisitantesReistro = new JTextField();
		txtFaltanVisitantesReistro.setBackground(Color.WHITE);
		txtFaltanVisitantesReistro.setEditable(false);
		txtFaltanVisitantesReistro.setBounds(224, 52, 59, 20);
		pnlEditorRegistro.add(txtFaltanVisitantesReistro);
		txtFaltanVisitantesReistro.setColumns(10);
		
		lblBuscarRegistro = new JLabel("Buscar :");
		lblBuscarRegistro.setBounds(66, 101, 48, 16);
		pnlEditorRegistro.add(lblBuscarRegistro);
		
		txtBuscarRegistro = new JTextField();
		txtBuscarRegistro.setColumns(10);
		txtBuscarRegistro.setBounds(126, 100, 148, 20);
		pnlEditorRegistro.add(txtBuscarRegistro);
		
		label_2 = new JLabel("Filtar Busqueda :");
		label_2.setBounds(284, 103, 102, 14);
		pnlEditorRegistro.add(label_2);
		
		cbbFiltrarBusquedaRegistro = new JComboBox();
		cbbFiltrarBusquedaRegistro.setModel(new DefaultComboBoxModel(categoriaDeBusqueda.values()));
		cbbFiltrarBusquedaRegistro.setBounds(398, 100, 77, 20);
		pnlEditorRegistro.add(cbbFiltrarBusquedaRegistro);
		
		bntBuscarRegistro = new JButton("");
		bntBuscarRegistro.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/edu/itla/administradordevisitante/imagenes/IDvisitante30x30.png")));
		bntBuscarRegistro.setBounds(485, 101, 48, 23);
		pnlEditorRegistro.add(bntBuscarRegistro);
		
		scrollPaneVisitantesRegistro = new JScrollPane();
		scrollPaneVisitantesRegistro.setBounds(170, 151, 309, 220);
		pnlEditorRegistro.add(scrollPaneVisitantesRegistro);
		
		tablaVisitantesRegistro = new JTable();
		
		pnlOpcionRegistro = new JPanel();
		pnlOpcionRegistro.setBounds(254, 127, 209, 79);
		pnlRegistro.add(pnlOpcionRegistro);
		pnlOpcionRegistro.setLayout(null);
		
		btnRegistrarVisitas = new JButton("Registrar Visitas");
		btnRegistrarVisitas.setActionCommand("CrearInvitaciones");
		btnRegistrarVisitas.setBounds(10, 11, 189, 23);
		pnlOpcionRegistro.add(btnRegistrarVisitas);
		
		btnRegistrarVisitasImprevistas = new JButton("Registrar Visita Imprevista");
		btnRegistrarVisitasImprevistas.setActionCommand("CrearInvitaciones");
		btnRegistrarVisitasImprevistas.setBounds(10, 45, 189, 23);
		pnlOpcionRegistro.add(btnRegistrarVisitasImprevistas);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(SystemColor.textHighlight);
		lblRegistro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 47));
		lblRegistro.setBounds(292, 11, 152, 53);
		pnlRegistro.add(lblRegistro);
		
		lblSubtituloRegistro = new JLabel("SubTitulo");
		lblSubtituloRegistro.setForeground(SystemColor.textHighlight);
		lblSubtituloRegistro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblSubtituloRegistro.setBounds(243, 70, 322, 46);
		pnlRegistro.add(lblSubtituloRegistro);
		
		pnlConfiguracion = new JPanel();
		tabbedPane.addTab("Configuracion", null, pnlConfiguracion, null);
		
		pnlAyuda = new JPanel();
		tabbedPane.addTab("Ayuda", null, pnlAyuda, null);
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

	public JPanel getPnlInvitaciones() {
		return pnlInvitaciones;
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

	public JTextField getTxtDireccionVisitante() {
		return txtDireccionVisitante;
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

	public JTextField getTxtUsuarioUsuario() {
		return txtUsuarioUsuario;
	}

	public JPasswordField getTxtClaveUsuario() {
		return txtClaveUsuario;
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

	public JLabel getLblSubtituloUsuarios() {
		return lblSubtituloUsuario;
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

	public JLabel getLblHoraEvento() {
		return lblHoraEvento;
	}

	public JLabel getLblAyuda() {
		return lblInvitaciones;
	}

	public JLabel getLblSubtituloInvitaciones() {
		return lblSubtituloInvitaciones;
	}

	public JComboBox getCbbSexoVisitante() {
		return cbbSexoVisitante;
	}

	public JComboBox getCmxPerfil() {
		return cmxPerfil;
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

	public JButton getBtnEliminarOpcionUsuario() {
		return btnEliminarOpcionUsuario;
	}

	public JButton getBtnAgregarEvento() {
		return btnAgregarOpcionEvento;
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
		return btnGuardarEvento;
	}

	public JPanel getPnlEditorEventos() {
		return pnlEditorEventos;
	}

	public JPanel getPnlOpcionesEventos() {
		return pnlOpcionesEventos;
	}

	public JPanel getPnlEditorDeVisitante() {
		return pnlEditorDeVisitante;
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

	public JPanel getPnlOpcionUsuario() {
		return pnlOpcionUsuario;
	}

	public JPanel getPnlEditorUsuario() {
		return pnlEditorUsuario;
	}

	public JButton getBtnCrearUsuario() {
		return btnGuardarUsuario;
	}
	
	public JLabel getLblSustituloBienvenida() {
		return lblSustituloBienvenida;
	}

	public JTextField getTxtIDvisitante() {
		return txtIDvisitante;
	}

	public JButton getBtnBuscadorIDvisitante() {
		return btnBuscadorIDvisitante;
	}

	public JButton getBtnGuardarCambiosVisitante() {
		return btnGuardarCambiosVisitante;
	}

	public JButton getBtnEliminarEditorVistante() {
		return btnEliminarEditorVistante;
	}
	
	public JPanel getPnlEventosActuales(){
		return pnlEventosActuales;
	}
	
	public JPanel getPnlDesplegarVisitantesEvento(){
		return pnlDesplegarVisitantesEvento;
	}
	
	public JButton getBtnRegresarEventosActuales(){
		return btnRegresarEventosActuales;
	}
	
	public JPanel getPnlProximosEventos(){
		return pnlProximosEventos;
	}
	
	public JButton getBtnGuardarEvento(){
		return btnGuardarEvento;
	}
	
	public JButton getBtnGuardarCambiosEvento(){
		return btnGuardarCambiosEvento;
	}
	
	public JButton getBtnEliminarEvento(){
		return btnEliminarEvento;
	}

	public JButton getBtnBuscarIDevento() {
		return btnBuscarIDevento;
	}

	public JTextField getTxtIDevento() {
		return txtIDevento;
	}

	public JTextField getTxtFechaEvento() {
		return txtFechaEvento;
	}

	public JFormattedTextField getTxtHoraEvento() {
		return txtHoraEvento;
	}

	public JCalendar getCalendario() {
		return calendario;
	}
	
	public JButton getBtnFechaEvento(){
		return btnFechaEvento;
	}

	public JButton getBtnGuardarUsuario() {
		return btnGuardarUsuario;
	}

	public JButton getBtnGuardarCambiosUsuario() {
		return btnGuardarCambiosUsuario;
	}

	public JButton getBtnBuscarUsuario() {
		return btnBuscarUsuario;
	}

	public JTextField getTxtIDusuario() {
		return txtIDusuario;
	}
	
	public JButton getBtnRegresarUsuario(){
		return btnRegresarUsuario;
	}
	
	public JButton getBtnEliminarUsuario(){
		return btnEliminarUsuario;
	}

	public JButton getBtnCrearInvitaciones() {
		return btnCrearInvitaciones;
	}

	public JButton getBtnEliminarOpcionInvitaciones() {
		return btnEliminarOpcionInvitaciones;
	}

	public JButton getBtnInvitarInvitaciones() {
		return btnInvitarInvitaciones;
	}

	public JButton getBtnEliminarIvitacion() {
		return btnEliminarIvitacion;
	}

	public JButton getBtnBuscarInvitadosInvitaciones() {
		return btnBuscarInvitadosInvitaciones;
	}

	public JButton getBtnRegresarInvitaciones() {
		return btnRegresarInvitaciones;
	}
	
	public JTable getTablaVisitantesInvitaciones(){
		return tablaVisitantesInvitaciones;
	}
	
	public JPanel getPnlEditorInvitaciones(){
		return pnlEditorInvitaciones;
	}
	
	public JPanel getPnlOpcionesInvitaciones(){
		return pnlOpcionesInvitaciones;
	}

	public JFormattedTextField getTxtIDeventoInvitaciones() {
		return txtIDeventoInvitaciones;
	}

	public JTextField getTxtNombreEventoInvitaciones() {
		return txtNombreEventoInvitaciones;
	}

	public JFormattedTextField getTxtNumeroInvitacion() {
		return txtNumeroInvitacion;
	}

	public JComboBox getCbbFiltrarVisitanteInvitaciones() {
		return cbbFiltrarVisitanteInvitaciones;
	}

	public JTextField getTxtBuscarVitanteInvitaciones() {
		return txtBuscarVitanteInvitaciones;
	}
	
	public JButton getBtnNumeroInvitaciones(){
		return btnNumeroInvitaciones;
	}
	
	public JButton getBtnGuardarCambiosInvitaciones(){
		return btnGuardarCambiosInvitaciones;
	}
}
