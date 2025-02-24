package EXT;

import DAO.IDAO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("Get Data via un web service ");
        double temp = 21;
        return temp;
    }
}
