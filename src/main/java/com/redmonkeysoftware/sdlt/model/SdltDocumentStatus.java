package com.redmonkeysoftware.sdlt.model;

import com.redmonkeysoftware.sdlt.model.response.GetDocumentsStatus;
import com.redmonkeysoftware.sdlt.model.response.ImportDocuments;
import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public class SdltDocumentStatus implements Serializable {

    private static final long serialVersionUID = -1305369534487660161L;
    protected String documentId;
    protected String customId;
    protected SdltDocumentStatusType status;
    protected String error;

    public SdltDocumentStatus withDocumentStatus(GetDocumentsStatus.Document doc) {
        this.documentId = doc.getDocumentID();
        this.customId = doc.getCustomID();
        this.status = SdltDocumentStatusType.parse(doc.getStatus());
        return this;
    }

    public SdltDocumentStatus withDocumentImport(ImportDocuments.Document doc) {
        if ((doc.getError() != null)
                && (StringUtils.isNotBlank(doc.getError().getCode()))) {
            this.error = doc.getError().getCode() + ":" + doc.getError().getMessage();
        }
        this.documentId = doc.getDocumentID();
        this.customId = doc.getCustomID();
        this.status = SdltDocumentStatusType.parse(doc.getStatus());
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return ((obj instanceof SdltDocumentStatus)
                && (StringUtils.equals(documentId, ((SdltDocumentStatus) obj).getDocumentId()))
                && (StringUtils.equals(customId, ((SdltDocumentStatus) obj).getCustomId())));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.documentId);
        hash = 71 * hash + Objects.hashCode(this.customId);
        return hash;
    }

    public boolean hasError() {
        return (StringUtils.isNotBlank(error));
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public SdltDocumentStatusType getStatus() {
        return status;
    }

    public void setStatus(SdltDocumentStatusType status) {
        this.status = status;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
