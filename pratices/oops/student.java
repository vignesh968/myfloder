    package oops;

    import java.util.ArrayList;

    class stud{
    private int st_id;
    private String name;
    private String address;
    private static ArrayList< stud > stcollection=new ArrayList< stud >();
  
    public stud(int st_id, String name, String address) {
        this.st_id = st_id;
        this.name = name;
        this.address = address;
    }
    public int getSt_id() {
        return st_id;
    }
    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static void addstud(stud st)
    {
        stcollection.add(st);
    }
    public static void removestud(stud st)
    {
        stcollection.remove(st);
    }
    public static ArrayList<stud> getStcollection() {
        return stcollection;
    }
    }
    public class student {
        public static void main(String a[])
        {
            stud st1=new stud(1,"vicky","trichy");
            stud st2=new stud(2, "rakesh","padalur");
            stud st3=new stud(3, "ram", "salam");
            stud.addstud(st1);
            stud.addstud(st2);
            stud.addstud(st3);
            ArrayList<stud>stcollection=stud.getStcollection();  
            for(stud st:stcollection)
            {
                System.out.println(st.getName()+" "+st.getSt_id()+" "+st.getAddress());
            }      
            System.out.println("----------------");
            stud.removestud(st3);
            for(stud st:stcollection)
            {
                System.out.println(st.getName()+" "+st.getSt_id()+" "+st.getAddress());
            }  
        }
    }
