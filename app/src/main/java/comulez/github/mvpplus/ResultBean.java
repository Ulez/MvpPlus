package comulez.github.mvpplus;

/**
 * Created by Ulez on 2017/8/11.
 * Email：lcy1532110757@gmail.com
 */


public class ResultBean {
    private int code;

    private String result;

    private String from;

    public ResultBean(int code, String result, String from) {
        this.code = code;
        this.result = result;
        this.from = from;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "code=" + code +
                ", result='" + result + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
