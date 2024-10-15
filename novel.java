public class novel extends book{
    String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public novel() {
        super();
        genre = "";
    }

    public novel(String title, String genre, int year, double price){
        super(title, year, price);
        this.genre = genre;
    }

    public void print() {
        super.print();
        System.out.println("Genre : " +genre);
        
    }
    
}
