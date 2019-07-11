package client.clientUI;

import javax.swing.*;

/**
 * 这是客户端的界面描写的类
 * 功能是在用户注册登录后显示聊天界面完成用户的聊天功能
 */
public class ClientUI {
    //定义私有变量

    private JFrame frame;//整个窗体
    private JTextField textServerIP;//IP地址的输入框
    private JTextField textServerPort;//端口号的输入框
    private JTextField textUserID;//用户名的显示框
    private JTextField textMessage;//消息的显示区域
    private JTextField textNotice;//服务器发来的公告显示框
    private JTextField textOnlineUser;//显示在线用户的框
    private final ButtonGroup buttonGroup= new ButtonGroup();//设置按钮二选一组
    private JRadioButton rdbtnBrocast;//单选群聊按钮
    private JRadioButton rdbtnPrivateChat;//单选私聊按钮
    private JButton btnConnect;//连接加入房间按钮
    private JButton btnExit;//退出房间按钮
    private JComboBox jComboBox_1;//定义下拉框
    private JTextField textSendMessage;//发送消息编辑区
    private JButton btnSendMessage;//退出房间按钮

    /*
     实现界面
     */
    public void client(){
        frame = new JFrame();
        frame.setResizable(false);//resizeable值为true时，表示生成的窗体可以自由改变大小；
        //resizeable值为false时，表示生成的窗体大小是由程序员决定的，用户不可以自由改变该窗体的大小。
        frame.setTitle("MeChat聊天室客户端");//设置名称
        frame.setBounds(100, 100, 776, 592);//四个参数，既定义组件的位置，也定义了控件的大小；
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可以使用窗体关闭
        frame.getContentPane().setLayout(null);//返回此框架的 contentPane对象。//将容器的布局设为绝对布局

        //IP地址名称和输入服务器IP的文本框
        JLabel lblNewLabel = new JLabel("服务器IP地址:");
        lblNewLabel.setBounds(22, 20, 121, 18);
        frame.getContentPane().add(lblNewLabel);

        textServerIP = new JTextField();
        textServerIP.setText("127.0.0.1");
        textServerIP.setBounds(120, 18, 100, 26);
        frame.getContentPane().add(textServerIP);
        textServerIP.setColumns(10);

        //端口号名称和输入框
        JLabel lblNewLabel_1 = new JLabel("端口号:");
        lblNewLabel_1.setBounds(256, 20, 58, 18);
        frame.getContentPane().add(lblNewLabel_1);

        textServerPort = new JTextField();
        textServerPort.setText("9300");
        textServerPort.setBounds(313, 18, 58, 26);
        frame.getContentPane().add(textServerPort);
        textServerPort.setColumns(10);

        //用户名称和输入框
        JLabel lblNewLabel_2 = new JLabel("用户名：");
        lblNewLabel_2.setBounds(390,20,58,18);
        frame.getContentPane().add(lblNewLabel_2);

        textUserID = new JTextField();
        textUserID.setText("默认");
        textUserID.setBounds(450,18,100,26);
        frame.getContentPane().add(textUserID);
        textUserID.setColumns(10);



        //连接加入房间按钮
        btnConnect = new JButton("连接");
        btnConnect.setBounds(608, 18, 65, 26);
        frame.getContentPane().add(btnConnect);

        //退出房间按钮
        btnExit = new JButton("退出");
        btnExit.setBounds(680, 18, 65, 26);
        frame.getContentPane().add(btnExit);

        //显示消息名称和信息显示框
        JLabel lblNewLabel_3 = new JLabel("消息记录:");
        lblNewLabel_3.setBounds(30, 50, 121, 18);
        frame.getContentPane().add(lblNewLabel_3);

        textMessage = new JTextField();
        textMessage.setText("等待链接");
        textMessage.setBounds(18, 70, 542, 290);
        frame.getContentPane().add(textMessage);
        textMessage.setColumns(10);

        //公告消息以及文本框
        JLabel lblNewLabel_4 = new JLabel("公告：");
        lblNewLabel_4.setBounds(588,50,65,26);
        frame.getContentPane().add(lblNewLabel_4);

        textNotice = new JTextField();
        textNotice.setText("等待链接");
        textNotice.setBounds(580,70,180,210);
        frame.getContentPane().add(textNotice);
        textNotice.setColumns(10);

        //在线用户以及文本框
        JLabel lblNewLabel_5 = new JLabel("在线用户:");
        lblNewLabel_5.setBounds(588,270,65,62);
        frame.getContentPane().add(lblNewLabel_5);

        textOnlineUser = new JTextField();
        textOnlineUser.setText("等待链接");
        textOnlineUser.setBounds(580,320,180,260);
        frame.getContentPane().add(textOnlineUser);
        textOnlineUser.setColumns(10);

        //选择群聊按钮
        rdbtnBrocast = new JRadioButton("群聊");
        buttonGroup.add(rdbtnBrocast);
        rdbtnBrocast.setBounds(36, 371, 72, 22);
        frame.getContentPane().add(rdbtnBrocast);


        //选择私聊按钮
        rdbtnPrivateChat = new JRadioButton("私聊");
        rdbtnPrivateChat.setSelected(true);
        buttonGroup.add(rdbtnPrivateChat);
        rdbtnPrivateChat.setBounds(116, 371, 72, 22);
        frame.getContentPane().add(rdbtnPrivateChat);

        //发送表情包
        String []dd= {"选择表情","开心","沮丧","苦笑","愤怒","面无表情"};	//创建经典
        jComboBox_1=new JComboBox(dd);		//把城市添加到下拉框中
        jComboBox_1.setBounds(221,371,93,23);
        frame.getContentPane().add(jComboBox_1);


        //发送文件按钮
        JButton btnNewButton_1 = new JButton("发送文件");
        btnNewButton_1.setBounds(439, 371, 93, 23);
        frame.getContentPane().add(btnNewButton_1);

        //发送图片按钮
        JButton btnNewButton_2 = new JButton("发送图片");
        btnNewButton_2.setBounds(334, 371, 93, 23);
        frame.getContentPane().add(btnNewButton_2);

        //发送消息文本框
        JLabel lblNewLabel_6 = new JLabel("消息:");
        lblNewLabel_6.setBounds(30, 400, 121, 18);
        frame.getContentPane().add(lblNewLabel_6);

        textSendMessage = new JTextField();
        textSendMessage.setText("等待链接");
        textSendMessage.setBounds(18, 420, 542, 130);
        frame.getContentPane().add(textSendMessage);
        textSendMessage.setColumns(10);

        //发送消息按钮
        //发送图片按钮
        JButton btnNewButton_3 = new JButton("发送");
        btnNewButton_3.setBounds(467, 555, 93, 23);
        frame.getContentPane().add(btnNewButton_3);















        frame.setVisible(true);//显示窗体
    }
}
