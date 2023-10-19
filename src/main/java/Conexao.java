import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sistemadeagendamento";
        String usuario = "root";
        String senha = "1234";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            if(conexao != null){
                System.out.println("Tudo certo meu parceiro");
            } else {
                System.out.println("Deu ruim bro");
            }
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
