import java.util.Scanner;

public class Main {
   public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        singlyLinkList singly_LinkList = new singlyLinkList();
        
        while (true) {
         System.out.println("--------------------------------------------------");
         System.out.println("Menu : ");
         System.out.println("1. Tambah Buku ");
         System.out.println("2. Hapus Buku ");
         System.out.println("3. Cetak Buku ");
         System.out.println("4. keluar ");
         System.out.print("pilihan : ");
         int masukan = userInput.nextInt();

            switch (masukan) {
               case 1:
                  System.out.println("--------------------------------------------------");
                  System.out.print("Masukan Judul Buku : ");
                  String judul_buku = userInput.next();
                  System.out.print("Masukan Penulis Buku : ");
                  String penulis_buku = userInput.next();
                  System.out.print("Masukan tahun terbit : ");
                  String tahun_Terbit = userInput.next();
                  singly_LinkList.insertAtFront(new buku(judul_buku, penulis_buku, tahun_Terbit));
                  System.out.println("Buku ditambahkan didepan");
                  System.out.println("--------------------------------------------------");
                  break;
            
               default:
               case 2:
               singly_LinkList.removeFromBack(null);
               break;

               case 3: 
               singly_LinkList.print();
               break;

               case 4:
               System.exit(0);
               break;
        }
     }
   }
}