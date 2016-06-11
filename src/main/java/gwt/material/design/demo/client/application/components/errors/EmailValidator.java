package gwt.material.design.demo.client.application.components.errors;

import gwt.material.design.client.base.validator.RegExValidator;

public class EmailValidator extends RegExValidator {

    public EmailValidator() {
        super("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(?:[a-zA-Z]{2,6})$", "Not a valid email address.");
    }

    @Override
    public int getPriority() {
        return 0;
    }
}