package com.psq.SpringBootTrain.pojo;

/**
 * 功能描述:MongoDB数据库中的对象
 *
 * @Package: com.psq.SpringBootTrain.pojo
 * @ClassName: UserDO
 * @auther: pengshiquan
 * @CreateDate: 2018/11/22 2:38 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/22 2:38 PM
 */
public class UserDO {

    private static final long serialVersionUID = -3258839839160856613L;
    private Long id;
    private String userName;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
