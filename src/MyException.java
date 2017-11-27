

/**
 * Created by J on 2017/10/21.
 */
public class MyException extends Exception {

    String message;
    MyException(String s){
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

}


