//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 09:00:21 PM CET 
//


package org.kit.scufl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://taverna.sf.net/2008/xml/t2flow}ConfigBean">
 *       &lt;choice>
 *         &lt;element name="null" type="{http://www.w3.org/2001/XMLSchema}anyType" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.workflowmodel.processor.dispatch.layers.RetryConfig" type="{http://taverna.sf.net/2008/xml/t2layers}RetryConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.workflowmodel.processor.dispatch.layers.ParallelizeConfig" type="{http://taverna.sf.net/2008/xml/t2layers}ParallelizeConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.workflowmodel.processor.dispatch.layers.LoopConfiguration" type="{http://taverna.sf.net/2008/xml/t2layers}LoopConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.apiconsumer.ApiConsumerActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}ApiConsumerConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.beanshell.BeanshellActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}BeanshellConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.localworker.LocalworkerActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}BeanshellConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.stringconstant.StringConstantConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}StringConstantConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.rshell.RshellActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}RShellConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.wsdl.WSDLActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}WSDLConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.wsdl.xmlsplitter.XMLSplitterConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}XMLSplitterConfig" form="unqualified"/>
 *         &lt;element name="MartQuery" type="{http://taverna.sf.net/2008/xml/t2activities}BioMartConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.biomoby.BiomobyActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}BioMobyConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.biomoby.BiomobyObjectActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}BioMobyObjectConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.biomoby.MobyParseDatatypeActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}BioMobyParserConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.spreadsheet.SpreadsheetImportConfiguration" type="{http://taverna.sf.net/2008/xml/t2activities}SpreadsheetImportConfig" form="unqualified"/>
 *         &lt;element name="net.sf.taverna.t2.activities.soaplab.SoaplabActivityConfigurationBean" type="{http://taverna.sf.net/2008/xml/t2activities}SoaplabConfig" form="unqualified"/>
 *         &lt;element name="dataflow" type="{http://taverna.sf.net/2008/xml/t2activities}DataflowConfig"/>
 *         &lt;element ref="{http://taverna.sf.net/2008/xml/t2flow}abstractConfigBean"/>
 *       &lt;/choice>
 *       &lt;attribute name="encoding" use="required" type="{http://taverna.sf.net/2008/xml/t2flow}Encoding" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigBean")
public class ConfigBean
    extends OriginalConfigBean
{


}
