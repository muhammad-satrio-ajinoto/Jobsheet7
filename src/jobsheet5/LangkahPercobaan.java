/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author HP 242
 */
public class LangkahPercobaan { public static void main(String[] args) {
    String identitas = "Satrio wakanda/X RPL 2/22";
        System.out.println("Pengenal : "+ identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Bahan pertama : ");
        System.out.println("1.Pisang");
        System.out.println("2.Telur");
        System.out.println("3. Susu kental manis");
        System.out.print("Masukkan no pilihan Anda : ");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else {
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
                
            }
            
            
        }else 
            System.out.println("Mohon Maaf, Pilihan jika tidak ditemukan," 
                    + "tidak dapat memberikan saran resep");
        
        System.out.print("Masukkan no pilihan Anda : ");
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Pembuat dapat membuat milk shake banana"); break;
                    case 2: System.out.println(
                            "Pembuat dapat membuat pisang goreng"); break;
                    case 3: System.out.println(
                            "Pembuat dapat membuat pisang rebus");
                }
        else
            switch(bahan2)
                {
                    case 1: System.out.println(
                            "Pembuat dapat membuat telur mata sapi"); break;
                    case 2: System.out.println(
                            "Pembuat dapat membuat sandwich telur"); break;
                    case 3: System.out.println(
                            "Pembuat dapat membuat telur rebus");
                }
        
    }else
        System.out.println("Mohon Maaf, Pilihan jika tidak ditemukan,"
            + "tidak dapat memberikan saran resep");
 }
    
}
