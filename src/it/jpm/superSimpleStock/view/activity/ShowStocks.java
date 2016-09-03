package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.Stock;
import it.jpm.superSimpleStock.view.Activity;

public class ShowStocks implements Activity {
	private Controller controller;
	public ShowStocks(Controller controller) {
		this.controller = controller;
	
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Stocks:");

		for(Stock s : controller.getStocks())
		{
			System.out.println(s.toString());
		}
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}
