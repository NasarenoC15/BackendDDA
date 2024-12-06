package com.backend_obg_2.backend_obg_2.Service;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

public class BlobSerializer extends JsonSerializer<Blob> {

    public BlobSerializer() {
    }

    @Override
    public void serialize(Blob blob, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        try {
            byte[] bytes = blob.getBytes(1, (int) blob.length());
            gen.writeBinary(bytes);
        } catch (SQLException e) {
            throw new IOException("Failed to serialize Blob", e);
        }
    }
}