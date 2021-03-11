import javax.swing.*;
import java.util.ArrayList;
public class Nivell3 {
	
	//Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci fins al numero N.
	//La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
	//El número següent es troba sumant els dos números anteriors. 

	public static void main(String[] args) {
		System.out.println("Seqüència de Fibonacci \n ");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un nombre"));
		
		ArrayList<Integer>nums = new ArrayList<Integer>();
		int f;
		nums.add(0);
		nums.add(1);
		for (int i = 2 ; i<num ; i++) {
			f= nums.get(i-2)+nums.get(i-1);
			nums.add(i,f);
		//System.out.print(f);
		}
		for (int Print:nums) {
			System.out.print(Print+" ");
		}

	}

}
