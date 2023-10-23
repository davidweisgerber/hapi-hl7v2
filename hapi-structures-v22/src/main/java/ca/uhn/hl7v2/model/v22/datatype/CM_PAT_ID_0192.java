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
 * The Original Code is "CM_PAT_ID_0192.java".  Description:
 * "Composite class CM_PAT_ID_0192"
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

package ca.uhn.hl7v2.model.v22.datatype;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractComposite;


/**
 * <p>Represents an HL7 CM_PAT_ID_0192 (Patient ID with table 0192) data type. 
 * This type consists of the following components:</p>
 * <ul>
 * <li>ID number (ST)
 * <li>Check digit (NM)
 * <li>Check digit scheme (ID)
 * <li>Facility ID (ID)
 * <li>type (ID)
 * </ul>
 */
@SuppressWarnings("unused")
public class CM_PAT_ID_0192 extends AbstractComposite {

    private Type[] data;

    /** 
     * Creates a new CM_PAT_ID_0192 type
     */
    public CM_PAT_ID_0192(Message message) {
        super(message);
        init();
    }

    private void init() {
        data = new Type[5];    
        data[0] = new ST(getMessage());
        data[1] = new NM(getMessage());
        data[2] = new ID(getMessage(), 0);
        data[3] = new ID(getMessage(), 0);
        data[4] = new ID(getMessage(), 192);
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
     * Returns ID number (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getIDNumber() {
       return getTyped(0, ST.class);
    }

    
    /**
     * Returns ID number (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getCm_pat_id_01921_IDNumber() {
       return getTyped(0, ST.class);
    }


    /**
     * Returns Check digit (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NM getCheckDigit() {
       return getTyped(1, NM.class);
    }

    
    /**
     * Returns Check digit (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NM getCm_pat_id_01922_CheckDigit() {
       return getTyped(1, NM.class);
    }


    /**
     * Returns Check digit scheme (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCheckDigitScheme() {
       return getTyped(2, ID.class);
    }

    
    /**
     * Returns Check digit scheme (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCm_pat_id_01923_CheckDigitScheme() {
       return getTyped(2, ID.class);
    }


    /**
     * Returns Facility ID (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getFacilityID() {
       return getTyped(3, ID.class);
    }

    
    /**
     * Returns Facility ID (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCm_pat_id_01924_FacilityID() {
       return getTyped(3, ID.class);
    }


    /**
     * Returns type (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getType() {
       return getTyped(4, ID.class);
    }

    
    /**
     * Returns type (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCm_pat_id_01925_Type() {
       return getTyped(4, ID.class);
    }



}

