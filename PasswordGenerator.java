package Security;

import java.util.Random;
public class PasswordGenerator{
	static String gen(int k,String n){
		Random r = new Random();
		String q = "";
		for(int i=0;i<k;i++){
			int p = r.nextInt(n.length());
			q+=n.charAt(p);
		}
		return q;
	}
	public String generator(int k){
		String n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*(){}[]<>?";
		String pass = gen(k,n);
		return pass;
	}
	public String generator(){
		String n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*(){}[]<>?";
		String pass = gen(8,n);
		return pass;
	}
	public String generator(String c,int k){
		String n;
		if(c.equals("a")){
			n = "abcdefghijklmnopqrst";
		}else if(c.equals("A")){
			n = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}else if(c.equals("1")){
			n = "1234567890";
		}else if(c.equals("!")){
			n = "!@#$%^&*(){}[]<>?";
		}else if(c.equals(" ")){
			n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*(){}[]<>?";
		}else if(c.equals("aA")){
			n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}else if(c.equals("aA1")){
			n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		}else if(c.equals("aA1!")){
			n = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*(){}[]<>?";
		}else{
			n = c;
		}
		String q  = gen(k,n);
		return q;
	}
	int validate(String pass){
		int a=0;
		int A=0;
		int S=0;
		int N=0;
		for(int i=0;i<pass.length();i++){
			char c = pass.charAt(i);
			if(c>='a' && c<='z'){
				a++;
			}else if(c>='A' && c<='Z'){
				A++;
			}else if((c>='0' && c<='9')){
				N++;
			}else{
				S++;
			}
		}
		int r = (a*1)+(A*2)+(S*3)+(N*2);
		return r;
	}
}

