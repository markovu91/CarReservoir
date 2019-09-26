package carreservoir;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

public class ReservoirEvent {
    int currentState = 100;
    int reserveLimit = 10;
    private List<ReservoirListener> listeners = new ArrayList();
    public void addListener(ReservoirListener rl){
        listeners.add(rl);
    }
    public void removeListener(ReservoirListener rl){
        listeners.remove(rl);
    }
    
    public void distributeevent(){
        
        for (ReservoirListener rl: listeners) {
            rl.reservoirReached(new EventObject(this));
        }
    
    }
    
    public void consumeFuel(){
        System.out.println("Consuming fuel. " + currentState + " litres remaining...");
        if (--currentState<reserveLimit) {
            distributeevent();
        }
        
    }
    
    
    
}
