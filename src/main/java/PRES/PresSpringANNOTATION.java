package PRES;

import METIER.IMETIER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringANNOTATION {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("EXT", "METIER","DAO");
        IMETIER metier = context.getBean(IMETIER.class);
        System.out.println("RESULTAT : "+metier.calcul());
    }
}
