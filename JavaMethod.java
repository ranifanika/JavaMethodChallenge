public class JavaMethod{

        public static void main(String[] args){
            System.out.println("Rani, 20, Bintang");
            System.out.println("Fanika, 19, Bulan");
            myMethod("Nama");
            delete(17);
            System.out.println(validateNumber(100));
        }
        static void human(String nama, int umur, String Alamat){
            System.out.println("nama :" + nama + ". umur :" + umur);
        }
        static void myMethod(String nama){
            System.out.println("Rani Fanika");
        }
        static void delete(int angka){
            System.out.println("berhasil menghapus mahasiswa nomor " + angka);
        }
        static boolean validateNumber(int angka){
            if(angka < 50){
                return true;
            } else {
                return false;
            }
        }
    }