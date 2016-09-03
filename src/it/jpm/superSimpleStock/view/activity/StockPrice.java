package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;
import it.jpm.superSimpleStocks.model.Stock;

public class StockPrice implements Activity {

	private Controller controller;

	
	public StockPrice(Controller controller) {
		this.controller = controller;
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}
	
	public void execute() {
		System.out.println("Calculate the stock price");

		Stock stock = Utils.selectStock("Select stock", controller.getStocks());
		double sP = controller.calculateStockPrice(stock);
		if(sP ==-1.0d)
			System.out.println("No trades was found for the selected stock");
		else
			System.out.println("The price of stock " + stock.getStockSymbol() + " is " + sP);
		
	}

}
