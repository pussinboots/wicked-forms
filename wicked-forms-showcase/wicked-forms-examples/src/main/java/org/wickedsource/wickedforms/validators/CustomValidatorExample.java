package org.wickedsource.wickedforms.validators;

import org.wickedsource.wickedforms.model.FormModel;
import org.wickedsource.wickedforms.model.SectionModel;
import org.wickedsource.wickedforms.model.elements.TextModel;
import org.wickedsource.wickedforms.model.elements.fields.AbstractInputFieldModel;
import org.wickedsource.wickedforms.model.elements.fields.StringTextFieldModel;
import org.wickedsource.wickedforms.model.validation.FieldValidatorModel;
import org.wickedsource.wickedforms.model.validation.ValidationFeedback;

public class CustomValidatorExample extends FormModel {

	public CustomValidatorExample() {
		super("Custom Validators");

		add(new TextModel("Wicked Forms comes with a small set of ready-made validators. " +
		    "In most projects, you need your own custom-made validators. To create a custom " +
		    " validator, all you have to do is to implement the interface FieldValidatorModel."));

		add(new SectionModel("Fixed Value Validator")
		    .add(
		        new TextModel(
		            "This custom-implemented validator checks if the input " +
		                "value exactly matches the string 'mercury'."))
		    .add(new StringTextFieldModel("Nearest planet to the sun")
		        .add(createMercuryValidator())));

	}

	private FieldValidatorModel<String> createMercuryValidator() {
		return new FieldValidatorModel<String>() {
			@Override
			public void validate(final AbstractInputFieldModel<String> inputField, final String value,
			    final ValidationFeedback feedback) {
				if (!"mercury".equals(value)) {
					feedback.error(String.format("Your answer to '%s' is wrong.", inputField.getLabel()));
				}
			}
		};
	}
}
