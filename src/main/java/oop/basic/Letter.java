package oop.basic;

public class Letter {
    String from;
    String to;
    StringBuilder lines;


    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    public void addLine(String line)
    {
        lines.append(line+"\n");
    }
    public String getText()
    {
        String letter=("Dear "+to+":"+"\n\n"+lines+"\n"+"Sincerely,\n"+"\n"+from);
        return letter;
    }
}
