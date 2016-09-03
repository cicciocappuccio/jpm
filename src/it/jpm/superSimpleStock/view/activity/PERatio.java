package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;
import it.jpm.superSimpleStocks.model.Stock;

public class PERatio implements Activity {
	private Controller controller;

	public PERatio(Controller controller) {
		this.controller = controller;
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Calculate the P/E Ratio");

		Stock stock = Utils.selectStock("Select stock", controller.getStocks());

		System.out.println("The P/E Ratio of stock " + stock.getStockSymbol() + " is " + stock.calculatePERatio());
		
	}

}
