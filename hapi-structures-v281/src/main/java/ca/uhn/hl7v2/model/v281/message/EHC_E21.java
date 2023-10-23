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


package ca.uhn.hl7v2.model.v281.message;

import ca.uhn.hl7v2.model.v281.group.*;
import ca.uhn.hl7v2.model.v281.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a EHC_E21 message structure (see chapter 16.3.11). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (Message Header) <b> </b> </li>
		                 * <li>2: SFT (Software Segment) <b>optional repeating</b> </li>
		                 * <li>3: UAC (User Authentication Credential Segment) <b>optional repeating</b> </li>
		                 * <li>4: IVC (Invoice Segment) <b> </b> </li>
		                 * <li>5: EHC_E21_PSL_ITEM_INFO (a Group object) <b> repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class EHC_E21 extends AbstractMessage  {

    /**
     * Creates a new EHC_E21 message with DefaultModelClassFactory. 
     */ 
    public EHC_E21() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new EHC_E21 message with custom ModelClassFactory.
     */
    public EHC_E21(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(SFT.class, false, true);
	                          this.add(UAC.class, false, true);
	                          this.add(IVC.class, true, false);
	                          this.add(EHC_E21_PSL_ITEM_INFO.class, true, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating EHC_E21 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.8.1"
     */
    public String getVersion() {
       return "2.8.1";
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
     * the first repetition of 
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
     * Returns a specific repetition of
     * UAC (User Authentication Credential Segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public UAC getUAC(int rep) { 
       return getTyped("UAC", rep, UAC.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of UAC 
     * </p>
     * 
     */ 
    public int getUACReps() { 
    	return getReps("UAC");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of UAC.
     * <p>
     * <p>
     * Note that unlike {@link #getUAC()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<UAC> getUACAll() throws HL7Exception {
    	return getAllAsList("UAC", UAC.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of UAC (User Authentication Credential Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertUAC(UAC structure, int rep) throws HL7Exception { 
       super.insertRepetition( "UAC", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of UAC (User Authentication Credential Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public UAC insertUAC(int rep) throws HL7Exception { 
       return (UAC)super.insertRepetition("UAC", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of UAC (User Authentication Credential Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public UAC removeUAC(int rep) throws HL7Exception { 
       return (UAC)super.removeRepetition("UAC", rep);
    }




    /**
     * <p>
     * Returns
     * IVC (Invoice Segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public IVC getIVC() { 
       return getTyped("IVC", IVC.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * PSL_ITEM_INFO (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public EHC_E21_PSL_ITEM_INFO getPSL_ITEM_INFO() { 
       return getTyped("PSL_ITEM_INFO", EHC_E21_PSL_ITEM_INFO.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * PSL_ITEM_INFO (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public EHC_E21_PSL_ITEM_INFO getPSL_ITEM_INFO(int rep) { 
       return getTyped("PSL_ITEM_INFO", rep, EHC_E21_PSL_ITEM_INFO.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of PSL_ITEM_INFO 
     * </p>
     * 
     */ 
    public int getPSL_ITEM_INFOReps() { 
    	return getReps("PSL_ITEM_INFO");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PSL_ITEM_INFO.
     * <p>
     * <p>
     * Note that unlike {@link #getPSL_ITEM_INFO()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<EHC_E21_PSL_ITEM_INFO> getPSL_ITEM_INFOAll() throws HL7Exception {
    	return getAllAsList("PSL_ITEM_INFO", EHC_E21_PSL_ITEM_INFO.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of PSL_ITEM_INFO (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPSL_ITEM_INFO(EHC_E21_PSL_ITEM_INFO structure, int rep) throws HL7Exception { 
       super.insertRepetition( "PSL_ITEM_INFO", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of PSL_ITEM_INFO (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public EHC_E21_PSL_ITEM_INFO insertPSL_ITEM_INFO(int rep) throws HL7Exception { 
       return (EHC_E21_PSL_ITEM_INFO)super.insertRepetition("PSL_ITEM_INFO", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of PSL_ITEM_INFO (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public EHC_E21_PSL_ITEM_INFO removePSL_ITEM_INFO(int rep) throws HL7Exception { 
       return (EHC_E21_PSL_ITEM_INFO)super.removeRepetition("PSL_ITEM_INFO", rep);
    }



}

