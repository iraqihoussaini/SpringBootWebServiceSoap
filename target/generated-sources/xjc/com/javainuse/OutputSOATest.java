//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.30 à 01:40:24 PM CEST 
//


package com.javainuse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="result2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result1",
    "result2"
})
@XmlRootElement(name = "outputSOATest")
public class OutputSOATest {

    @XmlElement(required = true)
    protected String result1;
    @XmlElement(required = true)
    protected String result2;

    /**
     * Obtient la valeur de la propriété result1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult1() {
        return result1;
    }

    /**
     * Définit la valeur de la propriété result1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult1(String value) {
        this.result1 = value;
    }

    /**
     * Obtient la valeur de la propriété result2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult2() {
        return result2;
    }

    /**
     * Définit la valeur de la propriété result2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult2(String value) {
        this.result2 = value;
    }

}
