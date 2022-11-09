public class UserRepo {
    private User[] users;
    private int userCount;

    public UserRepo() {
        this.users = new User[3];
        this.userCount = 0;
    }

    void addUser(String username, String password) throws TooManyUsersException, BadCredinalsException {
        if (userCount >= 3) {
            throw new TooManyUsersException("The repo is full");
        }
        if (username.length() > 10) {
            throw new BadCredinalsException("Invalid credinals!");
        }
        if (password.length() > 10) {
            throw new BadCredinalsException("Invalid credinals!");
        }
        users[userCount] = new User(username, password);
        userCount++;
    }
}