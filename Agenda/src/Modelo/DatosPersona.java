package Modelo;




import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatosPersona {
	private ObservableList<Persona> personaData = FXCollections.observableArrayList();
	
	public DatosPersona(){
		
		this.personaData.add(new Persona("David", "Perez", "615241861"));
		this.personaData.add(new Persona("Pedro", "Camacho", "687654321"));
		
	}

	public ObservableList<Persona> getPersonaData() {
		return personaData;
	}

	public void setPersonaData(ObservableList<Persona> personaData) {
		this.personaData = personaData;
	}
	
	public void addPersona(Persona personaNew){
		this.personaData.add(personaNew);
	}
	
	
}
