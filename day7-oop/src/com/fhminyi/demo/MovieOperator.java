package com.fhminyi.demo;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    // 1.展示系统全部电影信息
    public void printAllMovies() {
        System.out.println("————————系统全部电影信息如下————————");
        for (Movie movie : movies) {
            System.out.println("编号：" + movie.getId());
            System.out.println("名称：" + movie.getName());
            System.out.println("价格" + movie.getPrice());
            System.out.println("得分：" + movie.getScore());
            System.out.println("————————————————————————");
        }
    }
    // 2.根据电影的编号查询出电影的详细信息并展示
    public void searchMovie(int ID) {
        for (Movie movie : movies) {
            if (movie.getId() == ID) {
                System.out.println("该电影的详情如下：");
                System.out.println("编号：" + movie.getId());
                System.out.println("名称：" + movie.getName());
                System.out.println("价格" + movie.getPrice());
                System.out.println("得分：" + movie.getScore());
                System.out.println("导演：" + movie.getDirector());
                System.out.println("主演：" + movie.getActor());
                System.out.println("其他信息：" + movie.getInfo());
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
