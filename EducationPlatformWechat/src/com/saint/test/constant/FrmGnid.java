package com.saint.test.constant;

public enum FrmGnid {
    TITLE(""),
    JxSignError("ѧ��ǩ��ʧ����־"),selectListJxSignError("ѧ��ǩ��ʧ����־�б��ѯ"),selectObjectJxSignError("ѧ��ǩ��ʧ����־��ѯ"),selectListPageJxSignError("ѧ��ǩ��ʧ����־��ҳ��ѯ"),updateJxSignError("����ѧ��ǩ��ʧ����־"),insertJxSignError("����ѧ��ǩ��ʧ����־"),deleteJxSignError("ɾ��ѧ��ǩ��ʧ����־");

    private String what;

    private FrmGnid(String what) {
        this.what = what;
    }

    public String getWhat() {
        return this.what;
    }

    public String toString() {
        return this.what;
    }
}