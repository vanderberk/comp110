
public class Lecture05 {
	
	public static void main(String[] args) {
		
		Item myItem = new Item();
		
		// print item info (version 1)
		//System.out.println("Item name : " + myItem.name);
		//System.out.println("Item value: " + myItem.value);
		//System.out.println();
		
		// print item info (version 2: use class method)
		//myItem.printInfo();
		
		// print item info (version 3: use toString)
		System.out.println(myItem);
		
		Item item1 = new Item("Belt",180);
		System.out.println(item1);
		
		Item item2 = new Item("Shoe",80);
		System.out.println(item2);
		
		// create inventory array
		Item[] inventoryArray; // declaration
		inventoryArray = new Item[10];
		inventoryArray[0] = item1;
		inventoryArray[1] = item2;
		inventoryArray[2] = new Item("Hat",2);
		
		Character mario = new Character("Super Mario", 60, inventoryArray);
		
		// change character name 
		mario.setName("Luigi");
		System.out.println(mario.takeName());
		System.out.println(mario);
		
		System.out.println();
		mario.printCharacterInfo();
		
		Character spiderMan = new Character("Peter Parker", 678, null);
		spiderMan.printCharacterInfo();
		
		Character batman = new Character("Bruce Wayne", 8, inventoryArray);
		batman.printCharacterInfo();
		
		Character[] gameCharacters = new Character[1000];
		gameCharacters[0] = batman;
		gameCharacters[1] = spiderMan;
		gameCharacters[2] = mario;
		
		System.out.println(gameCharacters[2].inventory[1].name);
		
		
		
	}

}
