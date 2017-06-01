package Vista;

import Modelo.Persona;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorSegunda {

	private ControladorPrincipal primera;

	private Stage ventana;
	private int btn;

	@FXML
	private Button btnOK;

	@FXML
	private Button btnCancel;

	@FXML
	private TextField txtfNombre;

	@FXML
	private TextField txtfApellido;

	@FXML
	private TextField txtfTelefono;

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		this.ventana = ventana;
	}

	public void closeWindow() {
		this.ventana.close();
	}

	@FXML
	public Persona nuevo() {
		if (primera.getAux() == 0) {
			Persona persona = new Persona(getTxtfNombre(), getTxtfApellido(), getTxtfTelefono());
			primera.añadir(persona);

			return persona;
		}else{
			return 
		}
	}

	public String getTxtfNombre() {
		return txtfNombre.getText();
	}

	public String getTxtfApellido() {
		return txtfApellido.getText();
	}

	public String getTxtfTelefono() {
		return txtfTelefono.getText();
	}

	public void setPrimera(ControladorPrincipal primera) {
		this.primera = primera;
	}
}
