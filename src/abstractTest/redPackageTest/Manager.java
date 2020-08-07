package abstractTest.redPackageTest;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> list = new ArrayList<>();
        //判断余额和要发的钱是否匹配
        if(totalMoney>super.getBalance()){
            System.out.println("余额不足");
        }
        //发红包后余额存储群主的余额内
        super.setBalance(super.getBalance()-totalMoney);
        //平均分余额
        int avg = totalMoney/count;
        int mod = totalMoney%count;

        for(int i=0;i<count;i++){
            if(i==count-1){
                list.add(avg+mod);
            }else {
                list.add(avg);
            }

        }
        return list;
    }
}
