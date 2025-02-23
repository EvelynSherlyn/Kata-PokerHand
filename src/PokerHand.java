import java.util.ArrayList;
import java.util.Collections;

public final class PokerHand {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.size()<5  || cards.size()>7) {
            return false;
        }
        //ordenar
        Collections.sort(cards);
        //---------------
        int aux=0;
        Integer num = cards.get(0);
        for (Integer lista: cards) {
            if (lista==num) {
                aux++;
            }
            num++;
        }
        if (aux==4 && cards.get(4)==14) {
            return true;
        }
        return aux == cards.size();
    }
}