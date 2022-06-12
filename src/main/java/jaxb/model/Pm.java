package jaxb.model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &amp;lt;element ref="{}idelem"/&amp;gt;
 *         &amp;lt;sequence minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}descripcion"/&amp;gt;
 *           &amp;lt;element ref="{}accesoAsociado"/&amp;gt;
 *         &amp;lt;/sequence&amp;gt;
 *         &amp;lt;element ref="{}intensidad"/&amp;gt;
 *         &amp;lt;element ref="{}ocupacion"/&amp;gt;
 *         &amp;lt;element ref="{}carga"/&amp;gt;
 *         &amp;lt;element ref="{}nivelServicio"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{}intensidadSat"/&amp;gt;
 *           &amp;lt;element ref="{}velocidad"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}error"/&amp;gt;
 *         &amp;lt;element ref="{}subarea" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}st_x"/&amp;gt;
 *         &amp;lt;element ref="{}st_y"/&amp;gt;
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
    "idelem",
    "descripcion",
    "accesoAsociado",
    "intensidad",
    "ocupacion",
    "carga",
    "nivelServicio",
    "intensidadSat",
    "velocidad",
    "error",
    "subarea",
    "stX",
    "stY"
})
@XmlRootElement(name = "pm")
public class Pm {

    @XmlElement(required = true)
    protected BigInteger idelem;
    protected String descripcion;
    protected String accesoAsociado;
    @XmlElement(required = true)
    protected BigInteger intensidad;
    @XmlElement(required = true)
    protected BigInteger ocupacion;
    @XmlElement(required = true)
    protected BigInteger carga;
    @XmlElement(required = true)
    protected String nivelServicio;
    protected BigInteger intensidadSat;
    protected BigInteger velocidad;
    @XmlElement(required = true)
    protected String error;
    protected BigInteger subarea;
    @XmlElement(name = "st_x", required = true)
    protected String stX;
    @XmlElement(name = "st_y", required = true)
    protected String stY;

    /**
     * Obtiene el valor de la propiedad idelem.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdelem() {
        return idelem;
    }

    /**
     * Define el valor de la propiedad idelem.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdelem(BigInteger value) {
        this.idelem = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad accesoAsociado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccesoAsociado() {
        return accesoAsociado;
    }

    /**
     * Define el valor de la propiedad accesoAsociado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccesoAsociado(String value) {
        this.accesoAsociado = value;
    }

    /**
     * Obtiene el valor de la propiedad intensidad.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIntensidad() {
        return intensidad;
    }

    /**
     * Define el valor de la propiedad intensidad.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIntensidad(BigInteger value) {
        this.intensidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacion.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getOcupacion() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setOcupacion(BigInteger value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad carga.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCarga() {
        return carga;
    }

    /**
     * Define el valor de la propiedad carga.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCarga(BigInteger value) {
        this.carga = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelServicio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNivelServicio() {
        return nivelServicio;
    }

    /**
     * Define el valor de la propiedad nivelServicio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNivelServicio(String value) {
        this.nivelServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad intensidadSat.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIntensidadSat() {
        return intensidadSat;
    }

    /**
     * Define el valor de la propiedad intensidadSat.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIntensidadSat(BigInteger value) {
        this.intensidadSat = value;
    }

    /**
     * Obtiene el valor de la propiedad velocidad.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setVelocidad(BigInteger value) {
        this.velocidad = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad subarea.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getSubarea() {
        return subarea;
    }

    /**
     * Define el valor de la propiedad subarea.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setSubarea(BigInteger value) {
        this.subarea = value;
    }

    /**
     * Obtiene el valor de la propiedad stX.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStX() {
        return stX;
    }

    /**
     * Define el valor de la propiedad stX.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStX(String value) {
        this.stX = value;
    }

    /**
     * Obtiene el valor de la propiedad stY.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStY() {
        return stY;
    }

    /**
     * Define el valor de la propiedad stY.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStY(String value) {
        this.stY = value;
    }

}
