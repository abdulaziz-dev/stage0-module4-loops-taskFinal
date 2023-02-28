package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int z = 1;
        for(int i=1; i<=cathetusLength; i++){
            for(int j=cathetusLength-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int k = z; k>=1; k--){
                System.out.print(Math.abs(k-i)+1);
            }
            z += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
