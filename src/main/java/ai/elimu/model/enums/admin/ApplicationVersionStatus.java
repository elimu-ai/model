package ai.elimu.model.enums.admin;

public enum ApplicationVersionStatus {
    
    /**
     * A new APK version has been uploaded, but not yet reviewed.
     */
    PENDING_APPROVAL,
    
    /**
     * The new APK version has been approved.
     */
    APPROVED,
    
    /**
     * The new APK version has been declined.
     */
    NOT_APPROVED
}
