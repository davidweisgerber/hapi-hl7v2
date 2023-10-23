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
 * <p>Represents a VXR_V03 message structure (see chapter ?). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (MSH - message header segment) <b> </b> </li>
		                 * <li>2: MSA (MSA - message acknowledgment segment) <b> </b> </li>
		                 * <li>3: QRD (QRD - original-style query definition segment) <b> </b> </li>
		                 * <li>4: QRF (QRF - original style query filter segment) <b>optional </b> </li>
		                 * <li>5: PID (PID - patient identification segment) <b> </b> </li>
		                 * <li>6: PD1 (PD1 - patient additional demographic segment) <b>optional </b> </li>
		                 * <li>7: NK1 (NK1 - next of kin / associated parties segment-) <b>optional repeating</b> </li>
		                 * <li>8: VXR_V03_PV1PV2 (a Group object) <b>optional </b> </li>
		                 * <li>9: VXR_V03_IN1IN2IN3 (a Group object) <b>optional repeating</b> </li>
		                 * <li>10: VXR_V03_ORCRXARXROBXNTE (a Group object) <b>optional repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class VXR_V03 extends AbstractMessage  {

    /**
     * Creates a new VXR_V03 message with DefaultModelClassFactory. 
     */ 
    public VXR_V03() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new VXR_V03 message with custom ModelClassFactory.
     */
    public VXR_V03(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(MSA.class, true, false);
	                          this.add(QRD.class, true, false);
	                          this.add(QRF.class, false, false);
	                          this.add(PID.class, true, false);
	                          this.add(PD1.class, false, false);
	                          this.add(NK1.class, false, true);
	                          this.add(VXR_V03_PV1PV2.class, false, false);
	                          this.add(VXR_V03_IN1IN2IN3.class, false, true);
	                          this.add(VXR_V03_ORCRXARXROBXNTE.class, false, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating VXR_V03 - this is probably a bug in the source code generator.", e);
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
     * MSA (MSA - message acknowledgment segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public MSA getMSA() { 
       return getTyped("MSA", MSA.class);
    }





    /**
     * <p>
     * Returns
     * QRD (QRD - original-style query definition segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public QRD getQRD() { 
       return getTyped("QRD", QRD.class);
    }





    /**
     * <p>
     * Returns
     * QRF (QRF - original style query filter segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public QRF getQRF() { 
       return getTyped("QRF", QRF.class);
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
     * NK1 (NK1 - next of kin / associated parties segment-) - creates it if necessary
     * </p>
     * 
     *
     */
    public NK1 getNK1() { 
       return getTyped("NK1", NK1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * NK1 (NK1 - next of kin / associated parties segment-) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public NK1 getNK1(int rep) { 
       return getTyped("NK1", rep, NK1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of NK1 
     * </p>
     * 
     */ 
    public int getNK1Reps() { 
    	return getReps("NK1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of NK1.
     * <p>
     * <p>
     * Note that unlike {@link #getNK1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<NK1> getNK1All() throws HL7Exception {
    	return getAllAsList("NK1", NK1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertNK1(NK1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "NK1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public NK1 insertNK1(int rep) throws HL7Exception { 
       return (NK1)super.insertRepetition("NK1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public NK1 removeNK1(int rep) throws HL7Exception { 
       return (NK1)super.removeRepetition("NK1", rep);
    }




    /**
     * <p>
     * Returns
     * PV1PV2 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public VXR_V03_PV1PV2 getPV1PV2() { 
       return getTyped("PV1PV2", VXR_V03_PV1PV2.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * IN1IN2IN3 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public VXR_V03_IN1IN2IN3 getIN1IN2IN3() { 
       return getTyped("IN1IN2IN3", VXR_V03_IN1IN2IN3.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * IN1IN2IN3 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public VXR_V03_IN1IN2IN3 getIN1IN2IN3(int rep) { 
       return getTyped("IN1IN2IN3", rep, VXR_V03_IN1IN2IN3.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of IN1IN2IN3 
     * </p>
     * 
     */ 
    public int getIN1IN2IN3Reps() { 
    	return getReps("IN1IN2IN3");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of IN1IN2IN3.
     * <p>
     * <p>
     * Note that unlike {@link #getIN1IN2IN3()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<VXR_V03_IN1IN2IN3> getIN1IN2IN3All() throws HL7Exception {
    	return getAllAsList("IN1IN2IN3", VXR_V03_IN1IN2IN3.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertIN1IN2IN3(VXR_V03_IN1IN2IN3 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "IN1IN2IN3", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public VXR_V03_IN1IN2IN3 insertIN1IN2IN3(int rep) throws HL7Exception { 
       return (VXR_V03_IN1IN2IN3)super.insertRepetition("IN1IN2IN3", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public VXR_V03_IN1IN2IN3 removeIN1IN2IN3(int rep) throws HL7Exception { 
       return (VXR_V03_IN1IN2IN3)super.removeRepetition("IN1IN2IN3", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * ORCRXARXROBXNTE (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public VXR_V03_ORCRXARXROBXNTE getORCRXARXROBXNTE() { 
       return getTyped("ORCRXARXROBXNTE", VXR_V03_ORCRXARXROBXNTE.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ORCRXARXROBXNTE (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public VXR_V03_ORCRXARXROBXNTE getORCRXARXROBXNTE(int rep) { 
       return getTyped("ORCRXARXROBXNTE", rep, VXR_V03_ORCRXARXROBXNTE.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ORCRXARXROBXNTE 
     * </p>
     * 
     */ 
    public int getORCRXARXROBXNTEReps() { 
    	return getReps("ORCRXARXROBXNTE");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ORCRXARXROBXNTE.
     * <p>
     * <p>
     * Note that unlike {@link #getORCRXARXROBXNTE()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<VXR_V03_ORCRXARXROBXNTE> getORCRXARXROBXNTEAll() throws HL7Exception {
    	return getAllAsList("ORCRXARXROBXNTE", VXR_V03_ORCRXARXROBXNTE.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ORCRXARXROBXNTE (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertORCRXARXROBXNTE(VXR_V03_ORCRXARXROBXNTE structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ORCRXARXROBXNTE", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ORCRXARXROBXNTE (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public VXR_V03_ORCRXARXROBXNTE insertORCRXARXROBXNTE(int rep) throws HL7Exception { 
       return (VXR_V03_ORCRXARXROBXNTE)super.insertRepetition("ORCRXARXROBXNTE", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ORCRXARXROBXNTE (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public VXR_V03_ORCRXARXROBXNTE removeORCRXARXROBXNTE(int rep) throws HL7Exception { 
       return (VXR_V03_ORCRXARXROBXNTE)super.removeRepetition("ORCRXARXROBXNTE", rep);
    }



}
