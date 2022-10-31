public class Firm_ET extends Company {
        private String ownerName;
        private double initialCapital;
        private double actualCapital;

        public  Firm_ET(String name, String dateCreated, String bulstat, String ownerName, double initialCapital, double actualCapital){
            super(name, dateCreated, bulstat);
            this.ownerName = ownerName;
            this.initialCapital = initialCapital;
            this.actualCapital = actualCapital;
        }

    public String getOwnerName() {
            return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }
    public double calculateCapital(){
            return actualCapital - initialCapital;
    }
}