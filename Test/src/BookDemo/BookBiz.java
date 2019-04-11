package BookDemo;
/*
*图书的业务类，封装了对图书的业务操作
 */
public class BookBiz {
    /*
    * 要销售的书籍，如果销售成功，返回销售的数量；如果失败，返回-1，
     */
    public int sellBook(Book book){
        // 1、判断图书的库存是否大于1
        // 2、图书的库存-1
        // 3、返回销售的数量
        if (!(book.getCount() > 1)) {
            //可以销售
            return -1;
        }
        book.setCount(book.getCount() - 1);
        return 1;
    }

}
