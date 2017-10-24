package hotboom.yutian.com.myapplication.bean;

/**
 * Created by zx on 2017/10/24 0024.
 */

public class UserContact {

    long id;

    private String userName;

    private String phoneNum;

    private String firstName;

    private String sortKey;

    private String pinyin;

    public UserContact(String userName, String phoneNum, String firstName, String sortKey, String pinyin) {
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.firstName = firstName;
        this.sortKey = sortKey;
        this.pinyin = pinyin;
    }

    public UserContact(long id,String userName, String phoneNum, String firstName) {
        this.id=id;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
