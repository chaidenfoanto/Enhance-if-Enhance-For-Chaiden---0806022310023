public class en_for {
    public static void main(String[] args) {
// Membuat array dua dimensi untuk menyimpan umur dan nama
        Object[][] people = {
            {"Chaiden", 18},
            {"Ivone", 12},
            {"Leonard", 15},
            {"Felicia", 21}
        };

//Membuat tabel kolom nama dan umur
        System.out.println("==========================");
        System.out.println("|      Nama     |  Umur  |");
        System.out.println("==========================");
// //Menggunakan loop for biasa untuk bikin kolom nama dan umur
//         for (int i = 0; i < people.length; i++) {
//             String name = (String) people[i][0];
//             int age = (int) people[i][1];
//             System.out.format("| %-13s | %-6s |\n", name, age);
//         }
//         System.out.println("==========================");


//Menggunakan enchance for atau for-each loop untuk bikin kolom nama dan umur
        for (Object[] person : people) {
            System.out.format("| %-13s | %-6s |\n", person[0], person[1]);
        }
        System.out.println("==========================");

    }
}
