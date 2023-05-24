package sibuk;
import java.util.Scanner;
public class terbilangaja {
	
	 public static void main(String args[]){
		 
		    Scanner input = new Scanner(System.in);
		    int masuk;
		     String[] ribu = {"", " SERIBU", " DUA RIBU", " TIGA RIBU", " EMPAT RIBU", " LIMA RIBU", " ENAM RIBU", " TUJUH RIBU", " DELAPAN RIBU", " SEMBILAN RIBU"};
		    String[] ratus = {"", " SERATUS", " DUA RATUS", " TIGA RATUS", " EMPAT RATUS", " LIMA RATUS", " ENAM RATUS", " TUJUH RATUS", " DELAPAN RATUS", " SEMBILAN RATUS"};
		     String[] puluh = {"", " BELAS", " DUA PULUH", " TIGA PULUH", " EMPAT PULUH", " LIMA PULUH", " ENAM PULUH", " TUJUH PULUH", " DELAPAN PULUH", " SEMBILAN PULUH"};
		     String[] satuan = {"", " SATU", " DUA", " TIGA", " EMPAT", " LIMA", " ENAM", " TUJUH", " DELAPAN", " SEMBILAN"};

	        String[] bulan1 = {"", " JANUARI", " FEBRUARI", " MARET", " APRIL", " MEI", " JUNI", " JULI", " AGUSTUS", " SEPTEMBER"," NOVEMBER", " OKTOBER", " DESEMBER"};
		    System.out.println("##  Program Java Menentukan Nama Tahun  ##");
		    System.out.println("=========================================");
		    System.out.println();
		     
		    do {
			   System.out.print("INPUT BULAN 1 - 12 : ");
			   int bulan = input.nextInt();
			   System.out.print("INPUT TAHUN : ");
			   int tahun = input.nextInt();
			   if (tahun < 9999 && bulan > 0) {
		            int rhibu, rhatus, phuluh, shatuan;
		            rhibu = tahun / 1000;
		            rhatus = (tahun % 1000) / 100;
		            phuluh = (tahun % 100) / 10;
		            shatuan = tahun % 10;
			   if ( bulan == 1) {
//		      System.out.println("Januari");
				    System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                            + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 31 HARI");
		    }
		    else if ( bulan == 2 && (tahun % 400 == 0) | (tahun % 400 != 0 & tahun % 100 != 0 & tahun % 4 ==0)) //Apakah tahun dimodulus 400==0 atau dimodulus 400!=0 dan dimodulus 100 !=0 dan dimodulus 4==0?
		    {
//		      System.out.println("Februari");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] +  " ADALAH 29 HARI");// tahun kabisat 29 hari
		    }
		    else if ( bulan == 2 ) {
//			      System.out.println("Februari");
			        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                            + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 28 HARI");//bukan tahun kabisat 28 hari
			    }
		    else if ( bulan == 3) {
//		      System.out.println("Maret");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] +  " ADALAH 31 HARI");
		    }
		    else if ( bulan == 4) {
//		      System.out.println("April");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 30 HARI");
		    }
		    else if ( bulan == 5) {
//		      System.out.println("Mei");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 31 HARI");
		    }
		    else if ( bulan == 6) {
//		      System.out.println("Juni");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 30 HARI");
		    }
		    else if ( bulan == 7) {
//		      System.out.println("Juli");
		        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                        + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 31 HARI");
		    }
	   
	    else if ( bulan == 8) {
//	      System.out.println("Agustus");
	        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                    + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 31 HARI");
	    }
	    else if ( bulan == 9) {
//	      System.out.println("September");
	        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                    + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 30 HARI");
	    }
	    else if ( bulan == 10) {
//	      System.out.println("Oktober");
	        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                    + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] +  " ADALAH 31 HARI");
	    }
	    else if ( bulan == 11) {
//	      System.out.println("November");
	        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                    + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 30 HARI");
	    }
	    else if ( bulan == 12) {
//		      System.out.println("Desember");
	        System.out.println("JUMLAH HARI PADA BULAN "+ bulan1[bulan] +""
                    + " DAN TAHUN "+ ribu[rhibu] + ratus[rhatus] + puluh[phuluh]+  satuan[shatuan] + " ADALAH 31 HARI");
		    }
		    else {
		      System.out.println("Pilihan tidak tersedia");
		    }
			  
     }   
			   System.out.print("Lanjut(0/1) : ");masuk =input.nextInt();
	        }while(masuk!=0);
	        System.out.println("Bye Bye");
			   input.close();
	 }
		  }

