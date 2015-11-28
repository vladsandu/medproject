package medproject.medclient.graphicalInterface.mainWindow.mainScene;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import medproject.medclient.dataLoader.DataLoader;
import medproject.medclient.graphicalInterface.ControllerInterface;
import medproject.medclient.graphicalInterface.Navigator;

public class MainController implements ControllerInterface{

	private DataLoader dataLoader;
	private Stage stage;
	@FXML TabPane mainTabPane;
	@FXML Tab personsTab;
	
	@Override
	public void init(DataLoader dataLoader, Stage stage) {
		this.dataLoader = dataLoader;
		this.stage = stage;
		loadTabContent();
	}
	
	private void loadTabContent(){
		personsTab.setContent(Navigator.getPaneFromScene(Navigator.PERSON_TAB_SCENE, stage));
	}
	
	@FXML protected void onSelectPersonsTab(){
		if(personsTab.isSelected()){
		}
		else{	
		}
	}

}
