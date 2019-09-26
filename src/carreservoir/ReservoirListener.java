
package carreservoir;

import java.util.EventObject;
@FunctionalInterface
public interface ReservoirListener {
    public void reservoirReached(EventObject ev);
}
