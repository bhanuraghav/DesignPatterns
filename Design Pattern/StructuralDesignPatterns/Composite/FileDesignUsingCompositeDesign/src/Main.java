//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie Directory");
        File movie1 = new File("Border");

        Directory comedyMovies = new Directory("Comedy Movies");
        File movie2 = new File("Hulchul");

        comedyMovies.add(movie2);
        movieDirectory.add(movie1);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls();

    }
}