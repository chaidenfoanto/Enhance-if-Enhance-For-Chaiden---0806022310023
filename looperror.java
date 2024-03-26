public class looperror {
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//Menampilkan deretan isi array variabel angka
        System.out.print("Deretan Angka =\n\t> [");
        for(int i=0;i<angka.length;i++){
            if (i != (angka.length-1)) System.out.print(angka[i] +", ");
            else System.out.println(angka[i]+"]");
        }

        
//Menampilkan angka genap dari deretan array menggunakan looping enhance for
        System.out.print("\n\n- Angka genap dari angka diatas ditambah 3 (Enhance For) :\n\t> ");
        for (int num : angka) {     //enhance for disini untuk menambahkan 3 angka tiap angka genap yang diambil dari array angka yang di simpan ke variabel sementara num
            if (num % 2 == 0) {
                num += 3;

            }
        }

        for (int num : angka) {     
            if (num % 2 == 0) {
                if (num != angka[angka.length-1]) System.out.print(num + ", ");
                else System.out.println(num); /**namun disini setelah walaupun sudah di num+=3 diatas, outputnya tidak tertambahkan angka 3
                                                * karena yang yang tertambah hanya divariabel semntara diatas, jadi saat dipanggil lagi num 
                                                oleh for-each yang berbeda dia tidak bisa membaca num yang sudah di tambahkan
                                                **/
            }
        }

//Menampilkan angka ganjil saja dari deretan array 
        System.out.print("\n\n- Setiap angka ganjil ditambahkan 3 (Loop For) :\n\t> ");
        for(int i=0;i<angka.length;i+=2){
            if (i != (angka.length-1)){
                angka[i]+=3;
                System.out.print(angka[i] +", ");
            }
            else {
                angka[i]+=3;
                System.out.println(angka[i]);
            }
        }

    }
}
