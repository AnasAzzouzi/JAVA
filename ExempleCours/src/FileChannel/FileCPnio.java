package FileChannel;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;


public class FileCPnio {

	public static void main(String[] args) {
		FileInputStream fis;
		BufferedInputStream bis;
		FileChannel fc;
		try {
			fis= new FileInputStream(new File("FichierTestNio.txt"));
			bis= new BufferedInputStream(fis);
			long time=System.currentTimeMillis();
			while(bis.read()!=-1);
			System.out.println(" Temps d'exec avec BuffereInputStream est : "+(System.currentTimeMillis()-time));
			fis= new FileInputStream(new File("FichierTestNio.txt"));
			fc=fis.getChannel();
			int size=(int)fc.size();
			ByteBuffer bBuff=ByteBuffer.allocate(size);
			time=System.currentTimeMillis();
			fc.read(bBuff);
			//bBuff.flip();
			System.out.println(" Temps d'exec avec FileChannel est : "+(System.currentTimeMillis()-time));
			byte[] tabByte=bBuff.array();
			for(byte b:tabByte) {
				System.out.print((char)b);
			}
		}catch(Exception e)
		{e.printStackTrace();}

	}

}
