/*
 * Alex Willenborg
 * willenaj@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main; 


public class Main {

	public static void main(String[] args) {
		int lines = 6;
		
		
		for (int i = 1; i < lines; i++) {
			for (int j = 1; j < i+1; j++) {
				//char s = 0;
				//char t = 0;
				//String repeated = new String(new char[j]).replace(t, s);
				//String str = j;
				//String repeated = str.repeat(3);
				//System.out.print(j);
				int n = 1;
			    for (int u=1; u<=n; u++) {
			    System.out.println(new String(new char[i]).replace("\0", n+""));
			    n++;
			    if(n == 5) {
			    	break;
			    }
			    }
			}
			//System.out.println("");
		}
	}
}
