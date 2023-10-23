/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 * 
 * The contents of this file are subject to the Mozilla Public License Version 1.1 
 * (the "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/ 
 * Software distributed under the License is distributed on an "AS IS" basis, 
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
 * specific language governing rights and limitations under the License. 
 * 
 * The Original Code is "LA2.java".  Description:
 * "Composite class LA2"
 * 
 * The Initial Developer of the Original Code is University Health Network. Copyright (C) 
 * 2013.  All Rights Reserved.
 * 
 * Contributor(s): ______________________________________. 
 * 
 * Alternatively, the contents of this file may be used under the terms of the 
 * GNU General Public License (the  "GPL"), in which case the provisions of the GPL are 
 * applicable instead of those above.  If you wish to allow use of your version of this 
 * file only under the terms of the GPL and not to allow others to use your version 
 * of this file under the MPL, indicate your decision by deleting  the provisions above 
 * and replace  them with the notice and other provisions required by the GPL License.  
 * If you do not delete the provisions above, a recipient may use your version of 
 * this file under either the MPL or the GPL. 
 * 
 */

package ca.uhn.hl7v2.model.v24.datatype;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractComposite;


/**
 * <p>Represents an HL7 LA2 (Location with address information (variant 2)) data type. 
 * This type consists of the following components:</p>
 * <ul>
 * <li>point of care (IS) (IS)
 * <li>room (IS)
 * <li>bed (IS)
 * <li>facility (HD) (HD)
 * <li>location status (IS)
 * <li>person location type (IS)
 * <li>building (IS)
 * <li>floor (IS)
 * <li>street address (ST) (ST)
 * <li>other designation (ST)
 * <li>city (ST)
 * <li>state or province (ST)
 * <li>zip or postal code (ST)
 * <li>country (ID)
 * <li>address type (ID)
 * <li>other geographic designation (ST)
 * </ul>
 */
@SuppressWarnings("unused")
public class LA2 extends AbstractComposite {

    private Type[] data;

    /** 
     * Creates a new LA2 type
     */
    public LA2(Message message) {
        super(message);
        init();
    }

    private void init() {
        data = new Type[16];    
        data[0] = new IS(getMessage(), 0);
        data[1] = new IS(getMessage(), 0);
        data[2] = new IS(getMessage(), 0);
        data[3] = new HD(getMessage());
        data[4] = new IS(getMessage(), 0);
        data[5] = new IS(getMessage(), 0);
        data[6] = new IS(getMessage(), 0);
        data[7] = new IS(getMessage(), 0);
        data[8] = new ST(getMessage());
        data[9] = new ST(getMessage());
        data[10] = new ST(getMessage());
        data[11] = new ST(getMessage());
        data[12] = new ST(getMessage());
        data[13] = new ID(getMessage(), 0);
        data[14] = new ID(getMessage(), 0);
        data[15] = new ST(getMessage());
    }


    /**
     * Returns an array containing the data elements.
     */
    public Type[] getComponents() { 
        return this.data; 
    }

    /**
     * Returns an individual data component.
     *
     * @param number The component number (0-indexed)
     * @throws DataTypeException if the given element number is out of range.
     */
    public Type getComponent(int number) throws DataTypeException { 

        try { 
            return this.data[number]; 
        } catch (ArrayIndexOutOfBoundsException e) { 
            throw new DataTypeException("Element " + number + " doesn't exist (Type " + getClass().getName() + " has only " + this.data.length + " components)"); 
        } 
    } 


    /**
     * Returns point of care (IS) (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getPointOfCare() {
       return getTyped(0, IS.class);
    }

    
    /**
     * Returns point of care (IS) (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa21_PointOfCare() {
       return getTyped(0, IS.class);
    }


    /**
     * Returns room (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getRoom() {
       return getTyped(1, IS.class);
    }

    
    /**
     * Returns room (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa22_Room() {
       return getTyped(1, IS.class);
    }


    /**
     * Returns bed (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getBed() {
       return getTyped(2, IS.class);
    }

    
    /**
     * Returns bed (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa23_Bed() {
       return getTyped(2, IS.class);
    }


    /**
     * Returns facility (HD) (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getFacility() {
       return getTyped(3, HD.class);
    }

    
    /**
     * Returns facility (HD) (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getLa24_Facility() {
       return getTyped(3, HD.class);
    }


    /**
     * Returns location status (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLocationStatus() {
       return getTyped(4, IS.class);
    }

    
    /**
     * Returns location status (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa25_LocationStatus() {
       return getTyped(4, IS.class);
    }


    /**
     * Returns person location type (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getPersonLocationType() {
       return getTyped(5, IS.class);
    }

    
    /**
     * Returns person location type (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa26_PersonLocationType() {
       return getTyped(5, IS.class);
    }


    /**
     * Returns building (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getBuilding() {
       return getTyped(6, IS.class);
    }

    
    /**
     * Returns building (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa27_Building() {
       return getTyped(6, IS.class);
    }


    /**
     * Returns floor (component 8).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getFloor() {
       return getTyped(7, IS.class);
    }

    
    /**
     * Returns floor (component 8).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getLa28_Floor() {
       return getTyped(7, IS.class);
    }


    /**
     * Returns street address (ST) (component 9).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getStreetAddress() {
       return getTyped(8, ST.class);
    }

    
    /**
     * Returns street address (ST) (component 9).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa29_StreetAddress() {
       return getTyped(8, ST.class);
    }


    /**
     * Returns other designation (component 10).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getOtherDesignation() {
       return getTyped(9, ST.class);
    }

    
    /**
     * Returns other designation (component 10).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa210_OtherDesignation() {
       return getTyped(9, ST.class);
    }


    /**
     * Returns city (component 11).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getCity() {
       return getTyped(10, ST.class);
    }

    
    /**
     * Returns city (component 11).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa211_City() {
       return getTyped(10, ST.class);
    }


    /**
     * Returns state or province (component 12).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getStateOrProvince() {
       return getTyped(11, ST.class);
    }

    
    /**
     * Returns state or province (component 12).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa212_StateOrProvince() {
       return getTyped(11, ST.class);
    }


    /**
     * Returns zip or postal code (component 13).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getZipOrPostalCode() {
       return getTyped(12, ST.class);
    }

    
    /**
     * Returns zip or postal code (component 13).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa213_ZipOrPostalCode() {
       return getTyped(12, ST.class);
    }


    /**
     * Returns country (component 14).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCountry() {
       return getTyped(13, ID.class);
    }

    
    /**
     * Returns country (component 14).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getLa214_Country() {
       return getTyped(13, ID.class);
    }


    /**
     * Returns address type (component 15).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getAddressType() {
       return getTyped(14, ID.class);
    }

    
    /**
     * Returns address type (component 15).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getLa215_AddressType() {
       return getTyped(14, ID.class);
    }


    /**
     * Returns other geographic designation (component 16).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getOtherGeographicDesignation() {
       return getTyped(15, ST.class);
    }

    
    /**
     * Returns other geographic designation (component 16).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getLa216_OtherGeographicDesignation() {
       return getTyped(15, ST.class);
    }



}

