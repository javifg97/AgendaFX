package application;
	
import java.io.IOException;

import Modelo.DatosPersona;
import Vista.ControladorPrincipal;
import Vista.ControladorSegunda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
    private static Stage stagePrincipal;
    private AnchorPane rootPane;
    private DatosPersona DP;
    private ControladorPrincipal controller;
    private ControladorSegunda controller2;
	
	@Override
    public void start(Stage stagePrincipal) throws Exception {
        Main.stagePrincipal = stagePrincipal;
        DP = new DatosPersona();
        mostrarVentanaPrincipal();

    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Vista/vistaPrincipal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Agenda");
            stagePrincipal.setScene(scene);
            /*
             * Añadidos las llamadas del main al Controlador y del controlador al main ***/
            controller = loader.getController();
            controller.setProgramaPrincipal(this);
            controller.setDatos(DP);
            
            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }
    public void mostrarVentanaSecundaria() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/vistaSegunda.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("Contacto");
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            controller2 = loader.getController();
            controller2.setStagePrincipal(ventana);
            
            controller.setSegunda(controller2);
            controller2.setPrimera(controller);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción
        }
    }
}
