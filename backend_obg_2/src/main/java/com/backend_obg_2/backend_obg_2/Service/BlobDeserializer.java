package com.backend_obg_2.backend_obg_2.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

public class BlobDeserializer extends JsonDeserializer<Blob> {

    public BlobDeserializer() {
    }

    @Override
    public Blob deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            byte[] bytes = p.getBinaryValue();
            return new javax.sql.rowset.serial.SerialBlob(bytes);
        } catch (SQLException e) {
            throw new IOException("Failed to deserialize Blob", e);
        }
    }
}