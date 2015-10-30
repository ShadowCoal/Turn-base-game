import java.util.Scanner;
public class shops {
	private static Scanner input;
shops(){
	 weaponShop();
	armorShop();
	itemShop();
}
static void weaponShop(){
	input = new Scanner(System.in);
	int x = -1;
	Object[][] weapon = {{"sword", 11,6,0},{"bow",8,0,0},{"staff",0,0,8}};
	while(x<0 || x > 2){
	System.out.println("1- Sword: + 11 attack +6 hit\n2- bow +8 attack\n3-staff + 8 int");
	x = input.nextInt()-1;
	}
	status.weapon = (String) weapon[x][0];
	status.attack+= (int)weapon[x][1];
	status.hit+=(int)weapon[x][2];
	status.Int+=(int)weapon[x][3];
}
static void armorShop(){
	input = new Scanner(System.in);
	int x = -1;
	Object[][] armor = {{"cheep armor",10,0}, {"charm",4,7}};
	while(x<0 || x > 1){
	System.out.println("1-cheep armor + 10 defence\n2-charm + 4 defence +7 int");
	x = input.nextInt()-1;
	}
	status.armor = (String) armor[x][0];
	status.defence += (int)armor[x][1];
	status.res += (int)armor[x][2];
}
static void itemShop(){
	input = new Scanner(System.in);
	int x = -1;
	Object[][] item = {{"first aid kit",10,0}, {"potion", 0, 5}};
	while(x<0 || x > 1){
	System.out.println("1-first aid kit + 10 HP\n2-potion +5 MP");
	x = input.nextInt()-1;}
	for (int y = 0; y < 3; y ++){
		status.item[y] = item[x][y];
	}
}
}
