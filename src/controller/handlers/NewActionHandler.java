package controller.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.panels.PopUp;

public class NewActionHandler implements EventHandler<ActionEvent> {

	private PopUp CDPane;

	public NewActionHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(ActionEvent event) {
		CDPane.showPopUp();
				
		 System.out.println("pop up venster");
	}

	public void setCategoryDetailPane(PopUp CDPane) {
		this.CDPane = CDPane;
	}

}