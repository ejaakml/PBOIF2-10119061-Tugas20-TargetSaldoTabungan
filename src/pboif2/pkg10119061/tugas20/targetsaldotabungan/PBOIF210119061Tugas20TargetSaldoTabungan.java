/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.tugas20.targetsaldotabungan;

/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class PBOIF210119061Tugas20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int i = 1;
        float bunga;
        double saldoAwal,saldoTarget,saldo;

        System.out.print("Saldo Awal : RP. ");
        saldoAwal = scanner.nextDouble();

        System.out.print("Bunga/Bulan(%) :");
        bunga = scanner.nextFloat();

        System.out.print("Saldo Target : RP. ");
        saldoTarget = scanner.nextDouble();

        bunga = (float) (bunga/100);

        while(i < saldoTarget){
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldo));
            saldoAwal = saldo;
            if (saldoAwal >= saldoTarget) {
                break;
            }i++;
        }
    }
    
}
