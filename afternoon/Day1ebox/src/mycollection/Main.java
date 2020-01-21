package mycollection;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String s, st, st1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		StringTokenizer t = new StringTokenizer(s, ";");
		while (t.hasMoreTokens()) {
			st = t.nextToken();
			StringTokenizer t1 = new StringTokenizer(st, "=");
			while (t1.hasMoreTokens()) {
				st1 = t1.nextToken();
				System.out.printf(st1 + " ");
				

				if (t1.hasMoreTokens())
					System.out.printf(st1);	
				

				else
					System.out.println();
			}
		}
	}
}
