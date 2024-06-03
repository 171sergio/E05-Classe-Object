import java.util.Objects;

public class Individual extends Client {
    private int age;
    private char sex;
    private String CPF;

    public Individual(String adress, String name, int age, char sex, String CPF) {
        super(adress, name);
        this.age = age;
        this.sex = sex;
        this.CPF = CPF;

    }
    @Override
    public String toString(){
       String individualStr;
       individualStr =  
       " CPF: " + this.getCPF()+ "\n" +
       " Nome: " + this.getName()+ "\n" +
       " Endereço: " + this.getAdress()+ "\n" +
       " Idade: " + this.getAge()+ "\n" +
       " Sexo: " + this.getSex()+ "\n" +
       " Data de criação: " + this.getDate() + "\n\n";
       return individualStr;
    }

    @Override
    public boolean equals(Object obj){
        Individual pFisicaComparada = (Individual) obj;
        return pFisicaComparada.getCPF().equals(this.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
