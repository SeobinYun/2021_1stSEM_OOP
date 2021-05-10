public class Example4_5 {
    String title;
    String author;

    void show(){
        System.out.println(title+" "+author);
    }

    public Example4_5(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Example4_5(String title){
        this(title, "작자미상");
    }

    public Example4_5(String title, String author){
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args){
        Example4_5 littlePrince = new Example4_5("어린왕자", "생텍쥐페리");
        Example4_5 loveStory = new Example4_5("춘향전");
        Example4_5 emptyBook = new Example4_5();
        loveStory.show();
    }
}
