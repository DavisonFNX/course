package application;

import java.util.Scanner;

import entidade.Apartamentos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Apartamentos quartos = new Apartamentos();
		
		String[] hotel = new String[10];
		
		System.out.print("How mamy rooms will be rented?: ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ": ");
			System.out.print("Name: ");
			quartos.setName(sc.next());
			System.out.print("\nE-mail: ");
			quartos.setEmail(sc.next());
			System.out.print("\nRoom: ");
			quartos.setQuarto(sc.nextInt());
			hotel[quartos.getQuarto()] = quartos.getName() + ", " + quartos.getEmail();			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < hotel.length; i++) {
			if (hotel[i] != null) {
				System.out.printf("%d: ",i);
				System.out.println(hotel[i]);
			}
		}

		sc.close();
	}

}
