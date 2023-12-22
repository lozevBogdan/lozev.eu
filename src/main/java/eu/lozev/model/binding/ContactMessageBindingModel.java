package eu.lozev.model.binding;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class ContactMessageBindingModel {
@NotEmpty(message = "The field can not be null!")
private String from;
@NotEmpty(message = "The field can not be null!")
private String about;
@Size(min = 3, message = "The message must be at least 3 symbols!")
private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
