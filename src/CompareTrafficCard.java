// Tehtävä 19

import usingjcapi.TrafficCard;
import java.util.Comparator;
import java.util.TreeSet;


public class CompareTrafficCard {

    public static void main(String[] args) {
        
        Comparator<TrafficCard> comparatorTrafficCard = new Comparator<TrafficCard>() {
            @Override
            public int compare(TrafficCard o1, TrafficCard o2) {
                return o1.toString().compareTo(o2.toString());
            }
        };
        
        TreeSet<TrafficCard> tree = new TreeSet<TrafficCard>(comparatorTrafficCard);
        
        tree.add(new TrafficCard(1, "test2", 2.0f));
        tree.add(new TrafficCard(2, "test3", 3.0f));
        tree.add(new TrafficCard(3, "test4", 4.0f));
        tree.add(new TrafficCard(3, "test4", 4.0f));
        tree.add(new TrafficCard(4919, "test1", 1.0f));
        
        System.out.println("TrafficCards: " + tree);

    }

}