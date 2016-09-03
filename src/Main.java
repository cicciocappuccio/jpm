import it.jpm.superSimpleStock.controller.Controller;
import it.jpm.superSimpleStock.model.Stock;
import it.jpm.superSimpleStock.model.Trade;
import it.jpm.superSimpleStock.view.menu.MainMenu;

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
		
		System.out.println("Welcome to JPM SUPER SIMPLE STOCKS exercise\nIn the document of the technical test there are some things that aren't clear for me; for this reason I have doing some assumptions:\n1 - the \"Ticker Price\" can be the stock price (last formula in the document) or the price of the last trade: I assume that the ticker price is the price of the last trade of the specific stock.\n2 - In the case there aren't trade of a specific stock, what is the price of the stock? I assume that the price of the stock is the Par Value\n");
        System.out.println("\n\n");

		controller.mainMenu(mainMenu);

		System.out.println("\nJPM SUPER SIMPLE STOCKS exercise terminated!\nBye bye!!!");
	}

}
