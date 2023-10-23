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
 * The Original Code is "[file_name]".  Description: 
 * "[one_line_description]" 
 * 
 * The Initial Developer of the Original Code is University Health Network. Copyright (C) 
 * 2012.  All Rights Reserved. 
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


package ca.uhn.hl7v2.model.v24.group;

import ca.uhn.hl7v2.model.v24.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a PRR_PC5_PATIENT group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: PID (Patient identification) <b>  </b></li>
                         * <li>2: PRR_PC5_PATIENT_VISIT (a Group object) <b>optional  </b></li>
                         * <li>3: PRR_PC5_PROBLEM (a Group object) <b> repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class PRR_PC5_PATIENT extends AbstractGroup {

    /** 
     * Creates a new PRR_PC5_PATIENT group
     */
    public PRR_PC5_PATIENT(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(PID.class, true, false, false);
                                  this.add(PRR_PC5_PATIENT_VISIT.class, false, false, false);
                                  this.add(PRR_PC5_PROBLEM.class, true, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating PRR_PC5_PATIENT - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.4"
     */
    public String getVersion() {
       return "2.4";
    }



    /**
     * Returns
     * PID (Patient identification) - creates it if necessary
     */
    public PID getPID() { 
       PID retVal = getTyped("PID", PID.class);
       return retVal;
    }




    /**
     * Returns
     * PATIENT_VISIT (a Group object) - creates it if necessary
     */
    public PRR_PC5_PATIENT_VISIT getPATIENT_VISIT() { 
       PRR_PC5_PATIENT_VISIT retVal = getTyped("PATIENT_VISIT", PRR_PC5_PATIENT_VISIT.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * PROBLEM (a Group object) - creates it if necessary
     */
    public PRR_PC5_PROBLEM getPROBLEM() { 
       PRR_PC5_PROBLEM retVal = getTyped("PROBLEM", PRR_PC5_PROBLEM.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PROBLEM (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PRR_PC5_PROBLEM getPROBLEM(int rep) { 
       PRR_PC5_PROBLEM retVal = getTyped("PROBLEM", rep, PRR_PC5_PROBLEM.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PROBLEM 
     */ 
    public int getPROBLEMReps() {  
        return getReps("PROBLEM");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PROBLEM.
     * <p>
     * <p>
     * Note that unlike {@link #getPROBLEM()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PRR_PC5_PROBLEM> getPROBLEMAll() throws HL7Exception {
    	return getAllAsList("PROBLEM", PRR_PC5_PROBLEM.class);
    } 

    /**
     * Inserts a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPROBLEM(PRR_PC5_PROBLEM structure, int rep) throws HL7Exception { 
       super.insertRepetition("PROBLEM", structure, rep);
    }


    /**
     * Inserts a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PRR_PC5_PROBLEM insertPROBLEM(int rep) throws HL7Exception { 
       return (PRR_PC5_PROBLEM)super.insertRepetition("PROBLEM", rep);
    }


    /**
     * Removes a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PRR_PC5_PROBLEM removePROBLEM(int rep) throws HL7Exception { 
       return (PRR_PC5_PROBLEM)super.removeRepetition("PROBLEM", rep);
    }



}

