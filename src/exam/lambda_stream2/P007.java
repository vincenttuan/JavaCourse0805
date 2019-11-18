package exam.lambda_stream2;

/*
Given the code fragment:
public class Video {
    public void play() throws IOException {
        System.out.println("Video played.");
    }
}

public class Game extends Video {
    public void play() throws Exception {
        super.play();
        System.out.println("Game played.");
    }
}

and
try {
    new Game().play();
} catch (Exception e) {
    System.out.println(e.getClass());
}

What is the result?
A. class java.lang.Exception
B. A compilation error occurs
C. Video played. Game played.
D. class java.io.IOexception

Ans: B
*/
