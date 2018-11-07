/**
 * Lecture_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Lecture;

public interface Lecture_Service extends javax.xml.rpc.Service {
    public java.lang.String getLectureSOAPAddress();

    public org.example.www.Lecture.Lecture_PortType getLectureSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.Lecture.Lecture_PortType getLectureSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
