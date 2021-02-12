import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        BorrowSystem borrowSystem=new BorrowSystem();
        borrowSystem.borrow("书1","YY");
        borrowSystem.returnBook("书1","YY");
        borrowSystem.borrow("书1","SB");

    }



}
