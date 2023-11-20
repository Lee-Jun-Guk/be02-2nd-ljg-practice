package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        //*을 printf로 5번 반복해서 출력
        //   println() 으로 다음줄
        System.out.println("/*");
        System.out.println("----------");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("----------");
        System.out.println("*/");

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        // * 울 printf로 반복 횟수만큼 반복출력
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        System.out.println("/*");
        System.out.println("----------");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("----------");
        System.out.println("/*");
        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        //공백을 printf로 점점 줄어들게(4,3,2,1,0) 출력
        //*을 printf로 2씩 커지면서 반복 횟수만큼(2n+1,2n-1)
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */
        System.out.println("/*");
        System.out.println("----------");
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("**********");
        System.out.println("----------");
        System.out.println("/*");
    }
}
