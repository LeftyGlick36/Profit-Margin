package cs1410;

import javax.swing.JOptionPane;

public class ProfitMargin {

	public static void main(String[] args) {
		String totalSales = JOptionPane.showInputDialog("What are your total amount of sales?");
		String expenses = JOptionPane.showInputDialog("What was the total amount of expenses you've paid?");

		double totalSaleesDub = Double.parseDouble(totalSales);
		double expensesDub = Double.parseDouble(expenses);
		double netIncomeDub = totalSaleesDub - expensesDub;
		double profitMargin = (netIncomeDub / totalSaleesDub) * 100;

		JOptionPane.showMessageDialog(null, "Your net income " + String.format("$%.2f", netIncomeDub)
				+ "\nYour profit margin: " + String.format("%.2f", profitMargin) + "%");
	}

}
