package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.Stock;
import it.jpm.superSimpleStock.model.StockType;
import it.jpm.superSimpleStock.utils.Utils;
import it.jpm.superSimpleStock.view.Activity;

import java.util.Set;

public class DividendYield implements Activity {
	private Controller controller;
	public DividendYield(Controller controller) {
		this.controller = controller;
	
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Calculate the dividend yield");

		Stock stock = Utils.selectStock("Select stock", controller.getStocks());

		System.out.println("The divident yield of stock " + stock.getStockSymbol() + " is " + stock.calculateDividendYield());
		
	}

}
