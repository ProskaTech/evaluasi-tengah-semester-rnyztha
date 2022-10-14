
package uts_prakpbo;

/**
*
 * @author 21343013-Ranny Erzitha
 */
import java.util.Scanner;

public class soal2 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
      
        int n;
        System.out.println("Masukkan Jumlah Baris Anda: ");
        n = input.nextInt();

        System.out.println();	

        for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                        System.out.print(" ");
                }
                for(int j=i; j<=n; j++) {
                        System.out.print(" #");
                }
                System.out.println();
        }

        for(int i=1; i<=n; i++) {
                for(int j=i; j<=n; j++) {
                        System.out.print(" ");
                }
                for(int j=1; j<=i; j++) {
                        System.out.print(" *");
                }
                System.out.println();
        }
		}
	}

