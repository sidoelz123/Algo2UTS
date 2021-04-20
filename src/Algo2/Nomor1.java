package Algo2;

public class Nomor1 {

public static void Title() {
        String myHeader;
        myHeader = "==============================" +
        "\nAlgoritma dan Struktur Data 2\n" +
        "==============================";
        System.out.println(myHeader);
        }
public  static void PrintName(){
        String Name = "Ihza Maulana Zakiya";
        int NIM = 20090049;
        System.out.println("Nama : " + Name + "\nNIM : " +NIM+ "\n");

        }


    public static void Judul() {
        String myHeader;
        myHeader = "==============================" +
                "\nSorting dan Searching\n" +
                "==============================";
        System.out.println(myHeader);
    }

    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void selectionSort(int[] data){
        for (int i=0; i<data.length-1; i++){
            int indexSmall = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j] < data[indexSmall]){
                    indexSmall = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexSmall];
            data[indexSmall] = temp;
        }
    }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("\nindeks pointer = "+middle);
            if (key == data[middle]){
                System.out.println("\nData "+key+", telah ditemukan pada  indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- Cari di kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("Cari di kanan ->");
                    indexAwal = middle+0;
                }
            }
        }
        if (found == 1){
            System.out.println("\ndata telah ditemukan");
        }
        else{
            System.out.println("\ndata tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        Nomor1.Judul();

        int[] nilai = {3, 10, 4, 2, 8, 13};

        System.out.println("Data sebelum diurutkan : ");
        printData(nilai);
        selectionSort(nilai);
        System.out.println("\nData Setelah diurutkan :");
        printData(nilai);

        int key = 8;

        binarySearch(nilai, key);
        Nomor1.Title();
        Nomor1.PrintName();
    }
}

