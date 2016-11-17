package com.onewingsoft.composite.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natete on 17/11/16.
 */
public class Composite extends Component {
    List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Composite operating");
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }
}
