import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.view.menu.MainMenu;
import it.jpm.superSimpleStocks.model.Stock;
import it.jpm.superSimpleStocks.model.Trade;

import java.util.HashSet;
import java.util.Set;



public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		
		MainMenu mainMenu = new MainMenu(controller);
		
		Set<Stock> stocks = new HashSet<Stock>();
		Set<Trade> trades = new HashSet<Trade>();

		controller.setStocks(stocks);
		controller.setTrades(trades);
		
		System.out.println("Welcome to JPM SUPER SIMPLE STOCKS exercise");
		
		controller.mainMenu(mainMenu);

		System.out.println("JPM SUPER SIMPLE STOCKS exercise terminated!\nBye bye!!!");
	}

}
