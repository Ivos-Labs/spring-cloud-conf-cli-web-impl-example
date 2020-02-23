package com.ivoslabs.spring.cloud.config.cli.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Dummy service to test the remote properties
 * 
 * @since 1.0.0
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

    @Value("${example.prop.a}")
    private String[] propA;

    /**
     * 
     */
    public SomeService() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "SomeService [prop1=" + prop1 + ", prop2=" + prop2 + ", prop3=" + prop3 + ", localProp1=" + localProp1 + ", propA=" + Arrays.toString(propA) + "]";
    }

}
