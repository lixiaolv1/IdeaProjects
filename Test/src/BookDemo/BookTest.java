package BookDemo;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("学习Java","150-321",99.9,5);
        //实例化图书业务对象
        BookBiz bookBiz = new BookBiz();

        bookBiz.sellBook(book);

        System.out.println(book.getCount());
        
    }

}
