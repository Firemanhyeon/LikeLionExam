package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.Book;
import sample.config.BookConfig;

public class SpringExam03 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
        Book book = context.getBean(Book.class);
        book.setTitle("aaa");
        book.setPrice(123);
        System.out.println(book.getTitle());
    }
}
