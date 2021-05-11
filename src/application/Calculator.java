package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double views = 0;
		double totalViews;
		double click = 0;
		double share = 0;
		
		try {
		System.out.print("Por favor digite o valor que será investido em reais: R$");
		double value = sc.nextDouble();
		negative(value);
		
		views = value*30; //30 peoples view the ads
		totalViews = views;
		
		for(int i=0;i<3;i++){
			click = views*0.12; //~12% will click
			share = click*0.15; //~15% will share 
			views = 40*share;
			totalViews += views;
		}
		
		System.out.println();
		System.out.printf("Com esse investimento é possível alcançar aproximadamente: %.0f pessoas no máximo.",totalViews);
		}
		catch (InputMismatchException e) {
			System.out.println("Valor inválido!");
			main(null);
		}
		sc.close();
	}

	public static void negative(double value) {
		if (value <0) 
			throw new InputMismatchException();		
	}
}
