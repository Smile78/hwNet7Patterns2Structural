package patterns.structural.homeWork.hw4FacadeBin;



public class BinOps {

    public String sum(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1 + b1;
//        System.out.println(a1 +"+"+ b1+"="+sum);
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2)
                        *
                        Integer.parseInt(b, 2));
    }

}

