
package dev.cdevents.models.testcaserun.finished;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outcome",
    "severity",
    "reason",
    "environment",
    "testSuiteRun",
    "testCase"
})
@Generated("jsonschema2pojo")
public class Content {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    private Content.Outcome outcome;
    @JsonProperty("severity")
    private Content.Severity severity;
    @JsonProperty("reason")
    private String reason;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    private Environment environment;
    @JsonProperty("testSuiteRun")
    private TestSuiteRun testSuiteRun;
    @JsonProperty("testCase")
    private TestCase testCase;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    public Content.Outcome getOutcome() {
        return outcome;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outcome")
    public void setOutcome(Content.Outcome outcome) {
        this.outcome = outcome;
    }

    @JsonProperty("severity")
    public Content.Severity getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(Content.Severity severity) {
        this.severity = severity;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @JsonProperty("testSuiteRun")
    public TestSuiteRun getTestSuiteRun() {
        return testSuiteRun;
    }

    @JsonProperty("testSuiteRun")
    public void setTestSuiteRun(TestSuiteRun testSuiteRun) {
        this.testSuiteRun = testSuiteRun;
    }

    @JsonProperty("testCase")
    public TestCase getTestCase() {
        return testCase;
    }

    @JsonProperty("testCase")
    public void setTestCase(TestCase testCase) {
        this.testCase = testCase;
    }

    @Generated("jsonschema2pojo")
    public enum Outcome {

        PASS("pass"),
        FAIL("fail"),
        CANCEL("cancel"),
        ERROR("error");
        private final String value;
        private final static Map<String, Content.Outcome> CONSTANTS = new HashMap<String, Content.Outcome>();

        static {
            for (Content.Outcome c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Outcome(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Content.Outcome fromValue(String value) {
            Content.Outcome constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum Severity {

        LOW("low"),
        MEDIUM("medium"),
        HIGH("high"),
        CRITICAL("critical");
        private final String value;
        private final static Map<String, Content.Severity> CONSTANTS = new HashMap<String, Content.Severity>();

        static {
            for (Content.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Content.Severity fromValue(String value) {
            Content.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}