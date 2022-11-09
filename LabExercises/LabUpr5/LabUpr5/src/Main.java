public class Main {
    public static void main(String[] args) {
        UserRepo users = new UserRepo();
        try{
            users.addUser("Stefan","53574");
            users.addUser("Ivan","325890");
            users.addUser("Dimitri","0121321");
            users.addUser("Ivailo","543567");
        }
        catch(TooManyUsersException e){
            e.printStackTrace();
        }
        catch(BadCredinalsException e){
            e.printStackTrace();
        }
    }
}