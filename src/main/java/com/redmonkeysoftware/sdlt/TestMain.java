package com.redmonkeysoftware.sdlt;

import com.redmonkeysoftware.sdlt.model.SdltXmlHelper;

public class TestMain {

    public static void main(String[] args) {
        try {
            System.out.println(SdltXmlHelper.getInstance().generateTestSdlt());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
