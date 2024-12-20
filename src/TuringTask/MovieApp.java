package TuringTask;

import java.util.Scanner;

public class MovieApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie[] movies = new Movie[0];
        int movieCount = 0;
            System.out.println("""
                    Press 1 input movies.
                    Press 2 to display movies and ratings.
                    Press 3 to input more movies.
                    Press 4 to find statistic.
                    Press 5 to search for a movies.
                    Press 6 to update movie.
                    Press 7 to delete a movie.
                    Press 8 to sort movie.
                    Press 0 to exit.
                    """);
        while (true) {

            System.out.println("Chose");
            int menuChose = sc.nextInt();
            sc.nextLine();


            switch (menuChose) {
                case 1:
                    System.out.println("Zehmet olmasa 3 film adi daxil edin");
                    for (int i = 0; i < 3; i++) {
                        System.out.print( (i + 1) + "-ci filmin adin daxil edin:");
                        String name = sc.nextLine();


                        System.out.print((i+1)+" -ci filmin reytingini  daxil edin: ");
                        double reyting = sc.nextDouble();
                        sc.nextLine();
                        if(movieCount>= movies.length){
                            Movie[] newMovie = new Movie[movies.length+3];

                            for (int j = 0; j < movies.length; j++) {
                                newMovie[j] = movies[j];

                            }
                            movies = newMovie;
                        }


                        movies[movieCount] = new Movie(name, reyting);
                        movieCount++;
//                        movies.length
                    }
                    System.out.println("3 Yeni filim adi daxil edildi");
                    break;

                case 2:
                   if(movieCount == 0){
                       System.out.println("Filim daxil edilmeyib");
                   }else {
                       for (int i = 0; i < movieCount; i++) {
                           System.out.println((i+1)+". "+movies[i].getName()+" (Reating "+movies[i].getRating()+" )");

                       }
                   }break;
                case 3:
                    System.out.println("""
                            Siz ne qeder film elave temek isteyirsiniz?
                            """);
                    int wantCount = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < wantCount; i++) {
                        System.out.print((i+1)+"-ci filmi daxil edin: ");
                        String name = sc.nextLine();

                        System.out.print((i+1)+"-ci filmin Reatingini daxil edin: ");
                        double reating = sc.nextDouble();
                        sc.nextLine();
                        if(movieCount>=movies.length){
                            Movie[] newMovie = new Movie[movies.length+wantCount];
                            for (int j = 0; j < movies.length; j++) {
                                newMovie[j] = movies[j];
                            }
                            movies = newMovie;
                        }
                        movies[movieCount] = new Movie(name,reating);
                        movieCount++;
                    }break;
                case 4:
                    //Maksimum reating
                    double maxReating = movies[0].getRating();
                    int maxMovieIndex = 0;
                    for (int i = 1; i < movieCount; i++) {
                           if(maxReating<movies[i].getRating()){
                               maxReating = movies[i].getRating();
                               maxMovieIndex = i;

                           }
                    }

                    System.out.println("Maxsimum reating: "+movies[maxMovieIndex].toString());




                    //Average reating
                    if(movieCount == 0){
                        System.out.println("no movies found");
                        break;
                    }else {
                        double reatingTotal = 0;
                        for (int i = 0; i < movieCount; i++) {
                            reatingTotal += movies[i].getRating();
                        }

                        double averageReating = reatingTotal / movies.length;

                        System.out.println("Average reating movie: " + averageReating);
                    }




                        //Minimum Reating
                        double minnimumReating = movies[0].getRating();
                        int minMovieIndex = 0;
                        for (int i = 0; i < movieCount; i++) {
                            if(movies[i].getRating()<minnimumReating){
                                minnimumReating = movies[i].getRating();
                                minMovieIndex = i;

                            }
                        }


            System.out.println("The lovest-rated movie: "+movies[minMovieIndex].toString());


            break;

                case 5:
                    System.out.println("Type the name of the movie you are looking for");
                    String searchMovie = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < movieCount; i++) {
                        if(movies[i].getName().equals(searchMovie)){
                            System.out.println(movies[i].getName()+" (Reating"+movies[i].getRating()+" )");
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Not found");
                    }break;

                case 6:
                    System.out.println("Enter the movie name to search: ");
                    searchMovie = sc.nextLine();
                    if(movieCount == 0){
                        System.out.println("No movies found");
                        break;
                    }else {
                        found = false;
                        for (int i = 0; i < movies.length; i++) {
                            if(movies[i] != null && movies[i].getName().equals(searchMovie)){
                                System.out.println("Movie: "+movies[i].getName()+" Reating ( "+movies[i].getRating()+" )");
                                found = true;
                                System.out.println("Enter new reating: ");
                                double newReating = sc.nextDouble();
                                movies[i].setRating(newReating);
                                System.out.println("Reating update seccessfully");
                                break;
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Not Found");
                    }break;

                case 7:
                    System.out.println("Enter the name of the movie you want to delete: ");
                    String deleteMovie = sc.nextLine();


                        found = false;
                        Movie [] newMovie = new Movie[movies.length - 1];
                         int k = 0;

                        for (int i = 0; i < movies.length; i++) {

                            if (movies[i] != null && movies[i].getName().equals(deleteMovie)) {
                                found = true;
                                continue;
                            }

                            if (k < newMovie.length && movies[i] != null) {
                                newMovie[k++] = movies[i];
                            }
                        }

                                if(found){
                                    movies = newMovie;
                                    movieCount--;
                                    System.out.println("Movie removed successfully");
                                }else {
                                    System.out.println("Movie not found");
                                }

                    if(!found){
                        System.out.println("Not Fonund");
                    }break;

                case 8:
                    if(movieCount == 0){
                        System.out.println("No movies avaible to short");
                    }else {
                        shortMoviesReating(movies,movieCount);
                        System.out.println("Movies shorted by reating: ");
                        for (int i = 0; i < movies.length; i++) {
                            System.out.println(movies[i]);
                        }
                    }break;



                case 0:
                    System.out.println("Programdan cixilir. Tesekkur edirik");
                    return;

                default:
                    System.out.println("Yanlis secim etdiniz: Zehmet olmasa duzgun secim edin");
            }
        }


    }

    public static void shortMoviesReating(Movie[] movies, int count){
        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if(movies[j].getRating() > movies[j+1].getRating()){
                    Movie temp = movies[j];
                    movies[j] = movies[i+1];
                    movies[j+1] = temp;
                }

            }

        }
    }

}
