public class TesteAuthor {
    public static void main(String[] args) {
        Author author = new Author("JM", "jm@gmail.com", 'm');
        System.out.println("Construtor testado: " + author.toString());

        System.out.println("Método toString: " + author.toString());

        author.setEmail("aa@gmail.com");
        System.out.println("Email atualizado: " + author.getEmail());

        System.out.println("Nome: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gênero: " + author.getGender());
    }
}
