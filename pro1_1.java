import java.util.*;
public class pro1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=2,m=25;
		int e=0;
		System.out.println(n);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println();
		for(int i=0;i<m&&e==0;i++){
			if(s1.charAt(i)==s2.charAt(i)){
				
				System.out.print(s1.charAt(i));
			}else{
				e++;
			}
		}
		
	}

}
