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


package ca.uhn.hl7v2.model.v27.message;

import ca.uhn.hl7v2.model.v27.group.*;
import ca.uhn.hl7v2.model.v27.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a ADT_A60 message structure (see chapter 3.3.60). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (Message Header) <b> </b> </li>
		                 * <li>2: SFT (Software Segment) <b>optional repeating</b> </li>
		                 * <li>3: UAC (User Authentication Credential Segment) <b>optional </b> </li>
		                 * <li>4: EVN (Event Type) <b> </b> </li>
		                 * <li>5: PID (Patient Identification) <b> </b> </li>
		                 * <li>6: ARV (Access Restriction) <b>optional repeating</b> </li>
		                 * <li>7: PV1 (Patient Visit) <b>optional </b> </li>
		                 * <li>8: PV2 (Patient Visit - Additional Information) <b>optional </b> </li>
		                 * <li>9: ARV (Access Restriction) <b>optional repeating</b> </li>
		                 * <li>10: ADT_A60_ADVERSE_REACTION_GROUP (a Group object) <b>optional repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class ADT_A60 extends AbstractMessage  {

    /**
     * Creates a new ADT_A60 message with DefaultModelClassFactory. 
     */ 
    public ADT_A60() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new ADT_A60 message with custom ModelClassFactory.
     */
    public ADT_A60(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(SFT.class, false, true);
	                          this.add(UAC.class, false, false);
	                          this.add(EVN.class, true, false);
	                          this.add(PID.class, true, false);
	                          this.add(ARV.class, false, true);
	                          this.add(PV1.class, false, false);
	                          this.add(PV2.class, false, false);
	                          this.add(ARV.class, false, true);
	                          this.add(ADT_A60_ADVERSE_REACTION_GROUP.class, false, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating ADT_A60 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.7"
     */
    public String getVersion() {
       return "2.7";
    }




    /**
     * <p>
     * Returns
     * MSH (Message Header) - creates it if necessary
     * </p>
     * 
     *
     */
    public MSH getMSH() { 
       return getTyped("MSH", MSH.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * SFT (Software Segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public SFT getSFT() { 
       return getTyped("SFT", SFT.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * SFT (Software Segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public SFT getSFT(int rep) { 
       return getTyped("SFT", rep, SFT.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of SFT 
     * </p>
     * 
     */ 
    public int getSFTReps() { 
    	return getReps("SFT");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SFT.
     * <p>
     * <p>
     * Note that unlike {@link #getSFT()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<SFT> getSFTAll() throws HL7Exception {
    	return getAllAsList("SFT", SFT.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSFT(SFT structure, int rep) throws HL7Exception { 
       super.insertRepetition( "SFT", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public SFT insertSFT(int rep) throws HL7Exception { 
       return (SFT)super.insertRepetition("SFT", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public SFT removeSFT(int rep) throws HL7Exception { 
       return (SFT)super.removeRepetition("SFT", rep);
    }




    /**
     * <p>
     * Returns
     * UAC (User Authentication Credential Segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public UAC getUAC() { 
       return getTyped("UAC", UAC.class);
    }





    /**
     * <p>
     * Returns
     * EVN (Event Type) - creates it if necessary
     * </p>
     * 
     *
     */
    public EVN getEVN() { 
       return getTyped("EVN", EVN.class);
    }





    /**
     * <p>
     * Returns
     * PID (Patient Identification) - creates it if necessary
     * </p>
     * 
     *
     */
    public PID getPID() { 
       return getTyped("PID", PID.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * ARV (Access Restriction) - creates it if necessary
     * </p>
     * 
     *
     */
    public ARV getARV() { 
       return getTyped("ARV", ARV.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ARV (Access Restriction) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ARV getARV(int rep) { 
       return getTyped("ARV", rep, ARV.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ARV 
     * </p>
     * 
     */ 
    public int getARVReps() { 
    	return getReps("ARV");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ARV.
     * <p>
     * <p>
     * Note that unlike {@link #getARV()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ARV> getARVAll() throws HL7Exception {
    	return getAllAsList("ARV", ARV.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ARV (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertARV(ARV structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ARV", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ARV (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ARV insertARV(int rep) throws HL7Exception { 
       return (ARV)super.insertRepetition("ARV", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ARV (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ARV removeARV(int rep) throws HL7Exception { 
       return (ARV)super.removeRepetition("ARV", rep);
    }




    /**
     * <p>
     * Returns
     * PV1 (Patient Visit) - creates it if necessary
     * </p>
     * 
     *
     */
    public PV1 getPV1() { 
       return getTyped("PV1", PV1.class);
    }





    /**
     * <p>
     * Returns
     * PV2 (Patient Visit - Additional Information) - creates it if necessary
     * </p>
     * 
     *
     */
    public PV2 getPV2() { 
       return getTyped("PV2", PV2.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * ARV2 (Access Restriction) - creates it if necessary
     * </p>
     * 
     *
     */
    public ARV getARV2() { 
       return getTyped("ARV2", ARV.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ARV2 (Access Restriction) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ARV getARV2(int rep) { 
       return getTyped("ARV2", rep, ARV.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ARV2 
     * </p>
     * 
     */ 
    public int getARV2Reps() { 
    	return getReps("ARV2");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ARV2.
     * <p>
     * <p>
     * Note that unlike {@link #getARV2()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ARV> getARV2All() throws HL7Exception {
    	return getAllAsList("ARV2", ARV.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ARV2 (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertARV2(ARV structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ARV2", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ARV2 (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ARV insertARV2(int rep) throws HL7Exception { 
       return (ARV)super.insertRepetition("ARV2", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ARV2 (Access Restriction)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ARV removeARV2(int rep) throws HL7Exception { 
       return (ARV)super.removeRepetition("ARV2", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * ADVERSE_REACTION_GROUP (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public ADT_A60_ADVERSE_REACTION_GROUP getADVERSE_REACTION_GROUP() { 
       return getTyped("ADVERSE_REACTION_GROUP", ADT_A60_ADVERSE_REACTION_GROUP.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ADVERSE_REACTION_GROUP (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ADT_A60_ADVERSE_REACTION_GROUP getADVERSE_REACTION_GROUP(int rep) { 
       return getTyped("ADVERSE_REACTION_GROUP", rep, ADT_A60_ADVERSE_REACTION_GROUP.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ADVERSE_REACTION_GROUP 
     * </p>
     * 
     */ 
    public int getADVERSE_REACTION_GROUPReps() { 
    	return getReps("ADVERSE_REACTION_GROUP");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ADVERSE_REACTION_GROUP.
     * <p>
     * <p>
     * Note that unlike {@link #getADVERSE_REACTION_GROUP()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ADT_A60_ADVERSE_REACTION_GROUP> getADVERSE_REACTION_GROUPAll() throws HL7Exception {
    	return getAllAsList("ADVERSE_REACTION_GROUP", ADT_A60_ADVERSE_REACTION_GROUP.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ADVERSE_REACTION_GROUP (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertADVERSE_REACTION_GROUP(ADT_A60_ADVERSE_REACTION_GROUP structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ADVERSE_REACTION_GROUP", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ADVERSE_REACTION_GROUP (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ADT_A60_ADVERSE_REACTION_GROUP insertADVERSE_REACTION_GROUP(int rep) throws HL7Exception { 
       return (ADT_A60_ADVERSE_REACTION_GROUP)super.insertRepetition("ADVERSE_REACTION_GROUP", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ADVERSE_REACTION_GROUP (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ADT_A60_ADVERSE_REACTION_GROUP removeADVERSE_REACTION_GROUP(int rep) throws HL7Exception { 
       return (ADT_A60_ADVERSE_REACTION_GROUP)super.removeRepetition("ADVERSE_REACTION_GROUP", rep);
    }



}

