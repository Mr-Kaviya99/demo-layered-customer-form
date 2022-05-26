package dao.custom.impl;

import dao.custom.CustomerDAO;
import db.DBConnection;
import entity.CustomerEntity;
import entity.SuperEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(CustomerEntity entity) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customerDetails VALUES " +"(?,?,?,?,?)");
        preparedStatement.setObject(1,entity.getCustomer_ID());
        preparedStatement.setObject(2,entity.getCustomer_Name());
        preparedStatement.setObject(3,entity.getCustomer_Address());
        preparedStatement.setObject(4,entity.getCustomer_Contact());
        preparedStatement.setObject(5,entity.getCustomer_NIC());

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean update(CustomerEntity entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String key) throws Exception {
        return false;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        return null;
    }

    @Override
    public CustomerEntity get() throws Exception {
        return null;
    }
}
