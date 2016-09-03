package it.jpm.superSimpleStock.view.activity;

import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.Trade;
import it.jpm.superSimpleStock.view.Activity;

public class ShowTrades implements Activity {
	private Controller controller;
	public ShowTrades(Controller controller) {
		this.controller = controller;
	
	}

	@Override
	public int showActivity() {
		execute();
		return 0;
	}

	public void execute() {
		System.out.println("Trades:");

		for(Trade t : controller.getTrades())
		{
			System.out.println(t.toString());
		}
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}
