package uk.ac.glasgowerec.domain;


@Email
@NotNull
@Size(min = 1, message = "Please, set an email address to send the message to it")
public class MailObject {


    private String to;
    private String subject;
    private String text;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
