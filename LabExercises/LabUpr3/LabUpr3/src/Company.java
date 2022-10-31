public class Company {
    private String name;
    private String dateCreated;
    private String bulstat;

    public Company(String name, String dateCreated, String bulstat){
        this.name = name;
        this.dateCreated = dateCreated;
        setBulstat(bulstat);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if(bulstat.length() == 10) {
            this.bulstat = bulstat;
        }
    }
}