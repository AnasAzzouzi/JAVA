package InputOutput;
import java.io.*;

public class TestGame {

	public static void main(String[] args) {
		ObjectInputStream ois;
		ObjectOutputStream oos;
		File fo= new File("TestGame.txt");
		try {
			oos = new ObjectOutputStream( new BufferedOutputStream(
					new FileOutputStream(fo)));
			Player p= new Player("Zack",20);
			oos.writeObject( new Game("Assassin Creed","Aventure",45.97,p));
			oos.writeObject( new Game("Tomb Raider","Plateform",50.90,p));
			oos.writeObject( new Game("Tetris","Strategie",2.25,p));
			oos.writeObject( new String("Hello "));
			oos.close();
			ois= new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(fo)));
					try {
						System.out.println(ois.readObject().toString());
						System.out.println(ois.readObject().toString());
						System.out.println(ois.readObject().toString());
						System.out.println(ois.readObject().toString());
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
