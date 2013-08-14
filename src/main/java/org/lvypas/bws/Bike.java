package org.lvypas.bws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Bike class consist from bike parts.
 * @author lvypas
 */
@Entity
@Table (name = "BIKE")
public class Bike {
    /**
     * Identifier of current bike.
     */
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private int bikeId;

    /**
     * Name of current bike.
     */
    private String bikeName;

    /**
     * Frame of current bike.
     */
    @OneToOne
    @JoinColumn(name = "FRAME_ID")
    private Frame frame;

    /**
     * Front wheel of current bike.
     */
    @OneToOne
    @JoinColumn(name = "FRONT_WHEEL_ID")
    private FrontWheel frontWheel;

    /**
     * Rear wheel of current bike.
     */
    @OneToOne
    @JoinColumn(name = "REAR_WHEEL_ID")
    private RearWheel rearWheel;

    /**
     * Get method for bikeId field.
     * @return an identifier of bike.
     */
    public final int getBikeId() {
        return bikeId;
    }
    /**
     * Set method for bikeId field.
     * @param newId is a int value.
     */
    public final void setBikeId(final int newId) {
        this.bikeId = newId;
    }
    /**
     * Get method for bikeName field.
     * @return a bike name.
     */
    public final String getBikeName() {
        return bikeName;
    }
    /**
     * Set method for bikeName field.
     * @param newName is a string value.
     */
    public final void setBikeName(final String newName) {
        this.bikeName = newName;
    }
    /**
     * Getter for frame.
     * @return an frame object.
     */
    public final Frame getFrame() {
        return frame;
    }
    /**
     * Setter for bike frame.
     * @param newFrame is an Frame object.
     */
    public final void setFrame(final Frame newFrame) {
        this.frame = newFrame;
    }
    /**
     * Getter for front wheel.
     * @return an front wheel object.
     */
    public final FrontWheel getFrontWheel() {
        return frontWheel;
    }
    /**
     * Setter for front wheel.
     * @param newFrontWheel is a front wheel object.
     */
    public final void setFrontWheel(final FrontWheel newFrontWheel) {
        this.frontWheel = newFrontWheel;
    }
    /**
     * Getter for front wheel object.
     * @return an rear wheel object.
     */
    public final RearWheel getRearWheel() {
        return rearWheel;
    }
    /**
     * Setter of rear wheel object.
     * @param newRearWheel is a rear wheel object.
     */
    public final void setRearWheel(final RearWheel newRearWheel) {
        this.rearWheel = newRearWheel;
    }
}
