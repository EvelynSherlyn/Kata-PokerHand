import java.util.ArrayList;
import java.util.Collections;

public final class PokerHand {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.size()<5  || cards.size()>7) {
            return false;
        }
        //ordenar
        Collections.sort(cards);
        int aux=0;
        Integer num = cards.get(0);
        //---------------
        /* 7 cards */
        if (cards.size()==7) {
            ArrayList<Integer> listAux = new ArrayList<Integer>();
            for (Integer nuevo:cards){
                if(!listAux.contains(nuevo)) {
                    listAux.add(nuevo);
                }
            }
            for (Integer lista: listAux) {
                if (lista==num) {
                    aux++;
                }
                num++;
            }
            int last = listAux.size()-1;
            if (cards.get(last)==14) {
                return true;
            }
            return aux == listAux.size();
        }
        //---------------
        /* 5 cards */
        for (Integer lista: cards) {
            if (lista==num) {
                aux++;
            }
            num++;
        }
        if (aux==cards.size()-1 && cards.get(4)==14) {
            return true;
        }
        return aux == cards.size();
    }
}