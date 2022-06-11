package javaprogramming.lab1;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Nguyen Huy Hoang", "hoang@nowhere.com", 'h');
        System.out.println(author);



        author.setEmail("teck@somewhere.com");
        System.out.println(author);

        System.out.println("name is: " + author.getName());

        System.out.println("gender is: " + author.getGender());

        System.out.println("email is: " + author.getEmail());

    }
}
