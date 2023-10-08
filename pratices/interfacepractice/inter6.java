package interfacepractice;
interface searchable
{
    boolean search(String keyword);
}
class document implements searchable
{
    private String doc;
public document(String doc)
{
    this.doc=doc;
}
@Override
public boolean search(String keyword) {
return doc.contains(keyword);
}
}
class webpage implements searchable
{
    private String url;
    private String web;
    public webpage(String url,String web)
    {
        this.url=url;
        this.web=web;
}
@Override
public boolean search(String keyword) {
    // TODO Auto-generated method stub
return web.contains(keyword);
}
}
public class inter6 {
    public static void main(String a[])
{
    document d=new document("this is my folder");
    System.out.println(d.search("folder"));
    
    webpage wp=new webpage("www.vicky.com","this id is every things");
    System.out.println(  wp.search("every"));
  
}
}

