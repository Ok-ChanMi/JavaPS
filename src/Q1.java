//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*문제 1 :
모든 알고리즘을 해독할 수 있는 알고리즘 7 원석을 보유한 알고리즘 제왕 파이와 썬은 죽기전, 이 보물에
'암호'를 걸어 세계 어딘가에 묻어놨다고 공표하였다. 그가 남긴 문자는 아래와 같다.
        섬으로 향하라!
        " + -- + - + - "
        " + --- + - + "
        " + -- + - + - "
        " + - + - + - + "
        해(1)와 달(0),
        Code의 세상 안으로!(En-Coding)*/
public class Q1 {
    public static void main(String[] arg){
        String[] TEXT = {
                " + -- + - + - ",
                " + --- + - + ",
                " + -- + - + - ",
                " + - + - + - + "
        };
        solution(TEXT);
    }
    public static void solution(String[] TEXT){
        StringBuilder sb = new StringBuilder();

        for (String s : TEXT) {
            int x = Integer.parseInt(s.strip()
                    .replace(" ", "")
                    .replace("+", "1")
                    .replace("-", "0"), 2);
            char ch = (char) x;
            sb.append(ch);
            //TEXT[i] = String.valueOf((char) x);
            //System.out.println(TEXT[i]);

        }
        System.out.println(sb.toString());
    }
}

/*
- strip : trim과 비슷하지만 유니코드 공백까지 잘 처리
- Integer.parseInt(..., 2) : 두 번째 인자 2 -> 2진수라는 뜻 첫번째 줄 1001010 -> 10진수 74
- (char) x : 정수를 UTF-16코드 유닛(문자로)로 캐스팅
*/
