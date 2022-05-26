package controller;

import business.BOFactory;
import business.BOType;
import business.custom.CustomerBO;
import com.jfoenix.controls.JFXTextField;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class CustomerController {
    public JFXTextField txtCustomerID;
    public JFXTextField txtCustomerAddress;
    public JFXTextField txtCustomerContact;
    public JFXTextField txtCustomerName;
    public JFXTextField txtCustomerNic;

    CustomerBO customerBO = BOFactory.getInstance().getBO(BOType.CUSTOMER);

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String id = txtCustomerID.getText();
        String name = txtCustomerName.getText();
        String address = txtCustomerAddress.getText();
        String contact = txtCustomerContact.getText();
        String nic = txtCustomerNic.getText();

        try {
            boolean flag = customerBO.save(new CustomerDTO(id, name, address, contact, nic));

            if(flag){
                new Alert(Alert.AlertType.CONFIRMATION,"Success").showAndWait();
            }else {
                new Alert(Alert.AlertType.ERROR,"Error").showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
