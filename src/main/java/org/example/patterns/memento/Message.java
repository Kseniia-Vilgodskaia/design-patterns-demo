package org.example.patterns.memento;

public class Message {

    private String theme;
    private Template template;

    public Message(String theme, Template template) {
        this.theme = theme;
        this.template = template;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Message{" +
                "theme='" + theme + '\'' +
                ", template=" + template +
                '}';
    }

    //memento getter
    public MessageMemento getMemento() {
        MessageMemento memento = null;
        if (theme == null && template == null) {
            memento = new MessageMemento();
        } else {
            memento = new MessageMemento(theme, new Template(template.getContent(), template.getType()));
        }
        return memento;
    }

    //memento setter
    public void reset(MessageMemento memento) {
        if (memento.isEmpty()) {
            this.theme = null;
            this.template = null;
        } else {
            this.theme = memento.getMessageTheme();
            this.template = new Template(memento.getMessageTemplate().getContent(), memento.getMessageTemplate().getType());
        }
    }

    //memento class
    public class MessageMemento {
        private String messageTheme;

        private Template messageTemplate;

        private MessageMemento() {
        }

        private MessageMemento(String messageTheme, Template template) {
            this.messageTheme = messageTheme;
            this.messageTemplate = template;
        }

        private String getMessageTheme() {
            return messageTheme;
        }

        private void setMessageTheme(String messageTheme) {
            this.messageTheme = messageTheme;
        }

        public Template getMessageTemplate() {
            return messageTemplate;
        }

        public void setMessageTemplate(Template messageTemplate) {
            this.messageTemplate = messageTemplate;
        }

        private boolean isEmpty() {
            return messageTheme == null && messageTemplate == null;
        }
    }
}
