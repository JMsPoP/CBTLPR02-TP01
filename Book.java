/*
 * TRABALHO PRÁTICO 01 ex 2: Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve
ter um array de autores, conforme o modelo abaixo:.
 * @author: João Marcos Teles Silva CB3026787
 - 3 atributos privados name (String), email (String), and gender (char contendo 'm' or 'f');
- Um construtor para inicializar os atributos com base nos 3 parâmetros.
- Não existe um construtor default para Author [Author()].
- Criar métodos públicos: getName(), getEmail(), setEmail(), and getGender().
- Não existe setter para name e gender, estes atributos não podem ser alterados.
- Um método chamado toString() que retorna "Author[name=?,email=?,gender=?]",
exemplo "Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]".
- Escreva a classe Author e desenvolva uma de teste, com os seguintes itens:

- Testar construtor.
- Verificar o método toString().
- Testar o Setter
- Testar os Getters

 */


public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0; 
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorsNames() {
        StringBuilder authorsNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsNames.append(authors[i].getName());
            if (i != authors.length - 1) {
                authorsNames.append(", ");
            }
        }
        return authorsNames.toString();
    }

    @Override
    public String toString() {
        StringBuilder authorsInfo = new StringBuilder();
        authorsInfo.append("{");
        for (int i = 0; i < authors.length; i++) {
            authorsInfo.append(authors[i].toString());
            if (i != authors.length - 1) {
                authorsInfo.append(", ");
            }
        }
        authorsInfo.append("}");
        
        return "Book[name=" + name + ", authors=" + authorsInfo + ", price=" + price + ", qty=" + qty + "]";
    }
}
