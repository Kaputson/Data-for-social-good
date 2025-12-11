import java.util.Scanner;

public class UserStory {

    private String[] titles;
    private String[] genres;
    private String[] directors;
    private double[] movieRatings;

  //goes through the data lists
    public UserStory() {
        this.titles = FileReader.toStringArray("Title.txt");
        this.genres = FileReader.toStringArray("Genre.txt");
        this.directors = FileReader.toStringArray("Director.txt");
        this.movieRatings = FileReader.toDoubleArray("MovieRating.txt");
    }

    /* 
    Goes through Title.txt and finds movies with that word in it's title
    */
    public void findMovieByTitle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a movie title: ");
        String titleSearch = input.nextLine().toLowerCase();

        boolean found = false;

        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(titleSearch)) {
                System.out.println("Found:");
                System.out.println("Title: " + titles[i]);                
                System.out.println("Genre: " + genres[i]); 
                System.out.println("Director: " + directors[i]);                
                System.out.println("Rating: " + movieRatings[i]);                
                System.out.println();                
                found = true;
            }
        }
      /*
      prints it when there's no movies with that name
      */
        if (!found) {
            System.out.println("No movies found with that title.\n");
        }
    }

    /* 
    Searches Genre.txt for the genre inputted
    */
    public void findMovieByGenre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genre: ");
        String genreSearch = input.nextLine().toLowerCase();

        boolean found = false;

        for (int i = 0; i < genres.length; i++) {
            if (genres[i].toLowerCase().contains(genreSearch)) {
                System.out.println("Found:");
                System.out.println("Title: " + titles[i]);                
                System.out.println("Genre: " + genres[i]); 
                System.out.println("Director: " + directors[i]);                
                System.out.println("Rating: " + movieRatings[i]);                
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No movies found in that genre.\n");
        }
    }

    /* 
    Searches Director.txt for the Director inputted
    */
    public void findMovieByDirector() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a director's name: ");
        String directorSearch = input.nextLine().toLowerCase();

        boolean found = false;

        for (int i = 0; i < directors.length; i++) {
            if (directors[i].toLowerCase().contains(directorSearch)) {
                System.out.println("Found:");
                System.out.println("Title: " + titles[i]);                
                System.out.println("Genre: " + genres[i]); 
                System.out.println("Director: " + directors[i]);                
                System.out.println("Rating: " + movieRatings[i]);                
                System.out.println();                
                found = true;
            }
        }

        if (!found) {
            System.out.println("No movies found by that director.\n");
        }
    }

    /*
    asks the user if they want to continue searching
    */
    public boolean promptToContinue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Search again? (y/n): ");
        String answer = input.nextLine();
        return answer.equalsIgnoreCase("y");
    }

    
  /*
  Scanner that sends you through the other methods based on what you pick, Ex: findMovieyDirector
  */
public void searchMenu() {
    Scanner input = new Scanner(System.in);
    boolean searching = true;

    while (searching) {
        System.out.println("How do you want to search?");
        System.out.println("1. By Title");
        System.out.println("2. By Genre");
        System.out.println("3. By Director");
        System.out.print("> ");

        String choice = input.nextLine().trim(); // read input as string

        System.out.println();

        if (choice.equals("1")) {
            findMovieByTitle();
        } else if (choice.equals("2")) {
            findMovieByGenre();
        } else if (choice.equals("3")) {
            findMovieByDirector();
        } else {
            System.out.println("Invalid option. Try again.\n");
            continue;
        }

        searching = promptToContinue();
    }
   // Program ends
    System.out.println("Goodbye!");
    input.close();
}
}