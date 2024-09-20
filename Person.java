/*
 * TRABALHO PRÁTICO 01 ex 3: Implemente o sistema representado pelo diagrama abaixo.
Obrigatório implementar uma classe de testes para todos os métodos das classes Staff e
Student.
 * @author: João Marcos Teles Silva CB3026787

 */



public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}
