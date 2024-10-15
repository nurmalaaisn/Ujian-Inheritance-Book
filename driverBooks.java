import java.util.Scanner;

public class driverBooks {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("|                  SELAMAT DATANG                  |");
        System.out.println("====================================================");
        System.out.println("Pilih :\n 1. Text Book\n 2. Novel");
        System.out.println("====================================================");
        int pilihan = s.nextInt();
        System.out.println("====================================================");

        if (pilihan == 1) {
            System.out.println("Title : ");
            String title = s.next();

            System.out.println("Year : ");
            int year = s.nextInt();
            s.nextLine();

            System.out.println("Price : ");
            double price = s.nextDouble();
            s.nextLine();

            System.out.println("Subject : ");
            String subject = s.next();

            System.out.println("====================================================");
            TextBook tb1 = new TextBook(subject, title, year, price);
            tb1.print();
            System.out.println("====================================================");
            System.out.println("Tambah Biography? 1/2 (1. Ya 2. Tidak)");
            int pilih2 = s.nextInt();
            System.out.println("====================================================");

            switch (pilih2) {
                case 1:
                    System.out.println("About : ");
                    String about = s.next();
                    System.out.println("====================================================");
                    biography b1 = new biography(subject, title, about, year, price);
                    b1.print();
                    System.out.println("====================================================");
                    break;

                case 2:
                    tb1.print();
                    System.out.println("====================================================");
                    System.out.println("|         ANDA TIDAK MENAMBAHKAN BIOGRAPHY         |");
                    System.out.println("====================================================");
                    break;

                default:
                    System.out.println("|                 INPUTAN TIDAK ADA                |");
                    System.out.println("====================================================");
                    break;
            }

        } else if (pilihan == 2) {
            System.out.println("Title : ");
            String title = s.next();

            System.out.println("Year : ");
            int year = s.nextInt();
            s.nextLine();

            System.out.println("Price : ");
            double price = s.nextDouble();
            s.nextLine();

            System.out.println("Genre : ");
            String genre = s.next();

            System.out.println("====================================================");
            novel n1 = new novel(title, genre, year, price);
            n1.print();
            System.out.println("====================================================");

        } else {
            System.out.println("|                 INPUTAN TIDAK ADA                |");
            System.out.println("====================================================");
        }

    }

}