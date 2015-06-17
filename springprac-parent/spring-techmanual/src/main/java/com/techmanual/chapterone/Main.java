package com.techmanual.chapterone;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/17<p>
//-------------------------------------------------------

public class Main {
    public static void main(String args[]){
      try{
          //当想更换为新的Device实现类时，只需要修改config文件即可，内部代码不用动
          Business business = BusinessFactory.getInstance().getBusiness();
      }  catch(Exception e){
          System.out.println("exception:"+e);
      }
    }
}
