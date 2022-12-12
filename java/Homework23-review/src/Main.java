import services.Db;
public class Main {
    public static void main(String[] args) {

        Db con = new Db();
        con.getConnect();

    }
}