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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BioMobyParserConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BioMobyParserConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datatypeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="registryEndpoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="articleNameUsedByService" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BioMobyParserConfig", namespace = "http://taverna.sf.net/2008/xml/t2activities", propOrder = {
    "datatypeName",
    "registryEndpoint",
    "articleNameUsedByService"
})
public class BioMobyParserConfig {

    @XmlElement(required = true)
    protected Object datatypeName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String registryEndpoint;
    @XmlElement(required = true)
    protected Object articleNameUsedByService;

    /**
     * Gets the value of the datatypeName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatatypeName() {
        return datatypeName;
    }

    /**
     * Sets the value of the datatypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatatypeName(Object value) {
        this.datatypeName = value;
    }

    /**
     * Gets the value of the registryEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryEndpoint() {
        return registryEndpoint;
    }

    /**
     * Sets the value of the registryEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryEndpoint(String value) {
        this.registryEndpoint = value;
    }

    /**
     * Gets the value of the articleNameUsedByService property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArticleNameUsedByService() {
        return articleNameUsedByService;
    }

    /**
     * Sets the value of the articleNameUsedByService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArticleNameUsedByService(Object value) {
        this.articleNameUsedByService = value;
    }

}
