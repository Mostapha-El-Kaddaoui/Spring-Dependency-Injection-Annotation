package PRES;

import METIER.IMETIER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javax.sql.rowset.spi.XmlReader;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //IMETIER metier = (IMETIER) context.getBean("metier");
        // Chercher parmi les objets creer
        IMETIER metier = context.getBean(IMETIER.class);
        System.out.println("RESULTAT : "+ metier.calcul());

    }
}
