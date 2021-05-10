public class Example4_4 {
    String title;
    String author;

    public Example4_4(String t){
        title=t;
        author="작자미상";
    }

    public Example4_4(String t, String a){
        title=t;
        author=a;
    }

    public static void main(String[] args){
        Example4_4 littlePrince = new Example4_4("어린왕자","생텍쥐페리");

        Example4_4 loveStory = new Example4_4("춘향전");

        System.out.println(loveStory.title + " " +loveStory.author);
        System.out.println(littlePrince.title + " "+littlePrince.author);
    }
}
