//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnotatedPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taverna.sf.net/2008/xml/t2flow}LastPredictedDepthPort">
 *       &lt;sequence>
 *         &lt;element name="annotations" type="{http://taverna.sf.net/2008/xml/t2flow}Annotations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedPort", propOrder = {
    "annotations"
})
public class AnnotatedPort
    extends LastPredictedDepthPort
{

    @XmlElement(namespace = "http://taverna.sf.net/2008/xml/t2flow")
    protected Annotations annotations;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link Annotations }
     *     
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotations }
     *     
     */
    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }

}
