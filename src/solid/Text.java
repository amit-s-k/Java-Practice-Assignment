package solid;

public class Text {
    private String text;
    private String author;
    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void convertToUpperCase(){
        this.text=this.text.toUpperCase();
    }
    public void findSubTextAndDelete(String subText){
        if (this.text.contains(subText)){
            // remove subText
        }
    }
    public void printText(){
        System.out.println(this.text);
    }
}
