package coding;

import java.util.Scanner;


public class Warung_Makan {

	public static void main(String[] args) {
		int pilihan;
		
		nasiGemuk ngk = new nasiGemuk();
		nasiPempek npk = new nasiPempek();
		nasiBatagor nbg = new nasiBatagor();
		nasiAngkringan nkn =new nasiAngkringan();
		
		
		Scanner input = new Scanner(System.in);
		do {
		
		System.out.println("Warung Makan");
		System.out.println("Rindu Nasi");
		System.out.println("---------------");
		System.out.println("1. Nasi gemuk__________Rp. 7.000");
		System.out.println("2. Nasi pempek____________Rp. 10.000");
		System.out.println("3. Nasi batagor__________Rp. 8.000");
		System.out.println("4. Nasi angkringan__________Rp. 2.000");
		System.out.println("5. Keluar");
		System.out.println("-----------------------------------");
			System.out.print("Pilih [1-7] : ");
			
		pilihan = input.nextInt();
		
		
		switch(pilihan) {
		
		case 1 :
			System.out.print("Nasi Gemuk, beli berapa porsi = ");
			ngk.Jumlah1 = input.nextInt();
			System.out.println("Nasi Gemuk yang anda pesan seharga = Rp. " + ngk.getTotal1() + "\n" );
			break;
			
		case 2 :
			System.out.print("Nasi Pempek, beli berapa porsi = ");
			npk.Jumlah2 = input.nextInt();
			System.out.println("Nasi Pempek yang anda pesan seharga = Rp. "  + npk.getTotal2()+ "\n");
			break;
		
		case 3 :
			System.out.print("Nasi Batagor, beli berapa porsi = ");
			nbg.Jumlah3 = input.nextInt();
			System.out.println("Nasi Batagor yang anda pesan seharga = Rp. "+nbg.getTotal3()  + "\n");
			break;
			
		case 4 :
			System.out.print("Nasi Angkringan, beli berapa porsi = ");
			nkn.Jumlah4 = input.nextInt();
			System.out.println("Nasi Angkringan yang anda pesan seharga = Rp. "+nkn.getTotal4() + "\n");
			break;
			
			
		case 5 :
			System.out.print("Pesanan Selesai, Sistem Keluar");
			System.exit(0);
			
		default :
			System.out.println("Pilihan yang anda masukkan salah!!!");
		}
		} while(pilihan != 7);
		
		input.close();
					

		
		
		
		
		
	}
}
