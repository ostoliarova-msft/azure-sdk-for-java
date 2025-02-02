// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A skill looks for text from a custom, user-defined list of words and phrases. */
@Fluent
public final class CustomEntityLookupSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    private static final String ODATA_TYPE = "#Microsoft.Skills.Text.CustomEntityLookupSkill";

    /*
     * A value indicating which language code to use. Default is en.
     */
    private CustomEntityLookupSkillLanguage defaultLanguageCode;

    /*
     * Path to a JSON or CSV file containing all the target text to match against. This entity definition is read at
     * the beginning of an indexer run. Any updates to this file during an indexer run will not take effect until
     * subsequent runs. This config must be accessible over HTTPS.
     */
    private String entitiesDefinitionUri;

    /*
     * The inline CustomEntity definition.
     */
    private List<CustomEntity> inlineEntitiesDefinition;

    /*
     * A global flag for CaseSensitive. If CaseSensitive is not set in CustomEntity, this value will be the default
     * value.
     */
    private Boolean globalDefaultCaseSensitive;

    /*
     * A global flag for AccentSensitive. If AccentSensitive is not set in CustomEntity, this value will be the default
     * value.
     */
    private Boolean globalDefaultAccentSensitive;

    /*
     * A global flag for FuzzyEditDistance. If FuzzyEditDistance is not set in CustomEntity, this value will be the
     * default value.
     */
    private Integer globalDefaultFuzzyEditDistance;

    /**
     * Creates an instance of CustomEntityLookupSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public CustomEntityLookupSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public CustomEntityLookupSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setDefaultLanguageCode(CustomEntityLookupSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the entitiesDefinitionUri property: Path to a JSON or CSV file containing all the target text to match
     * against. This entity definition is read at the beginning of an indexer run. Any updates to this file during an
     * indexer run will not take effect until subsequent runs. This config must be accessible over HTTPS.
     *
     * @return the entitiesDefinitionUri value.
     */
    public String getEntitiesDefinitionUri() {
        return this.entitiesDefinitionUri;
    }

    /**
     * Set the entitiesDefinitionUri property: Path to a JSON or CSV file containing all the target text to match
     * against. This entity definition is read at the beginning of an indexer run. Any updates to this file during an
     * indexer run will not take effect until subsequent runs. This config must be accessible over HTTPS.
     *
     * @param entitiesDefinitionUri the entitiesDefinitionUri value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setEntitiesDefinitionUri(String entitiesDefinitionUri) {
        this.entitiesDefinitionUri = entitiesDefinitionUri;
        return this;
    }

    /**
     * Get the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @return the inlineEntitiesDefinition value.
     */
    public List<CustomEntity> getInlineEntitiesDefinition() {
        return this.inlineEntitiesDefinition;
    }

    /**
     * Set the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @param inlineEntitiesDefinition the inlineEntitiesDefinition value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setInlineEntitiesDefinition(List<CustomEntity> inlineEntitiesDefinition) {
        this.inlineEntitiesDefinition = inlineEntitiesDefinition;
        return this;
    }

    /**
     * Get the globalDefaultCaseSensitive property: A global flag for CaseSensitive. If CaseSensitive is not set in
     * CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultCaseSensitive value.
     */
    public Boolean isGlobalDefaultCaseSensitive() {
        return this.globalDefaultCaseSensitive;
    }

    /**
     * Set the globalDefaultCaseSensitive property: A global flag for CaseSensitive. If CaseSensitive is not set in
     * CustomEntity, this value will be the default value.
     *
     * @param globalDefaultCaseSensitive the globalDefaultCaseSensitive value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultCaseSensitive(Boolean globalDefaultCaseSensitive) {
        this.globalDefaultCaseSensitive = globalDefaultCaseSensitive;
        return this;
    }

    /**
     * Get the globalDefaultAccentSensitive property: A global flag for AccentSensitive. If AccentSensitive is not set
     * in CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultAccentSensitive value.
     */
    public Boolean isGlobalDefaultAccentSensitive() {
        return this.globalDefaultAccentSensitive;
    }

    /**
     * Set the globalDefaultAccentSensitive property: A global flag for AccentSensitive. If AccentSensitive is not set
     * in CustomEntity, this value will be the default value.
     *
     * @param globalDefaultAccentSensitive the globalDefaultAccentSensitive value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultAccentSensitive(Boolean globalDefaultAccentSensitive) {
        this.globalDefaultAccentSensitive = globalDefaultAccentSensitive;
        return this;
    }

    /**
     * Get the globalDefaultFuzzyEditDistance property: A global flag for FuzzyEditDistance. If FuzzyEditDistance is not
     * set in CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultFuzzyEditDistance value.
     */
    public Integer getGlobalDefaultFuzzyEditDistance() {
        return this.globalDefaultFuzzyEditDistance;
    }

    /**
     * Set the globalDefaultFuzzyEditDistance property: A global flag for FuzzyEditDistance. If FuzzyEditDistance is not
     * set in CustomEntity, this value will be the default value.
     *
     * @param globalDefaultFuzzyEditDistance the globalDefaultFuzzyEditDistance value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultFuzzyEditDistance(Integer globalDefaultFuzzyEditDistance) {
        this.globalDefaultFuzzyEditDistance = globalDefaultFuzzyEditDistance;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityLookupSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityLookupSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityLookupSkill setContext(String context) {
        super.setContext(context);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        jsonWriter.writeStringField("defaultLanguageCode", Objects.toString(this.defaultLanguageCode, null));
        jsonWriter.writeStringField("entitiesDefinitionUri", this.entitiesDefinitionUri);
        jsonWriter.writeArrayField(
                "inlineEntitiesDefinition",
                this.inlineEntitiesDefinition,
                (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("globalDefaultCaseSensitive", this.globalDefaultCaseSensitive);
        jsonWriter.writeBooleanField("globalDefaultAccentSensitive", this.globalDefaultAccentSensitive);
        jsonWriter.writeNumberField("globalDefaultFuzzyEditDistance", this.globalDefaultFuzzyEditDistance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomEntityLookupSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomEntityLookupSkill if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomEntityLookupSkill.
     */
    public static CustomEntityLookupSkill fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    CustomEntityLookupSkillLanguage defaultLanguageCode = null;
                    String entitiesDefinitionUri = null;
                    List<CustomEntity> inlineEntitiesDefinition = null;
                    Boolean globalDefaultCaseSensitive = null;
                    Boolean globalDefaultAccentSensitive = null;
                    Integer globalDefaultFuzzyEditDistance = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("inputs".equals(fieldName)) {
                            inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            inputsFound = true;
                        } else if ("outputs".equals(fieldName)) {
                            outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                            outputsFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                        } else if ("description".equals(fieldName)) {
                            description = reader.getString();
                        } else if ("context".equals(fieldName)) {
                            context = reader.getString();
                        } else if ("defaultLanguageCode".equals(fieldName)) {
                            defaultLanguageCode = CustomEntityLookupSkillLanguage.fromString(reader.getString());
                        } else if ("entitiesDefinitionUri".equals(fieldName)) {
                            entitiesDefinitionUri = reader.getString();
                        } else if ("inlineEntitiesDefinition".equals(fieldName)) {
                            inlineEntitiesDefinition = reader.readArray(reader1 -> CustomEntity.fromJson(reader1));
                        } else if ("globalDefaultCaseSensitive".equals(fieldName)) {
                            globalDefaultCaseSensitive = reader.getNullable(JsonReader::getBoolean);
                        } else if ("globalDefaultAccentSensitive".equals(fieldName)) {
                            globalDefaultAccentSensitive = reader.getNullable(JsonReader::getBoolean);
                        } else if ("globalDefaultFuzzyEditDistance".equals(fieldName)) {
                            globalDefaultFuzzyEditDistance = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (inputsFound && outputsFound) {
                        CustomEntityLookupSkill deserializedValue = new CustomEntityLookupSkill(inputs, outputs);
                        deserializedValue.setName(name);
                        deserializedValue.setDescription(description);
                        deserializedValue.setContext(context);
                        deserializedValue.defaultLanguageCode = defaultLanguageCode;
                        deserializedValue.entitiesDefinitionUri = entitiesDefinitionUri;
                        deserializedValue.inlineEntitiesDefinition = inlineEntitiesDefinition;
                        deserializedValue.globalDefaultCaseSensitive = globalDefaultCaseSensitive;
                        deserializedValue.globalDefaultAccentSensitive = globalDefaultAccentSensitive;
                        deserializedValue.globalDefaultFuzzyEditDistance = globalDefaultFuzzyEditDistance;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!inputsFound) {
                        missingProperties.add("inputs");
                    }
                    if (!outputsFound) {
                        missingProperties.add("outputs");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @param inlineEntitiesDefinition the inlineEntitiesDefinition value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setInlineEntitiesDefinition(CustomEntity... inlineEntitiesDefinition) {
        this.inlineEntitiesDefinition =
                (inlineEntitiesDefinition == null) ? null : java.util.Arrays.asList(inlineEntitiesDefinition);
        return this;
    }
}
