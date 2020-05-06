package _02_nested_loops._3_for_loop_gauntlet;
public class Loops {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int j = 100; j > -1; j--) {
		System.out.println(j);
	}
	for (int w = 2; w < 101; w++) {
		System.out.println(w);
	}
	for (int p = 1; p < 100; p++) {
		System.out.println(p);
	}
	for (int l = 1; l < 501; l++) {
		if(l % 2 == 0) {
			System.out.println(l + " is Even.");
		}
		else {
			System.out.println(l + " is Odd.");
		}
	}
	for (int v = 0; v < 778; v++) {
		if(v % 7 == 0) {
			System.out.println(v);
		}
	}
	int year = 2007;
	for (int r = 0; r < 13; r++) {
		System.out.println("In " + year + " I was " + r);
		year = year + 1;
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i + " " + j);
		}
	}
	int num = 1;
	for (int i = 0; i < 3; i++) {
		for (int p = 0; p < 3; p++) {
			System.out.print(num + " ");
			num = num + 1;
			
		}
		System.out.println("");
	}
	int dos = 1;
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			System.out.print(dos + " ");
			dos = dos + 1;
		}
		System.out.println("");
	}
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < i + 1; j++) {
			System.out.print("*" + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
