package METIER;

import DAO.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMETIER {
    private IDAO dao;
    public MetierImpl(@Qualifier("dao2") IDAO dao) {
        this.dao = dao;
    }
/*
pour uutilise une inversion avec constructeur o doit avoir un seul en fonction
    public MetierImpl() {
    }

*/
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
