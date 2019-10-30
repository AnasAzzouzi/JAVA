package InputOutput;
import java.io.File;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	Scanner s =new Scanner(System.in);	
	System.out.println("Donnez le path du fichier ");
	String Path = s.nextLine();
		
 File f = new File(Path);
 if(f.exists()) {
 f.listFiles();
 int j=0;
 for ( int i=0 ; i< f.listFiles().length; i++) 
				 {
					 	
					 
										 if(f.listFiles()[i].isDirectory()) {
												 System.out.printf("%d %-60s",j+1,f.listFiles()[i].getName()+"/");
												
										 }
										 else 
											 	System.out.printf("%d %-60s",j+1,f.listFiles()[i].getName());
							j++;			 
										 System.out.print("\t\t");
										 if (j%3==0 )
											 System.out.print("\n");
						 
					
				 }
					 
				}
	else  System.out.print("ce fichier n'existe pas ");
	}
	}

	

