
package com.adstream.webservice.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoLoginKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderViewLevel" type="{http://www.adstream.com/WebService/User}OrderViewLevelID"/>
 *         &lt;element name="UserGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.adstream.com/WebService/User}UserType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "agencyGuid",
    "agencyName",
    "autoLoginKey",
    "email",
    "firstName",
    "fullName",
    "lastName",
    "password",
    "orderViewLevel",
    "userGUID",
    "type"
})
public class UserInfo {

    @XmlElement(name = "AgencyGuid")
    protected String agencyGuid;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AutoLoginKey")
    protected String autoLoginKey;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "OrderViewLevel", required = true)
    protected OrderViewLevelID orderViewLevel;
    @XmlElement(name = "UserGUID")
    protected String userGUID;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected UserType type;

    /**
     * Gets the value of the agencyGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyGuid() {
        return agencyGuid;
    }

    /**
     * Sets the value of the agencyGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyGuid(String value) {
        this.agencyGuid = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the autoLoginKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoLoginKey() {
        return autoLoginKey;
    }

    /**
     * Sets the value of the autoLoginKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoLoginKey(String value) {
        this.autoLoginKey = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the orderViewLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OrderViewLevelID }
     *     
     */
    public OrderViewLevelID getOrderViewLevel() {
        return orderViewLevel;
    }

    /**
     * Sets the value of the orderViewLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderViewLevelID }
     *     
     */
    public void setOrderViewLevel(OrderViewLevelID value) {
        this.orderViewLevel = value;
    }

    /**
     * Gets the value of the userGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGUID() {
        return userGUID;
    }

    /**
     * Sets the value of the userGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGUID(String value) {
        this.userGUID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setType(UserType value) {
        this.type = value;
    }

}
