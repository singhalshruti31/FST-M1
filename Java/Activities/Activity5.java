package activities;

public class Activity5{

    public static void main(String[] args){
        String title = "Book Name";
        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("Title of book :: "+newNovel.getTitle());
    }
}
