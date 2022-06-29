package passs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class randompass {

	public static void main(String[]args) {
	
		String our_pass = genPass(8,16);
		System.out.println("Welcome to HCL password generator");
		System.out.println(" Your Random password is  :-"+our_pass);
		
		}
	static String genPass(int min,int max) {
		Random random=new Random();
		String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String low="abcdefghijklmnopqrstuvwxyz";
		String num="1234567890";
		String specialChars ="!@#$%&*(){}?";
		String all =up+low+num+specialChars;
		List<Character>lettersList=new ArrayList<Character>();
		for(char c : all.toCharArray()) {
			lettersList.add(c);
			}
		Collections.shuffle(lettersList);
		String pass=" ";
		for(int i=random.nextInt(max-min)+min;i>0;--i) {
			pass += lettersList.get(random.nextInt(lettersList.size()));
		}
		return pass;
	}
	
}
