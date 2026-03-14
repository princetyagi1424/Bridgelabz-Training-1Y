package constructor.AccessModifiers;
import java.util.Scanner;
class Book{
    public int ISBN;
    protected String title;
    private String author;
    void setAuthor(String a){
        author=a;
    }
    String getAuthor(){
        return author;
    }
}
class EBook extends Book{
    void show(){
        System.out.println("ISBN:"+ISBN);
        System.out.println("Title:"+title);
        System.out.println("Author:"+getAuthor());
    }
}
class BookLibrarySystem{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        s.nextLine();
        String t=s.nextLine();
        String a=s.nextLine();
        EBook se=new EBook();
        se.ISBN=i;
        se.title=t;
        se.setAuthor(a);
        se.show();
    }
}
