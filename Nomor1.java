import java.util.Scanner;
public class asesmen{
        public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);

            int jamLemburPertama = 0;
            int jamLemburKedua = 0;
            int jamLembur=0 ;
            int totalJamLembur = 0;
            int jamKerja = 0;
            double honorLembur;
            
            System.out.print("Total Jam Lembur: ");
            totalJamLembur = input.nextInt();
            

            System.out.print ("Honor Lembur: ");
            if (jamLembur <= 16 ){ 
                honorLembur = totalJamLembur * 10000;
            } else if (jamLembur >= 16) { 
                honorLembur = totalJamLembur * 15000;
            }
            
        }
     }

Program Hitung Honor Lembur
Deklarasi: 
Var : integer
Var: double

Algoritma:
INPUT total jam lembur
IF (Jam lembur >= 16 ) THEN
	Honor Lembur= Jam lembur pertama * 10000
ELSE IF (Jam Lembur >16 ) THEN 
	Honor Lembur =( Jam lembur pertama* 10000) + (Jam lembur kedua * 15000)
END IF
END


     
