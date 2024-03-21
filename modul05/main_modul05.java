package modul05;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;


public class main_modul05 {
    public static void main(String[] args) {
        queue_todoList<String> queue = new queue_todoList<>();
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
                     queue.enqueue(tugas);
                     System.out.println("Tugas dtambahkan!!!");
                     System.out.println("--------------------------------------------------");
                     break;
                  default:

                  case 2:
                    queue.dequeue();
                        break;
 
                  case 3: 
                    queue.printQueue();
                    break;
                  case 4:
                  System.exit(0);
                  break;
           }
        }
        
    } 
}   

