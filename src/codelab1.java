public class codelab1 {

        public static void main(String[] args) {
            String nama = "Abdullah Ali Zulfik";
            int a = 0;
            String code = "String";
            String[][] jadwal = {
                    {"Senin", "Matematika Diskrit", "08:00 - 09:40"},
                    {"Selasa", "Logika dan Komputasi", "10:00 - 11:40"},
                    {"Rabu", "Aljabar Linear dan Matriks", "09:00 - 10:40"},
                    {"Kamis", "Pemrograman Lanjut", "13:00 - 14:40"},
                    {"Jumat", "Sistem Operasi", "08:00 - 09:40"},
                    {"Sabtu", "Pemograman Lanjut 10:00 - 09:40"}

            };

            System.out.println("Jadwal Kuliah Minggu Ini:");
            System.out.println("Meledeakkkk");
            System.out.println("----------------------------");
            for (String[] mataKuliah : jadwal) {
                System.out.printf(" %s/n, %-10s | %-25s | %s%n", nama, mataKuliah[0], mataKuliah[1], mataKuliah[2]);
            }
        }


}
