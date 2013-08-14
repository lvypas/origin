package org.lvypas.bws;

import javax.persistence.Entity;

/**
 * Rear wheel class.
 * @author lvypas
 */
@Entity
public class RearWheel extends Component {

    /**
     * Hub in rear wheel.
     */
    private String hub;
    /**
     * Count spokes in rear wheel.
     */
    private int countSpokes;

    /**
     * Get method for hub.
     * @return and String value with hub name.
     */
    public final String getHub() {
        return hub;
    }
    /**
     * Set method for hub.
     * @param newHub is a string with name of hub.
     */
    public final void setHub(final String newHub) {
        this.hub = newHub;
    }
    /**
     * Get method for count spokes.
     * @return and int value that equals to count spokes.
     */
    public final int getCountSpokes() {
        return countSpokes;
    }
    /**
     * Setter for count spokes.
     * @param newCountSpokes is an int value.
     */
    public final void setCountSpokes(final int newCountSpokes) {
        this.countSpokes = newCountSpokes;
    }

}
