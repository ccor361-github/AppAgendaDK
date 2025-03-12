package es.ieslosmontecillos;

import es.ieslosmontecillos.entidades.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class AdminViewController {

    private Usuario usuario;
    private DataUtil dataUtil;
    Usuario usuarioSeleccionado;

    @FXML
    private Label lblTitulo;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblPassword;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private TableView<Usuario> tbUsuarios;
    @FXML
    private TableColumn<Usuario, String> id;
    @FXML
    private TableColumn<Usuario, String> email;
    @FXML
    private TableColumn<Usuario, String> password;
    @FXML
    private TableColumn<Usuario, String> vigencia;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnCancelar;
    @FXML
    private AnchorPane rootAdminView;
    private AnchorPane adminView;
    private TableView<Usuario> tblUsuarios;


    public void setRootAdminView(AnchorPane rootAdminView) {
        this.rootAdminView = rootAdminView;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setDataUtil(DataUtil dataUtil) {
        this.dataUtil = dataUtil;
    }
    public void setTbUsuarios(TableView<Usuario> tbUsuarios) {
        this.tbUsuarios = tbUsuarios;
    }

    @FXML
    private void initialize() {}

    @FXML
    public void onActionBtnGuardar(ActionEvent event) {
        usuario.setId(Integer.valueOf(id.getText()));
        usuario.setEmail(tfEmail.getText());
        usuario.setPassword(tfPassword.getText());
        usuario.setVigencia(vigencia.getText());
        dataUtil.actualizarUsuario(usuarioSeleccionado);
    }
    @FXML
    public void onActionBtnSalir(ActionEvent actionEvent) {
        //Code
    }

}