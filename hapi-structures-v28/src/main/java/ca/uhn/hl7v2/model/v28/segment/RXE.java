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


package ca.uhn.hl7v2.model.v28.segment;

// import ca.uhn.hl7v2.model.v28.group.*;
import ca.uhn.hl7v2.model.v28.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 RXE message segment (Pharmacy/Treatment Encoded Order). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>RXE-1: Quantity/Timing (NULLDT) <b>optional </b>
     * <li>RXE-2: Give Code (CWE) <b> </b>
     * <li>RXE-3: Give Amount - Minimum (NM) <b> </b>
     * <li>RXE-4: Give Amount - Maximum (NM) <b>optional </b>
     * <li>RXE-5: Give Units (CWE) <b> </b>
     * <li>RXE-6: Give Dosage Form (CWE) <b>optional </b>
     * <li>RXE-7: Provider's Administration Instructions (CWE) <b>optional repeating</b>
     * <li>RXE-8: Deliver-To Location (NULLDT) <b>optional </b>
     * <li>RXE-9: Substitution Status (ID) <b>optional </b>
     * <li>RXE-10: Dispense Amount (NM) <b>optional </b>
     * <li>RXE-11: Dispense Units (CWE) <b>optional </b>
     * <li>RXE-12: Number Of Refills (NM) <b>optional </b>
     * <li>RXE-13: Ordering Provider's DEA Number (XCN) <b>optional repeating</b>
     * <li>RXE-14: Pharmacist/Treatment Supplier's Verifier ID (XCN) <b>optional repeating</b>
     * <li>RXE-15: Prescription Number (ST) <b>optional </b>
     * <li>RXE-16: Number of Refills Remaining (NM) <b>optional </b>
     * <li>RXE-17: Number of Refills/Doses Dispensed (NM) <b>optional </b>
     * <li>RXE-18: D/T of Most Recent Refill or Dose Dispensed (DTM) <b>optional </b>
     * <li>RXE-19: Total Daily Dose (CQ) <b>optional </b>
     * <li>RXE-20: Needs Human Review (ID) <b>optional </b>
     * <li>RXE-21: Special Dispensing Instructions (CWE) <b>optional repeating</b>
     * <li>RXE-22: Give Per (Time Unit) (ST) <b>optional </b>
     * <li>RXE-23: Give Rate Amount (ST) <b>optional </b>
     * <li>RXE-24: Give Rate Units (CWE) <b>optional </b>
     * <li>RXE-25: Give Strength (NM) <b>optional </b>
     * <li>RXE-26: Give Strength Units (CWE) <b>optional </b>
     * <li>RXE-27: Give Indication (CWE) <b>optional repeating</b>
     * <li>RXE-28: Dispense Package Size (NM) <b>optional </b>
     * <li>RXE-29: Dispense Package Size Unit (CWE) <b>optional </b>
     * <li>RXE-30: Dispense Package Method (ID) <b>optional </b>
     * <li>RXE-31: Supplementary Code (CWE) <b>optional repeating</b>
     * <li>RXE-32: Original Order Date/Time (DTM) <b>optional </b>
     * <li>RXE-33: Give Drug Strength Volume (NM) <b>optional </b>
     * <li>RXE-34: Give Drug Strength Volume Units (CWE) <b>optional </b>
     * <li>RXE-35: Controlled Substance Schedule (CWE) <b>optional </b>
     * <li>RXE-36: Formulary Status (ID) <b>optional </b>
     * <li>RXE-37: Pharmaceutical Substance Alternative (CWE) <b>optional repeating</b>
     * <li>RXE-38: Pharmacy of Most Recent Fill (CWE) <b>optional </b>
     * <li>RXE-39: Initial Dispense Amount (NM) <b>optional </b>
     * <li>RXE-40: Dispensing Pharmacy (CWE) <b>optional </b>
     * <li>RXE-41: Dispensing Pharmacy Address (XAD) <b>optional </b>
     * <li>RXE-42: Deliver-to Patient Location (PL) <b>optional </b>
     * <li>RXE-43: Deliver-to Address (XAD) <b>optional </b>
     * <li>RXE-44: Pharmacy Order Type (ID) <b>optional </b>
     * <li>RXE-45: Pharmacy Phone Number (XTN) <b>optional repeating</b>
 * </ul>
 */
@SuppressWarnings("unused")
public class RXE extends AbstractSegment {

    /** 
     * Creates a new RXE segment
     */
    public RXE(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(NULLDT.class, false, 1, 0, new Object[]{ getMessage() }, "Quantity/Timing");
                                  this.add(CWE.class, true, 1, 0, new Object[]{ getMessage() }, "Give Code");
                                  this.add(NM.class, true, 1, 0, new Object[]{ getMessage() }, "Give Amount - Minimum");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Give Amount - Maximum");
                                  this.add(CWE.class, true, 1, 0, new Object[]{ getMessage() }, "Give Units");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Give Dosage Form");
                                  this.add(CWE.class, false, 0, 0, new Object[]{ getMessage() }, "Provider's Administration Instructions");
                                  this.add(NULLDT.class, false, 1, 0, new Object[]{ getMessage() }, "Deliver-To Location");
                                              this.add(ID.class, false, 1, 1, new Object[]{ getMessage(), new Integer(167) }, "Substitution Status");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Dispense Amount");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Dispense Units");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Number Of Refills");
                                  this.add(XCN.class, false, 0, 0, new Object[]{ getMessage() }, "Ordering Provider's DEA Number");
                                  this.add(XCN.class, false, 0, 0, new Object[]{ getMessage() }, "Pharmacist/Treatment Supplier's Verifier ID");
                                  this.add(ST.class, false, 1, 0, new Object[]{ getMessage() }, "Prescription Number");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Number of Refills Remaining");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Number of Refills/Doses Dispensed");
                                  this.add(DTM.class, false, 1, 0, new Object[]{ getMessage() }, "D/T of Most Recent Refill or Dose Dispensed");
                                  this.add(CQ.class, false, 1, 0, new Object[]{ getMessage() }, "Total Daily Dose");
                                              this.add(ID.class, false, 1, 1, new Object[]{ getMessage(), new Integer(136) }, "Needs Human Review");
                                  this.add(CWE.class, false, 0, 0, new Object[]{ getMessage() }, "Special Dispensing Instructions");
                                  this.add(ST.class, false, 1, 0, new Object[]{ getMessage() }, "Give Per (Time Unit)");
                                  this.add(ST.class, false, 1, 0, new Object[]{ getMessage() }, "Give Rate Amount");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Give Rate Units");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Give Strength");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Give Strength Units");
                                  this.add(CWE.class, false, 0, 0, new Object[]{ getMessage() }, "Give Indication");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Dispense Package Size");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Dispense Package Size Unit");
                                              this.add(ID.class, false, 1, 2, new Object[]{ getMessage(), new Integer(321) }, "Dispense Package Method");
                                  this.add(CWE.class, false, 0, 0, new Object[]{ getMessage() }, "Supplementary Code");
                                  this.add(DTM.class, false, 1, 0, new Object[]{ getMessage() }, "Original Order Date/Time");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Give Drug Strength Volume");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Give Drug Strength Volume Units");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Controlled Substance Schedule");
                                              this.add(ID.class, false, 1, 1, new Object[]{ getMessage(), new Integer(478) }, "Formulary Status");
                                  this.add(CWE.class, false, 0, 0, new Object[]{ getMessage() }, "Pharmaceutical Substance Alternative");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Pharmacy of Most Recent Fill");
                                  this.add(NM.class, false, 1, 0, new Object[]{ getMessage() }, "Initial Dispense Amount");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Dispensing Pharmacy");
                                  this.add(XAD.class, false, 1, 0, new Object[]{ getMessage() }, "Dispensing Pharmacy Address");
                                  this.add(PL.class, false, 1, 0, new Object[]{ getMessage() }, "Deliver-to Patient Location");
                                  this.add(XAD.class, false, 1, 0, new Object[]{ getMessage() }, "Deliver-to Address");
                                              this.add(ID.class, false, 1, 1, new Object[]{ getMessage(), new Integer(480) }, "Pharmacy Order Type");
                                  this.add(XTN.class, false, 0, 0, new Object[]{ getMessage() }, "Pharmacy Phone Number");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating RXE - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * RXE-1: "Quantity/Timing" - creates it if necessary
     */
    public NULLDT getQuantityTiming() { 
		NULLDT retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-1: "Quantity/Timing" - creates it if necessary
     */
    public NULLDT getRxe1_QuantityTiming() { 
		NULLDT retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-2: "Give Code" - creates it if necessary
     */
    public CWE getGiveCode() { 
		CWE retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-2: "Give Code" - creates it if necessary
     */
    public CWE getRxe2_GiveCode() { 
		CWE retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-3: "Give Amount - Minimum" - creates it if necessary
     */
    public NM getGiveAmountMinimum() { 
		NM retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-3: "Give Amount - Minimum" - creates it if necessary
     */
    public NM getRxe3_GiveAmountMinimum() { 
		NM retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-4: "Give Amount - Maximum" - creates it if necessary
     */
    public NM getGiveAmountMaximum() { 
		NM retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-4: "Give Amount - Maximum" - creates it if necessary
     */
    public NM getRxe4_GiveAmountMaximum() { 
		NM retVal = this.getTypedField(4, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-5: "Give Units" - creates it if necessary
     */
    public CWE getGiveUnits() { 
		CWE retVal = this.getTypedField(5, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-5: "Give Units" - creates it if necessary
     */
    public CWE getRxe5_GiveUnits() { 
		CWE retVal = this.getTypedField(5, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-6: "Give Dosage Form" - creates it if necessary
     */
    public CWE getGiveDosageForm() { 
		CWE retVal = this.getTypedField(6, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-6: "Give Dosage Form" - creates it if necessary
     */
    public CWE getRxe6_GiveDosageForm() { 
		CWE retVal = this.getTypedField(6, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Provider's Administration Instructions (RXE-7).
     */
    public CWE[] getProviderSAdministrationInstructions() {
    	CWE[] retVal = this.getTypedField(7, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Provider's Administration Instructions (RXE-7).
     */
    public CWE[] getRxe7_ProviderSAdministrationInstructions() {
    	CWE[] retVal = this.getTypedField(7, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Provider's Administration Instructions (RXE-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProviderSAdministrationInstructionsReps() {
    	return this.getReps(7);
    }


    /**
     * Returns a specific repetition of
     * RXE-7: "Provider's Administration Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getProviderSAdministrationInstructions(int rep) { 
		CWE retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-7: "Provider's Administration Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxe7_ProviderSAdministrationInstructions(int rep) { 
		CWE retVal = this.getTypedField(7, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Provider's Administration Instructions (RXE-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe7_ProviderSAdministrationInstructionsReps() {
    	return this.getReps(7);
    }


    /**
     * Inserts a repetition of
     * RXE-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(7, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxe7_ProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * RXE-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * RXE-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxe7_ProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(7, rep);
    }




    /**
     * Returns
     * RXE-8: "Deliver-To Location" - creates it if necessary
     */
    public NULLDT getDeliverToLocation() { 
		NULLDT retVal = this.getTypedField(8, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-8: "Deliver-To Location" - creates it if necessary
     */
    public NULLDT getRxe8_DeliverToLocation() { 
		NULLDT retVal = this.getTypedField(8, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-9: "Substitution Status" - creates it if necessary
     */
    public ID getSubstitutionStatus() { 
		ID retVal = this.getTypedField(9, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-9: "Substitution Status" - creates it if necessary
     */
    public ID getRxe9_SubstitutionStatus() { 
		ID retVal = this.getTypedField(9, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-10: "Dispense Amount" - creates it if necessary
     */
    public NM getDispenseAmount() { 
		NM retVal = this.getTypedField(10, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-10: "Dispense Amount" - creates it if necessary
     */
    public NM getRxe10_DispenseAmount() { 
		NM retVal = this.getTypedField(10, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-11: "Dispense Units" - creates it if necessary
     */
    public CWE getDispenseUnits() { 
		CWE retVal = this.getTypedField(11, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-11: "Dispense Units" - creates it if necessary
     */
    public CWE getRxe11_DispenseUnits() { 
		CWE retVal = this.getTypedField(11, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-12: "Number Of Refills" - creates it if necessary
     */
    public NM getNumberOfRefills() { 
		NM retVal = this.getTypedField(12, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-12: "Number Of Refills" - creates it if necessary
     */
    public NM getRxe12_NumberOfRefills() { 
		NM retVal = this.getTypedField(12, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Ordering Provider's DEA Number (RXE-13).
     */
    public XCN[] getOrderingProviderSDEANumber() {
    	XCN[] retVal = this.getTypedField(13, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Ordering Provider's DEA Number (RXE-13).
     */
    public XCN[] getRxe13_OrderingProviderSDEANumber() {
    	XCN[] retVal = this.getTypedField(13, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Ordering Provider's DEA Number (RXE-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderSDEANumberReps() {
    	return this.getReps(13);
    }


    /**
     * Returns a specific repetition of
     * RXE-13: "Ordering Provider's DEA Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrderingProviderSDEANumber(int rep) { 
		XCN retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-13: "Ordering Provider's DEA Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getRxe13_OrderingProviderSDEANumber(int rep) { 
		XCN retVal = this.getTypedField(13, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Ordering Provider's DEA Number (RXE-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe13_OrderingProviderSDEANumberReps() {
    	return this.getReps(13);
    }


    /**
     * Inserts a repetition of
     * RXE-13: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(13, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-13: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertRxe13_OrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * RXE-13: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * RXE-13: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeRxe13_OrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
     */
    public XCN[] getPharmacistTreatmentSupplierSVerifierID() {
    	XCN[] retVal = this.getTypedField(14, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
     */
    public XCN[] getRxe14_PharmacistTreatmentSupplierSVerifierID() {
    	XCN[] retVal = this.getTypedField(14, new XCN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacistTreatmentSupplierSVerifierIDReps() {
    	return this.getReps(14);
    }


    /**
     * Returns a specific repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPharmacistTreatmentSupplierSVerifierID(int rep) { 
		XCN retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getRxe14_PharmacistTreatmentSupplierSVerifierID(int rep) { 
		XCN retVal = this.getTypedField(14, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe14_PharmacistTreatmentSupplierSVerifierIDReps() {
    	return this.getReps(14);
    }


    /**
     * Inserts a repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(14, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertRxe14_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXE-14: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeRxe14_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(14, rep);
    }




    /**
     * Returns
     * RXE-15: "Prescription Number" - creates it if necessary
     */
    public ST getPrescriptionNumber() { 
		ST retVal = this.getTypedField(15, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-15: "Prescription Number" - creates it if necessary
     */
    public ST getRxe15_PrescriptionNumber() { 
		ST retVal = this.getTypedField(15, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-16: "Number of Refills Remaining" - creates it if necessary
     */
    public NM getNumberOfRefillsRemaining() { 
		NM retVal = this.getTypedField(16, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-16: "Number of Refills Remaining" - creates it if necessary
     */
    public NM getRxe16_NumberOfRefillsRemaining() { 
		NM retVal = this.getTypedField(16, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-17: "Number of Refills/Doses Dispensed" - creates it if necessary
     */
    public NM getNumberOfRefillsDosesDispensed() { 
		NM retVal = this.getTypedField(17, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-17: "Number of Refills/Doses Dispensed" - creates it if necessary
     */
    public NM getRxe17_NumberOfRefillsDosesDispensed() { 
		NM retVal = this.getTypedField(17, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-18: "D/T of Most Recent Refill or Dose Dispensed" - creates it if necessary
     */
    public DTM getDTOfMostRecentRefillOrDoseDispensed() { 
		DTM retVal = this.getTypedField(18, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-18: "D/T of Most Recent Refill or Dose Dispensed" - creates it if necessary
     */
    public DTM getRxe18_DTOfMostRecentRefillOrDoseDispensed() { 
		DTM retVal = this.getTypedField(18, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-19: "Total Daily Dose" - creates it if necessary
     */
    public CQ getTotalDailyDose() { 
		CQ retVal = this.getTypedField(19, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-19: "Total Daily Dose" - creates it if necessary
     */
    public CQ getRxe19_TotalDailyDose() { 
		CQ retVal = this.getTypedField(19, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-20: "Needs Human Review" - creates it if necessary
     */
    public ID getNeedsHumanReview() { 
		ID retVal = this.getTypedField(20, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-20: "Needs Human Review" - creates it if necessary
     */
    public ID getRxe20_NeedsHumanReview() { 
		ID retVal = this.getTypedField(20, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Special Dispensing Instructions (RXE-21).
     */
    public CWE[] getSpecialDispensingInstructions() {
    	CWE[] retVal = this.getTypedField(21, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Special Dispensing Instructions (RXE-21).
     */
    public CWE[] getRxe21_SpecialDispensingInstructions() {
    	CWE[] retVal = this.getTypedField(21, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Special Dispensing Instructions (RXE-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecialDispensingInstructionsReps() {
    	return this.getReps(21);
    }


    /**
     * Returns a specific repetition of
     * RXE-21: "Special Dispensing Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getSpecialDispensingInstructions(int rep) { 
		CWE retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-21: "Special Dispensing Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxe21_SpecialDispensingInstructions(int rep) { 
		CWE retVal = this.getTypedField(21, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Special Dispensing Instructions (RXE-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe21_SpecialDispensingInstructionsReps() {
    	return this.getReps(21);
    }


    /**
     * Inserts a repetition of
     * RXE-21: "Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(21, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-21: "Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxe21_SpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXE-21: "Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXE-21: "Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxe21_SpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(21, rep);
    }




    /**
     * Returns
     * RXE-22: "Give Per (Time Unit)" - creates it if necessary
     */
    public ST getGivePerTimeUnit() { 
		ST retVal = this.getTypedField(22, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-22: "Give Per (Time Unit)" - creates it if necessary
     */
    public ST getRxe22_GivePerTimeUnit() { 
		ST retVal = this.getTypedField(22, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-23: "Give Rate Amount" - creates it if necessary
     */
    public ST getGiveRateAmount() { 
		ST retVal = this.getTypedField(23, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-23: "Give Rate Amount" - creates it if necessary
     */
    public ST getRxe23_GiveRateAmount() { 
		ST retVal = this.getTypedField(23, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-24: "Give Rate Units" - creates it if necessary
     */
    public CWE getGiveRateUnits() { 
		CWE retVal = this.getTypedField(24, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-24: "Give Rate Units" - creates it if necessary
     */
    public CWE getRxe24_GiveRateUnits() { 
		CWE retVal = this.getTypedField(24, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-25: "Give Strength" - creates it if necessary
     */
    public NM getGiveStrength() { 
		NM retVal = this.getTypedField(25, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-25: "Give Strength" - creates it if necessary
     */
    public NM getRxe25_GiveStrength() { 
		NM retVal = this.getTypedField(25, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-26: "Give Strength Units" - creates it if necessary
     */
    public CWE getGiveStrengthUnits() { 
		CWE retVal = this.getTypedField(26, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-26: "Give Strength Units" - creates it if necessary
     */
    public CWE getRxe26_GiveStrengthUnits() { 
		CWE retVal = this.getTypedField(26, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Give Indication (RXE-27).
     */
    public CWE[] getGiveIndication() {
    	CWE[] retVal = this.getTypedField(27, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Give Indication (RXE-27).
     */
    public CWE[] getRxe27_GiveIndication() {
    	CWE[] retVal = this.getTypedField(27, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Give Indication (RXE-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getGiveIndicationReps() {
    	return this.getReps(27);
    }


    /**
     * Returns a specific repetition of
     * RXE-27: "Give Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getGiveIndication(int rep) { 
		CWE retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-27: "Give Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxe27_GiveIndication(int rep) { 
		CWE retVal = this.getTypedField(27, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Give Indication (RXE-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe27_GiveIndicationReps() {
    	return this.getReps(27);
    }


    /**
     * Inserts a repetition of
     * RXE-27: "Give Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertGiveIndication(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(27, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-27: "Give Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxe27_GiveIndication(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXE-27: "Give Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeGiveIndication(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXE-27: "Give Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxe27_GiveIndication(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(27, rep);
    }




    /**
     * Returns
     * RXE-28: "Dispense Package Size" - creates it if necessary
     */
    public NM getDispensePackageSize() { 
		NM retVal = this.getTypedField(28, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-28: "Dispense Package Size" - creates it if necessary
     */
    public NM getRxe28_DispensePackageSize() { 
		NM retVal = this.getTypedField(28, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-29: "Dispense Package Size Unit" - creates it if necessary
     */
    public CWE getDispensePackageSizeUnit() { 
		CWE retVal = this.getTypedField(29, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-29: "Dispense Package Size Unit" - creates it if necessary
     */
    public CWE getRxe29_DispensePackageSizeUnit() { 
		CWE retVal = this.getTypedField(29, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-30: "Dispense Package Method" - creates it if necessary
     */
    public ID getDispensePackageMethod() { 
		ID retVal = this.getTypedField(30, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-30: "Dispense Package Method" - creates it if necessary
     */
    public ID getRxe30_DispensePackageMethod() { 
		ID retVal = this.getTypedField(30, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Supplementary Code (RXE-31).
     */
    public CWE[] getSupplementaryCode() {
    	CWE[] retVal = this.getTypedField(31, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Supplementary Code (RXE-31).
     */
    public CWE[] getRxe31_SupplementaryCode() {
    	CWE[] retVal = this.getTypedField(31, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Supplementary Code (RXE-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSupplementaryCodeReps() {
    	return this.getReps(31);
    }


    /**
     * Returns a specific repetition of
     * RXE-31: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getSupplementaryCode(int rep) { 
		CWE retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-31: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxe31_SupplementaryCode(int rep) { 
		CWE retVal = this.getTypedField(31, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Supplementary Code (RXE-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe31_SupplementaryCodeReps() {
    	return this.getReps(31);
    }


    /**
     * Inserts a repetition of
     * RXE-31: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertSupplementaryCode(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(31, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-31: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxe31_SupplementaryCode(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * RXE-31: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeSupplementaryCode(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * RXE-31: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxe31_SupplementaryCode(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(31, rep);
    }




    /**
     * Returns
     * RXE-32: "Original Order Date/Time" - creates it if necessary
     */
    public DTM getOriginalOrderDateTime() { 
		DTM retVal = this.getTypedField(32, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-32: "Original Order Date/Time" - creates it if necessary
     */
    public DTM getRxe32_OriginalOrderDateTime() { 
		DTM retVal = this.getTypedField(32, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-33: "Give Drug Strength Volume" - creates it if necessary
     */
    public NM getGiveDrugStrengthVolume() { 
		NM retVal = this.getTypedField(33, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-33: "Give Drug Strength Volume" - creates it if necessary
     */
    public NM getRxe33_GiveDrugStrengthVolume() { 
		NM retVal = this.getTypedField(33, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-34: "Give Drug Strength Volume Units" - creates it if necessary
     */
    public CWE getGiveDrugStrengthVolumeUnits() { 
		CWE retVal = this.getTypedField(34, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-34: "Give Drug Strength Volume Units" - creates it if necessary
     */
    public CWE getRxe34_GiveDrugStrengthVolumeUnits() { 
		CWE retVal = this.getTypedField(34, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-35: "Controlled Substance Schedule" - creates it if necessary
     */
    public CWE getControlledSubstanceSchedule() { 
		CWE retVal = this.getTypedField(35, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-35: "Controlled Substance Schedule" - creates it if necessary
     */
    public CWE getRxe35_ControlledSubstanceSchedule() { 
		CWE retVal = this.getTypedField(35, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-36: "Formulary Status" - creates it if necessary
     */
    public ID getFormularyStatus() { 
		ID retVal = this.getTypedField(36, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-36: "Formulary Status" - creates it if necessary
     */
    public ID getRxe36_FormularyStatus() { 
		ID retVal = this.getTypedField(36, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Pharmaceutical Substance Alternative (RXE-37).
     */
    public CWE[] getPharmaceuticalSubstanceAlternative() {
    	CWE[] retVal = this.getTypedField(37, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Pharmaceutical Substance Alternative (RXE-37).
     */
    public CWE[] getRxe37_PharmaceuticalSubstanceAlternative() {
    	CWE[] retVal = this.getTypedField(37, new CWE[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Pharmaceutical Substance Alternative (RXE-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmaceuticalSubstanceAlternativeReps() {
    	return this.getReps(37);
    }


    /**
     * Returns a specific repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getPharmaceuticalSubstanceAlternative(int rep) { 
		CWE retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxe37_PharmaceuticalSubstanceAlternative(int rep) { 
		CWE retVal = this.getTypedField(37, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Pharmaceutical Substance Alternative (RXE-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe37_PharmaceuticalSubstanceAlternativeReps() {
    	return this.getReps(37);
    }


    /**
     * Inserts a repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertPharmaceuticalSubstanceAlternative(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(37, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxe37_PharmaceuticalSubstanceAlternative(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removePharmaceuticalSubstanceAlternative(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * RXE-37: "Pharmaceutical Substance Alternative" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxe37_PharmaceuticalSubstanceAlternative(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(37, rep);
    }




    /**
     * Returns
     * RXE-38: "Pharmacy of Most Recent Fill" - creates it if necessary
     */
    public CWE getPharmacyOfMostRecentFill() { 
		CWE retVal = this.getTypedField(38, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-38: "Pharmacy of Most Recent Fill" - creates it if necessary
     */
    public CWE getRxe38_PharmacyOfMostRecentFill() { 
		CWE retVal = this.getTypedField(38, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-39: "Initial Dispense Amount" - creates it if necessary
     */
    public NM getInitialDispenseAmount() { 
		NM retVal = this.getTypedField(39, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-39: "Initial Dispense Amount" - creates it if necessary
     */
    public NM getRxe39_InitialDispenseAmount() { 
		NM retVal = this.getTypedField(39, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-40: "Dispensing Pharmacy" - creates it if necessary
     */
    public CWE getDispensingPharmacy() { 
		CWE retVal = this.getTypedField(40, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-40: "Dispensing Pharmacy" - creates it if necessary
     */
    public CWE getRxe40_DispensingPharmacy() { 
		CWE retVal = this.getTypedField(40, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-41: "Dispensing Pharmacy Address" - creates it if necessary
     */
    public XAD getDispensingPharmacyAddress() { 
		XAD retVal = this.getTypedField(41, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-41: "Dispensing Pharmacy Address" - creates it if necessary
     */
    public XAD getRxe41_DispensingPharmacyAddress() { 
		XAD retVal = this.getTypedField(41, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-42: "Deliver-to Patient Location" - creates it if necessary
     */
    public PL getDeliverToPatientLocation() { 
		PL retVal = this.getTypedField(42, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-42: "Deliver-to Patient Location" - creates it if necessary
     */
    public PL getRxe42_DeliverToPatientLocation() { 
		PL retVal = this.getTypedField(42, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-43: "Deliver-to Address" - creates it if necessary
     */
    public XAD getDeliverToAddress() { 
		XAD retVal = this.getTypedField(43, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-43: "Deliver-to Address" - creates it if necessary
     */
    public XAD getRxe43_DeliverToAddress() { 
		XAD retVal = this.getTypedField(43, 0);
		return retVal;
    }



    /**
     * Returns
     * RXE-44: "Pharmacy Order Type" - creates it if necessary
     */
    public ID getPharmacyOrderType() { 
		ID retVal = this.getTypedField(44, 0);
		return retVal;
    }
    
    /**
     * Returns
     * RXE-44: "Pharmacy Order Type" - creates it if necessary
     */
    public ID getRxe44_PharmacyOrderType() { 
		ID retVal = this.getTypedField(44, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Pharmacy Phone Number (RXE-45).
     */
    public XTN[] getPharmacyPhoneNumber() {
    	XTN[] retVal = this.getTypedField(45, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Pharmacy Phone Number (RXE-45).
     */
    public XTN[] getRxe45_PharmacyPhoneNumber() {
    	XTN[] retVal = this.getTypedField(45, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Pharmacy Phone Number (RXE-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacyPhoneNumberReps() {
    	return this.getReps(45);
    }


    /**
     * Returns a specific repetition of
     * RXE-45: "Pharmacy Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPharmacyPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * RXE-45: "Pharmacy Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getRxe45_PharmacyPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(45, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Pharmacy Phone Number (RXE-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxe45_PharmacyPhoneNumberReps() {
    	return this.getReps(45);
    }


    /**
     * Inserts a repetition of
     * RXE-45: "Pharmacy Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPharmacyPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(45, rep);
    }


    /**
     * Inserts a repetition of
     * RXE-45: "Pharmacy Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertRxe45_PharmacyPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * RXE-45: "Pharmacy Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePharmacyPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * RXE-45: "Pharmacy Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeRxe45_PharmacyPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(45, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new NULLDT(getMessage());
          case 1: return new CWE(getMessage());
          case 2: return new NM(getMessage());
          case 3: return new NM(getMessage());
          case 4: return new CWE(getMessage());
          case 5: return new CWE(getMessage());
          case 6: return new CWE(getMessage());
          case 7: return new NULLDT(getMessage());
          case 8: return new ID(getMessage(), new Integer( 167 ));
          case 9: return new NM(getMessage());
          case 10: return new CWE(getMessage());
          case 11: return new NM(getMessage());
          case 12: return new XCN(getMessage());
          case 13: return new XCN(getMessage());
          case 14: return new ST(getMessage());
          case 15: return new NM(getMessage());
          case 16: return new NM(getMessage());
          case 17: return new DTM(getMessage());
          case 18: return new CQ(getMessage());
          case 19: return new ID(getMessage(), new Integer( 136 ));
          case 20: return new CWE(getMessage());
          case 21: return new ST(getMessage());
          case 22: return new ST(getMessage());
          case 23: return new CWE(getMessage());
          case 24: return new NM(getMessage());
          case 25: return new CWE(getMessage());
          case 26: return new CWE(getMessage());
          case 27: return new NM(getMessage());
          case 28: return new CWE(getMessage());
          case 29: return new ID(getMessage(), new Integer( 321 ));
          case 30: return new CWE(getMessage());
          case 31: return new DTM(getMessage());
          case 32: return new NM(getMessage());
          case 33: return new CWE(getMessage());
          case 34: return new CWE(getMessage());
          case 35: return new ID(getMessage(), new Integer( 478 ));
          case 36: return new CWE(getMessage());
          case 37: return new CWE(getMessage());
          case 38: return new NM(getMessage());
          case 39: return new CWE(getMessage());
          case 40: return new XAD(getMessage());
          case 41: return new PL(getMessage());
          case 42: return new XAD(getMessage());
          case 43: return new ID(getMessage(), new Integer( 480 ));
          case 44: return new XTN(getMessage());
          default: return null;
       }
   }


}

