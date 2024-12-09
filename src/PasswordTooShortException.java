class PasswordTooShortException extends Exception {
    int id ;
    public PasswordTooShortException(){
        System.out.println("The password is too");
    }
    public PasswordTooShortException(String msg) {
        super(msg);
    }
    public PasswordTooShortException(String msg ,int id) {
        super(msg);
        this.id = id;
    }
}
