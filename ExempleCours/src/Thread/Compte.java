package Thread;

public class Compte extends Thread{
	int valeur;
	String Chaine;
	Compte(int val,String str){
		valeur=val;
		Chaine=str;
	}
	public void run() {

		try {
		for(;;) {
			System.out.println(valeur+" "+Chaine+" "+currentThread().getName());

				sleep(1000);}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Compte(1,"un").start();
new Compte(200,"deux cents").start();
	}

}
