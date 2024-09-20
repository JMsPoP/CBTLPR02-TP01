public class TestePerson {
    public static void main(String[] args) {
        Person person = new Person("João Silva", "Rua A, 123");
        System.out.println(person); 
        person.setAddress("Rua B, 456");
        System.out.println("Endereço atualizado: " + person.getAddress());

        Student student = new Student("aa", "Rua aa, 789", "Ciência da Computação", 2024, 5000.0);
        System.out.println(student); 
        student.setProgram("Engenharia de Software");
        student.setYear(2025);
        student.setFee(5500.0);
        System.out.println("Programa atualizado: " + student.getProgram());
        System.out.println("Ano atualizado: " + student.getYear());
        System.out.println("Taxa atualizada: " + student.getFee());

        Staff staff = new Staff("bb", "Rua bb, 321", "Escola ABC", 3500.0);
        System.out.println(staff); 
        staff.setSchool("Escola XYZ");
        staff.setPay(3800.0);
        System.out.println("Escola atualizada: " + staff.getSchool());
        System.out.println("Pagamento atualizado: " + staff.getPay());
    }
}
