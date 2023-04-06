import java.io.*;

class RWObjects {
	public static void main(String[] args) {
		Student st1 = new Student(100, "kyto");
		Student st2 = new Student(101, "zay");

		// writing Object to file
		try {
			FileOutputStream fos = new FileOutputStream("rwobj.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// Write objects to file
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.close();
			fos.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		// Read objects from file
		try {
			FileInputStream fis = new FileInputStream("rwobj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student) ois.readObject();
			Student s2 = (Student) ois.readObject();
			System.out.println(s1.toString());
			System.out.println(s2.toString());
			fis.close();
			ois.close();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class Student implements java.io.Serializable {
	int ID;
	String Name;

	Student(int ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}

	public String toString() {
		return "ID:" + ID + "\nName: " + Name;
	}
}