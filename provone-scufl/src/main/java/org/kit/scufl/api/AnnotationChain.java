//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chain of annotations. Annotations are serialised Java
 * 				objects, similar to the ConfigBeans.
 * 			
 * 
 * <p>Java class for AnnotationChain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationChain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="net.sf.taverna.t2.annotation.AnnotationChainImpl" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annotationAssertions" type="{http://taverna.sf.net/2008/xml/t2flow}AnnotationAssertionImpl" form="unqualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="encoding" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationChain", propOrder = {
    "netSfTavernaT2AnnotationAnnotationChainImpl"
})
public class AnnotationChain {

    @XmlElement(name = "net.sf.taverna.t2.annotation.AnnotationChainImpl", required = true)
    protected NetSfTavernaT2AnnotationAnnotationChainImpl netSfTavernaT2AnnotationAnnotationChainImpl;
    @XmlAttribute(name = "encoding", required = true)
    protected String encoding;

    /**
     * Gets the value of the netSfTavernaT2AnnotationAnnotationChainImpl property.
     * 
     * @return
     *     possible object is
     *     {@link NetSfTavernaT2AnnotationAnnotationChainImpl }
     *     
     */
    public NetSfTavernaT2AnnotationAnnotationChainImpl getNetSfTavernaT2AnnotationAnnotationChainImpl() {
        return netSfTavernaT2AnnotationAnnotationChainImpl;
    }

    /**
     * Sets the value of the netSfTavernaT2AnnotationAnnotationChainImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetSfTavernaT2AnnotationAnnotationChainImpl }
     *     
     */
    public void setNetSfTavernaT2AnnotationAnnotationChainImpl(NetSfTavernaT2AnnotationAnnotationChainImpl value) {
        this.netSfTavernaT2AnnotationAnnotationChainImpl = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="annotationAssertions" type="{http://taverna.sf.net/2008/xml/t2flow}AnnotationAssertionImpl" form="unqualified"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotationAssertions"
    })
    public static class NetSfTavernaT2AnnotationAnnotationChainImpl {

        @XmlElement(required = true)
        protected AnnotationAssertionImpl annotationAssertions;

        /**
         * Gets the value of the annotationAssertions property.
         * 
         * @return
         *     possible object is
         *     {@link AnnotationAssertionImpl }
         *     
         */
        public AnnotationAssertionImpl getAnnotationAssertions() {
            return annotationAssertions;
        }

        /**
         * Sets the value of the annotationAssertions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnnotationAssertionImpl }
         *     
         */
        public void setAnnotationAssertions(AnnotationAssertionImpl value) {
            this.annotationAssertions = value;
        }

    }

}
