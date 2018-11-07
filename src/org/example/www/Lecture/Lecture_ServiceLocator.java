/**
 * Lecture_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Lecture;

public class Lecture_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.Lecture.Lecture_Service {

    public Lecture_ServiceLocator() {
    }


    public Lecture_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Lecture_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LectureSOAP
    private java.lang.String LectureSOAP_address = "http://localhost/webServiceSOAP/serverSOAP.php";

    public java.lang.String getLectureSOAPAddress() {
        return LectureSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LectureSOAPWSDDServiceName = "LectureSOAP";

    public java.lang.String getLectureSOAPWSDDServiceName() {
        return LectureSOAPWSDDServiceName;
    }

    public void setLectureSOAPWSDDServiceName(java.lang.String name) {
        LectureSOAPWSDDServiceName = name;
    }

    public org.example.www.Lecture.Lecture_PortType getLectureSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LectureSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLectureSOAP(endpoint);
    }

    public org.example.www.Lecture.Lecture_PortType getLectureSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.Lecture.LectureSOAPStub _stub = new org.example.www.Lecture.LectureSOAPStub(portAddress, this);
            _stub.setPortName(getLectureSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLectureSOAPEndpointAddress(java.lang.String address) {
        LectureSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.Lecture.Lecture_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.Lecture.LectureSOAPStub _stub = new org.example.www.Lecture.LectureSOAPStub(new java.net.URL(LectureSOAP_address), this);
                _stub.setPortName(getLectureSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LectureSOAP".equals(inputPortName)) {
            return getLectureSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/Lecture/", "Lecture");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/Lecture/", "LectureSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LectureSOAP".equals(portName)) {
            setLectureSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
