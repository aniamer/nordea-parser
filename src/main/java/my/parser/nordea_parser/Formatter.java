package my.parser.nordea_parser;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
	public static void currencyFormat(Locale currentLocale) {
		 Double currency = new Double(28126.00);
		 
		NumberFormat currencyFormatter;
		 String currencyOut;
		 
		currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		 currencyOut = currencyFormatter.format(currency);
		 System.out.println(currencyOut + " " + currentLocale.toString());
		 }
		 
		public static void main(String args[]) {
		 Locale[] locales = new Locale[]{new Locale("fr", "FR"), new Locale("de", "DE"),
		 new Locale("ca", "CA"),new Locale("rs", "RS"),new Locale("en", "IN")
		 ,new Locale("sv","SE")
		 };
		 
		 Formatter[] formate = new Formatter[locales.length];
		 
		for (int i = 0; i < locales.length; i++) {
			Formatter.currencyFormat(locales[i]);
		 }
		 }


}
