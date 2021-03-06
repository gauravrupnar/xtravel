
package com.amadeus.xml.vlssor_04_1_1a;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.vlssor_04_1_1a package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.vlssor_04_1_1a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecuritySignOutReply }
     * 
     */
    public SecuritySignOutReply createSecuritySignOutReply() {
        return new SecuritySignOutReply();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection }
     * 
     */
    public SecuritySignOutReply.ErrorSection createSecuritySignOutReplyErrorSection() {
        return new SecuritySignOutReply.ErrorSection();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText }
     * 
     */
    public SecuritySignOutReply.ErrorSection.InteractiveFreeText createSecuritySignOutReplyErrorSectionInteractiveFreeText() {
        return new SecuritySignOutReply.ErrorSection.InteractiveFreeText();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection.ApplicationError }
     * 
     */
    public SecuritySignOutReply.ErrorSection.ApplicationError createSecuritySignOutReplyErrorSectionApplicationError() {
        return new SecuritySignOutReply.ErrorSection.ApplicationError();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ProcessStatus }
     * 
     */
    public SecuritySignOutReply.ProcessStatus createSecuritySignOutReplyProcessStatus() {
        return new SecuritySignOutReply.ProcessStatus();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification }
     * 
     */
    public SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification createSecuritySignOutReplyErrorSectionInteractiveFreeTextFreeTextQualification() {
        return new SecuritySignOutReply.ErrorSection.InteractiveFreeText.FreeTextQualification();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails }
     * 
     */
    public SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails createSecuritySignOutReplyErrorSectionApplicationErrorErrorDetails() {
        return new SecuritySignOutReply.ErrorSection.ApplicationError.ErrorDetails();
    }

}
