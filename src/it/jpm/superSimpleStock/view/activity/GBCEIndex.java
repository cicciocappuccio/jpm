package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.Stock;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;

public class GBCEIndex implements Activity {

	private Controller controller;

	
	public GBCEIndex(Controller controller) {
		this.controller = controller;
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Calculate the GBCE Index");

		double gbce = controller.geometricMean();
		
		System.out.println("the GBCE Index value is: " + gbce);
	}

}
