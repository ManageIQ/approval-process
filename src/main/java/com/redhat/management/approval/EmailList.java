package com.redhat.management.approval;

import java.util.List;
import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EmailList implements Serializable {

    static final long serialVersionUID = 1L;

    private List<Email> emails;

    public EmailList() {
    }

    public List<Email> getEmails() {
        return this.emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public EmailList(List<Email> emails) {
        this.emails = emails;
    }

}