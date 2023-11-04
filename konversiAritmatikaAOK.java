import java.util.Scanner;

public class konversiAritmatikaAOK {
    public static void main(String[] args) {
        Scanner vira = new Scanner(System.in);

        while (true) {
            System.out.println("ALAT KONVERSI SEDERHANA");
            System.out.println("VIRA VRADILLA W-225150707111040");
            System.out.println("===============================");
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda: ");
            int pil = vira.nextInt();

            if (pil == 7) {
                break;
            }else if (pil == 1) {
                System.out.print("Masukkan bilangan biner: ");
                int binary = vira.nextInt();
                int des = 0;
                int i = 1;
                int temp = binary;
                int digit, decDigit;
                
                while (temp > 0) {
                    digit = temp % 10;
                    decDigit = digit * i;
                    des += decDigit;
                    i *= 2;
                    temp /= 10;
                }
                System.out.println("Hasil konversi: " + des);
                System.out.println("");
                
            } else if (pil == 2) {
                System.out.print("Masukkan bilangan desimal: ");
                int des = vira.nextInt();
                int binary = 0;
                int n, i = 1;
                while (des > 0) {
                    n = des % 2;
                    binary += n * i;
                    i *= 10;
                    des /= 2;
                }
                System.out.println("Hasil konversi: " + binary);
                System.out.println("");
            } else if (pil == 3) {
                System.out.print("Masukkan bilangan biner: ");
                int binary = vira.nextInt();
                int des = 0;
                int i = 1;
                int temp = binary;
                int digit, decDigit;
                
                while (temp > 0) {
                    digit = temp % 10;
                    decDigit = digit * i;
                    des += decDigit;
                    i *= 2;
                    temp /= 10;
                }
                String hex = decimalToHex(des);
                System.out.println("Hasil konversi: " + hex);
                System.out.println("");
            } else if (pil == 4) {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hex = vira.next();
                int des = hexToDecimal(hex);
                int binary = decimalToBinary(des);
                System.out.println("Hasil konversi: " + binary);
                System.out.println("");
            } else if (pil == 5) {
                System.out.print("Masukkan bilangan desimal: ");
                int des = vira.nextInt();
                String hex = decimalToHex(des);
                System.out.println("Hasil konversi: " + hex);
                System.out.println("");
            } else if (pil == 6) {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hex = vira.next();
                int des = hexToDecimal(hex);
                System.out.println("Hasil konversi: " + des);
                System.out.println("");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        vira.close();
    }

    public static String decimalToHex(int des) {
        StringBuilder hex = new StringBuilder();
        while (des > 0) {
            int n = des % 16;
            if (n < 10) {
                hex.insert(0, (char) ('0' + n));
            } else {
                hex.insert(0, (char) ('A' + n - 10));
            }
            des /= 16;
        }
        return hex.toString();
    }

    public static int hexToDecimal(String hex) {
        int des = 0;
        for (int i = hex.length() - 1, base = 1; i >= 0; i--) {
            char digit = hex.charAt(i);
            if (digit >= '0' && digit <= '9') {
                des += (digit - '0') * base;
            } else if (digit >= 'A' && digit <= 'F') {
                des += (digit - 'A' + 10) * base;
            }
            base *= 16;
        }
        return des;
    }

    public static int decimalToBinary(int des) {
        int binary = 0;
        int i = 1;
        while (des > 0) {
            int n = des % 2;
            binary += n * i;
            i *= 10;
            des /= 2;
        }
        return binary;
    }
}
