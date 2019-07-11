package server.serverUI;

import javax.swing.*;

/**
 * 这个类用来实现服务器端的界面
 * 功能是设置启动的服务器IP地址和端口号，显示登录的用户名称以及群聊或者私聊的信息
 * 可以移除当前群聊中的人
 */
public class ServerUI {
    /*
    此处定义服务器端的窗体按钮等
     */
    private JFrame frame;//整个窗体
    private JTextField textServerIP;//IP地址的设置框
    private JTextField textServerPort;//端口号的设置框
    private JTextField textMessage;//消息的显示区域
    private JTextField textNotice;//服务器发送的公告显示框
    private JTextField textOnlineUser;//显示在线用户的框
    private JButton btnStart;//启动房间按钮
    private JButton btnClose;//关闭房间按钮
    private JButton btnRemove;//移除房间按钮
    private JButton btnSendNotive;//发送公告按钮

    public void server(){

        //定义窗体
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("MeChat聊天室服务器端");//设置名称
        frame.setBounds(100, 100, 781, 579);//四个参数，既定义组件的位置，也定义了控件的大小；
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可以使用窗体关闭
        frame.getContentPane().setLayout(null);//返回此框架的 contentPane对象。//将容器的布局设为绝对布局

        //设置IP地址
        //IP地址名称和输入服务器IP的文本框
        JLabel lblNewLabel = new JLabel("服务器IP地址:");
        lblNewLabel.setBounds(49, 33, 91, 18);
        frame.getContentPane().add(lblNewLabel);

        textServerIP = new JTextField();
        textServerIP.setText("127.0.0.1");
        textServerIP.setBounds(149, 30, 111, 21);
        frame.getContentPane().add(textServerIP);
        textServerIP.setColumns(10);

        //端口号名称和输入框
        JLabel lblNewLabel_1 = new JLabel("端口号:");
        lblNewLabel_1.setBounds(306, 33, 91, 18);
        frame.getContentPane().add(lblNewLabel_1);

        textServerPort = new JTextField();
        textServerPort.setText("9300");
        textServerPort.setBounds(367, 30, 111, 21);
        frame.getContentPane().add(textServerPort);
        textServerPort.setColumns(10);

        //显示聊天消息名称和信息显示框
        JLabel lblNewLabel_3 = new JLabel("消息记录:");
        lblNewLabel_3.setBounds(40, 75, 69, 18);
        frame.getContentPane().add(lblNewLabel_3);

        textMessage = new JTextField();
        textMessage.setText("等待链接");
        textMessage.setBounds(39, 96, 470, 329);
        frame.getContentPane().add(textMessage);
        textMessage.setColumns(10);

        //发布公告消息以及文本框
        JLabel lblNewLabel_4 = new JLabel("公告：");
        lblNewLabel_4.setBounds(40,440,67,18);
        frame.getContentPane().add(lblNewLabel_4);

        textNotice = new JTextField();
        textNotice.setText("等待链接");
        textNotice.setBounds(39,461,472,64);
        frame.getContentPane().add(textNotice);
        textNotice.setColumns(10);

        //在线用户以及文本框
        JLabel lblNewLabel_5 = new JLabel("当前在线用户:");
        lblNewLabel_5.setBounds(563,75,100,18);
        frame.getContentPane().add(lblNewLabel_5);

        textOnlineUser = new JTextField();
        textOnlineUser.setText("等待链接");
        textOnlineUser.setBounds(560,96,178,417);
        frame.getContentPane().add(textOnlineUser);
        textOnlineUser.setColumns(10);


        //创建房间按钮
        btnStart = new JButton("开启");
        btnStart.setBounds(560, 30, 65, 26);
        frame.getContentPane().add(btnStart);

        //关闭房间按钮
        btnClose = new JButton("关闭");
        btnClose.setBounds(670, 30, 65, 26);
        frame.getContentPane().add(btnClose);

        //发送公告按钮
        btnSendNotive = new JButton("发送");
        btnSendNotive.setBounds(445,529,65,26);
        frame.getContentPane().add(btnSendNotive);

        //移除用户按钮
        btnRemove = new JButton("移除");
        btnRemove.setBounds(672,517,65,26);
        frame.getContentPane().add(btnRemove);











        frame.setVisible(true);//显示窗体

    }
}
