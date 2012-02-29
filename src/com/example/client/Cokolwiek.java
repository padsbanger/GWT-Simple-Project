package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class Cokolwiek implements EntryPoint {

	public void onModuleLoad() {
		
		final Button myPlus = new Button("+");
		final Button myMno = new Button("*");
		final Button myMinus = new Button("-");
		final Button myDiv = new Button("/");
		final Button myPow = new Button("&sup2;");
		
		HorizontalPanel hPanel = new HorizontalPanel();
		
		final TextBox myInput = new TextBox();
		final TextBox a = new TextBox();
		final TextBox b = new TextBox();
		
		
		
		hPanel.add(a);
		hPanel.add(myPlus);
		hPanel.add(myMno);
		hPanel.add(myPow);
		hPanel.add(myMinus);
		hPanel.add(myDiv);
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
		
		myMinus.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myInput.setText((Integer.parseInt(a.getText()) - Integer.parseInt(b.getText())) + "");
				
			}
		});
		
		myDiv.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myInput.setText((Integer.parseInt(a.getText()) / Integer.parseInt(b.getText())) + "");
				
			}
		});
		
		myPow.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				myInput.setText(Math.pow(Integer.parseInt(a.getText()), Integer.parseInt(b.getText())) + "");
				
			}
		});
		
		
	}
}
