package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복
        Integer num = (int)(Math.random()*3);

        class Player{
            String name;
        }
        Player player1;
        player1 = new Player();
        player1.name = "이준국";
        Player player2;
        player2 = new Player();
        player2.name = "길민석";



    }
}
