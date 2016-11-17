package com.onewingsoft.composite.definition;

/**
 * Created by natete on 17/11/16.
 */
public class Client extends Component {

    public static void main(String[] args) {
        Component root = new Composite();

        Component leafComponent = new Leaf();

        Component node = new Composite();

        Component finalLeaf = new Leaf();

        node.add(finalLeaf);

        root.add(leafComponent);

        root.add(node);

        leafComponent.operation();

        root.operation();
    }
}
