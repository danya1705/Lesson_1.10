public class Main {
    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen", "King");
        Author hermannHesse = new Author ("Hermann", "Hesse");
        Author franzKafka = new Author("Franz", "Kafka");

        System.out.println(franzKafka);

        Book misery = new Book("Misery", stephenKing, 1987);
        Book theGreenMile = new Book("The Green Mile", stephenKing, 1996);
        Book dasGlasperlenspiel = new Book("Das Glasperlenspiel", hermannHesse, 1943);
        Book derSteppenwolf = new Book("Der Steppenwolf", hermannHesse, 1927);
        Book derProcess = new Book("Der Process", franzKafka, 1925);

        System.out.println(misery);
        System.out.println(derProcess);
        System.out.println(dasGlasperlenspiel);

        misery.setPublicationYear(2000);

        System.out.println(misery);

        System.out.println(misery.equals(new Book("Misery", stephenKing, 2000)));

    }
}