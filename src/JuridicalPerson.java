import java.util.Objects;

public class JuridicalPerson extends Client{

    private String sector;
    private int numFuncionarios;
    private String CNPJ;


    public JuridicalPerson(String adress, String name, String sector, int numFuncionarios, String CNPJ) {
        super(adress, name);
        this.sector = sector;
        this.numFuncionarios = numFuncionarios;
        this.CNPJ = CNPJ;
    }
    @Override
    public String toString(){
        String jdStr;
        jdStr = " CNPJ: " + this.getCNPJ() +
        " Nome: " + this.getName() +
        " Endereço: " + this.getAdress()+
        " Número de funcionários: " + this.numFuncionarios+
        " Setor: " + this.getSector()+
        " Data de criação: " + this.getDate();
        return jdStr;
    }
    @Override
    public boolean equals(Object obj){
        JuridicalPerson pJcomp = (JuridicalPerson) obj;
        return pJcomp.getCNPJ().equals(this.CNPJ);
    }
    @Override
    public int hashCode() {
        return Objects.hash(CNPJ);
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        sector = sector;
    }
}
