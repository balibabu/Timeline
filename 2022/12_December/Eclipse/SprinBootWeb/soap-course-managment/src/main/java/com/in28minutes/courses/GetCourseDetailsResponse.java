//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.18 at 10:32:51 AM IST 
//


package com.in28minutes.courses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CourseDetails" type="{http://in28minutes.com/courses}CourseDetails"/>
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
    "courseDetails"
})
@XmlRootElement(name = "GetCourseDetailsResponse")
public class GetCourseDetailsResponse {

    @XmlElement(name = "CourseDetails", required = true)
    protected CourseDetails courseDetails;

    /**
     * Gets the value of the courseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CourseDetails }
     *     
     */
    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    /**
     * Sets the value of the courseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseDetails }
     *     
     */
    public void setCourseDetails(CourseDetails value) {
        this.courseDetails = value;
    }

}