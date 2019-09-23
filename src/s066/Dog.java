package s066;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }
//bark(int count) ha un parametro e quindi è diverso da bark.
    
    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}