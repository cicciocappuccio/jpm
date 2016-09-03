package it.jpm.superSimpleStock.utils;

import it.jpm.superSimpleStock.model.Stock;
import it.jpm.superSimpleStock.model.StockType;
import it.jpm.superSimpleStock.model.TradeType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Utils {

	public static Double readDouble(String label) {
		BufferedReader br = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		Double inputF = null;

		boolean isValid = true;
		do {

			System.out.println(label);

			try {
				input = br.readLine();
				inputF = Double.parseDouble(input);
				isValid = true;

			} catch (NullPointerException e1) {
				System.out.println("the input can't be null");
				isValid = false;
			} catch (NumberFormatException e2) {
				System.out.println("the input must be a number");
				isValid = false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				isValid = false;
			}

		} while (!isValid);
		return inputF;
	}

	public static Integer readInteger(String label) {
		BufferedReader br = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		Integer inputI = null;

		boolean isValid = true;
		do {

			System.out.println(label);

			try {
				input = br.readLine();
				inputI = Integer.parseInt(input);
				isValid = true;

			} catch (NumberFormatException e2) {
				System.out.println("the input must be an integer");
				isValid = false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (!isValid);
		return inputI;
	}

	public static String readString(String label) {
		BufferedReader br = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";

		System.out.println(label);

		try {
			input = br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return input;
	}

	public static StockType readStockType(String label) {
		Integer input = null;
		System.out.println(label);
		for (StockType i : StockType.values()) {
			System.out.println(i.ordinal() + " - " + i.name());
		}

		boolean isValid = true;

		do {

			input = readInteger("type the number of your choice");

			if (StockType.COMMON.ordinal() == input)
				return StockType.COMMON;
			else if (StockType.PREFERRED.ordinal() == input)
				return StockType.PREFERRED;
			else {
				isValid = false;
				System.out.println("Answer not valid!");
			}
		} while (!isValid);
		return null;
	}

	public static TradeType readTradeType(String label) {
		Integer input = null;
		System.out.println(label);
		for (TradeType i : TradeType.values()) {
			System.out.println(i.ordinal() + " - " + i.name());
		}

		boolean isValid = true;

		do {

			input = readInteger("type the number of your choice");

			if (TradeType.PURCHASING.ordinal() == input)
				return TradeType.PURCHASING;
			else if (TradeType.SELLING.ordinal() == input)
				return TradeType.SELLING;
			else {
				isValid = false;
				System.out.println("Answer not valid!");
			}
		} while (!isValid);
		return null;
	}

	public static Integer mainMenu(String label) {
		System.out.println(label);
		Integer input = null;
		boolean isValid = true;
		do {

			input = readInteger("type the number of your choice");

			/*
			 * if (TradeType.PURCHASING.ordinal() == input) return
			 * TradeType.PURCHASING; else if (TradeType.SELLING.ordinal() ==
			 * input) return TradeType.SELLING; else isValid = false;
			 */} while (!isValid);

		return 0;
	}

	public static Stock selectStock(String label, Set<Stock> stocks) {

		System.out.println(label);
		int i = 0;
		// HashMap<Integer, Stock> hm = new HashMap<Integer, Stock>();
		for (Stock s : stocks) {
			i++;
			System.out.println(i + " - " + s.getStockSymbol());
		}

		Integer input = null;
		Stock s = null;
		boolean isValid = true;
		do {

			input = Utils.readInteger("type the number of your choice");

			if (input > 0 && input <= i) {
				isValid = true;
			}

			else {
				isValid = false;
				System.out.println("Answer not valid!");
			}
		} while (!isValid);

		int y = 0;
		for (Stock si : stocks) {
			if (++y == input)
				s = si;
		}

		return s;
	}
}
