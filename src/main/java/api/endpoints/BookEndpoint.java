package api.endpoints;

public enum BookEndpoint {

    ADD_BOOK("/BookStore/v1/Books");

    private final String book;

    BookEndpoint(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }
}
