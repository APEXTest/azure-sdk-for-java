/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//

package com.microsoft.windowsazure.serviceruntime;

import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for GoalStateInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GoalStateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Incarnation" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="ExpectedState" type="{}ExpectedStateEnum"/>
 *         &lt;element name="RoleEnvironmentPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentStateEndpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoalStateInfo", propOrder = {

})
class GoalStateInfo {

    @XmlElement(name = "Incarnation", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger incarnation;
    @XmlElement(name = "ExpectedState", required = true)
    protected ExpectedStateEnum expectedState;
    @XmlElement(name = "RoleEnvironmentPath", required = true)
    protected String roleEnvironmentPath;
    @XmlElement(name = "CurrentStateEndpoint", required = true)
    protected String currentStateEndpoint;
    @XmlElement(name = "Deadline", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deadline;

    /**
     * Gets the value of the incarnation property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getIncarnation() {
        return incarnation;
    }

    /**
     * Sets the value of the incarnation property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setIncarnation(BigInteger value) {
        this.incarnation = value;
    }

    /**
     * Gets the value of the expectedState property.
     * 
     * @return possible object is {@link ExpectedStateEnum }
     * 
     */
    public ExpectedStateEnum getExpectedState() {
        return expectedState;
    }

    /**
     * Sets the value of the expectedState property.
     * 
     * @param value
     *            allowed object is {@link ExpectedStateEnum }
     * 
     */
    public void setExpectedState(ExpectedStateEnum value) {
        this.expectedState = value;
    }

    /**
     * Gets the value of the roleEnvironmentPath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRoleEnvironmentPath() {
        return roleEnvironmentPath;
    }

    /**
     * Sets the value of the roleEnvironmentPath property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRoleEnvironmentPath(String value) {
        this.roleEnvironmentPath = value;
    }

    /**
     * Gets the value of the currentStateEndpoint property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCurrentStateEndpoint() {
        return currentStateEndpoint;
    }

    /**
     * Sets the value of the currentStateEndpoint property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCurrentStateEndpoint(String value) {
        this.currentStateEndpoint = value;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public Calendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDeadline(Calendar value) {
        this.deadline = value;
    }

}