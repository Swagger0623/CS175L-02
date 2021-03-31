import java.util.Scanner; 
public class creditcard {

	public static void main(String[] args) {
String creditcardNumber = null;

Scanner sc = new Scanner(System.in);
String creditCard;
System.out.print("Enter card number: ");
creditCard = sc.nextLine();
int i = 0;
while(i < creditcardNumber.length()) {
	char cc = creditcardNumber.charAt(i);
	if (cc== ' '|| cc== '-') {
		String before = creditcardNumber.substring(0,i);
		String after = creditcardNumber.substring(i+1);
		creditcardNumber = before + after;
	}
	else {
		i++;
	}
}

System.out.println(creditCard);
	}
}
