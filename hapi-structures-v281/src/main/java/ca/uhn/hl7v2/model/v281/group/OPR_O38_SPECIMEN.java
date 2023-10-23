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


package ca.uhn.hl7v2.model.v281.group;

import ca.uhn.hl7v2.model.v281.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a OPR_O38_SPECIMEN group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: SPM (Specimen) <b>  </b></li>
                         * <li>2: OPR_O38_SPECIMEN_OBSERVATION (a Group object) <b>optional repeating </b></li>
                         * <li>3: SAC (Specimen Container detail) <b>optional repeating </b></li>
                         * <li>4: OPR_O38_OBSERVATION_REQUEST (a Group object) <b>optional repeating </b></li>
                         * <li>5: OPR_O38_TIMING (a Group object) <b>optional repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class OPR_O38_SPECIMEN extends AbstractGroup {

    /** 
     * Creates a new OPR_O38_SPECIMEN group
     */
    public OPR_O38_SPECIMEN(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SPM.class, true, false, false);
                                  this.add(OPR_O38_SPECIMEN_OBSERVATION.class, false, true, false);
                                  this.add(SAC.class, false, true, false);
                                  this.add(OPR_O38_OBSERVATION_REQUEST.class, false, true, false);
                                  this.add(OPR_O38_TIMING.class, false, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating OPR_O38_SPECIMEN - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.8.1"
     */
    public String getVersion() {
       return "2.8.1";
    }



    /**
     * Returns
     * SPM (Specimen) - creates it if necessary
     */
    public SPM getSPM() { 
       SPM retVal = getTyped("SPM", SPM.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * SPECIMEN_OBSERVATION (a Group object) - creates it if necessary
     */
    public OPR_O38_SPECIMEN_OBSERVATION getSPECIMEN_OBSERVATION() { 
       OPR_O38_SPECIMEN_OBSERVATION retVal = getTyped("SPECIMEN_OBSERVATION", OPR_O38_SPECIMEN_OBSERVATION.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * SPECIMEN_OBSERVATION (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OPR_O38_SPECIMEN_OBSERVATION getSPECIMEN_OBSERVATION(int rep) { 
       OPR_O38_SPECIMEN_OBSERVATION retVal = getTyped("SPECIMEN_OBSERVATION", rep, OPR_O38_SPECIMEN_OBSERVATION.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of SPECIMEN_OBSERVATION 
     */ 
    public int getSPECIMEN_OBSERVATIONReps() {  
        return getReps("SPECIMEN_OBSERVATION");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SPECIMEN_OBSERVATION.
     * <p>
     * <p>
     * Note that unlike {@link #getSPECIMEN_OBSERVATION()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<OPR_O38_SPECIMEN_OBSERVATION> getSPECIMEN_OBSERVATIONAll() throws HL7Exception {
    	return getAllAsList("SPECIMEN_OBSERVATION", OPR_O38_SPECIMEN_OBSERVATION.class);
    } 

    /**
     * Inserts a specific repetition of SPECIMEN_OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSPECIMEN_OBSERVATION(OPR_O38_SPECIMEN_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition("SPECIMEN_OBSERVATION", structure, rep);
    }


    /**
     * Inserts a specific repetition of SPECIMEN_OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OPR_O38_SPECIMEN_OBSERVATION insertSPECIMEN_OBSERVATION(int rep) throws HL7Exception { 
       return (OPR_O38_SPECIMEN_OBSERVATION)super.insertRepetition("SPECIMEN_OBSERVATION", rep);
    }


    /**
     * Removes a specific repetition of SPECIMEN_OBSERVATION (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OPR_O38_SPECIMEN_OBSERVATION removeSPECIMEN_OBSERVATION(int rep) throws HL7Exception { 
       return (OPR_O38_SPECIMEN_OBSERVATION)super.removeRepetition("SPECIMEN_OBSERVATION", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * SAC (Specimen Container detail) - creates it if necessary
     */
    public SAC getSAC() { 
       SAC retVal = getTyped("SAC", SAC.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * SAC (Specimen Container detail) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public SAC getSAC(int rep) { 
       SAC retVal = getTyped("SAC", rep, SAC.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of SAC 
     */ 
    public int getSACReps() {  
        return getReps("SAC");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SAC.
     * <p>
     * <p>
     * Note that unlike {@link #getSAC()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<SAC> getSACAll() throws HL7Exception {
    	return getAllAsList("SAC", SAC.class);
    } 

    /**
     * Inserts a specific repetition of SAC (Specimen Container detail)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSAC(SAC structure, int rep) throws HL7Exception { 
       super.insertRepetition("SAC", structure, rep);
    }


    /**
     * Inserts a specific repetition of SAC (Specimen Container detail)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public SAC insertSAC(int rep) throws HL7Exception { 
       return (SAC)super.insertRepetition("SAC", rep);
    }


    /**
     * Removes a specific repetition of SAC (Specimen Container detail)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public SAC removeSAC(int rep) throws HL7Exception { 
       return (SAC)super.removeRepetition("SAC", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * OBSERVATION_REQUEST (a Group object) - creates it if necessary
     */
    public OPR_O38_OBSERVATION_REQUEST getOBSERVATION_REQUEST() { 
       OPR_O38_OBSERVATION_REQUEST retVal = getTyped("OBSERVATION_REQUEST", OPR_O38_OBSERVATION_REQUEST.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * OBSERVATION_REQUEST (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OPR_O38_OBSERVATION_REQUEST getOBSERVATION_REQUEST(int rep) { 
       OPR_O38_OBSERVATION_REQUEST retVal = getTyped("OBSERVATION_REQUEST", rep, OPR_O38_OBSERVATION_REQUEST.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of OBSERVATION_REQUEST 
     */ 
    public int getOBSERVATION_REQUESTReps() {  
        return getReps("OBSERVATION_REQUEST");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of OBSERVATION_REQUEST.
     * <p>
     * <p>
     * Note that unlike {@link #getOBSERVATION_REQUEST()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<OPR_O38_OBSERVATION_REQUEST> getOBSERVATION_REQUESTAll() throws HL7Exception {
    	return getAllAsList("OBSERVATION_REQUEST", OPR_O38_OBSERVATION_REQUEST.class);
    } 

    /**
     * Inserts a specific repetition of OBSERVATION_REQUEST (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBSERVATION_REQUEST(OPR_O38_OBSERVATION_REQUEST structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBSERVATION_REQUEST", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBSERVATION_REQUEST (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OPR_O38_OBSERVATION_REQUEST insertOBSERVATION_REQUEST(int rep) throws HL7Exception { 
       return (OPR_O38_OBSERVATION_REQUEST)super.insertRepetition("OBSERVATION_REQUEST", rep);
    }


    /**
     * Removes a specific repetition of OBSERVATION_REQUEST (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OPR_O38_OBSERVATION_REQUEST removeOBSERVATION_REQUEST(int rep) throws HL7Exception { 
       return (OPR_O38_OBSERVATION_REQUEST)super.removeRepetition("OBSERVATION_REQUEST", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * TIMING (a Group object) - creates it if necessary
     */
    public OPR_O38_TIMING getTIMING() { 
       OPR_O38_TIMING retVal = getTyped("TIMING", OPR_O38_TIMING.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * TIMING (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OPR_O38_TIMING getTIMING(int rep) { 
       OPR_O38_TIMING retVal = getTyped("TIMING", rep, OPR_O38_TIMING.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of TIMING 
     */ 
    public int getTIMINGReps() {  
        return getReps("TIMING");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of TIMING.
     * <p>
     * <p>
     * Note that unlike {@link #getTIMING()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<OPR_O38_TIMING> getTIMINGAll() throws HL7Exception {
    	return getAllAsList("TIMING", OPR_O38_TIMING.class);
    } 

    /**
     * Inserts a specific repetition of TIMING (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertTIMING(OPR_O38_TIMING structure, int rep) throws HL7Exception { 
       super.insertRepetition("TIMING", structure, rep);
    }


    /**
     * Inserts a specific repetition of TIMING (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OPR_O38_TIMING insertTIMING(int rep) throws HL7Exception { 
       return (OPR_O38_TIMING)super.insertRepetition("TIMING", rep);
    }


    /**
     * Removes a specific repetition of TIMING (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OPR_O38_TIMING removeTIMING(int rep) throws HL7Exception { 
       return (OPR_O38_TIMING)super.removeRepetition("TIMING", rep);
    }



}

