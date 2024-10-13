package com.fhminyi.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Inception", 1, 19.99, 8.8, "Christopher Nolan", "Leonardo DiCaprio", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.");
        movies[1] = new Movie("The Shawshank Redemption", 2, 14.99, 9.3, "Frank Darabont", "Tim Robbins", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.");
        movies[2] = new Movie("The Godfather", 3, 19.99, 9.2, "Francis Ford Coppola", "Marlon Brando", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movies[3] = new Movie("The Dark Knight", 4, 17.99, 9.0, "Christopher Nolan", "Christian Bale", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.");
        movies[4] = new Movie("12 Angry Men", 5, 9.99, 8.9, "Sidney Lumet", "Henry Fonda", "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.");
        movies[5] = new Movie("Schindler's List", 6, 14.99, 8.9, "Steven Spielberg", "Liam Neeson", "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.");
        movies[6] = new Movie("Pulp Fiction", 7, 15.99, 8.9, "Quentin Tarantino", "John Travolta", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.");
        movies[7] = new Movie("The Lord of the Rings: The Return of the King", 8, 19.99, 8.9, "Peter Jackson", "Elijah Wood", "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.");
        movies[8] = new Movie("The Matrix", 9, 17.99, 8.7, "Lana Wachowski, Lilly Wachowski", "Keanu Reeves", "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.");
        movies[9] = new Movie("Goodfellas", 10, 12.99, 8.7, "Martin Scorsese", "Robert De Niro", "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.");
        MovieOperator mop = new MovieOperator(movies);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===电影信息查询系统===");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询某个电影的详细信息");
            System.out.println("请输入操作命令:");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    mop.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入您要查询的电影id：");
                    int id = sc.nextInt();
                    mop.searchMovie(id);
                    break;
                case 3:

                default:
                    System.out.println("您输入的命令有误");
                    break;
            }
        }

    }
}
