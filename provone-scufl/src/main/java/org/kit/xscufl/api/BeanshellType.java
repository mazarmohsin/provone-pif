//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.09 at 03:17:22 PM CET 
//


package org.kit.xscufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beanshellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beanshellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scriptvalue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beanshellinputlist" type="{http://org.embl.ebi.escience/xscufl/0.1alpha}beanshellinputlistType"/>
 *         &lt;element name="beanshelloutputlist" type="{http://org.embl.ebi.escience/xscufl/0.1alpha}beanshelloutputlistType"/>
 *         &lt;element name="dependencies" type="{http://org.embl.ebi.escience/xscufl/0.1alpha}dependenciesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanshellType", propOrder = {
    "scriptvalue",
    "beanshellinputlist",
    "beanshelloutputlist",
    "dependencies"
})
public class BeanshellType {

    @XmlElement(required = true)
    protected String scriptvalue;
    @XmlElement(required = true)
    protected BeanshellinputlistType beanshellinputlist;
    @XmlElement(required = true)
    protected BeanshelloutputlistType beanshelloutputlist;
    @XmlElement(required = true)
    protected DependenciesType dependencies;

    /**
     * Gets the value of the scriptvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptvalue() {
        return scriptvalue;
    }

    /**
     * Sets the value of the scriptvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptvalue(String value) {
        this.scriptvalue = value;
    }

    /**
     * Gets the value of the beanshellinputlist property.
     * 
     * @return
     *     possible object is
     *     {@link BeanshellinputlistType }
     *     
     */
    public BeanshellinputlistType getBeanshellinputlist() {
        return beanshellinputlist;
    }

    /**
     * Sets the value of the beanshellinputlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanshellinputlistType }
     *     
     */
    public void setBeanshellinputlist(BeanshellinputlistType value) {
        this.beanshellinputlist = value;
    }

    /**
     * Gets the value of the beanshelloutputlist property.
     * 
     * @return
     *     possible object is
     *     {@link BeanshelloutputlistType }
     *     
     */
    public BeanshelloutputlistType getBeanshelloutputlist() {
        return beanshelloutputlist;
    }

    /**
     * Sets the value of the beanshelloutputlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanshelloutputlistType }
     *     
     */
    public void setBeanshelloutputlist(BeanshelloutputlistType value) {
        this.beanshelloutputlist = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link DependenciesType }
     *     
     */
    public DependenciesType getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependenciesType }
     *     
     */
    public void setDependencies(DependenciesType value) {
        this.dependencies = value;
    }

}
