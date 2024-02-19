package No2_Genap;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Ranking Anda : ");
        int ranking = input.nextInt();
        System.out.println("Apakah anda naik kelas? (true/false)");
        boolean naikKelas = input.nextBoolean();
        
        if(ranking == 1 && naikKelas){
            System.out.println("Selamat! Anda berhak mendapatkan hadiah");
       }else{
            System.out.println("Maaf, Anda tidak berhak mendapatkan hadiah");
        }
    }
    
}
