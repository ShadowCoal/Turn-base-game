import java.util.Scanner;
public class start {private static Scanner input;
public static void main(String[]args){input = new Scanner(System.in);
	System.out.print("Enter hero's name ");
	status.hero = input.nextLine();
	new shops();
	System.out.println("Entering forest");
	new Forest();
}
public static void town(){
	int x = 0;
	while(x<3){
		System.out.print("1-enter inn \n2- potion shop(if you don't have an item)\n3-head back into forest");
		x = input.nextInt();
		if (x== 1){
			shops.inn();
		}
		else if (x == 2&& status.item[0] == "used"){
			shops.itemShop();
		}
	}
	System.out.println("Entering forest");
	new Forest();
}
}
