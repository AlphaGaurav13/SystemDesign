class Book {
    // Add private fields: title (String), author (String), isbn (String), isAvailable (boolean)
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailble;
    public Book(String title, String author, String isbn) {
        // Initialize fields. Book starts as available.
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvailble = true;
    }

    public boolean borrowBook() {
        // Mark book as unavailable if currently available
        // Return true if successful, false if already borrowed
        if(isAvailble) {
            isAvailble = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        // Mark book as available
        isAvailble = true;
    }

    public void displayInfo() {
        // Print: "Title by Author (ISBN: isbn) - Available" or "- Borrowed"
        String status = (isAvailble == true) ? "Available" : "Borrowed";
        System.out.println(title + " by " + author + " (" + "ISBN: " + isbn + ") - " + status); 
    }
}
