package cn.cityworks.message;


/*回复消息封装*/
public class BaseReturnVO {

    protected int resCode;
    protected String resDes;
    protected Object data;

    public int getResCode() {
        return this.resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResDes() {
        return this.resDes;
    }

    public void setResDes(String resDes) {
        this.resDes = resDes;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BaseReturnVO() {
    }

    public BaseReturnVO(int code, String msg) {
        this.resCode = code;
        this.resDes = msg;
        this.data = "";
    }

    public BaseReturnVO(int code, Exception e) {
        this.resCode = code;
        this.resDes = e.getMessage();
        this.data = "";
    }

    public BaseReturnVO(int code, String msg, Exception e) {
        this.resCode = code;
        this.resDes = msg;
        this.data = "";
    }


    public BaseReturnVO(Object data) {
        this.resCode = ApiMsgEnum.OK.getResCode();
        this.resDes = ApiMsgEnum.OK.getResDes();
        this.data = data;
    }

    public BaseReturnVO(Exception exp) {
        this.resCode = ApiMsgEnum.INTERNAL_SERVER_ERROR.getResCode();
        this.resDes = ApiMsgEnum.INTERNAL_SERVER_ERROR.getResDes();
        this.data = "";
    }

    public BaseReturnVO(ApiMsgEnum msgEnum) {
        this.resCode = msgEnum.getResCode();
        this.resDes = msgEnum.getResDes();
        this.data = "";
    }

    @Override
    public String toString() {
        return "{" +
                "resCode:" + resCode +
                ", resDes:'" + resDes + '\'' +
                ", data:" + data +
                '}';
    }
}
