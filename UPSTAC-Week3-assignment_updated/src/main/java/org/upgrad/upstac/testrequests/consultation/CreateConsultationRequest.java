package org.upgrad.upstac.testrequests.consultation;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateConsultationRequest {

    @NotNull
    private DoctorSuggestion suggestion;

    private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	public String toString() {
		return "CreateConsultationRequest [suggestion=" + suggestion + ", comments=" + comments + "]";
	}

	public DoctorSuggestion getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(DoctorSuggestion suggestion) {
		this.suggestion = suggestion;
	}

}
