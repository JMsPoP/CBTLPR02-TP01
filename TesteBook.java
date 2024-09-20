public class TesteBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@gamail.com", 'm');
        authors[1] = new Author("Autor 02", "autor02@gamail.com", 'f');

        Book testeBook = new Book("teste04", authors, 19.99, 99);
        System.out.println(testeBook); 

        System.out.println("Nome do Livro: " + testeBook.getName());
        System.out.println("Preço do Livro: " + testeBook.getPrice());
        System.out.println("Quantidade: " + testeBook.getQty());
        
        System.out.println("Nomes dos Autores: " + testeBook.getAuthorsNames());

        testeBook.setPrice(25.99);
        testeBook.setQty(120);

        System.out.println("Informações atualizadas do Livro: " + testeBook);
    }
}
