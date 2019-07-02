package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
	String name;
	
	public Dog() {}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		try(FileOutputStream fos = new FileOutputStream("external.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(myDog);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("external.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Dog dog = (Dog)ois.readObject();
			System.out.println(dog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
