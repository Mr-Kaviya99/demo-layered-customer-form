package business.custom;

import business.SuperBO;
import dto.CustomerDTO;

public interface CustomerBO extends SuperBO {
    boolean save(CustomerDTO dto)throws Exception;
}
