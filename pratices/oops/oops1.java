    package oops;

    import java.util.ArrayList;

    class book{
        private String bookname;
        private String authorname;
        private String isbm;
        static ArrayList<book> bkcollection=new ArrayList<>();

        public book(String bookname, String authorname, String isbm) {
            this.bookname = bookname;
            this.authorname = authorname;
            this.isbm = isbm;
        } 
        public void setbookname(String bookname)
        {
            this.bookname=bookname;
        }
        public static void addbook(book bk)
        {
        bkcollection.add(bk);
        }
            public static void removebook(book bk)
        {
        bkcollection.remove(bk);
        }
        public void setauthorname(String authorname)
        {
            this.authorname=authorname;
        }
        public void setisbm(String isbm)
        {
            this.isbm=isbm;
        }
        public String getbkname()
        {
            return bookname;
        }
        public String getauthorname()
        {
            return authorname;
        }
        public String getisbm()
        {
            return isbm;
        }
        public  static ArrayList<book> print()
        {
        return bkcollection;
        }
    }
    public class oops1 {
        public static void main(String a[])
        {
            book b1=new book("python","ram","isbm2");
            book b2=new book("sql", "ragul", "isbm5");
            System.out.println("------------------------------------");
            book.addbook(b1);
            book.addbook(b2);
            System.out.println("list of book before remove");
            ArrayList<book> k=book.print();
            for(book l:k)
            {
                    System.out.println(l.getbkname()+" "+l.getauthorname()+" "+l.getisbm());
            }
            System.out.println("list of book after remove");

            book.removebook(b1);
            for(book l:k)
            {
                    System.out.println(l.getbkname()+" "+l.getauthorname()+" "+l.getisbm());
            }
   // ArrayList <book> v=book.bkcollection;
    }
    }
//   b.setbookname("java");
//             b.setauthorname("vicky");
//             b.setisbm("isbm1");


    //    System.out.println("title : "+b.getbkname());
    //         System.out.println("Author name: " +b.getauthorname()+"\nISBN number:"+b.getisbm());
          
    //         System.out.println("title : "+b.getbkname());
    //         System.out.println("Author name: " +b.getauthorname()+"\nISBN number:"+b.getisbm());
   