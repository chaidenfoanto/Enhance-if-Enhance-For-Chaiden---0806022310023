public class en_if {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
// Penggunaan if-else untuk menentukan nilai terbesar antara num1 dan num2
        // int max;
        // if (num1 > num2) {
        //     max = num1;
        // } else {
        //     max = num2;
        // }
        // System.out.println("Nilai terbesar adalah\t: " + max);
        
 // Contoh dengan menggunakan if-else untuk menentukan bilangan ganjil atau genap
        // String result;
        // if (num1 % 2 == 0) {
        //     result = "Genap";
        // } else {
        //     result = "Ganjil";
        // }
        // System.out.println("Angka "+ num1 +" adalah angka\t: " + result);


// BISA DILAKUKAN ALTERNATIF SEPERTI DIBAWAH INI


// Penggunaan enhanced if untuk menentukan nilai terbesar antara num1 dan num2
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Nilai terbesar adalah\t: " + max);
        
// Contoh lain dengan menggunakan enhanced if untuk menentukan angka ganjil atau genap
        String result = (num1 % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka "+num1+" adalah angka\t: " + result);
    }
}