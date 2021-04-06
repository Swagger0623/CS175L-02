import javax.swing.JOptionPane;

public class romanNumeral {
	
	public static void main(String[] args)
	{
		String romanNumeralYear = "";
		
		int yearInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		System.out.println(yearInput);
		
		
			while (yearInput >= 10000) {
				romanNumeralYear += "X";
				yearInput -= 10000;
			}
	        while (yearInput >= 9000) {
				romanNumeralYear += "MX";
				yearInput -= 9000;
	        }
	        // 5000 is V with a line over the V but it wouldn't let me insert that 
			while (yearInput >= 5000) {
				romanNumeralYear += "V";
		        yearInput -= 5000;
		    }
			while (yearInput >= 4000) {
				romanNumeralYear += "MV";
		        yearInput -= 4000;
		    }
			while (yearInput >= 1000) {
			 romanNumeralYear += "M";
		        yearInput -= 1000;        }
		    while (yearInput >= 900) {
		    	romanNumeralYear += "CM";
		        yearInput -= 900;
		    }
		    while (yearInput >= 500) {
		    	romanNumeralYear += "D";
		        yearInput -= 500;
		    }
		    while (yearInput >= 400) {
		    	romanNumeralYear += "CD";
		        yearInput -= 400;
		    }
		    while (yearInput >= 100) {
		    	romanNumeralYear += "C";
		        yearInput -= 100;
		    }
		    while (yearInput >= 90) {
		    	romanNumeralYear += "XC";
		        yearInput -= 90;
		    }
		    while (yearInput >= 50) {
		    	romanNumeralYear += "L";
		        yearInput -= 50;
		    }
		    while (yearInput >= 40) {
		    	romanNumeralYear += "XL";
		        yearInput -= 40;
		    }
		    while (yearInput >= 10) {
		    	romanNumeralYear += "X";
		        yearInput -= 10;
		    }
		    while (yearInput >= 9) {
		    	romanNumeralYear += "IX";
		        yearInput -= 9;
		    }
		    while (yearInput >= 5) {
		    	romanNumeralYear += "V";
		        yearInput -= 5;
		    }
		    while (yearInput >= 4) {
		    	romanNumeralYear += "IV";
		        yearInput -= 4;
		    }
		    while (yearInput >= 1) {
	
	System.out.println(romanNumeralYear);
	
	JOptionPane.showMessageDialog(null, "The roman numerals for the year " + yearInput + "is" +romanNumeralYear);
	}
}
}
