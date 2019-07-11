package client.clientUI;

import javax.swing.*;

/**
 * 这个类用于用户登录时的校验，如果没有注册用户还可以选择注册新用户
 */

public class LoginUI {
    /*
    一下是私有类型对象
     */
    private JFrame frame;//定义窗体
    private JTextField userID;//帐号
    private JPasswordField userPass;//密码
    private JButton btnLogin;//登录按钮
    private JButton btnRegiste;//注册按钮

    public void login(){

        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("MeChat聊天室用户登录");//设置名称
        frame.setBounds(200, 100, 503, 298);//四个参数，既定义组件的位置，也定义了控件的大小；
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可以使用窗体关闭
        frame.getContentPane().setLayout(null);//返回此框架的 contentPane对象。//将容器的布局设为绝对布局


        //帐号输入框
        JLabel jLabelID = new JLabel("帐号:");
        jLabelID.setBounds(135,82,91,18);
        frame.getContentPane().add(jLabelID);

        userID = new JTextField();
        userID.setText("127.0.0.1");
        userID.setBounds(170, 80, 180, 28);
        frame.getContentPane().add(userID);
        userID.setColumns(10);

        //密码输入框
        JLabel jLabelPass = new JLabel("密码:");
        jLabelPass.setBounds(135,147,91,18);
        frame.getContentPane().add(jLabelPass);

        userPass = new JPasswordField();
        userPass.setBounds(170,145,180,28);
        frame.getContentPane().add(userPass);

        //登录按钮
        btnLogin = new JButton("登录");
        btnLogin.setBounds(207,202,88,26);
        frame.getContentPane().add(btnLogin);

        //注册按钮
        //登录按钮
        btnRegiste = new JButton("注册");
        btnRegiste.setBounds(414,34,68,20);
        frame.getContentPane().add(btnRegiste);


        frame.setVisible(true);
    }
}
