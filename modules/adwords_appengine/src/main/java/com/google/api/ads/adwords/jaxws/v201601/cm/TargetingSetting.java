
package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Setting for targeting related features.
 *             This is applicable at Campaign and AdGroup level.
 *           
 * 
 * <p>Java class for TargetingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}Setting">
 *       &lt;sequence>
 *         &lt;element name="details" type="{https://adwords.google.com/api/adwords/cm/v201601}TargetingSettingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingSetting", propOrder = {
    "details"
})
public class TargetingSetting
    extends Setting
{

    protected List<TargetingSettingDetail> details;

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetingSettingDetail }
     * 
     * 
     */
    public List<TargetingSettingDetail> getDetails() {
        if (details == null) {
            details = new ArrayList<TargetingSettingDetail>();
        }
        return this.details;
    }

}
