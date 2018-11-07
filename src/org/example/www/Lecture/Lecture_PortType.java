/**
 * Lecture_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Lecture;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.FloatHolder;
import javax.xml.rpc.holders.StringHolder;
import javax.xml.ws.Holder;

import org.apache.axis.holders.DateHolder;

public interface Lecture_PortType extends java.rmi.Remote {
    public java.lang.String fnGetHelloClass(java.lang.String strSubjectCode) throws java.rmi.RemoteException;
    public java.lang.String fnGetNumStudents(java.lang.String strSubjectCode) throws java.rmi.RemoteException;
    public void fnGetStudInfo(java.lang.String strStudentID, Holder<String> strStudName, Holder<String> strStudGender, Holder<String> strStudGroup, org.apache.axis.holders.DateHolder studYearBirth, Holder<Float> fltStudCGPA) throws java.rmi.RemoteException;
    public void fnGetStudQuery(java.lang.String strLogin, javax.xml.rpc.holders.StringHolder strFirstName, javax.xml.rpc.holders.StringHolder strLastName, javax.xml.rpc.holders.StringHolder strUserLvl, javax.xml.rpc.holders.StringHolder strLastLogin) throws java.rmi.RemoteException;
    public java.lang.String getItemCount(java.lang.String getItemCountRequest) throws java.rmi.RemoteException;
	public void fnGetStudInfo(String strStudentID, StringHolder strStudName, StringHolder strStudGender,
			StringHolder strStudGroup, DateHolder studYearBirth, FloatHolder fltStudCGPA) throws RemoteException;
	public void fnGetStudInfo(String text, StringHolder strStudName, StringHolder strStudGender,
			StringHolder strStudGroup, DateHolder studYearBirth, Holder<Float> fltStudCGPA);
	public void fnGetStudInfo(String text, StringHolder strStudName, StringHolder strStudGender,
			StringHolder strStudGroup, DateHolder studYearBirth, StringHolder fltStudCGPA);
}
