import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main_Modul04 {
    public static void main(String[] args) {
        LinkedList<POJO_Tugas> listPOJO_Tugas = new LinkedList<POJO_Tugas>();
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Input Tugas ");
            System.out.println("2. Delete Tugas ");
            System.out.println("3. Lihat List Tugas ");
            System.out.println("4. Keluar ");
            System.out.print("pilihan : ");
            int masukan = userInput.nextInt();
   
               switch (masukan) {
                  case 1:
                     System.out.println("--------------------------------------------------");
                     System.out.println("Input Data Tugas");
                     System.out.print("Mata Kuliah : ");
                     String matkul = userInput.next();
                     System.out.print("Tugas : ");
                     String tugas = userInput.next();
                     System.out.print("Deadline : ");
                     String deadline = userInput.next();
                     listPOJO_Tugas.addFirst(new POJO_Tugas(matkul,tugas,deadline));
                     System.out.println("Tugas dtambahkan!!!");
                     System.out.println("--------------------------------------------------");
                     break;
                  default:

                  case 2:
                  System.out.println("1. hapus depan ");
                  System.out.println("2. hapus Belakang ");
                  System.out.println("3. hapus semua");
                  System.out.print("pilihan : ");
                  masukan =  userInput.nextInt();

                  switch (masukan) {
                    case 1:
                    listPOJO_Tugas.removeFirst();
                    System.out.println("Tugas di depan sudah di hapus!!!");
                        break;
                    default:
                    case 2:
                    listPOJO_Tugas.removeLast();
                    System.out.println("Tugas di belakang sudah di hapus!!!");
                        break;
                    case 3:
                    listPOJO_Tugas.removeAll(listPOJO_Tugas);
                    System.out.println("Tugas semua di hapus!!");
                        break;
                  }
                  break;
   
                  case 3: 
                  System.out.println("1. Print depan ");
                  System.out.println("2. Print Belakang ");
                  System.out.println("3. print semua");
                  System.out.print("pilihan : ");
                  masukan = userInput.nextInt();
                  ListIterator<POJO_Tugas> iterator = listPOJO_Tugas.listIterator();
                  switch (masukan) {
                        case 1:
                                while (iterator.hasNext()){
                                    System.out.println(iterator.next());
                                }
                        break;
                        default:
                        case 2:
                                while (iterator.hasPrevious()){
                                    System.out.println(iterator.previous());
                                }
                        break;
                        case 3:
                                System.out.println(listPOJO_Tugas);
                    }
                    break;
                  case 4:
                  System.exit(0);
                  break;
           }
        }
        
    } 
}   