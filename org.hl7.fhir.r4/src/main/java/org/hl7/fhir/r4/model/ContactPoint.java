package org.hl7.fhir.r4.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;

/**
 * Details for all kinds of technology mediated contact points for a person or
 * organization, including telephone, email, etc.
 */
@DatatypeDef(name = "ContactPoint")
public class ContactPoint extends Type implements ICompositeType {

  /**
   * Telecommunications form for contact point - what communications system is
   * required to make use of the contact.
   */
  @Child(name = "system", type = { StringType.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "phone | fax | email | pager | url | sms | other", formalDefinition = "Telecommunications form for contact point - what communications system is required to make use of the contact.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-system")
  protected StringType system;

  /**
   * The actual contact point details, in a form that is meaningful to the
   * designated communication system (i.e. phone number or email address).
   */
  @Child(name = "value", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The actual contact point details", formalDefinition = "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).")
  protected StringType value;

  /**
   * Identifies the purpose for the contact point.
   */
  @Child(name = "use", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = true, summary = true)
  @Description(shortDefinition = "home | work | temp | old | mobile - purpose of this contact point", formalDefinition = "Identifies the purpose for the contact point.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-use")
  protected StringType use;

  /**
   * Specifies a preferred order in which to use a set of contacts. ContactPoints
   * with lower rank values are more preferred than those with higher rank values.
   */
  @Child(name = "rank", type = { PositiveIntType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Specify preferred order of use (1 = highest)", formalDefinition = "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.")
  protected PositiveIntType rank;

  /**
   * Time period when the contact point was/is in use.
   */
  @Child(name = "period", type = { Period.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Time period when the contact point was/is in use", formalDefinition = "Time period when the contact point was/is in use.")
  protected Period period;

  private static final long serialVersionUID = 1509610874L;

  /**
   * Constructor
   */
  public ContactPoint() {
    super();
  }

  /**
   * @return {@link #system} (Telecommunications form for contact point - what
   *         communications system is required to make use of the contact.). This
   *         is the underlying object with id, value and extensions. The accessor
   *         "getSystem" gives direct access to the value
   */
  public StringType getSystemElement() {
    if (this.system == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.system");
      else if (Configuration.doAutoCreate())
        this.system = new StringType(); // bb
    return this.system;
  }

  public boolean hasSystemElement() {
    return this.system != null && !this.system.isEmpty();
  }

  public boolean hasSystem() {
    return this.system != null && !this.system.isEmpty();
  }

  /**
   * @param value {@link #system} (Telecommunications form for contact point -
   *              what communications system is required to make use of the
   *              contact.). This is the underlying object with id, value and
   *              extensions. The accessor "getSystem" gives direct access to the
   *              value
   */
  public ContactPoint setSystemElement(StringType value) {
    this.system = value;
    return this;
  }

  /**
   * @return Telecommunications form for contact point - what communications
   *         system is required to make use of the contact.
   */
  public StringType getSystem() {
    return this.system == null ? null : this.system;
  }

  /**
   * @param value Telecommunications form for contact point - what communications
   *              system is required to make use of the contact.
   */
  public ContactPoint setSystem(String value) {
    if (value == null)
      this.system = null;
    else {
      if (this.system == null)
        this.system = new StringType();
      this.system.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #value} (The actual contact point details, in a form that is
   *         meaningful to the designated communication system (i.e. phone number
   *         or email address).). This is the underlying object with id, value and
   *         extensions. The accessor "getValue" gives direct access to the value
   */
  public StringType getValueElement() {
    if (this.value == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.value");
      else if (Configuration.doAutoCreate())
        this.value = new StringType(); // bb
    return this.value;
  }

  public boolean hasValueElement() {
    return this.value != null && !this.value.isEmpty();
  }

  public boolean hasValue() {
    return this.value != null && !this.value.isEmpty();
  }

  /**
   * @param value {@link #value} (The actual contact point details, in a form that
   *              is meaningful to the designated communication system (i.e. phone
   *              number or email address).). This is the underlying object with
   *              id, value and extensions. The accessor "getValue" gives direct
   *              access to the value
   */
  public ContactPoint setValueElement(StringType value) {
    this.value = value;
    return this;
  }

  /**
   * @return The actual contact point details, in a form that is meaningful to the
   *         designated communication system (i.e. phone number or email address).
   */
  public String getValue() {
    return this.value == null ? null : this.value.getValue();
  }

  /**
   * @param value The actual contact point details, in a form that is meaningful
   *              to the designated communication system (i.e. phone number or
   *              email address).
   */
  public ContactPoint setValue(String value) {
    if (Utilities.noString(value))
      this.value = null;
    else {
      if (this.value == null)
        this.value = new StringType();
      this.value.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #use} (Identifies the purpose for the contact point.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getUse" gives direct access to the value
   */
  public StringType getUseElement() {
    if (this.use == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.use");
      else if (Configuration.doAutoCreate())
        this.use = new StringType(); // bb
    return this.use;
  }

  public boolean hasUseElement() {
    return this.use != null && !this.use.isEmpty();
  }

  public boolean hasUse() {
    return this.use != null && !this.use.isEmpty();
  }

  /**
   * @param value {@link #use} (Identifies the purpose for the contact point.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getUse" gives direct access to the value
   */
  public ContactPoint setUseElement(StringType value) {
    this.use = value;
    return this;
  }

  /**
   * @return Identifies the purpose for the contact point.
   */
  public StringType getUse() {
    return this.use == null ? null : this.use;
  }

  /**
   * @param value Identifies the purpose for the contact point.
   */
  public ContactPoint setUse(String value) {
    if (value == null)
      this.use = null;
    else {
      if (this.use == null)
        this.use = new StringType();
      this.use.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #rank} (Specifies a preferred order in which to use a set of
   *         contacts. ContactPoints with lower rank values are more preferred
   *         than those with higher rank values.). This is the underlying object
   *         with id, value and extensions. The accessor "getRank" gives direct
   *         access to the value
   */
  public PositiveIntType getRankElement() {
    if (this.rank == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.rank");
      else if (Configuration.doAutoCreate())
        this.rank = new PositiveIntType(); // bb
    return this.rank;
  }

  public boolean hasRankElement() {
    return this.rank != null && !this.rank.isEmpty();
  }

  public boolean hasRank() {
    return this.rank != null && !this.rank.isEmpty();
  }

  /**
   * @param value {@link #rank} (Specifies a preferred order in which to use a set
   *              of contacts. ContactPoints with lower rank values are more
   *              preferred than those with higher rank values.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getRank" gives direct access to the value
   */
  public ContactPoint setRankElement(PositiveIntType value) {
    this.rank = value;
    return this;
  }

  /**
   * @return Specifies a preferred order in which to use a set of contacts.
   *         ContactPoints with lower rank values are more preferred than those
   *         with higher rank values.
   */
  public int getRank() {
    return this.rank == null || this.rank.isEmpty() ? 0 : this.rank.getValue();
  }

  /**
   * @param value Specifies a preferred order in which to use a set of contacts.
   *              ContactPoints with lower rank values are more preferred than
   *              those with higher rank values.
   */
  public ContactPoint setRank(int value) {
    if (this.rank == null)
      this.rank = new PositiveIntType();
    this.rank.setValue(value);
    return this;
  }

  /**
   * @return {@link #period} (Time period when the contact point was/is in use.)
   */
  public Period getPeriod() {
    if (this.period == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ContactPoint.period");
      else if (Configuration.doAutoCreate())
        this.period = new Period(); // cc
    return this.period;
  }

  public boolean hasPeriod() {
    return this.period != null && !this.period.isEmpty();
  }

  /**
   * @param value {@link #period} (Time period when the contact point was/is in
   *              use.)
   */
  public ContactPoint setPeriod(Period value) {
    this.period = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("system", "string",
        "Telecommunications form for contact point - what communications system is required to make use of the contact.",
        0, 1, system));
    children.add(new Property("value", "string",
        "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).",
        0, 1, value));
    children.add(new Property("use", "string", "Identifies the purpose for the contact point.", 0, 1, use));
    children.add(new Property("rank", "positiveInt",
        "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.",
        0, 1, rank));
    children.add(new Property("period", "Period", "Time period when the contact point was/is in use.", 0, 1, period));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -887328209:
      /* system */ return new Property("system", "string",
          "Telecommunications form for contact point - what communications system is required to make use of the contact.",
          0, 1, system);
    case 111972721:
      /* value */ return new Property("value", "string",
          "The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).",
          0, 1, value);
    case 116103:
      /* use */ return new Property("use", "string", "Identifies the purpose for the contact point.", 0, 1, use);
    case 3492908:
      /* rank */ return new Property("rank", "positiveInt",
          "Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred than those with higher rank values.",
          0, 1, rank);
    case -991726143:
      /* period */ return new Property("period", "Period", "Time period when the contact point was/is in use.", 0, 1,
          period);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -887328209:
      /* system */ return this.system == null ? new Base[0] : new Base[] { this.system }; // StringType
    case 111972721:
      /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // StringType
    case 116103:
      /* use */ return this.use == null ? new Base[0] : new Base[] { this.use }; // StringType
    case 3492908:
      /* rank */ return this.rank == null ? new Base[0] : new Base[] { this.rank }; // PositiveIntType
    case -991726143:
      /* period */ return this.period == null ? new Base[0] : new Base[] { this.period }; // Period
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -887328209: // system
      this.system = castToString(value); // StringType
      return value;
    case 111972721: // value
      this.value = castToString(value); // StringType
      return value;
    case 116103: // use
      this.use = castToString(value); // StringType
      return value;
    case 3492908: // rank
      this.rank = castToPositiveInt(value); // PositiveIntType
      return value;
    case -991726143: // period
      this.period = castToPeriod(value); // Period
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("system")) {
      this.system = castToString(value); // StringType
    } else if (name.equals("value")) {
      this.value = castToString(value); // StringType
    } else if (name.equals("use")) {
      this.use = castToString(value); // StringType
    } else if (name.equals("rank")) {
      this.rank = castToPositiveInt(value); // PositiveIntType
    } else if (name.equals("period")) {
      this.period = castToPeriod(value); // Period
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("system")) {
      this.system = null;
    } else if (name.equals("value")) {
      this.value = null;
    } else if (name.equals("use")) {
      this.use = null;
    } else if (name.equals("rank")) {
      this.rank = null;
    } else if (name.equals("period")) {
      this.period = null;
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -887328209:
      return getSystemElement();
    case 111972721:
      return getValueElement();
    case 116103:
      return getUseElement();
    case 3492908:
      return getRankElement();
    case -991726143:
      return getPeriod();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -887328209:
      /* system */ return new String[] { "string" };
    case 111972721:
      /* value */ return new String[] { "string" };
    case 116103:
      /* use */ return new String[] { "string" };
    case 3492908:
      /* rank */ return new String[] { "positiveInt" };
    case -991726143:
      /* period */ return new String[] { "Period" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("system")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.system");
    } else if (name.equals("value")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.value");
    } else if (name.equals("use")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.use");
    } else if (name.equals("rank")) {
      throw new FHIRException("Cannot call addChild on a singleton property ContactPoint.rank");
    } else if (name.equals("period")) {
      this.period = new Period();
      return this.period;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "ContactPoint";

  }

  public ContactPoint copy() {
    ContactPoint dst = new ContactPoint();
    copyValues(dst);
    return dst;
  }

  public void copyValues(ContactPoint dst) {
    super.copyValues(dst);
    dst.system = system == null ? null : system.copy();
    dst.value = value == null ? null : value.copy();
    dst.use = use == null ? null : use.copy();
    dst.rank = rank == null ? null : rank.copy();
    dst.period = period == null ? null : period.copy();
  }

  protected ContactPoint typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof ContactPoint))
      return false;
    ContactPoint o = (ContactPoint) other_;
    return compareDeep(system, o.system, true) && compareDeep(value, o.value, true) && compareDeep(use, o.use, true)
        && compareDeep(rank, o.rank, true) && compareDeep(period, o.period, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof ContactPoint))
      return false;
    ContactPoint o = (ContactPoint) other_;
    return compareValues(system, o.system, true) && compareValues(value, o.value, true)
        && compareValues(use, o.use, true) && compareValues(rank, o.rank, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(system, value, use, rank, period);
  }

}
