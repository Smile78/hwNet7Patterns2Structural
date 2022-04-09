package patterns.structural.homeWork.hw4FacadeBin;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        //какой то обычный статик класс получился
        System.out.println(bins.sum("01011101","01101101"));
        System.out.println(bins.mult("01011101","01101101"));
    }
}