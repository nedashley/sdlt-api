package com.redmonkeysoftware.sdlt.model;

import com.redmonkeysoftware.sdlt.model.response.GetPrintoutDocuments;
import java.io.Serializable;
import java.util.Base64;

public class SdltDocument implements Serializable {

    private static final long serialVersionUID = 6444711715603103736L;
    protected String filename;
    protected byte[] data;

    public SdltDocument withPrintoutDocument(GetPrintoutDocuments.Document.PrintoutDocument input) {
        this.filename = input.getFileName();
        this.data = Base64.getDecoder().decode(input.getData());
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
