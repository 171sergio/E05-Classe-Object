public class Main {

    public static void main(String[] args) {
        // Instâncias originais
        Client pessoa1 = new Individual("Rua XYZ, 123", "Jhonatan Bruno", 30, 'M', "123456789");
        Account contapf1 = new Account(pessoa1, 1000.0, 123456, 500.0F, "001");
        Client empresa1 = new JuridicalPerson("R. Rio Pomba", "Primo's Barber", "Beleza", 3, "12345678901234");
        Account contapj1 = new Account(empresa1, 10000.0, 5789, 200000.0F, "002");

        // Instâncias com dados diferentes
        Client pessoa2 = new Individual("Rua ABC, 456", "Carlos Silva", 25, 'M', "987654321");
        Account contapf2 = new Account(pessoa2, 2000.0, 654321, 1000.0F, "003");
        Client empresa2 = new JuridicalPerson("Av. Brasil", "Tech Solutions", "Tecnologia", 50, "43210987654321");
        Account contapj2 = new Account(empresa2, 15000.0, 9876, 300000.0F, "004");

        // Instâncias com dados iguais
        Client pessoa3 = new Individual("Rua XYZ, 123", "Jhonatan Bruno", 30, 'M', "123456789");
        Account contapf3 = new Account(pessoa3, 3000.0, 123456, 750.0F, "001");
        Client empresa3 = new JuridicalPerson("R. Rio Pomba", "Primo's Barber", "Beleza", 3, "12345678901234");
        Account contapj3 = new Account(empresa3, 25000.0, 5789, 400000.0F, "002");

        // Testando a comparação
        System.out.println("Comparando pessoa1 e pessoa3 (deveria ser true): " + pessoa1.equals(pessoa3));
        System.out.println("Comparando contapf1 e contapf3 (deveria ser true): " + contapf1.equals(contapf3));

        System.out.println("Comparando pessoa1 e pessoa2 (deveria ser false): " + pessoa1.equals(pessoa2));
        System.out.println("Comparando contapf1 e contapf2 (deveria ser false): " + contapf1.equals(contapf2));

        System.out.println("Comparando empresa1 e empresa3 (deveria ser true): " + empresa1.equals(empresa3));
        System.out.println("Comparando contapj1 e contapj3 (deveria ser true): " + contapj1.equals(contapj3));

        System.out.println("Comparando empresa1 e empresa2 (deveria ser false): " + empresa1.equals(empresa2));
        System.out.println("Comparando contapj1 e contapj2 (deveria ser false): " + contapj1.equals(contapj2));
    }
}
