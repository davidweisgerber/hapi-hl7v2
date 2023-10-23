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


package ca.uhn.hl7v2.model.v231.message;

import ca.uhn.hl7v2.model.v231.group.*;
import ca.uhn.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a ADT_A45 message structure (see chapter ?). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (MSH - message header segment) <b> </b> </li>
		                 * <li>2: EVN (EVN - event type segment) <b> </b> </li>
		                 * <li>3: PID (PID - patient identification segment) <b> </b> </li>
		                 * <li>4: PD1 (PD1 - patient additional demographic segment) <b>optional </b> </li>
		                 * <li>5: ADT_A45_MRGPV1 (a Group object) <b> repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class ADT_A45 extends AbstractMessage  {

    /**
     * Creates a new ADT_A45 message with DefaultModelClassFactory. 
     */ 
    public ADT_A45() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new ADT_A45 message with custom ModelClassFactory.
     */
    public ADT_A45(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(EVN.class, true, false);
	                          this.add(PID.class, true, false);
	                          this.add(PD1.class, false, false);
	                          this.add(ADT_A45_MRGPV1.class, true, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating ADT_A45 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.3.1"
     */
    public String getVersion() {
       return "2.3.1";
    }




    /**
     * <p>
     * Returns
     * MSH (MSH - message header segment) - creates it if necessary
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
     * EVN (EVN - event type segment) - creates it if necessary
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
     * PID (PID - patient identification segment) - creates it if necessary
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
     * PD1 (PD1 - patient additional demographic segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public PD1 getPD1() { 
       return getTyped("PD1", PD1.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * MRGPV1 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public ADT_A45_MRGPV1 getMRGPV1() { 
       return getTyped("MRGPV1", ADT_A45_MRGPV1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * MRGPV1 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ADT_A45_MRGPV1 getMRGPV1(int rep) { 
       return getTyped("MRGPV1", rep, ADT_A45_MRGPV1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of MRGPV1 
     * </p>
     * 
     */ 
    public int getMRGPV1Reps() { 
    	return getReps("MRGPV1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of MRGPV1.
     * <p>
     * <p>
     * Note that unlike {@link #getMRGPV1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ADT_A45_MRGPV1> getMRGPV1All() throws HL7Exception {
    	return getAllAsList("MRGPV1", ADT_A45_MRGPV1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of MRGPV1 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertMRGPV1(ADT_A45_MRGPV1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "MRGPV1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of MRGPV1 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ADT_A45_MRGPV1 insertMRGPV1(int rep) throws HL7Exception { 
       return (ADT_A45_MRGPV1)super.insertRepetition("MRGPV1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of MRGPV1 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ADT_A45_MRGPV1 removeMRGPV1(int rep) throws HL7Exception { 
       return (ADT_A45_MRGPV1)super.removeRepetition("MRGPV1", rep);
    }



}

