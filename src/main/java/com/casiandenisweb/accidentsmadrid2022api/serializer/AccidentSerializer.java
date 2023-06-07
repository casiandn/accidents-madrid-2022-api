package com.casiandenisweb.accidentsmadrid2022api.serializer;

import com.casiandenisweb.accidentsmadrid2022api.models.Accident;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class AccidentSerializer extends JsonSerializer<Accident> {

    @Override
    public void serialize(Accident accident, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("recordNumber", accident.getRecordNumber());
        jsonGenerator.writeStringField("date", accident.getDate());
        jsonGenerator.writeStringField("time", accident.getTime());
        jsonGenerator.writeStringField("location", accident.getLocation());
        // Include other fields as needed

        // Conditionally include the passengers field
        if (shouldIncludePassengers(accident)) {
            jsonGenerator.writeObjectField("passengers", accident.getPassengers());
        }

        jsonGenerator.writeEndObject();
    }

    private boolean shouldIncludePassengers(Accident accident) {
        // Add your logic here to determine if the passengers should be included
        // For example, you can check if the accident has any passengers or a specific condition
        return true;
    }
}

