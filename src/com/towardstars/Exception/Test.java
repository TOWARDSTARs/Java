package com.towardstars.Exception;

public class Test {
    public static void main(String[] args) {

        int a=1;
        int b=0;

        try {//try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){//捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally {//处理善后工作，可以去掉（用于IO、资源的关闭）
            System.out.println("finally");
        }

        System.out.println("================");

        try {//try监控区域
            new Test().a();
        }catch (Error w){
            System.out.println("栈溢出");
        }
        catch (Throwable e){//捕获异常
            System.out.println("程序出现异常");
        }finally {//处理善后工作，可以去掉（用于IO、资源的关闭）
            System.out.println("finally");
        }




    }
    public void a(){b();}
    public void b(){a();}

}
//catch(想要捕获的异常类型 throwable error exception...)