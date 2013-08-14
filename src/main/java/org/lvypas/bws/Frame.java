package org.lvypas.bws;

import javax.persistence.Entity;

/**
 * Bike frame class.
 * @author lvypas
 */
@Entity
public class Frame extends Component {

    /**
     * Size of frame.
     */
    private int size;

    /**
     * Getter for frame size.
     * @return and int value.
     */
    public final int getSize() {
        return size;
    }

    /**
     * Setter for frame size.
     * @param newSize is an int value.
     */
    public final void setSize(final int newSize) {
        this.size = newSize;
    }

}
