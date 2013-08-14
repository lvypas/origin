package org.lvypas.bws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Basic class for all bike components.
 * @author lvypas
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table (name = "COMPONENT")
public class Component {

    /**
     * Component id.
     */
    @Id @GeneratedValue
    private int componentId;
    /**
     * Component name.
     */
    private String componentName;
    /**
     * Weight of current bike component.
     */
    private int weight;

    /**
     * Get method for weight field.
     * @return an int value
     */
    public final int getWeight() {
        return weight;
    }

    /**
     * Set method for weight field.
     * @param newWeight is an int value.
     */
    public final void setWeight(final int newWeight) {
        this.weight = newWeight;
    }

    /**
     * Get method for componentId.
     * @return an int value.
     */
    public final int getComponentId() {
        return componentId;
    }

    /**
     * Set method for componentId.
     * @param newComponentId is an int value.
     */
    public final void setComponentId(final int newComponentId) {
        this.componentId = newComponentId;
    }

    /**
     * Getter for component name.
     * @return a String value.
     */
    public final String getComponentName() {
        return componentName;
    }

    /**
     * Setter for component name.
     * @param newComponentName is a String value.
     */
    public final void setComponentName(final String newComponentName) {
        this.componentName = newComponentName;
    }

}
