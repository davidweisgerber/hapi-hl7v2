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


package ca.uhn.hl7v2.model.v22.segment;

// import ca.uhn.hl7v2.model.v22.group.*;
import ca.uhn.hl7v2.model.v22.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 OM4 message segment (OBSERVATION that require specimens). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>OM4-1: Segment Type ID (ST) <b>optional </b>
     * <li>OM4-2: Sequence Number - Test/ Observation Master File (NM) <b>optional </b>
     * <li>OM4-3: Derived Specimen (ID) <b>optional </b>
     * <li>OM4-4: Container Description (TX) <b>optional </b>
     * <li>OM4-5: Container Volume (NM) <b>optional </b>
     * <li>OM4-6: Container Units (CE) <b>optional </b>
     * <li>OM4-7: Specimen (CE) <b>optional </b>
     * <li>OM4-8: Additive (CE) <b>optional </b>
     * <li>OM4-9: Preparation (TX) <b>optional </b>
     * <li>OM4-10: Special Handling Requirements (TX) <b>optional </b>
     * <li>OM4-11: Normal Collection Volume (CQ_QUANTITY) <b>optional </b>
     * <li>OM4-12: Minimum Collection Volume (CQ_QUANTITY) <b>optional </b>
     * <li>OM4-13: Specimen Requirements (TX) <b>optional </b>
     * <li>OM4-14: Specimen Priorities (ID) <b>optional repeating</b>
     * <li>OM4-15: Specimen Retention Time (CQ_QUANTITY) <b>optional </b>
 * </ul>
 */
@SuppressWarnings("unused")
public class OM4 extends AbstractSegment {

    /** 
     * Creates a new OM4 segment
     */
    public OM4(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(ST.class, false, 1, 3, new Object[]{ getMessage() }, "Segment Type ID");
                                  this.add(NM.class, false, 1, 4, new Object[]{ getMessage() }, "Sequence Number - Test/ Observation Master File");
                                              this.add(ID.class, false, 1, 1, new Object[]{ getMessage(), new Integer(170) }, "Derived Specimen");
                                  this.add(TX.class, false, 1, 60, new Object[]{ getMessage() }, "Container Description");
                                  this.add(NM.class, false, 1, 20, new Object[]{ getMessage() }, "Container Volume");
                                  this.add(CE.class, false, 1, 60, new Object[]{ getMessage() }, "Container Units");
                                  this.add(CE.class, false, 1, 60, new Object[]{ getMessage() }, "Specimen");
                                  this.add(CE.class, false, 1, 60, new Object[]{ getMessage() }, "Additive");
                                  this.add(TX.class, false, 1, 10240, new Object[]{ getMessage() }, "Preparation");
                                  this.add(TX.class, false, 1, 10240, new Object[]{ getMessage() }, "Special Handling Requirements");
                                  this.add(CQ_QUANTITY.class, false, 1, 20, new Object[]{ getMessage() }, "Normal Collection Volume");
                                  this.add(CQ_QUANTITY.class, false, 1, 20, new Object[]{ getMessage() }, "Minimum Collection Volume");
                                  this.add(TX.class, false, 1, 10240, new Object[]{ getMessage() }, "Specimen Requirements");
                                              this.add(ID.class, false, 0, 60, new Object[]{ getMessage(), new Integer(27) }, "Specimen Priorities");
                                  this.add(CQ_QUANTITY.class, false, 1, 20, new Object[]{ getMessage() }, "Specimen Retention Time");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating OM4 - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * OM4-1: "Segment Type ID" - creates it if necessary
     */
    public ST getSegmentTypeID() { 
		ST retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-1: "Segment Type ID" - creates it if necessary
     */
    public ST getOm41_SegmentTypeID() { 
		ST retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-2: "Sequence Number - Test/ Observation Master File" - creates it if necessary
     */
    public NM getSequenceNumberTestObservationMasterFile() { 
		NM retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-2: "Sequence Number - Test/ Observation Master File" - creates it if necessary
     */
    public NM getOm42_SequenceNumberTestObservationMasterFile() { 
		NM retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-3: "Derived Specimen" - creates it if necessary
     */
    public ID getDerivedSpecimen() { 
		ID retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-3: "Derived Specimen" - creates it if necessary
     */
    public ID getOm43_DerivedSpecimen() { 
		ID retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-4: "Container Description" - creates it if necessary
     */
    public TX getContainerDescription() { 
		TX retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-4: "Container Description" - creates it if necessary
     */
    public TX getOm44_ContainerDescription() { 
		TX retVal = this.getTypedField(4, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-5: "Container Volume" - creates it if necessary
     */
    public NM getContainerVolume() { 
		NM retVal = this.getTypedField(5, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-5: "Container Volume" - creates it if necessary
     */
    public NM getOm45_ContainerVolume() { 
		NM retVal = this.getTypedField(5, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-6: "Container Units" - creates it if necessary
     */
    public CE getContainerUnits() { 
		CE retVal = this.getTypedField(6, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-6: "Container Units" - creates it if necessary
     */
    public CE getOm46_ContainerUnits() { 
		CE retVal = this.getTypedField(6, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-7: "Specimen" - creates it if necessary
     */
    public CE getSpecimen() { 
		CE retVal = this.getTypedField(7, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-7: "Specimen" - creates it if necessary
     */
    public CE getOm47_Specimen() { 
		CE retVal = this.getTypedField(7, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-8: "Additive" - creates it if necessary
     */
    public CE getAdditive() { 
		CE retVal = this.getTypedField(8, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-8: "Additive" - creates it if necessary
     */
    public CE getOm48_Additive() { 
		CE retVal = this.getTypedField(8, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-9: "Preparation" - creates it if necessary
     */
    public TX getPreparation() { 
		TX retVal = this.getTypedField(9, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-9: "Preparation" - creates it if necessary
     */
    public TX getOm49_Preparation() { 
		TX retVal = this.getTypedField(9, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-10: "Special Handling Requirements" - creates it if necessary
     */
    public TX getSpecialHandlingRequirements() { 
		TX retVal = this.getTypedField(10, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-10: "Special Handling Requirements" - creates it if necessary
     */
    public TX getOm410_SpecialHandlingRequirements() { 
		TX retVal = this.getTypedField(10, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-11: "Normal Collection Volume" - creates it if necessary
     */
    public CQ_QUANTITY getNormalCollectionVolume() { 
		CQ_QUANTITY retVal = this.getTypedField(11, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-11: "Normal Collection Volume" - creates it if necessary
     */
    public CQ_QUANTITY getOm411_NormalCollectionVolume() { 
		CQ_QUANTITY retVal = this.getTypedField(11, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-12: "Minimum Collection Volume" - creates it if necessary
     */
    public CQ_QUANTITY getMinimumCollectionVolume() { 
		CQ_QUANTITY retVal = this.getTypedField(12, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-12: "Minimum Collection Volume" - creates it if necessary
     */
    public CQ_QUANTITY getOm412_MinimumCollectionVolume() { 
		CQ_QUANTITY retVal = this.getTypedField(12, 0);
		return retVal;
    }



    /**
     * Returns
     * OM4-13: "Specimen Requirements" - creates it if necessary
     */
    public TX getSpecimenRequirements() { 
		TX retVal = this.getTypedField(13, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-13: "Specimen Requirements" - creates it if necessary
     */
    public TX getOm413_SpecimenRequirements() { 
		TX retVal = this.getTypedField(13, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Specimen Priorities (OM4-14).
     */
    public ID[] getSpecimenPriorities() {
    	ID[] retVal = this.getTypedField(14, new ID[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Specimen Priorities (OM4-14).
     */
    public ID[] getOm414_SpecimenPriorities() {
    	ID[] retVal = this.getTypedField(14, new ID[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Specimen Priorities (OM4-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenPrioritiesReps() {
    	return this.getReps(14);
    }


    /**
     * Returns a specific repetition of
     * OM4-14: "Specimen Priorities" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getSpecimenPriorities(int rep) { 
		ID retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * OM4-14: "Specimen Priorities" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getOm414_SpecimenPriorities(int rep) { 
		ID retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Specimen Priorities (OM4-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOm414_SpecimenPrioritiesReps() {
    	return this.getReps(14);
    }


    /**
     * Inserts a repetition of
     * OM4-14: "Specimen Priorities" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertSpecimenPriorities(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(14, rep);
    }


    /**
     * Inserts a repetition of
     * OM4-14: "Specimen Priorities" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertOm414_SpecimenPriorities(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OM4-14: "Specimen Priorities" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeSpecimenPriorities(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OM4-14: "Specimen Priorities" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeOm414_SpecimenPriorities(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(14, rep);
    }




    /**
     * Returns
     * OM4-15: "Specimen Retention Time" - creates it if necessary
     */
    public CQ_QUANTITY getSpecimenRetentionTime() { 
		CQ_QUANTITY retVal = this.getTypedField(15, 0);
		return retVal;
    }
    
    /**
     * Returns
     * OM4-15: "Specimen Retention Time" - creates it if necessary
     */
    public CQ_QUANTITY getOm415_SpecimenRetentionTime() { 
		CQ_QUANTITY retVal = this.getTypedField(15, 0);
		return retVal;
    }





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new ST(getMessage());
          case 1: return new NM(getMessage());
          case 2: return new ID(getMessage(), new Integer( 170 ));
          case 3: return new TX(getMessage());
          case 4: return new NM(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new CE(getMessage());
          case 7: return new CE(getMessage());
          case 8: return new TX(getMessage());
          case 9: return new TX(getMessage());
          case 10: return new CQ_QUANTITY(getMessage());
          case 11: return new CQ_QUANTITY(getMessage());
          case 12: return new TX(getMessage());
          case 13: return new ID(getMessage(), new Integer( 27 ));
          case 14: return new CQ_QUANTITY(getMessage());
          default: return null;
       }
   }


}

