import java.util.Date;

class Client{
    private String name;
    private String adress;
    private Date date;


    public Client(String adress, String name) {

        this.adress = adress;
        this.name = name;
        this.date = new Date();

    }

    public void print(){
        System.out.println("Cliente inválido");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public Date getDate() {
        return date;
    }
}