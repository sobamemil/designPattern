import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) { // 생성자
        super(text, columns);
    }

    public void setMediator(Mediator mediator) { // Mediator를 저장
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) { // Mediator에서 유효/무효를 지시
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent e) { // 문자열이 변하면 Mediator에게 통지
        mediator.colleagueChanged();
    }
}
