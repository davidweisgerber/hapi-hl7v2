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
 * The Original Code is "RFR.java".  Description:
 * "Composite class RFR"
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

package ca.uhn.hl7v2.model.v28.datatype;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractComposite;


/**
 * <p>Represents an HL7 RFR (Reference Range) data type. 
 * This type consists of the following components:</p>
 * <ul>
 * <li>Numeric Range (NR)
 * <li>Administrative Sex (CWE)
 * <li>Age Range (NR)
 * <li>Gestational Age Range (NR)
 * <li>Species (ST)
 * <li>Race/subspecies (ST)
 * <li>Conditions (TX)
 * </ul>
 */
@SuppressWarnings("unused")
public class RFR extends AbstractComposite {

    private Type[] data;

    /** 
     * Creates a new RFR type
     */
    public RFR(Message message) {
        super(message);
        init();
    }

    private void init() {
        data = new Type[7];    
        data[0] = new NR(getMessage());
        data[1] = new CWE(getMessage());
        data[2] = new NR(getMessage());
        data[3] = new NR(getMessage());
        data[4] = new ST(getMessage());
        data[5] = new ST(getMessage());
        data[6] = new TX(getMessage());
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
     * Returns Numeric Range (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getNumericRange() {
       return getTyped(0, NR.class);
    }

    
    /**
     * Returns Numeric Range (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getRfr1_NumericRange() {
       return getTyped(0, NR.class);
    }


    /**
     * Returns Administrative Sex (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public CWE getAdministrativeSex() {
       return getTyped(1, CWE.class);
    }

    
    /**
     * Returns Administrative Sex (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public CWE getRfr2_AdministrativeSex() {
       return getTyped(1, CWE.class);
    }


    /**
     * Returns Age Range (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getAgeRange() {
       return getTyped(2, NR.class);
    }

    
    /**
     * Returns Age Range (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getRfr3_AgeRange() {
       return getTyped(2, NR.class);
    }


    /**
     * Returns Gestational Age Range (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getGestationalAgeRange() {
       return getTyped(3, NR.class);
    }

    
    /**
     * Returns Gestational Age Range (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public NR getRfr4_GestationalAgeRange() {
       return getTyped(3, NR.class);
    }


    /**
     * Returns Species (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getSpecies() {
       return getTyped(4, ST.class);
    }

    
    /**
     * Returns Species (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getRfr5_Species() {
       return getTyped(4, ST.class);
    }


    /**
     * Returns Race/subspecies (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getRaceSubspecies() {
       return getTyped(5, ST.class);
    }

    
    /**
     * Returns Race/subspecies (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getRfr6_RaceSubspecies() {
       return getTyped(5, ST.class);
    }


    /**
     * Returns Conditions (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public TX getConditions() {
       return getTyped(6, TX.class);
    }

    
    /**
     * Returns Conditions (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public TX getRfr7_Conditions() {
       return getTyped(6, TX.class);
    }



}

