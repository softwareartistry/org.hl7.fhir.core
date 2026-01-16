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
import org.hl7.fhir.utilities.Utilities;

import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;

/**
 * A set of rules of how a particular interoperability or standards problem is
 * solved - typically through the use of FHIR resources. This resource is used
 * to gather all the parts of an implementation guide into a logical whole and
 * to publish a computable definition of all the parts.
 */
@ResourceDef(name = "ImplementationGuide", profile = "http://hl7.org/fhir/StructureDefinition/ImplementationGuide")
@ChildOrder(names = { "url", "version", "name", "title", "status", "experimental", "date", "publisher", "contact",
    "description", "useContext", "jurisdiction", "copyright", "packageId", "license", "fhirVersion", "dependsOn",
    "global", "definition", "manifest" })
public class ImplementationGuide extends MetadataResource {

  @Block()
  public static class ImplementationGuideDependsOnComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A canonical reference to the Implementation guide for the dependency.
     */
    @Child(name = "uri", type = { CanonicalType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Identity of the IG that this depends on", formalDefinition = "A canonical reference to the Implementation guide for the dependency.")
    protected CanonicalType uri;

    /**
     * The NPM package name for the Implementation Guide that this IG depends on.
     */
    @Child(name = "packageId", type = { IdType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "NPM Package name for IG this depends on", formalDefinition = "The NPM package name for the Implementation Guide that this IG depends on.")
    protected IdType packageId;

    /**
     * The version of the IG that is depended on, when the correct version is
     * required to understand the IG correctly.
     */
    @Child(name = "version", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Version of the IG", formalDefinition = "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.")
    protected StringType version;

    private static final long serialVersionUID = -215808797L;

    /**
     * Constructor
     */
    public ImplementationGuideDependsOnComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDependsOnComponent(CanonicalType uri) {
      super();
      this.uri = uri;
    }

    /**
     * @return {@link #uri} (A canonical reference to the Implementation guide for
     *         the dependency.). This is the underlying object with id, value and
     *         extensions. The accessor "getUri" gives direct access to the value
     */
    public CanonicalType getUriElement() {
      if (this.uri == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.uri");
        else if (Configuration.doAutoCreate())
          this.uri = new CanonicalType(); // bb
      return this.uri;
    }

    public boolean hasUriElement() {
      return this.uri != null && !this.uri.isEmpty();
    }

    public boolean hasUri() {
      return this.uri != null && !this.uri.isEmpty();
    }

    /**
     * @param value {@link #uri} (A canonical reference to the Implementation guide
     *              for the dependency.). This is the underlying object with id,
     *              value and extensions. The accessor "getUri" gives direct access
     *              to the value
     */
    public ImplementationGuideDependsOnComponent setUriElement(CanonicalType value) {
      this.uri = value;
      return this;
    }

    /**
     * @return A canonical reference to the Implementation guide for the dependency.
     */
    public String getUri() {
      return this.uri == null ? null : this.uri.getValue();
    }

    /**
     * @param value A canonical reference to the Implementation guide for the
     *              dependency.
     */
    public ImplementationGuideDependsOnComponent setUri(String value) {
      if (this.uri == null)
        this.uri = new CanonicalType();
      this.uri.setValue(value);
      return this;
    }

    /**
     * @return {@link #packageId} (The NPM package name for the Implementation Guide
     *         that this IG depends on.). This is the underlying object with id,
     *         value and extensions. The accessor "getPackageId" gives direct access
     *         to the value
     */
    public IdType getPackageIdElement() {
      if (this.packageId == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.packageId");
        else if (Configuration.doAutoCreate())
          this.packageId = new IdType(); // bb
      return this.packageId;
    }

    public boolean hasPackageIdElement() {
      return this.packageId != null && !this.packageId.isEmpty();
    }

    public boolean hasPackageId() {
      return this.packageId != null && !this.packageId.isEmpty();
    }

    /**
     * @param value {@link #packageId} (The NPM package name for the Implementation
     *              Guide that this IG depends on.). This is the underlying object
     *              with id, value and extensions. The accessor "getPackageId" gives
     *              direct access to the value
     */
    public ImplementationGuideDependsOnComponent setPackageIdElement(IdType value) {
      this.packageId = value;
      return this;
    }

    /**
     * @return The NPM package name for the Implementation Guide that this IG
     *         depends on.
     */
    public String getPackageId() {
      return this.packageId == null ? null : this.packageId.getValue();
    }

    /**
     * @param value The NPM package name for the Implementation Guide that this IG
     *              depends on.
     */
    public ImplementationGuideDependsOnComponent setPackageId(String value) {
      if (Utilities.noString(value))
        this.packageId = null;
      else {
        if (this.packageId == null)
          this.packageId = new IdType();
        this.packageId.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #version} (The version of the IG that is depended on, when the
     *         correct version is required to understand the IG correctly.). This is
     *         the underlying object with id, value and extensions. The accessor
     *         "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() {
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDependsOnComponent.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() {
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() {
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The version of the IG that is depended on,
     *              when the correct version is required to understand the IG
     *              correctly.). This is the underlying object with id, value and
     *              extensions. The accessor "getVersion" gives direct access to the
     *              value
     */
    public ImplementationGuideDependsOnComponent setVersionElement(StringType value) {
      this.version = value;
      return this;
    }

    /**
     * @return The version of the IG that is depended on, when the correct version
     *         is required to understand the IG correctly.
     */
    public String getVersion() {
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The version of the IG that is depended on, when the correct
     *              version is required to understand the IG correctly.
     */
    public ImplementationGuideDependsOnComponent setVersion(String value) {
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("uri", "canonical(ImplementationGuide)",
          "A canonical reference to the Implementation guide for the dependency.", 0, 1, uri));
      children.add(new Property("packageId", "id",
          "The NPM package name for the Implementation Guide that this IG depends on.", 0, 1, packageId));
      children.add(new Property("version", "string",
          "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.",
          0, 1, version));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 116076:
        /* uri */ return new Property("uri", "canonical(ImplementationGuide)",
            "A canonical reference to the Implementation guide for the dependency.", 0, 1, uri);
      case 1802060801:
        /* packageId */ return new Property("packageId", "id",
            "The NPM package name for the Implementation Guide that this IG depends on.", 0, 1, packageId);
      case 351608024:
        /* version */ return new Property("version", "string",
            "The version of the IG that is depended on, when the correct version is required to understand the IG correctly.",
            0, 1, version);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 116076:
        /* uri */ return this.uri == null ? new Base[0] : new Base[] { this.uri }; // CanonicalType
      case 1802060801:
        /* packageId */ return this.packageId == null ? new Base[0] : new Base[] { this.packageId }; // IdType
      case 351608024:
        /* version */ return this.version == null ? new Base[0] : new Base[] { this.version }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 116076: // uri
        this.uri = castToCanonical(value); // CanonicalType
        return value;
      case 1802060801: // packageId
        this.packageId = castToId(value); // IdType
        return value;
      case 351608024: // version
        this.version = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("uri")) {
        this.uri = castToCanonical(value); // CanonicalType
      } else if (name.equals("packageId")) {
        this.packageId = castToId(value); // IdType
      } else if (name.equals("version")) {
        this.version = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("uri")) {
        this.uri = null;
      } else if (name.equals("packageId")) {
        this.packageId = null;
      } else if (name.equals("version")) {
        this.version = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 116076:
        return getUriElement();
      case 1802060801:
        return getPackageIdElement();
      case 351608024:
        return getVersionElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 116076:
        /* uri */ return new String[] { "canonical" };
      case 1802060801:
        /* packageId */ return new String[] { "id" };
      case 351608024:
        /* version */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("uri")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.uri");
      } else if (name.equals("packageId")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.packageId");
      } else if (name.equals("version")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.version");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDependsOnComponent copy() {
      ImplementationGuideDependsOnComponent dst = new ImplementationGuideDependsOnComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDependsOnComponent dst) {
      super.copyValues(dst);
      dst.uri = uri == null ? null : uri.copy();
      dst.packageId = packageId == null ? null : packageId.copy();
      dst.version = version == null ? null : version.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDependsOnComponent))
        return false;
      ImplementationGuideDependsOnComponent o = (ImplementationGuideDependsOnComponent) other_;
      return compareDeep(uri, o.uri, true) && compareDeep(packageId, o.packageId, true)
          && compareDeep(version, o.version, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDependsOnComponent))
        return false;
      ImplementationGuideDependsOnComponent o = (ImplementationGuideDependsOnComponent) other_;
      return compareValues(packageId, o.packageId, true) && compareValues(version, o.version, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(uri, packageId, version);
    }

    public String fhirType() {
      return "ImplementationGuide.dependsOn";

    }

  }

  @Block()
  public static class ImplementationGuideGlobalComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * The type of resource that all instances must conform to.
     */
    @Child(name = "type", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Type this profile applies to", formalDefinition = "The type of resource that all instances must conform to.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
    protected CodeType type;

    /**
     * A reference to the profile that all instances must conform to.
     */
    @Child(name = "profile", type = {
        CanonicalType.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Profile that all resources must conform to", formalDefinition = "A reference to the profile that all instances must conform to.")
    protected CanonicalType profile;

    private static final long serialVersionUID = 33894666L;

    /**
     * Constructor
     */
    public ImplementationGuideGlobalComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideGlobalComponent(CodeType type, CanonicalType profile) {
      super();
      this.type = type;
      this.profile = profile;
    }

    /**
     * @return {@link #type} (The type of resource that all instances must conform
     *         to.). This is the underlying object with id, value and extensions.
     *         The accessor "getType" gives direct access to the value
     */
    public CodeType getTypeElement() {
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeType(); // bb
      return this.type;
    }

    public boolean hasTypeElement() {
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() {
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The type of resource that all instances must
     *              conform to.). This is the underlying object with id, value and
     *              extensions. The accessor "getType" gives direct access to the
     *              value
     */
    public ImplementationGuideGlobalComponent setTypeElement(CodeType value) {
      this.type = value;
      return this;
    }

    /**
     * @return The type of resource that all instances must conform to.
     */
    public String getType() {
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value The type of resource that all instances must conform to.
     */
    public ImplementationGuideGlobalComponent setType(String value) {
      if (this.type == null)
        this.type = new CodeType();
      this.type.setValue(value);
      return this;
    }

    /**
     * @return {@link #profile} (A reference to the profile that all instances must
     *         conform to.). This is the underlying object with id, value and
     *         extensions. The accessor "getProfile" gives direct access to the
     *         value
     */
    public CanonicalType getProfileElement() {
      if (this.profile == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideGlobalComponent.profile");
        else if (Configuration.doAutoCreate())
          this.profile = new CanonicalType(); // bb
      return this.profile;
    }

    public boolean hasProfileElement() {
      return this.profile != null && !this.profile.isEmpty();
    }

    public boolean hasProfile() {
      return this.profile != null && !this.profile.isEmpty();
    }

    /**
     * @param value {@link #profile} (A reference to the profile that all instances
     *              must conform to.). This is the underlying object with id, value
     *              and extensions. The accessor "getProfile" gives direct access to
     *              the value
     */
    public ImplementationGuideGlobalComponent setProfileElement(CanonicalType value) {
      this.profile = value;
      return this;
    }

    /**
     * @return A reference to the profile that all instances must conform to.
     */
    public String getProfile() {
      return this.profile == null ? null : this.profile.getValue();
    }

    /**
     * @param value A reference to the profile that all instances must conform to.
     */
    public ImplementationGuideGlobalComponent setProfile(String value) {
      if (this.profile == null)
        this.profile = new CanonicalType();
      this.profile.setValue(value);
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children
          .add(new Property("type", "code", "The type of resource that all instances must conform to.", 0, 1, type));
      children.add(new Property("profile", "canonical(StructureDefinition)",
          "A reference to the profile that all instances must conform to.", 0, 1, profile));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3575610:
        /* type */ return new Property("type", "code", "The type of resource that all instances must conform to.", 0, 1,
            type);
      case -309425751:
        /* profile */ return new Property("profile", "canonical(StructureDefinition)",
            "A reference to the profile that all instances must conform to.", 0, 1, profile);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return this.type == null ? new Base[0] : new Base[] { this.type }; // CodeType
      case -309425751:
        /* profile */ return this.profile == null ? new Base[0] : new Base[] { this.profile }; // CanonicalType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3575610: // type
        this.type = castToCode(value); // CodeType
        return value;
      case -309425751: // profile
        this.profile = castToCanonical(value); // CanonicalType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = castToCode(value); // CodeType
      } else if (name.equals("profile")) {
        this.profile = castToCanonical(value); // CanonicalType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("type")) {
        this.type = null;
      } else if (name.equals("profile")) {
        this.profile = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        return getTypeElement();
      case -309425751:
        return getProfileElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3575610:
        /* type */ return new String[] { "code" };
      case -309425751:
        /* profile */ return new String[] { "canonical" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("type")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.type");
      } else if (name.equals("profile")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.profile");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideGlobalComponent copy() {
      ImplementationGuideGlobalComponent dst = new ImplementationGuideGlobalComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideGlobalComponent dst) {
      super.copyValues(dst);
      dst.type = type == null ? null : type.copy();
      dst.profile = profile == null ? null : profile.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideGlobalComponent))
        return false;
      ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other_;
      return compareDeep(type, o.type, true) && compareDeep(profile, o.profile, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideGlobalComponent))
        return false;
      ImplementationGuideGlobalComponent o = (ImplementationGuideGlobalComponent) other_;
      return compareValues(type, o.type, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, profile);
    }

    public String fhirType() {
      return "ImplementationGuide.global";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A logical group of resources. Logical groups can be used when building pages.
     */
    @Child(name = "grouping", type = {}, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Grouping used to present related resources in the IG", formalDefinition = "A logical group of resources. Logical groups can be used when building pages.")
    protected List<ImplementationGuideDefinitionGroupingComponent> grouping;

    /**
     * A resource that is part of the implementation guide. Conformance resources
     * (value set, structure definition, capability statements etc.) are obvious
     * candidates for inclusion, but any kind of resource can be included as an
     * example resource.
     */
    @Child(name = "resource", type = {}, order = 2, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Resource in the implementation guide", formalDefinition = "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
    protected List<ImplementationGuideDefinitionResourceComponent> resource;

    /**
     * A page / section in the implementation guide. The root page is the
     * implementation guide home page.
     */
    @Child(name = "page", type = {}, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Page/Section in the Guide", formalDefinition = "A page / section in the implementation guide. The root page is the implementation guide home page.")
    protected ImplementationGuideDefinitionPageComponent page;

    /**
     * Defines how IG is built by tools.
     */
    @Child(name = "parameter", type = {}, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Defines how IG is built by tools", formalDefinition = "Defines how IG is built by tools.")
    protected List<ImplementationGuideDefinitionParameterComponent> parameter;

    /**
     * A template for building resources.
     */
    @Child(name = "template", type = {}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "A template for building resources", formalDefinition = "A template for building resources.")
    protected List<ImplementationGuideDefinitionTemplateComponent> template;

    private static final long serialVersionUID = 179051968L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionComponent() {
      super();
    }

    /**
     * @return {@link #grouping} (A logical group of resources. Logical groups can
     *         be used when building pages.)
     */
    public List<ImplementationGuideDefinitionGroupingComponent> getGrouping() {
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      return this.grouping;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setGrouping(
        List<ImplementationGuideDefinitionGroupingComponent> theGrouping) {
      this.grouping = theGrouping;
      return this;
    }

    public boolean hasGrouping() {
      if (this.grouping == null)
        return false;
      for (ImplementationGuideDefinitionGroupingComponent item : this.grouping)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionGroupingComponent addGrouping() { // 3
      ImplementationGuideDefinitionGroupingComponent t = new ImplementationGuideDefinitionGroupingComponent();
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      this.grouping.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addGrouping(ImplementationGuideDefinitionGroupingComponent t) { // 3
      if (t == null)
        return this;
      if (this.grouping == null)
        this.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
      this.grouping.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #grouping}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionGroupingComponent getGroupingFirstRep() {
      if (getGrouping().isEmpty()) {
        addGrouping();
      }
      return getGrouping().get(0);
    }

    /**
     * @return {@link #resource} (A resource that is part of the implementation
     *         guide. Conformance resources (value set, structure definition,
     *         capability statements etc.) are obvious candidates for inclusion, but
     *         any kind of resource can be included as an example resource.)
     */
    public List<ImplementationGuideDefinitionResourceComponent> getResource() {
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      return this.resource;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setResource(
        List<ImplementationGuideDefinitionResourceComponent> theResource) {
      this.resource = theResource;
      return this;
    }

    public boolean hasResource() {
      if (this.resource == null)
        return false;
      for (ImplementationGuideDefinitionResourceComponent item : this.resource)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionResourceComponent addResource() { // 3
      ImplementationGuideDefinitionResourceComponent t = new ImplementationGuideDefinitionResourceComponent();
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      this.resource.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addResource(ImplementationGuideDefinitionResourceComponent t) { // 3
      if (t == null)
        return this;
      if (this.resource == null)
        this.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
      this.resource.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #resource}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionResourceComponent getResourceFirstRep() {
      if (getResource().isEmpty()) {
        addResource();
      }
      return getResource().get(0);
    }

    /**
     * @return {@link #page} (A page / section in the implementation guide. The root
     *         page is the implementation guide home page.)
     */
    public ImplementationGuideDefinitionPageComponent getPage() {
      if (this.page == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionComponent.page");
        else if (Configuration.doAutoCreate())
          this.page = new ImplementationGuideDefinitionPageComponent(); // cc
      return this.page;
    }

    public boolean hasPage() {
      return this.page != null && !this.page.isEmpty();
    }

    /**
     * @param value {@link #page} (A page / section in the implementation guide. The
     *              root page is the implementation guide home page.)
     */
    public ImplementationGuideDefinitionComponent setPage(ImplementationGuideDefinitionPageComponent value) {
      this.page = value;
      return this;
    }

    /**
     * @return {@link #parameter} (Defines how IG is built by tools.)
     */
    public List<ImplementationGuideDefinitionParameterComponent> getParameter() {
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      return this.parameter;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setParameter(
        List<ImplementationGuideDefinitionParameterComponent> theParameter) {
      this.parameter = theParameter;
      return this;
    }

    public boolean hasParameter() {
      if (this.parameter == null)
        return false;
      for (ImplementationGuideDefinitionParameterComponent item : this.parameter)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionParameterComponent addParameter() { // 3
      ImplementationGuideDefinitionParameterComponent t = new ImplementationGuideDefinitionParameterComponent();
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      this.parameter.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addParameter(ImplementationGuideDefinitionParameterComponent t) { // 3
      if (t == null)
        return this;
      if (this.parameter == null)
        this.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
      this.parameter.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #parameter}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionParameterComponent getParameterFirstRep() {
      if (getParameter().isEmpty()) {
        addParameter();
      }
      return getParameter().get(0);
    }

    /**
     * @return {@link #template} (A template for building resources.)
     */
    public List<ImplementationGuideDefinitionTemplateComponent> getTemplate() {
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      return this.template;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionComponent setTemplate(
        List<ImplementationGuideDefinitionTemplateComponent> theTemplate) {
      this.template = theTemplate;
      return this;
    }

    public boolean hasTemplate() {
      if (this.template == null)
        return false;
      for (ImplementationGuideDefinitionTemplateComponent item : this.template)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionTemplateComponent addTemplate() { // 3
      ImplementationGuideDefinitionTemplateComponent t = new ImplementationGuideDefinitionTemplateComponent();
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      this.template.add(t);
      return t;
    }

    public ImplementationGuideDefinitionComponent addTemplate(ImplementationGuideDefinitionTemplateComponent t) { // 3
      if (t == null)
        return this;
      if (this.template == null)
        this.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
      this.template.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #template}, creating
     *         it if it does not already exist
     */
    public ImplementationGuideDefinitionTemplateComponent getTemplateFirstRep() {
      if (getTemplate().isEmpty()) {
        addTemplate();
      }
      return getTemplate().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(
          new Property("grouping", "", "A logical group of resources. Logical groups can be used when building pages.",
              0, java.lang.Integer.MAX_VALUE, grouping));
      children.add(new Property("resource", "",
          "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
          0, java.lang.Integer.MAX_VALUE, resource));
      children.add(new Property("page", "",
          "A page / section in the implementation guide. The root page is the implementation guide home page.", 0, 1,
          page));
      children.add(new Property("parameter", "", "Defines how IG is built by tools.", 0, java.lang.Integer.MAX_VALUE,
          parameter));
      children.add(
          new Property("template", "", "A template for building resources.", 0, java.lang.Integer.MAX_VALUE, template));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 506371331:
        /* grouping */ return new Property("grouping", "",
            "A logical group of resources. Logical groups can be used when building pages.", 0,
            java.lang.Integer.MAX_VALUE, grouping);
      case -341064690:
        /* resource */ return new Property("resource", "",
            "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
            0, java.lang.Integer.MAX_VALUE, resource);
      case 3433103:
        /* page */ return new Property("page", "",
            "A page / section in the implementation guide. The root page is the implementation guide home page.", 0, 1,
            page);
      case 1954460585:
        /* parameter */ return new Property("parameter", "", "Defines how IG is built by tools.", 0,
            java.lang.Integer.MAX_VALUE, parameter);
      case -1321546630:
        /* template */ return new Property("template", "", "A template for building resources.", 0,
            java.lang.Integer.MAX_VALUE, template);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 506371331:
        /* grouping */ return this.grouping == null ? new Base[0]
            : this.grouping.toArray(new Base[this.grouping.size()]); // ImplementationGuideDefinitionGroupingComponent
      case -341064690:
        /* resource */ return this.resource == null ? new Base[0]
            : this.resource.toArray(new Base[this.resource.size()]); // ImplementationGuideDefinitionResourceComponent
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : new Base[] { this.page }; // ImplementationGuideDefinitionPageComponent
      case 1954460585:
        /* parameter */ return this.parameter == null ? new Base[0]
            : this.parameter.toArray(new Base[this.parameter.size()]); // ImplementationGuideDefinitionParameterComponent
      case -1321546630:
        /* template */ return this.template == null ? new Base[0]
            : this.template.toArray(new Base[this.template.size()]); // ImplementationGuideDefinitionTemplateComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 506371331: // grouping
        this.getGrouping().add((ImplementationGuideDefinitionGroupingComponent) value); // ImplementationGuideDefinitionGroupingComponent
        return value;
      case -341064690: // resource
        this.getResource().add((ImplementationGuideDefinitionResourceComponent) value); // ImplementationGuideDefinitionResourceComponent
        return value;
      case 3433103: // page
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
        return value;
      case 1954460585: // parameter
        this.getParameter().add((ImplementationGuideDefinitionParameterComponent) value); // ImplementationGuideDefinitionParameterComponent
        return value;
      case -1321546630: // template
        this.getTemplate().add((ImplementationGuideDefinitionTemplateComponent) value); // ImplementationGuideDefinitionTemplateComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("grouping")) {
        this.getGrouping().add((ImplementationGuideDefinitionGroupingComponent) value);
      } else if (name.equals("resource")) {
        this.getResource().add((ImplementationGuideDefinitionResourceComponent) value);
      } else if (name.equals("page")) {
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
      } else if (name.equals("parameter")) {
        this.getParameter().add((ImplementationGuideDefinitionParameterComponent) value);
      } else if (name.equals("template")) {
        this.getTemplate().add((ImplementationGuideDefinitionTemplateComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("grouping")) {
        this.getGrouping().remove((ImplementationGuideDefinitionGroupingComponent) value);
      } else if (name.equals("resource")) {
        this.getResource().remove((ImplementationGuideDefinitionResourceComponent) value);
      } else if (name.equals("page")) {
        this.page = (ImplementationGuideDefinitionPageComponent) value; // ImplementationGuideDefinitionPageComponent
      } else if (name.equals("parameter")) {
        this.getParameter().remove((ImplementationGuideDefinitionParameterComponent) value);
      } else if (name.equals("template")) {
        this.getTemplate().remove((ImplementationGuideDefinitionTemplateComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 506371331:
        return addGrouping();
      case -341064690:
        return addResource();
      case 3433103:
        return getPage();
      case 1954460585:
        return addParameter();
      case -1321546630:
        return addTemplate();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 506371331:
        /* grouping */ return new String[] {};
      case -341064690:
        /* resource */ return new String[] {};
      case 3433103:
        /* page */ return new String[] {};
      case 1954460585:
        /* parameter */ return new String[] {};
      case -1321546630:
        /* template */ return new String[] {};
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("grouping")) {
        return addGrouping();
      } else if (name.equals("resource")) {
        return addResource();
      } else if (name.equals("page")) {
        this.page = new ImplementationGuideDefinitionPageComponent();
        return this.page;
      } else if (name.equals("parameter")) {
        return addParameter();
      } else if (name.equals("template")) {
        return addTemplate();
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionComponent copy() {
      ImplementationGuideDefinitionComponent dst = new ImplementationGuideDefinitionComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionComponent dst) {
      super.copyValues(dst);
      if (grouping != null) {
        dst.grouping = new ArrayList<ImplementationGuideDefinitionGroupingComponent>();
        for (ImplementationGuideDefinitionGroupingComponent i : grouping)
          dst.grouping.add(i.copy());
      }
      ;
      if (resource != null) {
        dst.resource = new ArrayList<ImplementationGuideDefinitionResourceComponent>();
        for (ImplementationGuideDefinitionResourceComponent i : resource)
          dst.resource.add(i.copy());
      }
      ;
      dst.page = page == null ? null : page.copy();
      if (parameter != null) {
        dst.parameter = new ArrayList<ImplementationGuideDefinitionParameterComponent>();
        for (ImplementationGuideDefinitionParameterComponent i : parameter)
          dst.parameter.add(i.copy());
      }
      ;
      if (template != null) {
        dst.template = new ArrayList<ImplementationGuideDefinitionTemplateComponent>();
        for (ImplementationGuideDefinitionTemplateComponent i : template)
          dst.template.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionComponent))
        return false;
      ImplementationGuideDefinitionComponent o = (ImplementationGuideDefinitionComponent) other_;
      return compareDeep(grouping, o.grouping, true) && compareDeep(resource, o.resource, true)
          && compareDeep(page, o.page, true) && compareDeep(parameter, o.parameter, true)
          && compareDeep(template, o.template, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionComponent))
        return false;
      ImplementationGuideDefinitionComponent o = (ImplementationGuideDefinitionComponent) other_;
      return true;
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(grouping, resource, page, parameter, template);
    }

    public String fhirType() {
      return "ImplementationGuide.definition";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionGroupingComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * The human-readable title to display for the package of resources when
     * rendering the implementation guide.
     */
    @Child(name = "name", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Descriptive name for the package", formalDefinition = "The human-readable title to display for the package of resources when rendering the implementation guide.")
    protected StringType name;

    /**
     * Human readable text describing the package.
     */
    @Child(name = "description", type = {
        StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Human readable text describing the package", formalDefinition = "Human readable text describing the package.")
    protected StringType description;

    private static final long serialVersionUID = -1105523499L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionGroupingComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionGroupingComponent(StringType name) {
      super();
      this.name = name;
    }

    /**
     * @return {@link #name} (The human-readable title to display for the package of
     *         resources when rendering the implementation guide.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getName" gives direct access to the value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionGroupingComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The human-readable title to display for the
     *              package of resources when rendering the implementation guide.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getName" gives direct access to the value
     */
    public ImplementationGuideDefinitionGroupingComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return The human-readable title to display for the package of resources when
     *         rendering the implementation guide.
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value The human-readable title to display for the package of resources
     *              when rendering the implementation guide.
     */
    public ImplementationGuideDefinitionGroupingComponent setName(String value) {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
      return this;
    }

    /**
     * @return {@link #description} (Human readable text describing the package.).
     *         This is the underlying object with id, value and extensions. The
     *         accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionGroupingComponent.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() {
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Human readable text describing the
     *              package.). This is the underlying object with id, value and
     *              extensions. The accessor "getDescription" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionGroupingComponent setDescriptionElement(StringType value) {
      this.description = value;
      return this;
    }

    /**
     * @return Human readable text describing the package.
     */
    public String getDescription() {
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human readable text describing the package.
     */
    public ImplementationGuideDefinitionGroupingComponent setDescription(String value) {
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name", "string",
          "The human-readable title to display for the package of resources when rendering the implementation guide.",
          0, 1, name));
      children
          .add(new Property("description", "string", "Human readable text describing the package.", 0, 1, description));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3373707:
        /* name */ return new Property("name", "string",
            "The human-readable title to display for the package of resources when rendering the implementation guide.",
            0, 1, name);
      case -1724546052:
        /* description */ return new Property("description", "string", "Human readable text describing the package.", 0,
            1, description);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case -1724546052:
        /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case -1724546052: // description
        this.description = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("description")) {
        this.description = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("description")) {
        this.description = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        return getNameElement();
      case -1724546052:
        return getDescriptionElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "string" };
      case -1724546052:
        /* description */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("description")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionGroupingComponent copy() {
      ImplementationGuideDefinitionGroupingComponent dst = new ImplementationGuideDefinitionGroupingComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionGroupingComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.description = description == null ? null : description.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionGroupingComponent))
        return false;
      ImplementationGuideDefinitionGroupingComponent o = (ImplementationGuideDefinitionGroupingComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(description, o.description, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionGroupingComponent))
        return false;
      ImplementationGuideDefinitionGroupingComponent o = (ImplementationGuideDefinitionGroupingComponent) other_;
      return compareValues(name, o.name, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, description);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.grouping";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionResourceComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Where this resource is found.
     */
    @Child(name = "reference", type = {
        Reference.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Location of the resource", formalDefinition = "Where this resource is found.")
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Where this resource is
     * found.)
     */
    protected Resource referenceTarget;

    /**
     * Indicates the FHIR Version(s) this artifact is intended to apply to. If no
     * versions are specified, the resource is assumed to apply to all the versions
     * stated in ImplementationGuide.fhirVersion.
     */
    @Child(name = "fhirVersion", type = {
      StringType.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Versions this applies to (if different to IG)", formalDefinition = "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/FHIR-version")
    protected List<StringType> fhirVersion;

    /**
     * A human assigned name for the resource. All resources SHOULD have a name, but
     * the name may be extracted from the resource (e.g. ValueSet.name).
     */
    @Child(name = "name", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Human Name for the resource", formalDefinition = "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).")
    protected StringType name;

    /**
     * A description of the reason that a resource has been included in the
     * implementation guide.
     */
    @Child(name = "description", type = {
        StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Reason why included in guide", formalDefinition = "A description of the reason that a resource has been included in the implementation guide.")
    protected StringType description;

    /**
     * If true or a reference, indicates the resource is an example instance. If a
     * reference is present, indicates that the example is an example of the
     * specified profile.
     */
    @Child(name = "example", type = { BooleanType.class,
        CanonicalType.class }, order = 5, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Is an example/What is this an example of?", formalDefinition = "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    protected Type example;

    /**
     * Reference to the id of the grouping this resource appears in.
     */
    @Child(name = "groupingId", type = { IdType.class }, order = 6, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Grouping this is part of", formalDefinition = "Reference to the id of the grouping this resource appears in.")
    protected IdType groupingId;

    private static final long serialVersionUID = 1840689093L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionResourceComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionResourceComponent(Reference reference) {
      super();
      this.reference = reference;
    }

    /**
     * @return {@link #reference} (Where this resource is found.)
     */
    public Reference getReference() {
      if (this.reference == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.reference");
        else if (Configuration.doAutoCreate())
          this.reference = new Reference(); // cc
      return this.reference;
    }

    public boolean hasReference() {
      return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Where this resource is found.)
     */
    public ImplementationGuideDefinitionResourceComponent setReference(Reference value) {
      this.reference = value;
      return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Where this resource
     *         is found.)
     */
    public Resource getReferenceTarget() {
      return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Where this
     *              resource is found.)
     */
    public ImplementationGuideDefinitionResourceComponent setReferenceTarget(Resource value) {
      this.referenceTarget = value;
      return this;
    }

    /**
     * @return {@link #fhirVersion} (Indicates the FHIR Version(s) this artifact is
     *         intended to apply to. If no versions are specified, the resource is
     *         assumed to apply to all the versions stated in
     *         ImplementationGuide.fhirVersion.)
     */
    public List<StringType> getFhirVersion() {
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<StringType>();
      return this.fhirVersion;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionResourceComponent setFhirVersion(
        List<StringType> theFhirVersion) {
      this.fhirVersion = theFhirVersion;
      return this;
    }

    public boolean hasFhirVersion() {
      if (this.fhirVersion == null)
        return false;
      for (StringType item : this.fhirVersion)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #fhirVersion} (Indicates the FHIR Version(s) this artifact is
     *         intended to apply to. If no versions are specified, the resource is
     *         assumed to apply to all the versions stated in
     *         ImplementationGuide.fhirVersion.)
     */
    public StringType addFhirVersionElement() {// 2
      StringType t = new StringType();
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<StringType>();
      this.fhirVersion.add(t);
      return t;
    }

    /**
     * @param value {@link #fhirVersion} (Indicates the FHIR Version(s) this
     *              artifact is intended to apply to. If no versions are specified,
     *              the resource is assumed to apply to all the versions stated in
     *              ImplementationGuide.fhirVersion.)
     */
    public ImplementationGuideDefinitionResourceComponent addFhirVersion(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.fhirVersion == null)
        this.fhirVersion = new ArrayList<StringType>();
      this.fhirVersion.add(t);
      return this;
    }

    /**
     * @param value {@link #fhirVersion} (Indicates the FHIR Version(s) this
     *              artifact is intended to apply to. If no versions are specified,
     *              the resource is assumed to apply to all the versions stated in
     *              ImplementationGuide.fhirVersion.)
     */
    public boolean hasFhirVersion(String value) {
      if (this.fhirVersion == null)
        return false;
      for (StringType v : this.fhirVersion)
        if (v.getValue().equals(value)) // code
          return true;
      return false;
    }

    /**
     * @return {@link #name} (A human assigned name for the resource. All resources
     *         SHOULD have a name, but the name may be extracted from the resource
     *         (e.g. ValueSet.name).). This is the underlying object with id, value
     *         and extensions. The accessor "getName" gives direct access to the
     *         value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A human assigned name for the resource. All
     *              resources SHOULD have a name, but the name may be extracted from
     *              the resource (e.g. ValueSet.name).). This is the underlying
     *              object with id, value and extensions. The accessor "getName"
     *              gives direct access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return A human assigned name for the resource. All resources SHOULD have a
     *         name, but the name may be extracted from the resource (e.g.
     *         ValueSet.name).
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A human assigned name for the resource. All resources SHOULD
     *              have a name, but the name may be extracted from the resource
     *              (e.g. ValueSet.name).
     */
    public ImplementationGuideDefinitionResourceComponent setName(String value) {
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (A description of the reason that a resource has
     *         been included in the implementation guide.). This is the underlying
     *         object with id, value and extensions. The accessor "getDescription"
     *         gives direct access to the value
     */
    public StringType getDescriptionElement() {
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() {
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A description of the reason that a
     *              resource has been included in the implementation guide.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getDescription" gives direct access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setDescriptionElement(StringType value) {
      this.description = value;
      return this;
    }

    /**
     * @return A description of the reason that a resource has been included in the
     *         implementation guide.
     */
    public String getDescription() {
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A description of the reason that a resource has been included in
     *              the implementation guide.
     */
    public ImplementationGuideDefinitionResourceComponent setDescription(String value) {
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public Type getExample() {
      return this.example;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public BooleanType getExampleBooleanType() throws FHIRException {
      if (this.example == null)
        this.example = new BooleanType();
      if (!(this.example instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (BooleanType) this.example;
    }

    public boolean hasExampleBooleanType() {
        return this.example instanceof BooleanType;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public CanonicalType getExampleCanonicalType() throws FHIRException {
      if (this.example == null)
        this.example = new CanonicalType();
      if (!(this.example instanceof CanonicalType))
        throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (CanonicalType) this.example;
    }

    public boolean hasExampleCanonicalType() {
        return this.example instanceof CanonicalType;
    }

    public boolean hasExample() {
      return this.example != null && !this.example.isEmpty();
    }

    /**
     * @param value {@link #example} (If true or a reference, indicates the resource
     *              is an example instance. If a reference is present, indicates
     *              that the example is an example of the specified profile.)
     */
    public ImplementationGuideDefinitionResourceComponent setExample(Type value) {
      if (value != null && !(value instanceof BooleanType || value instanceof CanonicalType))
        throw new Error(
            "Not the right type for ImplementationGuide.definition.resource.example[x]: " + value.fhirType());
      this.example = value;
      return this;
    }

    /**
     * @return {@link #groupingId} (Reference to the id of the grouping this
     *         resource appears in.). This is the underlying object with id, value
     *         and extensions. The accessor "getGroupingId" gives direct access to
     *         the value
     */
    public IdType getGroupingIdElement() {
      if (this.groupingId == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionResourceComponent.groupingId");
        else if (Configuration.doAutoCreate())
          this.groupingId = new IdType(); // bb
      return this.groupingId;
    }

    public boolean hasGroupingIdElement() {
      return this.groupingId != null && !this.groupingId.isEmpty();
    }

    public boolean hasGroupingId() {
      return this.groupingId != null && !this.groupingId.isEmpty();
    }

    /**
     * @param value {@link #groupingId} (Reference to the id of the grouping this
     *              resource appears in.). This is the underlying object with id,
     *              value and extensions. The accessor "getGroupingId" gives direct
     *              access to the value
     */
    public ImplementationGuideDefinitionResourceComponent setGroupingIdElement(IdType value) {
      this.groupingId = value;
      return this;
    }

    /**
     * @return Reference to the id of the grouping this resource appears in.
     */
    public String getGroupingId() {
      return this.groupingId == null ? null : this.groupingId.getValue();
    }

    /**
     * @param value Reference to the id of the grouping this resource appears in.
     */
    public ImplementationGuideDefinitionResourceComponent setGroupingId(String value) {
      if (Utilities.noString(value))
        this.groupingId = null;
      else {
        if (this.groupingId == null)
          this.groupingId = new IdType();
        this.groupingId.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1, reference));
      children.add(new Property("fhirVersion", "string",
          "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.",
          0, java.lang.Integer.MAX_VALUE, fhirVersion));
      children.add(new Property("name", "string",
          "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).",
          0, 1, name));
      children.add(new Property("description", "string",
          "A description of the reason that a resource has been included in the implementation guide.", 0, 1,
          description));
      children.add(new Property("example[x]", "boolean|canonical(StructureDefinition)",
          "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
          0, 1, example));
      children.add(new Property("groupingId", "id", "Reference to the id of the grouping this resource appears in.", 0,
          1, groupingId));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -925155509:
        /* reference */ return new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1,
            reference);
      case 461006061:
        /* fhirVersion */ return new Property("fhirVersion", "string",
            "Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.",
            0, java.lang.Integer.MAX_VALUE, fhirVersion);
      case 3373707:
        /* name */ return new Property("name", "string",
            "A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).",
            0, 1, name);
      case -1724546052:
        /* description */ return new Property("description", "string",
            "A description of the reason that a resource has been included in the implementation guide.", 0, 1,
            description);
      case -2002328874:
        /* example[x] */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -1322970774:
        /* example */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 159803230:
        /* exampleBoolean */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 2016979626:
        /* exampleCanonical */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 1291547006:
        /* groupingId */ return new Property("groupingId", "id",
            "Reference to the id of the grouping this resource appears in.", 0, 1, groupingId);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return this.reference == null ? new Base[0] : new Base[] { this.reference }; // Reference
      case 461006061:
        /* fhirVersion */ return this.fhirVersion == null ? new Base[0]
            : this.fhirVersion.toArray(new Base[this.fhirVersion.size()]); // StringType
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case -1724546052:
        /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // StringType
      case -1322970774:
        /* example */ return this.example == null ? new Base[0] : new Base[] { this.example }; // Type
      case 1291547006:
        /* groupingId */ return this.groupingId == null ? new Base[0] : new Base[] { this.groupingId }; // IdType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -925155509: // reference
        this.reference = castToReference(value); // Reference
        return value;
      case 461006061: // fhirVersion
        this.getFhirVersion().add(castToString(value)); // StringType
        return value;
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case -1724546052: // description
        this.description = castToString(value); // StringType
        return value;
      case -1322970774: // example
        this.example = castToType(value); // Type
        return value;
      case 1291547006: // groupingId
        this.groupingId = castToId(value); // IdType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = castToReference(value); // Reference
      } else if (name.equals("fhirVersion")) {
        this.getFhirVersion().add(castToString(value));
      } else if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("description")) {
        this.description = castToString(value); // StringType
      } else if (name.equals("example[x]")) {
        this.example = castToType(value); // Type
      } else if (name.equals("groupingId")) {
        this.groupingId = castToId(value); // IdType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = null;
      } else if (name.equals("fhirVersion")) {
        this.getFhirVersion().remove(castToString(value));
      } else if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("description")) {
        this.description = null;
      } else if (name.equals("example[x]")) {
        this.example = null;
      } else if (name.equals("groupingId")) {
        this.groupingId = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        return getReference();
      case 461006061:
        return addFhirVersionElement();
      case 3373707:
        return getNameElement();
      case -1724546052:
        return getDescriptionElement();
      case -2002328874:
        return getExample();
      case -1322970774:
        return getExample();
      case 1291547006:
        return getGroupingIdElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return new String[] { "Reference" };
      case 461006061:
        /* fhirVersion */ return new String[] { "code" };
      case 3373707:
        /* name */ return new String[] { "string" };
      case -1724546052:
        /* description */ return new String[] { "string" };
      case -1322970774:
        /* example */ return new String[] { "boolean", "canonical" };
      case 1291547006:
        /* groupingId */ return new String[] { "id" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = new Reference();
        return this.reference;
      } else if (name.equals("fhirVersion")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.fhirVersion");
      } else if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("description")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
      } else if (name.equals("exampleBoolean")) {
        this.example = new BooleanType();
        return this.example;
      } else if (name.equals("exampleCanonical")) {
        this.example = new CanonicalType();
        return this.example;
      } else if (name.equals("groupingId")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.groupingId");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionResourceComponent copy() {
      ImplementationGuideDefinitionResourceComponent dst = new ImplementationGuideDefinitionResourceComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionResourceComponent dst) {
      super.copyValues(dst);
      dst.reference = reference == null ? null : reference.copy();
      if (fhirVersion != null) {
        dst.fhirVersion = new ArrayList<StringType>();
        for (StringType i : fhirVersion)
          dst.fhirVersion.add(i.copy());
      }
      ;
      dst.name = name == null ? null : name.copy();
      dst.description = description == null ? null : description.copy();
      dst.example = example == null ? null : example.copy();
      dst.groupingId = groupingId == null ? null : groupingId.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionResourceComponent))
        return false;
      ImplementationGuideDefinitionResourceComponent o = (ImplementationGuideDefinitionResourceComponent) other_;
      return compareDeep(reference, o.reference, true) && compareDeep(fhirVersion, o.fhirVersion, true)
          && compareDeep(name, o.name, true) && compareDeep(description, o.description, true)
          && compareDeep(example, o.example, true) && compareDeep(groupingId, o.groupingId, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionResourceComponent))
        return false;
      ImplementationGuideDefinitionResourceComponent o = (ImplementationGuideDefinitionResourceComponent) other_;
      return compareValues(fhirVersion, o.fhirVersion, true) && compareValues(name, o.name, true)
          && compareValues(description, o.description, true) && compareValues(groupingId, o.groupingId, true);
    }

    public boolean isEmpty() {
      return super.isEmpty()
          && ca.uhn.fhir.util.ElementUtil.isEmpty(reference, fhirVersion, name, description, example, groupingId);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.resource";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionPageComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * The source address for the page.
     */
    @Child(name = "name", type = { UrlType.class,
        Binary.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Where to find that page", formalDefinition = "The source address for the page.")
    protected Type name;

    /**
     * A short title used to represent this page in navigational structures such as
     * table of contents, bread crumbs, etc.
     */
    @Child(name = "title", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Short title shown for navigational assistance", formalDefinition = "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.")
    protected StringType title;

    /**
     * A code that indicates how the page is generated.
     */
    @Child(name = "generation", type = {
      StringType.class }, order = 3, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "html | markdown | xml | generated", formalDefinition = "A code that indicates how the page is generated.")
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/guide-page-generation")
    protected StringType generation;

    /**
     * Nested Pages/Sections under this page.
     */
    @Child(name = "page", type = {
        ImplementationGuideDefinitionPageComponent.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Nested Pages / Sections", formalDefinition = "Nested Pages/Sections under this page.")
    protected List<ImplementationGuideDefinitionPageComponent> page;

    private static final long serialVersionUID = -365655658L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionPageComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionPageComponent(Type name, StringType title,
                                                      StringType generation) {
      super();
      this.name = name;
      this.title = title;
      this.generation = generation;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public Type getName() {
      return this.name;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public UrlType getNameUrlType() throws FHIRException {
      if (this.name == null)
        this.name = new UrlType();
      if (!(this.name instanceof UrlType))
        throw new FHIRException(
            "Type mismatch: the type UrlType was expected, but " + this.name.getClass().getName() + " was encountered");
      return (UrlType) this.name;
    }

    public boolean hasNameUrlType() {
        return this.name instanceof UrlType;
    }

    /**
     * @return {@link #name} (The source address for the page.)
     */
    public Reference getNameReference() throws FHIRException {
      if (this.name == null)
        this.name = new Reference();
      if (!(this.name instanceof Reference))
        throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.name.getClass().getName()
            + " was encountered");
      return (Reference) this.name;
    }

    public boolean hasNameReference() {
        return this.name instanceof Reference;
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (The source address for the page.)
     */
    public ImplementationGuideDefinitionPageComponent setName(Type value) {
      if (value != null && !(value instanceof UrlType || value instanceof Reference))
        throw new Error("Not the right type for ImplementationGuide.definition.page.name[x]: " + value.fhirType());
      this.name = value;
      return this;
    }

    /**
     * @return {@link #title} (A short title used to represent this page in
     *         navigational structures such as table of contents, bread crumbs,
     *         etc.). This is the underlying object with id, value and extensions.
     *         The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionPageComponent.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() {
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short title used to represent this page in
     *              navigational structures such as table of contents, bread crumbs,
     *              etc.). This is the underlying object with id, value and
     *              extensions. The accessor "getTitle" gives direct access to the
     *              value
     */
    public ImplementationGuideDefinitionPageComponent setTitleElement(StringType value) {
      this.title = value;
      return this;
    }

    /**
     * @return A short title used to represent this page in navigational structures
     *         such as table of contents, bread crumbs, etc.
     */
    public String getTitle() {
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short title used to represent this page in navigational
     *              structures such as table of contents, bread crumbs, etc.
     */
    public ImplementationGuideDefinitionPageComponent setTitle(String value) {
      if (this.title == null)
        this.title = new StringType();
      this.title.setValue(value);
      return this;
    }

    /**
     * @return {@link #generation} (A code that indicates how the page is
     *         generated.). This is the underlying object with id, value and
     *         extensions. The accessor "getGeneration" gives direct access to the
     *         value
     */
    public StringType getGenerationElement() {
      if (this.generation == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionPageComponent.generation");
        else if (Configuration.doAutoCreate())
          this.generation = new StringType(); // bb
      return this.generation;
    }

    public boolean hasGenerationElement() {
      return this.generation != null && !this.generation.isEmpty();
    }

    public boolean hasGeneration() {
      return this.generation != null && !this.generation.isEmpty();
    }

    /**
     * @param value {@link #generation} (A code that indicates how the page is
     *              generated.). This is the underlying object with id, value and
     *              extensions. The accessor "getGeneration" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionPageComponent setGenerationElement(StringType value) {
      this.generation = value;
      return this;
    }

    /**
     * @return A code that indicates how the page is generated.
     */
    public String getGeneration() {
      return this.generation == null ? null : this.generation.getValue();
    }

    /**
     * @param value A code that indicates how the page is generated.
     */
    public ImplementationGuideDefinitionPageComponent setGeneration(String value) {
      if (this.generation == null)
        this.generation = new StringType();
      this.generation.setValue(value);
      return this;
    }

    /**
     * @return {@link #page} (Nested Pages/Sections under this page.)
     */
    public List<ImplementationGuideDefinitionPageComponent> getPage() {
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      return this.page;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideDefinitionPageComponent setPage(
        List<ImplementationGuideDefinitionPageComponent> thePage) {
      this.page = thePage;
      return this;
    }

    public boolean hasPage() {
      if (this.page == null)
        return false;
      for (ImplementationGuideDefinitionPageComponent item : this.page)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImplementationGuideDefinitionPageComponent addPage() { // 3
      ImplementationGuideDefinitionPageComponent t = new ImplementationGuideDefinitionPageComponent();
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      this.page.add(t);
      return t;
    }

    public ImplementationGuideDefinitionPageComponent addPage(ImplementationGuideDefinitionPageComponent t) { // 3
      if (t == null)
        return this;
      if (this.page == null)
        this.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
      this.page.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #page}, creating it if
     *         it does not already exist
     */
    public ImplementationGuideDefinitionPageComponent getPageFirstRep() {
      if (getPage().isEmpty()) {
        addPage();
      }
      return getPage().get(0);
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1, name));
      children.add(new Property("title", "string",
          "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.",
          0, 1, title));
      children.add(
          new Property("generation", "string", "A code that indicates how the page is generated.", 0, 1, generation));
      children.add(new Property("page", "@ImplementationGuide.definition.page",
          "Nested Pages/Sections under this page.", 0, java.lang.Integer.MAX_VALUE, page));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1721948693:
        /* name[x] */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 3373707:
        /* name */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 1721942756:
        /* nameUrl */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.", 0, 1,
            name);
      case 1833144576:
        /* nameReference */ return new Property("name[x]", "url|Reference(Binary)", "The source address for the page.",
            0, 1, name);
      case 110371416:
        /* title */ return new Property("title", "string",
            "A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.",
            0, 1, title);
      case 305703192:
        /* generation */ return new Property("generation", "string", "A code that indicates how the page is generated.",
            0, 1, generation);
      case 3433103:
        /* page */ return new Property("page", "@ImplementationGuide.definition.page",
            "Nested Pages/Sections under this page.", 0, java.lang.Integer.MAX_VALUE, page);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // Type
      case 110371416:
        /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
      case 305703192:
        /* generation */ return this.generation == null ? new Base[0] : new Base[] { this.generation }; // StringType
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : this.page.toArray(new Base[this.page.size()]); // ImplementationGuideDefinitionPageComponent
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToType(value); // Type
        return value;
      case 110371416: // title
        this.title = castToString(value); // StringType
        return value;
      case 305703192: // generation
        this.generation = castToString(value); // StringType
        return value;
      case 3433103: // page
        this.getPage().add((ImplementationGuideDefinitionPageComponent) value); // ImplementationGuideDefinitionPageComponent
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name[x]")) {
        this.name = castToType(value); // Type
      } else if (name.equals("title")) {
        this.title = castToString(value); // StringType
      } else if (name.equals("generation")) {
        this.generation = castToString(value); // StringType
      } else if (name.equals("page")) {
        this.getPage().add((ImplementationGuideDefinitionPageComponent) value);
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name[x]")) {
        this.name = null;
      } else if (name.equals("title")) {
        this.title = null;
      } else if (name.equals("generation")) {
        this.generation = null;
      } else if (name.equals("page")) {
        this.getPage().remove((ImplementationGuideDefinitionPageComponent) value);
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1721948693:
        return getName();
      case 3373707:
        return getName();
      case 110371416:
        return getTitleElement();
      case 305703192:
        return getGenerationElement();
      case 3433103:
        return addPage();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "url", "Reference" };
      case 110371416:
        /* title */ return new String[] { "string" };
      case 305703192:
        /* generation */ return new String[] { "string" };
      case 3433103:
        /* page */ return new String[] { "@ImplementationGuide.definition.page" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("nameUrl")) {
        this.name = new UrlType();
        return this.name;
      } else if (name.equals("nameReference")) {
        this.name = new Reference();
        return this.name;
      } else if (name.equals("title")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
      } else if (name.equals("generation")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.generation");
      } else if (name.equals("page")) {
        return addPage();
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionPageComponent copy() {
      ImplementationGuideDefinitionPageComponent dst = new ImplementationGuideDefinitionPageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionPageComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.title = title == null ? null : title.copy();
      dst.generation = generation == null ? null : generation.copy();
      if (page != null) {
        dst.page = new ArrayList<ImplementationGuideDefinitionPageComponent>();
        for (ImplementationGuideDefinitionPageComponent i : page)
          dst.page.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionPageComponent))
        return false;
      ImplementationGuideDefinitionPageComponent o = (ImplementationGuideDefinitionPageComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(title, o.title, true)
          && compareDeep(generation, o.generation, true) && compareDeep(page, o.page, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionPageComponent))
        return false;
      ImplementationGuideDefinitionPageComponent o = (ImplementationGuideDefinitionPageComponent) other_;
      return compareValues(title, o.title, true) && compareValues(generation, o.generation, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, title, generation, page);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.page";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionParameterComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * apply | path-resource | path-pages | path-tx-cache | expansion-parameter |
     * rule-broken-links | generate-xml | generate-json | generate-turtle |
     * html-template.
     */
    @Child(name = "code", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template", formalDefinition = "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.")
    protected StringType code;

    /**
     * Value for named type.
     */
    @Child(name = "value", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Value for named type", formalDefinition = "Value for named type.")
    protected StringType value;

    private static final long serialVersionUID = 1188999138L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionParameterComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionParameterComponent(StringType code, StringType value) {
      super();
      this.code = code;
      this.value = value;
    }

    /**
     * @return {@link #code} (apply | path-resource | path-pages | path-tx-cache |
     *         expansion-parameter | rule-broken-links | generate-xml |
     *         generate-json | generate-turtle | html-template.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getCode" gives direct access to the value
     */
    public StringType getCodeElement() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionParameterComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new StringType(); // bb
      return this.code;
    }

    public boolean hasCodeElement() {
      return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (apply | path-resource | path-pages |
     *              path-tx-cache | expansion-parameter | rule-broken-links |
     *              generate-xml | generate-json | generate-turtle |
     *              html-template.). This is the underlying object with id, value
     *              and extensions. The accessor "getCode" gives direct access to
     *              the value
     */
    public ImplementationGuideDefinitionParameterComponent setCodeElement(StringType value) {
      this.code = value;
      return this;
    }

    /**
     * @return apply | path-resource | path-pages | path-tx-cache |
     *         expansion-parameter | rule-broken-links | generate-xml |
     *         generate-json | generate-turtle | html-template.
     */
    public String getCode() {
      return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value apply | path-resource | path-pages | path-tx-cache |
     *              expansion-parameter | rule-broken-links | generate-xml |
     *              generate-json | generate-turtle | html-template.
     */
    public ImplementationGuideDefinitionParameterComponent setCode(String value) {
      if (this.code == null)
        this.code = new StringType();
      this.code.setValue(value);
      return this;
    }

    /**
     * @return {@link #value} (Value for named type.). This is the underlying object
     *         with id, value and extensions. The accessor "getValue" gives direct
     *         access to the value
     */
    public StringType getValueElement() {
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionParameterComponent.value");
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
     * @param value {@link #value} (Value for named type.). This is the underlying
     *              object with id, value and extensions. The accessor "getValue"
     *              gives direct access to the value
     */
    public ImplementationGuideDefinitionParameterComponent setValueElement(StringType value) {
      this.value = value;
      return this;
    }

    /**
     * @return Value for named type.
     */
    public String getValue() {
      return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value Value for named type.
     */
    public ImplementationGuideDefinitionParameterComponent setValue(String value) {
      if (this.value == null)
        this.value = new StringType();
      this.value.setValue(value);
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("code", "string",
          "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.",
          0, 1, code));
      children.add(new Property("value", "string", "Value for named type.", 0, 1, value));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3059181:
        /* code */ return new Property("code", "string",
            "apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links | generate-xml | generate-json | generate-turtle | html-template.",
            0, 1, code);
      case 111972721:
        /* value */ return new Property("value", "string", "Value for named type.", 0, 1, value);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // StringType
      case 111972721:
        /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3059181: // code
        this.code = castToString(value); // StringType
        return value;
      case 111972721: // value
        this.value = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = castToString(value); // StringType
      } else if (name.equals("value")) {
        this.value = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = null;
      } else if (name.equals("value")) {
        this.value = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        return getCodeElement();
      case 111972721:
        return getValueElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return new String[] { "string" };
      case 111972721:
        /* value */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("code")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.code");
      } else if (name.equals("value")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.value");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionParameterComponent copy() {
      ImplementationGuideDefinitionParameterComponent dst = new ImplementationGuideDefinitionParameterComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionParameterComponent dst) {
      super.copyValues(dst);
      dst.code = code == null ? null : code.copy();
      dst.value = value == null ? null : value.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionParameterComponent))
        return false;
      ImplementationGuideDefinitionParameterComponent o = (ImplementationGuideDefinitionParameterComponent) other_;
      return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionParameterComponent))
        return false;
      ImplementationGuideDefinitionParameterComponent o = (ImplementationGuideDefinitionParameterComponent) other_;
      return compareValues(code, o.code, true) && compareValues(value, o.value, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, value);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.parameter";

    }

  }

  @Block()
  public static class ImplementationGuideDefinitionTemplateComponent extends BackboneElement
      implements IBaseBackboneElement {
    /**
     * Type of template specified.
     */
    @Child(name = "code", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Type of template specified", formalDefinition = "Type of template specified.")
    protected CodeType code;

    /**
     * The source location for the template.
     */
    @Child(name = "source", type = { StringType.class }, order = 2, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The source location for the template", formalDefinition = "The source location for the template.")
    protected StringType source;

    /**
     * The scope in which the template applies.
     */
    @Child(name = "scope", type = { StringType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "The scope in which the template applies", formalDefinition = "The scope in which the template applies.")
    protected StringType scope;

    private static final long serialVersionUID = 923832457L;

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionTemplateComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ImplementationGuideDefinitionTemplateComponent(CodeType code, StringType source) {
      super();
      this.code = code;
      this.source = source;
    }

    /**
     * @return {@link #code} (Type of template specified.). This is the underlying
     *         object with id, value and extensions. The accessor "getCode" gives
     *         direct access to the value
     */
    public CodeType getCodeElement() {
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeType(); // bb
      return this.code;
    }

    public boolean hasCodeElement() {
      return this.code != null && !this.code.isEmpty();
    }

    public boolean hasCode() {
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (Type of template specified.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getCode" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setCodeElement(CodeType value) {
      this.code = value;
      return this;
    }

    /**
     * @return Type of template specified.
     */
    public String getCode() {
      return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value Type of template specified.
     */
    public ImplementationGuideDefinitionTemplateComponent setCode(String value) {
      if (this.code == null)
        this.code = new CodeType();
      this.code.setValue(value);
      return this;
    }

    /**
     * @return {@link #source} (The source location for the template.). This is the
     *         underlying object with id, value and extensions. The accessor
     *         "getSource" gives direct access to the value
     */
    public StringType getSourceElement() {
      if (this.source == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.source");
        else if (Configuration.doAutoCreate())
          this.source = new StringType(); // bb
      return this.source;
    }

    public boolean hasSourceElement() {
      return this.source != null && !this.source.isEmpty();
    }

    public boolean hasSource() {
      return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (The source location for the template.). This is
     *              the underlying object with id, value and extensions. The
     *              accessor "getSource" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setSourceElement(StringType value) {
      this.source = value;
      return this;
    }

    /**
     * @return The source location for the template.
     */
    public String getSource() {
      return this.source == null ? null : this.source.getValue();
    }

    /**
     * @param value The source location for the template.
     */
    public ImplementationGuideDefinitionTemplateComponent setSource(String value) {
      if (this.source == null)
        this.source = new StringType();
      this.source.setValue(value);
      return this;
    }

    /**
     * @return {@link #scope} (The scope in which the template applies.). This is
     *         the underlying object with id, value and extensions. The accessor
     *         "getScope" gives direct access to the value
     */
    public StringType getScopeElement() {
      if (this.scope == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideDefinitionTemplateComponent.scope");
        else if (Configuration.doAutoCreate())
          this.scope = new StringType(); // bb
      return this.scope;
    }

    public boolean hasScopeElement() {
      return this.scope != null && !this.scope.isEmpty();
    }

    public boolean hasScope() {
      return this.scope != null && !this.scope.isEmpty();
    }

    /**
     * @param value {@link #scope} (The scope in which the template applies.). This
     *              is the underlying object with id, value and extensions. The
     *              accessor "getScope" gives direct access to the value
     */
    public ImplementationGuideDefinitionTemplateComponent setScopeElement(StringType value) {
      this.scope = value;
      return this;
    }

    /**
     * @return The scope in which the template applies.
     */
    public String getScope() {
      return this.scope == null ? null : this.scope.getValue();
    }

    /**
     * @param value The scope in which the template applies.
     */
    public ImplementationGuideDefinitionTemplateComponent setScope(String value) {
      if (Utilities.noString(value))
        this.scope = null;
      else {
        if (this.scope == null)
          this.scope = new StringType();
        this.scope.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("code", "code", "Type of template specified.", 0, 1, code));
      children.add(new Property("source", "string", "The source location for the template.", 0, 1, source));
      children.add(new Property("scope", "string", "The scope in which the template applies.", 0, 1, scope));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3059181:
        /* code */ return new Property("code", "code", "Type of template specified.", 0, 1, code);
      case -896505829:
        /* source */ return new Property("source", "string", "The source location for the template.", 0, 1, source);
      case 109264468:
        /* scope */ return new Property("scope", "string", "The scope in which the template applies.", 0, 1, scope);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // CodeType
      case -896505829:
        /* source */ return this.source == null ? new Base[0] : new Base[] { this.source }; // StringType
      case 109264468:
        /* scope */ return this.scope == null ? new Base[0] : new Base[] { this.scope }; // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3059181: // code
        this.code = castToCode(value); // CodeType
        return value;
      case -896505829: // source
        this.source = castToString(value); // StringType
        return value;
      case 109264468: // scope
        this.scope = castToString(value); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = castToCode(value); // CodeType
      } else if (name.equals("source")) {
        this.source = castToString(value); // StringType
      } else if (name.equals("scope")) {
        this.scope = castToString(value); // StringType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("code")) {
        this.code = null;
      } else if (name.equals("source")) {
        this.source = null;
      } else if (name.equals("scope")) {
        this.scope = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        return getCodeElement();
      case -896505829:
        return getSourceElement();
      case 109264468:
        return getScopeElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3059181:
        /* code */ return new String[] { "code" };
      case -896505829:
        /* source */ return new String[] { "string" };
      case 109264468:
        /* scope */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("code")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.code");
      } else if (name.equals("source")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.source");
      } else if (name.equals("scope")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.scope");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideDefinitionTemplateComponent copy() {
      ImplementationGuideDefinitionTemplateComponent dst = new ImplementationGuideDefinitionTemplateComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideDefinitionTemplateComponent dst) {
      super.copyValues(dst);
      dst.code = code == null ? null : code.copy();
      dst.source = source == null ? null : source.copy();
      dst.scope = scope == null ? null : scope.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionTemplateComponent))
        return false;
      ImplementationGuideDefinitionTemplateComponent o = (ImplementationGuideDefinitionTemplateComponent) other_;
      return compareDeep(code, o.code, true) && compareDeep(source, o.source, true)
          && compareDeep(scope, o.scope, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideDefinitionTemplateComponent))
        return false;
      ImplementationGuideDefinitionTemplateComponent o = (ImplementationGuideDefinitionTemplateComponent) other_;
      return compareValues(code, o.code, true) && compareValues(source, o.source, true)
          && compareValues(scope, o.scope, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, source, scope);
    }

    public String fhirType() {
      return "ImplementationGuide.definition.template";

    }

  }

  @Block()
  public static class ImplementationGuideManifestComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * A pointer to official web page, PDF or other rendering of the implementation
     * guide.
     */
    @Child(name = "rendering", type = { UrlType.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Location of rendered implementation guide", formalDefinition = "A pointer to official web page, PDF or other rendering of the implementation guide.")
    protected UrlType rendering;

    /**
     * A resource that is part of the implementation guide. Conformance resources
     * (value set, structure definition, capability statements etc.) are obvious
     * candidates for inclusion, but any kind of resource can be included as an
     * example resource.
     */
    @Child(name = "resource", type = {}, order = 2, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Resource in the implementation guide", formalDefinition = "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.")
    protected List<ManifestResourceComponent> resource;

    /**
     * Information about a page within the IG.
     */
    @Child(name = "page", type = {}, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "HTML page within the parent IG", formalDefinition = "Information about a page within the IG.")
    protected List<ManifestPageComponent> page;

    /**
     * Indicates a relative path to an image that exists within the IG.
     */
    @Child(name = "image", type = {
        StringType.class }, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Image within the IG", formalDefinition = "Indicates a relative path to an image that exists within the IG.")
    protected List<StringType> image;

    /**
     * Indicates the relative path of an additional non-page, non-image file that is
     * part of the IG - e.g. zip, jar and similar files that could be the target of
     * a hyperlink in a derived IG.
     */
    @Child(name = "other", type = {
        StringType.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Additional linkable file in IG", formalDefinition = "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.")
    protected List<StringType> other;

    private static final long serialVersionUID = 1881327712L;

    /**
     * Constructor
     */
    public ImplementationGuideManifestComponent() {
      super();
    }

    /**
     * @return {@link #rendering} (A pointer to official web page, PDF or other
     *         rendering of the implementation guide.). This is the underlying
     *         object with id, value and extensions. The accessor "getRendering"
     *         gives direct access to the value
     */
    public UrlType getRenderingElement() {
      if (this.rendering == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImplementationGuideManifestComponent.rendering");
        else if (Configuration.doAutoCreate())
          this.rendering = new UrlType(); // bb
      return this.rendering;
    }

    public boolean hasRenderingElement() {
      return this.rendering != null && !this.rendering.isEmpty();
    }

    public boolean hasRendering() {
      return this.rendering != null && !this.rendering.isEmpty();
    }

    /**
     * @param value {@link #rendering} (A pointer to official web page, PDF or other
     *              rendering of the implementation guide.). This is the underlying
     *              object with id, value and extensions. The accessor
     *              "getRendering" gives direct access to the value
     */
    public ImplementationGuideManifestComponent setRenderingElement(UrlType value) {
      this.rendering = value;
      return this;
    }

    /**
     * @return A pointer to official web page, PDF or other rendering of the
     *         implementation guide.
     */
    public String getRendering() {
      return this.rendering == null ? null : this.rendering.getValue();
    }

    /**
     * @param value A pointer to official web page, PDF or other rendering of the
     *              implementation guide.
     */
    public ImplementationGuideManifestComponent setRendering(String value) {
      if (Utilities.noString(value))
        this.rendering = null;
      else {
        if (this.rendering == null)
          this.rendering = new UrlType();
        this.rendering.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #resource} (A resource that is part of the implementation
     *         guide. Conformance resources (value set, structure definition,
     *         capability statements etc.) are obvious candidates for inclusion, but
     *         any kind of resource can be included as an example resource.)
     */
    public List<ManifestResourceComponent> getResource() {
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      return this.resource;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setResource(List<ManifestResourceComponent> theResource) {
      this.resource = theResource;
      return this;
    }

    public boolean hasResource() {
      if (this.resource == null)
        return false;
      for (ManifestResourceComponent item : this.resource)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ManifestResourceComponent addResource() { // 3
      ManifestResourceComponent t = new ManifestResourceComponent();
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      this.resource.add(t);
      return t;
    }

    public ImplementationGuideManifestComponent addResource(ManifestResourceComponent t) { // 3
      if (t == null)
        return this;
      if (this.resource == null)
        this.resource = new ArrayList<ManifestResourceComponent>();
      this.resource.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #resource}, creating
     *         it if it does not already exist
     */
    public ManifestResourceComponent getResourceFirstRep() {
      if (getResource().isEmpty()) {
        addResource();
      }
      return getResource().get(0);
    }

    /**
     * @return {@link #page} (Information about a page within the IG.)
     */
    public List<ManifestPageComponent> getPage() {
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      return this.page;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setPage(List<ManifestPageComponent> thePage) {
      this.page = thePage;
      return this;
    }

    public boolean hasPage() {
      if (this.page == null)
        return false;
      for (ManifestPageComponent item : this.page)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ManifestPageComponent addPage() { // 3
      ManifestPageComponent t = new ManifestPageComponent();
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      this.page.add(t);
      return t;
    }

    public ImplementationGuideManifestComponent addPage(ManifestPageComponent t) { // 3
      if (t == null)
        return this;
      if (this.page == null)
        this.page = new ArrayList<ManifestPageComponent>();
      this.page.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #page}, creating it if
     *         it does not already exist
     */
    public ManifestPageComponent getPageFirstRep() {
      if (getPage().isEmpty()) {
        addPage();
      }
      return getPage().get(0);
    }

    /**
     * @return {@link #image} (Indicates a relative path to an image that exists
     *         within the IG.)
     */
    public List<StringType> getImage() {
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      return this.image;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setImage(List<StringType> theImage) {
      this.image = theImage;
      return this;
    }

    public boolean hasImage() {
      if (this.image == null)
        return false;
      for (StringType item : this.image)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #image} (Indicates a relative path to an image that exists
     *         within the IG.)
     */
    public StringType addImageElement() {// 2
      StringType t = new StringType();
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      this.image.add(t);
      return t;
    }

    /**
     * @param value {@link #image} (Indicates a relative path to an image that
     *              exists within the IG.)
     */
    public ImplementationGuideManifestComponent addImage(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.image == null)
        this.image = new ArrayList<StringType>();
      this.image.add(t);
      return this;
    }

    /**
     * @param value {@link #image} (Indicates a relative path to an image that
     *              exists within the IG.)
     */
    public boolean hasImage(String value) {
      if (this.image == null)
        return false;
      for (StringType v : this.image)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #other} (Indicates the relative path of an additional
     *         non-page, non-image file that is part of the IG - e.g. zip, jar and
     *         similar files that could be the target of a hyperlink in a derived
     *         IG.)
     */
    public List<StringType> getOther() {
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      return this.other;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImplementationGuideManifestComponent setOther(List<StringType> theOther) {
      this.other = theOther;
      return this;
    }

    public boolean hasOther() {
      if (this.other == null)
        return false;
      for (StringType item : this.other)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #other} (Indicates the relative path of an additional
     *         non-page, non-image file that is part of the IG - e.g. zip, jar and
     *         similar files that could be the target of a hyperlink in a derived
     *         IG.)
     */
    public StringType addOtherElement() {// 2
      StringType t = new StringType();
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      this.other.add(t);
      return t;
    }

    /**
     * @param value {@link #other} (Indicates the relative path of an additional
     *              non-page, non-image file that is part of the IG - e.g. zip, jar
     *              and similar files that could be the target of a hyperlink in a
     *              derived IG.)
     */
    public ImplementationGuideManifestComponent addOther(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.other == null)
        this.other = new ArrayList<StringType>();
      this.other.add(t);
      return this;
    }

    /**
     * @param value {@link #other} (Indicates the relative path of an additional
     *              non-page, non-image file that is part of the IG - e.g. zip, jar
     *              and similar files that could be the target of a hyperlink in a
     *              derived IG.)
     */
    public boolean hasOther(String value) {
      if (this.other == null)
        return false;
      for (StringType v : this.other)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("rendering", "url",
          "A pointer to official web page, PDF or other rendering of the implementation guide.", 0, 1, rendering));
      children.add(new Property("resource", "",
          "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
          0, java.lang.Integer.MAX_VALUE, resource));
      children.add(
          new Property("page", "", "Information about a page within the IG.", 0, java.lang.Integer.MAX_VALUE, page));
      children.add(new Property("image", "string", "Indicates a relative path to an image that exists within the IG.",
          0, java.lang.Integer.MAX_VALUE, image));
      children.add(new Property("other", "string",
          "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.",
          0, java.lang.Integer.MAX_VALUE, other));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 1839654540:
        /* rendering */ return new Property("rendering", "url",
            "A pointer to official web page, PDF or other rendering of the implementation guide.", 0, 1, rendering);
      case -341064690:
        /* resource */ return new Property("resource", "",
            "A resource that is part of the implementation guide. Conformance resources (value set, structure definition, capability statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource.",
            0, java.lang.Integer.MAX_VALUE, resource);
      case 3433103:
        /* page */ return new Property("page", "", "Information about a page within the IG.", 0,
            java.lang.Integer.MAX_VALUE, page);
      case 100313435:
        /* image */ return new Property("image", "string",
            "Indicates a relative path to an image that exists within the IG.", 0, java.lang.Integer.MAX_VALUE, image);
      case 106069776:
        /* other */ return new Property("other", "string",
            "Indicates the relative path of an additional non-page, non-image file that is part of the IG - e.g. zip, jar and similar files that could be the target of a hyperlink in a derived IG.",
            0, java.lang.Integer.MAX_VALUE, other);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 1839654540:
        /* rendering */ return this.rendering == null ? new Base[0] : new Base[] { this.rendering }; // UrlType
      case -341064690:
        /* resource */ return this.resource == null ? new Base[0]
            : this.resource.toArray(new Base[this.resource.size()]); // ManifestResourceComponent
      case 3433103:
        /* page */ return this.page == null ? new Base[0] : this.page.toArray(new Base[this.page.size()]); // ManifestPageComponent
      case 100313435:
        /* image */ return this.image == null ? new Base[0] : this.image.toArray(new Base[this.image.size()]); // StringType
      case 106069776:
        /* other */ return this.other == null ? new Base[0] : this.other.toArray(new Base[this.other.size()]); // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 1839654540: // rendering
        this.rendering = castToUrl(value); // UrlType
        return value;
      case -341064690: // resource
        this.getResource().add((ManifestResourceComponent) value); // ManifestResourceComponent
        return value;
      case 3433103: // page
        this.getPage().add((ManifestPageComponent) value); // ManifestPageComponent
        return value;
      case 100313435: // image
        this.getImage().add(castToString(value)); // StringType
        return value;
      case 106069776: // other
        this.getOther().add(castToString(value)); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("rendering")) {
        this.rendering = castToUrl(value); // UrlType
      } else if (name.equals("resource")) {
        this.getResource().add((ManifestResourceComponent) value);
      } else if (name.equals("page")) {
        this.getPage().add((ManifestPageComponent) value);
      } else if (name.equals("image")) {
        this.getImage().add(castToString(value));
      } else if (name.equals("other")) {
        this.getOther().add(castToString(value));
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("rendering")) {
        this.rendering = null;
      } else if (name.equals("resource")) {
        this.getResource().remove((ManifestResourceComponent) value);
      } else if (name.equals("page")) {
        this.getPage().remove((ManifestPageComponent) value);
      } else if (name.equals("image")) {
        this.getImage().remove(castToString(value));
      } else if (name.equals("other")) {
        this.getOther().remove(castToString(value));
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1839654540:
        return getRenderingElement();
      case -341064690:
        return addResource();
      case 3433103:
        return addPage();
      case 100313435:
        return addImageElement();
      case 106069776:
        return addOtherElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 1839654540:
        /* rendering */ return new String[] { "url" };
      case -341064690:
        /* resource */ return new String[] {};
      case 3433103:
        /* page */ return new String[] {};
      case 100313435:
        /* image */ return new String[] { "string" };
      case 106069776:
        /* other */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("rendering")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.rendering");
      } else if (name.equals("resource")) {
        return addResource();
      } else if (name.equals("page")) {
        return addPage();
      } else if (name.equals("image")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.image");
      } else if (name.equals("other")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.other");
      } else
        return super.addChild(name);
    }

    public ImplementationGuideManifestComponent copy() {
      ImplementationGuideManifestComponent dst = new ImplementationGuideManifestComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ImplementationGuideManifestComponent dst) {
      super.copyValues(dst);
      dst.rendering = rendering == null ? null : rendering.copy();
      if (resource != null) {
        dst.resource = new ArrayList<ManifestResourceComponent>();
        for (ManifestResourceComponent i : resource)
          dst.resource.add(i.copy());
      }
      ;
      if (page != null) {
        dst.page = new ArrayList<ManifestPageComponent>();
        for (ManifestPageComponent i : page)
          dst.page.add(i.copy());
      }
      ;
      if (image != null) {
        dst.image = new ArrayList<StringType>();
        for (StringType i : image)
          dst.image.add(i.copy());
      }
      ;
      if (other != null) {
        dst.other = new ArrayList<StringType>();
        for (StringType i : other)
          dst.other.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideManifestComponent))
        return false;
      ImplementationGuideManifestComponent o = (ImplementationGuideManifestComponent) other_;
      return compareDeep(rendering, o.rendering, true) && compareDeep(resource, o.resource, true)
          && compareDeep(page, o.page, true) && compareDeep(image, o.image, true) && compareDeep(other, o.other, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ImplementationGuideManifestComponent))
        return false;
      ImplementationGuideManifestComponent o = (ImplementationGuideManifestComponent) other_;
      return compareValues(rendering, o.rendering, true) && compareValues(image, o.image, true)
          && compareValues(other, o.other, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(rendering, resource, page, image, other);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest";

    }

  }

  @Block()
  public static class ManifestResourceComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Where this resource is found.
     */
    @Child(name = "reference", type = {
        Reference.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Location of the resource", formalDefinition = "Where this resource is found.")
    protected Reference reference;

    /**
     * The actual object that is the target of the reference (Where this resource is
     * found.)
     */
    protected Resource referenceTarget;

    /**
     * If true or a reference, indicates the resource is an example instance. If a
     * reference is present, indicates that the example is an example of the
     * specified profile.
     */
    @Child(name = "example", type = { BooleanType.class,
        CanonicalType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Is an example/What is this an example of?", formalDefinition = "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.")
    protected Type example;

    /**
     * The relative path for primary page for this resource within the IG.
     */
    @Child(name = "relativePath", type = {
        UrlType.class }, order = 3, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Relative path for page in IG", formalDefinition = "The relative path for primary page for this resource within the IG.")
    protected UrlType relativePath;

    private static final long serialVersionUID = 1150095716L;

    /**
     * Constructor
     */
    public ManifestResourceComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ManifestResourceComponent(Reference reference) {
      super();
      this.reference = reference;
    }

    /**
     * @return {@link #reference} (Where this resource is found.)
     */
    public Reference getReference() {
      if (this.reference == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestResourceComponent.reference");
        else if (Configuration.doAutoCreate())
          this.reference = new Reference(); // cc
      return this.reference;
    }

    public boolean hasReference() {
      return this.reference != null && !this.reference.isEmpty();
    }

    /**
     * @param value {@link #reference} (Where this resource is found.)
     */
    public ManifestResourceComponent setReference(Reference value) {
      this.reference = value;
      return this;
    }

    /**
     * @return {@link #reference} The actual object that is the target of the
     *         reference. The reference library doesn't populate this, but you can
     *         use it to hold the resource if you resolve it. (Where this resource
     *         is found.)
     */
    public Resource getReferenceTarget() {
      return this.referenceTarget;
    }

    /**
     * @param value {@link #reference} The actual object that is the target of the
     *              reference. The reference library doesn't use these, but you can
     *              use it to hold the resource if you resolve it. (Where this
     *              resource is found.)
     */
    public ManifestResourceComponent setReferenceTarget(Resource value) {
      this.referenceTarget = value;
      return this;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public Type getExample() {
      return this.example;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public BooleanType getExampleBooleanType() throws FHIRException {
      if (this.example == null)
        this.example = new BooleanType();
      if (!(this.example instanceof BooleanType))
        throw new FHIRException("Type mismatch: the type BooleanType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (BooleanType) this.example;
    }

    public boolean hasExampleBooleanType() {
        return this.example instanceof BooleanType;
    }

    /**
     * @return {@link #example} (If true or a reference, indicates the resource is
     *         an example instance. If a reference is present, indicates that the
     *         example is an example of the specified profile.)
     */
    public CanonicalType getExampleCanonicalType() throws FHIRException {
      if (this.example == null)
        this.example = new CanonicalType();
      if (!(this.example instanceof CanonicalType))
        throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "
            + this.example.getClass().getName() + " was encountered");
      return (CanonicalType) this.example;
    }

    public boolean hasExampleCanonicalType() {
        return this.example instanceof CanonicalType;
    }

    public boolean hasExample() {
      return this.example != null && !this.example.isEmpty();
    }

    /**
     * @param value {@link #example} (If true or a reference, indicates the resource
     *              is an example instance. If a reference is present, indicates
     *              that the example is an example of the specified profile.)
     */
    public ManifestResourceComponent setExample(Type value) {
      if (value != null && !(value instanceof BooleanType || value instanceof CanonicalType))
        throw new Error("Not the right type for ImplementationGuide.manifest.resource.example[x]: " + value.fhirType());
      this.example = value;
      return this;
    }

    /**
     * @return {@link #relativePath} (The relative path for primary page for this
     *         resource within the IG.). This is the underlying object with id,
     *         value and extensions. The accessor "getRelativePath" gives direct
     *         access to the value
     */
    public UrlType getRelativePathElement() {
      if (this.relativePath == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestResourceComponent.relativePath");
        else if (Configuration.doAutoCreate())
          this.relativePath = new UrlType(); // bb
      return this.relativePath;
    }

    public boolean hasRelativePathElement() {
      return this.relativePath != null && !this.relativePath.isEmpty();
    }

    public boolean hasRelativePath() {
      return this.relativePath != null && !this.relativePath.isEmpty();
    }

    /**
     * @param value {@link #relativePath} (The relative path for primary page for
     *              this resource within the IG.). This is the underlying object
     *              with id, value and extensions. The accessor "getRelativePath"
     *              gives direct access to the value
     */
    public ManifestResourceComponent setRelativePathElement(UrlType value) {
      this.relativePath = value;
      return this;
    }

    /**
     * @return The relative path for primary page for this resource within the IG.
     */
    public String getRelativePath() {
      return this.relativePath == null ? null : this.relativePath.getValue();
    }

    /**
     * @param value The relative path for primary page for this resource within the
     *              IG.
     */
    public ManifestResourceComponent setRelativePath(String value) {
      if (Utilities.noString(value))
        this.relativePath = null;
      else {
        if (this.relativePath == null)
          this.relativePath = new UrlType();
        this.relativePath.setValue(value);
      }
      return this;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1, reference));
      children.add(new Property("example[x]", "boolean|canonical(StructureDefinition)",
          "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
          0, 1, example));
      children.add(new Property("relativePath", "url",
          "The relative path for primary page for this resource within the IG.", 0, 1, relativePath));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case -925155509:
        /* reference */ return new Property("reference", "Reference(Any)", "Where this resource is found.", 0, 1,
            reference);
      case -2002328874:
        /* example[x] */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -1322970774:
        /* example */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 159803230:
        /* exampleBoolean */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case 2016979626:
        /* exampleCanonical */ return new Property("example[x]", "boolean|canonical(StructureDefinition)",
            "If true or a reference, indicates the resource is an example instance.  If a reference is present, indicates that the example is an example of the specified profile.",
            0, 1, example);
      case -70808303:
        /* relativePath */ return new Property("relativePath", "url",
            "The relative path for primary page for this resource within the IG.", 0, 1, relativePath);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return this.reference == null ? new Base[0] : new Base[] { this.reference }; // Reference
      case -1322970774:
        /* example */ return this.example == null ? new Base[0] : new Base[] { this.example }; // Type
      case -70808303:
        /* relativePath */ return this.relativePath == null ? new Base[0] : new Base[] { this.relativePath }; // UrlType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case -925155509: // reference
        this.reference = castToReference(value); // Reference
        return value;
      case -1322970774: // example
        this.example = castToType(value); // Type
        return value;
      case -70808303: // relativePath
        this.relativePath = castToUrl(value); // UrlType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = castToReference(value); // Reference
      } else if (name.equals("example[x]")) {
        this.example = castToType(value); // Type
      } else if (name.equals("relativePath")) {
        this.relativePath = castToUrl(value); // UrlType
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = null;
      } else if (name.equals("example[x]")) {
        this.example = null;
      } else if (name.equals("relativePath")) {
        this.relativePath = null;
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        return getReference();
      case -2002328874:
        return getExample();
      case -1322970774:
        return getExample();
      case -70808303:
        return getRelativePathElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case -925155509:
        /* reference */ return new String[] { "Reference" };
      case -1322970774:
        /* example */ return new String[] { "boolean", "canonical" };
      case -70808303:
        /* relativePath */ return new String[] { "url" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("reference")) {
        this.reference = new Reference();
        return this.reference;
      } else if (name.equals("exampleBoolean")) {
        this.example = new BooleanType();
        return this.example;
      } else if (name.equals("exampleCanonical")) {
        this.example = new CanonicalType();
        return this.example;
      } else if (name.equals("relativePath")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.relativePath");
      } else
        return super.addChild(name);
    }

    public ManifestResourceComponent copy() {
      ManifestResourceComponent dst = new ManifestResourceComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ManifestResourceComponent dst) {
      super.copyValues(dst);
      dst.reference = reference == null ? null : reference.copy();
      dst.example = example == null ? null : example.copy();
      dst.relativePath = relativePath == null ? null : relativePath.copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ManifestResourceComponent))
        return false;
      ManifestResourceComponent o = (ManifestResourceComponent) other_;
      return compareDeep(reference, o.reference, true) && compareDeep(example, o.example, true)
          && compareDeep(relativePath, o.relativePath, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ManifestResourceComponent))
        return false;
      ManifestResourceComponent o = (ManifestResourceComponent) other_;
      return compareValues(relativePath, o.relativePath, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(reference, example, relativePath);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest.resource";

    }

  }

  @Block()
  public static class ManifestPageComponent extends BackboneElement implements IBaseBackboneElement {
    /**
     * Relative path to the page.
     */
    @Child(name = "name", type = { StringType.class }, order = 1, min = 1, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "HTML page name", formalDefinition = "Relative path to the page.")
    protected StringType name;

    /**
     * Label for the page intended for human display.
     */
    @Child(name = "title", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Title of the page, for references", formalDefinition = "Label for the page intended for human display.")
    protected StringType title;

    /**
     * The name of an anchor available on the page.
     */
    @Child(name = "anchor", type = {
        StringType.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = false)
    @Description(shortDefinition = "Anchor available on the page", formalDefinition = "The name of an anchor available on the page.")
    protected List<StringType> anchor;

    private static final long serialVersionUID = 1920576611L;

    /**
     * Constructor
     */
    public ManifestPageComponent() {
      super();
    }

    /**
     * Constructor
     */
    public ManifestPageComponent(StringType name) {
      super();
      this.name = name;
    }

    /**
     * @return {@link #name} (Relative path to the page.). This is the underlying
     *         object with id, value and extensions. The accessor "getName" gives
     *         direct access to the value
     */
    public StringType getNameElement() {
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestPageComponent.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() {
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() {
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (Relative path to the page.). This is the
     *              underlying object with id, value and extensions. The accessor
     *              "getName" gives direct access to the value
     */
    public ManifestPageComponent setNameElement(StringType value) {
      this.name = value;
      return this;
    }

    /**
     * @return Relative path to the page.
     */
    public String getName() {
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Relative path to the page.
     */
    public ManifestPageComponent setName(String value) {
      if (this.name == null)
        this.name = new StringType();
      this.name.setValue(value);
      return this;
    }

    /**
     * @return {@link #title} (Label for the page intended for human display.). This
     *         is the underlying object with id, value and extensions. The accessor
     *         "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() {
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ManifestPageComponent.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() {
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() {
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (Label for the page intended for human display.).
     *              This is the underlying object with id, value and extensions. The
     *              accessor "getTitle" gives direct access to the value
     */
    public ManifestPageComponent setTitleElement(StringType value) {
      this.title = value;
      return this;
    }

    /**
     * @return Label for the page intended for human display.
     */
    public String getTitle() {
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Label for the page intended for human display.
     */
    public ManifestPageComponent setTitle(String value) {
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #anchor} (The name of an anchor available on the page.)
     */
    public List<StringType> getAnchor() {
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      return this.anchor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ManifestPageComponent setAnchor(List<StringType> theAnchor) {
      this.anchor = theAnchor;
      return this;
    }

    public boolean hasAnchor() {
      if (this.anchor == null)
        return false;
      for (StringType item : this.anchor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #anchor} (The name of an anchor available on the page.)
     */
    public StringType addAnchorElement() {// 2
      StringType t = new StringType();
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      this.anchor.add(t);
      return t;
    }

    /**
     * @param value {@link #anchor} (The name of an anchor available on the page.)
     */
    public ManifestPageComponent addAnchor(String value) { // 1
      StringType t = new StringType();
      t.setValue(value);
      if (this.anchor == null)
        this.anchor = new ArrayList<StringType>();
      this.anchor.add(t);
      return this;
    }

    /**
     * @param value {@link #anchor} (The name of an anchor available on the page.)
     */
    public boolean hasAnchor(String value) {
      if (this.anchor == null)
        return false;
      for (StringType v : this.anchor)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    protected void listChildren(List<Property> children) {
      super.listChildren(children);
      children.add(new Property("name", "string", "Relative path to the page.", 0, 1, name));
      children.add(new Property("title", "string", "Label for the page intended for human display.", 0, 1, title));
      children.add(new Property("anchor", "string", "The name of an anchor available on the page.", 0,
          java.lang.Integer.MAX_VALUE, anchor));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
      switch (_hash) {
      case 3373707:
        /* name */ return new Property("name", "string", "Relative path to the page.", 0, 1, name);
      case 110371416:
        /* title */ return new Property("title", "string", "Label for the page intended for human display.", 0, 1,
            title);
      case -1413299531:
        /* anchor */ return new Property("anchor", "string", "The name of an anchor available on the page.", 0,
            java.lang.Integer.MAX_VALUE, anchor);
      default:
        return super.getNamedProperty(_hash, _name, _checkValid);
      }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
      case 110371416:
        /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
      case -1413299531:
        /* anchor */ return this.anchor == null ? new Base[0] : this.anchor.toArray(new Base[this.anchor.size()]); // StringType
      default:
        return super.getProperty(hash, name, checkValid);
      }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
      switch (hash) {
      case 3373707: // name
        this.name = castToString(value); // StringType
        return value;
      case 110371416: // title
        this.title = castToString(value); // StringType
        return value;
      case -1413299531: // anchor
        this.getAnchor().add(castToString(value)); // StringType
        return value;
      default:
        return super.setProperty(hash, name, value);
      }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = castToString(value); // StringType
      } else if (name.equals("title")) {
        this.title = castToString(value); // StringType
      } else if (name.equals("anchor")) {
        this.getAnchor().add(castToString(value));
      } else
        return super.setProperty(name, value);
      return value;
    }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
      if (name.equals("name")) {
        this.name = null;
      } else if (name.equals("title")) {
        this.title = null;
      } else if (name.equals("anchor")) {
        this.getAnchor().remove(castToString(value));
      } else
        super.removeChild(name, value);
      
    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        return getNameElement();
      case 110371416:
        return getTitleElement();
      case -1413299531:
        return addAnchorElement();
      default:
        return super.makeProperty(hash, name);
      }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
      switch (hash) {
      case 3373707:
        /* name */ return new String[] { "string" };
      case 110371416:
        /* title */ return new String[] { "string" };
      case -1413299531:
        /* anchor */ return new String[] { "string" };
      default:
        return super.getTypesForProperty(hash, name);
      }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
      if (name.equals("name")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
      } else if (name.equals("title")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
      } else if (name.equals("anchor")) {
        throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.anchor");
      } else
        return super.addChild(name);
    }

    public ManifestPageComponent copy() {
      ManifestPageComponent dst = new ManifestPageComponent();
      copyValues(dst);
      return dst;
    }

    public void copyValues(ManifestPageComponent dst) {
      super.copyValues(dst);
      dst.name = name == null ? null : name.copy();
      dst.title = title == null ? null : title.copy();
      if (anchor != null) {
        dst.anchor = new ArrayList<StringType>();
        for (StringType i : anchor)
          dst.anchor.add(i.copy());
      }
      ;
    }

    @Override
    public boolean equalsDeep(Base other_) {
      if (!super.equalsDeep(other_))
        return false;
      if (!(other_ instanceof ManifestPageComponent))
        return false;
      ManifestPageComponent o = (ManifestPageComponent) other_;
      return compareDeep(name, o.name, true) && compareDeep(title, o.title, true)
          && compareDeep(anchor, o.anchor, true);
    }

    @Override
    public boolean equalsShallow(Base other_) {
      if (!super.equalsShallow(other_))
        return false;
      if (!(other_ instanceof ManifestPageComponent))
        return false;
      ManifestPageComponent o = (ManifestPageComponent) other_;
      return compareValues(name, o.name, true) && compareValues(title, o.title, true)
          && compareValues(anchor, o.anchor, true);
    }

    public boolean isEmpty() {
      return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, title, anchor);
    }

    public String fhirType() {
      return "ImplementationGuide.manifest.page";

    }

  }

  /**
   * A copyright statement relating to the implementation guide and/or its
   * contents. Copyright statements are generally legal restrictions on the use
   * and publishing of the implementation guide.
   */
  @Child(name = "copyright", type = {
      MarkdownType.class }, order = 0, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Use and/or publishing restrictions", formalDefinition = "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.")
  protected MarkdownType copyright;

  /**
   * The NPM package name for this Implementation Guide, used in the NPM package
   * distribution, which is the primary mechanism by which FHIR based tooling
   * manages IG dependencies. This value must be globally unique, and should be
   * assigned with care.
   */
  @Child(name = "packageId", type = { IdType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "NPM Package name for IG", formalDefinition = "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.")
  protected IdType packageId;

  /**
   * The license that applies to this Implementation Guide, using an SPDX license
   * code, or 'not-open-source'.
   */
  @Child(name = "license", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "SPDX license code for this IG (or not-open-source)", formalDefinition = "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/spdx-license")
  protected StringType license;

  /**
   * The version(s) of the FHIR specification that this ImplementationGuide
   * targets - e.g. describes how to use. The value of this element is the formal
   * version of the specification, without the revision number, e.g.
   * [publication].[major].[minor], which is 4.0.1. for this version.
   */
  @Child(name = "fhirVersion", type = {
    StringType.class }, order = 3, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "FHIR Version(s) this Implementation Guide targets", formalDefinition = "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/FHIR-version")
  protected List<StringType> fhirVersion;

  /**
   * Another implementation guide that this implementation depends on. Typically,
   * an implementation guide uses value sets, profiles etc.defined in other
   * implementation guides.
   */
  @Child(name = "dependsOn", type = {}, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Another Implementation guide this depends on", formalDefinition = "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.")
  protected List<ImplementationGuideDependsOnComponent> dependsOn;

  /**
   * A set of profiles that all resources covered by this implementation guide
   * must conform to.
   */
  @Child(name = "global", type = {}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
  @Description(shortDefinition = "Profiles that apply globally", formalDefinition = "A set of profiles that all resources covered by this implementation guide must conform to.")
  protected List<ImplementationGuideGlobalComponent> global;

  /**
   * The information needed by an IG publisher tool to publish the whole
   * implementation guide.
   */
  @Child(name = "definition", type = {}, order = 6, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Information needed to build the IG", formalDefinition = "The information needed by an IG publisher tool to publish the whole implementation guide.")
  protected ImplementationGuideDefinitionComponent definition;

  /**
   * Information about an assembled implementation guide, created by the
   * publication tooling.
   */
  @Child(name = "manifest", type = {}, order = 7, min = 0, max = 1, modifier = false, summary = false)
  @Description(shortDefinition = "Information about an assembled IG", formalDefinition = "Information about an assembled implementation guide, created by the publication tooling.")
  protected ImplementationGuideManifestComponent manifest;

  private static final long serialVersionUID = 415193005L;

  /**
   * Constructor
   */
  public ImplementationGuide() {
    super();
  }

  /**
   * Constructor
   */
  public ImplementationGuide(UriType url, StringType name, StringType status, IdType packageId) {
    super();
    this.url = url;
    this.name = name;
    this.status = status;
    this.packageId = packageId;
  }

  /**
   * @return {@link #url} (An absolute URI that is used to identify this
   *         implementation guide when it is referenced in a specification, model,
   *         design or an instance; also called its canonical identifier. This
   *         SHOULD be globally unique and SHOULD be a literal address at which at
   *         which an authoritative instance of this implementation guide is (or
   *         will be) published. This URL can be the target of a canonical
   *         reference. It SHALL remain the same when the implementation guide is
   *         stored on different servers.). This is the underlying object with id,
   *         value and extensions. The accessor "getUrl" gives direct access to
   *         the value
   */
  public UriType getUrlElement() {
    if (this.url == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.url");
      else if (Configuration.doAutoCreate())
        this.url = new UriType(); // bb
    return this.url;
  }

  public boolean hasUrlElement() {
    return this.url != null && !this.url.isEmpty();
  }

  public boolean hasUrl() {
    return this.url != null && !this.url.isEmpty();
  }

  /**
   * @param value {@link #url} (An absolute URI that is used to identify this
   *              implementation guide when it is referenced in a specification,
   *              model, design or an instance; also called its canonical
   *              identifier. This SHOULD be globally unique and SHOULD be a
   *              literal address at which at which an authoritative instance of
   *              this implementation guide is (or will be) published. This URL
   *              can be the target of a canonical reference. It SHALL remain the
   *              same when the implementation guide is stored on different
   *              servers.). This is the underlying object with id, value and
   *              extensions. The accessor "getUrl" gives direct access to the
   *              value
   */
  public ImplementationGuide setUrlElement(UriType value) {
    this.url = value;
    return this;
  }

  /**
   * @return An absolute URI that is used to identify this implementation guide
   *         when it is referenced in a specification, model, design or an
   *         instance; also called its canonical identifier. This SHOULD be
   *         globally unique and SHOULD be a literal address at which at which an
   *         authoritative instance of this implementation guide is (or will be)
   *         published. This URL can be the target of a canonical reference. It
   *         SHALL remain the same when the implementation guide is stored on
   *         different servers.
   */
  public String getUrl() {
    return this.url == null ? null : this.url.getValue();
  }

  /**
   * @param value An absolute URI that is used to identify this implementation
   *              guide when it is referenced in a specification, model, design or
   *              an instance; also called its canonical identifier. This SHOULD
   *              be globally unique and SHOULD be a literal address at which at
   *              which an authoritative instance of this implementation guide is
   *              (or will be) published. This URL can be the target of a
   *              canonical reference. It SHALL remain the same when the
   *              implementation guide is stored on different servers.
   */
  public ImplementationGuide setUrl(String value) {
    if (this.url == null)
      this.url = new UriType();
    this.url.setValue(value);
    return this;
  }

  /**
   * @return {@link #version} (The identifier that is used to identify this
   *         version of the implementation guide when it is referenced in a
   *         specification, model, design or instance. This is an arbitrary value
   *         managed by the implementation guide author and is not expected to be
   *         globally unique. For example, it might be a timestamp (e.g. yyyymmdd)
   *         if a managed version is not available. There is also no expectation
   *         that versions can be placed in a lexicographical sequence.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getVersion" gives direct access to the value
   */
  public StringType getVersionElement() {
    if (this.version == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.version");
      else if (Configuration.doAutoCreate())
        this.version = new StringType(); // bb
    return this.version;
  }

  public boolean hasVersionElement() {
    return this.version != null && !this.version.isEmpty();
  }

  public boolean hasVersion() {
    return this.version != null && !this.version.isEmpty();
  }

  /**
   * @param value {@link #version} (The identifier that is used to identify this
   *              version of the implementation guide when it is referenced in a
   *              specification, model, design or instance. This is an arbitrary
   *              value managed by the implementation guide author and is not
   *              expected to be globally unique. For example, it might be a
   *              timestamp (e.g. yyyymmdd) if a managed version is not available.
   *              There is also no expectation that versions can be placed in a
   *              lexicographical sequence.). This is the underlying object with
   *              id, value and extensions. The accessor "getVersion" gives direct
   *              access to the value
   */
  public ImplementationGuide setVersionElement(StringType value) {
    this.version = value;
    return this;
  }

  /**
   * @return The identifier that is used to identify this version of the
   *         implementation guide when it is referenced in a specification, model,
   *         design or instance. This is an arbitrary value managed by the
   *         implementation guide author and is not expected to be globally
   *         unique. For example, it might be a timestamp (e.g. yyyymmdd) if a
   *         managed version is not available. There is also no expectation that
   *         versions can be placed in a lexicographical sequence.
   */
  public String getVersion() {
    return this.version == null ? null : this.version.getValue();
  }

  /**
   * @param value The identifier that is used to identify this version of the
   *              implementation guide when it is referenced in a specification,
   *              model, design or instance. This is an arbitrary value managed by
   *              the implementation guide author and is not expected to be
   *              globally unique. For example, it might be a timestamp (e.g.
   *              yyyymmdd) if a managed version is not available. There is also
   *              no expectation that versions can be placed in a lexicographical
   *              sequence.
   */
  public ImplementationGuide setVersion(String value) {
    if (Utilities.noString(value))
      this.version = null;
    else {
      if (this.version == null)
        this.version = new StringType();
      this.version.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #name} (A natural language name identifying the implementation
   *         guide. This name should be usable as an identifier for the module by
   *         machine processing applications such as code generation.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getName" gives direct access to the value
   */
  public StringType getNameElement() {
    if (this.name == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.name");
      else if (Configuration.doAutoCreate())
        this.name = new StringType(); // bb
    return this.name;
  }

  public boolean hasNameElement() {
    return this.name != null && !this.name.isEmpty();
  }

  public boolean hasName() {
    return this.name != null && !this.name.isEmpty();
  }

  /**
   * @param value {@link #name} (A natural language name identifying the
   *              implementation guide. This name should be usable as an
   *              identifier for the module by machine processing applications
   *              such as code generation.). This is the underlying object with
   *              id, value and extensions. The accessor "getName" gives direct
   *              access to the value
   */
  public ImplementationGuide setNameElement(StringType value) {
    this.name = value;
    return this;
  }

  /**
   * @return A natural language name identifying the implementation guide. This
   *         name should be usable as an identifier for the module by machine
   *         processing applications such as code generation.
   */
  public String getName() {
    return this.name == null ? null : this.name.getValue();
  }

  /**
   * @param value A natural language name identifying the implementation guide.
   *              This name should be usable as an identifier for the module by
   *              machine processing applications such as code generation.
   */
  public ImplementationGuide setName(String value) {
    if (this.name == null)
      this.name = new StringType();
    this.name.setValue(value);
    return this;
  }

  /**
   * @return {@link #title} (A short, descriptive, user-friendly title for the
   *         implementation guide.). This is the underlying object with id, value
   *         and extensions. The accessor "getTitle" gives direct access to the
   *         value
   */
  public StringType getTitleElement() {
    if (this.title == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.title");
      else if (Configuration.doAutoCreate())
        this.title = new StringType(); // bb
    return this.title;
  }

  public boolean hasTitleElement() {
    return this.title != null && !this.title.isEmpty();
  }

  public boolean hasTitle() {
    return this.title != null && !this.title.isEmpty();
  }

  /**
   * @param value {@link #title} (A short, descriptive, user-friendly title for
   *              the implementation guide.). This is the underlying object with
   *              id, value and extensions. The accessor "getTitle" gives direct
   *              access to the value
   */
  public ImplementationGuide setTitleElement(StringType value) {
    this.title = value;
    return this;
  }

  /**
   * @return A short, descriptive, user-friendly title for the implementation
   *         guide.
   */
  public String getTitle() {
    return this.title == null ? null : this.title.getValue();
  }

  /**
   * @param value A short, descriptive, user-friendly title for the implementation
   *              guide.
   */
  public ImplementationGuide setTitle(String value) {
    if (Utilities.noString(value))
      this.title = null;
    else {
      if (this.title == null)
        this.title = new StringType();
      this.title.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #status} (The status of this implementation guide. Enables
   *         tracking the life-cycle of the content.). This is the underlying
   *         object with id, value and extensions. The accessor "getStatus" gives
   *         direct access to the value
   */
  public StringType getStatusElement() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.status");
      else if (Configuration.doAutoCreate())
        this.status = new StringType(); // bb
    return this.status;
  }

  public boolean hasStatusElement() {
    return this.status != null && !this.status.isEmpty();
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (The status of this implementation guide.
   *              Enables tracking the life-cycle of the content.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getStatus" gives direct access to the value
   */
  public ImplementationGuide setStatusElement(StringType value) {
    this.status = value;
    return this;
  }

  /**
   * @return The status of this implementation guide. Enables tracking the
   *         life-cycle of the content.
   */
  public String getStatus() {
    return this.status == null ? null : this.status.getValue();
  }

  /**
   * @param value The status of this implementation guide. Enables tracking the
   *              life-cycle of the content.
   */
  public ImplementationGuide setStatus(String value) {
    if (this.status == null)
      this.status = new StringType();
    this.status.setValue(value);
    return this;
  }

  /**
   * @return {@link #experimental} (A Boolean value to indicate that this
   *         implementation guide is authored for testing purposes (or
   *         education/evaluation/marketing) and is not intended to be used for
   *         genuine usage.). This is the underlying object with id, value and
   *         extensions. The accessor "getExperimental" gives direct access to the
   *         value
   */
  public BooleanType getExperimentalElement() {
    if (this.experimental == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.experimental");
      else if (Configuration.doAutoCreate())
        this.experimental = new BooleanType(); // bb
    return this.experimental;
  }

  public boolean hasExperimentalElement() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  public boolean hasExperimental() {
    return this.experimental != null && !this.experimental.isEmpty();
  }

  /**
   * @param value {@link #experimental} (A Boolean value to indicate that this
   *              implementation guide is authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.). This is the underlying object with id,
   *              value and extensions. The accessor "getExperimental" gives
   *              direct access to the value
   */
  public ImplementationGuide setExperimentalElement(BooleanType value) {
    this.experimental = value;
    return this;
  }

  /**
   * @return A Boolean value to indicate that this implementation guide is
   *         authored for testing purposes (or education/evaluation/marketing) and
   *         is not intended to be used for genuine usage.
   */
  public boolean getExperimental() {
    return this.experimental == null || this.experimental.isEmpty() ? false : this.experimental.getValue();
  }

  /**
   * @param value A Boolean value to indicate that this implementation guide is
   *              authored for testing purposes (or
   *              education/evaluation/marketing) and is not intended to be used
   *              for genuine usage.
   */
  public ImplementationGuide setExperimental(boolean value) {
    if (this.experimental == null)
      this.experimental = new BooleanType();
    this.experimental.setValue(value);
    return this;
  }

  /**
   * @return {@link #date} (The date (and optionally time) when the implementation
   *         guide was published. The date must change when the business version
   *         changes and it must change if the status code changes. In addition,
   *         it should change when the substantive content of the implementation
   *         guide changes.). This is the underlying object with id, value and
   *         extensions. The accessor "getDate" gives direct access to the value
   */
  public DateTimeType getDateElement() {
    if (this.date == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.date");
      else if (Configuration.doAutoCreate())
        this.date = new DateTimeType(); // bb
    return this.date;
  }

  public boolean hasDateElement() {
    return this.date != null && !this.date.isEmpty();
  }

  public boolean hasDate() {
    return this.date != null && !this.date.isEmpty();
  }

  /**
   * @param value {@link #date} (The date (and optionally time) when the
   *              implementation guide was published. The date must change when
   *              the business version changes and it must change if the status
   *              code changes. In addition, it should change when the substantive
   *              content of the implementation guide changes.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getDate" gives direct access to the value
   */
  public ImplementationGuide setDateElement(DateTimeType value) {
    this.date = value;
    return this;
  }

  /**
   * @return The date (and optionally time) when the implementation guide was
   *         published. The date must change when the business version changes and
   *         it must change if the status code changes. In addition, it should
   *         change when the substantive content of the implementation guide
   *         changes.
   */
  public Date getDate() {
    return this.date == null ? null : this.date.getValue();
  }

  /**
   * @param value The date (and optionally time) when the implementation guide was
   *              published. The date must change when the business version
   *              changes and it must change if the status code changes. In
   *              addition, it should change when the substantive content of the
   *              implementation guide changes.
   */
  public ImplementationGuide setDate(Date value) {
    if (value == null)
      this.date = null;
    else {
      if (this.date == null)
        this.date = new DateTimeType();
      this.date.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #publisher} (The name of the organization or individual that
   *         published the implementation guide.). This is the underlying object
   *         with id, value and extensions. The accessor "getPublisher" gives
   *         direct access to the value
   */
  public StringType getPublisherElement() {
    if (this.publisher == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.publisher");
      else if (Configuration.doAutoCreate())
        this.publisher = new StringType(); // bb
    return this.publisher;
  }

  public boolean hasPublisherElement() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  public boolean hasPublisher() {
    return this.publisher != null && !this.publisher.isEmpty();
  }

  /**
   * @param value {@link #publisher} (The name of the organization or individual
   *              that published the implementation guide.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getPublisher" gives direct access to the value
   */
  public ImplementationGuide setPublisherElement(StringType value) {
    this.publisher = value;
    return this;
  }

  /**
   * @return The name of the organization or individual that published the
   *         implementation guide.
   */
  public String getPublisher() {
    return this.publisher == null ? null : this.publisher.getValue();
  }

  /**
   * @param value The name of the organization or individual that published the
   *              implementation guide.
   */
  public ImplementationGuide setPublisher(String value) {
    if (Utilities.noString(value))
      this.publisher = null;
    else {
      if (this.publisher == null)
        this.publisher = new StringType();
      this.publisher.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #contact} (Contact details to assist a user in finding and
   *         communicating with the publisher.)
   */
  public List<ContactDetail> getContact() {
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    return this.contact;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setContact(List<ContactDetail> theContact) {
    this.contact = theContact;
    return this;
  }

  public boolean hasContact() {
    if (this.contact == null)
      return false;
    for (ContactDetail item : this.contact)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ContactDetail addContact() { // 3
    ContactDetail t = new ContactDetail();
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return t;
  }

  public ImplementationGuide addContact(ContactDetail t) { // 3
    if (t == null)
      return this;
    if (this.contact == null)
      this.contact = new ArrayList<ContactDetail>();
    this.contact.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #contact}, creating it
   *         if it does not already exist
   */
  public ContactDetail getContactFirstRep() {
    if (getContact().isEmpty()) {
      addContact();
    }
    return getContact().get(0);
  }

  /**
   * @return {@link #description} (A free text natural language description of the
   *         implementation guide from a consumer's perspective.). This is the
   *         underlying object with id, value and extensions. The accessor
   *         "getDescription" gives direct access to the value
   */
  public MarkdownType getDescriptionElement() {
    if (this.description == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.description");
      else if (Configuration.doAutoCreate())
        this.description = new MarkdownType(); // bb
    return this.description;
  }

  public boolean hasDescriptionElement() {
    return this.description != null && !this.description.isEmpty();
  }

  public boolean hasDescription() {
    return this.description != null && !this.description.isEmpty();
  }

  /**
   * @param value {@link #description} (A free text natural language description
   *              of the implementation guide from a consumer's perspective.).
   *              This is the underlying object with id, value and extensions. The
   *              accessor "getDescription" gives direct access to the value
   */
  public ImplementationGuide setDescriptionElement(MarkdownType value) {
    this.description = value;
    return this;
  }

  /**
   * @return A free text natural language description of the implementation guide
   *         from a consumer's perspective.
   */
  public String getDescription() {
    return this.description == null ? null : this.description.getValue();
  }

  /**
   * @param value A free text natural language description of the implementation
   *              guide from a consumer's perspective.
   */
  public ImplementationGuide setDescription(String value) {
    if (value == null)
      this.description = null;
    else {
      if (this.description == null)
        this.description = new MarkdownType();
      this.description.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #useContext} (The content was developed with a focus and
   *         intent of supporting the contexts that are listed. These contexts may
   *         be general categories (gender, age, ...) or may be references to
   *         specific programs (insurance plans, studies, ...) and may be used to
   *         assist with indexing and searching for appropriate implementation
   *         guide instances.)
   */
  public List<UsageContext> getUseContext() {
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    return this.useContext;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setUseContext(List<UsageContext> theUseContext) {
    this.useContext = theUseContext;
    return this;
  }

  public boolean hasUseContext() {
    if (this.useContext == null)
      return false;
    for (UsageContext item : this.useContext)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public UsageContext addUseContext() { // 3
    UsageContext t = new UsageContext();
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return t;
  }

  public ImplementationGuide addUseContext(UsageContext t) { // 3
    if (t == null)
      return this;
    if (this.useContext == null)
      this.useContext = new ArrayList<UsageContext>();
    this.useContext.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #useContext}, creating
   *         it if it does not already exist
   */
  public UsageContext getUseContextFirstRep() {
    if (getUseContext().isEmpty()) {
      addUseContext();
    }
    return getUseContext().get(0);
  }

  /**
   * @return {@link #jurisdiction} (A legal or geographic region in which the
   *         implementation guide is intended to be used.)
   */
  public List<CodeableConcept> getJurisdiction() {
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    return this.jurisdiction;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setJurisdiction(List<CodeableConcept> theJurisdiction) {
    this.jurisdiction = theJurisdiction;
    return this;
  }

  public boolean hasJurisdiction() {
    if (this.jurisdiction == null)
      return false;
    for (CodeableConcept item : this.jurisdiction)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public CodeableConcept addJurisdiction() { // 3
    CodeableConcept t = new CodeableConcept();
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return t;
  }

  public ImplementationGuide addJurisdiction(CodeableConcept t) { // 3
    if (t == null)
      return this;
    if (this.jurisdiction == null)
      this.jurisdiction = new ArrayList<CodeableConcept>();
    this.jurisdiction.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #jurisdiction},
   *         creating it if it does not already exist
   */
  public CodeableConcept getJurisdictionFirstRep() {
    if (getJurisdiction().isEmpty()) {
      addJurisdiction();
    }
    return getJurisdiction().get(0);
  }

  /**
   * @return {@link #copyright} (A copyright statement relating to the
   *         implementation guide and/or its contents. Copyright statements are
   *         generally legal restrictions on the use and publishing of the
   *         implementation guide.). This is the underlying object with id, value
   *         and extensions. The accessor "getCopyright" gives direct access to
   *         the value
   */
  public MarkdownType getCopyrightElement() {
    if (this.copyright == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.copyright");
      else if (Configuration.doAutoCreate())
        this.copyright = new MarkdownType(); // bb
    return this.copyright;
  }

  public boolean hasCopyrightElement() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  public boolean hasCopyright() {
    return this.copyright != null && !this.copyright.isEmpty();
  }

  /**
   * @param value {@link #copyright} (A copyright statement relating to the
   *              implementation guide and/or its contents. Copyright statements
   *              are generally legal restrictions on the use and publishing of
   *              the implementation guide.). This is the underlying object with
   *              id, value and extensions. The accessor "getCopyright" gives
   *              direct access to the value
   */
  public ImplementationGuide setCopyrightElement(MarkdownType value) {
    this.copyright = value;
    return this;
  }

  /**
   * @return A copyright statement relating to the implementation guide and/or its
   *         contents. Copyright statements are generally legal restrictions on
   *         the use and publishing of the implementation guide.
   */
  public String getCopyright() {
    return this.copyright == null ? null : this.copyright.getValue();
  }

  /**
   * @param value A copyright statement relating to the implementation guide
   *              and/or its contents. Copyright statements are generally legal
   *              restrictions on the use and publishing of the implementation
   *              guide.
   */
  public ImplementationGuide setCopyright(String value) {
    if (value == null)
      this.copyright = null;
    else {
      if (this.copyright == null)
        this.copyright = new MarkdownType();
      this.copyright.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #packageId} (The NPM package name for this Implementation
   *         Guide, used in the NPM package distribution, which is the primary
   *         mechanism by which FHIR based tooling manages IG dependencies. This
   *         value must be globally unique, and should be assigned with care.).
   *         This is the underlying object with id, value and extensions. The
   *         accessor "getPackageId" gives direct access to the value
   */
  public IdType getPackageIdElement() {
    if (this.packageId == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.packageId");
      else if (Configuration.doAutoCreate())
        this.packageId = new IdType(); // bb
    return this.packageId;
  }

  public boolean hasPackageIdElement() {
    return this.packageId != null && !this.packageId.isEmpty();
  }

  public boolean hasPackageId() {
    return this.packageId != null && !this.packageId.isEmpty();
  }

  /**
   * @param value {@link #packageId} (The NPM package name for this Implementation
   *              Guide, used in the NPM package distribution, which is the
   *              primary mechanism by which FHIR based tooling manages IG
   *              dependencies. This value must be globally unique, and should be
   *              assigned with care.). This is the underlying object with id,
   *              value and extensions. The accessor "getPackageId" gives direct
   *              access to the value
   */
  public ImplementationGuide setPackageIdElement(IdType value) {
    this.packageId = value;
    return this;
  }

  /**
   * @return The NPM package name for this Implementation Guide, used in the NPM
   *         package distribution, which is the primary mechanism by which FHIR
   *         based tooling manages IG dependencies. This value must be globally
   *         unique, and should be assigned with care.
   */
  public String getPackageId() {
    return this.packageId == null ? null : this.packageId.getValue();
  }

  /**
   * @param value The NPM package name for this Implementation Guide, used in the
   *              NPM package distribution, which is the primary mechanism by
   *              which FHIR based tooling manages IG dependencies. This value
   *              must be globally unique, and should be assigned with care.
   */
  public ImplementationGuide setPackageId(String value) {
    if (this.packageId == null)
      this.packageId = new IdType();
    this.packageId.setValue(value);
    return this;
  }

  /**
   * @return {@link #license} (The license that applies to this Implementation
   *         Guide, using an SPDX license code, or 'not-open-source'.). This is
   *         the underlying object with id, value and extensions. The accessor
   *         "getLicense" gives direct access to the value
   */
  public StringType getLicenseElement() {
    if (this.license == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.license");
      else if (Configuration.doAutoCreate())
        this.license = new StringType(); // bb
    return this.license;
  }

  public boolean hasLicenseElement() {
    return this.license != null && !this.license.isEmpty();
  }

  public boolean hasLicense() {
    return this.license != null && !this.license.isEmpty();
  }

  /**
   * @param value {@link #license} (The license that applies to this
   *              Implementation Guide, using an SPDX license code, or
   *              'not-open-source'.). This is the underlying object with id,
   *              value and extensions. The accessor "getLicense" gives direct
   *              access to the value
   */
  public ImplementationGuide setLicenseElement(StringType value) {
    this.license = value;
    return this;
  }

  /**
   * @return The license that applies to this Implementation Guide, using an SPDX
   *         license code, or 'not-open-source'.
   */
  public String getLicense() {
    return this.license == null ? null : this.license.getValue();
  }

  /**
   * @param value The license that applies to this Implementation Guide, using an
   *              SPDX license code, or 'not-open-source'.
   */
  public ImplementationGuide setLicense(String value) {
    if (value == null)
      this.license = null;
    else {
      if (this.license == null)
        this.license = new StringType();
      this.license.setValue(value);
    }
    return this;
  }

  /**
   * @return {@link #fhirVersion} (The version(s) of the FHIR specification that
   *         this ImplementationGuide targets - e.g. describes how to use. The
   *         value of this element is the formal version of the specification,
   *         without the revision number, e.g. [publication].[major].[minor],
   *         which is 4.0.1. for this version.)
   */
  public List<StringType> getFhirVersion() {
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<StringType>();
    return this.fhirVersion;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setFhirVersion(List<StringType> theFhirVersion) {
    this.fhirVersion = theFhirVersion;
    return this;
  }

  public boolean hasFhirVersion() {
    if (this.fhirVersion == null)
      return false;
    for (StringType item : this.fhirVersion)
      if (!item.isEmpty())
        return true;
    return false;
  }

  /**
   * @return {@link #fhirVersion} (The version(s) of the FHIR specification that
   *         this ImplementationGuide targets - e.g. describes how to use. The
   *         value of this element is the formal version of the specification,
   *         without the revision number, e.g. [publication].[major].[minor],
   *         which is 4.0.1. for this version.)
   */
  public StringType addFhirVersionElement() {// 2
    StringType t = new StringType();
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<StringType>();
    this.fhirVersion.add(t);
    return t;
  }

  /**
   * @param value {@link #fhirVersion} (The version(s) of the FHIR specification
   *              that this ImplementationGuide targets - e.g. describes how to
   *              use. The value of this element is the formal version of the
   *              specification, without the revision number, e.g.
   *              [publication].[major].[minor], which is 4.0.1. for this
   *              version.)
   */
  public ImplementationGuide addFhirVersion(String value) { // 1
    StringType t = new StringType();
    t.setValue(value);
    if (this.fhirVersion == null)
      this.fhirVersion = new ArrayList<StringType>();
    this.fhirVersion.add(t);
    return this;
  }

  /**
   * @param value {@link #fhirVersion} (The version(s) of the FHIR specification
   *              that this ImplementationGuide targets - e.g. describes how to
   *              use. The value of this element is the formal version of the
   *              specification, without the revision number, e.g.
   *              [publication].[major].[minor], which is 4.0.1. for this
   *              version.)
   */
  public boolean hasFhirVersion(String value) {
    if (this.fhirVersion == null)
      return false;
    for (StringType v : this.fhirVersion)
      if (v.getValue().equals(value)) // code
        return true;
    return false;
  }

  /**
   * @return {@link #dependsOn} (Another implementation guide that this
   *         implementation depends on. Typically, an implementation guide uses
   *         value sets, profiles etc.defined in other implementation guides.)
   */
  public List<ImplementationGuideDependsOnComponent> getDependsOn() {
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    return this.dependsOn;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setDependsOn(List<ImplementationGuideDependsOnComponent> theDependsOn) {
    this.dependsOn = theDependsOn;
    return this;
  }

  public boolean hasDependsOn() {
    if (this.dependsOn == null)
      return false;
    for (ImplementationGuideDependsOnComponent item : this.dependsOn)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImplementationGuideDependsOnComponent addDependsOn() { // 3
    ImplementationGuideDependsOnComponent t = new ImplementationGuideDependsOnComponent();
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    this.dependsOn.add(t);
    return t;
  }

  public ImplementationGuide addDependsOn(ImplementationGuideDependsOnComponent t) { // 3
    if (t == null)
      return this;
    if (this.dependsOn == null)
      this.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
    this.dependsOn.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #dependsOn}, creating
   *         it if it does not already exist
   */
  public ImplementationGuideDependsOnComponent getDependsOnFirstRep() {
    if (getDependsOn().isEmpty()) {
      addDependsOn();
    }
    return getDependsOn().get(0);
  }

  /**
   * @return {@link #global} (A set of profiles that all resources covered by this
   *         implementation guide must conform to.)
   */
  public List<ImplementationGuideGlobalComponent> getGlobal() {
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    return this.global;
  }

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public ImplementationGuide setGlobal(List<ImplementationGuideGlobalComponent> theGlobal) {
    this.global = theGlobal;
    return this;
  }

  public boolean hasGlobal() {
    if (this.global == null)
      return false;
    for (ImplementationGuideGlobalComponent item : this.global)
      if (!item.isEmpty())
        return true;
    return false;
  }

  public ImplementationGuideGlobalComponent addGlobal() { // 3
    ImplementationGuideGlobalComponent t = new ImplementationGuideGlobalComponent();
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    this.global.add(t);
    return t;
  }

  public ImplementationGuide addGlobal(ImplementationGuideGlobalComponent t) { // 3
    if (t == null)
      return this;
    if (this.global == null)
      this.global = new ArrayList<ImplementationGuideGlobalComponent>();
    this.global.add(t);
    return this;
  }

  /**
   * @return The first repetition of repeating field {@link #global}, creating it
   *         if it does not already exist
   */
  public ImplementationGuideGlobalComponent getGlobalFirstRep() {
    if (getGlobal().isEmpty()) {
      addGlobal();
    }
    return getGlobal().get(0);
  }

  /**
   * @return {@link #definition} (The information needed by an IG publisher tool
   *         to publish the whole implementation guide.)
   */
  public ImplementationGuideDefinitionComponent getDefinition() {
    if (this.definition == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.definition");
      else if (Configuration.doAutoCreate())
        this.definition = new ImplementationGuideDefinitionComponent(); // cc
    return this.definition;
  }

  public boolean hasDefinition() {
    return this.definition != null && !this.definition.isEmpty();
  }

  /**
   * @param value {@link #definition} (The information needed by an IG publisher
   *              tool to publish the whole implementation guide.)
   */
  public ImplementationGuide setDefinition(ImplementationGuideDefinitionComponent value) {
    this.definition = value;
    return this;
  }

  /**
   * @return {@link #manifest} (Information about an assembled implementation
   *         guide, created by the publication tooling.)
   */
  public ImplementationGuideManifestComponent getManifest() {
    if (this.manifest == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create ImplementationGuide.manifest");
      else if (Configuration.doAutoCreate())
        this.manifest = new ImplementationGuideManifestComponent(); // cc
    return this.manifest;
  }

  public boolean hasManifest() {
    return this.manifest != null && !this.manifest.isEmpty();
  }

  /**
   * @param value {@link #manifest} (Information about an assembled implementation
   *              guide, created by the publication tooling.)
   */
  public ImplementationGuide setManifest(ImplementationGuideManifestComponent value) {
    this.manifest = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("url", "uri",
        "An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this implementation guide is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the implementation guide is stored on different servers.",
        0, 1, url));
    children.add(new Property("version", "string",
        "The identifier that is used to identify this version of the implementation guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
        0, 1, version));
    children.add(new Property("name", "string",
        "A natural language name identifying the implementation guide. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
        0, 1, name));
    children.add(new Property("title", "string",
        "A short, descriptive, user-friendly title for the implementation guide.", 0, 1, title));
    children.add(new Property("status", "string",
        "The status of this implementation guide. Enables tracking the life-cycle of the content.", 0, 1, status));
    children.add(new Property("experimental", "boolean",
        "A Boolean value to indicate that this implementation guide is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
        0, 1, experimental));
    children.add(new Property("date", "dateTime",
        "The date  (and optionally time) when the implementation guide was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.",
        0, 1, date));
    children.add(new Property("publisher", "string",
        "The name of the organization or individual that published the implementation guide.", 0, 1, publisher));
    children.add(new Property("contact", "ContactDetail",
        "Contact details to assist a user in finding and communicating with the publisher.", 0,
        java.lang.Integer.MAX_VALUE, contact));
    children.add(new Property("description", "markdown",
        "A free text natural language description of the implementation guide from a consumer's perspective.", 0, 1,
        description));
    children.add(new Property("useContext", "UsageContext",
        "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.",
        0, java.lang.Integer.MAX_VALUE, useContext));
    children.add(new Property("jurisdiction", "CodeableConcept",
        "A legal or geographic region in which the implementation guide is intended to be used.", 0,
        java.lang.Integer.MAX_VALUE, jurisdiction));
    children.add(new Property("copyright", "markdown",
        "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.",
        0, 1, copyright));
    children.add(new Property("packageId", "id",
        "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.",
        0, 1, packageId));
    children.add(new Property("license", "string",
        "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.", 0,
        1, license));
    children.add(new Property("fhirVersion", "string",
        "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.",
        0, java.lang.Integer.MAX_VALUE, fhirVersion));
    children.add(new Property("dependsOn", "",
        "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.",
        0, java.lang.Integer.MAX_VALUE, dependsOn));
    children.add(new Property("global", "",
        "A set of profiles that all resources covered by this implementation guide must conform to.", 0,
        java.lang.Integer.MAX_VALUE, global));
    children.add(new Property("definition", "",
        "The information needed by an IG publisher tool to publish the whole implementation guide.", 0, 1, definition));
    children.add(new Property("manifest", "",
        "Information about an assembled implementation guide, created by the publication tooling.", 0, 1, manifest));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 116079:
      /* url */ return new Property("url", "uri",
          "An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this implementation guide is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the implementation guide is stored on different servers.",
          0, 1, url);
    case 351608024:
      /* version */ return new Property("version", "string",
          "The identifier that is used to identify this version of the implementation guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.",
          0, 1, version);
    case 3373707:
      /* name */ return new Property("name", "string",
          "A natural language name identifying the implementation guide. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
          0, 1, name);
    case 110371416:
      /* title */ return new Property("title", "string",
          "A short, descriptive, user-friendly title for the implementation guide.", 0, 1, title);
    case -892481550:
      /* status */ return new Property("status", "string",
          "The status of this implementation guide. Enables tracking the life-cycle of the content.", 0, 1, status);
    case -404562712:
      /* experimental */ return new Property("experimental", "boolean",
          "A Boolean value to indicate that this implementation guide is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
          0, 1, experimental);
    case 3076014:
      /* date */ return new Property("date", "dateTime",
          "The date  (and optionally time) when the implementation guide was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.",
          0, 1, date);
    case 1447404028:
      /* publisher */ return new Property("publisher", "string",
          "The name of the organization or individual that published the implementation guide.", 0, 1, publisher);
    case 951526432:
      /* contact */ return new Property("contact", "ContactDetail",
          "Contact details to assist a user in finding and communicating with the publisher.", 0,
          java.lang.Integer.MAX_VALUE, contact);
    case -1724546052:
      /* description */ return new Property("description", "markdown",
          "A free text natural language description of the implementation guide from a consumer's perspective.", 0, 1,
          description);
    case -669707736:
      /* useContext */ return new Property("useContext", "UsageContext",
          "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate implementation guide instances.",
          0, java.lang.Integer.MAX_VALUE, useContext);
    case -507075711:
      /* jurisdiction */ return new Property("jurisdiction", "CodeableConcept",
          "A legal or geographic region in which the implementation guide is intended to be used.", 0,
          java.lang.Integer.MAX_VALUE, jurisdiction);
    case 1522889671:
      /* copyright */ return new Property("copyright", "markdown",
          "A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.",
          0, 1, copyright);
    case 1802060801:
      /* packageId */ return new Property("packageId", "id",
          "The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.",
          0, 1, packageId);
    case 166757441:
      /* license */ return new Property("license", "string",
          "The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.", 0,
          1, license);
    case 461006061:
      /* fhirVersion */ return new Property("fhirVersion", "string",
          "The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.",
          0, java.lang.Integer.MAX_VALUE, fhirVersion);
    case -1109214266:
      /* dependsOn */ return new Property("dependsOn", "",
          "Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.",
          0, java.lang.Integer.MAX_VALUE, dependsOn);
    case -1243020381:
      /* global */ return new Property("global", "",
          "A set of profiles that all resources covered by this implementation guide must conform to.", 0,
          java.lang.Integer.MAX_VALUE, global);
    case -1014418093:
      /* definition */ return new Property("definition", "",
          "The information needed by an IG publisher tool to publish the whole implementation guide.", 0, 1,
          definition);
    case 130625071:
      /* manifest */ return new Property("manifest", "",
          "Information about an assembled implementation guide, created by the publication tooling.", 0, 1, manifest);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return this.url == null ? new Base[0] : new Base[] { this.url }; // UriType
    case 351608024:
      /* version */ return this.version == null ? new Base[0] : new Base[] { this.version }; // StringType
    case 3373707:
      /* name */ return this.name == null ? new Base[0] : new Base[] { this.name }; // StringType
    case 110371416:
      /* title */ return this.title == null ? new Base[0] : new Base[] { this.title }; // StringType
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // StringType
    case -404562712:
      /* experimental */ return this.experimental == null ? new Base[0] : new Base[] { this.experimental }; // BooleanType
    case 3076014:
      /* date */ return this.date == null ? new Base[0] : new Base[] { this.date }; // DateTimeType
    case 1447404028:
      /* publisher */ return this.publisher == null ? new Base[0] : new Base[] { this.publisher }; // StringType
    case 951526432:
      /* contact */ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
    case -1724546052:
      /* description */ return this.description == null ? new Base[0] : new Base[] { this.description }; // MarkdownType
    case -669707736:
      /* useContext */ return this.useContext == null ? new Base[0]
          : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
    case -507075711:
      /* jurisdiction */ return this.jurisdiction == null ? new Base[0]
          : this.jurisdiction.toArray(new Base[this.jurisdiction.size()]); // CodeableConcept
    case 1522889671:
      /* copyright */ return this.copyright == null ? new Base[0] : new Base[] { this.copyright }; // MarkdownType
    case 1802060801:
      /* packageId */ return this.packageId == null ? new Base[0] : new Base[] { this.packageId }; // IdType
    case 166757441:
      /* license */ return this.license == null ? new Base[0] : new Base[] { this.license }; //StringType
    case 461006061:
      /* fhirVersion */ return this.fhirVersion == null ? new Base[0]
          : this.fhirVersion.toArray(new Base[this.fhirVersion.size()]); // StringType
    case -1109214266:
      /* dependsOn */ return this.dependsOn == null ? new Base[0]
          : this.dependsOn.toArray(new Base[this.dependsOn.size()]); // ImplementationGuideDependsOnComponent
    case -1243020381:
      /* global */ return this.global == null ? new Base[0] : this.global.toArray(new Base[this.global.size()]); // ImplementationGuideGlobalComponent
    case -1014418093:
      /* definition */ return this.definition == null ? new Base[0] : new Base[] { this.definition }; // ImplementationGuideDefinitionComponent
    case 130625071:
      /* manifest */ return this.manifest == null ? new Base[0] : new Base[] { this.manifest }; // ImplementationGuideManifestComponent
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 116079: // url
      this.url = castToUri(value); // UriType
      return value;
    case 351608024: // version
      this.version = castToString(value); // StringType
      return value;
    case 3373707: // name
      this.name = castToString(value); // StringType
      return value;
    case 110371416: // title
      this.title = castToString(value); // StringType
      return value;
    case -892481550: // status
      this.status = castToString(value); // StringType
      return value;
    case -404562712: // experimental
      this.experimental = castToBoolean(value); // BooleanType
      return value;
    case 3076014: // date
      this.date = castToDateTime(value); // DateTimeType
      return value;
    case 1447404028: // publisher
      this.publisher = castToString(value); // StringType
      return value;
    case 951526432: // contact
      this.getContact().add(castToContactDetail(value)); // ContactDetail
      return value;
    case -1724546052: // description
      this.description = castToMarkdown(value); // MarkdownType
      return value;
    case -669707736: // useContext
      this.getUseContext().add(castToUsageContext(value)); // UsageContext
      return value;
    case -507075711: // jurisdiction
      this.getJurisdiction().add(castToCodeableConcept(value)); // CodeableConcept
      return value;
    case 1522889671: // copyright
      this.copyright = castToMarkdown(value); // MarkdownType
      return value;
    case 1802060801: // packageId
      this.packageId = castToId(value); // IdType
      return value;
    case 166757441: // license
      this.license = castToString(value); // StringType
      return value;
    case 461006061: // fhirVersion
      this.getFhirVersion().add(castToString(value)); // StringType
      return value;
    case -1109214266: // dependsOn
      this.getDependsOn().add((ImplementationGuideDependsOnComponent) value); // ImplementationGuideDependsOnComponent
      return value;
    case -1243020381: // global
      this.getGlobal().add((ImplementationGuideGlobalComponent) value); // ImplementationGuideGlobalComponent
      return value;
    case -1014418093: // definition
      this.definition = (ImplementationGuideDefinitionComponent) value; // ImplementationGuideDefinitionComponent
      return value;
    case 130625071: // manifest
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = castToUri(value); // UriType
    } else if (name.equals("version")) {
      this.version = castToString(value); // StringType
    } else if (name.equals("name")) {
      this.name = castToString(value); // StringType
    } else if (name.equals("title")) {
      this.title = castToString(value); // StringType
    } else if (name.equals("status")) {
      this.status = castToString(value); // StringType
    } else if (name.equals("experimental")) {
      this.experimental = castToBoolean(value); // BooleanType
    } else if (name.equals("date")) {
      this.date = castToDateTime(value); // DateTimeType
    } else if (name.equals("publisher")) {
      this.publisher = castToString(value); // StringType
    } else if (name.equals("contact")) {
      this.getContact().add(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = castToMarkdown(value); // MarkdownType
    } else if (name.equals("useContext")) {
      this.getUseContext().add(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().add(castToCodeableConcept(value));
    } else if (name.equals("copyright")) {
      this.copyright = castToMarkdown(value); // MarkdownType
    } else if (name.equals("packageId")) {
      this.packageId = castToId(value); // IdType
    } else if (name.equals("license")) {
      this.license = castToString(value); // StringType
    } else if (name.equals("fhirVersion")) {
      this.getFhirVersion().add(castToString(value));
    } else if (name.equals("dependsOn")) {
      this.getDependsOn().add((ImplementationGuideDependsOnComponent) value);
    } else if (name.equals("global")) {
      this.getGlobal().add((ImplementationGuideGlobalComponent) value);
    } else if (name.equals("definition")) {
      this.definition = (ImplementationGuideDefinitionComponent) value; // ImplementationGuideDefinitionComponent
    } else if (name.equals("manifest")) {
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("url")) {
      this.url = null;
    } else if (name.equals("version")) {
      this.version = null;
    } else if (name.equals("name")) {
      this.name = null;
    } else if (name.equals("title")) {
      this.title = null;
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("experimental")) {
      this.experimental = null;
    } else if (name.equals("date")) {
      this.date = null;
    } else if (name.equals("publisher")) {
      this.publisher = null;
    } else if (name.equals("contact")) {
      this.getContact().remove(castToContactDetail(value));
    } else if (name.equals("description")) {
      this.description = null;
    } else if (name.equals("useContext")) {
      this.getUseContext().remove(castToUsageContext(value));
    } else if (name.equals("jurisdiction")) {
      this.getJurisdiction().remove(castToCodeableConcept(value));
    } else if (name.equals("copyright")) {
      this.copyright = null;
    } else if (name.equals("packageId")) {
      this.packageId = null;
    } else if (name.equals("license")) {
      this.license = null;
    } else if (name.equals("fhirVersion")) {
      this.getFhirVersion().remove(castToString(value));
    } else if (name.equals("dependsOn")) {
      this.getDependsOn().remove((ImplementationGuideDependsOnComponent) value);
    } else if (name.equals("global")) {
      this.getGlobal().remove((ImplementationGuideGlobalComponent) value);
    } else if (name.equals("definition")) {
      this.definition = null;
    } else if (name.equals("manifest")) {
      this.manifest = (ImplementationGuideManifestComponent) value; // ImplementationGuideManifestComponent
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      return getUrlElement();
    case 351608024:
      return getVersionElement();
    case 3373707:
      return getNameElement();
    case 110371416:
      return getTitleElement();
    case -892481550:
      return getStatusElement();
    case -404562712:
      return getExperimentalElement();
    case 3076014:
      return getDateElement();
    case 1447404028:
      return getPublisherElement();
    case 951526432:
      return addContact();
    case -1724546052:
      return getDescriptionElement();
    case -669707736:
      return addUseContext();
    case -507075711:
      return addJurisdiction();
    case 1522889671:
      return getCopyrightElement();
    case 1802060801:
      return getPackageIdElement();
    case 166757441:
      return getLicenseElement();
    case 461006061:
      return addFhirVersionElement();
    case -1109214266:
      return addDependsOn();
    case -1243020381:
      return addGlobal();
    case -1014418093:
      return getDefinition();
    case 130625071:
      return getManifest();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 116079:
      /* url */ return new String[] { "uri" };
    case 351608024:
      /* version */ return new String[] { "string" };
    case 3373707:
      /* name */ return new String[] { "string" };
    case 110371416:
      /* title */ return new String[] { "string" };
    case -892481550:
      /* status */ return new String[] { "string" };
    case -404562712:
      /* experimental */ return new String[] { "boolean" };
    case 3076014:
      /* date */ return new String[] { "dateTime" };
    case 1447404028:
      /* publisher */ return new String[] { "string" };
    case 951526432:
      /* contact */ return new String[] { "ContactDetail" };
    case -1724546052:
      /* description */ return new String[] { "markdown" };
    case -669707736:
      /* useContext */ return new String[] { "UsageContext" };
    case -507075711:
      /* jurisdiction */ return new String[] { "CodeableConcept" };
    case 1522889671:
      /* copyright */ return new String[] { "markdown" };
    case 1802060801:
      /* packageId */ return new String[] { "id" };
    case 166757441:
      /* license */ return new String[] { "string" };
    case 461006061:
      /* fhirVersion */ return new String[] { "string" };
    case -1109214266:
      /* dependsOn */ return new String[] {};
    case -1243020381:
      /* global */ return new String[] {};
    case -1014418093:
      /* definition */ return new String[] {};
    case 130625071:
      /* manifest */ return new String[] {};
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("url")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.url");
    } else if (name.equals("version")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.version");
    } else if (name.equals("name")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.name");
    } else if (name.equals("title")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.title");
    } else if (name.equals("status")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.status");
    } else if (name.equals("experimental")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.experimental");
    } else if (name.equals("date")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.date");
    } else if (name.equals("publisher")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.publisher");
    } else if (name.equals("contact")) {
      return addContact();
    } else if (name.equals("description")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.description");
    } else if (name.equals("useContext")) {
      return addUseContext();
    } else if (name.equals("jurisdiction")) {
      return addJurisdiction();
    } else if (name.equals("copyright")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.copyright");
    } else if (name.equals("packageId")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.packageId");
    } else if (name.equals("license")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.license");
    } else if (name.equals("fhirVersion")) {
      throw new FHIRException("Cannot call addChild on a singleton property ImplementationGuide.fhirVersion");
    } else if (name.equals("dependsOn")) {
      return addDependsOn();
    } else if (name.equals("global")) {
      return addGlobal();
    } else if (name.equals("definition")) {
      this.definition = new ImplementationGuideDefinitionComponent();
      return this.definition;
    } else if (name.equals("manifest")) {
      this.manifest = new ImplementationGuideManifestComponent();
      return this.manifest;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "ImplementationGuide";

  }

  public ImplementationGuide copy() {
    ImplementationGuide dst = new ImplementationGuide();
    copyValues(dst);
    return dst;
  }

  public void copyValues(ImplementationGuide dst) {
    super.copyValues(dst);
    dst.url = url == null ? null : url.copy();
    dst.version = version == null ? null : version.copy();
    dst.name = name == null ? null : name.copy();
    dst.title = title == null ? null : title.copy();
    dst.status = status == null ? null : status.copy();
    dst.experimental = experimental == null ? null : experimental.copy();
    dst.date = date == null ? null : date.copy();
    dst.publisher = publisher == null ? null : publisher.copy();
    if (contact != null) {
      dst.contact = new ArrayList<ContactDetail>();
      for (ContactDetail i : contact)
        dst.contact.add(i.copy());
    }
    ;
    dst.description = description == null ? null : description.copy();
    if (useContext != null) {
      dst.useContext = new ArrayList<UsageContext>();
      for (UsageContext i : useContext)
        dst.useContext.add(i.copy());
    }
    ;
    if (jurisdiction != null) {
      dst.jurisdiction = new ArrayList<CodeableConcept>();
      for (CodeableConcept i : jurisdiction)
        dst.jurisdiction.add(i.copy());
    }
    ;
    dst.copyright = copyright == null ? null : copyright.copy();
    dst.packageId = packageId == null ? null : packageId.copy();
    dst.license = license == null ? null : license.copy();
    if (fhirVersion != null) {
      dst.fhirVersion = new ArrayList<StringType>();
      for (StringType i : fhirVersion)
        dst.fhirVersion.add(i.copy());
    }
    ;
    if (dependsOn != null) {
      dst.dependsOn = new ArrayList<ImplementationGuideDependsOnComponent>();
      for (ImplementationGuideDependsOnComponent i : dependsOn)
        dst.dependsOn.add(i.copy());
    }
    ;
    if (global != null) {
      dst.global = new ArrayList<ImplementationGuideGlobalComponent>();
      for (ImplementationGuideGlobalComponent i : global)
        dst.global.add(i.copy());
    }
    ;
    dst.definition = definition == null ? null : definition.copy();
    dst.manifest = manifest == null ? null : manifest.copy();
  }

  protected ImplementationGuide typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof ImplementationGuide))
      return false;
    ImplementationGuide o = (ImplementationGuide) other_;
    return compareDeep(copyright, o.copyright, true) && compareDeep(packageId, o.packageId, true)
        && compareDeep(license, o.license, true) && compareDeep(fhirVersion, o.fhirVersion, true)
        && compareDeep(dependsOn, o.dependsOn, true) && compareDeep(global, o.global, true)
        && compareDeep(definition, o.definition, true) && compareDeep(manifest, o.manifest, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof ImplementationGuide))
      return false;
    ImplementationGuide o = (ImplementationGuide) other_;
    return compareValues(copyright, o.copyright, true) && compareValues(packageId, o.packageId, true)
        && compareValues(license, o.license, true) && compareValues(fhirVersion, o.fhirVersion, true);
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(copyright, packageId, license, fhirVersion,
        dependsOn, global, definition, manifest);
  }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ImplementationGuide;
  }

  /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The implementation guide publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImplementationGuide.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "date", path = "ImplementationGuide.date", description = "The implementation guide publication date", type = "date")
  public static final String SP_DATE = "date";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The implementation guide publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImplementationGuide.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(
      SP_DATE);

  /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the implementation
   * guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-value", path = "ImplementationGuide.useContext", description = "A use context type and value assigned to the implementation guide", type = "composite", compositeOf = {
      "context-type", "context" })
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the implementation
   * guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(
      SP_CONTEXT_TYPE_VALUE);

  /**
   * Search parameter: <b>resource</b>
   * <p>
   * Description: <b>Location of the resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.definition.resource.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "resource", path = "ImplementationGuide.definition.resource.reference", description = "Location of the resource", type = "reference")
  public static final String SP_RESOURCE = "resource";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>resource</b>
   * <p>
   * Description: <b>Location of the resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.definition.resource.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RESOURCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_RESOURCE);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:resource</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RESOURCE = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:resource").toLocked();

  /**
   * Search parameter: <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.jurisdiction</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "jurisdiction", path = "ImplementationGuide.jurisdiction", description = "Intended jurisdiction for the implementation guide", type = "token")
  public static final String SP_JURISDICTION = "jurisdiction";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.jurisdiction</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam JURISDICTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_JURISDICTION);

  /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "description", path = "ImplementationGuide.description", description = "The description of the implementation guide", type = "string")
  public static final String SP_DESCRIPTION = "description";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_DESCRIPTION);

  /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the implementation
   * guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type", path = "ImplementationGuide.useContext.code", description = "A type of use context assigned to the implementation guide", type = "token")
  public static final String SP_CONTEXT_TYPE = "context-type";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the implementation
   * guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT_TYPE);

  /**
   * Search parameter: <b>experimental</b>
   * <p>
   * Description: <b>For testing purposes, not real usage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.experimental</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "experimental", path = "ImplementationGuide.experimental", description = "For testing purposes, not real usage", type = "token")
  public static final String SP_EXPERIMENTAL = "experimental";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>experimental</b>
   * <p>
   * Description: <b>For testing purposes, not real usage</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.experimental</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam EXPERIMENTAL = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_EXPERIMENTAL);

  /**
   * Search parameter: <b>global</b>
   * <p>
   * Description: <b>Profile that all resources must conform to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.global.profile</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "global", path = "ImplementationGuide.global.profile", description = "Profile that all resources must conform to", type = "reference", target = {
      StructureDefinition.class })
  public static final String SP_GLOBAL = "global";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>global</b>
   * <p>
   * Description: <b>Profile that all resources must conform to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.global.profile</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam GLOBAL = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_GLOBAL);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:global</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_GLOBAL = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:global").toLocked();

  /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "title", path = "ImplementationGuide.title", description = "The human-friendly name of the implementation guide", type = "string")
  public static final String SP_TITLE = "title";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_TITLE);

  /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "version", path = "ImplementationGuide.version", description = "The business version of the implementation guide", type = "token")
  public static final String SP_VERSION = "version";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_VERSION);

  /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the implementation guide</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>ImplementationGuide.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "url", path = "ImplementationGuide.url", description = "The uri that identifies the implementation guide", type = "uri")
  public static final String SP_URL = "url";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the implementation guide</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>ImplementationGuide.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

  /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the
   * implementation guide</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ImplementationGuide.useContext.valueQuantity,
   * ImplementationGuide.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-quantity", path = "(ImplementationGuide.useContext.value as Quantity) | (ImplementationGuide.useContext.value as Range)", description = "A quantity- or range-valued use context assigned to the implementation guide", type = "quantity")
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the
   * implementation guide</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>ImplementationGuide.useContext.valueQuantity,
   * ImplementationGuide.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(
      SP_CONTEXT_QUANTITY);

  /**
   * Search parameter: <b>depends-on</b>
   * <p>
   * Description: <b>Identity of the IG that this depends on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.dependsOn.uri</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "depends-on", path = "ImplementationGuide.dependsOn.uri", description = "Identity of the IG that this depends on", type = "reference", target = {
      ImplementationGuide.class })
  public static final String SP_DEPENDS_ON = "depends-on";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>depends-on</b>
   * <p>
   * Description: <b>Identity of the IG that this depends on</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImplementationGuide.dependsOn.uri</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEPENDS_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(
      SP_DEPENDS_ON);

  /**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImplementationGuide:depends-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEPENDS_ON = new ca.uhn.fhir.model.api.Include(
      "ImplementationGuide:depends-on").toLocked();

  /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the implementation
   * guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "name", path = "ImplementationGuide.name", description = "Computationally friendly name of the implementation guide", type = "string")
  public static final String SP_NAME = "name";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the implementation
   * guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_NAME);

  /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context", path = "(ImplementationGuide.useContext.value as CodeableConcept)", description = "A use context assigned to the implementation guide", type = "token")
  public static final String SP_CONTEXT = "context";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_CONTEXT);

  /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "publisher", path = "ImplementationGuide.publisher", description = "Name of the publisher of the implementation guide", type = "string")
  public static final String SP_PUBLISHER = "publisher";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the implementation guide</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ImplementationGuide.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(
      SP_PUBLISHER);

  /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the implementation guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name = "context-type-quantity", path = "ImplementationGuide.useContext", description = "A use context type and quantity- or range-based value assigned to the implementation guide", type = "composite", compositeOf = {
      "context-type", "context-quantity" })
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
  /**
   * <b>Fluent Client</b> search parameter constant for
   * <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value
   * assigned to the implementation guide</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(
      SP_CONTEXT_TYPE_QUANTITY);

  /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name = "status", path = "ImplementationGuide.status", description = "The current status of the implementation guide", type = "token")
  public static final String SP_STATUS = "status";
  /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the implementation guide</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImplementationGuide.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(
      SP_STATUS);

}
