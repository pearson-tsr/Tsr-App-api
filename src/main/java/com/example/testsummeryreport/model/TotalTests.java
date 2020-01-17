package com.example.testsummeryreport.model;

public class TotalTests {

    private String changeTicketId;

    private String performanceTesting;

    private String performanceTestingResultsLink;

    private String accessibilityTesting;

    private String accessibilityTestingResultsLink;

    private String compatibilityTesting;

    private String compatibilityTestingResultsLink;

    private int totalTestCases;

    private int automatedTestCases;

    private int totalTestCasesExecuted;

    private int automatedTestCasesExecuted;

    private float manualTestPercentage;

    private float automatedTestPercentage;

    public TotalTests() {
        super();
    }

    public String getChangeTicketId() {
        return changeTicketId;
    }

    public void setChangeTicketId(String changeTicketId) {
        this.changeTicketId = changeTicketId;
    }

    public String getPerformanceTesting() {
        return performanceTesting;
    }

    public void setPerformanceTesting(String performanceTesting) {
        this.performanceTesting = performanceTesting;
    }

    public String getPerformanceTestingResultsLink() {
        return performanceTestingResultsLink;
    }

    public void setPerformanceTestingResultsLink(String performanceTestingResultsLink) {
        this.performanceTestingResultsLink = performanceTestingResultsLink;
    }

    public String getAccessibilityTesting() {
        return accessibilityTesting;
    }

    public void setAccessibilityTesting(String accessibilityTesting) {
        this.accessibilityTesting = accessibilityTesting;
    }

    public String getAccessibilityTestingResultsLink() {
        return accessibilityTestingResultsLink;
    }

    public void setAccessibilityTestingResultsLink(String accessibilityTestingResultsLink) {
        this.accessibilityTestingResultsLink = accessibilityTestingResultsLink;
    }

    public String getCompatibilityTesting() {
        return compatibilityTesting;
    }

    public void setCompatibilityTesting(String compatibilityTesting) {
        this.compatibilityTesting = compatibilityTesting;
    }

    public String getCompatibilityTestingResultsLink() {
        return compatibilityTestingResultsLink;
    }

    public void setCompatibilityTestingResultsLink(String compatibilityTestingResultsLink) {
        this.compatibilityTestingResultsLink = compatibilityTestingResultsLink;
    }

    public int getTotalTestCases() {
        return totalTestCases;
    }

    public void setTotalTestCases(int totalTestCases) {
        this.totalTestCases = totalTestCases;
    }

    public int getAutomatedTestCases() {
        return automatedTestCases;
    }

    public void setAutomatedTestCases(int automatedTestCases) {
        this.automatedTestCases = automatedTestCases;
    }

    public int getTotalTestCasesExecuted() {
        return totalTestCasesExecuted;
    }

    public void setTotalTestCasesExecuted(int totalTestCasesExecuted) {
        this.totalTestCasesExecuted = totalTestCasesExecuted;
    }

    public int getAutomatedTestCasesExecuted() {
        return automatedTestCasesExecuted;
    }

    public void setAutomatedTestCasesExecuted(int automatedTestCasesExecuted) {
        this.automatedTestCasesExecuted = automatedTestCasesExecuted;
    }

    public float getManualTestPercentage() {
        return manualTestPercentage;
    }

    public void setManualTestPercentage(float manualTestPercentage) {
        this.manualTestPercentage = manualTestPercentage;
    }

    public float getAutomatedTestPercentage() {
        return automatedTestPercentage;
    }

    public void setAutomatedTestPercentage(float automatedTestPercentage) {
        this.automatedTestPercentage = automatedTestPercentage;
    }

}
