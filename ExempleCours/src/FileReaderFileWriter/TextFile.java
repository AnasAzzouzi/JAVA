package FileReaderFileWriter;
import java.io.*;

public class TextFile {

	public static void main(String[] args) {
		File f = new File("fileF.txt");
		FileWriter fw;
		FileReader fr;
		try {
			fw= new FileWriter(f);
			String str=" Hello EveryOne\n";
			str+="\t How R You Doing ?\n";
			fw.write(str);
			fw.close();
			fr= new FileReader(f);
			str="";
			int i=0;
			while ((i=fr.read())!=-1)  {str+=(char)i;/*System.out.println((char)i);*/}
			System.out.println(str);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
