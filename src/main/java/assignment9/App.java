package assignment9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded.");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle12c.scs.ryerson.ca:1521/orcl12c",
                    "hpstuart", "11060173");
            System.out.println("con successfull with:" + " " + con);
            java.sql.Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("Select * from customers");
            // Print results from select statement
            while (result.next()) {
                System.out.println(result.getString(2) + " " + result.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        launch();
    }

}