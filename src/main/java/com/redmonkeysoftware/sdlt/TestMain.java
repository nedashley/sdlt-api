package com.redmonkeysoftware.sdlt;

import com.redmonkeysoftware.sdlt.model.SdltXmlHelper;

public class TestMain {

    public static void main(String[] args) {
        //Just a quick test to find out what is going on with ImportDocuments
        try {
            //System.out.println(SdltXmlHelper.getInstance().generateTestSdlt());
            System.out.println(SdltXmlHelper.getInstance().generateRequestXml("ImportDocuments", SdltXmlHelper.getInstance().generateTestSdlt()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
