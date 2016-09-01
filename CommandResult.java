package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;
import java.util.Optional;

/**
 * Represents the result of a command execution.
 */
public class CommandResult {

	/**
	 * The feedback message to be shown to the user. Contains a description of
	 * the execution result
	 */
	public static String feedbackToUser;

	/** The list of persons that was produced by the command */
	private final List<? extends ReadOnlyPerson> relevantPersons;

	public CommandResult(String feedBack) {
		setFeedbackToUser(feedBack);
		relevantPersons = null;
	}

	public CommandResult(String feedBack, List<? extends ReadOnlyPerson> relevantPersons) {
		setFeedbackToUser(feedBack);
		this.relevantPersons = relevantPersons;
	}

	/**
	 * Returns list of persons relevant to the command command result, if any.
	 */
	public Optional<List<? extends ReadOnlyPerson>> getRelevantPersons() {
		return Optional.ofNullable(relevantPersons);
	}

	/**
	 * Get the feedback to user.
	 */
	public String getFeedbackToUser() {
		return feedbackToUser;
	}

	/**
	 * Set the feedback the user gives.
	 */
	public void setFeedbackToUser(String feedback) {
		feedbackToUser = feedback;
	}

}
