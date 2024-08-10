import java.sql.*;

public class CreateTable {

    public void createDataBase() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","guest","guest");
        Statement statement = connection.createStatement();
//        statement.execute("CREATE DATABASE test");
        connection.close();

    }

    public void createDb() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","guest","guest");
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS emp " +
                "(emp_id INTEGER NOT NULL, name VARCHAR NOT NULL, age INTEGER, PRIMARY KEY(emp_id))";
        statement.execute(sql);
        connection.commit();
        connection.close();

    }

    public void addRec() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","guest","guest");
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?,?)");
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"Hari");
        preparedStatement.setInt(3,25);

        PreparedStatement preparedStatement2 = connection.prepareStatement("insert into emp values(?,?,?)");

        preparedStatement2.setInt(1,1);
        preparedStatement2.setString(2,"Hari");
        preparedStatement2.setInt(3,25);



        preparedStatement.execute();
        preparedStatement2.execute();
        connection.commit();
        connection.close();
    }
}
