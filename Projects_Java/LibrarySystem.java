import java.util.*;

// User class
class User {
    private String userId;
    private String name;
    private String phone;

    public User(String userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public String getUserId() { return userId; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "ID: " + userId + ", Name: " + name + ", Phone: " + phone;
    }
}

// Book class with Category (No price)
class Book {
    private String bookId;
    private String name;
    private String author;
    private String category;

    public Book(String bookId, String name, String author, String category) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getBookId() { return bookId; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "ID: " + bookId + ", Name: " + name + ", Author: " + author + ", Category: " + category;
    }
}

// Main Library System class
public class LibrarySystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Register New User");
            System.out.println("2. Register New Book");
            System.out.println("3. View All Users");
            System.out.println("4. View All Books");
            System.out.println("5. Update User Details");
            System.out.println("6. Update Book Details");
            System.out.println("7. Delete User");
            System.out.println("8. Delete Book");
            System.out.println("9. Bill Payment");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: registerUser(); break;
                case 2: registerBook(); break;
                case 3: viewUsers(); break;
                case 4: viewBooks(); break;
                case 5: updateUser(); break;
                case 6: updateBook(); break;
                case 7: deleteUser(); break;
                case 8: deleteBook(); break;
                case 9: billPay(); break;
                case 0: System.out.println("Thank you for using Library System."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }

    // User CRUD
    static void registerUser() {
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        users.add(new User(id, name, phone));
        System.out.println("User Registered!");
    }

    static void viewUsers() {
        if (users.isEmpty()) System.out.println("No users found.");
        else {
            System.out.println("User List:");
            for (User u : users) System.out.println(u);
        }
    }

    static void updateUser() {
        System.out.print("Enter User ID to update: ");
        String id = sc.nextLine();
        for (User u : users) {
            if (u.getUserId().equals(id)) {
                System.out.print("Enter new name: ");
                u.setName(sc.nextLine());
                System.out.print("Enter new phone: ");
                u.setPhone(sc.nextLine());
                System.out.println("User updated.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    static void deleteUser() {
        System.out.print("Enter User ID to delete: ");
        String id = sc.nextLine();
        boolean removed = users.removeIf(u -> u.getUserId().equals(id));
        System.out.println(removed ? "User deleted." : "User not found.");
    }

    // Book CRUD
    static void registerBook() {
        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Category (Competitive / Graduation / General / Magazine): ");
        String category = sc.nextLine();
        books.add(new Book(id, name, author, category));
        System.out.println("Book Registered!");
    }

    static void viewBooks() {
        if (books.isEmpty()) System.out.println("No books found.");
        else {
            System.out.println("📚 Book List:");
            for (Book b : books) System.out.println(b);
        }
    }

    static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String id = sc.nextLine();
        for (Book b : books) {
            if (b.getBookId().equals(id)) {
                System.out.print("Enter new book name: ");
                String name = sc.nextLine();
                System.out.print("Enter new author: ");
                String author = sc.nextLine();
                System.out.print("Enter new category: ");
                String category = sc.nextLine();
                books.set(books.indexOf(b), new Book(id, name, author, category));
                System.out.println("Book updated.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String id = sc.nextLine();
        boolean removed = books.removeIf(b -> b.getBookId().equals(id));
        System.out.println(removed ? "Book deleted." : "Book not found.");
    }

    // Billing System (based on number of books, not price)
    static void billPay() {
        if (books.isEmpty()) {
            System.out.println("No books available to bill.");
            return;
        }

        System.out.println("Select Billing Type:");
        System.out.println("1. Normal Due (₹10 per book)");
        System.out.println("2. Late Due (₹30 per book)");
        System.out.print("Enter your choice: ");
        int type = sc.nextInt(); sc.nextLine();

        ArrayList<Book> selectedBooks = new ArrayList<>();
        while (true) {
            System.out.print("Enter Book ID to add (or 'done' to finish): ");
            String id = sc.nextLine();
            if (id.equalsIgnoreCase("done")) break;
            Optional<Book> match = books.stream().filter(b -> b.getBookId().equals(id)).findFirst();
            if (match.isPresent()) {
                selectedBooks.add(match.get());
                System.out.println("Book added: " + match.get().getBookId());
            } else {
                System.out.println("Book not found.");
            }
        }

        int perBookCharge = (type == 1) ? 10 : 30;
        int total = selectedBooks.size() * perBookCharge;

        System.out.println("Books Selected: " + selectedBooks.size());
        System.out.println("Total Payable: ₹" + total);
    }
}
