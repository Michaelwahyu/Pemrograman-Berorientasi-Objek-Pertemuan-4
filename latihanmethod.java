Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Michaelwahyu 
Piluthfi
/
Pemrograman-Berorientasi-Objek-Pertemuan-4
Public
1
00
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Pemrograman-Berorientasi-Objek-Pertemuan-4/latihanMethod.java /
@Piluthfi
Piluthfi Add files via upload
Latest commit 7e56393 10 minutes ago
 History
 1 contributor
43 lines (34 sloc)  1.29 KB
   
import java.util.*;
public class latihanMethod {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        tampilkanKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Loading complete
