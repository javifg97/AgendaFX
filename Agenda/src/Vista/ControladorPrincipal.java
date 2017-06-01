package Vista;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.DatosPersona;
import Modelo.Persona;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorPrincipal implements Initializable {
	
    private  Main ProgramaPrincipal;
    private DatosPersona datos;
    private ControladorSegunda segunda;
    private int aux;
    
	@FXML
	private TableView<Persona> MiTabla;

	@FXML
	private TableColumn<Persona,String> ColNombre;

	@FXML
	private TableColumn<Persona,String> ColApellido;
	
	@FXML
	private TableColumn<Persona,String> ColTelefono;
    
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnBorrar;
    
    public void initialize(URL url, ResourceBundle rb) {
    }
	
    public void setProgramaPrincipal(Main ProgramaPrincipal) {
    	this.ProgramaPrincipal = ProgramaPrincipal;
    }
    
    @FXML
    private void NuevoContacto() {
    	this.aux = 0;
       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
    }
    
    @FXML
    private void EditarContacto() {
    	this.aux = 1;
       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
    }
    
    @FXML
    private void BorrarContacto() {
    	 Persona selectedItem = MiTabla.getSelectionModel().getSelectedItem();
    	    MiTabla.getItems().remove(selectedItem);
    	    MiTabla.setItems(this.datos.getPersonaData());
    }

	public void setDatos(DatosPersona dP) {
		this.datos = dP;
		
		MiTabla.setItems(this.datos.getPersonaData());
		ColNombre.setCellValueFactory(new PropertyValueFactory<Persona,String>("Nombre"));
		ColApellido.setCellValueFactory(new PropertyValueFactory<Persona,String>("Apellido"));
		ColTelefono.setCellValueFactory(new PropertyValueFactory<Persona,String>("Telefono"));
		
	}

	public void añadir(Persona persona){
		this.datos.addPersona(persona);
		setDatos(datos);
		segunda.closeWindow();
	}
	public void setSegunda(ControladorSegunda segunda) {
		this.segunda = segunda;
	}

	public int getAux() {
		return aux;
	}
	
    
}
