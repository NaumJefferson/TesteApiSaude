
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeBagOfConceptDescriptors.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeBagOfConceptDescriptors">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BAG&lt;CD>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeBagOfConceptDescriptors")
@XmlEnum
public enum DataTypeBagOfConceptDescriptors {

    @XmlEnumValue("BAG<CD>")
    BAG_CD("BAG<CD>");
    private final String value;

    DataTypeBagOfConceptDescriptors(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeBagOfConceptDescriptors fromValue(String v) {
        for (DataTypeBagOfConceptDescriptors c: DataTypeBagOfConceptDescriptors.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
