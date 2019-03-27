package com.redhat.management.approval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InputParser implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public static Request parseRequest(java.util.LinkedHashMap<String, Object> requestMaps) {
        return new Request(requestMaps);
        
    }
    
    /*
    group 1: {name=g_abc, description=desc, uuid=1234, users=[{username=abc, email=abc@123.com, first_name=abc, last_name=def}, {username=bcd,
 email=bcd@123.com, first_name=bcd, last_name=efg}]}
    */

    public static java.util.ArrayList<Group> parseGroups(java.util.ArrayList<java.util.LinkedHashMap<String, Object>> rawGroups) {

        java.util.ArrayList<Group> groups = new java.util.ArrayList<Group>();
        for (java.util.LinkedHashMap<String, Object> rawGroup : rawGroups) {
            java.util.ArrayList<java.util.LinkedHashMap<String, String>> rawApprovers = (java.util.ArrayList<java.util.LinkedHashMap<String, String>>) rawGroup.get("users");
            java.util.ArrayList<Approver> approvers = new java.util.ArrayList<Approver>();
            
            for (java.util.LinkedHashMap<String, String> rawApprover : rawApprovers) {
                Approver approver = new Approver(rawApprover.get("username"), rawApprover.get("email"), rawApprover.get("first_name"), rawApprover.get("last_name"));
                approvers.add(approver);
            }
            
            Group group = new Group((String)rawGroup.get("name"), approvers, (String)rawGroup.get("description"),  (String)rawGroup.get("uuid"));
            groups.add(group);
        }
        
        return groups;
        
    }
    
    public static java.util.ArrayList<Stage> parseStages(java.util.ArrayList<java.util.LinkedHashMap<String, Object>> rawStages) {

        java.util.ArrayList<Stage> stages = new java.util.ArrayList<Stage>();
        for (java.util.LinkedHashMap<String, Object> rawStage : rawStages) {

            Stage stage = new Stage((java.lang.Integer)rawStage.get("id"), (String)rawStage.get("uuid"), (String)rawStage.get("created_at"), (String)rawStage.get("group_ref"));
            stages.add(stage);
        }
        
        return stages;
        
    }    
}
