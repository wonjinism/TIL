package ArrayList;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("진돌이", "진돗개"));
		dogList.add(new Dog("챠챠", "차우차우"));
		dogList.add(new Dog("훈남이", "닥스훈트"));
		dogList.add(new Dog("쵸쵸", "치와와"));
		dogList.add(new Dog("요키", "요크셔테리어"));
		
		for (Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}
