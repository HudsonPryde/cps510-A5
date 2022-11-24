/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cps510javaui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author syeda
 */
public class AddCustomerController implements Initializable {
private Stage stage;
 private Scene scene;
 private Parent root;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void switchToAddCustomer(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("AddCustomer.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
@FXML
     public void switchToMainScene(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
     public void switchToRewards(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("RewardsScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
     public void switchToNames(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("CustomerScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
     
    
}
