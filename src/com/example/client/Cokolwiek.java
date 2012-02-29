package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class Cokolwiek implements EntryPoint {

	public void onModuleLoad() {
		final Label myLabel = new Label("Działaj");
		final Button myPlus = new Button("+");
		final Button myMno = new Button("*");
		HorizontalPanel hPanel = new HorizontalPanel();
		
		final TextBox myInput = new TextBox();
		final TextBox a = new TextBox();
		final TextBox b = new TextBox();
		
		
		hPanel.add(myLabel);
		hPanel.add(a);
		hPanel.add(myPlus);
		hPanel.add(myMno);
		hPanel.add(b);
		hPanel.add(myInput);

		RootPanel.get("myapp").add(hPanel);
		
		myPlus.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myInput.setText((Integer.parseInt(a.getText()) + Integer.parseInt(b.getText())) + "");
				
			}
		});
		
		myMno.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myInput.setText((Integer.parseInt(a.getText()) * Integer.parseInt(b.getText())) + "");
				
			}
		});
		
	}
}
