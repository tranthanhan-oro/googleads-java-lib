
package com.google.api.ads.dfp.jaxws.v201403;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ProposalService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201403/ProposalService?wsdl")
public class ProposalService
    extends Service
{

    private final static URL PROPOSALSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROPOSALSERVICE_EXCEPTION;
    private final static QName PROPOSALSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201403", "ProposalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201403/ProposalService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROPOSALSERVICE_WSDL_LOCATION = url;
        PROPOSALSERVICE_EXCEPTION = e;
    }

    public ProposalService() {
        super(__getWsdlLocation(), PROPOSALSERVICE_QNAME);
    }

    public ProposalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ProposalServiceInterface
     */
    @WebEndpoint(name = "ProposalServiceInterfacePort")
    public ProposalServiceInterface getProposalServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201403", "ProposalServiceInterfacePort"), ProposalServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProposalServiceInterface
     */
    @WebEndpoint(name = "ProposalServiceInterfacePort")
    public ProposalServiceInterface getProposalServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201403", "ProposalServiceInterfacePort"), ProposalServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROPOSALSERVICE_EXCEPTION!= null) {
            throw PROPOSALSERVICE_EXCEPTION;
        }
        return PROPOSALSERVICE_WSDL_LOCATION;
    }

}
