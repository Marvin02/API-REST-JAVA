package demo.api.rest.vo;

import java.io.Serializable;

/**
 * Rest API请求参数
 * @author Lynn Li
 * @param <T> Data 类型
 */
public class RestRequestParam<T> {

    /**公有参数*/
    private Common common;
    /**私有业务参数*/
    private T data;


    public Common getCommon() {
        return common;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Common newCommon(String accesskey, long timestamp){
        this.common = new Common(accesskey,timestamp);
        return this.common;
    }

    public static class Common {
        /**通行证*/
        private String accesskey;
        /**当前原子时毫秒*/
        private long timestamp;
        /**参数签名*/

        private Common(String accesskey,long timestamp){
            this.accesskey = accesskey;
            this.timestamp = timestamp;
        }

        public String getAccesskey() {
            return accesskey;
        }

        public long getTimestamp() {
            return timestamp;
        }
    }
}
