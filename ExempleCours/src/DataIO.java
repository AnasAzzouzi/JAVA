import java.io.*;

public class DataIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		File fo=new File("FichierBis1.txt");
		try {
			bos= new BufferedOutputStream(new FileOutputStream(fo));
			dos= new DataOutputStream(bos);
			dos.writeByte(14);
			dos.writeFloat(65.23f);
			dos.writeInt(45);
			dos.writeDouble(97.5584d);
			
			
			
			bos.close();
			bis= new BufferedInputStream(new FileInputStream(fo));
			dis= new DataInputStream(bis);
			
			
			System.out.println(dis.readByte());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
