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
 * The Original Code is "CM_OSP.java".  Description:
 * "Composite class CM_OSP"
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
 * <p>Represents an HL7 CM_OSP (occurence span) data type. 
 * This type consists of the following components:</p>
 * <ul>
 * <li>occurrence span code (ID)
 * <li>occurrence span start date (DT)
 * <li>occurrence span stop date (DT)
 * </ul>
 */
@SuppressWarnings("unused")
public class CM_OSP extends AbstractComposite {

    private Type[] data;

    /** 
     * Creates a new CM_OSP type
     */
    public CM_OSP(Message message) {
        super(message);
        init();
    }

    private void init() {
        data = new Type[3];    
        data[0] = new ID(getMessage(), 0);
        data[1] = new DT(getMessage());
        data[2] = new DT(getMessage());
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
     * Returns occurrence span code (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getOccurrenceSpanCode() {
       return getTyped(0, ID.class);
    }

    
    /**
     * Returns occurrence span code (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCm_osp1_OccurrenceSpanCode() {
       return getTyped(0, ID.class);
    }


    /**
     * Returns occurrence span start date (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public DT getOccurrenceSpanStartDate() {
       return getTyped(1, DT.class);
    }

    
    /**
     * Returns occurrence span start date (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public DT getCm_osp2_OccurrenceSpanStartDate() {
       return getTyped(1, DT.class);
    }


    /**
     * Returns occurrence span stop date (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public DT getOccurrenceSpanStopDate() {
       return getTyped(2, DT.class);
    }

    
    /**
     * Returns occurrence span stop date (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public DT getCm_osp3_OccurrenceSpanStopDate() {
       return getTyped(2, DT.class);
    }



}

