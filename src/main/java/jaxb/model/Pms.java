package jaxb.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 *
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}fecha_hora"/&amp;gt;
 *         &amp;lt;element ref="{}pm" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechaHora",
    "pm"
})
@XmlRootElement(name = "pms")
public class Pms {

    @XmlElement(name = "fecha_hora", required = true)
    protected String fechaHora;
    @XmlElement(required = true)
    protected List<Pm> pm;

    /**
     * Obtiene el valor de la propiedad fechaHora.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaHora() {
        return fechaHora;
    }

    /**
     * Define el valor de la propiedad fechaHora.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaHora(String value) {
        this.fechaHora = value;
    }

    /**
     * Gets the value of the pm property.
     *
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pm property.
     *
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPm().add(newItem);
     * &lt;/pre&gt;
     *
     *
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Pm }
     *
     *
     */
    public List<Pm> getPm() {
        if (pm == null) {
            pm = new ArrayList<Pm>();
        }
        return this.pm;
    }

}
