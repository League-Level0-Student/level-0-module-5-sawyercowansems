package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Pick any number.");
		int num = Integer.parseInt(number);
		boolean numbe = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime.");
				numbe = false;
				break;
			}

		}
		if (numbe == true)

		{
			JOptionPane.showMessageDialog(null, "Your number is prime.");
		}

	}
}
