//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInputPorts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInputPorts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="net.sf.taverna.t2.workflowmodel.processor.activity.config.ActivityInputPortDefinitionBean" type="{http://taverna.sf.net/2008/xml/t2activities}ActivityPortDefinitionBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInputPorts", namespace = "http://taverna.sf.net/2008/xml/t2activities", propOrder = {
    "netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean"
})
public class ActivityInputPorts {

    @XmlElement(name = "net.sf.taverna.t2.workflowmodel.processor.activity.config.ActivityInputPortDefinitionBean")
    protected List<ActivityPortDefinitionBean> netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean;

    /**
     * Gets the value of the netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityPortDefinitionBean }
     * 
     * 
     */
    public List<ActivityPortDefinitionBean> getNetSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean() {
        if (netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean == null) {
            netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean = new ArrayList<ActivityPortDefinitionBean>();
        }
        return this.netSfTavernaT2WorkflowmodelProcessorActivityConfigActivityInputPortDefinitionBean;
    }

}