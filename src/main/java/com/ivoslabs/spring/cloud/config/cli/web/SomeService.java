/**
 * 
 */
package com.ivoslabs.spring.cloud.config.cli.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @since
 * @author imperezivan
 *
 */
@Service
public class SomeService {

    @Value("${example.prop1}")
    private String prop1;

    @Value("${example.prop2}")
    private String prop2;

    @Value("${example.prop3}")
    private String prop3;

    @Value("${local.prop1}")
    private String localProp1;

    /**
     * Gets the prop1
     *
     * @return {@code String} The prop1
     */
    public String getProp1() {
	return this.prop1;
    }

    /**
     * Sets the prop1
     *
     * @param prop1 {@code String} The prop1 to set
     */
    public void setProp1(String prop1) {
	this.prop1 = prop1;
    }

    /**
     * Gets the prop2
     *
     * @return {@code String} The prop2
     */
    public String getProp2() {
	return this.prop2;
    }

    /**
     * Sets the prop2
     *
     * @param prop2 {@code String} The prop2 to set
     */
    public void setProp2(String prop2) {
	this.prop2 = prop2;
    }

    /**
     * Gets the prop3
     *
     * @return {@code String} The prop3
     */
    public String getProp3() {
	return this.prop3;
    }

    /**
     * Sets the prop3
     *
     * @param prop3 {@code String} The prop3 to set
     */
    public void setProp3(String prop3) {
	this.prop3 = prop3;
    }

    /**
     * Gets the localProp1
     *
     * @return {@code String} The localProp1
     */
    public String getLocalProp1() {
	return this.localProp1;
    }

    /**
     * Sets the localProp1
     *
     * @param localProp1 {@code String} The localProp1 to set
     */
    public void setLocalProp1(String localProp1) {
	this.localProp1 = localProp1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "SomeService [prop1=" + prop1 + ", prop2=" + prop2 + ", prop3=" + prop3 + ", localProp1=" + localProp1 + "]";
    }

}
