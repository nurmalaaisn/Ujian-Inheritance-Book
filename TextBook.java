public class TextBook extends book {
       protected String subject;
    
        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public TextBook() {
            super(); // mengakses constructir superclass
            subject = "";
        }

        public TextBook(String subject, String title, int year, double price) {
            super(title, year, price);
            this.subject = subject;
        }
    
    
        public void print() {
            super.print();
            System.out.println("Subject : " +subject);

        }
    }

