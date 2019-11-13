package InputOutput;
import java.io.*;

import java.util.Scanner;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		
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
	else  System.out.print("ce fichier n'existe pas ");*/
		// Read File
/*		String c="";
		long t=0;
		FileInputStream fis=null;
		File f = new File("C:\\Users\\Client6\\nvdossier\\JavaProj\\JAVA\\ExempleCours\\file1.txt");
		//if(f.exists()) {
		try {
		 fis = new FileInputStream(f);
		byte buff[] = new byte[8];
		int n;
		while((n= fis.read(buff))>=0) {
			for (int i=0;i<n;i++) {
				
			System.out.print((char) buff[i]);
			t=System.currentTimeMillis();
			c=c+(char) buff[i];
			
								}
			}
		}catch(Exception e){
			
			System.out.print("error reading file ");
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Write On File
		
		FileOutputStream fos=null;
		File f2 = new File("C:\\Users\\Client6\\nvdossier\\JavaProj\\JAVA\\ExempleCours\\fichierBis.txt");
		String content =c;
		byte [] contentByte= content.getBytes();
		try {
			fos =new FileOutputStream(f2);
			fos.write(contentByte);
			fos.close();
			
			System.out.println(t);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
				BufferedInputStream bis = null;
				BufferedOutputStream bos=null;
				File f3 = new File("C:\\Users\\Client6\\nvdossier\\JavaProj\\JAVA\\ExempleCours\\file1.txt");
				File f4 = new File("C:\\Users\\Client6\\nvdossier\\JavaProj\\JAVA\\ExempleCours\\fichierBis.txt");
				try {
					 bis = new BufferedInputStream(new FileInputStream(f3));
					 bos = new BufferedOutputStream( new FileOutputStream(f4));
					while(bis.available()>0)
					{
						long t=System.currentTimeMillis();
						
						System.out.print((char)bis.read());
						System.out.println(t);
						//bos.write((char)bis.read());
						
					}
						}catch(Exception e) {
					}
				
	
	
	}}
	

