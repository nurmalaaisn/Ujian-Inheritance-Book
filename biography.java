public class biography extends TextBook{
    String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public biography() {
        super();
        about = "";
    }

    public biography(String title, String subject, String about, int year, double price) {
        super(subject, title, year, price);
        this.about = about;
    }

    public void print() {
        super.print();
        System.out.println("About : " +about);
        
    }

    
}
