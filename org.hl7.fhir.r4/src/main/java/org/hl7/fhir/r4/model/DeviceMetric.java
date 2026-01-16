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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * Describes a measurement, calculation or setting capability of a medical
 * device.
 */
@ResourceDef(name = "DeviceMetric", profile = "http://hl7.org/fhir/StructureDefinition/DeviceMetric")
public class DeviceMetric extends DomainResource {
  @Block()
  public static class DeviceMetricCalibrationComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Describes the type of the calibration method.
     */
    @Child(name = "type", type = { StringType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "unspecified | offset | gain | two-point", formalDefinition = "Describes the type of the calibration method.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-calibration-type")
    protected StringType type;

    /**
     * Describes the state of the calibration.
     */
    @Child(name = "state", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "not-calibrated | calibration-required | calibrated | unspecified", formalDefinition = "Describes the state of the calibration.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-calibration-state")
    protected StringType state;

    /**
     * Describes the time last calibration has been performed.
     */
    @Child(name = "time", type = { InstantType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Describes the time last calibration has been performed", formalDefinition = "Describes the time last calibration has been performed.")
    protected InstantType time;

    private static final long serialVersionUID = 1163986578L;

    /**
     * Constructor
     */
    public DeviceMetricCalibrationComponent() {
      super();
    }

    /**
     * @return {@link #type} (Describes the type of the calibration method.). This
     *         is the underlying object with id, value and extensions. The accessor
     *         "getType" gives direct access to the value
     */
    public StringType getTypeElement() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new StringType(); // bb
      return this.type;
    }

    public boolean hasTypeElement() {
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Describes the type of the calibration method.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getType" gives direct access to the value
     */
    public DeviceMetricCalibrationComponent setTypeElement(StringType value) {
      this.type = value;
      return this;
    }

    /**
     * @return Describes the type of the calibration method.
     */
    public String getType() {
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Describes the type of the calibration method.
     */
    public DeviceMetricCalibrationComponent setType(String value) {
      if (value == null)
        this.type = null;
      else {
        if (this.type == null)
          this.type = new StringType();
        this.type.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #state} (Describes the state of the calibration.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getState" gives direct access to the value
     */
    public StringType getStateElement() {
      if (this.state == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.state");
        else if (Configuration.doAutoCreate())
          this.state = new StringType(); // bb
      return this.state;
    }

    public boolean hasStateElement() {
      return this.state != null && !this.state.isEmpty();
    }

    public boolean hasState() {
      return this.state != null && !this.state.isEmpty();
    }

    /**
     * @param value {@link #state} (Describes the state of the calibration.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getState" gives direct access to the value
     */
    public DeviceMetricCalibrationComponent setStateElement(StringType value) {
      this.state = value;
      return this;
    }

    /**
     * @return Describes the state of the calibration.
     */
    public String getState() {
      return this.state == null ? null : this.state.getValue();
    }

    /**
     * @param value Describes the state of the calibration.
     */
    public DeviceMetricCalibrationComponent setState(String value) {
      if (value == null)
        this.state = null;
      else {
        if (this.state == null)
          this.state = new StringType();
        this.state.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #time} (Describes the time last calibration has been
     *         performed.). This is the underlying object with id, value and
     *         extensions. The accessor "getTime" gives direct access to the value
     */
    public InstantType getTimeElement() {
      if (this.time == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.time");
        else if (Configuration.doAutoCreate())
          this.time = new InstantType(); // bb
      return this.time;
    }

    public boolean hasTimeElement() {
      return this.time != null && !this.time.isEmpty();
    }

    public boolean hasTime() {
      return this.time != null && !this.time.isEmpty();
    }

    /**
     * @param value {@link #time} (Describes the time last calibration has been
     *              performed.). This is the underlying object with id, value and
     *              extensions. The accessor "getTime" gives direct access to the
     *              value
     */
    public DeviceMetricCalibrationComponent setTimeElement(InstantType value) {
      this.time = value;
      return this;
    }

    /**
     * @return Describes the time last calibration has been performed.
     */
    public Date getTime() {
      return this.time == null ? null : this.time.getValue();
    }

    /**
     * @param value Describes the time last calibration has been performed.
     */
    public DeviceMetricCalibrationComponent setTime(Date value) {
      if (value == null)
        this.time = null;
      else {
        if (this.time == null)
          this.time = new InstantType();
        this.time.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("type", "string", "Describes the type of the calibration method.", 0, 1, type));
      children.add(new Property("state", "string", "Describes the state of the calibration.", 0, 1, state));
      children
          .add(new Property("time", "instant", "Describes the time last calibration has been performed.", 0, 1, time));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "string", "Describes the type of the calibration method.", 0, 1, type);
      case 109757585:
        /* state */ return new Property("state", "string", "Describes the state of the calibration.", 0, 1, state);
      case 3560141:
        /* time */ return new Property("time", "instant", "Describes the time last calibration has been performed.", 0,
            1, time);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // StringType
      case 109757585:
        /* state */ return this.state == null ? new Base[0] : new Base[] { this.state }; // StringType
      case 3560141:
        /* time */ return this.time == null ? new Base[0] : new Base[] { this.time }; // InstantType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToString(value); // StringType
        return value;
      case 109757585: // state
        this.state = castToString(value); // StringType
        return value;
      case 3560141: // time
        this.time = castToInstant(value); // InstantType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToString(value); // StringType
      } else if (name.equals("state")) {
        this.state = castToString(value); // StringType
      } else if (name.equals("time")) {
        this.time = castToInstant(value); // InstantType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("state")) {
        this.state = null;
      } else if (name.equals("time")) {
        this.time = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getTypeElement();
      case 109757585:
        return getStateElement();
      case 3560141:
        return getTimeElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "string" };
      case 109757585:
        /* state */ return new String[] { "string" };
      case 3560141:
        /* time */ return new String[] { "instant" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.type");
      } else if (name.equals("state")) {
        throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.state");
      } else if (name.equals("time")) {
        throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.time");
      } else
        return super.addChild(name);
    }

    public DeviceMetricCalibrationComponent copy() {
      DeviceMetricCalibrationComponent dst = new DeviceMetricCalibrationComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(DeviceMetricCalibrationComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.state = state == null ? null : state.copy();
      dst.time = time == null ? null : time.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof DeviceMetricCalibrationComponent))
        return false;
      DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(state, o.state, true) && compareDeep(time, o.time, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof DeviceMetricCalibrationComponent))
        return false;
      DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other_;
      return compareValues(type, o.type, true) && compareValues(state, o.state, true)
          && compareValues(time, o.time, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, state, time);
    }

    public String fhirType() {
      return "DeviceMetric.calibration";

    }

  }

  /**
   * Unique instance identifiers assigned to a device by the device or gateway
   * software, manufacturers, other organizations or owners. For example: handle
   * ID.
   */
  @Child(name = "identifier", type = {
      Identifier.class }, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Instance identifier", formalDefinition = "Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.")
  protected List<Identifier> identifier;

  /**
   * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
   */
  @Child(name = "type", type = { CodeableConcept.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Identity of metric, for example Heart Rate or PEEP Setting", formalDefinition = "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/devicemetric-type")
  protected CodeableConcept type;

  /**
   * Describes the unit that an observed value determined for this metric will
   * have. For example: Percent, Seconds, etc.
   */
  @Child(name = "unit", type = { CodeableConcept.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Unit of Measure for the Metric", formalDefinition = "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/devicemetric-type")
  protected CodeableConcept unit;

  /**
   * Describes the link to the Device that this DeviceMetric belongs to and that
   * contains administrative device information such as manufacturer, serial
   * number, etc.
   */
  @Child(name = "source", type = { Device.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Describes the link to the source Device", formalDefinition = "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.")
  protected Reference source;

  /**
   * The actual object that is the target of the reference (Describes the link to
   * the Device that this DeviceMetric belongs to and that contains administrative
   * device information such as manufacturer, serial number, etc.)
   */
  protected Device sourceTarget;

  /**
   * Describes the link to the Device that this DeviceMetric belongs to and that
   * provide information about the location of this DeviceMetric in the
   * containment structure of the parent Device. An example would be a Device that
   * represents a Channel. This reference can be used by a client application to
   * distinguish DeviceMetrics that have the same type, but should be interpreted
   * based on their containment location.
   */
  @Child(name = "parent", type = { Device.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Describes the link to the parent Device", formalDefinition = "Describes the link to the  Device that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.")
  protected Reference parent;

  /**
   * The actual object that is the target of the reference (Describes the link to
   * the Device that this DeviceMetric belongs to and that provide information
   * about the location of this DeviceMetric in the containment structure of the
   * parent Device. An example would be a Device that represents a Channel. This
   * reference can be used by a client application to distinguish DeviceMetrics
   * that have the same type, but should be interpreted based on their containment
   * location.)
   */
  protected Device parentTarget;

  /**
   * Indicates current operational state of the device. For example: On, Off,
   * Standby, etc.
   */
  @Child(name = "operationalStatus", type = {
    StringType.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "on | off | standby | entered-in-error", formalDefinition = "Indicates current operational state of the device. For example: On, Off, Standby, etc.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-operational-status")
  protected StringType operationalStatus;

  /**
   * Describes the color representation for the metric. This is often used to aid
   * clinicians to track and identify parameter types by color. In practice,
   * consider a Patient Monitor that has ECG/HR and Pleth for example; the
   * parameters are displayed in different characteristic colors, such as HR-blue,
   * BP-green, and PR and SpO2- magenta.
   */
  @Child(name = "color", type = { StringType.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "black | red | green | yellow | blue | magenta | cyan | white", formalDefinition = "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-color")
  protected StringType color;

  /**
   * Indicates the category of the observation generation process. A DeviceMetric
   * can be for example a setting, measurement, or calculation.
   */
  @Child(name = "category", type = { StringType.class }, order = 7, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "measurement | setting | calculation | unspecified", formalDefinition = "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-category")
  protected StringType category;

  /**
   * Describes the measurement repetition time. This is not necessarily the same
   * as the update period. The measurement repetition time can range from
   * milliseconds up to hours. An example for a measurement repetition time in the
   * range of milliseconds is the sampling rate of an ECG. An example for a
   * measurement repetition time in the range of hours is a NIBP that is triggered
   * automatically every hour. The update period may be different than the
   * measurement repetition time, if the device does not update the published
   * observed value with the same frequency as it was measured.
   */
  @Child(name = "measurementPeriod", type = {
      Timing.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Describes the measurement repetition time", formalDefinition = "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.")
  protected Timing measurementPeriod;

  /**
   * Describes the calibrations that have been performed or that are required to
   * be performed.
   */
  @Child(name = "calibration", type = {}, order = 9, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Describes the calibrations that have been performed or that are required to be performed", formalDefinition = "Describes the calibrations that have been performed or that are required to be performed.")
  protected List<DeviceMetricCalibrationComponent> calibration;

  private static final long serialVersionUID = 1309955219L;

  /**
   * Constructor
   */
  public DeviceMetric() {
    super();
  }

  /**
   * Constructor
   */
  public DeviceMetric(CodeableConcept type, StringType category) {
    super();
    this.type = type;
    this.category = category;
  }

  /**
   * @return {@link #identifier} (Unique instance identifiers assigned to a device
   *         by the device or gateway software, manufacturers, other organizations
   *         or owners. For example: handle ID.)
   */
  public List<Identifier> getIdentifier() {
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    return this.identifier;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public DeviceMetric setIdentifier(List<Identifier> theIdentifier) {
    this.identifier = theIdentifier;
    return this;
  }

  public boolean hasIdentifier() {
    if (this.identifier == null)
      return false;
    for (Identifier item : this.identifier)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public Identifier addIdentifier() { // 3
    Identifier t = new Identifier();
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return t;
  }

  public DeviceMetric addIdentifier(Identifier t) { // 3
    if (t == null)
      return this;
    if (this.identifier == null)
      this.identifier = new ArrayList<Identifier>();
    this.identifier.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #identifier}, creating
   *         it if it does not already exist
   */
  public Identifier getIdentifierFirstRep() {
    if (getIdentifier().isEmpty()) {
      addIdentifier();
    }
    return getIdentifier().get(0);
  }

  /**
   * @return {@link #type} (Describes the type of the metric. For example: Heart
   *         Rate, PEEP Setting, etc.)
   */
  public CodeableConcept getType() {
    if (this.type == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.type");
      else if (Configuration.doAutoCreate())
        this.type = new CodeableConcept(); // cc
    return this.type;
  }

  public boolean hasType() {
    return this.type != null && !this.type.isEmpty();
  }

  /**
   * @param value {@link #type} (Describes the type of the metric. For example:
   *              Heart Rate, PEEP Setting, etc.)
   */
  public DeviceMetric setType(CodeableConcept value) {
    this.type = value;
    return this;
  }

  /**
   * @return {@link #unit} (Describes the unit that an observed value determined
   *         for this metric will have. For example: Percent, Seconds, etc.)
   */
  public CodeableConcept getUnit() {
    if (this.unit == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.unit");
      else if (Configuration.doAutoCreate())
        this.unit = new CodeableConcept(); // cc
    return this.unit;
  }

  public boolean hasUnit() {
    return this.unit != null && !this.unit.isEmpty();
  }

  /**
   * @param value {@link #unit} (Describes the unit that an observed value
   *              determined for this metric will have. For example: Percent,
   *              Seconds, etc.)
   */
  public DeviceMetric setUnit(CodeableConcept value) {
    this.unit = value;
    return this;
  }

  /**
   * @return {@link #source} (Describes the link to the Device that this
   *         DeviceMetric belongs to and that contains administrative device
   *         information such as manufacturer, serial number, etc.)
   */
  public Reference getSource() {
    if (this.source == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.source");
      else if (Configuration.doAutoCreate())
        this.source = new Reference(); // cc
    return this.source;
  }

  public boolean hasSource() {
    return this.source != null && !this.source.isEmpty();
  }

  /**
   * @param value {@link #source} (Describes the link to the Device that this
   *              DeviceMetric belongs to and that contains administrative device
   *              information such as manufacturer, serial number, etc.)
   */
  public DeviceMetric setSource(Reference value) {
    this.source = value;
    return this;
  }

  /**
   * @return {@link #source} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (Describes the link to
   *         the Device that this DeviceMetric belongs to and that contains
   *         administrative device information such as manufacturer, serial
   *         number, etc.)
   */
  public Device getSourceTarget() {
    if (this.sourceTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.source");
      else if (Configuration.doAutoCreate())
        this.sourceTarget = new Device(); // aa
    return this.sourceTarget;
  }

  /**
   * @param value {@link #source} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (Describes the
   *              link to the Device that this DeviceMetric belongs to and that
   *              contains administrative device information such as manufacturer,
   *              serial number, etc.)
   */
  public DeviceMetric setSourceTarget(Device value) {
    this.sourceTarget = value;
    return this;
  }

  /**
   * @return {@link #parent} (Describes the link to the Device that this
   *         DeviceMetric belongs to and that provide information about the
   *         location of this DeviceMetric in the containment structure of the
   *         parent Device. An example would be a Device that represents a
   *         Channel. This reference can be used by a client application to
   *         distinguish DeviceMetrics that have the same type, but should be
   *         interpreted based on their containment location.)
   */
  public Reference getParent() {
    if (this.parent == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.parent");
      else if (Configuration.doAutoCreate())
        this.parent = new Reference(); // cc
    return this.parent;
  }

  public boolean hasParent() {
    return this.parent != null && !this.parent.isEmpty();
  }

  /**
   * @param value {@link #parent} (Describes the link to the Device that this
   *              DeviceMetric belongs to and that provide information about the
   *              location of this DeviceMetric in the containment structure of
   *              the parent Device. An example would be a Device that represents
   *              a Channel. This reference can be used by a client application to
   *              distinguish DeviceMetrics that have the same type, but should be
   *              interpreted based on their containment location.)
   */
  public DeviceMetric setParent(Reference value) {
    this.parent = value;
    return this;
  }

  /**
   * @return {@link #parent} The actual object that is the target of the
   *         reference. The reference library doesn't populate this, but you can
   *         use it to hold the resource if you resolve it. (Describes the link to
   *         the Device that this DeviceMetric belongs to and that provide
   *         information about the location of this DeviceMetric in the
   *         containment structure of the parent Device. An example would be a
   *         Device that represents a Channel. This reference can be used by a
   *         client application to distinguish DeviceMetrics that have the same
   *         type, but should be interpreted based on their containment location.)
   */
  public Device getParentTarget() {
    if (this.parentTarget == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.parent");
      else if (Configuration.doAutoCreate())
        this.parentTarget = new Device(); // aa
    return this.parentTarget;
  }

  /**
   * @param value {@link #parent} The actual object that is the target of the
   *              reference. The reference library doesn't use these, but you can
   *              use it to hold the resource if you resolve it. (Describes the
   *              link to the Device that this DeviceMetric belongs to and that
   *              provide information about the location of this DeviceMetric in
   *              the containment structure of the parent Device. An example would
   *              be a Device that represents a Channel. This reference can be
   *              used by a client application to distinguish DeviceMetrics that
   *              have the same type, but should be interpreted based on their
   *              containment location.)
   */
  public DeviceMetric setParentTarget(Device value) {
    this.parentTarget = value;
    return this;
  }

  /**
   * @return {@link #operationalStatus} (Indicates current operational state of
   *         the device. For example: On, Off, Standby, etc.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getOperationalStatus" gives direct access to the value
   */
  public StringType getOperationalStatusElement() {
    if (this.operationalStatus == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.operationalStatus");
      else if (Configuration.doAutoCreate())
        this.operationalStatus = new StringType(); // bb
    return this.operationalStatus;
  }

  public boolean hasOperationalStatusElement() {
    return this.operationalStatus != null && !this.operationalStatus.isEmpty();
  }

  public boolean hasOperationalStatus() {
    return this.operationalStatus != null && !this.operationalStatus.isEmpty();
  }

  /**
   * @param value {@link #operationalStatus} (Indicates current operational state
   *              of the device. For example: On, Off, Standby, etc.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getOperationalStatus" gives direct access to the value
   */
  public DeviceMetric setOperationalStatusElement(StringType value) {
    this.operationalStatus = value;
    return this;
  }

  /**
   * @return Indicates current operational state of the device. For example: On,
   *         Off, Standby, etc.
   */
  public String getOperationalStatus() {
    return this.operationalStatus == null ? null : this.operationalStatus.getValue();
  }

  /**
   * @param value Indicates current operational state of the device. For example:
   *              On, Off, Standby, etc.
   */
  public DeviceMetric setOperationalStatus(String value) {
    if (value == null)
      this.operationalStatus = null;
    else {
      if (this.operationalStatus == null)
        this.operationalStatus = new StringType();
      this.operationalStatus.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #color} (Describes the color representation for the metric.
   *         This is often used to aid clinicians to track and identify parameter
   *         types by color. In practice, consider a Patient Monitor that has
   *         ECG/HR and Pleth for example; the parameters are displayed in
   *         different characteristic colors, such as HR-blue, BP-green, and PR
   *         and SpO2- magenta.). This is the underlying object with id, value and
   *         extensions. The accessor "getColor" gives direct access to the value
   */
  public StringType getColorElement() {
    if (this.color == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.color");
      else if (Configuration.doAutoCreate())
        this.color = new StringType(); // bb
    return this.color;
  }

  public boolean hasColorElement() {
    return this.color != null && !this.color.isEmpty();
  }

  public boolean hasColor() {
    return this.color != null && !this.color.isEmpty();
  }

  /**
   * @param value {@link #color} (Describes the color representation for the
   *              metric. This is often used to aid clinicians to track and
   *              identify parameter types by color. In practice, consider a
   *              Patient Monitor that has ECG/HR and Pleth for example; the
   *              parameters are displayed in different characteristic colors,
   *              such as HR-blue, BP-green, and PR and SpO2- magenta.). This is
   *              the underlying object with id, value and extensions. The
   *              accessor "getColor" gives direct access to the value
   */
  public DeviceMetric setColorElement(StringType value) {
    this.color = value;
    return this;
  }

  /**
   * @return Describes the color representation for the metric. This is often used
   *         to aid clinicians to track and identify parameter types by color. In
   *         practice, consider a Patient Monitor that has ECG/HR and Pleth for
   *         example; the parameters are displayed in different characteristic
   *         colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
   */
  public String getColor() {
    return this.color == null ? null : this.color.getValue();
  }

  /**
   * @param value Describes the color representation for the metric. This is often
   *              used to aid clinicians to track and identify parameter types by
   *              color. In practice, consider a Patient Monitor that has ECG/HR
   *              and Pleth for example; the parameters are displayed in different
   *              characteristic colors, such as HR-blue, BP-green, and PR and
   *              SpO2- magenta.
   */
  public DeviceMetric setColor(String value) {
    if (value == null)
      this.color = null;
    else {
      if (this.color == null)
        this.color = new StringType();
      this.color.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #category} (Indicates the category of the observation
   *         generation process. A DeviceMetric can be for example a setting,
   *         measurement, or calculation.). This is the underlying object with id,
   *         value and extensions. The accessor "getCategory" gives direct access
   *         to the value
   */
  public StringType getCategoryElement() {
    if (this.category == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.category");
      else if (Configuration.doAutoCreate())
        this.category = new StringType(); // bb
    return this.category;
  }

  public boolean hasCategoryElement() {
    return this.category != null && !this.category.isEmpty();
  }

  public boolean hasCategory() {
    return this.category != null && !this.category.isEmpty();
  }

  /**
   * @param value {@link #category} (Indicates the category of the observation
   *              generation process. A DeviceMetric can be for example a setting,
   *              measurement, or calculation.). This is the underlying object
   *              with id, value and extensions. The accessor "getCategory" gives
   *              direct access to the value
   */
  public DeviceMetric setCategoryElement(StringType value) {
    this.category = value;
    return this;
  }

  /**
   * @return Indicates the category of the observation generation process. A
   *         DeviceMetric can be for example a setting, measurement, or
   *         calculation.
   */
  public String getCategory() {
    return this.category == null ? null : this.category.getValue();
  }

  /**
   * @param value Indicates the category of the observation generation process. A
   *              DeviceMetric can be for example a setting, measurement, or
   *              calculation.
   */
  public DeviceMetric setCategory(String value) {
    if (this.category == null)
      this.category = new StringType();
    this.category.setValue(value);
    return this;
  }

  /**
   * @return {@link #measurementPeriod} (Describes the measurement repetition
   *         time. This is not necessarily the same as the update period. The
   *         measurement repetition time can range from milliseconds up to hours.
   *         An example for a measurement repetition time in the range of
   *         milliseconds is the sampling rate of an ECG. An example for a
   *         measurement repetition time in the range of hours is a NIBP that is
   *         triggered automatically every hour. The update period may be
   *         different than the measurement repetition time, if the device does
   *         not update the published observed value with the same frequency as it
   *         was measured.)
   */
  public Timing getMeasurementPeriod() {
    if (this.measurementPeriod == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create DeviceMetric.measurementPeriod");
      else if (Configuration.doAutoCreate())
        this.measurementPeriod = new Timing(); // cc
    return this.measurementPeriod;
  }

  public boolean hasMeasurementPeriod() {
    return this.measurementPeriod != null && !this.measurementPeriod.isEmpty();
  }

  /**
   * @param value {@link #measurementPeriod} (Describes the measurement repetition
   *              time. This is not necessarily the same as the update period. The
   *              measurement repetition time can range from milliseconds up to
   *              hours. An example for a measurement repetition time in the range
   *              of milliseconds is the sampling rate of an ECG. An example for a
   *              measurement repetition time in the range of hours is a NIBP that
   *              is triggered automatically every hour. The update period may be
   *              different than the measurement repetition time, if the device
   *              does not update the published observed value with the same
   *              frequency as it was measured.)
   */
  public DeviceMetric setMeasurementPeriod(Timing value) {
    this.measurementPeriod = value;
    return this;
  }

  /**
   * @return {@link #calibration} (Describes the calibrations that have been
   *         performed or that are required to be performed.)
   */
  public List<DeviceMetricCalibrationComponent> getCalibration() {
    if (this.calibration == null)
      this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
    return this.calibration;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public DeviceMetric setCalibration(List<DeviceMetricCalibrationComponent> theCalibration) {
    this.calibration = theCalibration;
    return this;
  }

  public boolean hasCalibration() {
    if (this.calibration == null)
      return false;
    for (DeviceMetricCalibrationComponent item : this.calibration)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public DeviceMetricCalibrationComponent addCalibration() { // 3
    DeviceMetricCalibrationComponent t = new DeviceMetricCalibrationComponent();
    if (this.calibration == null)
      this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
    this.calibration.add(t);
    return t;
  }

  public DeviceMetric addCalibration(DeviceMetricCalibrationComponent t) { // 3
    if (t == null)
      return this;
    if (this.calibration == null)
      this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
    this.calibration.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #calibration},
   *         creating it if it does not already exist
   */
  public DeviceMetricCalibrationComponent getCalibrationFirstRep() {
    if (getCalibration().isEmpty()) {
      addCalibration();
    }
    return getCalibration().get(0);
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("identifier", "Identifier",
        "Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.",
        0, java.lang.Integer.MAX_VALUE, identifier));
    children.add(new Property("type", "CodeableConcept",
        "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.", 0, 1, type));
    children.add(new Property("unit", "CodeableConcept",
        "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.",
        0, 1, unit));
    children.add(new Property("source", "Reference(Device)",
        "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.",
        0, 1, source));
    children.add(new Property("parent", "Reference(Device)",
        "Describes the link to the  Device that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.",
        0, 1, parent));
    children.add(new Property("operationalStatus", "string",
        "Indicates current operational state of the device. For example: On, Off, Standby, etc.", 0, 1,
        operationalStatus));
    children.add(new Property("color", "string",
        "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.",
        0, 1, color));
    children.add(new Property("category", "string",
        "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.",
        0, 1, category));
    children.add(new Property("measurementPeriod", "Timing",
        "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.",
        0, 1, measurementPeriod));
    children.add(new Property("calibration", "",
        "Describes the calibrations that have been performed or that are required to be performed.", 0,
        java.lang.Integer.MAX_VALUE, calibration));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case -1618432855:
      /* identifier */ return new Property("identifier", "Identifier",
          "Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or owners. For example: handle ID.",
          0, java.lang.Integer.MAX_VALUE, identifier);
    case 3575610:
      /* type */ return new Property("type", "CodeableConcept",
          "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.", 0, 1, type);
    case 3594628:
      /* unit */ return new Property("unit", "CodeableConcept",
          "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.",
          0, 1, unit);
    case -896505829:
      /* source */ return new Property("source", "Reference(Device)",
          "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.",
          0, 1, source);
    case -995424086:
      /* parent */ return new Property("parent", "Reference(Device)",
          "Describes the link to the  Device that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.",
          0, 1, parent);
    case -2103166364:
      /* operationalStatus */ return new Property("operationalStatus", "string",
          "Indicates current operational state of the device. For example: On, Off, Standby, etc.", 0, 1,
          operationalStatus);
    case 94842723:
      /* color */ return new Property("color", "string",
          "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.",
          0, 1, color);
    case 50511102:
      /* category */ return new Property("category", "string",
          "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.",
          0, 1, category);
    case -1300332387:
      /* measurementPeriod */ return new Property("measurementPeriod", "Timing",
          "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.",
          0, 1, measurementPeriod);
    case 1421318634:
      /* calibration */ return new Property("calibration", "",
          "Describes the calibrations that have been performed or that are required to be performed.", 0,
          java.lang.Integer.MAX_VALUE, calibration);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return this.identifier == null ? new Base[0]
          : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
    case 3575610:
      /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeableConcept
    case 3594628:
      /* unit */ return this.unit == null ? new Base[0] : new Base[] { this.unit }; // CodeableConcept
    case -896505829:
      /* source */ return this.source == null ? new Base[0] : new Base[] { this.source }; // Reference
    case -995424086:
      /* parent */ return this.parent == null ? new Base[0] : new Base[] { this.parent }; // Reference
    case -2103166364:
      /* operationalStatus */ return this.operationalStatus == null ? new Base[0]
          : new Base[] { this.operationalStatus }; // StringType
    case 94842723:
      /* color */ return this.color == null ? new Base[0] : new Base[] { this.color }; // StringType
    case 50511102:
      /* category */ return this.category == null ? new Base[0] : new Base[] { this.category }; // StringType
    case -1300332387:
      /* measurementPeriod */ return this.measurementPeriod == null ? new Base[0]
          : new Base[] { this.measurementPeriod }; // Timing
    case 1421318634:
      /* calibration */ return this.calibration == null ? new Base[0]
          : this.calibration.toArray(new Base[this.calibration.size()]); // DeviceMetricCalibrationComponent
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case -1618432855: // identifier
      this.getIdentifier().add(castToIdentifier(value)); // Identifier
      return value;
    case 3575610: // type
      this.type = castToCodeableConcept(value); // CodeableConcept
      return value;
    case 3594628: // unit
      this.unit = castToCodeableConcept(value); // CodeableConcept
      return value;
    case -896505829: // source
      this.source = castToReference(value); // Reference
      return value;
    case -995424086: // parent
      this.parent = castToReference(value); // Reference
      return value;
    case -2103166364: // operationalStatus
      this.operationalStatus = castToString(value); // StringType
      return value;
    case 94842723: // color
      this.color = castToString(value); // StringType
      return value;
    case 50511102: // category
      this.category = castToString(value); // StringType
      return value;
    case -1300332387: // measurementPeriod
      this.measurementPeriod = castToTiming(value); // Timing
      return value;
    case 1421318634: // calibration
      this.getCalibration().add((DeviceMetricCalibrationComponent) value); // DeviceMetricCalibrationComponent
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().add(castToIdentifier(value));
    } else if (name.equals("type")) {
      this.type = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("unit")) {
      this.unit = castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("source")) {
      this.source = castToReference(value); // Reference
    } else if (name.equals("parent")) {
      this.parent = castToReference(value); // Reference
    } else if (name.equals("operationalStatus")) {
      this.operationalStatus = castToString(value); // StringType
    } else if (name.equals("color")) {
      this.color = castToString(value); // StringType
    } else if (name.equals("category")) {
      this.category = castToString(value); // StringType
    } else if (name.equals("measurementPeriod")) {
      this.measurementPeriod = castToTiming(value); // Timing
    } else if (name.equals("calibration")) {
      this.getCalibration().add((DeviceMetricCalibrationComponent) value);
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("identifier")) {
      this.getIdentifier().remove(castToIdentifier(value));
    } else if (name.equals("type")) {
      this.type = null;
    } else if (name.equals("unit")) {
      this.unit = null;
    } else if (name.equals("source")) {
      this.source = null;
    } else if (name.equals("parent")) {
      this.parent = null;
    } else if (name.equals("operationalStatus")) {
      this.operationalStatus = null;
    } else if (name.equals("color")) {
      this.color = null;
    } else if (name.equals("category")) {
      this.category = null;
    } else if (name.equals("measurementPeriod")) {
      this.measurementPeriod = null;
    } else if (name.equals("calibration")) {
      this.getCalibration().remove((DeviceMetricCalibrationComponent) value);
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      return addIdentifier();
    case 3575610:
      return getType();
    case 3594628:
      return getUnit();
    case -896505829:
      return getSource();
    case -995424086:
      return getParent();
    case -2103166364:
      return getOperationalStatusElement();
    case 94842723:
      return getColorElement();
    case 50511102:
      return getCategoryElement();
    case -1300332387:
      return getMeasurementPeriod();
    case 1421318634:
      return addCalibration();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case -1618432855:
      /* identifier */ return new String[] { "Identifier" };
    case 3575610:
      /* type */ return new String[] { "CodeableConcept" };
    case 3594628:
      /* unit */ return new String[] { "CodeableConcept" };
    case -896505829:
      /* source */ return new String[] { "Reference" };
    case -995424086:
      /* parent */ return new String[] { "Reference" };
    case -2103166364:
      /* operationalStatus */ return new String[] { "string" };
    case 94842723:
      /* color */ return new String[] { "string" };
    case 50511102:
      /* category */ return new String[] { "string" };
    case -1300332387:
      /* measurementPeriod */ return new String[] { "Timing" };
    case 1421318634:
      /* calibration */ return new String[] {};
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("identifier")) {
      return addIdentifier();
    } else if (name.equals("type")) {
      this.type = new CodeableConcept();
      return this.type;
    } else if (name.equals("unit")) {
      this.unit = new CodeableConcept();
      return this.unit;
    } else if (name.equals("source")) {
      this.source = new Reference();
      return this.source;
    } else if (name.equals("parent")) {
      this.parent = new Reference();
      return this.parent;
    } else if (name.equals("operationalStatus")) {
      throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.operationalStatus");
    } else if (name.equals("color")) {
      throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.color");
    } else if (name.equals("category")) {
      throw new FHIRException("Cannot call addChild on a singleton property DeviceMetric.category");
    } else if (name.equals("measurementPeriod")) {
      this.measurementPeriod = new Timing();
      return this.measurementPeriod;
    } else if (name.equals("calibration")) {
      return addCalibration();
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "DeviceMetric";

  }

  public DeviceMetric copy() {
    DeviceMetric dst = new DeviceMetric();
    copyValues(dst);
    return dst;
  }

  public void copyValues(DeviceMetric dst) {
    super.copyValues(dst);
    if (identifier != null) {
      dst.identifier = new ArrayList<Identifier>();
      for (Identifier i : identifier)
        dst.identifier.add(i.copy());
    }
    ;
    dst.type = type == null ? null : type.copy();
    dst.unit = unit == null ? null : unit.copy();
    dst.source = source == null ? null : source.copy();
    dst.parent = parent == null ? null : parent.copy();
    dst.operationalStatus = operationalStatus == null ? null : operationalStatus.copy();
    dst.color = color == null ? null : color.copy();
    dst.category = category == null ? null : category.copy();
    dst.measurementPeriod = measurementPeriod == null ? null : measurementPeriod.copy();
    if (calibration != null) {
      dst.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
      for (DeviceMetricCalibrationComponent i : calibration)
        dst.calibration.add(i.copy());
    }
    ;
  }

  protected DeviceMetric typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof DeviceMetric))
      return false;
    DeviceMetric o = (DeviceMetric) other_;
    return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true)
        && compareDeep(unit, o.unit, true) && compareDeep(source, o.source, true) && compareDeep(parent, o.parent, true)
        && compareDeep(operationalStatus, o.operationalStatus, true) && compareDeep(color, o.color, true)
        && compareDeep(category, o.category, true) && compareDeep(measurementPeriod, o.measurementPeriod, true)
        && compareDeep(calibration, o.calibration, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof DeviceMetric))
      return false;
    DeviceMetric o = (DeviceMetric) other_;
    return compareValues(operationalStatus, o.operationalStatus, true) && compareValues(color, o.color, true)
        && compareValues(category, o.category, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, unit, source, parent,
        operationalStatus, color, category, measurementPeriod, calibration);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DeviceMetric;
  }

  /**
   * Search parameter: <b>parent</b>
   * <p>
   * Description: <b>The parent DeviceMetric resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceMetric.parent</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "parent", path = "DeviceMetric.parent", description = "The parent DeviceMetric resource", type = "reference", target = {
      Device.class })
  public static final String SP_PARENT = "parent";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>parent</b>
   * <p>
   * Description: <b>The parent DeviceMetric resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceMetric.parent</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PARENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_PARENT);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceMetric:parent</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PARENT = new ca.uhn.fhir.model.api.Include(
      "DeviceMetric:parent").toLocked();

  /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the metric</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "identifier", path = "DeviceMetric.identifier", description = "The identifier of the metric", type = "token")
  public static final String SP_IDENTIFIER = "identifier";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the metric</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_IDENTIFIER);

  /**
   * Search parameter: <b>source</b>
   * <p>
   * Description: <b>The device resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceMetric.source</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "source", path = "DeviceMetric.source", description = "The device resource", type = "reference", target = {
      Device.class })
  public static final String SP_SOURCE = "source";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>source</b>
   * <p>
   * Description: <b>The device resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceMetric.source</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SOURCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_SOURCE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceMetric:source</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SOURCE = new ca.uhn.fhir.model.api.Include(
      "DeviceMetric:source").toLocked();

  /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>The component type</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "type", path = "DeviceMetric.type", description = "The component type", type = "token")
  public static final String SP_TYPE = "type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>The component type</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_TYPE);

  /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>The category of the metric</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "category", path = "DeviceMetric.category", description = "The category of the metric", type = "token")
  public static final String SP_CATEGORY = "category";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>The category of the metric</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceMetric.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CATEGORY);

}
