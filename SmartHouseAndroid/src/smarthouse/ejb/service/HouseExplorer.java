package smarthouse.ejb.service;

import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-06T10:54:19.171+01:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://service.ejb.smarthouse/", name = "HouseExplorer")
@XmlSeeAlso({ObjectFactory.class})
public interface HouseExplorer {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getHome", targetNamespace = "http://service.ejb.smarthouse/", className = "smarthouse.ejb.service.GetHome")
    @WebMethod
    @ResponseWrapper(localName = "getHomeResponse", targetNamespace = "http://service.ejb.smarthouse/", className = "smarthouse.ejb.service.GetHomeResponse")
    public smarthouse.ejb.service.Home getHome() throws Exception_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getEquipmentInfos", targetNamespace = "http://service.ejb.smarthouse/", className = "smarthouse.ejb.service.GetEquipmentInfos")
    @WebMethod
    @ResponseWrapper(localName = "getEquipmentInfosResponse", targetNamespace = "http://service.ejb.smarthouse/", className = "smarthouse.ejb.service.GetEquipmentInfosResponse")
    public smarthouse.ejb.service.RuntimeEquipmentInfos getEquipmentInfos(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws Exception_Exception;
}
