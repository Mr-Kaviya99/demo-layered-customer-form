package business.custom.impl;

import business.custom.CustomerBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.CustomerEntity;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO = DAOFactory.getInstance().getDAO(DAOType.CUSTOMER);

    @Override
    public boolean save(CustomerDTO dto) throws Exception {
        return customerDAO.save(new CustomerEntity(dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getContact(),
                dto.getNic()));
    }
}
