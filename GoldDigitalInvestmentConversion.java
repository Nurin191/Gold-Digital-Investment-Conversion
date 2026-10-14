import java.util.Scanner;
import java.text.DecimalFormat;
public class Solution {

	public static void main(String[] args) {
		
		// Program Constant (final)
		final double GOLD_PRICE_PER_GRAM = 385.50;
	    final int BAR_WEIGHT = 10;
	    final double MINTING_FEE_PER_BAR = 45.00;
	    final double YEARLY_VAULT_FEE = 15.00;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    // User Inputs
	    System.out.print("Enter Investor Name: ");
	    String investorName = scanner.nextLine();
	    
	    System.out.print("Enter Total Gold Purchased (in grams): ");
	    double totalGold = scanner.nextDouble();

	    System.out.print("Enter Holding Period (in total months): ");
	    int totalMonths = scanner.nextInt();

	    // Time Conversion
	    int years = totalMonths / 12;
	    int months = totalMonths % 12;

	    
	    int goldInt = (int) totalGold;
	    int goldBars = goldInt / BAR_WEIGHT;
	    double looseGrams = totalGold - (goldBars * BAR_WEIGHT);

	    // Financial Calculations
	    double goldValue = totalGold * GOLD_PRICE_PER_GRAM;
	    double mintingFee = goldBars * MINTING_FEE_PER_BAR;
	    double vaultFee = years * YEARLY_VAULT_FEE;
	    double totalCost = goldValue + mintingFee + vaultFee;

	    // Currency & Decimal Formatting
	    DecimalFormat df = new DecimalFormat("#,##0.00");

	    // Display Investment Receipt Output
	    System.out.println("\n--- AURAGOLD SUMMARY ---");
	    System.out.println("Name: " + investorName);
	    System.out.println("Duration: " + years + " Years, " + months + " Months");
	    System.out.println("Gold: " + df.format(totalGold) + " grams");
	    System.out.println();
	    System.out.println("10g Bars: " + goldBars);
	    System.out.println("Loose Grams: " + df.format(looseGrams));
	    System.out.println();
	    System.out.println("Gold Value: RM " + df.format(goldValue));
	    System.out.println("Minting Fee: RM " + df.format(mintingFee));
	    System.out.println("Vault Fee: RM " + df.format(vaultFee));
	    System.out.println();
	    System.out.println("------------------------");
	    System.out.println("Total Cost: RM " + df.format(totalCost));
	    System.out.println("------------------------");

	    scanner.close();

	}

}

