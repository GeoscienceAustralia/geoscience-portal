package org.auscope.portal.xslt;

import java.io.InputStream;
import java.io.StringReader;
import java.util.Properties;

import javax.xml.transform.stream.StreamSource;

import org.auscope.portal.core.xslt.PortalXSLTTransformer;

/**
 * A PortalXSLTTransformer for working with the wfsToKml stylesheet
 * 
 * @author Josh Vote
 */
public class WfsToCsvTransformer extends PortalXSLTTransformer {

    /**
     * Creates a new transformer using /org/auscope/portal/core/xslt/wfsToKml.xsl
     */
    public WfsToCsvTransformer() {
        super("/org/auscope/portal/xslt/wfsToCsv.xsl");
    }

    /**
     * Creates a new transformer using the specified resource (should accept a serviceURL parameter)
     * 
     * @param resource
     */
    public WfsToCsvTransformer(String resource) {
        super(resource);
    }

    /**
     * Utility method to transform a WFS response into kml
     *
     * @param wfs
     *            WFS response to be transformed
     * @param serviceUrl
     *            The WFS URL where the response came from
     * @return Kml output string
     */
    public String convert(String wfs, String serviceUrl) {
        return convert(new StreamSource(new StringReader(wfs)), serviceUrl);
    }

    /**
     * Utility method to transform a WFS response into kml
     *
     * @param wfs
     *            WFS response to be transformed
     * @param serviceUrl
     *            The WFS URL where the response came from
     * @return Xml output string
     */
    public String convert(InputStream wfs, String serviceUrl) {
        return convert(new StreamSource(wfs), serviceUrl);
    }

    /**
     * Utility method to transform a WFS response into kml
     *
     * @param wfs
     *            WFS response to be transformed
     * @param serviceUrl
     *            The WFS URL where the response came from
     * @return Xml output string
     */
    public String convert(StreamSource wfs, String serviceUrl) {
        Properties stylesheetParams = new Properties();
        stylesheetParams.setProperty("serviceURL", serviceUrl);
        return convert(wfs, stylesheetParams);
    }
}
