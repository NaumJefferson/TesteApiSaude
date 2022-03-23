
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntraperitonealRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraperitonealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IPERINJ"/>
 *     &lt;enumeration value="PDPINJ"/>
 *     &lt;enumeration value="CAPDINSTL"/>
 *     &lt;enumeration value="PDPINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntraperitonealRoute")
@XmlEnum
public enum IntraperitonealRoute {

    IPERINJ,
    PDPINJ,
    CAPDINSTL,
    PDPINSTL;

    public String value() {
        return name();
    }

    public static IntraperitonealRoute fromValue(String v) {
        return valueOf(v);
    }

}
