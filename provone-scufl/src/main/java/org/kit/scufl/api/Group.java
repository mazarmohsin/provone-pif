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
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invocationGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mechanismType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mechanismName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mechanismXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", namespace = "", propOrder = {
    "invocationGroupName",
    "mechanismType",
    "mechanismName",
    "mechanismXML"
})
public class Group {

    @XmlElement(required = true)
    protected String invocationGroupName;
    @XmlElement(required = true)
    protected String mechanismType;
    @XmlElement(required = true)
    protected String mechanismName;
    @XmlElement(required = true)
    protected String mechanismXML;

    /**
     * Gets the value of the invocationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationGroupName() {
        return invocationGroupName;
    }

    /**
     * Sets the value of the invocationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationGroupName(String value) {
        this.invocationGroupName = value;
    }

    /**
     * Gets the value of the mechanismType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismType() {
        return mechanismType;
    }

    /**
     * Sets the value of the mechanismType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismType(String value) {
        this.mechanismType = value;
    }

    /**
     * Gets the value of the mechanismName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismName() {
        return mechanismName;
    }

    /**
     * Sets the value of the mechanismName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismName(String value) {
        this.mechanismName = value;
    }

    /**
     * Gets the value of the mechanismXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismXML() {
        return mechanismXML;
    }

    /**
     * Sets the value of the mechanismXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismXML(String value) {
        this.mechanismXML = value;
    }

}
