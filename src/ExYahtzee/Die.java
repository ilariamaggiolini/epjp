package ExYahtzee;

public class Die {
    int faceValue;
    public void roll(){
        faceValue = (int)(Math.random() * 6 + 1);
    }

    public int getValue(){
        return faceValue;   
    }

    public String toString(){
        return Integer.toString(faceValue);
    }
}