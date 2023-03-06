import java.util.Arrays;
import java.util.Scanner;
public class Reader {
    private String fio;
    private String readerNumber;
    private String faculty;
    private String data;
    private String phoneNumber;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] array = new Reader[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("введите фио для читателя " + i);
            String fio = in.next();

            System.out.println("введите читательский билет для читателя " + i);
            String readerNumber = in.next();

            System.out.println("введите факультет для читателя " + i);
            String faculty = in.next();

            System.out.println("введите дату рождения для читателя " + i);
            String data = in.next();

            System.out.println("введите номер телефона для читателя " + i);
            String phoneNumber = in.next();

            array[i] = new Reader(fio, readerNumber, faculty, data, phoneNumber);
            System.out.println("Сколько книг взял " + fio);
            array[i].takeBook(in.nextInt());
            System.out.println("Какие книги взял " + fio);
            String temp = in.nextLine();
            array[i].takeBook(in.nextLine().split(", "));

            System.out.println("Сколько книг вернул " + fio);
            array[i].returnBook(in.nextInt());
            System.out.println("Какие книги вернул " + fio);
            temp = in.nextLine();
            array[i].returnBook(in.nextLine().split(", "));
        }

    }

    public Reader(String fio, String readerNumber, String faculty, String data, String phoneNumber){
        this.fio = fio;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.data = data;
        this.phoneNumber = phoneNumber;
    }
    public void takeBook(int booksNum) {
        System.out.println(fio + " взял(а) " + booksNum + " книг");
    }
    public void takeBook(String[] booksTitle) {
        String booksTitles = String.join(", ", booksTitle);
        System.out.println(fio + " взяла(а) книги: " + booksTitles);
    }
    public void returnBook(int booksNum) {
        System.out.println(fio + " вернул(а) " + booksNum + " книг");
    }
    public void returnBook(String[] booksTitle) {
        String booksTitles = String.join(", ", booksTitle);
        System.out.println(fio + " ввернул(а) книги: " + booksTitles);
    }
    public String getFio() {
        return fio;
    }
    public String getReaderNumber() {
        return readerNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getData() {
        return data;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setReaderNumber(String readerNumber) {
        this.readerNumber = readerNumber;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
