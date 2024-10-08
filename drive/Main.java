package com.drive;

import com.controller.Operations;
import com.entity.Book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

		Operations o = new Operations();
		while (true) {
			System.out.println(" 1.AddBook \n 2.getAllData \n 3.remove \n 4.GetBookById\n 5.UpdateById\n 6.Exit");
			System.out.println("Please Enter choice");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter Auther");
				String auther = sc.next();
				System.out.println("Enter price");
				double price = sc.nextDouble();
				Book b = new Book(id, name, auther, price);
				o.addBooks(b);// data present in that container

			}
				break;
			case 2: {
				o.getAllData();

			}
				break;
			case 3: {
				System.out.println("Enter book name you want to delete...!");
				String name = sc.next();
				o.remove(name);

			}
				break;
			case 4: {
				System.out.println("Enter id to display name");
				int id = sc.nextInt();
				Book b = o.getBookById(id);
				if (b != null) {
					System.out.println(b.getId());
					System.out.println(b.getName());
					System.out.println(b.getPrice());
				} else {
					System.out.println("Book Not found");
				}
			}
				break;
			case 5: {
				System.out.println("Enter id");
				int id = sc.nextInt();
				Book b = o.update(id);
				if (b != null) {
					System.out.println("1.Update id\n 2.Update Name \n 3.Update Auther\n 4.Update price ");
					System.out.println("Please enter the chioce");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						System.out.println("Enter new Id!");
						int newId = sc.nextInt();
						b.setId(newId);

					}

					case 2: {
						System.out.println("Enter new Name!");
						String name = sc.next();
						b.setName(name);
					}
					case 3: {
						System.out.println("Enter new Auther Name!");
						String Auther = sc.next();
						b.setAuther(Auther);
					}
					case 4: {
						System.out.println("Enter new Price!");
						double price = sc.nextDouble();
						b.setPrice(price);
					}

					}
				}
			}
				break;
			case 6: {
				System.out.println("Thank you....!");
				System.exit(0);
			}

			default: {
				System.out.println("Enter your choice");

			}
			}
			sc.close();
		}
		

	}
	

}
