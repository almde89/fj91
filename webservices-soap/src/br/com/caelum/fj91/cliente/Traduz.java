
package br.com.caelum.fj91.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for traduz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="traduz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="palavra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traduz", propOrder = {
    "palavra"
})
public class Traduz {

    protected String palavra;

    /**
     * Gets the value of the palavra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * Sets the value of the palavra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalavra(String value) {
        this.palavra = value;
    }

}
