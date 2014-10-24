import java.util.List;
import java.util.ArrayList;

public class MyWidget {
    private List <IActionListener> listeners;

    public void addActionListener(IActionListener listener) {
        if(listeners == null) {
            listeners = new ArrayList<IActionListener>();
        }
        listeners.add(listener);
    }

    public void notifyListeners() {
        for(IActionListener l : listeners) {
            l.actionPerformed();
        }
    }
}

